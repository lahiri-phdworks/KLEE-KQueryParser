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
		RULE_kqueryExpression = 0, RULE_queryStatements = 1, RULE_ktranslationUnit = 2, 
		RULE_queryCommand = 3, RULE_queryExpr = 4, RULE_evalExprList = 5, RULE_evalArrayList = 6, 
		RULE_expressionList = 7, RULE_identifierList = 8, RULE_arrayDeclaration = 9, 
		RULE_numArrayElements = 10, RULE_arrayInitializer = 11, RULE_expression = 12, 
		RULE_genericBitRead = 13, RULE_bitExtractExpr = 14, RULE_version = 15, 
		RULE_notExpr = 16, RULE_concatExpr = 17, RULE_exprNegation = 18, RULE_selectExpr = 19, 
		RULE_arrExtractExpr = 20, RULE_varName = 21, RULE_leftExpr = 22, RULE_rightExpr = 23, 
		RULE_namedConstant = 24, RULE_updateList = 25, RULE_bitwiseExpr = 26, 
		RULE_comparisonExpr = 27, RULE_arithmeticExpr = 28, RULE_domain = 29, 
		RULE_rangeLimit = 30, RULE_arrName = 31, RULE_numberList = 32, RULE_number = 33, 
		RULE_constant = 34, RULE_boolnum = 35, RULE_signedConstant = 36, RULE_widthOrSizeExpr = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"kqueryExpression", "queryStatements", "ktranslationUnit", "queryCommand", 
			"queryExpr", "evalExprList", "evalArrayList", "expressionList", "identifierList", 
			"arrayDeclaration", "numArrayElements", "arrayInitializer", "expression", 
			"genericBitRead", "bitExtractExpr", "version", "notExpr", "concatExpr", 
			"exprNegation", "selectExpr", "arrExtractExpr", "varName", "leftExpr", 
			"rightExpr", "namedConstant", "updateList", "bitwiseExpr", "comparisonExpr", 
			"arithmeticExpr", "domain", "rangeLimit", "arrName", "numberList", "number", 
			"constant", "boolnum", "signedConstant", "widthOrSizeExpr"
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
		public QueryStatementsContext queryStatements() {
			return getRuleContext(QueryStatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KQueryParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			queryStatements();
			setState(77);
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

	public static class QueryStatementsContext extends ParserRuleContext {
		public List<KtranslationUnitContext> ktranslationUnit() {
			return getRuleContexts(KtranslationUnitContext.class);
		}
		public KtranslationUnitContext ktranslationUnit(int i) {
			return getRuleContext(KtranslationUnitContext.class,i);
		}
		public QueryStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterQueryStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitQueryStatements(this);
		}
	}

	public final QueryStatementsContext queryStatements() throws RecognitionException {
		QueryStatementsContext _localctx = new QueryStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_queryStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array || _la==LeftParen) {
				{
				{
				setState(79);
				ktranslationUnit();
				}
				}
				setState(84);
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
		enterRule(_localctx, 4, RULE_ktranslationUnit);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				arrayDeclaration();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
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
		enterRule(_localctx, 6, RULE_queryCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LeftParen);
			setState(90);
			match(Query);
			setState(91);
			evalExprList();
			setState(92);
			queryExpr();
			setState(93);
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
		public QueryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryExpr; }
	 
		public QueryExprContext() { }
		public void copyFrom(QueryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithEvalExprAndArrayListContext extends QueryExprContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvalExprListContext evalExprList() {
			return getRuleContext(EvalExprListContext.class,0);
		}
		public EvalArrayListContext evalArrayList() {
			return getRuleContext(EvalArrayListContext.class,0);
		}
		public WithEvalExprAndArrayListContext(QueryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterWithEvalExprAndArrayList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitWithEvalExprAndArrayList(this);
		}
	}
	public static class SingletonQueryExprContext extends QueryExprContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingletonQueryExprContext(QueryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterSingletonQueryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitSingletonQueryExpr(this);
		}
	}
	public static class WithEvalExprContext extends QueryExprContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvalExprListContext evalExprList() {
			return getRuleContext(EvalExprListContext.class,0);
		}
		public WithEvalExprContext(QueryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterWithEvalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitWithEvalExpr(this);
		}
	}

	public final QueryExprContext queryExpr() throws RecognitionException {
		QueryExprContext _localctx = new QueryExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_queryExpr);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SingletonQueryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				expression();
				}
				break;
			case 2:
				_localctx = new WithEvalExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				expression();
				setState(97);
				evalExprList();
				}
				break;
			case 3:
				_localctx = new WithEvalExprAndArrayListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				expression();
				setState(100);
				evalExprList();
				setState(101);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
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
		enterRule(_localctx, 10, RULE_evalExprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LeftBracket);
			setState(106);
			expressionList();
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
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
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
		enterRule(_localctx, 12, RULE_evalArrayList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LeftBracket);
			setState(110);
			identifierList();
			setState(111);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << SignedConstant) | (1L << Constant) | (1L << Identifier))) != 0) || _la==LeftParen || _la==LeftBracket) {
				{
				{
				setState(113);
				expression();
				}
				}
				setState(118);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(KQueryParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KQueryParser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(119);
				match(Identifier);
				}
				}
				setState(124);
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
		enterRule(_localctx, 18, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(Array);
			setState(126);
			arrName();
			setState(127);
			match(LeftBracket);
			setState(128);
			numArrayElements();
			setState(129);
			match(RightBracket);
			setState(130);
			match(Colon);
			setState(131);
			domain();
			setState(132);
			match(Arrow);
			setState(133);
			rangeLimit();
			setState(134);
			match(Equal);
			setState(135);
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
		enterRule(_localctx, 20, RULE_numArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		enterRule(_localctx, 22, RULE_arrayInitializer);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Symbolic:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(Symbolic);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(LeftBracket);
				setState(141);
				numberList();
				setState(142);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithExprContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public ArithExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitArithExpr(this);
		}
	}
	public static class SelectExprWidthContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public SelectExprWidthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterSelectExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitSelectExprWidth(this);
		}
	}
	public static class BitwExprWidthContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public BitwiseExprContext bitwiseExpr() {
			return getRuleContext(BitwiseExprContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public BitwExprWidthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterBitwExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitBitwExprWidth(this);
		}
	}
	public static class NegationExprWidthContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public ExprNegationContext exprNegation() {
			return getRuleContext(ExprNegationContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public NegationExprWidthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNegationExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNegationExprWidth(this);
		}
	}
	public static class VariableNameContext extends ExpressionContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public VariableNameContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitVariableName(this);
		}
	}
	public static class NegetionExprContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public ExprNegationContext exprNegation() {
			return getRuleContext(ExprNegationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public NegetionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNegetionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNegetionExpr(this);
		}
	}
	public static class CompExprContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public CompExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitCompExpr(this);
		}
	}
	public static class CompExprWidthContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public CompExprWidthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterCompExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitCompExprWidth(this);
		}
	}
	public static class SizeQueryContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public SizeQueryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterSizeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitSizeQuery(this);
		}
	}
	public static class ConcatExprNWContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public ConcatExprContext concatExpr() {
			return getRuleContext(ConcatExprContext.class,0);
		}
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public ConcatExprNWContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterConcatExprNW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitConcatExprNW(this);
		}
	}
	public static class NotExprWidthContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public NotExprWidthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNotExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNotExprWidth(this);
		}
	}
	public static class ArrExtractExprWidthContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public ArrExtractExprContext arrExtractExpr() {
			return getRuleContext(ArrExtractExprContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public ArrExtractExprWidthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterArrExtractExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitArrExtractExprWidth(this);
		}
	}
	public static class ReadExprContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public GenericBitReadContext genericBitRead() {
			return getRuleContext(GenericBitReadContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public ReadExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterReadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitReadExpr(this);
		}
	}
	public static class SingletonContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SingletonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterSingleton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitSingleton(this);
		}
	}
	public static class NamedAbbreviationContext extends ExpressionContext {
		public NamedConstantContext namedConstant() {
			return getRuleContext(NamedConstantContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KQueryParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedAbbreviationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNamedAbbreviation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNamedAbbreviation(this);
		}
	}
	public static class VersionExprContext extends ExpressionContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public VersionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterVersionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitVersionExpr(this);
		}
	}
	public static class ReadExpresssionVersionedContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public GenericBitReadContext genericBitRead() {
			return getRuleContext(GenericBitReadContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public ReadExpresssionVersionedContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterReadExpresssionVersioned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitReadExpresssionVersioned(this);
		}
	}
	public static class BitExtractExprWidthContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public BitExtractExprContext bitExtractExpr() {
			return getRuleContext(BitExtractExprContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public BitExtractExprWidthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterBitExtractExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitBitExtractExprWidth(this);
		}
	}
	public static class ConcatExprWidthContext extends ExpressionContext {
		public TerminalNode LeftParen() { return getToken(KQueryParser.LeftParen, 0); }
		public ConcatExprContext concatExpr() {
			return getRuleContext(ConcatExprContext.class,0);
		}
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public ConcatExprWidthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterConcatExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitConcatExprWidth(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VariableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				varName();
				}
				break;
			case 2:
				_localctx = new NamedAbbreviationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				namedConstant();
				setState(148);
				match(Colon);
				setState(149);
				expression();
				}
				break;
			case 3:
				_localctx = new SizeQueryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(LeftParen);
				setState(152);
				widthOrSizeExpr();
				setState(153);
				number();
				setState(154);
				match(RightParen);
				}
				break;
			case 4:
				_localctx = new ArithExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(LeftParen);
				setState(157);
				arithmeticExpr();
				setState(158);
				widthOrSizeExpr();
				setState(159);
				leftExpr();
				setState(160);
				rightExpr();
				setState(161);
				match(RightParen);
				}
				break;
			case 5:
				_localctx = new NotExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(LeftParen);
				setState(164);
				notExpr();
				setState(165);
				match(LeftBracket);
				setState(166);
				widthOrSizeExpr();
				setState(167);
				match(RightBracket);
				setState(168);
				expression();
				setState(169);
				match(RightParen);
				}
				break;
			case 6:
				_localctx = new BitwExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				match(LeftParen);
				setState(172);
				bitwiseExpr();
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
			case 7:
				_localctx = new CompExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				match(LeftParen);
				setState(179);
				comparisonExpr();
				setState(180);
				widthOrSizeExpr();
				setState(181);
				leftExpr();
				setState(182);
				rightExpr();
				setState(183);
				match(RightParen);
				}
				break;
			case 8:
				_localctx = new CompExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
				match(LeftParen);
				setState(186);
				comparisonExpr();
				setState(187);
				leftExpr();
				setState(188);
				rightExpr();
				setState(189);
				match(RightParen);
				}
				break;
			case 9:
				_localctx = new ConcatExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				match(LeftParen);
				setState(192);
				concatExpr();
				setState(193);
				widthOrSizeExpr();
				setState(194);
				leftExpr();
				setState(195);
				rightExpr();
				setState(196);
				match(RightParen);
				}
				break;
			case 10:
				_localctx = new ConcatExprNWContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(198);
				match(LeftParen);
				setState(199);
				concatExpr();
				setState(200);
				leftExpr();
				setState(201);
				rightExpr();
				setState(202);
				match(RightParen);
				}
				break;
			case 11:
				_localctx = new ArrExtractExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(204);
				match(LeftParen);
				setState(205);
				arrExtractExpr();
				setState(206);
				widthOrSizeExpr();
				setState(207);
				number();
				setState(208);
				expression();
				setState(209);
				match(RightParen);
				}
				break;
			case 12:
				_localctx = new BitExtractExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				match(LeftParen);
				setState(212);
				bitExtractExpr();
				setState(213);
				widthOrSizeExpr();
				setState(214);
				expression();
				setState(215);
				match(RightParen);
				}
				break;
			case 13:
				_localctx = new ReadExpresssionVersionedContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(217);
				match(LeftParen);
				setState(218);
				genericBitRead();
				setState(219);
				widthOrSizeExpr();
				setState(220);
				expression();
				setState(221);
				version();
				setState(222);
				match(RightParen);
				}
				break;
			case 14:
				_localctx = new SelectExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(224);
				match(LeftParen);
				setState(225);
				selectExpr();
				setState(226);
				widthOrSizeExpr();
				setState(227);
				leftExpr();
				setState(228);
				rightExpr();
				setState(229);
				expression();
				setState(230);
				match(RightParen);
				}
				break;
			case 15:
				_localctx = new NegationExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(232);
				match(LeftParen);
				setState(233);
				exprNegation();
				setState(234);
				widthOrSizeExpr();
				setState(235);
				expression();
				setState(236);
				match(RightParen);
				}
				break;
			case 16:
				_localctx = new NegetionExprContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(238);
				match(LeftParen);
				setState(239);
				exprNegation();
				setState(240);
				expression();
				setState(241);
				match(RightParen);
				}
				break;
			case 17:
				_localctx = new ReadExprContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(243);
				match(LeftParen);
				setState(244);
				genericBitRead();
				setState(245);
				widthOrSizeExpr();
				setState(246);
				expression();
				setState(247);
				match(RightParen);
				}
				break;
			case 18:
				_localctx = new VersionExprContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(249);
				version();
				}
				break;
			case 19:
				_localctx = new SingletonContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(250);
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
		enterRule(_localctx, 26, RULE_genericBitRead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 28, RULE_bitExtractExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	 
		public VersionContext() { }
		public void copyFrom(VersionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdationListContext extends VersionContext {
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public TerminalNode ATR() { return getToken(KQueryParser.ATR, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public UpdationListContext(VersionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterUpdationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitUpdationList(this);
		}
	}
	public static class VersionVariableNameContext extends VersionContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public VersionVariableNameContext(VersionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterVersionVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitVersionVariableName(this);
		}
	}
	public static class VersionedNamedAbbreviationContext extends VersionContext {
		public NamedConstantContext namedConstant() {
			return getRuleContext(NamedConstantContext.class,0);
		}
		public TerminalNode Colon() { return getToken(KQueryParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VersionedNamedAbbreviationContext(VersionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterVersionedNamedAbbreviation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitVersionedNamedAbbreviation(this);
		}
	}
	public static class NoUpdateListContext extends VersionContext {
		public TerminalNode LeftBracket() { return getToken(KQueryParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public TerminalNode ATR() { return getToken(KQueryParser.ATR, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public NoUpdateListContext(VersionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).enterNoUpdateList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KQueryListener ) ((KQueryListener)listener).exitNoUpdateList(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_version);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VersionVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				varName();
				}
				break;
			case 2:
				_localctx = new VersionedNamedAbbreviationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				namedConstant();
				setState(259);
				match(Colon);
				setState(260);
				expression();
				}
				break;
			case 3:
				_localctx = new UpdationListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(LeftBracket);
				setState(263);
				updateList();
				setState(264);
				match(RightBracket);
				setState(265);
				match(ATR);
				setState(266);
				version();
				}
				break;
			case 4:
				_localctx = new NoUpdateListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(LeftBracket);
				setState(269);
				match(RightBracket);
				setState(270);
				match(ATR);
				setState(271);
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
		enterRule(_localctx, 32, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 34, RULE_concatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 36, RULE_exprNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 38, RULE_selectExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 40, RULE_arrExtractExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 42, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
		enterRule(_localctx, 44, RULE_leftExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
		enterRule(_localctx, 46, RULE_rightExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		enterRule(_localctx, 48, RULE_namedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		enterRule(_localctx, 50, RULE_updateList);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				expression();
				setState(293);
				match(Equal);
				setState(294);
				expression();
				setState(295);
				match(COMMA);
				setState(296);
				updateList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				expression();
				setState(299);
				match(Equal);
				setState(300);
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
		enterRule(_localctx, 52, RULE_bitwiseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 54, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 56, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		enterRule(_localctx, 58, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		enterRule(_localctx, 60, RULE_rangeLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
		enterRule(_localctx, 62, RULE_arrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		enterRule(_localctx, 64, RULE_numberList);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				number();
				setState(318);
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
		enterRule(_localctx, 66, RULE_number);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				boolnum();
				}
				break;
			case SignedConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				signedConstant();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
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
		enterRule(_localctx, 68, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 70, RULE_boolnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 72, RULE_signedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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
		enterRule(_localctx, 74, RULE_widthOrSizeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0152\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\7\3S\n\3\f"+
		"\3\16\3V\13\3\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\7\tu\n\t"+
		"\f\t\16\tx\13\t\3\n\7\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0093"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fe\n\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0113\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0131\n\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\5\"\u0143\n\"\3#\3#\3#\5#\u0148"+
		"\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\7\4\2!!$%\3\2\37 \4\2\32\34*"+
		",\3\2-\66\3\2\67=\2\u014b\2N\3\2\2\2\4T\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2"+
		"\ni\3\2\2\2\fk\3\2\2\2\16o\3\2\2\2\20v\3\2\2\2\22|\3\2\2\2\24\177\3\2"+
		"\2\2\26\u008b\3\2\2\2\30\u0092\3\2\2\2\32\u00fd\3\2\2\2\34\u00ff\3\2\2"+
		"\2\36\u0101\3\2\2\2 \u0112\3\2\2\2\"\u0114\3\2\2\2$\u0116\3\2\2\2&\u0118"+
		"\3\2\2\2(\u011a\3\2\2\2*\u011c\3\2\2\2,\u011e\3\2\2\2.\u0120\3\2\2\2\60"+
		"\u0122\3\2\2\2\62\u0124\3\2\2\2\64\u0130\3\2\2\2\66\u0132\3\2\2\28\u0134"+
		"\3\2\2\2:\u0136\3\2\2\2<\u0138\3\2\2\2>\u013a\3\2\2\2@\u013c\3\2\2\2B"+
		"\u0142\3\2\2\2D\u0147\3\2\2\2F\u0149\3\2\2\2H\u014b\3\2\2\2J\u014d\3\2"+
		"\2\2L\u014f\3\2\2\2NO\5\4\3\2OP\7\2\2\3P\3\3\2\2\2QS\5\6\4\2RQ\3\2\2\2"+
		"SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\5\3\2\2\2VT\3\2\2\2WZ\5\24\13\2XZ\5\b"+
		"\5\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[\\\7D\2\2\\]\7\22\2\2]^\5\f\7\2^_"+
		"\5\n\6\2_`\7E\2\2`\t\3\2\2\2aj\5\32\16\2bc\5\32\16\2cd\5\f\7\2dj\3\2\2"+
		"\2ef\5\32\16\2fg\5\f\7\2gh\5\16\b\2hj\3\2\2\2ia\3\2\2\2ib\3\2\2\2ie\3"+
		"\2\2\2j\13\3\2\2\2kl\7F\2\2lm\5\20\t\2mn\7G\2\2n\r\3\2\2\2op\7F\2\2pq"+
		"\5\22\n\2qr\7G\2\2r\17\3\2\2\2su\5\32\16\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2"+
		"\2vw\3\2\2\2w\21\3\2\2\2xv\3\2\2\2y{\7>\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}\23\3\2\2\2~|\3\2\2\2\177\u0080\7\23\2\2\u0080\u0081\5"+
		"@!\2\u0081\u0082\7F\2\2\u0082\u0083\5\26\f\2\u0083\u0084\7G\2\2\u0084"+
		"\u0085\7\25\2\2\u0085\u0086\5<\37\2\u0086\u0087\7\26\2\2\u0087\u0088\5"+
		"> \2\u0088\u0089\7\27\2\2\u0089\u008a\5\30\r\2\u008a\25\3\2\2\2\u008b"+
		"\u008c\7\5\2\2\u008c\27\3\2\2\2\u008d\u0093\7\24\2\2\u008e\u008f\7F\2"+
		"\2\u008f\u0090\5B\"\2\u0090\u0091\7G\2\2\u0091\u0093\3\2\2\2\u0092\u008d"+
		"\3\2\2\2\u0092\u008e\3\2\2\2\u0093\31\3\2\2\2\u0094\u00fe\5,\27\2\u0095"+
		"\u0096\5\62\32\2\u0096\u0097\7\25\2\2\u0097\u0098\5\32\16\2\u0098\u00fe"+
		"\3\2\2\2\u0099\u009a\7D\2\2\u009a\u009b\5L\'\2\u009b\u009c\5D#\2\u009c"+
		"\u009d\7E\2\2\u009d\u00fe\3\2\2\2\u009e\u009f\7D\2\2\u009f\u00a0\5:\36"+
		"\2\u00a0\u00a1\5L\'\2\u00a1\u00a2\5.\30\2\u00a2\u00a3\5\60\31\2\u00a3"+
		"\u00a4\7E\2\2\u00a4\u00fe\3\2\2\2\u00a5\u00a6\7D\2\2\u00a6\u00a7\5\"\22"+
		"\2\u00a7\u00a8\7F\2\2\u00a8\u00a9\5L\'\2\u00a9\u00aa\7G\2\2\u00aa\u00ab"+
		"\5\32\16\2\u00ab\u00ac\7E\2\2\u00ac\u00fe\3\2\2\2\u00ad\u00ae\7D\2\2\u00ae"+
		"\u00af\5\66\34\2\u00af\u00b0\5L\'\2\u00b0\u00b1\5.\30\2\u00b1\u00b2\5"+
		"\60\31\2\u00b2\u00b3\7E\2\2\u00b3\u00fe\3\2\2\2\u00b4\u00b5\7D\2\2\u00b5"+
		"\u00b6\58\35\2\u00b6\u00b7\5L\'\2\u00b7\u00b8\5.\30\2\u00b8\u00b9\5\60"+
		"\31\2\u00b9\u00ba\7E\2\2\u00ba\u00fe\3\2\2\2\u00bb\u00bc\7D\2\2\u00bc"+
		"\u00bd\58\35\2\u00bd\u00be\5.\30\2\u00be\u00bf\5\60\31\2\u00bf\u00c0\7"+
		"E\2\2\u00c0\u00fe\3\2\2\2\u00c1\u00c2\7D\2\2\u00c2\u00c3\5$\23\2\u00c3"+
		"\u00c4\5L\'\2\u00c4\u00c5\5.\30\2\u00c5\u00c6\5\60\31\2\u00c6\u00c7\7"+
		"E\2\2\u00c7\u00fe\3\2\2\2\u00c8\u00c9\7D\2\2\u00c9\u00ca\5$\23\2\u00ca"+
		"\u00cb\5.\30\2\u00cb\u00cc\5\60\31\2\u00cc\u00cd\7E\2\2\u00cd\u00fe\3"+
		"\2\2\2\u00ce\u00cf\7D\2\2\u00cf\u00d0\5*\26\2\u00d0\u00d1\5L\'\2\u00d1"+
		"\u00d2\5D#\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\7E\2\2\u00d4\u00fe\3\2"+
		"\2\2\u00d5\u00d6\7D\2\2\u00d6\u00d7\5\36\20\2\u00d7\u00d8\5L\'\2\u00d8"+
		"\u00d9\5\32\16\2\u00d9\u00da\7E\2\2\u00da\u00fe\3\2\2\2\u00db\u00dc\7"+
		"D\2\2\u00dc\u00dd\5\34\17\2\u00dd\u00de\5L\'\2\u00de\u00df\5\32\16\2\u00df"+
		"\u00e0\5 \21\2\u00e0\u00e1\7E\2\2\u00e1\u00fe\3\2\2\2\u00e2\u00e3\7D\2"+
		"\2\u00e3\u00e4\5(\25\2\u00e4\u00e5\5L\'\2\u00e5\u00e6\5.\30\2\u00e6\u00e7"+
		"\5\60\31\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9\7E\2\2\u00e9\u00fe\3\2\2"+
		"\2\u00ea\u00eb\7D\2\2\u00eb\u00ec\5&\24\2\u00ec\u00ed\5L\'\2\u00ed\u00ee"+
		"\5\32\16\2\u00ee\u00ef\7E\2\2\u00ef\u00fe\3\2\2\2\u00f0\u00f1\7D\2\2\u00f1"+
		"\u00f2\5&\24\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4\7E\2\2\u00f4\u00fe\3"+
		"\2\2\2\u00f5\u00f6\7D\2\2\u00f6\u00f7\5\34\17\2\u00f7\u00f8\5L\'\2\u00f8"+
		"\u00f9\5\32\16\2\u00f9\u00fa\7E\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fe\5"+
		" \21\2\u00fc\u00fe\5D#\2\u00fd\u0094\3\2\2\2\u00fd\u0095\3\2\2\2\u00fd"+
		"\u0099\3\2\2\2\u00fd\u009e\3\2\2\2\u00fd\u00a5\3\2\2\2\u00fd\u00ad\3\2"+
		"\2\2\u00fd\u00b4\3\2\2\2\u00fd\u00bb\3\2\2\2\u00fd\u00c1\3\2\2\2\u00fd"+
		"\u00c8\3\2\2\2\u00fd\u00ce\3\2\2\2\u00fd\u00d5\3\2\2\2\u00fd\u00db\3\2"+
		"\2\2\u00fd\u00e2\3\2\2\2\u00fd\u00ea\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\33\3\2\2"+
		"\2\u00ff\u0100\t\2\2\2\u0100\35\3\2\2\2\u0101\u0102\t\3\2\2\u0102\37\3"+
		"\2\2\2\u0103\u0113\5,\27\2\u0104\u0105\5\62\32\2\u0105\u0106\7\25\2\2"+
		"\u0106\u0107\5\32\16\2\u0107\u0113\3\2\2\2\u0108\u0109\7F\2\2\u0109\u010a"+
		"\5\64\33\2\u010a\u010b\7G\2\2\u010b\u010c\7(\2\2\u010c\u010d\5 \21\2\u010d"+
		"\u0113\3\2\2\2\u010e\u010f\7F\2\2\u010f\u0110\7G\2\2\u0110\u0111\7(\2"+
		"\2\u0111\u0113\5 \21\2\u0112\u0103\3\2\2\2\u0112\u0104\3\2\2\2\u0112\u0108"+
		"\3\2\2\2\u0112\u010e\3\2\2\2\u0113!\3\2\2\2\u0114\u0115\7\31\2\2\u0115"+
		"#\3\2\2\2\u0116\u0117\7\35\2\2\u0117%\3\2\2\2\u0118\u0119\7#\2\2\u0119"+
		"\'\3\2\2\2\u011a\u011b\7\"\2\2\u011b)\3\2\2\2\u011c\u011d\7\36\2\2\u011d"+
		"+\3\2\2\2\u011e\u011f\7>\2\2\u011f-\3\2\2\2\u0120\u0121\5\32\16\2\u0121"+
		"/\3\2\2\2\u0122\u0123\5\32\16\2\u0123\61\3\2\2\2\u0124\u0125\7>\2\2\u0125"+
		"\63\3\2\2\2\u0126\u0127\5\32\16\2\u0127\u0128\7\27\2\2\u0128\u0129\5\32"+
		"\16\2\u0129\u012a\7\30\2\2\u012a\u012b\5\64\33\2\u012b\u0131\3\2\2\2\u012c"+
		"\u012d\5\32\16\2\u012d\u012e\7\27\2\2\u012e\u012f\5\32\16\2\u012f\u0131"+
		"\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u012c\3\2\2\2\u0131\65\3\2\2\2\u0132"+
		"\u0133\t\4\2\2\u0133\67\3\2\2\2\u0134\u0135\t\5\2\2\u01359\3\2\2\2\u0136"+
		"\u0137\t\6\2\2\u0137;\3\2\2\2\u0138\u0139\5L\'\2\u0139=\3\2\2\2\u013a"+
		"\u013b\5L\'\2\u013b?\3\2\2\2\u013c\u013d\7>\2\2\u013dA\3\2\2\2\u013e\u0143"+
		"\5D#\2\u013f\u0140\5D#\2\u0140\u0141\5B\"\2\u0141\u0143\3\2\2\2\u0142"+
		"\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0143C\3\2\2\2\u0144\u0148\5H%\2\u0145"+
		"\u0148\5J&\2\u0146\u0148\5F$\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0147\u0146\3\2\2\2\u0148E\3\2\2\2\u0149\u014a\7\5\2\2\u014aG\3\2\2\2"+
		"\u014b\u014c\7\3\2\2\u014cI\3\2\2\2\u014d\u014e\7\4\2\2\u014eK\3\2\2\2"+
		"\u014f\u0150\7\13\2\2\u0150M\3\2\2\2\rTYiv|\u0092\u00fd\u0112\u0130\u0142"+
		"\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}