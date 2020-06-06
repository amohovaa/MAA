import java.util.HashMap;
import java.util.Stack;
import java.lang.Override;


public class MyVisitor extends MAABaseVisitor<Object> {
    String procedure = "";
    boolean global = false;
    Stack<HashMap<String, Object>> currentStack;
    HashMap<String, Object> currentTable;
    HashMap<String, MAAParser.BlockContext> BlockTable = new HashMap<>();

    private Object getVariable(String ident) throws Exception {
        if (currentTable.containsKey(ident)) {
            return currentTable.get(ident);}
        for (HashMap<String, Object> hm : currentStack) {
            if (hm.containsKey(ident)) {
                return hm.get(ident);
            }
        }

        throw new Exception("No such variable in the table");
    }

    @Override
    public Object visitBreakstmt(MAAParser.BreakstmtContext ctx) {
        System.out.println("BREAK");
        GLLVM.Break();
        return null;
    }

    @Override
    public Object visitContinuestmt(MAAParser.ContinuestmtContext ctx) {
        GLLVM.Continue();
        return null;
    }

    @Override
    public Object visitVars (MAAParser.VarsContext ctx){
        String varName = ctx.ident().getText();
        String type = ctx.type().getText();
        Object value = visit(ctx.expression());
        currentTable.put(varName, value);

        if (type.equals("int")) {
            if (value == null)
                value=0;
            GLLVM.declare_i32(varName, global, value);
        }else {
            if (type.equals("float"))
            {
                if(value == null)
                    value=0;
                GLLVM.declare_double(varName, global, value);
            }

        }
        return null;
    }

    private static boolean isExpr(String s) {
        if (s.matches(".*[a-zA-Z].*")) {

            return true;
        } else {

            return false;
        }
    }

    @Override
    public String visitIfstmt(MAAParser.IfstmtContext ctx) {
        System.out.println("IF: ");
        Object conditionResult = visit(ctx.conditionunion());
        GLLVM.if_start();
        if (conditionResult.equals("true")) {
            for (int i = 0; i < ctx.statement().size(); i++)
                visit(ctx.statement(i));
        }
        GLLVM.if_end();
        return null;
    }

    @Override
    public String visitWhilestmt(MAAParser.WhilestmtContext ctx) {
        System.out.println("WHILE");
        GLLVM.while_start();

        Object conditionResult = visit(ctx.conditionunion());
        GLLVM.while_condition(GLLVM.reg-1);
        while (conditionResult.equals("true")) {
            for (int i = 0; i < ctx.statement().size(); i++)
                visit(ctx.statement(i));
            conditionResult = visit(ctx.conditionunion());
        }
        GLLVM.while_end();
        return null;
    }


    @Override
    public Object visitConditionunion(MAAParser.ConditionunionContext ctx) {

        for (int i = 0; i < ctx.condition().size(); i++) {
            Object result = visitChildren(ctx);
            if (result == null) {
                System.err.println("Condition NULL exception");
                System.exit(1);
            }
            if (result.equals("false")) return "false";
        }
        return "true";
    }

    @Override
    public String visitComparison(MAAParser.ComparisonContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));
        String sub = ".";
        boolean flag;

        if (left.toString().indexOf(sub) != -1 || right.toString().indexOf(sub) != -1) flag = true;
        else flag = false;

        switch (ctx.op.getText()) {
            case "=":
                if (flag == true) {
                    if (Float.parseFloat(left.toString()) == Float.parseFloat(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.eq2("FLOAT");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.eq1(ctx.expression(1).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.eq1(ctx.expression(0).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.eq0(ctx.expression(0).getText(), ctx.expression(1).getText(), "FLOAT");
                        }
                        return "true";
                    } else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) == Integer.parseInt(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.eq2("INTEGER");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.eq1(ctx.expression(1).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.eq1(ctx.expression(0).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.eq0(ctx.expression(0).getText(), ctx.expression(1).getText(), "INTEGER");
                        }
                        return "true";
                    } else return "false";
                }
            case "!=":
                if (flag == true) {
                    if (Float.parseFloat(left.toString()) != Float.parseFloat(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.noeq2("FLOAT");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.noeq1(ctx.expression(1).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.noeq1(ctx.expression(0).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.noeq0(ctx.expression(0).getText(), ctx.expression(1).getText(), "FLOAT");
                        }
                        return "true";
                    } else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) != Integer.parseInt(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.noeq2("INTEGER");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.noeq1(ctx.expression(1).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.noeq1(ctx.expression(0).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.noeq0(ctx.expression(0).getText(), ctx.expression(1).getText(), "INTEGER");
                        }
                        return "true";
                    } else return "false";
                }
            case "<":
                if (flag == true) {
                    if (Float.parseFloat(left.toString()) < Float.parseFloat(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.less2("FLOAT");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.less1_1(ctx.expression(1).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.less1_2(ctx.expression(0).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.less0(ctx.expression(0).getText(), ctx.expression(1).getText(), "FLOAT");
                        }
                        return "true";
                    } else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) < Integer.parseInt(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.less2("INTEGER");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.less1_1(ctx.expression(1).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.less1_2(ctx.expression(0).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.less0(ctx.expression(0).getText(), ctx.expression(1).getText(), "INTEGER");
                        }
                        return "true";
                    } else return "false";
                }
            case "<=":
                if (flag == true) {
                    if (Float.parseFloat(left.toString()) <= Float.parseFloat(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.lesseq2("FLOAT");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.lesseq1_1(ctx.expression(1).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.lesseq1_2(ctx.expression(0).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.lesseq0(ctx.expression(0).getText(), ctx.expression(1).getText(), "FLOAT");

                        }
                        return "true";
                    } else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) <= Integer.parseInt(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.lesseq2("INTEGER");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.lesseq1_1(ctx.expression(1).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.lesseq1_2(ctx.expression(0).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.lesseq0(ctx.expression(0).getText(), ctx.expression(1).getText(), "INTEGER");
                        }
                        return "true";
                    } else return "false";
                }
            case ">":
                if (flag == true) {
                    if (Float.parseFloat(left.toString()) > Float.parseFloat(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.more2("FLOAT");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.more1_1(ctx.expression(1).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.more1_2(ctx.expression(0).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.more0(ctx.expression(0).getText(), ctx.expression(1).getText(), "FLOAT");
                        }
                        return "true";
                    } else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) > Integer.parseInt(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.more2("INTEGER");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.more1_1(ctx.expression(1).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.more1_2(ctx.expression(0).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.more0(ctx.expression(0).getText(), ctx.expression(1).getText(), "INTEGER");
                        }
                        return "true";
                    } else return "false";
                }
            case ">=":
                if (flag == true) {
                    if (Float.parseFloat(left.toString()) >= Float.parseFloat(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.moreeq2("FLOAT");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(0).getText());
                            GLLVM.moreeq1_1(ctx.expression(1).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_double(ctx.expression(1).getText());
                            GLLVM.moreeq1_2(ctx.expression(0).getText(), "FLOAT");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.moreeq0(ctx.expression(0).getText(), ctx.expression(1).getText(), "FLOAT");
                        }
                        return "true";
                    } else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) >= Integer.parseInt(right.toString())) {
                        if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.moreeq2("INTEGER");
                        } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(0).getText());
                            GLLVM.moreeq1_1(ctx.expression(1).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                            GLLVM.load_i32(ctx.expression(1).getText());
                            GLLVM.moreeq1_2(ctx.expression(0).getText(), "INTEGER");
                        } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                            GLLVM.moreeq0(ctx.expression(0).getText(), ctx.expression(1).getText(), "INTEGER");
                        }
                        return "true";
                    } else return "false";
                }
        }
        return null;

    }

    /*@Override
    public Object visitProcedure(MAAParser.ProcedureContext ctx) {
        String ident = ctx.ident().getText();
        System.out.println("ident" + ident);
        currentTable.put(ident, ctx.block());
        visit(ctx.block());
        return null;
    }

    private void callProcedure(String ident) throws Exception{
        if (currentTable.containsKey(ident)) {
            visit(currentTable.get(ident));
        }
        else throw new Exception("Procedure" + ident + " is not identified");
    }

    @Override
    public Object visitCallstmt(MAAParser.CallstmtContext ctx) {
        try {
            callProcedure(ctx.ident().getText());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    @Override
    public String visitProgram (MAAParser.ProgramContext ctx)
    {
        visitChildren(ctx);
        GLLVM.generate();
        return null;
    }


    @Override
    public String visitBlock (MAAParser.BlockContext ctx){
        if (ctx.parent.getChildCount() == 2) global = true;
        else global = false;

        HashMap<String, Object> currentBlocktable = new HashMap<>();
        String id = ctx.statement().getText();
        currentTable = currentBlocktable;
        visitChildren(ctx);
        return null;
    }

    @Override
    public String visitStatement (MAAParser.StatementContext ctx){
        return (String)visitChildren(ctx);
    }

    @Override
    public String visitExpressionunion(MAAParser.ExpressionunionContext ctx) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ctx.expression().size(); i++) {
            result.append(visit(ctx.expression(i)));
            result.append(" ");
        }
        return result.toString();
    }

    @Override
    public Object visitIdent (MAAParser.IdentContext ctx) {
        try {
            System.out.println("GetVariable: " + ctx.getText() + " = " + getVariable(ctx.getText()));
            return getVariable(ctx.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String  visitAssignstmt(MAAParser.AssignstmtContext ctx) {
        try {
            String varName = ctx.ident().getText();
            Object value = visit(ctx.expression());
            Object left = visit(ctx.expression());
            Object right = visit(ctx.expression());
            String sub=".";

            if (ctx.children.contains(ctx.expression())) value = visit(ctx.expression());
            currentTable.put(varName, value);
            currentTable.put(varName, value);

            if (left.toString().contains(sub) || right.toString().contains(sub)) {
                if(value==null)
                    value=0;
                GLLVM.assign_double(varName, global, value);
            } else {
                if(value==null)
                    value=0;
                GLLVM.assign_i32(varName, global, value);
            }

        } catch (Exception e) {
            System.out.println("!!!Error!!!");
            System.out.println(e.fillInStackTrace());
        }
        return null;
    }


    @Override
    public String visitFactor (MAAParser.FactorContext ctx){ ;
        if (ctx.ident()!= null) return (String) visitChildren(ctx);
        return ctx.getText();
    }

    @Override
    public String visitWritestmt(MAAParser.WritestmtContext ctx) {
        String toPrint = (String) visit(ctx.expressionunion());
        System.out.println("WRITE: " + toPrint);
        Object left = visit(ctx.expressionunion());
        String sub = ".";
        boolean flag = false;
        boolean type;
        if (left.toString().contains(sub)) type = true;
        else type = false;
        if (left.toString().contains("'")) flag = true;

        if (flag == true) {
            GLLVM.printf_string(toPrint, toPrint.length(), global, procedure);
            GLLVM.print(toPrint);
        } else {
            if (type == true) {
                String name = ctx.expressionunion().getText();
                GLLVM.printf_double(name, global);
                GLLVM.print(" ");
            } else {
                String name = ctx.expressionunion().getText();
                GLLVM.printf_i32(name, global);
                GLLVM.print(" ");
            }
        }
        return null;
}

    @Override
    public String visitSummExpr(MAAParser.SummExprContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));
        String sub = ".";
        boolean flag;

        if (left.toString().indexOf(sub) != -1 || right.toString().indexOf(sub) != -1)  flag = true;
        else flag = false;
        switch (ctx.op.getText()) {
            case "+":
                if (flag == true) return String.valueOf(Float.parseFloat(left.toString())+Float.parseFloat(right.toString()));
                else return String.valueOf(Integer.parseInt(left.toString())+Integer.parseInt(right.toString()));
            case "-":
                if (flag == true) return String.valueOf(Float.parseFloat(left.toString())-Float.parseFloat(right.toString()));
                else return String.valueOf(Integer.parseInt(left.toString())-Integer.parseInt(right.toString()));
        }
        return null;
    }

    @Override
    public String visitMultExpr(MAAParser.MultExprContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));
        String sub = ".";
        boolean flag;

        if (left.toString().indexOf(sub) != -1 || right.toString().indexOf(sub)!=-1) flag = true;
        else flag = false;
        switch (ctx.op.getText()) {
            case "*":
                if(flag==true) return String.valueOf(Float.parseFloat(left.toString()) * Float.parseFloat(right.toString()));
                else return String.valueOf(Integer.parseInt(left.toString()) * Integer.parseInt(right.toString()));
            case "/":
                if (flag == true) return String.valueOf(Float.parseFloat(left.toString()) / Float.parseFloat(right.toString()));
                else return String.valueOf(Integer.parseInt(left.toString()) / Integer.parseInt(right.toString()));
        }
        return null;
    }
}