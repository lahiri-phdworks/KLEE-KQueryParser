// Generated from /home/clustfuzz/Documents/LLVM/KLEE-KQueryParser/python_kquery/KQuery.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		RULE_fullyQualifiedExpression = 16, RULE_notExpr = 17, RULE_concatExpr = 18, 
		RULE_exprNegation = 19, RULE_selectExpr = 20, RULE_arrExtractExpr = 21, 
		RULE_varName = 22, RULE_leftExpr = 23, RULE_rightExpr = 24, RULE_namedConstant = 25, 
		RULE_updateList = 26, RULE_bitwiseExpr = 27, RULE_comparisonExpr = 28, 
		RULE_arithmeticExpr = 29, RULE_domain = 30, RULE_rangeLimit = 31, RULE_arrName = 32, 
		RULE_numberList = 33, RULE_number = 34, RULE_constant = 35, RULE_boolnum = 36, 
		RULE_signedConstant = 37, RULE_widthOrSizeExpr = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"kqueryExpression", "queryStatements", "ktranslationUnit", "queryCommand", 
			"queryExpr", "evalExprList", "evalArrayList", "expressionList", "identifierList", 
			"arrayDeclaration", "numArrayElements", "arrayInitializer", "expression", 
			"genericBitRead", "bitExtractExpr", "version", "fullyQualifiedExpression", 
			"notExpr", "concatExpr", "exprNegation", "selectExpr", "arrExtractExpr", 
			"varName", "leftExpr", "rightExpr", "namedConstant", "updateList", "bitwiseExpr", 
			"comparisonExpr", "arithmeticExpr", "domain", "rangeLimit", "arrName", 
			"numberList", "number", "constant", "boolnum", "signedConstant", "widthOrSizeExpr"
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
	}

	public final KqueryExpressionContext kqueryExpression() throws RecognitionException {
		KqueryExpressionContext _localctx = new KqueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kqueryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			queryStatements();
			setState(79);
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
	}

	public final QueryStatementsContext queryStatements() throws RecognitionException {
		QueryStatementsContext _localctx = new QueryStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_queryStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array || _la==LeftParen) {
				{
				{
				setState(81);
				ktranslationUnit();
				}
				}
				setState(86);
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
	}

	public final KtranslationUnitContext ktranslationUnit() throws RecognitionException {
		KtranslationUnitContext _localctx = new KtranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ktranslationUnit);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				arrayDeclaration();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
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
	}

	public final QueryCommandContext queryCommand() throws RecognitionException {
		QueryCommandContext _localctx = new QueryCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LeftParen);
			setState(92);
			match(Query);
			setState(93);
			evalExprList();
			setState(94);
			queryExpr();
			setState(95);
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
		enterRule(_localctx, 8, RULE_queryExpr);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				expression();
				setState(99);
				evalExprList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				expression();
				setState(102);
				evalExprList();
				setState(103);
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
	}

	public final EvalExprListContext evalExprList() throws RecognitionException {
		EvalExprListContext _localctx = new EvalExprListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_evalExprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(LeftBracket);
			setState(108);
			expressionList();
			setState(109);
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
	}

	public final EvalArrayListContext evalArrayList() throws RecognitionException {
		EvalArrayListContext _localctx = new EvalArrayListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_evalArrayList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LeftBracket);
			setState(112);
			identifierList();
			setState(113);
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
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << SignedConstant) | (1L << Constant) | (1L << Identifier))) != 0) || _la==LeftParen || _la==LeftBracket) {
				{
				{
				setState(115);
				expression();
				}
				}
				setState(120);
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
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(121);
				match(Identifier);
				}
				}
				setState(126);
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
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(Array);
			setState(128);
			arrName();
			setState(129);
			match(LeftBracket);
			setState(130);
			numArrayElements();
			setState(131);
			match(RightBracket);
			setState(132);
			match(Colon);
			setState(133);
			domain();
			setState(134);
			match(Arrow);
			setState(135);
			rangeLimit();
			setState(136);
			match(Equal);
			setState(137);
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
	}

	public final NumArrayElementsContext numArrayElements() throws RecognitionException {
		NumArrayElementsContext _localctx = new NumArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayInitializer);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Symbolic:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(Symbolic);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(LeftBracket);
				setState(143);
				numberList();
				setState(144);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				namedConstant();
				setState(150);
				match(Colon);
				setState(151);
				fullyQualifiedExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(LeftParen);
				setState(154);
				widthOrSizeExpr();
				setState(155);
				number();
				setState(156);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(LeftParen);
				setState(159);
				arithmeticExpr();
				setState(160);
				widthOrSizeExpr();
				setState(161);
				leftExpr();
				setState(162);
				rightExpr();
				setState(163);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(LeftParen);
				setState(166);
				notExpr();
				setState(167);
				match(LeftBracket);
				setState(168);
				widthOrSizeExpr();
				setState(169);
				match(RightBracket);
				setState(170);
				expression();
				setState(171);
				match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(LeftParen);
				setState(174);
				bitwiseExpr();
				setState(175);
				widthOrSizeExpr();
				setState(176);
				leftExpr();
				setState(177);
				rightExpr();
				setState(178);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				match(LeftParen);
				setState(181);
				comparisonExpr();
				setState(182);
				widthOrSizeExpr();
				setState(183);
				leftExpr();
				setState(184);
				rightExpr();
				setState(185);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(187);
				match(LeftParen);
				setState(188);
				comparisonExpr();
				setState(189);
				leftExpr();
				setState(190);
				rightExpr();
				setState(191);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(193);
				match(LeftParen);
				setState(194);
				concatExpr();
				setState(195);
				widthOrSizeExpr();
				setState(196);
				leftExpr();
				setState(197);
				rightExpr();
				setState(198);
				match(RightParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(200);
				match(LeftParen);
				setState(201);
				concatExpr();
				setState(202);
				leftExpr();
				setState(203);
				rightExpr();
				setState(204);
				match(RightParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(206);
				match(LeftParen);
				setState(207);
				arrExtractExpr();
				setState(208);
				widthOrSizeExpr();
				setState(209);
				number();
				setState(210);
				expression();
				setState(211);
				match(RightParen);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(213);
				match(LeftParen);
				setState(214);
				bitExtractExpr();
				setState(215);
				widthOrSizeExpr();
				setState(216);
				expression();
				setState(217);
				match(RightParen);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(219);
				match(LeftParen);
				setState(220);
				genericBitRead();
				setState(221);
				widthOrSizeExpr();
				setState(222);
				expression();
				setState(223);
				version();
				setState(224);
				match(RightParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(226);
				match(LeftParen);
				setState(227);
				selectExpr();
				setState(228);
				widthOrSizeExpr();
				setState(229);
				leftExpr();
				setState(230);
				rightExpr();
				setState(231);
				expression();
				setState(232);
				match(RightParen);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(234);
				match(LeftParen);
				setState(235);
				exprNegation();
				setState(236);
				widthOrSizeExpr();
				setState(237);
				expression();
				setState(238);
				match(RightParen);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(240);
				match(LeftParen);
				setState(241);
				exprNegation();
				setState(242);
				expression();
				setState(243);
				match(RightParen);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(245);
				match(LeftParen);
				setState(246);
				genericBitRead();
				setState(247);
				widthOrSizeExpr();
				setState(248);
				expression();
				setState(249);
				match(RightParen);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(251);
				version();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(252);
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
	}

	public final GenericBitReadContext genericBitRead() throws RecognitionException {
		GenericBitReadContext _localctx = new GenericBitReadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_genericBitRead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
	}

	public final BitExtractExprContext bitExtractExpr() throws RecognitionException {
		BitExtractExprContext _localctx = new BitExtractExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bitExtractExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_version);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				namedConstant();
				setState(261);
				match(Colon);
				setState(262);
				fullyQualifiedExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(LeftBracket);
				setState(265);
				updateList();
				setState(266);
				match(RightBracket);
				setState(267);
				match(ATR);
				setState(268);
				version();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(LeftBracket);
				setState(271);
				match(RightBracket);
				setState(272);
				match(ATR);
				setState(273);
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
	}

	public final FullyQualifiedExpressionContext fullyQualifiedExpression() throws RecognitionException {
		FullyQualifiedExpressionContext _localctx = new FullyQualifiedExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fullyQualifiedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
	}

	public final ConcatExprContext concatExpr() throws RecognitionException {
		ConcatExprContext _localctx = new ConcatExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_concatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
	}

	public final ExprNegationContext exprNegation() throws RecognitionException {
		ExprNegationContext _localctx = new ExprNegationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selectExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
	}

	public final ArrExtractExprContext arrExtractExpr() throws RecognitionException {
		ArrExtractExprContext _localctx = new ArrExtractExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrExtractExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
	}

	public final LeftExprContext leftExpr() throws RecognitionException {
		LeftExprContext _localctx = new LeftExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_leftExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
	}

	public final RightExprContext rightExpr() throws RecognitionException {
		RightExprContext _localctx = new RightExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rightExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
	}

	public final NamedConstantContext namedConstant() throws RecognitionException {
		NamedConstantContext _localctx = new NamedConstantContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_namedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
	}

	public final UpdateListContext updateList() throws RecognitionException {
		UpdateListContext _localctx = new UpdateListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_updateList);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				expression();
				setState(297);
				match(Equal);
				setState(298);
				expression();
				setState(299);
				match(COMMA);
				setState(300);
				updateList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				expression();
				setState(303);
				match(Equal);
				setState(304);
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
	}

	public final BitwiseExprContext bitwiseExpr() throws RecognitionException {
		BitwiseExprContext _localctx = new BitwiseExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bitwiseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
	}

	public final RangeLimitContext rangeLimit() throws RecognitionException {
		RangeLimitContext _localctx = new RangeLimitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rangeLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
	}

	public final ArrNameContext arrName() throws RecognitionException {
		ArrNameContext _localctx = new ArrNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		enterRule(_localctx, 66, RULE_numberList);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				number();
				setState(322);
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
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_number);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				boolnum();
				}
				break;
			case SignedConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				signedConstant();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
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
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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
	}

	public final BoolnumContext boolnum() throws RecognitionException {
		BoolnumContext _localctx = new BoolnumContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_boolnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
	}

	public final SignedConstantContext signedConstant() throws RecognitionException {
		SignedConstantContext _localctx = new SignedConstantContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_signedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
	}

	public final WidthOrSizeExprContext widthOrSizeExpr() throws RecognitionException {
		WidthOrSizeExprContext _localctx = new WidthOrSizeExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_widthOrSizeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\7\3"+
		"U\n\3\f\3\16\3X\13\3\3\4\3\4\5\4\\\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\7\tw\n\t\f\t\16\tz\13\t\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0095\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0100\n\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0115\n\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0135\n\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\5#\u0147\n#"+
		"\3$\3$\3$\5$\u014c\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\2\2)\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\7\4\2!!$%"+
		"\3\2\37 \4\2\32\34*,\3\2-\66\3\2\67=\2\u014e\2P\3\2\2\2\4V\3\2\2\2\6["+
		"\3\2\2\2\b]\3\2\2\2\nk\3\2\2\2\fm\3\2\2\2\16q\3\2\2\2\20x\3\2\2\2\22~"+
		"\3\2\2\2\24\u0081\3\2\2\2\26\u008d\3\2\2\2\30\u0094\3\2\2\2\32\u00ff\3"+
		"\2\2\2\34\u0101\3\2\2\2\36\u0103\3\2\2\2 \u0114\3\2\2\2\"\u0116\3\2\2"+
		"\2$\u0118\3\2\2\2&\u011a\3\2\2\2(\u011c\3\2\2\2*\u011e\3\2\2\2,\u0120"+
		"\3\2\2\2.\u0122\3\2\2\2\60\u0124\3\2\2\2\62\u0126\3\2\2\2\64\u0128\3\2"+
		"\2\2\66\u0134\3\2\2\28\u0136\3\2\2\2:\u0138\3\2\2\2<\u013a\3\2\2\2>\u013c"+
		"\3\2\2\2@\u013e\3\2\2\2B\u0140\3\2\2\2D\u0146\3\2\2\2F\u014b\3\2\2\2H"+
		"\u014d\3\2\2\2J\u014f\3\2\2\2L\u0151\3\2\2\2N\u0153\3\2\2\2PQ\5\4\3\2"+
		"QR\7\2\2\3R\3\3\2\2\2SU\5\6\4\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2"+
		"\2W\5\3\2\2\2XV\3\2\2\2Y\\\5\24\13\2Z\\\5\b\5\2[Y\3\2\2\2[Z\3\2\2\2\\"+
		"\7\3\2\2\2]^\7D\2\2^_\7\22\2\2_`\5\f\7\2`a\5\n\6\2ab\7E\2\2b\t\3\2\2\2"+
		"cl\5\32\16\2de\5\32\16\2ef\5\f\7\2fl\3\2\2\2gh\5\32\16\2hi\5\f\7\2ij\5"+
		"\16\b\2jl\3\2\2\2kc\3\2\2\2kd\3\2\2\2kg\3\2\2\2l\13\3\2\2\2mn\7F\2\2n"+
		"o\5\20\t\2op\7G\2\2p\r\3\2\2\2qr\7F\2\2rs\5\22\n\2st\7G\2\2t\17\3\2\2"+
		"\2uw\5\32\16\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\21\3\2\2\2zx\3"+
		"\2\2\2{}\7>\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\23"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\23\2\2\u0082\u0083\5B\"\2\u0083"+
		"\u0084\7F\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7G\2\2\u0086\u0087\7\25"+
		"\2\2\u0087\u0088\5> \2\u0088\u0089\7\26\2\2\u0089\u008a\5@!\2\u008a\u008b"+
		"\7\27\2\2\u008b\u008c\5\30\r\2\u008c\25\3\2\2\2\u008d\u008e\7\5\2\2\u008e"+
		"\27\3\2\2\2\u008f\u0095\7\24\2\2\u0090\u0091\7F\2\2\u0091\u0092\5D#\2"+
		"\u0092\u0093\7G\2\2\u0093\u0095\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090"+
		"\3\2\2\2\u0095\31\3\2\2\2\u0096\u0100\5.\30\2\u0097\u0098\5\64\33\2\u0098"+
		"\u0099\7\25\2\2\u0099\u009a\5\"\22\2\u009a\u0100\3\2\2\2\u009b\u009c\7"+
		"D\2\2\u009c\u009d\5N(\2\u009d\u009e\5F$\2\u009e\u009f\7E\2\2\u009f\u0100"+
		"\3\2\2\2\u00a0\u00a1\7D\2\2\u00a1\u00a2\5<\37\2\u00a2\u00a3\5N(\2\u00a3"+
		"\u00a4\5\60\31\2\u00a4\u00a5\5\62\32\2\u00a5\u00a6\7E\2\2\u00a6\u0100"+
		"\3\2\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9\5$\23\2\u00a9\u00aa\7F\2\2\u00aa"+
		"\u00ab\5N(\2\u00ab\u00ac\7G\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\7E\2"+
		"\2\u00ae\u0100\3\2\2\2\u00af\u00b0\7D\2\2\u00b0\u00b1\58\35\2\u00b1\u00b2"+
		"\5N(\2\u00b2\u00b3\5\60\31\2\u00b3\u00b4\5\62\32\2\u00b4\u00b5\7E\2\2"+
		"\u00b5\u0100\3\2\2\2\u00b6\u00b7\7D\2\2\u00b7\u00b8\5:\36\2\u00b8\u00b9"+
		"\5N(\2\u00b9\u00ba\5\60\31\2\u00ba\u00bb\5\62\32\2\u00bb\u00bc\7E\2\2"+
		"\u00bc\u0100\3\2\2\2\u00bd\u00be\7D\2\2\u00be\u00bf\5:\36\2\u00bf\u00c0"+
		"\5\60\31\2\u00c0\u00c1\5\62\32\2\u00c1\u00c2\7E\2\2\u00c2\u0100\3\2\2"+
		"\2\u00c3\u00c4\7D\2\2\u00c4\u00c5\5&\24\2\u00c5\u00c6\5N(\2\u00c6\u00c7"+
		"\5\60\31\2\u00c7\u00c8\5\62\32\2\u00c8\u00c9\7E\2\2\u00c9\u0100\3\2\2"+
		"\2\u00ca\u00cb\7D\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd\5\60\31\2\u00cd"+
		"\u00ce\5\62\32\2\u00ce\u00cf\7E\2\2\u00cf\u0100\3\2\2\2\u00d0\u00d1\7"+
		"D\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d3\5N(\2\u00d3\u00d4\5F$\2\u00d4\u00d5"+
		"\5\32\16\2\u00d5\u00d6\7E\2\2\u00d6\u0100\3\2\2\2\u00d7\u00d8\7D\2\2\u00d8"+
		"\u00d9\5\36\20\2\u00d9\u00da\5N(\2\u00da\u00db\5\32\16\2\u00db\u00dc\7"+
		"E\2\2\u00dc\u0100\3\2\2\2\u00dd\u00de\7D\2\2\u00de\u00df\5\34\17\2\u00df"+
		"\u00e0\5N(\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7E"+
		"\2\2\u00e3\u0100\3\2\2\2\u00e4\u00e5\7D\2\2\u00e5\u00e6\5*\26\2\u00e6"+
		"\u00e7\5N(\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\5\62\32\2\u00e9\u00ea\5"+
		"\32\16\2\u00ea\u00eb\7E\2\2\u00eb\u0100\3\2\2\2\u00ec\u00ed\7D\2\2\u00ed"+
		"\u00ee\5(\25\2\u00ee\u00ef\5N(\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\7E"+
		"\2\2\u00f1\u0100\3\2\2\2\u00f2\u00f3\7D\2\2\u00f3\u00f4\5(\25\2\u00f4"+
		"\u00f5\5\32\16\2\u00f5\u00f6\7E\2\2\u00f6\u0100\3\2\2\2\u00f7\u00f8\7"+
		"D\2\2\u00f8\u00f9\5\34\17\2\u00f9\u00fa\5N(\2\u00fa\u00fb\5\32\16\2\u00fb"+
		"\u00fc\7E\2\2\u00fc\u0100\3\2\2\2\u00fd\u0100\5 \21\2\u00fe\u0100\5F$"+
		"\2\u00ff\u0096\3\2\2\2\u00ff\u0097\3\2\2\2\u00ff\u009b\3\2\2\2\u00ff\u00a0"+
		"\3\2\2\2\u00ff\u00a7\3\2\2\2\u00ff\u00af\3\2\2\2\u00ff\u00b6\3\2\2\2\u00ff"+
		"\u00bd\3\2\2\2\u00ff\u00c3\3\2\2\2\u00ff\u00ca\3\2\2\2\u00ff\u00d0\3\2"+
		"\2\2\u00ff\u00d7\3\2\2\2\u00ff\u00dd\3\2\2\2\u00ff\u00e4\3\2\2\2\u00ff"+
		"\u00ec\3\2\2\2\u00ff\u00f2\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u00fe\3\2\2\2\u0100\33\3\2\2\2\u0101\u0102\t\2\2\2\u0102\35"+
		"\3\2\2\2\u0103\u0104\t\3\2\2\u0104\37\3\2\2\2\u0105\u0115\5.\30\2\u0106"+
		"\u0107\5\64\33\2\u0107\u0108\7\25\2\2\u0108\u0109\5\"\22\2\u0109\u0115"+
		"\3\2\2\2\u010a\u010b\7F\2\2\u010b\u010c\5\66\34\2\u010c\u010d\7G\2\2\u010d"+
		"\u010e\7(\2\2\u010e\u010f\5 \21\2\u010f\u0115\3\2\2\2\u0110\u0111\7F\2"+
		"\2\u0111\u0112\7G\2\2\u0112\u0113\7(\2\2\u0113\u0115\5 \21\2\u0114\u0105"+
		"\3\2\2\2\u0114\u0106\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u0110\3\2\2\2\u0115"+
		"!\3\2\2\2\u0116\u0117\5\32\16\2\u0117#\3\2\2\2\u0118\u0119\7\31\2\2\u0119"+
		"%\3\2\2\2\u011a\u011b\7\35\2\2\u011b\'\3\2\2\2\u011c\u011d\7#\2\2\u011d"+
		")\3\2\2\2\u011e\u011f\7\"\2\2\u011f+\3\2\2\2\u0120\u0121\7\36\2\2\u0121"+
		"-\3\2\2\2\u0122\u0123\7>\2\2\u0123/\3\2\2\2\u0124\u0125\5\32\16\2\u0125"+
		"\61\3\2\2\2\u0126\u0127\5\32\16\2\u0127\63\3\2\2\2\u0128\u0129\7>\2\2"+
		"\u0129\65\3\2\2\2\u012a\u012b\5\32\16\2\u012b\u012c\7\27\2\2\u012c\u012d"+
		"\5\32\16\2\u012d\u012e\7\30\2\2\u012e\u012f\5\66\34\2\u012f\u0135\3\2"+
		"\2\2\u0130\u0131\5\32\16\2\u0131\u0132\7\27\2\2\u0132\u0133\5\32\16\2"+
		"\u0133\u0135\3\2\2\2\u0134\u012a\3\2\2\2\u0134\u0130\3\2\2\2\u0135\67"+
		"\3\2\2\2\u0136\u0137\t\4\2\2\u01379\3\2\2\2\u0138\u0139\t\5\2\2\u0139"+
		";\3\2\2\2\u013a\u013b\t\6\2\2\u013b=\3\2\2\2\u013c\u013d\5N(\2\u013d?"+
		"\3\2\2\2\u013e\u013f\5N(\2\u013fA\3\2\2\2\u0140\u0141\7>\2\2\u0141C\3"+
		"\2\2\2\u0142\u0147\5F$\2\u0143\u0144\5F$\2\u0144\u0145\5D#\2\u0145\u0147"+
		"\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0147E\3\2\2\2\u0148"+
		"\u014c\5J&\2\u0149\u014c\5L\'\2\u014a\u014c\5H%\2\u014b\u0148\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014cG\3\2\2\2\u014d\u014e\7"+
		"\5\2\2\u014eI\3\2\2\2\u014f\u0150\7\3\2\2\u0150K\3\2\2\2\u0151\u0152\7"+
		"\4\2\2\u0152M\3\2\2\2\u0153\u0154\7\13\2\2\u0154O\3\2\2\2\rV[kx~\u0094"+
		"\u00ff\u0114\u0134\u0146\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}