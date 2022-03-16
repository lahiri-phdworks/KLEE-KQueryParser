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
		NEGETION=33, READLSB=34, READMSB=35, PLUS=36, MINUS=37, ATR=38, BITWISEAND=39, 
		BITWISEOR=40, BITWISEXOR=41, EQ=42, NEQ=43, ULT=44, ULE=45, UGT=46, UGE=47, 
		SLT=48, SLE=49, SGT=50, SGE=51, ADD=52, SUB=53, MUL=54, UDIV=55, UREM=56, 
		SDIV=57, SREM=58, Identifier=59, INT=60, FP=61, Whitespace=62, Newline=63, 
		BlockComment=64, LineComment=65, LeftParen=66, RightParen=67, LeftBracket=68, 
		RightBracket=69, LeftBrace=70, RightBrace=71;
	public static final int
		RULE_kqueryExpression = 0, RULE_queryStatements = 1, RULE_ktranslationUnit = 2, 
		RULE_queryCommand = 3, RULE_queryExpr = 4, RULE_evalExprList = 5, RULE_evalArrayList = 6, 
		RULE_expressionList = 7, RULE_identifierList = 8, RULE_arrayDeclaration = 9, 
		RULE_numArrayElements = 10, RULE_arrayInitializer = 11, RULE_expression = 12, 
		RULE_genericBitRead = 13, RULE_bitExtractExpr = 14, RULE_version = 15, 
		RULE_notExpr = 16, RULE_concatExpr = 17, RULE_exprNegation = 18, RULE_selectExpr = 19, 
		RULE_arrExtractExpr = 20, RULE_varName = 21, RULE_leftExpr = 22, RULE_rightExpr = 23, 
		RULE_updateList = 24, RULE_bitwiseExpr = 25, RULE_comparisonExpr = 26, 
		RULE_arithmeticExpr = 27, RULE_domain = 28, RULE_rangeLimit = 29, RULE_arrName = 30, 
		RULE_numberList = 31, RULE_number = 32, RULE_constant = 33, RULE_boolnum = 34, 
		RULE_signedConstant = 35, RULE_widthOrSizeExpr = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"kqueryExpression", "queryStatements", "ktranslationUnit", "queryCommand", 
			"queryExpr", "evalExprList", "evalArrayList", "expressionList", "identifierList", 
			"arrayDeclaration", "numArrayElements", "arrayInitializer", "expression", 
			"genericBitRead", "bitExtractExpr", "version", "notExpr", "concatExpr", 
			"exprNegation", "selectExpr", "arrExtractExpr", "varName", "leftExpr", 
			"rightExpr", "updateList", "bitwiseExpr", "comparisonExpr", "arithmeticExpr", 
			"domain", "rangeLimit", "arrName", "numberList", "number", "constant", 
			"boolnum", "signedConstant", "widthOrSizeExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'0b'", "'0o'", 
			"'w'", "'0x'", "'true'", "'false'", "'query'", "'array'", "'symbolic'", 
			"':'", "'->'", "'='", "','", "'Not'", "'Shl'", "'LShr'", "'AShr'", "'Concat'", 
			"'Extract'", "'ZExt'", "'SExt'", "'Read'", "'Select'", "'Neg'", "'ReadLSB'", 
			"'ReadMSB'", "'+'", "'-'", "'@'", "'And'", "'Or'", "'Xor'", "'Eq'", "'Ne'", 
			"'Ult'", "'Ule'", "'Ugt'", "'Uge'", "'Slt'", "'Sle'", "'Sgt'", "'Sge'", 
			"'Add'", "'Sub'", "'Mul'", "'UDiv'", "'URem'", "'SDiv'", "'SRem'", null, 
			"'i'", "'fp'", null, null, null, null, "'('", "')'", "'['", "']'", "'{'", 
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
			"READLSB", "READMSB", "PLUS", "MINUS", "ATR", "BITWISEAND", "BITWISEOR", 
			"BITWISEXOR", "EQ", "NEQ", "ULT", "ULE", "UGT", "UGE", "SLT", "SLE", 
			"SGT", "SGE", "ADD", "SUB", "MUL", "UDIV", "UREM", "SDIV", "SREM", "Identifier", 
			"INT", "FP", "Whitespace", "Newline", "BlockComment", "LineComment", 
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
			setState(74);
			queryStatements();
			setState(75);
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array || _la==LeftParen) {
				{
				{
				setState(77);
				ktranslationUnit();
				}
				}
				setState(82);
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				arrayDeclaration();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
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
			setState(87);
			match(LeftParen);
			setState(88);
			match(Query);
			setState(89);
			evalExprList();
			setState(90);
			queryExpr();
			setState(91);
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
		enterRule(_localctx, 8, RULE_queryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			expression();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(94);
				evalExprList();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(95);
					evalArrayList();
					}
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
			setState(100);
			match(LeftBracket);
			setState(101);
			expressionList();
			setState(102);
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
			setState(104);
			match(LeftBracket);
			setState(105);
			identifierList();
			setState(106);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << SignedConstant) | (1L << Constant) | (1L << Identifier))) != 0) || _la==LeftParen || _la==LeftBracket) {
				{
				{
				setState(108);
				expression();
				}
				}
				setState(113);
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(114);
				match(Identifier);
				}
				}
				setState(119);
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
			setState(120);
			match(Array);
			setState(121);
			arrName();
			setState(122);
			match(LeftBracket);
			setState(123);
			numArrayElements();
			setState(124);
			match(RightBracket);
			setState(125);
			match(Colon);
			setState(126);
			domain();
			setState(127);
			match(Arrow);
			setState(128);
			rangeLimit();
			setState(129);
			match(Equal);
			setState(130);
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
			setState(132);
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
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Symbolic:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(Symbolic);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(LeftBracket);
				setState(136);
				numberList();
				setState(137);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
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
	public static class CompExprWidthContext extends ExpressionContext {
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
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
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
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
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
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
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
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(KQueryParser.RightParen, 0); }
		public WidthOrSizeExprContext widthOrSizeExpr() {
			return getRuleContext(WidthOrSizeExprContext.class,0);
		}
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
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new VariableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				varName();
				}
				break;
			case 2:
				_localctx = new NamedAbbreviationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				varName();
				setState(143);
				match(Colon);
				setState(144);
				expression();
				}
				break;
			case 3:
				_localctx = new SizeQueryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(LeftParen);
				setState(147);
				widthOrSizeExpr();
				setState(148);
				number();
				setState(149);
				match(RightParen);
				}
				break;
			case 4:
				_localctx = new ArithExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(LeftParen);
				setState(152);
				arithmeticExpr();
				setState(153);
				widthOrSizeExpr();
				setState(154);
				leftExpr();
				setState(155);
				rightExpr();
				setState(156);
				match(RightParen);
				}
				break;
			case 5:
				_localctx = new NotExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(LeftParen);
				setState(159);
				notExpr();
				setState(160);
				match(LeftBracket);
				setState(161);
				widthOrSizeExpr();
				setState(162);
				match(RightBracket);
				setState(163);
				expression();
				setState(164);
				match(RightParen);
				}
				break;
			case 6:
				_localctx = new BitwExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(LeftParen);
				setState(167);
				bitwiseExpr();
				setState(168);
				widthOrSizeExpr();
				setState(169);
				leftExpr();
				setState(170);
				rightExpr();
				setState(171);
				match(RightParen);
				}
				break;
			case 7:
				_localctx = new CompExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				match(LeftParen);
				setState(174);
				comparisonExpr();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WidthType) {
					{
					setState(175);
					widthOrSizeExpr();
					}
				}

				setState(178);
				leftExpr();
				setState(179);
				rightExpr();
				setState(180);
				match(RightParen);
				}
				break;
			case 8:
				_localctx = new ConcatExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				match(LeftParen);
				setState(183);
				concatExpr();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WidthType) {
					{
					setState(184);
					widthOrSizeExpr();
					}
				}

				setState(187);
				leftExpr();
				setState(188);
				rightExpr();
				setState(189);
				match(RightParen);
				}
				break;
			case 9:
				_localctx = new ArrExtractExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				match(LeftParen);
				setState(192);
				arrExtractExpr();
				setState(193);
				widthOrSizeExpr();
				setState(194);
				number();
				setState(195);
				expression();
				setState(196);
				match(RightParen);
				}
				break;
			case 10:
				_localctx = new BitExtractExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(198);
				match(LeftParen);
				setState(199);
				bitExtractExpr();
				setState(200);
				widthOrSizeExpr();
				setState(201);
				expression();
				setState(202);
				match(RightParen);
				}
				break;
			case 11:
				_localctx = new ReadExpresssionVersionedContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(204);
				match(LeftParen);
				setState(205);
				genericBitRead();
				setState(206);
				widthOrSizeExpr();
				setState(207);
				expression();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier || _la==LeftBracket) {
					{
					setState(208);
					version();
					}
				}

				setState(211);
				match(RightParen);
				}
				break;
			case 12:
				_localctx = new SelectExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(213);
				match(LeftParen);
				setState(214);
				selectExpr();
				setState(215);
				widthOrSizeExpr();
				setState(216);
				leftExpr();
				setState(217);
				rightExpr();
				setState(218);
				expression();
				setState(219);
				match(RightParen);
				}
				break;
			case 13:
				_localctx = new NegationExprWidthContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(221);
				match(LeftParen);
				setState(222);
				exprNegation();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WidthType) {
					{
					setState(223);
					widthOrSizeExpr();
					}
				}

				setState(226);
				expression();
				setState(227);
				match(RightParen);
				}
				break;
			case 14:
				_localctx = new VersionExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(229);
				version();
				}
				break;
			case 15:
				_localctx = new SingletonContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(230);
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
			setState(233);
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
			setState(235);
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
		public TerminalNode RightBracket() { return getToken(KQueryParser.RightBracket, 0); }
		public TerminalNode ATR() { return getToken(KQueryParser.ATR, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
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
		public TerminalNode Colon() { return getToken(KQueryParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_version);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new VersionVariableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				varName();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(238);
					match(Colon);
					setState(239);
					expression();
					}
				}

				}
				break;
			case LeftBracket:
				_localctx = new UpdationListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(LeftBracket);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << SignedConstant) | (1L << Constant) | (1L << Identifier))) != 0) || _la==LeftParen || _la==LeftBracket) {
					{
					setState(243);
					updateList();
					}
				}

				setState(246);
				match(RightBracket);
				setState(247);
				match(ATR);
				setState(248);
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
			setState(251);
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
			setState(253);
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
			setState(255);
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
			setState(257);
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
			setState(259);
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
			setState(261);
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
			setState(263);
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
			setState(265);
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

	public static class UpdateListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(KQueryParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(KQueryParser.Equal, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KQueryParser.COMMA, i);
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
		enterRule(_localctx, 48, RULE_updateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expression();
			setState(268);
			match(Equal);
			setState(269);
			expression();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(270);
				match(COMMA);
				setState(271);
				expression();
				setState(272);
				match(Equal);
				setState(273);
				expression();
				}
				}
				setState(279);
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
		enterRule(_localctx, 50, RULE_bitwiseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 52, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 54, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
		enterRule(_localctx, 56, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
		enterRule(_localctx, 58, RULE_rangeLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		enterRule(_localctx, 60, RULE_arrName);
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

	public static class NumberListContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 62, RULE_numberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(292);
				number();
				}
				}
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << SignedConstant) | (1L << Constant))) != 0) );
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
		enterRule(_localctx, 64, RULE_number);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				boolnum();
				}
				break;
			case SignedConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				signedConstant();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
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
		enterRule(_localctx, 66, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		enterRule(_localctx, 68, RULE_boolnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 70, RULE_signedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 72, RULE_widthOrSizeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0139\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\7\3Q\n\3\f\3\16\3"+
		"T\13\3\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6c\n\6\5"+
		"\6e\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\7\tp\n\t\f\t\16\ts\13\t\3"+
		"\n\7\nv\n\n\f\n\16\ny\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00b3\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00bc\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d4"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00e3\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ea\n\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\5\21\u00f3\n\21\3\21\3\21\5\21\u00f7\n\21\3\21"+
		"\3\21\3\21\5\21\u00fc\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u0116\n\32\f\32\16\32\u0119\13\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\6!\u0128\n!\r!\16!\u0129\3\"\3\"\3"+
		"\"\5\"\u012f\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\7\4\2!!$%\3\2\37 "+
		"\4\2\32\34)+\3\2,\65\3\2\66<\2\u0133\2L\3\2\2\2\4R\3\2\2\2\6W\3\2\2\2"+
		"\bY\3\2\2\2\n_\3\2\2\2\ff\3\2\2\2\16j\3\2\2\2\20q\3\2\2\2\22w\3\2\2\2"+
		"\24z\3\2\2\2\26\u0086\3\2\2\2\30\u008d\3\2\2\2\32\u00e9\3\2\2\2\34\u00eb"+
		"\3\2\2\2\36\u00ed\3\2\2\2 \u00fb\3\2\2\2\"\u00fd\3\2\2\2$\u00ff\3\2\2"+
		"\2&\u0101\3\2\2\2(\u0103\3\2\2\2*\u0105\3\2\2\2,\u0107\3\2\2\2.\u0109"+
		"\3\2\2\2\60\u010b\3\2\2\2\62\u010d\3\2\2\2\64\u011a\3\2\2\2\66\u011c\3"+
		"\2\2\28\u011e\3\2\2\2:\u0120\3\2\2\2<\u0122\3\2\2\2>\u0124\3\2\2\2@\u0127"+
		"\3\2\2\2B\u012e\3\2\2\2D\u0130\3\2\2\2F\u0132\3\2\2\2H\u0134\3\2\2\2J"+
		"\u0136\3\2\2\2LM\5\4\3\2MN\7\2\2\3N\3\3\2\2\2OQ\5\6\4\2PO\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2S\5\3\2\2\2TR\3\2\2\2UX\5\24\13\2VX\5\b\5\2"+
		"WU\3\2\2\2WV\3\2\2\2X\7\3\2\2\2YZ\7D\2\2Z[\7\22\2\2[\\\5\f\7\2\\]\5\n"+
		"\6\2]^\7E\2\2^\t\3\2\2\2_d\5\32\16\2`b\5\f\7\2ac\5\16\b\2ba\3\2\2\2bc"+
		"\3\2\2\2ce\3\2\2\2d`\3\2\2\2de\3\2\2\2e\13\3\2\2\2fg\7F\2\2gh\5\20\t\2"+
		"hi\7G\2\2i\r\3\2\2\2jk\7F\2\2kl\5\22\n\2lm\7G\2\2m\17\3\2\2\2np\5\32\16"+
		"\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\21\3\2\2\2sq\3\2\2\2tv\7="+
		"\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\23\3\2\2\2yw\3\2\2\2z{\7"+
		"\23\2\2{|\5> \2|}\7F\2\2}~\5\26\f\2~\177\7G\2\2\177\u0080\7\25\2\2\u0080"+
		"\u0081\5:\36\2\u0081\u0082\7\26\2\2\u0082\u0083\5<\37\2\u0083\u0084\7"+
		"\27\2\2\u0084\u0085\5\30\r\2\u0085\25\3\2\2\2\u0086\u0087\7\5\2\2\u0087"+
		"\27\3\2\2\2\u0088\u008e\7\24\2\2\u0089\u008a\7F\2\2\u008a\u008b\5@!\2"+
		"\u008b\u008c\7G\2\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089"+
		"\3\2\2\2\u008e\31\3\2\2\2\u008f\u00ea\5,\27\2\u0090\u0091\5,\27\2\u0091"+
		"\u0092\7\25\2\2\u0092\u0093\5\32\16\2\u0093\u00ea\3\2\2\2\u0094\u0095"+
		"\7D\2\2\u0095\u0096\5J&\2\u0096\u0097\5B\"\2\u0097\u0098\7E\2\2\u0098"+
		"\u00ea\3\2\2\2\u0099\u009a\7D\2\2\u009a\u009b\58\35\2\u009b\u009c\5J&"+
		"\2\u009c\u009d\5.\30\2\u009d\u009e\5\60\31\2\u009e\u009f\7E\2\2\u009f"+
		"\u00ea\3\2\2\2\u00a0\u00a1\7D\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7F"+
		"\2\2\u00a3\u00a4\5J&\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\5\32\16\2\u00a6"+
		"\u00a7\7E\2\2\u00a7\u00ea\3\2\2\2\u00a8\u00a9\7D\2\2\u00a9\u00aa\5\64"+
		"\33\2\u00aa\u00ab\5J&\2\u00ab\u00ac\5.\30\2\u00ac\u00ad\5\60\31\2\u00ad"+
		"\u00ae\7E\2\2\u00ae\u00ea\3\2\2\2\u00af\u00b0\7D\2\2\u00b0\u00b2\5\66"+
		"\34\2\u00b1\u00b3\5J&\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\5.\30\2\u00b5\u00b6\5\60\31\2\u00b6\u00b7\7"+
		"E\2\2\u00b7\u00ea\3\2\2\2\u00b8\u00b9\7D\2\2\u00b9\u00bb\5$\23\2\u00ba"+
		"\u00bc\5J&\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2"+
		"\2\u00bd\u00be\5.\30\2\u00be\u00bf\5\60\31\2\u00bf\u00c0\7E\2\2\u00c0"+
		"\u00ea\3\2\2\2\u00c1\u00c2\7D\2\2\u00c2\u00c3\5*\26\2\u00c3\u00c4\5J&"+
		"\2\u00c4\u00c5\5B\"\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7E\2\2\u00c7\u00ea"+
		"\3\2\2\2\u00c8\u00c9\7D\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\5J&\2\u00cb"+
		"\u00cc\5\32\16\2\u00cc\u00cd\7E\2\2\u00cd\u00ea\3\2\2\2\u00ce\u00cf\7"+
		"D\2\2\u00cf\u00d0\5\34\17\2\u00d0\u00d1\5J&\2\u00d1\u00d3\5\32\16\2\u00d2"+
		"\u00d4\5 \21\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\7E\2\2\u00d6\u00ea\3\2\2\2\u00d7\u00d8\7D\2\2\u00d8\u00d9"+
		"\5(\25\2\u00d9\u00da\5J&\2\u00da\u00db\5.\30\2\u00db\u00dc\5\60\31\2\u00dc"+
		"\u00dd\5\32\16\2\u00dd\u00de\7E\2\2\u00de\u00ea\3\2\2\2\u00df\u00e0\7"+
		"D\2\2\u00e0\u00e2\5&\24\2\u00e1\u00e3\5J&\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5\32\16\2\u00e5\u00e6\7"+
		"E\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00ea\5 \21\2\u00e8\u00ea\5B\"\2\u00e9"+
		"\u008f\3\2\2\2\u00e9\u0090\3\2\2\2\u00e9\u0094\3\2\2\2\u00e9\u0099\3\2"+
		"\2\2\u00e9\u00a0\3\2\2\2\u00e9\u00a8\3\2\2\2\u00e9\u00af\3\2\2\2\u00e9"+
		"\u00b8\3\2\2\2\u00e9\u00c1\3\2\2\2\u00e9\u00c8\3\2\2\2\u00e9\u00ce\3\2"+
		"\2\2\u00e9\u00d7\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\33\3\2\2\2\u00eb\u00ec\t\2\2\2\u00ec\35\3\2\2\2\u00ed"+
		"\u00ee\t\3\2\2\u00ee\37\3\2\2\2\u00ef\u00f2\5,\27\2\u00f0\u00f1\7\25\2"+
		"\2\u00f1\u00f3\5\32\16\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00fc\3\2\2\2\u00f4\u00f6\7F\2\2\u00f5\u00f7\5\62\32\2\u00f6\u00f5\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7G\2\2\u00f9"+
		"\u00fa\7(\2\2\u00fa\u00fc\5 \21\2\u00fb\u00ef\3\2\2\2\u00fb\u00f4\3\2"+
		"\2\2\u00fc!\3\2\2\2\u00fd\u00fe\7\31\2\2\u00fe#\3\2\2\2\u00ff\u0100\7"+
		"\35\2\2\u0100%\3\2\2\2\u0101\u0102\7#\2\2\u0102\'\3\2\2\2\u0103\u0104"+
		"\7\"\2\2\u0104)\3\2\2\2\u0105\u0106\7\36\2\2\u0106+\3\2\2\2\u0107\u0108"+
		"\7=\2\2\u0108-\3\2\2\2\u0109\u010a\5\32\16\2\u010a/\3\2\2\2\u010b\u010c"+
		"\5\32\16\2\u010c\61\3\2\2\2\u010d\u010e\5\32\16\2\u010e\u010f\7\27\2\2"+
		"\u010f\u0117\5\32\16\2\u0110\u0111\7\30\2\2\u0111\u0112\5\32\16\2\u0112"+
		"\u0113\7\27\2\2\u0113\u0114\5\32\16\2\u0114\u0116\3\2\2\2\u0115\u0110"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\63\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\t\4\2\2\u011b\65\3\2\2\2\u011c"+
		"\u011d\t\5\2\2\u011d\67\3\2\2\2\u011e\u011f\t\6\2\2\u011f9\3\2\2\2\u0120"+
		"\u0121\5J&\2\u0121;\3\2\2\2\u0122\u0123\5J&\2\u0123=\3\2\2\2\u0124\u0125"+
		"\7=\2\2\u0125?\3\2\2\2\u0126\u0128\5B\"\2\u0127\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aA\3\2\2\2\u012b"+
		"\u012f\5F$\2\u012c\u012f\5H%\2\u012d\u012f\5D#\2\u012e\u012b\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012fC\3\2\2\2\u0130\u0131\7\5\2\2"+
		"\u0131E\3\2\2\2\u0132\u0133\7\3\2\2\u0133G\3\2\2\2\u0134\u0135\7\4\2\2"+
		"\u0135I\3\2\2\2\u0136\u0137\7\13\2\2\u0137K\3\2\2\2\24RWbdqw\u008d\u00b2"+
		"\u00bb\u00d3\u00e2\u00e9\u00f2\u00f6\u00fb\u0117\u0129\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}