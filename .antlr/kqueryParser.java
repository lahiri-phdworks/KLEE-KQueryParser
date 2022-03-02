// Generated from /home/clustfuzz/Documents/LLVM/KLEE-KQueryParser/kquery.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kqueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		SignedConstant=46, Constant=47, DecConstant=48, BinConstant=49, OctConstant=50, 
		HexConstant=51, WidthType=52, Identifier=53, Digit=54, WS=55, LeftParen=56, 
		RightParen=57, LeftBracket=58, RightBracket=59, LeftBrace=60, RightBrace=61;
	public static final int
		RULE_kqueryExpression = 0, RULE_ktranslationUnit = 1, RULE_queryCommand = 2, 
		RULE_queryExpr = 3, RULE_evalExprList = 4, RULE_evalArrayList = 5, RULE_arrayDeclaration = 6, 
		RULE_arrayInitializer = 7, RULE_expression = 8, RULE_bitwiseExpr = 9, 
		RULE_comparisonExpr = 10, RULE_arithmeticExpr = 11, RULE_domain = 12, 
		RULE_rangeLimit = 13, RULE_arrName = 14, RULE_numberList = 15, RULE_number = 16, 
		RULE_floatingPointwidthType = 17, RULE_integerwidthType = 18, RULE_version = 19, 
		RULE_updateList = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"kqueryExpression", "ktranslationUnit", "queryCommand", "queryExpr", 
			"evalExprList", "evalArrayList", "arrayDeclaration", "arrayInitializer", 
			"expression", "bitwiseExpr", "comparisonExpr", "arithmeticExpr", "domain", 
			"rangeLimit", "arrName", "numberList", "number", "floatingPointwidthType", 
			"integerwidthType", "version", "updateList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'query'", "'array'", "':'", "'->'", "'='", "'symbolic'", "'Not'", 
			"'Shl'", "'LShr'", "'AShr'", "'Concat'", "'Extract'", "'ZExt'", "'SExt'", 
			"'Read'", "'Select'", "'Neg'", "'ReadLSB'", "'ReadMSB'", "'And'", "'Or'", 
			"'Xor'", "'Eq'", "'Ne'", "'Ult'", "'Ule'", "'Ugt'", "'Uge'", "'Slt'", 
			"'Sle'", "'Sgt'", "'Sge'", "'Add'", "'Sub'", "'Mul'", "'UDiv'", "'URem'", 
			"'SDiv'", "'SRem'", "','", "'true'", "'false'", "'fp'", "'i'", "'@'", 
			null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
			"'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "SignedConstant", 
			"Constant", "DecConstant", "BinConstant", "OctConstant", "HexConstant", 
			"WidthType", "Identifier", "Digit", "WS", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace"
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
	public String getGrammarFileName() { return "kquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public kqueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class KqueryExpressionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(kqueryParser.EOF, 0); }
		public List<KtranslationUnitContext> ktranslationUnit() {
			return getRuleContexts(KtranslationUnitContext.class);
		}
		public KtranslationUnitContext ktranslationUnit(int i) {
			return getRuleContext(KtranslationUnitContext.class,i);
		}
		public KqueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kqueryExpression; }
	}

	public final KqueryExpressionContext kqueryExpression() throws RecognitionException {
		KqueryExpressionContext _localctx = new KqueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kqueryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==LeftParen) {
				{
				{
				setState(42);
				ktranslationUnit();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(EOF);
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

	public static class KtranslationUnitContext extends ParserRuleContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public QueryCommandContext queryCommand() {
			return getRuleContext(QueryCommandContext.class,0);
		}
		public KtranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ktranslationUnit; }
	}

	public final KtranslationUnitContext ktranslationUnit() throws RecognitionException {
		KtranslationUnitContext _localctx = new KtranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ktranslationUnit);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				arrayDeclaration();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				queryCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class QueryCommandContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(kqueryParser.LeftParen, 0); }
		public EvalExprListContext evalExprList() {
			return getRuleContext(EvalExprListContext.class,0);
		}
		public QueryExprContext queryExpr() {
			return getRuleContext(QueryExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(kqueryParser.RightParen, 0); }
		public QueryCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryCommand; }
	}

	public final QueryCommandContext queryCommand() throws RecognitionException {
		QueryCommandContext _localctx = new QueryCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_queryCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LeftParen);
			setState(55);
			match(T__0);
			setState(56);
			evalExprList();
			setState(57);
			queryExpr();
			setState(58);
			match(RightParen);
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

	public static class QueryExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvalExprListContext evalExprList() {
			return getRuleContext(EvalExprListContext.class,0);
		}
		public EvalArrayListContext evalArrayList() {
			return getRuleContext(EvalArrayListContext.class,0);
		}
		public QueryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryExpr; }
	}

	public final QueryExprContext queryExpr() throws RecognitionException {
		QueryExprContext _localctx = new QueryExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryExpr);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				expression();
				setState(62);
				evalExprList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				expression();
				setState(65);
				evalExprList();
				setState(66);
				evalArrayList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class EvalExprListContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(kqueryParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(kqueryParser.RightBracket, 0); }
		public EvalExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalExprList; }
	}

	public final EvalExprListContext evalExprList() throws RecognitionException {
		EvalExprListContext _localctx = new EvalExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_evalExprList);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(LeftBracket);
				setState(72);
				expression();
				setState(73);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(LeftBracket);
				setState(76);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class EvalArrayListContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(kqueryParser.LeftBracket, 0); }
		public TerminalNode Identifier() { return getToken(kqueryParser.Identifier, 0); }
		public TerminalNode RightBracket() { return getToken(kqueryParser.RightBracket, 0); }
		public EvalArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalArrayList; }
	}

	public final EvalArrayListContext evalArrayList() throws RecognitionException {
		EvalArrayListContext _localctx = new EvalArrayListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_evalArrayList);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(LeftBracket);
				setState(81);
				match(Identifier);
				setState(82);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LeftBracket);
				setState(84);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrNameContext arrName() {
			return getRuleContext(ArrNameContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(kqueryParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(kqueryParser.RightBracket, 0); }
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public RangeLimitContext rangeLimit() {
			return getRuleContext(RangeLimitContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<TerminalNode> Digit() { return getTokens(kqueryParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(kqueryParser.Digit, i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__1);
			setState(89);
			arrName();
			setState(90);
			match(LeftBracket);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Digit) {
				{
				{
				setState(91);
				match(Digit);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(RightBracket);
			setState(98);
			match(T__2);
			setState(99);
			domain();
			setState(100);
			match(T__3);
			setState(101);
			rangeLimit();
			setState(102);
			match(T__4);
			setState(103);
			arrayInitializer();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(kqueryParser.LeftBracket, 0); }
		public NumberListContext numberList() {
			return getRuleContext(NumberListContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(kqueryParser.RightBracket, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayInitializer);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__5);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(LeftBracket);
				setState(107);
				numberList();
				setState(108);
				match(RightBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode Identifier() { return getToken(kqueryParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftParen() { return getToken(kqueryParser.LeftParen, 0); }
		public TerminalNode WidthType() { return getToken(kqueryParser.WidthType, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(kqueryParser.RightParen, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(kqueryParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(kqueryParser.RightBracket, 0); }
		public BitwiseExprContext bitwiseExpr() {
			return getRuleContext(BitwiseExprContext.class,0);
		}
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(Identifier);
				setState(114);
				match(T__2);
				setState(115);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(LeftParen);
				setState(117);
				match(WidthType);
				setState(118);
				number();
				setState(119);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(LeftParen);
				setState(122);
				arithmeticExpr();
				setState(123);
				match(WidthType);
				setState(124);
				expression();
				setState(125);
				expression();
				setState(126);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(LeftParen);
				setState(129);
				match(T__6);
				setState(130);
				match(LeftBracket);
				setState(131);
				match(WidthType);
				setState(132);
				match(RightBracket);
				setState(133);
				expression();
				setState(134);
				match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(LeftParen);
				setState(137);
				bitwiseExpr();
				setState(138);
				match(WidthType);
				setState(139);
				expression();
				setState(140);
				expression();
				setState(141);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				match(LeftParen);
				setState(144);
				match(T__7);
				setState(145);
				match(WidthType);
				setState(146);
				expression();
				setState(147);
				expression();
				setState(148);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				match(LeftParen);
				setState(151);
				match(T__8);
				setState(152);
				match(WidthType);
				setState(153);
				expression();
				setState(154);
				expression();
				setState(155);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
				match(LeftParen);
				setState(158);
				match(T__9);
				setState(159);
				match(WidthType);
				setState(160);
				expression();
				setState(161);
				expression();
				setState(162);
				match(RightParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				match(LeftParen);
				setState(165);
				comparisonExpr();
				{
				setState(166);
				match(WidthType);
				}
				setState(167);
				expression();
				setState(168);
				expression();
				setState(169);
				match(RightParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(171);
				match(LeftParen);
				setState(172);
				match(T__10);
				{
				setState(173);
				match(WidthType);
				}
				setState(174);
				expression();
				setState(175);
				expression();
				setState(176);
				match(RightParen);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(178);
				match(LeftParen);
				setState(179);
				match(T__11);
				setState(180);
				match(WidthType);
				setState(181);
				number();
				setState(182);
				expression();
				setState(183);
				match(RightParen);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(185);
				match(LeftParen);
				setState(186);
				match(T__12);
				setState(187);
				match(WidthType);
				setState(188);
				expression();
				setState(189);
				match(RightParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(191);
				match(LeftParen);
				setState(192);
				match(T__13);
				setState(193);
				match(WidthType);
				setState(194);
				expression();
				setState(195);
				match(RightParen);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(197);
				match(LeftParen);
				setState(198);
				match(T__14);
				setState(199);
				match(WidthType);
				setState(200);
				expression();
				setState(201);
				version();
				setState(202);
				match(RightParen);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(204);
				match(LeftParen);
				setState(205);
				match(T__15);
				setState(206);
				match(WidthType);
				setState(207);
				expression();
				setState(208);
				expression();
				setState(209);
				expression();
				setState(210);
				match(RightParen);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(212);
				match(LeftParen);
				setState(213);
				match(T__16);
				{
				setState(214);
				match(WidthType);
				}
				setState(215);
				expression();
				setState(216);
				match(RightParen);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(218);
				match(LeftParen);
				setState(219);
				match(T__17);
				setState(220);
				match(WidthType);
				setState(221);
				expression();
				setState(222);
				version();
				setState(223);
				match(RightParen);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(225);
				match(LeftParen);
				setState(226);
				match(T__18);
				setState(227);
				match(WidthType);
				setState(228);
				expression();
				setState(229);
				version();
				setState(230);
				match(RightParen);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(232);
				number();
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

	public static class BitwiseExprContext extends ParserRuleContext {
		public BitwiseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseExpr; }
	}

	public final BitwiseExprContext bitwiseExpr() throws RecognitionException {
		BitwiseExprContext _localctx = new BitwiseExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bitwiseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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

	public static class ComparisonExprContext extends ParserRuleContext {
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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

	public static class ArithmeticExprContext extends ParserRuleContext {
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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

	public static class DomainContext extends ParserRuleContext {
		public TerminalNode WidthType() { return getToken(kqueryParser.WidthType, 0); }
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(WidthType);
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

	public static class RangeLimitContext extends ParserRuleContext {
		public TerminalNode WidthType() { return getToken(kqueryParser.WidthType, 0); }
		public RangeLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLimit; }
	}

	public final RangeLimitContext rangeLimit() throws RecognitionException {
		RangeLimitContext _localctx = new RangeLimitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rangeLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(WidthType);
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

	public static class ArrNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(kqueryParser.Identifier, 0); }
		public ArrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrName; }
	}

	public final ArrNameContext arrName() throws RecognitionException {
		ArrNameContext _localctx = new ArrNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(Identifier);
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

	public static class NumberListContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberListContext numberList() {
			return getRuleContext(NumberListContext.class,0);
		}
		public NumberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberList; }
	}

	public final NumberListContext numberList() throws RecognitionException {
		NumberListContext _localctx = new NumberListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numberList);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				number();
				setState(249);
				match(T__39);
				setState(250);
				numberList();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode SignedConstant() { return getToken(kqueryParser.SignedConstant, 0); }
		public TerminalNode Constant() { return getToken(kqueryParser.Constant, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << SignedConstant) | (1L << Constant))) != 0)) ) {
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

	public static class FloatingPointwidthTypeContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(kqueryParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(kqueryParser.Digit, i);
		}
		public FloatingPointwidthTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointwidthType; }
	}

	public final FloatingPointwidthTypeContext floatingPointwidthType() throws RecognitionException {
		FloatingPointwidthTypeContext _localctx = new FloatingPointwidthTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_floatingPointwidthType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__42);
			setState(258); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(257);
					match(Digit);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(260); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << SignedConstant) | (1L << Constant) | (1L << DecConstant) | (1L << BinConstant) | (1L << OctConstant) | (1L << HexConstant) | (1L << WidthType) | (1L << Identifier) | (1L << Digit) | (1L << WS) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace))) != 0)) {
				{
				{
				setState(262);
				matchWildcard();
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(263);
						matchWildcard();
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class IntegerwidthTypeContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(kqueryParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(kqueryParser.Digit, i);
		}
		public IntegerwidthTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerwidthType; }
	}

	public final IntegerwidthTypeContext integerwidthType() throws RecognitionException {
		IntegerwidthTypeContext _localctx = new IntegerwidthTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_integerwidthType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__43);
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				match(Digit);
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Digit );
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(kqueryParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(kqueryParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(kqueryParser.RightBracket, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_version);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(Identifier);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(LeftBracket);
				{
				setState(279);
				updateList();
				}
				setState(280);
				match(RightBracket);
				setState(281);
				match(T__44);
				setState(282);
				version();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UpdateListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public UpdateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateList; }
	}

	public final UpdateListContext updateList() throws RecognitionException {
		UpdateListContext _localctx = new UpdateListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_updateList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			expression();
			setState(287);
			match(T__4);
			setState(288);
			expression();
			{
			setState(289);
			match(T__39);
			setState(290);
			updateList();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ec\n\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00ff\n\21\3\22\3\22\3\23\3\23\6\23\u0105\n\23\r\23\16"+
		"\23\u0106\3\23\3\23\7\23\u010b\n\23\f\23\16\23\u010e\13\23\5\23\u0110"+
		"\n\23\3\24\3\24\6\24\u0114\n\24\r\24\16\24\u0115\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u011f\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\u010c"+
		"\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\4\2\n\f\26\30"+
		"\3\2\31\"\3\2#)\4\2+,\60\61\2\u0135\2/\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2"+
		"\bG\3\2\2\2\nP\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20p\3\2\2\2\22\u00eb\3\2"+
		"\2\2\24\u00ed\3\2\2\2\26\u00ef\3\2\2\2\30\u00f1\3\2\2\2\32\u00f3\3\2\2"+
		"\2\34\u00f5\3\2\2\2\36\u00f7\3\2\2\2 \u00fe\3\2\2\2\"\u0100\3\2\2\2$\u0102"+
		"\3\2\2\2&\u0111\3\2\2\2(\u011e\3\2\2\2*\u0120\3\2\2\2,.\5\4\3\2-,\3\2"+
		"\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63"+
		"\7\2\2\3\63\3\3\2\2\2\64\67\5\16\b\2\65\67\5\6\4\2\66\64\3\2\2\2\66\65"+
		"\3\2\2\2\67\5\3\2\2\289\7:\2\29:\7\3\2\2:;\5\n\6\2;<\5\b\5\2<=\7;\2\2"+
		"=\7\3\2\2\2>H\5\22\n\2?@\5\22\n\2@A\5\n\6\2AH\3\2\2\2BC\5\22\n\2CD\5\n"+
		"\6\2DE\5\f\7\2EH\3\2\2\2FH\3\2\2\2G>\3\2\2\2G?\3\2\2\2GB\3\2\2\2GF\3\2"+
		"\2\2H\t\3\2\2\2IJ\7<\2\2JK\5\22\n\2KL\7=\2\2LQ\3\2\2\2MN\7<\2\2NQ\7=\2"+
		"\2OQ\3\2\2\2PI\3\2\2\2PM\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2RS\7<\2\2ST\7\67"+
		"\2\2TY\7=\2\2UV\7<\2\2VY\7=\2\2WY\3\2\2\2XR\3\2\2\2XU\3\2\2\2XW\3\2\2"+
		"\2Y\r\3\2\2\2Z[\7\4\2\2[\\\5\36\20\2\\`\7<\2\2]_\78\2\2^]\3\2\2\2_b\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7=\2\2de\7\5\2\2ef\5"+
		"\32\16\2fg\7\6\2\2gh\5\34\17\2hi\7\7\2\2ij\5\20\t\2j\17\3\2\2\2kq\7\b"+
		"\2\2lm\7<\2\2mn\5 \21\2no\7=\2\2oq\3\2\2\2pk\3\2\2\2pl\3\2\2\2q\21\3\2"+
		"\2\2r\u00ec\7\67\2\2st\7\67\2\2tu\7\5\2\2u\u00ec\5\22\n\2vw\7:\2\2wx\7"+
		"\66\2\2xy\5\"\22\2yz\7;\2\2z\u00ec\3\2\2\2{|\7:\2\2|}\5\30\r\2}~\7\66"+
		"\2\2~\177\5\22\n\2\177\u0080\5\22\n\2\u0080\u0081\7;\2\2\u0081\u00ec\3"+
		"\2\2\2\u0082\u0083\7:\2\2\u0083\u0084\7\t\2\2\u0084\u0085\7<\2\2\u0085"+
		"\u0086\7\66\2\2\u0086\u0087\7=\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7"+
		";\2\2\u0089\u00ec\3\2\2\2\u008a\u008b\7:\2\2\u008b\u008c\5\24\13\2\u008c"+
		"\u008d\7\66\2\2\u008d\u008e\5\22\n\2\u008e\u008f\5\22\n\2\u008f\u0090"+
		"\7;\2\2\u0090\u00ec\3\2\2\2\u0091\u0092\7:\2\2\u0092\u0093\7\n\2\2\u0093"+
		"\u0094\7\66\2\2\u0094\u0095\5\22\n\2\u0095\u0096\5\22\n\2\u0096\u0097"+
		"\7;\2\2\u0097\u00ec\3\2\2\2\u0098\u0099\7:\2\2\u0099\u009a\7\13\2\2\u009a"+
		"\u009b\7\66\2\2\u009b\u009c\5\22\n\2\u009c\u009d\5\22\n\2\u009d\u009e"+
		"\7;\2\2\u009e\u00ec\3\2\2\2\u009f\u00a0\7:\2\2\u00a0\u00a1\7\f\2\2\u00a1"+
		"\u00a2\7\66\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5"+
		"\7;\2\2\u00a5\u00ec\3\2\2\2\u00a6\u00a7\7:\2\2\u00a7\u00a8\5\26\f\2\u00a8"+
		"\u00a9\7\66\2\2\u00a9\u00aa\5\22\n\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac"+
		"\7;\2\2\u00ac\u00ec\3\2\2\2\u00ad\u00ae\7:\2\2\u00ae\u00af\7\r\2\2\u00af"+
		"\u00b0\7\66\2\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3"+
		"\7;\2\2\u00b3\u00ec\3\2\2\2\u00b4\u00b5\7:\2\2\u00b5\u00b6\7\16\2\2\u00b6"+
		"\u00b7\7\66\2\2\u00b7\u00b8\5\"\22\2\u00b8\u00b9\5\22\n\2\u00b9\u00ba"+
		"\7;\2\2\u00ba\u00ec\3\2\2\2\u00bb\u00bc\7:\2\2\u00bc\u00bd\7\17\2\2\u00bd"+
		"\u00be\7\66\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\7;\2\2\u00c0\u00ec\3"+
		"\2\2\2\u00c1\u00c2\7:\2\2\u00c2\u00c3\7\20\2\2\u00c3\u00c4\7\66\2\2\u00c4"+
		"\u00c5\5\22\n\2\u00c5\u00c6\7;\2\2\u00c6\u00ec\3\2\2\2\u00c7\u00c8\7:"+
		"\2\2\u00c8\u00c9\7\21\2\2\u00c9\u00ca\7\66\2\2\u00ca\u00cb\5\22\n\2\u00cb"+
		"\u00cc\5(\25\2\u00cc\u00cd\7;\2\2\u00cd\u00ec\3\2\2\2\u00ce\u00cf\7:\2"+
		"\2\u00cf\u00d0\7\22\2\2\u00d0\u00d1\7\66\2\2\u00d1\u00d2\5\22\n\2\u00d2"+
		"\u00d3\5\22\n\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\7;\2\2\u00d5\u00ec\3"+
		"\2\2\2\u00d6\u00d7\7:\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\7\66\2\2\u00d9"+
		"\u00da\5\22\n\2\u00da\u00db\7;\2\2\u00db\u00ec\3\2\2\2\u00dc\u00dd\7:"+
		"\2\2\u00dd\u00de\7\24\2\2\u00de\u00df\7\66\2\2\u00df\u00e0\5\22\n\2\u00e0"+
		"\u00e1\5(\25\2\u00e1\u00e2\7;\2\2\u00e2\u00ec\3\2\2\2\u00e3\u00e4\7:\2"+
		"\2\u00e4\u00e5\7\25\2\2\u00e5\u00e6\7\66\2\2\u00e6\u00e7\5\22\n\2\u00e7"+
		"\u00e8\5(\25\2\u00e8\u00e9\7;\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\5\""+
		"\22\2\u00ebr\3\2\2\2\u00ebs\3\2\2\2\u00ebv\3\2\2\2\u00eb{\3\2\2\2\u00eb"+
		"\u0082\3\2\2\2\u00eb\u008a\3\2\2\2\u00eb\u0091\3\2\2\2\u00eb\u0098\3\2"+
		"\2\2\u00eb\u009f\3\2\2\2\u00eb\u00a6\3\2\2\2\u00eb\u00ad\3\2\2\2\u00eb"+
		"\u00b4\3\2\2\2\u00eb\u00bb\3\2\2\2\u00eb\u00c1\3\2\2\2\u00eb\u00c7\3\2"+
		"\2\2\u00eb\u00ce\3\2\2\2\u00eb\u00d6\3\2\2\2\u00eb\u00dc\3\2\2\2\u00eb"+
		"\u00e3\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\23\3\2\2\2\u00ed\u00ee\t\2\2"+
		"\2\u00ee\25\3\2\2\2\u00ef\u00f0\t\3\2\2\u00f0\27\3\2\2\2\u00f1\u00f2\t"+
		"\4\2\2\u00f2\31\3\2\2\2\u00f3\u00f4\7\66\2\2\u00f4\33\3\2\2\2\u00f5\u00f6"+
		"\7\66\2\2\u00f6\35\3\2\2\2\u00f7\u00f8\7\67\2\2\u00f8\37\3\2\2\2\u00f9"+
		"\u00ff\5\"\22\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7*\2\2\u00fc\u00fd\5"+
		" \21\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff"+
		"!\3\2\2\2\u0100\u0101\t\5\2\2\u0101#\3\2\2\2\u0102\u0104\7-\2\2\u0103"+
		"\u0105\78\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u010f\3\2\2\2\u0108\u010c\13\2\2\2\u0109"+
		"\u010b\13\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010d\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0108\3\2\2\2\u010f\u0110\3\2\2\2\u0110%\3\2\2\2\u0111\u0113\7.\2\2\u0112"+
		"\u0114\78\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\'\3\2\2\2\u0117\u011f\7\67\2\2\u0118\u0119"+
		"\7<\2\2\u0119\u011a\5*\26\2\u011a\u011b\7=\2\2\u011b\u011c\7/\2\2\u011c"+
		"\u011d\5(\25\2\u011d\u011f\3\2\2\2\u011e\u0117\3\2\2\2\u011e\u0118\3\2"+
		"\2\2\u011f)\3\2\2\2\u0120\u0121\5\22\n\2\u0121\u0122\7\7\2\2\u0122\u0123"+
		"\5\22\n\2\u0123\u0124\7*\2\2\u0124\u0125\5*\26\2\u0125+\3\2\2\2\20/\66"+
		"GPX`p\u00eb\u00fe\u0106\u010c\u010f\u0115\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}