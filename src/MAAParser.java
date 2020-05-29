// Generated from C:/Users/HP/IdeaProjects/MAA - coursework/src\MAA.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MAAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		BREAK=25, CONTINUE=26, WRITE=27, WHILE=28, DO=29, IF=30, THEN=31, ODD=32, 
		BEGIN=33, END=34, CALL=35, CONST=36, VAR=37, PROCEDURE=38, STRING=39, 
		NUMBER=40, BlockComment=41, LineComment=42, WS=43;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_consts = 2, RULE_vars = 3, RULE_type = 4, 
		RULE_procedure = 5, RULE_statement = 6, RULE_assignstmt = 7, RULE_callstmt = 8, 
		RULE_writestmt = 9, RULE_expressionunion = 10, RULE_bangstmt = 11, RULE_beginstmt = 12, 
		RULE_ifstmt = 13, RULE_whilestmt = 14, RULE_breakstmt = 15, RULE_continuestmt = 16, 
		RULE_condition = 17, RULE_conditionunion = 18, RULE_expression = 19, RULE_factor = 20, 
		RULE_literal = 21, RULE_integerLiteral = 22, RULE_floatLiteral = 23, RULE_charLiteral = 24, 
		RULE_ident = 25, RULE_number = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "consts", "vars", "type", "procedure", "statement", 
			"assignstmt", "callstmt", "writestmt", "expressionunion", "bangstmt", 
			"beginstmt", "ifstmt", "whilestmt", "breakstmt", "continuestmt", "condition", 
			"conditionunion", "expression", "factor", "literal", "integerLiteral", 
			"floatLiteral", "charLiteral", "ident", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'const'", "'='", "'int'", "'float'", "'char'", "':='", 
			"'('", "')'", "','", "'!'", "'!='", "'<'", "'<='", "'>'", "'>='", "'and'", 
			"'or'", "'+'", "'-'", "'*'", "'/'", "'''", "'BREAK'", "'CONTINUE'", "'WRITE'", 
			"'WHILE'", "'DO'", "'IF'", "'THEN'", "'ODD'", "'BEGIN'", "'END'", "'CALL'", 
			"'CONST'", "'VAR'", "'PROCEDURE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BREAK", "CONTINUE", "WRITE", "WHILE", "DO", "IF", "THEN", "ODD", 
			"BEGIN", "END", "CALL", "CONST", "VAR", "PROCEDURE", "STRING", "NUMBER", 
			"BlockComment", "LineComment", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MAA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MAAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			block();
			setState(55);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(57);
				consts();
				}
			}

			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(60);
					vars();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PROCEDURE) {
					{
					{
					setState(68);
					procedure();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(76);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(MAAParser.CONST, 0); }
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_consts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(CONST);
			setState(79);
			vars();
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(T__1);
					setState(81);
					match(T__2);
					setState(82);
					vars();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(88);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MAAParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(VAR);
			setState(91);
			type();
			setState(92);
			ident();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(93);
				match(T__3);
				setState(94);
				expression(0);
				}
			}

			setState(97);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(MAAParser.PROCEDURE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PROCEDURE);
			setState(102);
			ident();
			setState(103);
			match(T__1);
			setState(104);
			block();
			setState(105);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public WritestmtContext writestmt() {
			return getRuleContext(WritestmtContext.class,0);
		}
		public BreakstmtContext breakstmt() {
			return getRuleContext(BreakstmtContext.class,0);
		}
		public ContinuestmtContext continuestmt() {
			return getRuleContext(ContinuestmtContext.class,0);
		}
		public BangstmtContext bangstmt() {
			return getRuleContext(BangstmtContext.class,0);
		}
		public BeginstmtContext beginstmt() {
			return getRuleContext(BeginstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(107);
				assignstmt();
				}
				break;
			case CALL:
				{
				setState(108);
				callstmt();
				}
				break;
			case WRITE:
				{
				setState(109);
				writestmt();
				}
				break;
			case BREAK:
				{
				setState(110);
				breakstmt();
				}
				break;
			case CONTINUE:
				{
				setState(111);
				continuestmt();
				}
				break;
			case T__11:
				{
				setState(112);
				bangstmt();
				}
				break;
			case BEGIN:
				{
				setState(113);
				beginstmt();
				}
				break;
			case IF:
				{
				setState(114);
				ifstmt();
				}
				break;
			case WHILE:
				{
				setState(115);
				whilestmt();
				}
				break;
			case T__0:
			case T__1:
			case END:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignstmtContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitAssignstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitAssignstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			ident();
			setState(119);
			match(T__7);
			setState(120);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallstmtContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(MAAParser.CALL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public CallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitCallstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitCallstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(CALL);
			setState(123);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritestmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MAAParser.WRITE, 0); }
		public ExpressionunionContext expressionunion() {
			return getRuleContext(ExpressionunionContext.class,0);
		}
		public WritestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterWritestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitWritestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitWritestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritestmtContext writestmt() throws RecognitionException {
		WritestmtContext _localctx = new WritestmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_writestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(WRITE);
			setState(126);
			match(T__8);
			setState(127);
			expressionunion();
			setState(128);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionunionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionunionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionunion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterExpressionunion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitExpressionunion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitExpressionunion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionunionContext expressionunion() throws RecognitionException {
		ExpressionunionContext _localctx = new ExpressionunionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionunion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__23) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(130);
				expression(0);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(131);
					match(T__10);
					setState(132);
					expression(0);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BangstmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BangstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bangstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterBangstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitBangstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitBangstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BangstmtContext bangstmt() throws RecognitionException {
		BangstmtContext _localctx = new BangstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bangstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__11);
			setState(141);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginstmtContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MAAParser.BEGIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(MAAParser.END, 0); }
		public BeginstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterBeginstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitBeginstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitBeginstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginstmtContext beginstmt() throws RecognitionException {
		BeginstmtContext _localctx = new BeginstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_beginstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(BEGIN);
			setState(144);
			statement();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(145);
				match(T__1);
				setState(146);
				statement();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MAAParser.IF, 0); }
		public ConditionunionContext conditionunion() {
			return getRuleContext(ConditionunionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MAAParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(MAAParser.END, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(IF);
			setState(155);
			conditionunion();
			setState(156);
			match(THEN);
			setState(157);
			statement();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(158);
				match(T__1);
				setState(159);
				statement();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MAAParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO() { return getToken(MAAParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(WHILE);
			setState(168);
			condition();
			setState(169);
			match(DO);
			setState(170);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakstmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(MAAParser.BREAK, 0); }
		public BreakstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterBreakstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitBreakstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitBreakstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakstmtContext breakstmt() throws RecognitionException {
		BreakstmtContext _localctx = new BreakstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_breakstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinuestmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(MAAParser.CONTINUE, 0); }
		public ContinuestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterContinuestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitContinuestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitContinuestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuestmtContext continuestmt() throws RecognitionException {
		ContinuestmtContext _localctx = new ContinuestmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_continuestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprCondContext extends ConditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterExprCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitExprCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitExprCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ConditionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ExprCondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				expression(0);
				setState(178);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionunionContext extends ParserRuleContext {
		public Token opp;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionunionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionunion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterConditionunion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitConditionunion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitConditionunion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionunionContext conditionunion() throws RecognitionException {
		ConditionunionContext _localctx = new ConditionunionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditionunion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			condition();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
				setState(184);
				((ConditionunionContext)_localctx).opp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((ConditionunionContext)_localctx).opp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				condition();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SummExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SummExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterSummExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitSummExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitSummExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorExprContext extends ExpressionContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterFactorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitFactorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FactorExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(192);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new SummExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(195);
						((SummExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((SummExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new MultExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(198);
						((MultExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((MultExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(T__8);
				setState(209);
				factor();
				setState(210);
				match(T__9);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				assignstmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				floatLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				charLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MAAParser.NUMBER, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(MAAParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MAAParser.NUMBER, i);
		}
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_floatLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(NUMBER);
			setState(223);
			match(T__0);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					match(NUMBER);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MAAParser.STRING, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__23);
			setState(231);
			match(STRING);
			setState(232);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MAAParser.STRING, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MAAParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MAAListener ) ((MAAListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MAAVisitor ) return ((MAAVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\5\3=\n\3\3\3\7\3@\n\3\f"+
		"\3\16\3C\13\3\5\3E\n\3\3\3\7\3H\n\3\f\3\16\3K\13\3\5\3M\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\5\5b\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bw\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\5\f\u008d\n\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0096\n\16\f\16\16\16\u0099\13\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a3\n\17\f\17\16\17\u00a6"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00b8\n\23\3\24\3\24\3\24\7\24\u00bd\n\24\f\24\16"+
		"\24\u00c0\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00cb"+
		"\n\25\f\25\16\25\u00ce\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u00d8\n\26\3\27\3\27\3\27\5\27\u00dd\n\27\3\30\3\30\3\31\3\31\3\31"+
		"\7\31\u00e4\n\31\f\31\16\31\u00e7\13\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\2\3(\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\66\2\7\3\2\7\t\4\2\6\6\17\23\3\2\24\25\3\2\26\27\3\2\30\31"+
		"\2\u00f4\28\3\2\2\2\4<\3\2\2\2\6P\3\2\2\2\b\\\3\2\2\2\ne\3\2\2\2\fg\3"+
		"\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22|\3\2\2\2\24\177\3\2\2\2\26\u008c\3\2"+
		"\2\2\30\u008e\3\2\2\2\32\u0091\3\2\2\2\34\u009c\3\2\2\2\36\u00a9\3\2\2"+
		"\2 \u00ae\3\2\2\2\"\u00b0\3\2\2\2$\u00b7\3\2\2\2&\u00b9\3\2\2\2(\u00c1"+
		"\3\2\2\2*\u00d7\3\2\2\2,\u00dc\3\2\2\2.\u00de\3\2\2\2\60\u00e0\3\2\2\2"+
		"\62\u00e8\3\2\2\2\64\u00ec\3\2\2\2\66\u00ee\3\2\2\289\5\4\3\29:\7\3\2"+
		"\2:\3\3\2\2\2;=\5\6\4\2<;\3\2\2\2<=\3\2\2\2=D\3\2\2\2>@\5\b\5\2?>\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2DA\3\2\2\2DE\3\2"+
		"\2\2EL\3\2\2\2FH\5\f\7\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2LI\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\5\16\b\2O\5\3\2\2\2PQ\7"+
		"&\2\2QW\5\b\5\2RS\7\4\2\2ST\7\5\2\2TV\5\b\5\2UR\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\4\2\2[\7\3\2\2\2\\]\7\'\2\2]"+
		"^\5\n\6\2^a\5\64\33\2_`\7\6\2\2`b\5(\25\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2"+
		"\2cd\7\4\2\2d\t\3\2\2\2ef\t\2\2\2f\13\3\2\2\2gh\7(\2\2hi\5\64\33\2ij\7"+
		"\4\2\2jk\5\4\3\2kl\7\4\2\2l\r\3\2\2\2mw\5\20\t\2nw\5\22\n\2ow\5\24\13"+
		"\2pw\5 \21\2qw\5\"\22\2rw\5\30\r\2sw\5\32\16\2tw\5\34\17\2uw\5\36\20\2"+
		"vm\3\2\2\2vn\3\2\2\2vo\3\2\2\2vp\3\2\2\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2"+
		"vt\3\2\2\2vu\3\2\2\2vw\3\2\2\2w\17\3\2\2\2xy\5\64\33\2yz\7\n\2\2z{\5("+
		"\25\2{\21\3\2\2\2|}\7%\2\2}~\5\64\33\2~\23\3\2\2\2\177\u0080\7\35\2\2"+
		"\u0080\u0081\7\13\2\2\u0081\u0082\5\26\f\2\u0082\u0083\7\f\2\2\u0083\25"+
		"\3\2\2\2\u0084\u0089\5(\25\2\u0085\u0086\7\r\2\2\u0086\u0088\5(\25\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0084\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e\u008f\7\16\2\2\u008f\u0090\5(\25"+
		"\2\u0090\31\3\2\2\2\u0091\u0092\7#\2\2\u0092\u0097\5\16\b\2\u0093\u0094"+
		"\7\4\2\2\u0094\u0096\5\16\b\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009b\7$\2\2\u009b\33\3\2\2\2\u009c\u009d\7 \2\2\u009d"+
		"\u009e\5&\24\2\u009e\u009f\7!\2\2\u009f\u00a4\5\16\b\2\u00a0\u00a1\7\4"+
		"\2\2\u00a1\u00a3\5\16\b\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a8\7$\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7\36\2\2\u00aa\u00ab"+
		"\5$\23\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad\5\16\b\2\u00ad\37\3\2\2\2\u00ae"+
		"\u00af\7\33\2\2\u00af!\3\2\2\2\u00b0\u00b1\7\34\2\2\u00b1#\3\2\2\2\u00b2"+
		"\u00b8\5(\25\2\u00b3\u00b4\5(\25\2\u00b4\u00b5\t\3\2\2\u00b5\u00b6\5("+
		"\25\2\u00b6\u00b8\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8"+
		"%\3\2\2\2\u00b9\u00be\5$\23\2\u00ba\u00bb\t\4\2\2\u00bb\u00bd\5$\23\2"+
		"\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\'\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\b\25\1\2\u00c2"+
		"\u00c3\5*\26\2\u00c3\u00cc\3\2\2\2\u00c4\u00c5\f\4\2\2\u00c5\u00c6\t\5"+
		"\2\2\u00c6\u00cb\5(\25\5\u00c7\u00c8\f\3\2\2\u00c8\u00c9\t\6\2\2\u00c9"+
		"\u00cb\5(\25\4\u00ca\u00c4\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd)\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d8\5\64\33\2\u00d0\u00d8\5\66\34\2\u00d1\u00d8\5,\27"+
		"\2\u00d2\u00d3\7\13\2\2\u00d3\u00d4\5*\26\2\u00d4\u00d5\7\f\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d8\5\20\t\2\u00d7\u00cf\3\2\2\2\u00d7\u00d0\3"+
		"\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"+\3\2\2\2\u00d9\u00dd\5.\30\2\u00da\u00dd\5\60\31\2\u00db\u00dd\5\62\32"+
		"\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd-"+
		"\3\2\2\2\u00de\u00df\7*\2\2\u00df/\3\2\2\2\u00e0\u00e1\7*\2\2\u00e1\u00e5"+
		"\7\3\2\2\u00e2\u00e4\7*\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\61\3\2\2\2\u00e7\u00e5\3\2\2"+
		"\2\u00e8\u00e9\7\32\2\2\u00e9\u00ea\7)\2\2\u00ea\u00eb\7\32\2\2\u00eb"+
		"\63\3\2\2\2\u00ec\u00ed\7)\2\2\u00ed\65\3\2\2\2\u00ee\u00ef\7*\2\2\u00ef"+
		"\67\3\2\2\2\25<ADILWav\u0089\u008c\u0097\u00a4\u00b7\u00be\u00ca\u00cc"+
		"\u00d7\u00dc\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}