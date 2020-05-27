import java.util.HashMap;
import java.util.Stack;
import java.lang.Override;


public class MyVisitor extends MAABaseVisitor<Object> {
    HashMap<String, Object> consts = new HashMap<>();
    Stack<HashMap<String, Object>> functionTables = new Stack<>();
    Stack<HashMap<String, Object>> tables = new Stack<>();
    Stack<HashMap<String, Object>> currentStack;
    HashMap<String, Object> currentTable;
    HashMap<String, MAAParser.BlockContext> function = new HashMap<>();

    private Object getVariable(String ident) throws Exception {
        if (currentTable.containsKey(ident)) {
            return currentTable.get(ident);}
        for (HashMap<String, Object> hm : currentStack) {
            if (hm.containsKey(ident)) {
                return hm.get(ident);
            }
        }
        if (consts.containsKey(ident)) {
            return consts.get(ident);
        }

        throw new Exception("No such variable in the table");
    }

    @Override public String  visitConsts(MAAParser.ConstsContext ctx) {
        currentTable = consts;
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitVars (MAAParser.VarsContext ctx){
        String varName = ctx.ident().getText();
        String type = ctx.type().getText();
        Object value = visit(ctx.expression());
        if (ctx.children.contains(ctx.expression()))
            value = visit(ctx.expression());
        currentTable.put(varName, value);
        if (value != null)
            System.out.println("Vars: " + type + " " + varName + " " + value.toString());
        else
            System.out.println("VarDeclaration (no value): " + type + " " + varName + " as NULL");

        currentTable.put(varName, value);

        return null;
    }


    @Override
    public Object visitProcedure(MAAParser.ProcedureContext ctx) {
        String ident = ctx.ident().getText();
        function.put(ident, ctx.block());
        return null;
    }

    private void callProcedure(String ident) throws Exception{
        if (function.containsKey(ident)) {
            visit(function.get(ident));
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
    }

    @Override
    public String visitProgram (MAAParser.ProgramContext ctx)
    {
        visitChildren(ctx);
        return null;
    }

    @Override
    public String visitBlock (MAAParser.BlockContext ctx){
        HashMap<String, Object> currentBlocktable = new HashMap<>();
        currentTable = currentBlocktable;
        visitChildren(ctx);
        //tables.add(currentBlocktable);

        return null;
    }

    @Override
    public String visitStatement (MAAParser.StatementContext ctx){
        return (String) visitChildren(ctx);
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
            System.out.println("GetVariable:" + ctx.getText() + " is: " + getVariable(ctx.getText()));
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
            Object exp = visit(ctx.expression());

            currentTable.put(varName, exp);
            System.out.println("Assigment: " + varName + " = " + exp);
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
        //toPrint +=(String)visit(ctx.expressionunion());

        System.out.println("write( " + toPrint + ")");
        return null;
    }

    @Override
    public String visitSummExpr(MAAParser.SummExprContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right;
        String sub = ".";

        float summf = 0;
        float differf = 0;
        int summi = 0;
        int differi = 0;
        boolean flag = false;

        if (ctx.expression(1) != null) {
            right = visit(ctx.expression(1));
        } else {
            right = new String("0");
        }

        String sl = left.toString();
        String sr = right.toString();
        if (sl.indexOf(sub) != -1 || sr.indexOf(sub) != -1) {
            flag = true;
            float leftfloat = Float.parseFloat(left.toString());
            float rightfloat = Float.parseFloat(right.toString());
            summf = leftfloat + rightfloat;
            differf = leftfloat - rightfloat;
        } else {
            flag = false;
            int leftint = Integer.parseInt(left.toString());
            int rightint = Integer.parseInt(right.toString());
            summi = leftint + rightint;
            differi = leftint - rightint;
        }
        switch (ctx.op.getText()) {
            case "+":
                if (flag == true)
                    return String.valueOf(summf);
                else
                    return String.valueOf(summi);
            case "-": {
                if (flag == true)
                    return String.valueOf(differf);
                else
                    return String.valueOf(differi);
            }
        }
        return null;
    }

    @Override
    public String visitMultExpr(MAAParser.MultExprContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right;
        String sub = ".";

        float delf = 0;
        float multf = 0;
        int deli = 0;
        int multi = 0;
        boolean flag = false;

        if (ctx.expression(1) != null) {
            right = visit(ctx.expression(1));
        } else {
            right = new String("0");
        }

        String sl = left.toString();
        String sr = right.toString();
        if (sl.indexOf(sub) != -1 || sr.indexOf(sub)!=-1)
        {
            flag = true;
            float leftfloat = Float.parseFloat(left.toString());
            float  rightfloat = Float.parseFloat(right.toString());
            delf = leftfloat / rightfloat;
            multf = leftfloat * rightfloat;
        }
        else {

            flag = false;
            int leftint = Integer.parseInt(left.toString());
            int rightint = Integer.parseInt(right.toString());
            deli = leftint / rightint;
            multi = leftint * rightint;
        }
        switch (ctx.op.getText()) {
            case "*":
                if(flag==true)
                    return String.valueOf(multf);
                else
                    return String.valueOf(multi);
            case "/": {
                if (flag == true)
                    return String.valueOf(delf);
                else
                    return String.valueOf(deli);
            }
        }
        return null;
    }

    @Override
    public String visitLiteral (MAAParser.LiteralContext ctx){
        if (ctx.charLiteral()!= null) return ctx.charLiteral().STRING().getText();
        return ctx.getText();
    }

    @Override
    public Object visitFloatLiteral(MAAParser.FloatLiteralContext ctx){
        System.out.println("Float: " + ctx.getText());
        return Float.parseFloat(ctx.getText());
    }

    @Override
    public Object visitIntegerLiteral (MAAParser.IntegerLiteralContext ctx){
        System.out.println("Integer: " + ctx.getText());
        return Integer.parseInt(ctx.getText());
    }
}