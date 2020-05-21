// Generated from C:/Users/HP/IdeaProjects/MAA - coursework/src\MAA.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MAAParser}.
 */
public interface MAAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MAAParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MAAParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MAAParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MAAParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MAAParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(MAAParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(MAAParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(MAAParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(MAAParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(MAAParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(MAAParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MAAParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MAAParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(MAAParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(MAAParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(MAAParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(MAAParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#writestmt}.
	 * @param ctx the parse tree
	 */
	void enterWritestmt(MAAParser.WritestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#writestmt}.
	 * @param ctx the parse tree
	 */
	void exitWritestmt(MAAParser.WritestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#bangstmt}.
	 * @param ctx the parse tree
	 */
	void enterBangstmt(MAAParser.BangstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#bangstmt}.
	 * @param ctx the parse tree
	 */
	void exitBangstmt(MAAParser.BangstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#beginstmt}.
	 * @param ctx the parse tree
	 */
	void enterBeginstmt(MAAParser.BeginstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#beginstmt}.
	 * @param ctx the parse tree
	 */
	void exitBeginstmt(MAAParser.BeginstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(MAAParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(MAAParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(MAAParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(MAAParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#breakstmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakstmt(MAAParser.BreakstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#breakstmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakstmt(MAAParser.BreakstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#continuestmt}.
	 * @param ctx the parse tree
	 */
	void enterContinuestmt(MAAParser.ContinuestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#continuestmt}.
	 * @param ctx the parse tree
	 */
	void exitContinuestmt(MAAParser.ContinuestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MAAParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MAAParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MAAParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MAAParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MAAParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MAAParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MAAParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MAAParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(MAAParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(MAAParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MAAParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MAAParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MAAParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MAAParser.NumberContext ctx);
}