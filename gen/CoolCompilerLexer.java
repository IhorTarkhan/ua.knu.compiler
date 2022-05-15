// Generated from C:/Users/Abdullah alashry/IdeaProjects/Compiler/src\CoolCompiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolCompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CASE=1, ESAC=2, IF=3, FI=4, WHILE=5, THEN=6, ELSE=7, LOOP=8, POOL=9, CLASS=10, 
		IN=11, INHERITS=12, OF=13, LET=14, NEW=15, ISVOID=16, NOT=17, TRUE=18, 
		FALSE=19, SEMICOLON=20, CASE_ARROW=21, LPAREN=22, RPAREN=23, COMMA=24, 
		PLUS=25, MINUS=26, MUL=27, DIV=28, TILDE=29, LT=30, LE=31, EQUALS=32, 
		LBRACE=33, RBRACE=34, DOT=35, ASSIGN=36, ATSYM=37, COLON=38, WS=39, NUM=40, 
		TYPE=41, ID=42, ERROR=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CASE", "ESAC", "IF", "FI", "WHILE", "THEN", "ELSE", "LOOP", "POOL", 
			"CLASS", "IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "NOT", "TRUE", 
			"FALSE", "SEMICOLON", "CASE_ARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", 
			"MINUS", "MUL", "DIV", "TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", 
			"DOT", "ASSIGN", "ATSYM", "COLON", "WS", "NUM", "TYPE", "ID", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "';'", "'=>'", "'('", 
			"')'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", 
			"'{'", "'}'", "'.'", "'<-'", "'@'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CASE", "ESAC", "IF", "FI", "WHILE", "THEN", "ELSE", "LOOP", "POOL", 
			"CLASS", "IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "NOT", "TRUE", 
			"FALSE", "SEMICOLON", "CASE_ARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", 
			"MINUS", "MUL", "DIV", "TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", 
			"DOT", "ASSIGN", "ATSYM", "COLON", "WS", "NUM", "TYPE", "ID", "ERROR"
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


	public CoolCompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolCompiler.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3(\6(\u00e0\n(\r(\16(\u00e1\3(\3(\3)\6)\u00e7"+
		"\n)\r)\16)\u00e8\3*\3*\7*\u00ed\n*\f*\16*\u00f0\13*\3+\3+\7+\u00f4\n+"+
		"\f+\16+\u00f7\13+\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\31\4\2"+
		"EEee\4\2CCcc\4\2UUuu\4\2GGgg\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4"+
		"\2VVvv\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2XXxx\4\2FFff\4\2WWww\5\2\13"+
		"\f\17\17\"\"\3\2\62;\3\2C\\\5\2\62;C\\c|\3\2c|\6\2\62;C\\aac|\2\u00fd"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5^\3\2\2\2\7c\3\2\2\2\tf\3\2\2\2\13i\3"+
		"\2\2\2\ro\3\2\2\2\17t\3\2\2\2\21y\3\2\2\2\23~\3\2\2\2\25\u0083\3\2\2\2"+
		"\27\u0089\3\2\2\2\31\u008c\3\2\2\2\33\u0094\3\2\2\2\35\u0097\3\2\2\2\37"+
		"\u009b\3\2\2\2!\u009f\3\2\2\2#\u00a6\3\2\2\2%\u00aa\3\2\2\2\'\u00af\3"+
		"\2\2\2)\u00b5\3\2\2\2+\u00b7\3\2\2\2-\u00ba\3\2\2\2/\u00bc\3\2\2\2\61"+
		"\u00be\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2\2\67\u00c4\3\2\2\29\u00c6"+
		"\3\2\2\2;\u00c8\3\2\2\2=\u00ca\3\2\2\2?\u00cc\3\2\2\2A\u00cf\3\2\2\2C"+
		"\u00d1\3\2\2\2E\u00d3\3\2\2\2G\u00d5\3\2\2\2I\u00d7\3\2\2\2K\u00da\3\2"+
		"\2\2M\u00dc\3\2\2\2O\u00df\3\2\2\2Q\u00e6\3\2\2\2S\u00ea\3\2\2\2U\u00f1"+
		"\3\2\2\2W\u00f8\3\2\2\2YZ\t\2\2\2Z[\t\3\2\2[\\\t\4\2\2\\]\t\5\2\2]\4\3"+
		"\2\2\2^_\t\5\2\2_`\t\4\2\2`a\t\3\2\2ab\t\2\2\2b\6\3\2\2\2cd\t\6\2\2de"+
		"\t\7\2\2e\b\3\2\2\2fg\t\7\2\2gh\t\6\2\2h\n\3\2\2\2ij\t\b\2\2jk\t\t\2\2"+
		"kl\t\6\2\2lm\t\n\2\2mn\t\5\2\2n\f\3\2\2\2op\t\13\2\2pq\t\t\2\2qr\t\5\2"+
		"\2rs\t\f\2\2s\16\3\2\2\2tu\t\5\2\2uv\t\n\2\2vw\t\4\2\2wx\t\5\2\2x\20\3"+
		"\2\2\2yz\t\n\2\2z{\t\r\2\2{|\t\r\2\2|}\t\16\2\2}\22\3\2\2\2~\177\t\16"+
		"\2\2\177\u0080\t\r\2\2\u0080\u0081\t\r\2\2\u0081\u0082\t\n\2\2\u0082\24"+
		"\3\2\2\2\u0083\u0084\t\2\2\2\u0084\u0085\t\n\2\2\u0085\u0086\t\3\2\2\u0086"+
		"\u0087\t\4\2\2\u0087\u0088\t\4\2\2\u0088\26\3\2\2\2\u0089\u008a\t\6\2"+
		"\2\u008a\u008b\t\f\2\2\u008b\30\3\2\2\2\u008c\u008d\t\6\2\2\u008d\u008e"+
		"\t\t\2\2\u008e\u008f\t\5\2\2\u008f\u0090\t\17\2\2\u0090\u0091\t\6\2\2"+
		"\u0091\u0092\t\13\2\2\u0092\u0093\t\4\2\2\u0093\32\3\2\2\2\u0094\u0095"+
		"\t\r\2\2\u0095\u0096\t\7\2\2\u0096\34\3\2\2\2\u0097\u0098\t\n\2\2\u0098"+
		"\u0099\t\5\2\2\u0099\u009a\t\13\2\2\u009a\36\3\2\2\2\u009b\u009c\t\f\2"+
		"\2\u009c\u009d\t\5\2\2\u009d\u009e\t\b\2\2\u009e \3\2\2\2\u009f\u00a0"+
		"\t\6\2\2\u00a0\u00a1\t\4\2\2\u00a1\u00a2\t\20\2\2\u00a2\u00a3\t\r\2\2"+
		"\u00a3\u00a4\t\6\2\2\u00a4\u00a5\t\21\2\2\u00a5\"\3\2\2\2\u00a6\u00a7"+
		"\t\f\2\2\u00a7\u00a8\t\r\2\2\u00a8\u00a9\t\13\2\2\u00a9$\3\2\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\t\17\2\2\u00ac\u00ad\t\22\2\2\u00ad\u00ae\t"+
		"\5\2\2\u00ae&\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\t\3\2\2\u00b1\u00b2"+
		"\t\n\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00b4\t\5\2\2\u00b4(\3\2\2\2\u00b5"+
		"\u00b6\7=\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8\u00b9\7@\2\2\u00b9"+
		",\3\2\2\2\u00ba\u00bb\7*\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd\60"+
		"\3\2\2\2\u00be\u00bf\7.\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1"+
		"\64\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5"+
		"8\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7:\3\2\2\2\u00c8\u00c9\7\u0080\2\2"+
		"\u00c9<\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd"+
		"\u00ce\7?\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0B\3\2\2\2\u00d1\u00d2"+
		"\7}\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7\177\2\2\u00d4F\3\2\2\2\u00d5\u00d6"+
		"\7\60\2\2\u00d6H\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8\u00d9\7/\2\2\u00d9J"+
		"\3\2\2\2\u00da\u00db\7B\2\2\u00dbL\3\2\2\2\u00dc\u00dd\7<\2\2\u00ddN\3"+
		"\2\2\2\u00de\u00e0\t\23\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b("+
		"\2\2\u00e4P\3\2\2\2\u00e5\u00e7\t\24\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9R\3\2\2\2\u00ea"+
		"\u00ee\t\25\2\2\u00eb\u00ed\t\26\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3"+
		"\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efT\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f5\t\27\2\2\u00f2\u00f4\t\30\2\2\u00f3\u00f2\3\2\2\2"+
		"\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6V\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\13\2\2\2\u00f9X\3\2\2\2\b\2\u00e1"+
		"\u00e8\u00ee\u00f3\u00f5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}