// Generated from C:/Users/HP/IdeaProjects/MAA - coursework/src\MAA.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MAALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BREAK=18, CONTINUE=19, WRITE=20, WHILE=21, DO=22, IF=23, THEN=24, ODD=25, 
		BEGIN=26, END=27, CALL=28, CONST=29, VAR=30, PROCEDURE=31, FLOAT=32, INTEGER=33, 
		STRING=34, NUMBER=35, BlockComment=36, LineComment=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"BREAK", "CONTINUE", "WRITE", "WHILE", "DO", "IF", "THEN", "ODD", "BEGIN", 
			"END", "CALL", "CONST", "VAR", "PROCEDURE", "FLOAT", "INTEGER", "STRING", 
			"NUMBER", "BlockComment", "LineComment", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'='", "','", "';'", "':='", "'!'", "'!='", "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'BREAK'", "'CONTINUE'", 
			"'WRITE'", "'WHILE'", "'DO'", "'IF'", "'THEN'", "'ODD'", "'BEGIN'", "'END'", 
			"'CALL'", "'CONST'", "'VAR'", "'PROCEDURE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BREAK", "CONTINUE", "WRITE", "WHILE", 
			"DO", "IF", "THEN", "ODD", "BEGIN", "END", "CALL", "CONST", "VAR", "PROCEDURE", 
			"FLOAT", "INTEGER", "STRING", "NUMBER", "BlockComment", "LineComment", 
			"WS"
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


	public MAALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MAA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3!\5!\u00c4\n!\3!\3!\3!\3!\3\"\5\"\u00cb\n\"\3\"\3\"\3#"+
		"\3#\7#\u00d1\n#\f#\16#\u00d4\13#\3$\6$\u00d7\n$\r$\16$\u00d8\3%\3%\3%"+
		"\3%\7%\u00df\n%\f%\16%\u00e2\13%\3%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u00ed\n"+
		"&\f&\16&\u00f0\13&\3&\3&\3\'\3\'\3\'\3\'\3\u00e0\2(\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(\3\2\6\4\2C\\c|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00fc\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3"+
		"\2\2\2\13W\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25"+
		"d\3\2\2\2\27f\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2"+
		"!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'{\3\2\2\2)\u0084\3\2\2\2+\u008a\3\2\2"+
		"\2-\u0090\3\2\2\2/\u0093\3\2\2\2\61\u0096\3\2\2\2\63\u009b\3\2\2\2\65"+
		"\u009f\3\2\2\2\67\u00a5\3\2\2\29\u00a9\3\2\2\2;\u00ae\3\2\2\2=\u00b4\3"+
		"\2\2\2?\u00b8\3\2\2\2A\u00c3\3\2\2\2C\u00ca\3\2\2\2E\u00ce\3\2\2\2G\u00d6"+
		"\3\2\2\2I\u00da\3\2\2\2K\u00e8\3\2\2\2M\u00f3\3\2\2\2OP\7\60\2\2P\4\3"+
		"\2\2\2QR\7?\2\2R\6\3\2\2\2ST\7.\2\2T\b\3\2\2\2UV\7=\2\2V\n\3\2\2\2WX\7"+
		"<\2\2XY\7?\2\2Y\f\3\2\2\2Z[\7#\2\2[\16\3\2\2\2\\]\7#\2\2]^\7?\2\2^\20"+
		"\3\2\2\2_`\7>\2\2`\22\3\2\2\2ab\7>\2\2bc\7?\2\2c\24\3\2\2\2de\7@\2\2e"+
		"\26\3\2\2\2fg\7@\2\2gh\7?\2\2h\30\3\2\2\2ij\7-\2\2j\32\3\2\2\2kl\7/\2"+
		"\2l\34\3\2\2\2mn\7,\2\2n\36\3\2\2\2op\7\61\2\2p \3\2\2\2qr\7*\2\2r\"\3"+
		"\2\2\2st\7+\2\2t$\3\2\2\2uv\7D\2\2vw\7T\2\2wx\7G\2\2xy\7C\2\2yz\7M\2\2"+
		"z&\3\2\2\2{|\7E\2\2|}\7Q\2\2}~\7P\2\2~\177\7V\2\2\177\u0080\7K\2\2\u0080"+
		"\u0081\7P\2\2\u0081\u0082\7W\2\2\u0082\u0083\7G\2\2\u0083(\3\2\2\2\u0084"+
		"\u0085\7Y\2\2\u0085\u0086\7T\2\2\u0086\u0087\7K\2\2\u0087\u0088\7V\2\2"+
		"\u0088\u0089\7G\2\2\u0089*\3\2\2\2\u008a\u008b\7Y\2\2\u008b\u008c\7J\2"+
		"\2\u008c\u008d\7K\2\2\u008d\u008e\7N\2\2\u008e\u008f\7G\2\2\u008f,\3\2"+
		"\2\2\u0090\u0091\7F\2\2\u0091\u0092\7Q\2\2\u0092.\3\2\2\2\u0093\u0094"+
		"\7K\2\2\u0094\u0095\7H\2\2\u0095\60\3\2\2\2\u0096\u0097\7V\2\2\u0097\u0098"+
		"\7J\2\2\u0098\u0099\7G\2\2\u0099\u009a\7P\2\2\u009a\62\3\2\2\2\u009b\u009c"+
		"\7Q\2\2\u009c\u009d\7F\2\2\u009d\u009e\7F\2\2\u009e\64\3\2\2\2\u009f\u00a0"+
		"\7D\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7I\2\2\u00a2\u00a3\7K\2\2\u00a3"+
		"\u00a4\7P\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7G\2\2\u00a6\u00a7\7P\2\2\u00a7"+
		"\u00a8\7F\2\2\u00a88\3\2\2\2\u00a9\u00aa\7E\2\2\u00aa\u00ab\7C\2\2\u00ab"+
		"\u00ac\7N\2\2\u00ac\u00ad\7N\2\2\u00ad:\3\2\2\2\u00ae\u00af\7E\2\2\u00af"+
		"\u00b0\7Q\2\2\u00b0\u00b1\7P\2\2\u00b1\u00b2\7U\2\2\u00b2\u00b3\7V\2\2"+
		"\u00b3<\3\2\2\2\u00b4\u00b5\7X\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7T\2"+
		"\2\u00b7>\3\2\2\2\u00b8\u00b9\7R\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\7"+
		"Q\2\2\u00bb\u00bc\7E\2\2\u00bc\u00bd\7G\2\2\u00bd\u00be\7F\2\2\u00be\u00bf"+
		"\7W\2\2\u00bf\u00c0\7T\2\2\u00c0\u00c1\7G\2\2\u00c1@\3\2\2\2\u00c2\u00c4"+
		"\7/\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\5G$\2\u00c6\u00c7\7\60\2\2\u00c7\u00c8\5G$\2\u00c8B\3\2\2\2\u00c9"+
		"\u00cb\7/\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\5G$\2\u00cdD\3\2\2\2\u00ce\u00d2\t\2\2\2\u00cf\u00d1"+
		"\t\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3F\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\t\3\2\2"+
		"\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9H\3\2\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\7,\2\2\u00dc"+
		"\u00e0\3\2\2\2\u00dd\u00df\13\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\b%\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea"+
		"\7\61\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ed\n\4\2\2\u00ec\u00eb\3\2\2\2"+
		"\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\b&\2\2\u00f2L\3\2\2\2\u00f3\u00f4"+
		"\t\5\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\'\2\2\u00f6N\3\2\2\2\t\2\u00c3"+
		"\u00ca\u00d2\u00d8\u00e0\u00ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}