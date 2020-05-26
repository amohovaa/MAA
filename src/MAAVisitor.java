// Generated from C:/Users/HP/IdeaProjects/MAA - coursework/src\MAA.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MAAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MAAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MAAParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MAAParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MAAParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(MAAParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(MAAParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MAAParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(MAAParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MAAParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(MAAParser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(MAAParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#writestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritestmt(MAAParser.WritestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#expressionunion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionunion(MAAParser.ExpressionunionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#bangstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBangstmt(MAAParser.BangstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#beginstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginstmt(MAAParser.BeginstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(MAAParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(MAAParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#breakstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakstmt(MAAParser.BreakstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#continuestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuestmt(MAAParser.ContinuestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MAAParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultExpr}
	 * labeled alternative in {@link MAAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(MAAParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SummExpr}
	 * labeled alternative in {@link MAAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummExpr(MAAParser.SummExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorExpr}
	 * labeled alternative in {@link MAAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpr(MAAParser.FactorExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MAAParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MAAParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(MAAParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(MAAParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(MAAParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(MAAParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MAAParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MAAParser.NumberContext ctx);
}