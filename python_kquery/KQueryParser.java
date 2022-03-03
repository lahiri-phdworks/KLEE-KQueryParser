// Generated from KQuery.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SignedConstant=1, Constant=2, BinConstant=3, OctConstant=4, HexConstant=5, 
		FloatingPointType=6, IntegerType=7, WidthType=8, BinId=9, OctId=10, WIDTH=11, 
		HexId=12, TrueMatch=13, FalseMatch=14, Query=15, Array=16, Symbolic=17, 
		Colon=18, Arrow=19, Equal=20, COMMA=21, NOT=22, SHL=23, LSHR=24, ASHR=25, 
		CONCAT=26, EXTRACT=27, ZEXT=28, SEXT=29, READ=30, SELECT=31, NEGETION=32, 
		READLSB=33, READMSB=34, PLUS=35, MINUS=36, INT=37, ATR=38, FP=39, BITWISEAND=40, 
		BITWISEOR=41, BITWISEXOR=42, EQ=43, NEQ=44, ULT=45, ULE=46, UGT=47, UGE=48, 
		SLT=49, SLE=50, SGT=51, SGE=52, ADD=53, SUB=54, MUL=55, UDIV=56, UREM=57, 
		SDIV=58, SREM=59, BIN_DIGIT=60, OCTAL_DIGIT=61, HEX_DIGIT=62, Identifier=63, 
		Whitespace=64, Newline=65, BlockComment=66, LineComment=67, LeftParen=68, 
		RightParen=69, LeftBracket=70, RightBracket=71, LeftBrace=72, RightBrace=73;
	public static final int
		RULE_kqueryExpression = 0, RULE_ktranslationUnit = 1, RULE_queryCommand = 2, 
		RULE_queryExpr = 3, RULE_evalExprList = 4, RULE_evalArrayList = 5, RULE_arrayDeclaration = 6, 
		RULE_arrayElemsStub = 7, RULE_arrayInitializer = 8, RULE_expression = 9, 
		RULE_version = 10, RULE_updateList = 11, RULE_bitwiseExpr = 12, RULE_comparisonExpr = 13, 
		RULE_arithmeticExpr = 14, RULE_domain = 15, RULE_rangeLimit = 16, RULE_arrName = 17, 
		RULE_numberList = 18, RULE_number = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"kqueryExpression", "ktranslationUnit", "queryCommand", "queryExpr", 
			"evalExprList", "evalArrayList", "arrayDeclaration", "arrayElemsStub", 
			"arrayInitializer", "expression", "version", "updateList", "bitwiseExpr", 
			"comparisonExpr", "arithmeticExpr", "domain", "rangeLimit", "arrName", 
			"numberList", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'0b'", "'0o'", 
			"'w'", "'0x'", "'true'", "'false'", "'query'", "'array'", "'symbolic'", 
			"':'", "'->'", "'='", "','", "'Not'", "'Shl'", "'LShr'", "'AShr'", "'Concat'", 
			"'Extract'", "'ZExt'", "'SExt'", "'Read'", "'Select'", "'Neg'", "'ReadLSB'", 
			"'ReadMSB'", "'+'", "'-'", "'i'", "'@'", "'fp'", "'And'", "'Or'", "'Xor'", 
			"'Eq'", "'Ne'", "'Ult'", "'Ule'", "'Ugt'", "'Uge'", "'Slt'", "'Sle'", 
			"'Sgt'", "'Sge'", "'Add'", "'Sub'", "'Mul'", "'UDiv'", "'URem'", "'SDiv'", 
			"'SRem'", null, null, null, null, null, null, null, null, "'('", "')'", 
			"'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SignedConstant", "Constant", "BinConstant", "OctConstant", "HexConstant", 
			"FloatingPointType", "IntegerType", "WidthType", "BinId", "OctId", "WIDTH", 
			"HexId", "TrueMatch", "FalseMatch", "Query", "Array", "Symbolic", "Colon", 
			"Arrow", "Equal", "COMMA", "NOT", "SHL", "LSHR", "ASHR", "CONCAT", "EXTRACT", 
			"ZEXT", "SEXT", "READ", "SELECT", "NEGETION", "READLSB", "READMSB", "PLUS", 
			"MINUS", "INT", "ATR", "FP", "BITWISEAND", "BITWISEOR", "BITWISEXOR", 
			"EQ", "NEQ", "ULT", "ULE", "UGT", "UGE", "SLT", "SLE", "SGT", "SGE", 
			"ADD", "SUB", "MUL", "UDIV", "UREM", "SDIV", "SREM", "BIN_DIGIT", "OCTAL_DIGIT", 
			"HEX_DIGIT", "Identifier", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace"
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
	public String getGrammarFileName() { return "KQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class KqueryExpressionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KQueryParser.EOF, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterKqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitKqueryExpression(this);
		}
	}

	public final KqueryExpressionContext kqueryExpression() throws RecognitionException {
		KqueryExpressionContext _localctx = new KqueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kqueryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array || _la==LeftParen) {
				{
				{
				setState(40);
				ktranslationUnit();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterKtranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitKtranslationUnit(this);
		}
	}

	public final KtranslationUnitContext ktranslationUnit() throws RecognitionException {
		KtranslationUnitContext _localctx = new KtranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ktranslationUnit);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				arrayDeclaration();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
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
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public TerminalNode Query() { return getToken(KQueryParser.Query, 0); }
		public EvalExprListContext evalExprList() {
			return getRuleContext(EvalExprListContext.class,0);
		}
		public QueryExprContext queryExpr() {
			return getRuleContext(QueryExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public QueryCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterQueryCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitQueryCommand(this);
		}
	}

	public final QueryCommandContext queryCommand() throws RecognitionException {
		QueryCommandContext _localctx = new QueryCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_queryCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LeftParen);
			setState(53);
			match(Query);
			setState(54);
			evalExprList();
			setState(55);
			queryExpr();
			setState(56);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterQueryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitQueryExpr(this);
		}
	}

	public final QueryExprContext queryExpr() throws RecognitionException {
		QueryExprContext _localctx = new QueryExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryExpr);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				expression();
				setState(60);
				evalExprList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				expression();
				setState(63);
				evalExprList();
				setState(64);
				evalArrayList();
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
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EvalExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterEvalExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitEvalExprList(this);
		}
	}

	public final EvalExprListContext evalExprList() throws RecognitionException {
		EvalExprListContext _localctx = new EvalExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_evalExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(LeftBracket);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SignedConstant) | (1L << Constant) | (1L << TrueMatch) | (1L << FalseMatch) | (1L << Identifier))) != 0) || _la==LeftParen || _la==LeftBracket) {
				{
				{
				setState(69);
				expression();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(RightBracket);
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
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public List<TerminalNode> Identifier() { return getTokens(KQueryParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KQueryParser.Identifier, i);
		}
		public EvalArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalArrayList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterEvalArrayList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitEvalArrayList(this);
		}
	}

	public final EvalArrayListContext evalArrayList() throws RecognitionException {
		EvalArrayListContext _localctx = new EvalArrayListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_evalArrayList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LeftBracket);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(78);
				match(Identifier);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(RightBracket);
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
		public TerminalNode Array() { return getToken(KQueryParser.Array, 0); }
		public ArrNameContext arrName() {
			return getRuleContext(ArrNameContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public ArrayElemsStubContext arrayElemsStub() {
			return getRuleContext(ArrayElemsStubContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public TerminalNode Colon() { return getToken(KQueryParser.Colon, 0); }
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(KQueryParser.Arrow, 0); }
		public RangeLimitContext rangeLimit() {
			return getRuleContext(RangeLimitContext.class,0);
		}
		public TerminalNode Equal() { return getToken(KQueryParser.Equal, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitArrayDeclaration(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Array);
			setState(87);
			arrName();
			setState(88);
			match(LeftBracket);
			setState(89);
			arrayElemsStub();
			setState(90);
			match(RightBracket);
			setState(91);
			match(Colon);
			setState(92);
			domain();
			setState(93);
			match(Arrow);
			setState(94);
			rangeLimit();
			setState(95);
			match(Equal);
			setState(96);
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

	public static class ArrayElemsStubContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(KQueryParser.Constant, 0); }
		public ArrayElemsStubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElemsStub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterArrayElemsStub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitArrayElemsStub(this);
		}
	}

	public final ArrayElemsStubContext arrayElemsStub() throws RecognitionException {
		ArrayElemsStubContext _localctx = new ArrayElemsStubContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayElemsStub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(Constant);
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
		public TerminalNode Symbolic() { return getToken(KQueryParser.Symbolic, 0); }
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public NumberListContext numberList() {
			return getRuleContext(NumberListContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayInitializer);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Symbolic:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(Symbolic);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(LeftBracket);
				setState(102);
				numberList();
				setState(103);
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
		public TerminalNode Identifier() { return getToken(KQueryParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(KQueryParser.Colon, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public TerminalNode WidthType() { return getToken(KQueryParser.WidthType, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(KQueryParser.NOT, 0); }
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public BitwiseExprContext bitwiseExpr() {
			return getRuleContext(BitwiseExprContext.class,0);
		}
		public TerminalNode SHL() { return getToken(KQueryParser.SHL, 0); }
		public TerminalNode LSHR() { return getToken(KQueryParser.LSHR, 0); }
		public TerminalNode ASHR() { return getToken(KQueryParser.ASHR, 0); }
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public TerminalNode CONCAT() { return getToken(KQueryParser.CONCAT, 0); }
		public TerminalNode EXTRACT() { return getToken(KQueryParser.EXTRACT, 0); }
		public TerminalNode ZEXT() { return getToken(KQueryParser.ZEXT, 0); }
		public TerminalNode SEXT() { return getToken(KQueryParser.SEXT, 0); }
		public TerminalNode READ() { return getToken(KQueryParser.READ, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(KQueryParser.SELECT, 0); }
		public TerminalNode NEGETION() { return getToken(KQueryParser.NEGETION, 0); }
		public TerminalNode READLSB() { return getToken(KQueryParser.READLSB, 0); }
		public TerminalNode READMSB() { return getToken(KQueryParser.READMSB, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(Identifier);
				setState(109);
				match(Colon);
				setState(110);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(LeftParen);
				setState(112);
				match(WidthType);
				setState(113);
				number();
				setState(114);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(LeftParen);
				setState(117);
				arithmeticExpr();
				setState(118);
				match(WidthType);
				setState(119);
				expression();
				setState(120);
				expression();
				setState(121);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(LeftParen);
				setState(124);
				match(NOT);
				setState(125);
				match(LeftBracket);
				setState(126);
				match(WidthType);
				setState(127);
				match(RightBracket);
				setState(128);
				expression();
				setState(129);
				match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				match(LeftParen);
				setState(132);
				bitwiseExpr();
				setState(133);
				match(WidthType);
				setState(134);
				expression();
				setState(135);
				expression();
				setState(136);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				match(LeftParen);
				setState(139);
				match(SHL);
				setState(140);
				match(WidthType);
				setState(141);
				expression();
				setState(142);
				expression();
				setState(143);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				match(LeftParen);
				setState(146);
				match(LSHR);
				setState(147);
				match(WidthType);
				setState(148);
				expression();
				setState(149);
				expression();
				setState(150);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				match(LeftParen);
				setState(153);
				match(ASHR);
				setState(154);
				match(WidthType);
				setState(155);
				expression();
				setState(156);
				expression();
				setState(157);
				match(RightParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(159);
				match(LeftParen);
				setState(160);
				comparisonExpr();
				setState(161);
				match(WidthType);
				setState(162);
				expression();
				setState(163);
				expression();
				setState(164);
				match(RightParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(166);
				match(LeftParen);
				setState(167);
				comparisonExpr();
				setState(168);
				expression();
				setState(169);
				expression();
				setState(170);
				match(RightParen);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(172);
				match(LeftParen);
				setState(173);
				match(CONCAT);
				setState(174);
				match(WidthType);
				setState(175);
				expression();
				setState(176);
				expression();
				setState(177);
				match(RightParen);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(179);
				match(LeftParen);
				setState(180);
				match(CONCAT);
				setState(181);
				expression();
				setState(182);
				expression();
				setState(183);
				match(RightParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(185);
				match(LeftParen);
				setState(186);
				match(EXTRACT);
				setState(187);
				match(WidthType);
				setState(188);
				number();
				setState(189);
				expression();
				setState(190);
				match(RightParen);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(192);
				match(LeftParen);
				setState(193);
				match(ZEXT);
				setState(194);
				match(WidthType);
				setState(195);
				expression();
				setState(196);
				match(RightParen);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(198);
				match(LeftParen);
				setState(199);
				match(SEXT);
				setState(200);
				match(WidthType);
				setState(201);
				expression();
				setState(202);
				match(RightParen);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(204);
				match(LeftParen);
				setState(205);
				match(READ);
				setState(206);
				match(WidthType);
				setState(207);
				expression();
				setState(208);
				version();
				setState(209);
				match(RightParen);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(211);
				match(LeftParen);
				setState(212);
				match(READ);
				setState(213);
				match(WidthType);
				setState(214);
				expression();
				setState(215);
				match(RightParen);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(217);
				match(LeftParen);
				setState(218);
				match(SELECT);
				setState(219);
				match(WidthType);
				setState(220);
				expression();
				setState(221);
				expression();
				setState(222);
				expression();
				setState(223);
				match(RightParen);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(225);
				match(LeftParen);
				setState(226);
				match(NEGETION);
				setState(227);
				match(WidthType);
				setState(228);
				expression();
				setState(229);
				match(RightParen);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(231);
				match(LeftParen);
				setState(232);
				match(NEGETION);
				setState(233);
				expression();
				setState(234);
				match(RightParen);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(236);
				match(LeftParen);
				setState(237);
				match(READLSB);
				setState(238);
				match(WidthType);
				setState(239);
				expression();
				setState(240);
				version();
				setState(241);
				match(RightParen);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(243);
				match(LeftParen);
				setState(244);
				match(READMSB);
				setState(245);
				match(WidthType);
				setState(246);
				expression();
				setState(247);
				version();
				setState(248);
				match(RightParen);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(250);
				match(LeftParen);
				setState(251);
				match(READLSB);
				setState(252);
				match(WidthType);
				setState(253);
				expression();
				setState(254);
				match(RightParen);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(256);
				match(LeftParen);
				setState(257);
				match(READMSB);
				setState(258);
				match(WidthType);
				setState(259);
				expression();
				setState(260);
				match(RightParen);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(262);
				version();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(263);
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KQueryParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(KQueryParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public TerminalNode ATR() { return getToken(KQueryParser.ATR, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitVersion(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_version);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(Identifier);
				setState(268);
				match(Colon);
				setState(269);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(LeftBracket);
				setState(271);
				updateList();
				setState(272);
				match(RightBracket);
				setState(273);
				match(ATR);
				setState(274);
				version();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(LeftBracket);
				setState(277);
				match(RightBracket);
				setState(278);
				match(ATR);
				setState(279);
				version();
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

	public static class UpdateListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(KQueryParser.Equal, 0); }
		public TerminalNode COMMA() { return getToken(KQueryParser.COMMA, 0); }
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public UpdateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterUpdateList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitUpdateList(this);
		}
	}

	public final UpdateListContext updateList() throws RecognitionException {
		UpdateListContext _localctx = new UpdateListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_updateList);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				expression();
				setState(283);
				match(Equal);
				setState(284);
				expression();
				setState(285);
				match(COMMA);
				setState(286);
				updateList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				expression();
				setState(289);
				match(Equal);
				setState(290);
				expression();
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
		public TerminalNode BITWISEAND() { return getToken(KQueryParser.BITWISEAND, 0); }
		public TerminalNode BITWISEOR() { return getToken(KQueryParser.BITWISEOR, 0); }
		public TerminalNode BITWISEXOR() { return getToken(KQueryParser.BITWISEXOR, 0); }
		public TerminalNode SHL() { return getToken(KQueryParser.SHL, 0); }
		public TerminalNode LSHR() { return getToken(KQueryParser.LSHR, 0); }
		public TerminalNode ASHR() { return getToken(KQueryParser.ASHR, 0); }
		public BitwiseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterBitwiseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitBitwiseExpr(this);
		}
	}

	public final BitwiseExprContext bitwiseExpr() throws RecognitionException {
		BitwiseExprContext _localctx = new BitwiseExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bitwiseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHL) | (1L << LSHR) | (1L << ASHR) | (1L << BITWISEAND) | (1L << BITWISEOR) | (1L << BITWISEXOR))) != 0)) ) {
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
		public TerminalNode EQ() { return getToken(KQueryParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(KQueryParser.NEQ, 0); }
		public TerminalNode ULT() { return getToken(KQueryParser.ULT, 0); }
		public TerminalNode UGT() { return getToken(KQueryParser.UGT, 0); }
		public TerminalNode ULE() { return getToken(KQueryParser.ULE, 0); }
		public TerminalNode UGE() { return getToken(KQueryParser.UGE, 0); }
		public TerminalNode SLT() { return getToken(KQueryParser.SLT, 0); }
		public TerminalNode SLE() { return getToken(KQueryParser.SLE, 0); }
		public TerminalNode SGT() { return getToken(KQueryParser.SGT, 0); }
		public TerminalNode SGE() { return getToken(KQueryParser.SGE, 0); }
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitComparisonExpr(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << ULT) | (1L << ULE) | (1L << UGT) | (1L << UGE) | (1L << SLT) | (1L << SLE) | (1L << SGT) | (1L << SGE))) != 0)) ) {
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
		public TerminalNode ADD() { return getToken(KQueryParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KQueryParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(KQueryParser.MUL, 0); }
		public TerminalNode UDIV() { return getToken(KQueryParser.UDIV, 0); }
		public TerminalNode UREM() { return getToken(KQueryParser.UREM, 0); }
		public TerminalNode SDIV() { return getToken(KQueryParser.SDIV, 0); }
		public TerminalNode SREM() { return getToken(KQueryParser.SREM, 0); }
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitArithmeticExpr(this);
		}
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << UDIV) | (1L << UREM) | (1L << SDIV) | (1L << SREM))) != 0)) ) {
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
		public TerminalNode WidthType() { return getToken(KQueryParser.WidthType, 0); }
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitDomain(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		public TerminalNode WidthType() { return getToken(KQueryParser.WidthType, 0); }
		public RangeLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLimit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterRangeLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitRangeLimit(this);
		}
	}

	public final RangeLimitContext rangeLimit() throws RecognitionException {
		RangeLimitContext _localctx = new RangeLimitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rangeLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		public TerminalNode Identifier() { return getToken(KQueryParser.Identifier, 0); }
		public ArrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterArrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitArrName(this);
		}
	}

	public final ArrNameContext arrName() throws RecognitionException {
		ArrNameContext _localctx = new ArrNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNumberList(this);
		}
	}

	public final NumberListContext numberList() throws RecognitionException {
		NumberListContext _localctx = new NumberListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numberList);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				number();
				setState(308);
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
		public TerminalNode TrueMatch() { return getToken(KQueryParser.TrueMatch, 0); }
		public TerminalNode FalseMatch() { return getToken(KQueryParser.FalseMatch, 0); }
		public TerminalNode SignedConstant() { return getToken(KQueryParser.SignedConstant, 0); }
		public TerminalNode Constant() { return getToken(KQueryParser.Constant, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SignedConstant) | (1L << Constant) | (1L << TrueMatch) | (1L << FalseMatch))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5E\n\5\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\6\3\6\3\7\3\7\7\7R\n\7\f"+
		"\7\16\7U\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u010b\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011b\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0127\n\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24"+
		"\u0139\n\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\6\4\2\31\33*,\3\2-\66\3\2\67=\4\2\3\4\17\20\2\u014e\2-\3\2"+
		"\2\2\4\64\3\2\2\2\6\66\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fO\3\2\2\2\16X\3"+
		"\2\2\2\20d\3\2\2\2\22k\3\2\2\2\24\u010a\3\2\2\2\26\u011a\3\2\2\2\30\u0126"+
		"\3\2\2\2\32\u0128\3\2\2\2\34\u012a\3\2\2\2\36\u012c\3\2\2\2 \u012e\3\2"+
		"\2\2\"\u0130\3\2\2\2$\u0132\3\2\2\2&\u0138\3\2\2\2(\u013a\3\2\2\2*,\5"+
		"\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60"+
		"\61\7\2\2\3\61\3\3\2\2\2\62\65\5\16\b\2\63\65\5\6\4\2\64\62\3\2\2\2\64"+
		"\63\3\2\2\2\65\5\3\2\2\2\66\67\7F\2\2\678\7\21\2\289\5\n\6\29:\5\b\5\2"+
		":;\7G\2\2;\7\3\2\2\2<E\5\24\13\2=>\5\24\13\2>?\5\n\6\2?E\3\2\2\2@A\5\24"+
		"\13\2AB\5\n\6\2BC\5\f\7\2CE\3\2\2\2D<\3\2\2\2D=\3\2\2\2D@\3\2\2\2E\t\3"+
		"\2\2\2FJ\7H\2\2GI\5\24\13\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM"+
		"\3\2\2\2LJ\3\2\2\2MN\7I\2\2N\13\3\2\2\2OS\7H\2\2PR\7A\2\2QP\3\2\2\2RU"+
		"\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7I\2\2W\r\3\2\2\2X"+
		"Y\7\22\2\2YZ\5$\23\2Z[\7H\2\2[\\\5\20\t\2\\]\7I\2\2]^\7\24\2\2^_\5 \21"+
		"\2_`\7\25\2\2`a\5\"\22\2ab\7\26\2\2bc\5\22\n\2c\17\3\2\2\2de\7\4\2\2e"+
		"\21\3\2\2\2fl\7\23\2\2gh\7H\2\2hi\5&\24\2ij\7I\2\2jl\3\2\2\2kf\3\2\2\2"+
		"kg\3\2\2\2l\23\3\2\2\2m\u010b\7A\2\2no\7A\2\2op\7\24\2\2p\u010b\5\24\13"+
		"\2qr\7F\2\2rs\7\n\2\2st\5(\25\2tu\7G\2\2u\u010b\3\2\2\2vw\7F\2\2wx\5\36"+
		"\20\2xy\7\n\2\2yz\5\24\13\2z{\5\24\13\2{|\7G\2\2|\u010b\3\2\2\2}~\7F\2"+
		"\2~\177\7\30\2\2\177\u0080\7H\2\2\u0080\u0081\7\n\2\2\u0081\u0082\7I\2"+
		"\2\u0082\u0083\5\24\13\2\u0083\u0084\7G\2\2\u0084\u010b\3\2\2\2\u0085"+
		"\u0086\7F\2\2\u0086\u0087\5\32\16\2\u0087\u0088\7\n\2\2\u0088\u0089\5"+
		"\24\13\2\u0089\u008a\5\24\13\2\u008a\u008b\7G\2\2\u008b\u010b\3\2\2\2"+
		"\u008c\u008d\7F\2\2\u008d\u008e\7\31\2\2\u008e\u008f\7\n\2\2\u008f\u0090"+
		"\5\24\13\2\u0090\u0091\5\24\13\2\u0091\u0092\7G\2\2\u0092\u010b\3\2\2"+
		"\2\u0093\u0094\7F\2\2\u0094\u0095\7\32\2\2\u0095\u0096\7\n\2\2\u0096\u0097"+
		"\5\24\13\2\u0097\u0098\5\24\13\2\u0098\u0099\7G\2\2\u0099\u010b\3\2\2"+
		"\2\u009a\u009b\7F\2\2\u009b\u009c\7\33\2\2\u009c\u009d\7\n\2\2\u009d\u009e"+
		"\5\24\13\2\u009e\u009f\5\24\13\2\u009f\u00a0\7G\2\2\u00a0\u010b\3\2\2"+
		"\2\u00a1\u00a2\7F\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\7\n\2\2\u00a4"+
		"\u00a5\5\24\13\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\7G\2\2\u00a7\u010b"+
		"\3\2\2\2\u00a8\u00a9\7F\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\5\24\13"+
		"\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\7G\2\2\u00ad\u010b\3\2\2\2\u00ae"+
		"\u00af\7F\2\2\u00af\u00b0\7\34\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\5\24"+
		"\13\2\u00b2\u00b3\5\24\13\2\u00b3\u00b4\7G\2\2\u00b4\u010b\3\2\2\2\u00b5"+
		"\u00b6\7F\2\2\u00b6\u00b7\7\34\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\5"+
		"\24\13\2\u00b9\u00ba\7G\2\2\u00ba\u010b\3\2\2\2\u00bb\u00bc\7F\2\2\u00bc"+
		"\u00bd\7\35\2\2\u00bd\u00be\7\n\2\2\u00be\u00bf\5(\25\2\u00bf\u00c0\5"+
		"\24\13\2\u00c0\u00c1\7G\2\2\u00c1\u010b\3\2\2\2\u00c2\u00c3\7F\2\2\u00c3"+
		"\u00c4\7\36\2\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\5\24\13\2\u00c6\u00c7"+
		"\7G\2\2\u00c7\u010b\3\2\2\2\u00c8\u00c9\7F\2\2\u00c9\u00ca\7\37\2\2\u00ca"+
		"\u00cb\7\n\2\2\u00cb\u00cc\5\24\13\2\u00cc\u00cd\7G\2\2\u00cd\u010b\3"+
		"\2\2\2\u00ce\u00cf\7F\2\2\u00cf\u00d0\7 \2\2\u00d0\u00d1\7\n\2\2\u00d1"+
		"\u00d2\5\24\13\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4\7G\2\2\u00d4\u010b\3"+
		"\2\2\2\u00d5\u00d6\7F\2\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\7\n\2\2\u00d8"+
		"\u00d9\5\24\13\2\u00d9\u00da\7G\2\2\u00da\u010b\3\2\2\2\u00db\u00dc\7"+
		"F\2\2\u00dc\u00dd\7!\2\2\u00dd\u00de\7\n\2\2\u00de\u00df\5\24\13\2\u00df"+
		"\u00e0\5\24\13\2\u00e0\u00e1\5\24\13\2\u00e1\u00e2\7G\2\2\u00e2\u010b"+
		"\3\2\2\2\u00e3\u00e4\7F\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\7\n\2\2\u00e6"+
		"\u00e7\5\24\13\2\u00e7\u00e8\7G\2\2\u00e8\u010b\3\2\2\2\u00e9\u00ea\7"+
		"F\2\2\u00ea\u00eb\7\"\2\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed\7G\2\2\u00ed"+
		"\u010b\3\2\2\2\u00ee\u00ef\7F\2\2\u00ef\u00f0\7#\2\2\u00f0\u00f1\7\n\2"+
		"\2\u00f1\u00f2\5\24\13\2\u00f2\u00f3\5\26\f\2\u00f3\u00f4\7G\2\2\u00f4"+
		"\u010b\3\2\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f7\7$\2\2\u00f7\u00f8\7\n\2"+
		"\2\u00f8\u00f9\5\24\13\2\u00f9\u00fa\5\26\f\2\u00fa\u00fb\7G\2\2\u00fb"+
		"\u010b\3\2\2\2\u00fc\u00fd\7F\2\2\u00fd\u00fe\7#\2\2\u00fe\u00ff\7\n\2"+
		"\2\u00ff\u0100\5\24\13\2\u0100\u0101\7G\2\2\u0101\u010b\3\2\2\2\u0102"+
		"\u0103\7F\2\2\u0103\u0104\7$\2\2\u0104\u0105\7\n\2\2\u0105\u0106\5\24"+
		"\13\2\u0106\u0107\7G\2\2\u0107\u010b\3\2\2\2\u0108\u010b\5\26\f\2\u0109"+
		"\u010b\5(\25\2\u010am\3\2\2\2\u010an\3\2\2\2\u010aq\3\2\2\2\u010av\3\2"+
		"\2\2\u010a}\3\2\2\2\u010a\u0085\3\2\2\2\u010a\u008c\3\2\2\2\u010a\u0093"+
		"\3\2\2\2\u010a\u009a\3\2\2\2\u010a\u00a1\3\2\2\2\u010a\u00a8\3\2\2\2\u010a"+
		"\u00ae\3\2\2\2\u010a\u00b5\3\2\2\2\u010a\u00bb\3\2\2\2\u010a\u00c2\3\2"+
		"\2\2\u010a\u00c8\3\2\2\2\u010a\u00ce\3\2\2\2\u010a\u00d5\3\2\2\2\u010a"+
		"\u00db\3\2\2\2\u010a\u00e3\3\2\2\2\u010a\u00e9\3\2\2\2\u010a\u00ee\3\2"+
		"\2\2\u010a\u00f5\3\2\2\2\u010a\u00fc\3\2\2\2\u010a\u0102\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\25\3\2\2\2\u010c\u011b\7A\2\2"+
		"\u010d\u010e\7A\2\2\u010e\u010f\7\24\2\2\u010f\u011b\5\24\13\2\u0110\u0111"+
		"\7H\2\2\u0111\u0112\5\30\r\2\u0112\u0113\7I\2\2\u0113\u0114\7(\2\2\u0114"+
		"\u0115\5\26\f\2\u0115\u011b\3\2\2\2\u0116\u0117\7H\2\2\u0117\u0118\7I"+
		"\2\2\u0118\u0119\7(\2\2\u0119\u011b\5\26\f\2\u011a\u010c\3\2\2\2\u011a"+
		"\u010d\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0116\3\2\2\2\u011b\27\3\2\2"+
		"\2\u011c\u011d\5\24\13\2\u011d\u011e\7\26\2\2\u011e\u011f\5\24\13\2\u011f"+
		"\u0120\7\27\2\2\u0120\u0121\5\30\r\2\u0121\u0127\3\2\2\2\u0122\u0123\5"+
		"\24\13\2\u0123\u0124\7\26\2\2\u0124\u0125\5\24\13\2\u0125\u0127\3\2\2"+
		"\2\u0126\u011c\3\2\2\2\u0126\u0122\3\2\2\2\u0127\31\3\2\2\2\u0128\u0129"+
		"\t\2\2\2\u0129\33\3\2\2\2\u012a\u012b\t\3\2\2\u012b\35\3\2\2\2\u012c\u012d"+
		"\t\4\2\2\u012d\37\3\2\2\2\u012e\u012f\7\n\2\2\u012f!\3\2\2\2\u0130\u0131"+
		"\7\n\2\2\u0131#\3\2\2\2\u0132\u0133\7A\2\2\u0133%\3\2\2\2\u0134\u0139"+
		"\5(\25\2\u0135\u0136\5(\25\2\u0136\u0137\5&\24\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0139\'\3\2\2\2\u013a\u013b\t\5\2\2"+
		"\u013b)\3\2\2\2\f-\64DJSk\u010a\u011a\u0126\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}