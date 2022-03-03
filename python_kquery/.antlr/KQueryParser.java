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
		SignedConstant=1, Constant=2, BinConstant=3, OctConstant=4, HexConstant=5, 
		FloatingPointType=6, IntegerType=7, WidthType=8, BinId=9, OctId=10, WIDTH=11, 
		HexId=12, TrueMatch=13, FalseMatch=14, Query=15, Array=16, Symbolic=17, 
		Colon=18, Arrow=19, Equal=20, COMMA=21, NOT=22, SHL=23, LSHR=24, ASHR=25, 
		CONCAT=26, EXTRACT=27, ZEXT=28, SEXT=29, READ=30, SELECT=31, NEGETION=32, 
		READLSB=33, READMSB=34, PLUS=35, MINUS=36, INT=37, ATR=38, FP=39, BITWISEAND=40, 
		BITWISEOR=41, BITWISEXOR=42, EQ=43, NEQ=44, ULT=45, ULE=46, UGT=47, UGE=48, 
		SLT=49, SLE=50, SGT=51, SGE=52, ADD=53, SUB=54, MUL=55, UDIV=56, UREM=57, 
		SDIV=58, SREM=59, Identifier=60, Whitespace=61, Newline=62, BlockComment=63, 
		LineComment=64, LeftParen=65, RightParen=66, LeftBracket=67, RightBracket=68, 
		LeftBrace=69, RightBrace=70;
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
		RULE_numberList = 30, RULE_number = 31, RULE_widthOrSizeExpr = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"kqueryExpression", "ktranslationUnit", "queryCommand", "queryExpr", 
			"evalExprList", "evalArrayList", "arrayDeclaration", "numArrayElements", 
			"arrayInitializer", "expression", "genericBitRead", "bitExtractExpr", 
			"version", "fullyQualifiedExpression", "notExpr", "concatExpr", "exprNegation", 
			"selectExpr", "arrExtractExpr", "varName", "leftExpr", "rightExpr", "namedConstant", 
			"updateList", "bitwiseExpr", "comparisonExpr", "arithmeticExpr", "domain", 
			"rangeLimit", "arrName", "numberList", "number", "widthOrSizeExpr"
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
			"'SRem'", null, null, null, null, null, "'('", "')'", "'['", "']'", "'{'", 
			"'}'"
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
			"ADD", "SUB", "MUL", "UDIV", "UREM", "SDIV", "SREM", "Identifier", "Whitespace", 
			"Newline", "BlockComment", "LineComment", "LeftParen", "RightParen", 
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
	}

	public final KqueryExpressionContext kqueryExpression() throws RecognitionException {
		KqueryExpressionContext _localctx = new KqueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kqueryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array || _la==LeftParen) {
				{
				{
				setState(66);
				ktranslationUnit();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				arrayDeclaration();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
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
		enterRule(_localctx, 4, RULE_queryCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LeftParen);
			setState(79);
			match(Query);
			setState(80);
			evalExprList();
			setState(81);
			queryExpr();
			setState(82);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				expression();
				setState(86);
				evalExprList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				expression();
				setState(89);
				evalExprList();
				setState(90);
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
	}

	public final EvalExprListContext evalExprList() throws RecognitionException {
		EvalExprListContext _localctx = new EvalExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_evalExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LeftBracket);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SignedConstant) | (1L << Constant) | (1L << TrueMatch) | (1L << FalseMatch) | (1L << Identifier))) != 0) || _la==LeftParen || _la==LeftBracket) {
				{
				{
				setState(95);
				expression();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
	}

	public final EvalArrayListContext evalArrayList() throws RecognitionException {
		EvalArrayListContext _localctx = new EvalArrayListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_evalArrayList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LeftBracket);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(104);
				match(Identifier);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Array);
			setState(113);
			arrName();
			setState(114);
			match(LeftBracket);
			setState(115);
			numArrayElements();
			setState(116);
			match(RightBracket);
			setState(117);
			match(Colon);
			setState(118);
			domain();
			setState(119);
			match(Arrow);
			setState(120);
			rangeLimit();
			setState(121);
			match(Equal);
			setState(122);
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
		enterRule(_localctx, 14, RULE_numArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		enterRule(_localctx, 16, RULE_arrayInitializer);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Symbolic:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(Symbolic);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(LeftBracket);
				setState(128);
				numberList();
				setState(129);
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
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				namedConstant();
				setState(135);
				match(Colon);
				setState(136);
				fullyQualifiedExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(LeftParen);
				setState(139);
				widthOrSizeExpr();
				setState(140);
				number();
				setState(141);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(LeftParen);
				setState(144);
				arithmeticExpr();
				setState(145);
				widthOrSizeExpr();
				setState(146);
				leftExpr();
				setState(147);
				rightExpr();
				setState(148);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(LeftParen);
				setState(151);
				notExpr();
				setState(152);
				match(LeftBracket);
				setState(153);
				widthOrSizeExpr();
				setState(154);
				match(RightBracket);
				setState(155);
				expression();
				setState(156);
				match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(LeftParen);
				setState(159);
				bitwiseExpr();
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				match(LeftParen);
				setState(166);
				comparisonExpr();
				setState(167);
				widthOrSizeExpr();
				setState(168);
				leftExpr();
				setState(169);
				rightExpr();
				setState(170);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				match(LeftParen);
				setState(173);
				comparisonExpr();
				setState(174);
				leftExpr();
				setState(175);
				rightExpr();
				setState(176);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
				match(LeftParen);
				setState(179);
				concatExpr();
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
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
				match(LeftParen);
				setState(186);
				concatExpr();
				setState(187);
				leftExpr();
				setState(188);
				rightExpr();
				setState(189);
				match(RightParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
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
			case 12:
				enterOuterAlt(_localctx, 12);
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
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(204);
				match(LeftParen);
				setState(205);
				genericBitRead();
				setState(206);
				widthOrSizeExpr();
				setState(207);
				expression();
				setState(208);
				version();
				setState(209);
				match(RightParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(211);
				match(LeftParen);
				setState(212);
				selectExpr();
				setState(213);
				widthOrSizeExpr();
				setState(214);
				leftExpr();
				setState(215);
				rightExpr();
				setState(216);
				expression();
				setState(217);
				match(RightParen);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(219);
				match(LeftParen);
				setState(220);
				exprNegation();
				setState(221);
				widthOrSizeExpr();
				setState(222);
				expression();
				setState(223);
				match(RightParen);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(225);
				match(LeftParen);
				setState(226);
				exprNegation();
				setState(227);
				expression();
				setState(228);
				match(RightParen);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(230);
				match(LeftParen);
				setState(231);
				genericBitRead();
				setState(232);
				widthOrSizeExpr();
				setState(233);
				expression();
				setState(234);
				match(RightParen);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(236);
				version();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(237);
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
		enterRule(_localctx, 20, RULE_genericBitRead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 22, RULE_bitExtractExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 24, RULE_version);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				namedConstant();
				setState(246);
				match(Colon);
				setState(247);
				fullyQualifiedExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(LeftBracket);
				setState(250);
				updateList();
				setState(251);
				match(RightBracket);
				setState(252);
				match(ATR);
				setState(253);
				version();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(LeftBracket);
				setState(256);
				match(RightBracket);
				setState(257);
				match(ATR);
				setState(258);
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
		enterRule(_localctx, 26, RULE_fullyQualifiedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 28, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 30, RULE_concatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 32, RULE_exprNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		enterRule(_localctx, 34, RULE_selectExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 36, RULE_arrExtractExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 38, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 40, RULE_leftExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 42, RULE_rightExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 44, RULE_namedConstant);
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
		enterRule(_localctx, 46, RULE_updateList);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				expression();
				setState(282);
				match(Equal);
				setState(283);
				expression();
				setState(284);
				match(COMMA);
				setState(285);
				updateList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				expression();
				setState(288);
				match(Equal);
				setState(289);
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
		enterRule(_localctx, 48, RULE_bitwiseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 50, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 52, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		enterRule(_localctx, 54, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 56, RULE_rangeLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 58, RULE_arrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		enterRule(_localctx, 60, RULE_numberList);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				number();
				setState(307);
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
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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

	public static class WidthOrSizeExprContext extends ParserRuleContext {
		public TerminalNode WidthType() { return getToken(KQueryParser.WidthType, 0); }
		public WidthOrSizeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthOrSizeExpr; }
	}

	public final WidthOrSizeExprContext widthOrSizeExpr() throws RecognitionException {
		WidthOrSizeExprContext _localctx = new WidthOrSizeExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_widthOrSizeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\7"+
		"\6c\n\6\f\6\16\6f\13\6\3\6\3\6\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f1\n\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0106\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0126\n\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5 \u0138"+
		"\n \3!\3!\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@B\2\b\4\2  #$\3\2\36\37\4\2\31\33*,\3\2-\66\3\2"+
		"\67=\4\2\3\4\17\20\2\u013a\2G\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\b^\3\2\2\2"+
		"\n`\3\2\2\2\fi\3\2\2\2\16r\3\2\2\2\20~\3\2\2\2\22\u0085\3\2\2\2\24\u00f0"+
		"\3\2\2\2\26\u00f2\3\2\2\2\30\u00f4\3\2\2\2\32\u0105\3\2\2\2\34\u0107\3"+
		"\2\2\2\36\u0109\3\2\2\2 \u010b\3\2\2\2\"\u010d\3\2\2\2$\u010f\3\2\2\2"+
		"&\u0111\3\2\2\2(\u0113\3\2\2\2*\u0115\3\2\2\2,\u0117\3\2\2\2.\u0119\3"+
		"\2\2\2\60\u0125\3\2\2\2\62\u0127\3\2\2\2\64\u0129\3\2\2\2\66\u012b\3\2"+
		"\2\28\u012d\3\2\2\2:\u012f\3\2\2\2<\u0131\3\2\2\2>\u0137\3\2\2\2@\u0139"+
		"\3\2\2\2B\u013b\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2"+
		"\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\2\2\3K\3\3\2\2\2LO\5\16\b\2MO\5\6\4\2NL\3"+
		"\2\2\2NM\3\2\2\2O\5\3\2\2\2PQ\7C\2\2QR\7\21\2\2RS\5\n\6\2ST\5\b\5\2TU"+
		"\7D\2\2U\7\3\2\2\2V_\5\24\13\2WX\5\24\13\2XY\5\n\6\2Y_\3\2\2\2Z[\5\24"+
		"\13\2[\\\5\n\6\2\\]\5\f\7\2]_\3\2\2\2^V\3\2\2\2^W\3\2\2\2^Z\3\2\2\2_\t"+
		"\3\2\2\2`d\7E\2\2ac\5\24\13\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"eg\3\2\2\2fd\3\2\2\2gh\7F\2\2h\13\3\2\2\2im\7E\2\2jl\7>\2\2kj\3\2\2\2"+
		"lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7F\2\2q\r\3\2\2\2"+
		"rs\7\22\2\2st\5<\37\2tu\7E\2\2uv\5\20\t\2vw\7F\2\2wx\7\24\2\2xy\58\35"+
		"\2yz\7\25\2\2z{\5:\36\2{|\7\26\2\2|}\5\22\n\2}\17\3\2\2\2~\177\7\4\2\2"+
		"\177\21\3\2\2\2\u0080\u0086\7\23\2\2\u0081\u0082\7E\2\2\u0082\u0083\5"+
		"> \2\u0083\u0084\7F\2\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0085"+
		"\u0081\3\2\2\2\u0086\23\3\2\2\2\u0087\u00f1\5(\25\2\u0088\u0089\5.\30"+
		"\2\u0089\u008a\7\24\2\2\u008a\u008b\5\34\17\2\u008b\u00f1\3\2\2\2\u008c"+
		"\u008d\7C\2\2\u008d\u008e\5B\"\2\u008e\u008f\5@!\2\u008f\u0090\7D\2\2"+
		"\u0090\u00f1\3\2\2\2\u0091\u0092\7C\2\2\u0092\u0093\5\66\34\2\u0093\u0094"+
		"\5B\"\2\u0094\u0095\5*\26\2\u0095\u0096\5,\27\2\u0096\u0097\7D\2\2\u0097"+
		"\u00f1\3\2\2\2\u0098\u0099\7C\2\2\u0099\u009a\5\36\20\2\u009a\u009b\7"+
		"E\2\2\u009b\u009c\5B\"\2\u009c\u009d\7F\2\2\u009d\u009e\5\24\13\2\u009e"+
		"\u009f\7D\2\2\u009f\u00f1\3\2\2\2\u00a0\u00a1\7C\2\2\u00a1\u00a2\5\62"+
		"\32\2\u00a2\u00a3\5B\"\2\u00a3\u00a4\5*\26\2\u00a4\u00a5\5,\27\2\u00a5"+
		"\u00a6\7D\2\2\u00a6\u00f1\3\2\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9\5\64"+
		"\33\2\u00a9\u00aa\5B\"\2\u00aa\u00ab\5*\26\2\u00ab\u00ac\5,\27\2\u00ac"+
		"\u00ad\7D\2\2\u00ad\u00f1\3\2\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\5\64"+
		"\33\2\u00b0\u00b1\5*\26\2\u00b1\u00b2\5,\27\2\u00b2\u00b3\7D\2\2\u00b3"+
		"\u00f1\3\2\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7\5B\""+
		"\2\u00b7\u00b8\5*\26\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\7D\2\2\u00ba\u00f1"+
		"\3\2\2\2\u00bb\u00bc\7C\2\2\u00bc\u00bd\5 \21\2\u00bd\u00be\5*\26\2\u00be"+
		"\u00bf\5,\27\2\u00bf\u00c0\7D\2\2\u00c0\u00f1\3\2\2\2\u00c1\u00c2\7C\2"+
		"\2\u00c2\u00c3\5&\24\2\u00c3\u00c4\5B\"\2\u00c4\u00c5\5@!\2\u00c5\u00c6"+
		"\5\24\13\2\u00c6\u00c7\7D\2\2\u00c7\u00f1\3\2\2\2\u00c8\u00c9\7C\2\2\u00c9"+
		"\u00ca\5\30\r\2\u00ca\u00cb\5B\"\2\u00cb\u00cc\5\24\13\2\u00cc\u00cd\7"+
		"D\2\2\u00cd\u00f1\3\2\2\2\u00ce\u00cf\7C\2\2\u00cf\u00d0\5\26\f\2\u00d0"+
		"\u00d1\5B\"\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4"+
		"\7D\2\2\u00d4\u00f1\3\2\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\5$\23\2\u00d7"+
		"\u00d8\5B\"\2\u00d8\u00d9\5*\26\2\u00d9\u00da\5,\27\2\u00da\u00db\5\24"+
		"\13\2\u00db\u00dc\7D\2\2\u00dc\u00f1\3\2\2\2\u00dd\u00de\7C\2\2\u00de"+
		"\u00df\5\"\22\2\u00df\u00e0\5B\"\2\u00e0\u00e1\5\24\13\2\u00e1\u00e2\7"+
		"D\2\2\u00e2\u00f1\3\2\2\2\u00e3\u00e4\7C\2\2\u00e4\u00e5\5\"\22\2\u00e5"+
		"\u00e6\5\24\13\2\u00e6\u00e7\7D\2\2\u00e7\u00f1\3\2\2\2\u00e8\u00e9\7"+
		"C\2\2\u00e9\u00ea\5\26\f\2\u00ea\u00eb\5B\"\2\u00eb\u00ec\5\24\13\2\u00ec"+
		"\u00ed\7D\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f1\5\32\16\2\u00ef\u00f1\5"+
		"@!\2\u00f0\u0087\3\2\2\2\u00f0\u0088\3\2\2\2\u00f0\u008c\3\2\2\2\u00f0"+
		"\u0091\3\2\2\2\u00f0\u0098\3\2\2\2\u00f0\u00a0\3\2\2\2\u00f0\u00a7\3\2"+
		"\2\2\u00f0\u00ae\3\2\2\2\u00f0\u00b4\3\2\2\2\u00f0\u00bb\3\2\2\2\u00f0"+
		"\u00c1\3\2\2\2\u00f0\u00c8\3\2\2\2\u00f0\u00ce\3\2\2\2\u00f0\u00d5\3\2"+
		"\2\2\u00f0\u00dd\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\25\3\2\2\2\u00f2\u00f3\t\2\2"+
		"\2\u00f3\27\3\2\2\2\u00f4\u00f5\t\3\2\2\u00f5\31\3\2\2\2\u00f6\u0106\5"+
		"(\25\2\u00f7\u00f8\5.\30\2\u00f8\u00f9\7\24\2\2\u00f9\u00fa\5\34\17\2"+
		"\u00fa\u0106\3\2\2\2\u00fb\u00fc\7E\2\2\u00fc\u00fd\5\60\31\2\u00fd\u00fe"+
		"\7F\2\2\u00fe\u00ff\7(\2\2\u00ff\u0100\5\32\16\2\u0100\u0106\3\2\2\2\u0101"+
		"\u0102\7E\2\2\u0102\u0103\7F\2\2\u0103\u0104\7(\2\2\u0104\u0106\5\32\16"+
		"\2\u0105\u00f6\3\2\2\2\u0105\u00f7\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u0101"+
		"\3\2\2\2\u0106\33\3\2\2\2\u0107\u0108\5\24\13\2\u0108\35\3\2\2\2\u0109"+
		"\u010a\7\30\2\2\u010a\37\3\2\2\2\u010b\u010c\7\34\2\2\u010c!\3\2\2\2\u010d"+
		"\u010e\7\"\2\2\u010e#\3\2\2\2\u010f\u0110\7!\2\2\u0110%\3\2\2\2\u0111"+
		"\u0112\7\35\2\2\u0112\'\3\2\2\2\u0113\u0114\7>\2\2\u0114)\3\2\2\2\u0115"+
		"\u0116\5\24\13\2\u0116+\3\2\2\2\u0117\u0118\5\24\13\2\u0118-\3\2\2\2\u0119"+
		"\u011a\7>\2\2\u011a/\3\2\2\2\u011b\u011c\5\24\13\2\u011c\u011d\7\26\2"+
		"\2\u011d\u011e\5\24\13\2\u011e\u011f\7\27\2\2\u011f\u0120\5\60\31\2\u0120"+
		"\u0126\3\2\2\2\u0121\u0122\5\24\13\2\u0122\u0123\7\26\2\2\u0123\u0124"+
		"\5\24\13\2\u0124\u0126\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u0121\3\2\2\2"+
		"\u0126\61\3\2\2\2\u0127\u0128\t\4\2\2\u0128\63\3\2\2\2\u0129\u012a\t\5"+
		"\2\2\u012a\65\3\2\2\2\u012b\u012c\t\6\2\2\u012c\67\3\2\2\2\u012d\u012e"+
		"\5B\"\2\u012e9\3\2\2\2\u012f\u0130\5B\"\2\u0130;\3\2\2\2\u0131\u0132\7"+
		">\2\2\u0132=\3\2\2\2\u0133\u0138\5@!\2\u0134\u0135\5@!\2\u0135\u0136\5"+
		"> \2\u0136\u0138\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0138"+
		"?\3\2\2\2\u0139\u013a\t\7\2\2\u013aA\3\2\2\2\u013b\u013c\7\n\2\2\u013c"+
		"C\3\2\2\2\fGN^dm\u0085\u00f0\u0105\u0125\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}