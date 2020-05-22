import MAABaseVisitor;
import MAAParser;
import java.util.HashMap;
import java.util.Stack;
import java.lang.Override;


public class MyVisitor extends MAABaseVisitor<Object> {
    HashMap<String, Object> consts = new HashMap<>();
    Stack<HashMap<String, Object>> functionTables = new Stack<>();
    Stack<HashMap<String, Object>> tables = new Stack<>();
    Stack<HashMap<String, Object>> currentStack;
    HashMap<String, Object> currentTable;

    private Object getVariable(String ident) throws Exception {
        if (currentTable.containsKey(ident))
            return currentTable.get(ident);
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
    //@Override
    //public String visitIfstmt(MAAParser.IfstmtContext ctx) {
    //    System.out.println("begin if :");
    //    String conclusionResult = (String)visit(ctx.conditionunion());
    //    if (conclusionResult.equals("true")) {
    //        currentStack.push(currentTable);
    //        visit(ctx.block(0));
    //        currentTable = currentStack.pop();
    //    }
    //    return null;
    //}

    //public String visitConditionunion(kidParser.ConditionunionContext ctx) {
    //    for (int i = 0; i < ctx.condition().size(); i++) {
    //        String result = (String) visitChildren(ctx);
    //        if (result == null) {
    //            System.err.println("Conclusion NULL exception");
    //            //  System.exit(1);
    //        }
    //        if (result.equals("false")) return "false";
    //    }
    //    return "true";
    //}

//    @Override
//    public String  visitCondition(MAAParser.ConditionContext ctx) {
//        return null;
//    }

//    @Override
//    public String visitSummExpression(MAAParser.SummExpressionContext ctx) {
//        Object left = new Object(visit(ctx.getChild()));
//        String right = new String(visit(ctx);
//        switch (ctx.term().toString()) {
//            case "+":
//                return String.valueOf(left + right);
//
//            case "-": {
//                return String.valueOf(left - right);
//            }
//
//        }
//    }

    @Override public String  visitConsts(MAAParser.ConstsContext ctx) {
        currentTable = consts;
        visitChildren(ctx);
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

    //    @Override Object visitFunctions(MAAParser.FunctionsContext ctx)
//    {
//
//    }
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
    //@Override
    //public String visitExpressionunion(MAAParser.ExpressionunionContext ctx) {
    //StringBuilder result = new StringBuilder();
    //for (int i = 0; i < ctx.expression().size(); i ++) {
    //result.append(visit(ctx.expression(i)));
    //result.append(" ");
    // }
    //return result.toString();
    //}
    //@Override
////    public String visitWritestmt(MAAParser.WritestmtContext ctx) {
////       // ArrayList<Object> expList = (ArrayList<Object>) visit(ctx.expressionunion());
////       // String expList=ctx.getText();
////    String write =  visit(ctx.expressionunion());
////    System.out.println("write( " + write + ")");
////    return null;
////}
    @Override
    public String visitWritestmt(MAAParser.WritestmtContext ctx) {
        String toPrint = (String) visit(ctx.expressionunion());
        System.out.println("write( " + toPrint + ")");
        return null;
    }
    //        String toPrint = "";
//        for (Object e : expList){
//            toPrint += e.toString() + " ";
//        }
//        System.out.println("write( " + toPrint + ")");
//        return null;
//    }
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
            Object exp = (Object) visit(ctx.expression());

            currentTable.put(varName, exp);
            System.out.println("Assigment: " + varName + " " + exp);
        } catch (Exception e) {
            System.out.println("!!!Error!!!");
            System.out.println(e.fillInStackTrace());
        }
        return null;
    }


    @Override
    public String visitFactor (MAAParser.FactorContext ctx){
        if (ctx.ident()!= null) return ctx.ident().STRING().getText();
        return ctx.getText();
    }

    @Override
    public Object visitFLOAT (MAAParser.FLOAT ctx){
        System.out.println("Float: " + ctx.getText());
        return Float.parseFloat(ctx.getText());
    }

    @Override
    public Object visitINTEGER (MAAParser.INTEGER ctx){
        System.out.println("Integer: " + ctx.getText());
        return Integer.parseInt(ctx.getText());
    }


    //@Override
    //public Object visitIdent (MAAParser.IdentContext ctx){
    //    System.out.println("Char: " + ctx.getText());
    //    return new Character(ctx.STRING().getText().charAt(0));
    //}
}