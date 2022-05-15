// Generated from C:/Users/Mohamed Amin/IdeaProjects/TripleA/src\Lexer_grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexer_grammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CASE=1, ESAC=2, IF=3, FI=4, WHILE=5, THEN=6, ELSE=7, LOOP=8, POOL=9, CLASS=10, 
		IN=11, INHERITS=12, OF=13, LET=14, NEW=15, ISVOID=16, NOT=17, TRUE=18, 
		FALSE=19, SEMICOLON=20, CASE_ARROW=21, LPAREN=22, RPAREN=23, COMMA=24, 
		PLUS=25, MINUS=26, MUL=27, DIV=28, TILDE=29, LT=30, LE=31, EQUALS=32, 
		LBRACE=33, RBRACE=34, DOT=35, ASSIGN=36, ATSYM=37, COLON=38, WS=39, OBJECT=40, 
		MAIN=41, NUM=42, BOOL_CONST=43, INT=44, ID=45, ERROR=46;
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
			"DOT", "ASSIGN", "ATSYM", "COLON", "WS", "OBJECT", "MAIN", "NUM", "BOOL_CONST", 
			"INT", "ID", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "';'", "'=>'", "'('", 
			"')'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", 
			"'{'", "'}'", "'.'", "'<-'", "'@'", "':'", null, "'Object'", null, null, 
			null, "'Int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CASE", "ESAC", "IF", "FI", "WHILE", "THEN", "ELSE", "LOOP", "POOL", 
			"CLASS", "IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "NOT", "TRUE", 
			"FALSE", "SEMICOLON", "CASE_ARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", 
			"MINUS", "MUL", "DIV", "TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", 
			"DOT", "ASSIGN", "ATSYM", "COLON", "WS", "OBJECT", "MAIN", "NUM", "BOOL_CONST", 
			"INT", "ID", "ERROR"
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


	public Lexer_grammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer_grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u010d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\6(\u00e6\n(\r(\16"+
		"(\u00e7\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\6+\u00f9\n+\r+\16"+
		"+\u00fa\3,\3,\5,\u00ff\n,\3-\3-\3-\3-\3.\3.\7.\u0107\n.\f.\16.\u010a\13"+
		".\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\30\4\2EEee\4"+
		"\2CCcc\4\2UUuu\4\2GGgg\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4\2VVv"+
		"v\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2XXxx\4\2FFff\4\2WWww\5\2\13\f\17"+
		"\17\"\"\4\2OOoo\3\2\62;\3\2c|\6\2\62;C\\aac|\2\u0110\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5d\3\2\2\2\7i\3\2\2\2\t"+
		"l\3\2\2\2\13o\3\2\2\2\ru\3\2\2\2\17z\3\2\2\2\21\177\3\2\2\2\23\u0084\3"+
		"\2\2\2\25\u0089\3\2\2\2\27\u008f\3\2\2\2\31\u0092\3\2\2\2\33\u009a\3\2"+
		"\2\2\35\u009d\3\2\2\2\37\u00a1\3\2\2\2!\u00a5\3\2\2\2#\u00ac\3\2\2\2%"+
		"\u00b0\3\2\2\2\'\u00b5\3\2\2\2)\u00bb\3\2\2\2+\u00bd\3\2\2\2-\u00c0\3"+
		"\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8\3\2\2"+
		"\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00d0\3\2\2\2?\u00d2"+
		"\3\2\2\2A\u00d5\3\2\2\2C\u00d7\3\2\2\2E\u00d9\3\2\2\2G\u00db\3\2\2\2I"+
		"\u00dd\3\2\2\2K\u00e0\3\2\2\2M\u00e2\3\2\2\2O\u00e5\3\2\2\2Q\u00eb\3\2"+
		"\2\2S\u00f2\3\2\2\2U\u00f8\3\2\2\2W\u00fe\3\2\2\2Y\u0100\3\2\2\2[\u0104"+
		"\3\2\2\2]\u010b\3\2\2\2_`\t\2\2\2`a\t\3\2\2ab\t\4\2\2bc\t\5\2\2c\4\3\2"+
		"\2\2de\t\5\2\2ef\t\4\2\2fg\t\3\2\2gh\t\2\2\2h\6\3\2\2\2ij\t\6\2\2jk\t"+
		"\7\2\2k\b\3\2\2\2lm\t\7\2\2mn\t\6\2\2n\n\3\2\2\2op\t\b\2\2pq\t\t\2\2q"+
		"r\t\6\2\2rs\t\n\2\2st\t\5\2\2t\f\3\2\2\2uv\t\13\2\2vw\t\t\2\2wx\t\5\2"+
		"\2xy\t\f\2\2y\16\3\2\2\2z{\t\5\2\2{|\t\n\2\2|}\t\4\2\2}~\t\5\2\2~\20\3"+
		"\2\2\2\177\u0080\t\n\2\2\u0080\u0081\t\r\2\2\u0081\u0082\t\r\2\2\u0082"+
		"\u0083\t\16\2\2\u0083\22\3\2\2\2\u0084\u0085\t\16\2\2\u0085\u0086\t\r"+
		"\2\2\u0086\u0087\t\r\2\2\u0087\u0088\t\n\2\2\u0088\24\3\2\2\2\u0089\u008a"+
		"\t\2\2\2\u008a\u008b\t\n\2\2\u008b\u008c\t\3\2\2\u008c\u008d\t\4\2\2\u008d"+
		"\u008e\t\4\2\2\u008e\26\3\2\2\2\u008f\u0090\t\6\2\2\u0090\u0091\t\f\2"+
		"\2\u0091\30\3\2\2\2\u0092\u0093\t\6\2\2\u0093\u0094\t\t\2\2\u0094\u0095"+
		"\t\5\2\2\u0095\u0096\t\17\2\2\u0096\u0097\t\6\2\2\u0097\u0098\t\13\2\2"+
		"\u0098\u0099\t\4\2\2\u0099\32\3\2\2\2\u009a\u009b\t\r\2\2\u009b\u009c"+
		"\t\7\2\2\u009c\34\3\2\2\2\u009d\u009e\t\n\2\2\u009e\u009f\t\5\2\2\u009f"+
		"\u00a0\t\13\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\t\f\2\2\u00a2\u00a3\t\5\2"+
		"\2\u00a3\u00a4\t\b\2\2\u00a4 \3\2\2\2\u00a5\u00a6\t\6\2\2\u00a6\u00a7"+
		"\t\4\2\2\u00a7\u00a8\t\20\2\2\u00a8\u00a9\t\r\2\2\u00a9\u00aa\t\6\2\2"+
		"\u00aa\u00ab\t\21\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\t\f\2\2\u00ad\u00ae"+
		"\t\r\2\2\u00ae\u00af\t\13\2\2\u00af$\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1"+
		"\u00b2\t\17\2\2\u00b2\u00b3\t\22\2\2\u00b3\u00b4\t\5\2\2\u00b4&\3\2\2"+
		"\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00b8\t\n\2\2\u00b8\u00b9"+
		"\t\4\2\2\u00b9\u00ba\t\5\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7=\2\2\u00bc*"+
		"\3\2\2\2\u00bd\u00be\7?\2\2\u00be\u00bf\7@\2\2\u00bf,\3\2\2\2\u00c0\u00c1"+
		"\7*\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7+\2\2\u00c3\60\3\2\2\2\u00c4\u00c5"+
		"\7.\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7\64\3\2\2\2\u00c8\u00c9"+
		"\7/\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb8\3\2\2\2\u00cc\u00cd"+
		"\7\61\2\2\u00cd:\3\2\2\2\u00ce\u00cf\7\u0080\2\2\u00cf<\3\2\2\2\u00d0"+
		"\u00d1\7>\2\2\u00d1>\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4"+
		"@\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6B\3\2\2\2\u00d7\u00d8\7}\2\2\u00d8D"+
		"\3\2\2\2\u00d9\u00da\7\177\2\2\u00daF\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc"+
		"H\3\2\2\2\u00dd\u00de\7>\2\2\u00de\u00df\7/\2\2\u00dfJ\3\2\2\2\u00e0\u00e1"+
		"\7B\2\2\u00e1L\3\2\2\2\u00e2\u00e3\7<\2\2\u00e3N\3\2\2\2\u00e4\u00e6\t"+
		"\23\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b(\2\2\u00eaP\3\2\2\2\u00eb"+
		"\u00ec\7Q\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7l\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef\u00f0\7e\2\2\u00f0\u00f1\7v\2\2\u00f1R\3\2\2\2\u00f2\u00f3\t\24"+
		"\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6T\3"+
		"\2\2\2\u00f7\u00f9\t\25\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fbV\3\2\2\2\u00fc\u00ff\5%\23\2"+
		"\u00fd\u00ff\5\'\24\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ffX\3"+
		"\2\2\2\u0100\u0101\7K\2\2\u0101\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103"+
		"Z\3\2\2\2\u0104\u0108\t\26\2\2\u0105\u0107\t\27\2\2\u0106\u0105\3\2\2"+
		"\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\\"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\13\2\2\2\u010c^\3\2\2\2\b\2\u00e7"+
		"\u00fa\u00fe\u0106\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}