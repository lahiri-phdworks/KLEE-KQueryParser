// Generated from /home/clustfuzz/Documents/LLVM/KLEE-KQueryParser/langRef/kquery.g4 by ANTLR 4.8
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
		T__45=46, T__46=47, T__47=48, T__48=49, TYPE=50, LeftParen=51, RightParen=52, 
		LeftBracket=53, RightBracket=54, LeftBrace=55, RightBrace=56, HexExtend=57, 
		OctalExtend=58, BinExtend=59, Digit=60, StartLetter=61, AlphaNumericSpl=62;
	public static final int
		RULE_kqueryExpression = 0, RULE_arrayDeclaration = 1, RULE_arrayInitializer = 2, 
		RULE_expression = 3, RULE_bitwiseExpr = 4, RULE_comparisonExpr = 5, RULE_arithmeticExpr = 6, 
		RULE_domain = 7, RULE_rangeLimit = 8, RULE_arrName = 9, RULE_numberList = 10, 
		RULE_number = 11, RULE_signedConstant = 12, RULE_decConstant = 13, RULE_binConstant = 14, 
		RULE_octConstant = 15, RULE_hexConstant = 16, RULE_identifier = 17, RULE_floatingPointType = 18, 
		RULE_integerType = 19, RULE_version = 20, RULE_updateList = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"kqueryExpression", "arrayDeclaration", "arrayInitializer", "expression", 
			"bitwiseExpr", "comparisonExpr", "arithmeticExpr", "domain", "rangeLimit", 
			"arrName", "numberList", "number", "signedConstant", "decConstant", "binConstant", 
			"octConstant", "hexConstant", "identifier", "floatingPointType", "integerType", 
			"version", "updateList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'array'", "':'", "'->'", "'='", "'symbolic'", "'Not'", "'Shl'", 
			"'LShr'", "'AShr'", "'Concat'", "'Extract'", "'ZExt'", "'SExt'", "'Read'", 
			"'Select'", "'Neg'", "'ReadLSB'", "'ReadMSB'", "'And'", "'Or'", "'Xor'", 
			"'Eq'", "'Ne'", "'Ult'", "'Ule'", "'Ugt'", "'Uge'", "'Slt'", "'Sle'", 
			"'Sgt'", "'Sge'", "'Add'", "'Sub'", "'Mul'", "'UDiv'", "'URem'", "'SDiv'", 
			"'SRem'", "','", "'true'", "'false'", "'+'", "'-'", "'0b'", "'0o'", "'0x'", 
			"'fp'", "'i'", "'@'", "'w(0-9)+'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TYPE", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "HexExtend", "OctalExtend", "BinExtend", "Digit", 
			"StartLetter", "AlphaNumericSpl"
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
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
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
			setState(44);
			arrayDeclaration();
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
		public DecConstantContext decConstant() {
			return getRuleContext(DecConstantContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			arrName();
			setState(48);
			match(LeftBracket);
			{
			setState(49);
			decConstant();
			}
			setState(50);
			match(RightBracket);
			setState(51);
			match(T__1);
			setState(52);
			domain();
			setState(53);
			match(T__2);
			setState(54);
			rangeLimit();
			setState(55);
			match(T__3);
			setState(56);
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
		enterRule(_localctx, 4, RULE_arrayInitializer);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__4);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(LeftBracket);
				setState(60);
				numberList();
				setState(61);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(kqueryParser.LeftParen, 0); }
		public TerminalNode TYPE() { return getToken(kqueryParser.TYPE, 0); }
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
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				identifier();
				setState(67);
				match(T__1);
				setState(68);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(LeftParen);
				setState(72);
				match(TYPE);
				setState(73);
				number();
				setState(74);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(LeftParen);
				setState(77);
				arithmeticExpr();
				setState(78);
				match(TYPE);
				setState(79);
				expression();
				setState(80);
				expression();
				setState(81);
				match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(LeftParen);
				setState(84);
				match(T__5);
				setState(85);
				match(LeftBracket);
				setState(86);
				match(TYPE);
				setState(87);
				match(RightBracket);
				setState(88);
				expression();
				setState(89);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(LeftParen);
				setState(92);
				bitwiseExpr();
				setState(93);
				match(TYPE);
				setState(94);
				expression();
				setState(95);
				expression();
				setState(96);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(LeftParen);
				setState(99);
				match(T__6);
				setState(100);
				match(TYPE);
				setState(101);
				expression();
				setState(102);
				expression();
				setState(103);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				match(LeftParen);
				setState(106);
				match(T__7);
				setState(107);
				match(TYPE);
				setState(108);
				expression();
				setState(109);
				expression();
				setState(110);
				match(RightParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(112);
				match(LeftParen);
				setState(113);
				match(T__8);
				setState(114);
				match(TYPE);
				setState(115);
				expression();
				setState(116);
				expression();
				setState(117);
				match(RightParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(119);
				match(LeftParen);
				setState(120);
				comparisonExpr();
				{
				setState(121);
				match(TYPE);
				}
				setState(122);
				expression();
				setState(123);
				expression();
				setState(124);
				match(RightParen);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(126);
				match(LeftParen);
				setState(127);
				match(T__9);
				{
				setState(128);
				match(TYPE);
				}
				setState(129);
				expression();
				setState(130);
				expression();
				setState(131);
				match(RightParen);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(133);
				match(LeftParen);
				setState(134);
				match(T__10);
				setState(135);
				match(TYPE);
				setState(136);
				number();
				setState(137);
				expression();
				setState(138);
				match(RightParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(140);
				match(LeftParen);
				setState(141);
				match(T__11);
				setState(142);
				match(TYPE);
				setState(143);
				expression();
				setState(144);
				match(RightParen);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(146);
				match(LeftParen);
				setState(147);
				match(T__12);
				setState(148);
				match(TYPE);
				setState(149);
				expression();
				setState(150);
				match(RightParen);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(152);
				match(LeftParen);
				setState(153);
				match(T__13);
				setState(154);
				match(TYPE);
				setState(155);
				expression();
				setState(156);
				version();
				setState(157);
				match(RightParen);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(159);
				match(LeftParen);
				setState(160);
				match(T__14);
				setState(161);
				match(TYPE);
				setState(162);
				expression();
				setState(163);
				expression();
				setState(164);
				expression();
				setState(165);
				match(RightParen);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(167);
				match(LeftParen);
				setState(168);
				match(T__15);
				{
				setState(169);
				match(TYPE);
				}
				setState(170);
				expression();
				setState(171);
				match(RightParen);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(173);
				match(LeftParen);
				setState(174);
				match(T__16);
				setState(175);
				match(TYPE);
				setState(176);
				expression();
				setState(177);
				version();
				setState(178);
				match(RightParen);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(180);
				match(LeftParen);
				setState(181);
				match(T__17);
				setState(182);
				match(TYPE);
				setState(183);
				expression();
				setState(184);
				version();
				setState(185);
				match(RightParen);
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
		enterRule(_localctx, 8, RULE_bitwiseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		enterRule(_localctx, 10, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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
		enterRule(_localctx, 12, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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
		public TerminalNode TYPE() { return getToken(kqueryParser.TYPE, 0); }
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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

	public static class RangeLimitContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(kqueryParser.TYPE, 0); }
		public RangeLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLimit; }
	}

	public final RangeLimitContext rangeLimit() throws RecognitionException {
		RangeLimitContext _localctx = new RangeLimitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rangeLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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

	public static class ArrNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrName; }
	}

	public final ArrNameContext arrName() throws RecognitionException {
		ArrNameContext _localctx = new ArrNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			identifier();
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
		enterRule(_localctx, 20, RULE_numberList);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				number();
				setState(203);
				match(T__38);
				setState(204);
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
		public SignedConstantContext signedConstant() {
			return getRuleContext(SignedConstantContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__40);
				}
				break;
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				signedConstant();
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

	public static class SignedConstantContext extends ParserRuleContext {
		public DecConstantContext decConstant() {
			return getRuleContext(DecConstantContext.class,0);
		}
		public BinConstantContext binConstant() {
			return getRuleContext(BinConstantContext.class,0);
		}
		public OctConstantContext octConstant() {
			return getRuleContext(OctConstantContext.class,0);
		}
		public HexConstantContext hexConstant() {
			return getRuleContext(HexConstantContext.class,0);
		}
		public SignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedConstant; }
	}

	public final SignedConstantContext signedConstant() throws RecognitionException {
		SignedConstantContext _localctx = new SignedConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_signedConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Digit:
				{
				setState(214);
				decConstant();
				}
				break;
			case T__43:
				{
				setState(215);
				binConstant();
				}
				break;
			case T__44:
				{
				setState(216);
				octConstant();
				}
				break;
			case T__45:
				{
				setState(217);
				hexConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DecConstantContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(kqueryParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(kqueryParser.Digit, i);
		}
		public DecConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decConstant; }
	}

	public final DecConstantContext decConstant() throws RecognitionException {
		DecConstantContext _localctx = new DecConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				match(Digit);
				}
				}
				setState(223); 
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

	public static class BinConstantContext extends ParserRuleContext {
		public List<TerminalNode> BinExtend() { return getTokens(kqueryParser.BinExtend); }
		public TerminalNode BinExtend(int i) {
			return getToken(kqueryParser.BinExtend, i);
		}
		public BinConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binConstant; }
	}

	public final BinConstantContext binConstant() throws RecognitionException {
		BinConstantContext _localctx = new BinConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__43);
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				match(BinExtend);
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BinExtend );
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

	public static class OctConstantContext extends ParserRuleContext {
		public List<TerminalNode> OctalExtend() { return getTokens(kqueryParser.OctalExtend); }
		public TerminalNode OctalExtend(int i) {
			return getToken(kqueryParser.OctalExtend, i);
		}
		public OctConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octConstant; }
	}

	public final OctConstantContext octConstant() throws RecognitionException {
		OctConstantContext _localctx = new OctConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_octConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__44);
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				match(OctalExtend);
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OctalExtend );
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

	public static class HexConstantContext extends ParserRuleContext {
		public List<TerminalNode> HexExtend() { return getTokens(kqueryParser.HexExtend); }
		public TerminalNode HexExtend(int i) {
			return getToken(kqueryParser.HexExtend, i);
		}
		public HexConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexConstant; }
	}

	public final HexConstantContext hexConstant() throws RecognitionException {
		HexConstantContext _localctx = new HexConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_hexConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__45);
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				match(HexExtend);
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HexExtend );
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode StartLetter() { return getToken(kqueryParser.StartLetter, 0); }
		public List<TerminalNode> AlphaNumericSpl() { return getTokens(kqueryParser.AlphaNumericSpl); }
		public TerminalNode AlphaNumericSpl(int i) {
			return getToken(kqueryParser.AlphaNumericSpl, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(StartLetter);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AlphaNumericSpl) {
				{
				{
				setState(244);
				match(AlphaNumericSpl);
				}
				}
				setState(249);
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(kqueryParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(kqueryParser.Digit, i);
		}
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_floatingPointType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__46);
			setState(252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(251);
					match(Digit);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << TYPE) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace) | (1L << HexExtend) | (1L << OctalExtend) | (1L << BinExtend) | (1L << Digit) | (1L << StartLetter) | (1L << AlphaNumericSpl))) != 0)) {
				{
				{
				setState(256);
				matchWildcard();
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(257);
						matchWildcard();
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class IntegerTypeContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(kqueryParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(kqueryParser.Digit, i);
		}
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integerType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__47);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				match(Digit);
				}
				}
				setState(269); 
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_version);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartLetter:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				identifier();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(LeftBracket);
				{
				setState(273);
				updateList();
				}
				setState(274);
				match(RightBracket);
				setState(275);
				match(T__48);
				setState(276);
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
		enterRule(_localctx, 42, RULE_updateList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			expression();
			setState(281);
			match(T__3);
			setState(282);
			expression();
			{
			setState(283);
			match(T__38);
			setState(284);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00be"+
		"\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00d1\n\f\3\r\3\r\3\r\5\r\u00d6\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00dd\n\16\3\17\6\17\u00e0\n\17\r\17\16\17\u00e1\3\20\3\20\6\20"+
		"\u00e6\n\20\r\20\16\20\u00e7\3\21\3\21\6\21\u00ec\n\21\r\21\16\21\u00ed"+
		"\3\22\3\22\6\22\u00f2\n\22\r\22\16\22\u00f3\3\23\3\23\7\23\u00f8\n\23"+
		"\f\23\16\23\u00fb\13\23\3\24\3\24\6\24\u00ff\n\24\r\24\16\24\u0100\3\24"+
		"\3\24\7\24\u0105\n\24\f\24\16\24\u0108\13\24\5\24\u010a\n\24\3\25\3\25"+
		"\6\25\u010e\n\25\r\25\16\25\u010f\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u0119\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\u0106\2\30\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\6\4\2\t\13\25\27\3\2\30!\3\2"+
		"\"(\3\2,-\2\u012e\2.\3\2\2\2\4\60\3\2\2\2\6A\3\2\2\2\b\u00bd\3\2\2\2\n"+
		"\u00bf\3\2\2\2\f\u00c1\3\2\2\2\16\u00c3\3\2\2\2\20\u00c5\3\2\2\2\22\u00c7"+
		"\3\2\2\2\24\u00c9\3\2\2\2\26\u00d0\3\2\2\2\30\u00d5\3\2\2\2\32\u00d7\3"+
		"\2\2\2\34\u00df\3\2\2\2\36\u00e3\3\2\2\2 \u00e9\3\2\2\2\"\u00ef\3\2\2"+
		"\2$\u00f5\3\2\2\2&\u00fc\3\2\2\2(\u010b\3\2\2\2*\u0118\3\2\2\2,\u011a"+
		"\3\2\2\2./\5\4\3\2/\3\3\2\2\2\60\61\7\3\2\2\61\62\5\24\13\2\62\63\7\67"+
		"\2\2\63\64\5\34\17\2\64\65\78\2\2\65\66\7\4\2\2\66\67\5\20\t\2\678\7\5"+
		"\2\289\5\22\n\29:\7\6\2\2:;\5\6\4\2;\5\3\2\2\2<B\7\7\2\2=>\7\67\2\2>?"+
		"\5\26\f\2?@\78\2\2@B\3\2\2\2A<\3\2\2\2A=\3\2\2\2B\7\3\2\2\2C\u00be\5$"+
		"\23\2DE\5$\23\2EF\7\4\2\2FG\5\b\5\2G\u00be\3\2\2\2H\u00be\5\30\r\2IJ\7"+
		"\65\2\2JK\7\64\2\2KL\5\30\r\2LM\7\66\2\2M\u00be\3\2\2\2NO\7\65\2\2OP\5"+
		"\16\b\2PQ\7\64\2\2QR\5\b\5\2RS\5\b\5\2ST\7\66\2\2T\u00be\3\2\2\2UV\7\65"+
		"\2\2VW\7\b\2\2WX\7\67\2\2XY\7\64\2\2YZ\78\2\2Z[\5\b\5\2[\\\7\66\2\2\\"+
		"\u00be\3\2\2\2]^\7\65\2\2^_\5\n\6\2_`\7\64\2\2`a\5\b\5\2ab\5\b\5\2bc\7"+
		"\66\2\2c\u00be\3\2\2\2de\7\65\2\2ef\7\t\2\2fg\7\64\2\2gh\5\b\5\2hi\5\b"+
		"\5\2ij\7\66\2\2j\u00be\3\2\2\2kl\7\65\2\2lm\7\n\2\2mn\7\64\2\2no\5\b\5"+
		"\2op\5\b\5\2pq\7\66\2\2q\u00be\3\2\2\2rs\7\65\2\2st\7\13\2\2tu\7\64\2"+
		"\2uv\5\b\5\2vw\5\b\5\2wx\7\66\2\2x\u00be\3\2\2\2yz\7\65\2\2z{\5\f\7\2"+
		"{|\7\64\2\2|}\5\b\5\2}~\5\b\5\2~\177\7\66\2\2\177\u00be\3\2\2\2\u0080"+
		"\u0081\7\65\2\2\u0081\u0082\7\f\2\2\u0082\u0083\7\64\2\2\u0083\u0084\5"+
		"\b\5\2\u0084\u0085\5\b\5\2\u0085\u0086\7\66\2\2\u0086\u00be\3\2\2\2\u0087"+
		"\u0088\7\65\2\2\u0088\u0089\7\r\2\2\u0089\u008a\7\64\2\2\u008a\u008b\5"+
		"\30\r\2\u008b\u008c\5\b\5\2\u008c\u008d\7\66\2\2\u008d\u00be\3\2\2\2\u008e"+
		"\u008f\7\65\2\2\u008f\u0090\7\16\2\2\u0090\u0091\7\64\2\2\u0091\u0092"+
		"\5\b\5\2\u0092\u0093\7\66\2\2\u0093\u00be\3\2\2\2\u0094\u0095\7\65\2\2"+
		"\u0095\u0096\7\17\2\2\u0096\u0097\7\64\2\2\u0097\u0098\5\b\5\2\u0098\u0099"+
		"\7\66\2\2\u0099\u00be\3\2\2\2\u009a\u009b\7\65\2\2\u009b\u009c\7\20\2"+
		"\2\u009c\u009d\7\64\2\2\u009d\u009e\5\b\5\2\u009e\u009f\5*\26\2\u009f"+
		"\u00a0\7\66\2\2\u00a0\u00be\3\2\2\2\u00a1\u00a2\7\65\2\2\u00a2\u00a3\7"+
		"\21\2\2\u00a3\u00a4\7\64\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\5\b\5\2\u00a6"+
		"\u00a7\5\b\5\2\u00a7\u00a8\7\66\2\2\u00a8\u00be\3\2\2\2\u00a9\u00aa\7"+
		"\65\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ac\7\64\2\2\u00ac\u00ad\5\b\5\2"+
		"\u00ad\u00ae\7\66\2\2\u00ae\u00be\3\2\2\2\u00af\u00b0\7\65\2\2\u00b0\u00b1"+
		"\7\23\2\2\u00b1\u00b2\7\64\2\2\u00b2\u00b3\5\b\5\2\u00b3\u00b4\5*\26\2"+
		"\u00b4\u00b5\7\66\2\2\u00b5\u00be\3\2\2\2\u00b6\u00b7\7\65\2\2\u00b7\u00b8"+
		"\7\24\2\2\u00b8\u00b9\7\64\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb\5*\26\2"+
		"\u00bb\u00bc\7\66\2\2\u00bc\u00be\3\2\2\2\u00bdC\3\2\2\2\u00bdD\3\2\2"+
		"\2\u00bdH\3\2\2\2\u00bdI\3\2\2\2\u00bdN\3\2\2\2\u00bdU\3\2\2\2\u00bd]"+
		"\3\2\2\2\u00bdd\3\2\2\2\u00bdk\3\2\2\2\u00bdr\3\2\2\2\u00bdy\3\2\2\2\u00bd"+
		"\u0080\3\2\2\2\u00bd\u0087\3\2\2\2\u00bd\u008e\3\2\2\2\u00bd\u0094\3\2"+
		"\2\2\u00bd\u009a\3\2\2\2\u00bd\u00a1\3\2\2\2\u00bd\u00a9\3\2\2\2\u00bd"+
		"\u00af\3\2\2\2\u00bd\u00b6\3\2\2\2\u00be\t\3\2\2\2\u00bf\u00c0\t\2\2\2"+
		"\u00c0\13\3\2\2\2\u00c1\u00c2\t\3\2\2\u00c2\r\3\2\2\2\u00c3\u00c4\t\4"+
		"\2\2\u00c4\17\3\2\2\2\u00c5\u00c6\7\64\2\2\u00c6\21\3\2\2\2\u00c7\u00c8"+
		"\7\64\2\2\u00c8\23\3\2\2\2\u00c9\u00ca\5$\23\2\u00ca\25\3\2\2\2\u00cb"+
		"\u00d1\5\30\r\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\7)\2\2\u00ce\u00cf\5"+
		"\26\f\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1"+
		"\27\3\2\2\2\u00d2\u00d6\7*\2\2\u00d3\u00d6\7+\2\2\u00d4\u00d6\5\32\16"+
		"\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\31"+
		"\3\2\2\2\u00d7\u00dc\t\5\2\2\u00d8\u00dd\5\34\17\2\u00d9\u00dd\5\36\20"+
		"\2\u00da\u00dd\5 \21\2\u00db\u00dd\5\"\22\2\u00dc\u00d8\3\2\2\2\u00dc"+
		"\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\33\3\2\2"+
		"\2\u00de\u00e0\7>\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\35\3\2\2\2\u00e3\u00e5\7.\2\2\u00e4"+
		"\u00e6\7=\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\37\3\2\2\2\u00e9\u00eb\7/\2\2\u00ea\u00ec"+
		"\7<\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee!\3\2\2\2\u00ef\u00f1\7\60\2\2\u00f0\u00f2\7;\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4#\3\2\2\2\u00f5\u00f9\7?\2\2\u00f6\u00f8\7@\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"%\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\7\61\2\2\u00fd\u00ff\7>\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0109\3\2\2\2\u0102\u0106\13\2\2\2\u0103\u0105\13\2\2\2"+
		"\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0107\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0102\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\'\3\2\2\2\u010b\u010d\7\62\2\2\u010c\u010e\7>\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110)\3\2\2\2\u0111\u0119\5$\23\2\u0112\u0113\7\67\2\2\u0113"+
		"\u0114\5,\27\2\u0114\u0115\78\2\2\u0115\u0116\7\63\2\2\u0116\u0117\5*"+
		"\26\2\u0117\u0119\3\2\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0119"+
		"+\3\2\2\2\u011a\u011b\5\b\5\2\u011b\u011c\7\6\2\2\u011c\u011d\5\b\5\2"+
		"\u011d\u011e\7)\2\2\u011e\u011f\5,\27\2\u011f-\3\2\2\2\21A\u00bd\u00d0"+
		"\u00d5\u00dc\u00e1\u00e7\u00ed\u00f3\u00f9\u0100\u0106\u0109\u010f\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}