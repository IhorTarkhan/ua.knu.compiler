// Generated from C:/Users/Abdullah alashry/IdeaProjects/Compiler/src\CoolCompiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolCompilerParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_class_name = 1, RULE_body = 2, RULE_parm = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_name", "body", "parm", "expr"
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

	@Override
	public String getGrammarFileName() { return "CoolCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Class_nameContext> class_name() {
			return getRuleContexts(Class_nameContext.class);
		}
		public Class_nameContext class_name(int i) {
			return getRuleContext(Class_nameContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolCompilerVisitor ) return ((CoolCompilerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				class_name();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CoolCompilerParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(CoolCompilerParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolCompilerParser.TYPE, i);
		}
		public TerminalNode LBRACE() { return getToken(CoolCompilerParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolCompilerParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolCompilerParser.SEMICOLON, 0); }
		public TerminalNode INHERITS() { return getToken(CoolCompilerParser.INHERITS, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolCompilerVisitor ) return ((CoolCompilerVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(15);
			match(CLASS);
			setState(16);
			match(TYPE);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(17);
				match(INHERITS);
				setState(18);
				match(TYPE);
				}
			}

			setState(21);
			match(LBRACE);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(22);
				body();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(RBRACE);
			setState(29);
			match(SEMICOLON);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolCompilerParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CoolCompilerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolCompilerParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolCompilerParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(CoolCompilerParser.TYPE, 0); }
		public TerminalNode LBRACE() { return getToken(CoolCompilerParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolCompilerParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolCompilerParser.SEMICOLON, 0); }
		public List<ParmContext> parm() {
			return getRuleContexts(ParmContext.class);
		}
		public ParmContext parm(int i) {
			return getRuleContext(ParmContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CoolCompilerParser.ASSIGN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolCompilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolCompilerParser.COMMA, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolCompilerVisitor ) return ((CoolCompilerVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(31);
				match(ID);
				setState(32);
				match(LPAREN);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(33);
					parm();
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(34);
						match(COMMA);
						setState(35);
						parm();
						}
						}
						setState(40);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(43);
				match(RPAREN);
				setState(44);
				match(COLON);
				setState(45);
				match(TYPE);
				setState(46);
				match(LBRACE);
				setState(47);
				expr(0);
				setState(48);
				match(RBRACE);
				setState(49);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(51);
				match(ID);
				setState(52);
				match(COLON);
				setState(53);
				match(TYPE);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(54);
					match(ASSIGN);
					setState(55);
					expr(0);
					}
				}

				setState(58);
				match(SEMICOLON);
				}
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

	public static class ParmContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolCompilerParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CoolCompilerParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(CoolCompilerParser.TYPE, 0); }
		public ParmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).enterParm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).exitParm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolCompilerVisitor ) return ((CoolCompilerVisitor<? extends T>)visitor).visitParm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParmContext parm() throws RecognitionException {
		ParmContext _localctx = new ParmContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			setState(62);
			match(COLON);
			setState(63);
			match(TYPE);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CoolCompilerParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CoolCompilerParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(CoolCompilerParser.NOT, 0); }
		public TerminalNode ID() { return getToken(CoolCompilerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolCompilerParser.ASSIGN, 0); }
		public TerminalNode IF() { return getToken(CoolCompilerParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolCompilerParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolCompilerParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolCompilerParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(CoolCompilerParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolCompilerParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolCompilerParser.POOL, 0); }
		public TerminalNode NEW() { return getToken(CoolCompilerParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(CoolCompilerParser.TYPE, 0); }
		public TerminalNode LBRACE() { return getToken(CoolCompilerParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolCompilerParser.RBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolCompilerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolCompilerParser.SEMICOLON, i);
		}
		public TerminalNode NUM() { return getToken(CoolCompilerParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(CoolCompilerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoolCompilerParser.FALSE, 0); }
		public TerminalNode DIV() { return getToken(CoolCompilerParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(CoolCompilerParser.MUL, 0); }
		public TerminalNode PLUS() { return getToken(CoolCompilerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolCompilerParser.MINUS, 0); }
		public TerminalNode LE() { return getToken(CoolCompilerParser.LE, 0); }
		public TerminalNode LT() { return getToken(CoolCompilerParser.LT, 0); }
		public TerminalNode EQUALS() { return getToken(CoolCompilerParser.EQUALS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolCompilerListener ) ((CoolCompilerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolCompilerVisitor ) return ((CoolCompilerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(66);
				match(LPAREN);
				setState(67);
				expr(0);
				setState(68);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(70);
				match(NOT);
				setState(71);
				expr(10);
				}
				break;
			case 3:
				{
				setState(72);
				match(ID);
				setState(73);
				match(ASSIGN);
				setState(74);
				expr(9);
				}
				break;
			case 4:
				{
				setState(75);
				match(IF);
				setState(76);
				expr(0);
				setState(77);
				match(THEN);
				setState(78);
				expr(0);
				setState(79);
				match(ELSE);
				setState(80);
				expr(0);
				setState(81);
				match(FI);
				}
				break;
			case 5:
				{
				setState(83);
				match(WHILE);
				setState(84);
				expr(0);
				setState(85);
				match(LOOP);
				setState(86);
				expr(0);
				setState(87);
				match(POOL);
				}
				break;
			case 6:
				{
				setState(89);
				match(NEW);
				setState(90);
				match(TYPE);
				}
				break;
			case 7:
				{
				setState(91);
				match(LBRACE);
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					expr(0);
					setState(93);
					match(SEMICOLON);
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << LBRACE) | (1L << NUM) | (1L << ID))) != 0) );
				setState(99);
				match(RBRACE);
				}
				break;
			case 8:
				{
				setState(101);
				match(ID);
				}
				break;
			case 9:
				{
				setState(102);
				match(NUM);
				}
				break;
			case 10:
				{
				setState(103);
				match(TRUE);
				}
				break;
			case 11:
				{
				setState(104);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(108);
						match(DIV);
						setState(109);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(111);
						match(MUL);
						setState(112);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(114);
						match(PLUS);
						setState(115);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(117);
						match(MINUS);
						setState(118);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(120);
						match(LE);
						setState(121);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(123);
						match(LT);
						setState(124);
						expr(14);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(126);
						match(EQUALS);
						setState(127);
						expr(12);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0088\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3"+
		"\3\3\5\3\26\n\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\7\4\'\n\4\f\4\16\4*\13\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6b\n\6\r\6\16\6c\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083\n\6\f\6\16\6"+
		"\u0086\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\2\u009b\2\r\3\2\2\2\4\21\3\2\2\2"+
		"\6=\3\2\2\2\b?\3\2\2\2\nk\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2"+
		"\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\f\2\2\22\25\7+\2\2"+
		"\23\24\7\16\2\2\24\26\7+\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2"+
		"\27\33\7#\2\2\30\32\5\6\4\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2"+
		"\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7$\2\2\37 \7\26\2\2 "+
		"\5\3\2\2\2!\"\7,\2\2\"+\7\30\2\2#(\5\b\5\2$%\7\32\2\2%\'\5\b\5\2&$\3\2"+
		"\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2\2\2+#\3\2\2\2+,\3"+
		"\2\2\2,-\3\2\2\2-.\7\31\2\2./\7(\2\2/\60\7+\2\2\60\61\7#\2\2\61\62\5\n"+
		"\6\2\62\63\7$\2\2\63\64\7\26\2\2\64>\3\2\2\2\65\66\7,\2\2\66\67\7(\2\2"+
		"\67:\7+\2\289\7&\2\29;\5\n\6\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<>\7\26\2"+
		"\2=!\3\2\2\2=\65\3\2\2\2>\7\3\2\2\2?@\7,\2\2@A\7(\2\2AB\7+\2\2B\t\3\2"+
		"\2\2CD\b\6\1\2DE\7\30\2\2EF\5\n\6\2FG\7\31\2\2Gl\3\2\2\2HI\7\23\2\2Il"+
		"\5\n\6\fJK\7,\2\2KL\7&\2\2Ll\5\n\6\13MN\7\5\2\2NO\5\n\6\2OP\7\b\2\2PQ"+
		"\5\n\6\2QR\7\t\2\2RS\5\n\6\2ST\7\6\2\2Tl\3\2\2\2UV\7\7\2\2VW\5\n\6\2W"+
		"X\7\n\2\2XY\5\n\6\2YZ\7\13\2\2Zl\3\2\2\2[\\\7\21\2\2\\l\7+\2\2]a\7#\2"+
		"\2^_\5\n\6\2_`\7\26\2\2`b\3\2\2\2a^\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2de\3\2\2\2ef\7$\2\2fl\3\2\2\2gl\7,\2\2hl\7*\2\2il\7\24\2\2jl\7\25"+
		"\2\2kC\3\2\2\2kH\3\2\2\2kJ\3\2\2\2kM\3\2\2\2kU\3\2\2\2k[\3\2\2\2k]\3\2"+
		"\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\u0084\3\2\2\2mn\f\24\2\2"+
		"no\7\36\2\2o\u0083\5\n\6\25pq\f\23\2\2qr\7\35\2\2r\u0083\5\n\6\24st\f"+
		"\22\2\2tu\7\33\2\2u\u0083\5\n\6\23vw\f\21\2\2wx\7\34\2\2x\u0083\5\n\6"+
		"\22yz\f\20\2\2z{\7!\2\2{\u0083\5\n\6\21|}\f\17\2\2}~\7 \2\2~\u0083\5\n"+
		"\6\20\177\u0080\f\r\2\2\u0080\u0081\7\"\2\2\u0081\u0083\5\n\6\16\u0082"+
		"m\3\2\2\2\u0082p\3\2\2\2\u0082s\3\2\2\2\u0082v\3\2\2\2\u0082y\3\2\2\2"+
		"\u0082|\3\2\2\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\13\3\2\2\2\u0086\u0084\3\2\2\2\r\17\25"+
		"\33(+:=ck\u0082\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}