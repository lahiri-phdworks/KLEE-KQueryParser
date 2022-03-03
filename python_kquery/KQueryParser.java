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
		Boolean=1, SignedConstant=2, Constant=3, BinConstant=4, OctConstant=5, 
		HexConstant=6, FloatingPointType=7, IntegerType=8, WidthType=9, BinId=10, 
		OctId=11, WIDTH=12, HexId=13, TrueMatch=14, FalseMatch=15, Query=16, Array=17, 
		Symbolic=18, Colon=19, Arrow=20, Equal=21, COMMA=22, NOT=23, SHL=24, LSHR=25, 
		ASHR=26, CONCAT=27, EXTRACT=28, ZEXT=29, SEXT=30, READ=31, SELECT=32, 
		NEGETION=33, READLSB=34, READMSB=35, PLUS=36, MINUS=37, ATR=38, FP=39, 
		BITWISEAND=40, BITWISEOR=41, BITWISEXOR=42, EQ=43, NEQ=44, ULT=45, ULE=46, 
		UGT=47, UGE=48, SLT=49, SLE=50, SGT=51, SGE=52, ADD=53, SUB=54, MUL=55, 
		UDIV=56, UREM=57, SDIV=58, SREM=59, Identifier=60, INT=61, Whitespace=62, 
		Newline=63, BlockComment=64, LineComment=65, LeftParen=66, RightParen=67, 
		LeftBracket=68, RightBracket=69, LeftBrace=70, RightBrace=71;
	public static final int
		RULE_kqueryExpression = 0, RULE_ktranslationUnit = 1, RULE_queryCommand = 2, 
		RULE_queryExpr = 3, RULE_evalExprList = 4, RULE_evalArrayList = 5, RULE_arrayDeclaration = 6, 
		RULE_numArrayElements = 7, RULE_arrayInitializer = 8, RULE_expression = 9, 
		RULE_genericBitRead = 10, RULE_bitExtractExpr = 11, RULE_version = 12, 
		RULE_fullyQualifiedExpression = 13, RULE_notExpr = 14, RULE_concatExpr = 15, 
		RULE_exprNegation = 16, RULE_selectExpr = 17, RULE_arrExtractExpr = 18, 
		RULE_varName = 19, RULE_leftExpr = 20, RULE_rightExpr = 21, RULE_namedConstant = 22, 
		RULE_updateList = 23, RULE_bitwiseExpr = 24, RULE_comparisonExpr = 25, 
		RULE_arithmeticExpr = 26, RULE_domain = 27, RULE_rangeLimit = 28, RULE_arrName = 29, 
		RULE_numberList = 30, RULE_number = 31, RULE_constant = 32, RULE_boolnum = 33, 
		RULE_signedConstant = 34, RULE_widthOrSizeExpr = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"kqueryExpression", "ktranslationUnit", "queryCommand", "queryExpr", 
			"evalExprList", "evalArrayList", "arrayDeclaration", "numArrayElements", 
			"arrayInitializer", "expression", "genericBitRead", "bitExtractExpr", 
			"version", "fullyQualifiedExpression", "notExpr", "concatExpr", "exprNegation", 
			"selectExpr", "arrExtractExpr", "varName", "leftExpr", "rightExpr", "namedConstant", 
			"updateList", "bitwiseExpr", "comparisonExpr", "arithmeticExpr", "domain", 
			"rangeLimit", "arrName", "numberList", "number", "constant", "boolnum", 
			"signedConstant", "widthOrSizeExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'0b'", "'0o'", 
			"'w'", "'0x'", "'true'", "'false'", "'query'", "'array'", "'symbolic'", 
			"':'", "'->'", "'='", "','", "'Not'", "'Shl'", "'LShr'", "'AShr'", "'Concat'", 
			"'Extract'", "'ZExt'", "'SExt'", "'Read'", "'Select'", "'Neg'", "'ReadLSB'", 
			"'ReadMSB'", "'+'", "'-'", "'@'", "'fp'", "'And'", "'Or'", "'Xor'", "'Eq'", 
			"'Ne'", "'Ult'", "'Ule'", "'Ugt'", "'Uge'", "'Slt'", "'Sle'", "'Sgt'", 
			"'Sge'", "'Add'", "'Sub'", "'Mul'", "'UDiv'", "'URem'", "'SDiv'", "'SRem'", 
			null, "'i'", null, null, null, null, "'('", "')'", "'['", "']'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Boolean", "SignedConstant", "Constant", "BinConstant", "OctConstant", 
			"HexConstant", "FloatingPointType", "IntegerType", "WidthType", "BinId", 
			"OctId", "WIDTH", "HexId", "TrueMatch", "FalseMatch", "Query", "Array", 
			"Symbolic", "Colon", "Arrow", "Equal", "COMMA", "NOT", "SHL", "LSHR", 
			"ASHR", "CONCAT", "EXTRACT", "ZEXT", "SEXT", "READ", "SELECT", "NEGETION", 
			"READLSB", "READMSB", "PLUS", "MINUS", "ATR", "FP", "BITWISEAND", "BITWISEOR", 
			"BITWISEXOR", "EQ", "NEQ", "ULT", "ULE", "UGT", "UGE", "SLT", "SLE", 
			"SGT", "SGE", "ADD", "SUB", "MUL", "UDIV", "UREM", "SDIV", "SREM", "Identifier", 
			"INT", "Whitespace", "Newline", "BlockComment", "LineComment", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace"
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array || _la==LeftParen) {
				{
				{
				setState(72);
				ktranslationUnit();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				arrayDeclaration();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
			setState(84);
			match(LeftParen);
			setState(85);
			match(Query);
			setState(86);
			evalExprList();
			setState(87);
			queryExpr();
			setState(88);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				expression();
				setState(92);
				evalExprList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				expression();
				setState(95);
				evalExprList();
				setState(96);
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
			setState(100);
			match(LeftBracket);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << SignedConstant) | (1L << Constant) | (1L << Identifier))) != 0) || _la==LeftParen || _la==LeftBracket) {
				{
				{
				setState(101);
				expression();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
			setState(109);
			match(LeftBracket);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(110);
				match(Identifier);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		public NumArrayElementsContext numArrayElements() {
			return getRuleContext(NumArrayElementsContext.class,0);
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
			setState(118);
			match(Array);
			setState(119);
			arrName();
			setState(120);
			match(LeftBracket);
			setState(121);
			numArrayElements();
			setState(122);
			match(RightBracket);
			setState(123);
			match(Colon);
			setState(124);
			domain();
			setState(125);
			match(Arrow);
			setState(126);
			rangeLimit();
			setState(127);
			match(Equal);
			setState(128);
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

	public static class NumArrayElementsContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(KQueryParser.Constant, 0); }
		public NumArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numArrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNumArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNumArrayElements(this);
		}
	}

	public final NumArrayElementsContext numArrayElements() throws RecognitionException {
		NumArrayElementsContext _localctx = new NumArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Symbolic:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(Symbolic);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(LeftBracket);
				setState(134);
				numberList();
				setState(135);
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
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public NamedConstantContext namedConstant() {
			return getRuleContext(NamedConstantContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KQueryParser.Colon, 0); }
		public FullyQualifiedExpressionContext fullyQualifiedExpression() {
			return getRuleContext(FullyQualifiedExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BitwiseExprContext bitwiseExpr() {
			return getRuleContext(BitwiseExprContext.class,0);
		}
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public ConcatExprContext concatExpr() {
			return getRuleContext(ConcatExprContext.class,0);
		}
		public ArrExtractExprContext arrExtractExpr() {
			return getRuleContext(ArrExtractExprContext.class,0);
		}
		public BitExtractExprContext bitExtractExpr() {
			return getRuleContext(BitExtractExprContext.class,0);
		}
		public GenericBitReadContext genericBitRead() {
			return getRuleContext(GenericBitReadContext.class,0);
		}
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public ExprNegationContext exprNegation() {
			return getRuleContext(ExprNegationContext.class,0);
		}
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				namedConstant();
				setState(141);
				match(Colon);
				setState(142);
				fullyQualifiedExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(LeftParen);
				setState(145);
				widthOrSizeExpr();
				setState(146);
				number();
				setState(147);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(LeftParen);
				setState(150);
				arithmeticExpr();
				setState(151);
				widthOrSizeExpr();
				setState(152);
				leftExpr();
				setState(153);
				rightExpr();
				setState(154);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(LeftParen);
				setState(157);
				notExpr();
				setState(158);
				match(LeftBracket);
				setState(159);
				widthOrSizeExpr();
				setState(160);
				match(RightBracket);
				setState(161);
				expression();
				setState(162);
				match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				match(LeftParen);
				setState(165);
				bitwiseExpr();
				setState(166);
				widthOrSizeExpr();
				setState(167);
				leftExpr();
				setState(168);
				rightExpr();
				setState(169);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(LeftParen);
				setState(172);
				comparisonExpr();
				setState(173);
				widthOrSizeExpr();
				setState(174);
				leftExpr();
				setState(175);
				rightExpr();
				setState(176);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				match(LeftParen);
				setState(179);
				comparisonExpr();
				setState(180);
				leftExpr();
				setState(181);
				rightExpr();
				setState(182);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				match(LeftParen);
				setState(185);
				concatExpr();
				setState(186);
				widthOrSizeExpr();
				setState(187);
				leftExpr();
				setState(188);
				rightExpr();
				setState(189);
				match(RightParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(191);
				match(LeftParen);
				setState(192);
				concatExpr();
				setState(193);
				leftExpr();
				setState(194);
				rightExpr();
				setState(195);
				match(RightParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(197);
				match(LeftParen);
				setState(198);
				arrExtractExpr();
				setState(199);
				widthOrSizeExpr();
				setState(200);
				number();
				setState(201);
				expression();
				setState(202);
				match(RightParen);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(204);
				match(LeftParen);
				setState(205);
				bitExtractExpr();
				setState(206);
				widthOrSizeExpr();
				setState(207);
				expression();
				setState(208);
				match(RightParen);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(210);
				match(LeftParen);
				setState(211);
				genericBitRead();
				setState(212);
				widthOrSizeExpr();
				setState(213);
				expression();
				setState(214);
				version();
				setState(215);
				match(RightParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(217);
				match(LeftParen);
				setState(218);
				selectExpr();
				setState(219);
				widthOrSizeExpr();
				setState(220);
				leftExpr();
				setState(221);
				rightExpr();
				setState(222);
				expression();
				setState(223);
				match(RightParen);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(225);
				match(LeftParen);
				setState(226);
				exprNegation();
				setState(227);
				widthOrSizeExpr();
				setState(228);
				expression();
				setState(229);
				match(RightParen);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(231);
				match(LeftParen);
				setState(232);
				exprNegation();
				setState(233);
				expression();
				setState(234);
				match(RightParen);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(236);
				match(LeftParen);
				setState(237);
				genericBitRead();
				setState(238);
				widthOrSizeExpr();
				setState(239);
				expression();
				setState(240);
				match(RightParen);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(242);
				version();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(243);
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

	public static class GenericBitReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(KQueryParser.READ, 0); }
		public TerminalNode READLSB() { return getToken(KQueryParser.READLSB, 0); }
		public TerminalNode READMSB() { return getToken(KQueryParser.READMSB, 0); }
		public GenericBitReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericBitRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterGenericBitRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitGenericBitRead(this);
		}
	}

	public final GenericBitReadContext genericBitRead() throws RecognitionException {
		GenericBitReadContext _localctx = new GenericBitReadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericBitRead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << READLSB) | (1L << READMSB))) != 0)) ) {
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

	public static class BitExtractExprContext extends ParserRuleContext {
		public TerminalNode ZEXT() { return getToken(KQueryParser.ZEXT, 0); }
		public TerminalNode SEXT() { return getToken(KQueryParser.SEXT, 0); }
		public BitExtractExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExtractExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterBitExtractExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitBitExtractExpr(this);
		}
	}

	public final BitExtractExprContext bitExtractExpr() throws RecognitionException {
		BitExtractExprContext _localctx = new BitExtractExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bitExtractExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==ZEXT || _la==SEXT) ) {
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

	public static class VersionContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public NamedConstantContext namedConstant() {
			return getRuleContext(NamedConstantContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KQueryParser.Colon, 0); }
		public FullyQualifiedExpressionContext fullyQualifiedExpression() {
			return getRuleContext(FullyQualifiedExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_version);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				namedConstant();
				setState(252);
				match(Colon);
				setState(253);
				fullyQualifiedExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(LeftBracket);
				setState(256);
				updateList();
				setState(257);
				match(RightBracket);
				setState(258);
				match(ATR);
				setState(259);
				version();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(LeftBracket);
				setState(262);
				match(RightBracket);
				setState(263);
				match(ATR);
				setState(264);
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

	public static class FullyQualifiedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FullyQualifiedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullyQualifiedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterFullyQualifiedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitFullyQualifiedExpression(this);
		}
	}

	public final FullyQualifiedExpressionContext fullyQualifiedExpression() throws RecognitionException {
		FullyQualifiedExpressionContext _localctx = new FullyQualifiedExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fullyQualifiedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expression();
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

	public static class NotExprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(KQueryParser.NOT, 0); }
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNotExpr(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(NOT);
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

	public static class ConcatExprContext extends ParserRuleContext {
		public TerminalNode CONCAT() { return getToken(KQueryParser.CONCAT, 0); }
		public ConcatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterConcatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitConcatExpr(this);
		}
	}

	public final ConcatExprContext concatExpr() throws RecognitionException {
		ConcatExprContext _localctx = new ConcatExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_concatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(CONCAT);
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

	public static class ExprNegationContext extends ParserRuleContext {
		public TerminalNode NEGETION() { return getToken(KQueryParser.NEGETION, 0); }
		public ExprNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterExprNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitExprNegation(this);
		}
	}

	public final ExprNegationContext exprNegation() throws RecognitionException {
		ExprNegationContext _localctx = new ExprNegationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(NEGETION);
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

	public static class SelectExprContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(KQueryParser.SELECT, 0); }
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitSelectExpr(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(SELECT);
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

	public static class ArrExtractExprContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(KQueryParser.EXTRACT, 0); }
		public ArrExtractExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrExtractExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterArrExtractExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitArrExtractExpr(this);
		}
	}

	public final ArrExtractExprContext arrExtractExpr() throws RecognitionException {
		ArrExtractExprContext _localctx = new ArrExtractExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrExtractExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(EXTRACT);
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KQueryParser.Identifier, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitVarName(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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

	public static class LeftExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LeftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterLeftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitLeftExpr(this);
		}
	}

	public final LeftExprContext leftExpr() throws RecognitionException {
		LeftExprContext _localctx = new LeftExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_leftExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expression();
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

	public static class RightExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RightExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterRightExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitRightExpr(this);
		}
	}

	public final RightExprContext rightExpr() throws RecognitionException {
		RightExprContext _localctx = new RightExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rightExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			expression();
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

	public static class NamedConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KQueryParser.Identifier, 0); }
		public NamedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNamedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNamedConstant(this);
		}
	}

	public final NamedConstantContext namedConstant() throws RecognitionException {
		NamedConstantContext _localctx = new NamedConstantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_namedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 46, RULE_updateList);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				expression();
				setState(288);
				match(Equal);
				setState(289);
				expression();
				setState(290);
				match(COMMA);
				setState(291);
				updateList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				expression();
				setState(294);
				match(Equal);
				setState(295);
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
		enterRule(_localctx, 48, RULE_bitwiseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 50, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 52, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			widthOrSizeExpr();
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
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_rangeLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			widthOrSizeExpr();
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
		enterRule(_localctx, 58, RULE_arrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 60, RULE_numberList);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				number();
				setState(313);
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
		public BoolnumContext boolnum() {
			return getRuleContext(BoolnumContext.class,0);
		}
		public SignedConstantContext signedConstant() {
			return getRuleContext(SignedConstantContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_number);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				boolnum();
				}
				break;
			case SignedConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				signedConstant();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				constant();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(KQueryParser.Constant, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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

	public static class BoolnumContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(KQueryParser.Boolean, 0); }
		public BoolnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterBoolnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitBoolnum(this);
		}
	}

	public final BoolnumContext boolnum() throws RecognitionException {
		BoolnumContext _localctx = new BoolnumContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(Boolean);
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

	public static class SignedConstantContext extends ParserRuleContext {
		public TerminalNode SignedConstant() { return getToken(KQueryParser.SignedConstant, 0); }
		public SignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterSignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitSignedConstant(this);
		}
	}

	public final SignedConstantContext signedConstant() throws RecognitionException {
		SignedConstantContext _localctx = new SignedConstantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_signedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(SignedConstant);
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

	public static class WidthOrSizeExprContext extends ParserRuleContext {
		public TerminalNode WidthType() { return getToken(KQueryParser.WidthType, 0); }
		public WidthOrSizeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthOrSizeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterWidthOrSizeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitWidthOrSizeExpr(this);
		}
	}

	public final WidthOrSizeExprContext widthOrSizeExpr() throws RecognitionException {
		WidthOrSizeExprContext _localctx = new WidthOrSizeExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_widthOrSizeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u014d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\3"+
		"\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5e\n\5\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\7\7r\n\7\f\7"+
		"\16\7u\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00f7\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010c\n\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u012c\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3 \5 \u013e\n \3!\3!\3!\5!\u0143\n!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFH\2\7\4\2!!$%\3\2\37 \4\2\32\34*,\3\2-\66\3\2\67=\2\u0148"+
		"\2M\3\2\2\2\4T\3\2\2\2\6V\3\2\2\2\bd\3\2\2\2\nf\3\2\2\2\fo\3\2\2\2\16"+
		"x\3\2\2\2\20\u0084\3\2\2\2\22\u008b\3\2\2\2\24\u00f6\3\2\2\2\26\u00f8"+
		"\3\2\2\2\30\u00fa\3\2\2\2\32\u010b\3\2\2\2\34\u010d\3\2\2\2\36\u010f\3"+
		"\2\2\2 \u0111\3\2\2\2\"\u0113\3\2\2\2$\u0115\3\2\2\2&\u0117\3\2\2\2(\u0119"+
		"\3\2\2\2*\u011b\3\2\2\2,\u011d\3\2\2\2.\u011f\3\2\2\2\60\u012b\3\2\2\2"+
		"\62\u012d\3\2\2\2\64\u012f\3\2\2\2\66\u0131\3\2\2\28\u0133\3\2\2\2:\u0135"+
		"\3\2\2\2<\u0137\3\2\2\2>\u013d\3\2\2\2@\u0142\3\2\2\2B\u0144\3\2\2\2D"+
		"\u0146\3\2\2\2F\u0148\3\2\2\2H\u014a\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2RU\5"+
		"\16\b\2SU\5\6\4\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VW\7D\2\2WX\7\22\2\2X"+
		"Y\5\n\6\2YZ\5\b\5\2Z[\7E\2\2[\7\3\2\2\2\\e\5\24\13\2]^\5\24\13\2^_\5\n"+
		"\6\2_e\3\2\2\2`a\5\24\13\2ab\5\n\6\2bc\5\f\7\2ce\3\2\2\2d\\\3\2\2\2d]"+
		"\3\2\2\2d`\3\2\2\2e\t\3\2\2\2fj\7F\2\2gi\5\24\13\2hg\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7G\2\2n\13\3\2\2\2os\7F\2\2"+
		"pr\7>\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2"+
		"vw\7G\2\2w\r\3\2\2\2xy\7\23\2\2yz\5<\37\2z{\7F\2\2{|\5\20\t\2|}\7G\2\2"+
		"}~\7\25\2\2~\177\58\35\2\177\u0080\7\26\2\2\u0080\u0081\5:\36\2\u0081"+
		"\u0082\7\27\2\2\u0082\u0083\5\22\n\2\u0083\17\3\2\2\2\u0084\u0085\7\5"+
		"\2\2\u0085\21\3\2\2\2\u0086\u008c\7\24\2\2\u0087\u0088\7F\2\2\u0088\u0089"+
		"\5> \2\u0089\u008a\7G\2\2\u008a\u008c\3\2\2\2\u008b\u0086\3\2\2\2\u008b"+
		"\u0087\3\2\2\2\u008c\23\3\2\2\2\u008d\u00f7\5(\25\2\u008e\u008f\5.\30"+
		"\2\u008f\u0090\7\25\2\2\u0090\u0091\5\34\17\2\u0091\u00f7\3\2\2\2\u0092"+
		"\u0093\7D\2\2\u0093\u0094\5H%\2\u0094\u0095\5@!\2\u0095\u0096\7E\2\2\u0096"+
		"\u00f7\3\2\2\2\u0097\u0098\7D\2\2\u0098\u0099\5\66\34\2\u0099\u009a\5"+
		"H%\2\u009a\u009b\5*\26\2\u009b\u009c\5,\27\2\u009c\u009d\7E\2\2\u009d"+
		"\u00f7\3\2\2\2\u009e\u009f\7D\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\7"+
		"F\2\2\u00a1\u00a2\5H%\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\5\24\13\2\u00a4"+
		"\u00a5\7E\2\2\u00a5\u00f7\3\2\2\2\u00a6\u00a7\7D\2\2\u00a7\u00a8\5\62"+
		"\32\2\u00a8\u00a9\5H%\2\u00a9\u00aa\5*\26\2\u00aa\u00ab\5,\27\2\u00ab"+
		"\u00ac\7E\2\2\u00ac\u00f7\3\2\2\2\u00ad\u00ae\7D\2\2\u00ae\u00af\5\64"+
		"\33\2\u00af\u00b0\5H%\2\u00b0\u00b1\5*\26\2\u00b1\u00b2\5,\27\2\u00b2"+
		"\u00b3\7E\2\2\u00b3\u00f7\3\2\2\2\u00b4\u00b5\7D\2\2\u00b5\u00b6\5\64"+
		"\33\2\u00b6\u00b7\5*\26\2\u00b7\u00b8\5,\27\2\u00b8\u00b9\7E\2\2\u00b9"+
		"\u00f7\3\2\2\2\u00ba\u00bb\7D\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\5H%"+
		"\2\u00bd\u00be\5*\26\2\u00be\u00bf\5,\27\2\u00bf\u00c0\7E\2\2\u00c0\u00f7"+
		"\3\2\2\2\u00c1\u00c2\7D\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\5*\26\2\u00c4"+
		"\u00c5\5,\27\2\u00c5\u00c6\7E\2\2\u00c6\u00f7\3\2\2\2\u00c7\u00c8\7D\2"+
		"\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\5H%\2\u00ca\u00cb\5@!\2\u00cb\u00cc"+
		"\5\24\13\2\u00cc\u00cd\7E\2\2\u00cd\u00f7\3\2\2\2\u00ce\u00cf\7D\2\2\u00cf"+
		"\u00d0\5\30\r\2\u00d0\u00d1\5H%\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\7"+
		"E\2\2\u00d3\u00f7\3\2\2\2\u00d4\u00d5\7D\2\2\u00d5\u00d6\5\26\f\2\u00d6"+
		"\u00d7\5H%\2\u00d7\u00d8\5\24\13\2\u00d8\u00d9\5\32\16\2\u00d9\u00da\7"+
		"E\2\2\u00da\u00f7\3\2\2\2\u00db\u00dc\7D\2\2\u00dc\u00dd\5$\23\2\u00dd"+
		"\u00de\5H%\2\u00de\u00df\5*\26\2\u00df\u00e0\5,\27\2\u00e0\u00e1\5\24"+
		"\13\2\u00e1\u00e2\7E\2\2\u00e2\u00f7\3\2\2\2\u00e3\u00e4\7D\2\2\u00e4"+
		"\u00e5\5\"\22\2\u00e5\u00e6\5H%\2\u00e6\u00e7\5\24\13\2\u00e7\u00e8\7"+
		"E\2\2\u00e8\u00f7\3\2\2\2\u00e9\u00ea\7D\2\2\u00ea\u00eb\5\"\22\2\u00eb"+
		"\u00ec\5\24\13\2\u00ec\u00ed\7E\2\2\u00ed\u00f7\3\2\2\2\u00ee\u00ef\7"+
		"D\2\2\u00ef\u00f0\5\26\f\2\u00f0\u00f1\5H%\2\u00f1\u00f2\5\24\13\2\u00f2"+
		"\u00f3\7E\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f7\5\32\16\2\u00f5\u00f7\5"+
		"@!\2\u00f6\u008d\3\2\2\2\u00f6\u008e\3\2\2\2\u00f6\u0092\3\2\2\2\u00f6"+
		"\u0097\3\2\2\2\u00f6\u009e\3\2\2\2\u00f6\u00a6\3\2\2\2\u00f6\u00ad\3\2"+
		"\2\2\u00f6\u00b4\3\2\2\2\u00f6\u00ba\3\2\2\2\u00f6\u00c1\3\2\2\2\u00f6"+
		"\u00c7\3\2\2\2\u00f6\u00ce\3\2\2\2\u00f6\u00d4\3\2\2\2\u00f6\u00db\3\2"+
		"\2\2\u00f6\u00e3\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\25\3\2\2\2\u00f8\u00f9\t\2\2"+
		"\2\u00f9\27\3\2\2\2\u00fa\u00fb\t\3\2\2\u00fb\31\3\2\2\2\u00fc\u010c\5"+
		"(\25\2\u00fd\u00fe\5.\30\2\u00fe\u00ff\7\25\2\2\u00ff\u0100\5\34\17\2"+
		"\u0100\u010c\3\2\2\2\u0101\u0102\7F\2\2\u0102\u0103\5\60\31\2\u0103\u0104"+
		"\7G\2\2\u0104\u0105\7(\2\2\u0105\u0106\5\32\16\2\u0106\u010c\3\2\2\2\u0107"+
		"\u0108\7F\2\2\u0108\u0109\7G\2\2\u0109\u010a\7(\2\2\u010a\u010c\5\32\16"+
		"\2\u010b\u00fc\3\2\2\2\u010b\u00fd\3\2\2\2\u010b\u0101\3\2\2\2\u010b\u0107"+
		"\3\2\2\2\u010c\33\3\2\2\2\u010d\u010e\5\24\13\2\u010e\35\3\2\2\2\u010f"+
		"\u0110\7\31\2\2\u0110\37\3\2\2\2\u0111\u0112\7\35\2\2\u0112!\3\2\2\2\u0113"+
		"\u0114\7#\2\2\u0114#\3\2\2\2\u0115\u0116\7\"\2\2\u0116%\3\2\2\2\u0117"+
		"\u0118\7\36\2\2\u0118\'\3\2\2\2\u0119\u011a\7>\2\2\u011a)\3\2\2\2\u011b"+
		"\u011c\5\24\13\2\u011c+\3\2\2\2\u011d\u011e\5\24\13\2\u011e-\3\2\2\2\u011f"+
		"\u0120\7>\2\2\u0120/\3\2\2\2\u0121\u0122\5\24\13\2\u0122\u0123\7\27\2"+
		"\2\u0123\u0124\5\24\13\2\u0124\u0125\7\30\2\2\u0125\u0126\5\60\31\2\u0126"+
		"\u012c\3\2\2\2\u0127\u0128\5\24\13\2\u0128\u0129\7\27\2\2\u0129\u012a"+
		"\5\24\13\2\u012a\u012c\3\2\2\2\u012b\u0121\3\2\2\2\u012b\u0127\3\2\2\2"+
		"\u012c\61\3\2\2\2\u012d\u012e\t\4\2\2\u012e\63\3\2\2\2\u012f\u0130\t\5"+
		"\2\2\u0130\65\3\2\2\2\u0131\u0132\t\6\2\2\u0132\67\3\2\2\2\u0133\u0134"+
		"\5H%\2\u01349\3\2\2\2\u0135\u0136\5H%\2\u0136;\3\2\2\2\u0137\u0138\7>"+
		"\2\2\u0138=\3\2\2\2\u0139\u013e\5@!\2\u013a\u013b\5@!\2\u013b\u013c\5"+
		"> \2\u013c\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013e"+
		"?\3\2\2\2\u013f\u0143\5D#\2\u0140\u0143\5F$\2\u0141\u0143\5B\"\2\u0142"+
		"\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143A\3\2\2\2"+
		"\u0144\u0145\7\5\2\2\u0145C\3\2\2\2\u0146\u0147\7\3\2\2\u0147E\3\2\2\2"+
		"\u0148\u0149\7\4\2\2\u0149G\3\2\2\2\u014a\u014b\7\13\2\2\u014bI\3\2\2"+
		"\2\rMTdjs\u008b\u00f6\u010b\u012b\u013d\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}