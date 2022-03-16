// Generated from KQuery.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KQueryLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Boolean", "SignedConstant", "Constant", "BinConstant", "OctConstant", 
			"HexConstant", "FloatingPointType", "IntegerType", "WidthType", "BinId", 
			"OctId", "WIDTH", "HexId", "TrueMatch", "FalseMatch", "Query", "Array", 
			"Symbolic", "Colon", "Arrow", "Equal", "COMMA", "NOT", "SHL", "LSHR", 
			"ASHR", "CONCAT", "EXTRACT", "ZEXT", "SEXT", "READ", "SELECT", "NEGETION", 
			"READLSB", "READMSB", "PLUS", "MINUS", "ATR", "BITWISEAND", "BITWISEOR", 
			"BITWISEXOR", "EQ", "NEQ", "ULT", "ULE", "UGT", "UGE", "SLT", "SLE", 
			"SGT", "SGE", "ADD", "SUB", "MUL", "UDIV", "UREM", "SDIV", "SREM", "DIGIT", 
			"BIN_DIGIT", "OCTAL_DIGIT", "HEX_DIGIT", "Identifier", "INT", "FP", "Whitespace", 
			"Newline", "BlockComment", "LineComment", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace"
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


	public KQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KQuery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u01f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\5\2\u009c\n\2\3\3\3\3\5\3\u00a0\n\3\3\3"+
		"\3\3\3\4\6\4\u00a5\n\4\r\4\16\4\u00a6\3\4\3\4\3\4\5\4\u00ac\n\4\3\5\3"+
		"\5\6\5\u00b0\n\5\r\5\16\5\u00b1\3\6\3\6\6\6\u00b6\n\6\r\6\16\6\u00b7\3"+
		"\7\3\7\6\7\u00bc\n\7\r\7\16\7\u00bd\3\b\3\b\6\b\u00c2\n\b\r\b\16\b\u00c3"+
		"\3\b\3\b\7\b\u00c8\n\b\f\b\16\b\u00cb\13\b\5\b\u00cd\n\b\3\t\3\t\6\t\u00d1"+
		"\n\t\r\t\16\t\u00d2\3\n\3\n\6\n\u00d7\n\n\r\n\16\n\u00d8\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-"+
		"\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\3"+
		"9\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\7@\u01bb\n@\f@\16@\u01be\13@\3A\3A\3B\3B\3B\3C\6C\u01c6\nC\rC\16"+
		"C\u01c7\3C\3C\3D\3D\5D\u01ce\nD\3D\5D\u01d1\nD\3D\3D\3E\3E\7E\u01d7\n"+
		"E\fE\16E\u01da\13E\3E\3E\3E\3E\3F\3F\7F\u01e2\nF\fF\16F\u01e5\13F\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\4\u00c9\u01d8\2M\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w\2y\2{\2"+
		"}\2\177=\u0081>\u0083?\u0085@\u0087A\u0089B\u008bC\u008dD\u008fE\u0091"+
		"F\u0093G\u0095H\u0097I\3\2\n\3\2\60\60\4\2\62\63aa\4\2\629aa\6\2\62;C"+
		"Haach\5\2C\\aac|\7\2\60\60\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u0203"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2\177\3\2\2\2\2\u0081\3"+
		"\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2"+
		"\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u009b\3\2\2\2\5\u009f\3\2\2"+
		"\2\7\u00ab\3\2\2\2\t\u00ad\3\2\2\2\13\u00b3\3\2\2\2\r\u00b9\3\2\2\2\17"+
		"\u00bf\3\2\2\2\21\u00ce\3\2\2\2\23\u00d4\3\2\2\2\25\u00da\3\2\2\2\27\u00dd"+
		"\3\2\2\2\31\u00e0\3\2\2\2\33\u00e2\3\2\2\2\35\u00e5\3\2\2\2\37\u00ea\3"+
		"\2\2\2!\u00f0\3\2\2\2#\u00f6\3\2\2\2%\u00fc\3\2\2\2\'\u0105\3\2\2\2)\u0107"+
		"\3\2\2\2+\u010a\3\2\2\2-\u010c\3\2\2\2/\u010e\3\2\2\2\61\u0112\3\2\2\2"+
		"\63\u0116\3\2\2\2\65\u011b\3\2\2\2\67\u0120\3\2\2\29\u0127\3\2\2\2;\u012f"+
		"\3\2\2\2=\u0134\3\2\2\2?\u0139\3\2\2\2A\u013e\3\2\2\2C\u0145\3\2\2\2E"+
		"\u0149\3\2\2\2G\u0151\3\2\2\2I\u0159\3\2\2\2K\u015b\3\2\2\2M\u015d\3\2"+
		"\2\2O\u015f\3\2\2\2Q\u0163\3\2\2\2S\u0166\3\2\2\2U\u016a\3\2\2\2W\u016d"+
		"\3\2\2\2Y\u0170\3\2\2\2[\u0174\3\2\2\2]\u0178\3\2\2\2_\u017c\3\2\2\2a"+
		"\u0180\3\2\2\2c\u0184\3\2\2\2e\u0188\3\2\2\2g\u018c\3\2\2\2i\u0190\3\2"+
		"\2\2k\u0194\3\2\2\2m\u0198\3\2\2\2o\u019c\3\2\2\2q\u01a1\3\2\2\2s\u01a6"+
		"\3\2\2\2u\u01ab\3\2\2\2w\u01b0\3\2\2\2y\u01b2\3\2\2\2{\u01b4\3\2\2\2}"+
		"\u01b6\3\2\2\2\177\u01b8\3\2\2\2\u0081\u01bf\3\2\2\2\u0083\u01c1\3\2\2"+
		"\2\u0085\u01c5\3\2\2\2\u0087\u01d0\3\2\2\2\u0089\u01d4\3\2\2\2\u008b\u01df"+
		"\3\2\2\2\u008d\u01e8\3\2\2\2\u008f\u01ea\3\2\2\2\u0091\u01ec\3\2\2\2\u0093"+
		"\u01ee\3\2\2\2\u0095\u01f0\3\2\2\2\u0097\u01f2\3\2\2\2\u0099\u009c\5\35"+
		"\17\2\u009a\u009c\5\37\20\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\4\3\2\2\2\u009d\u00a0\5I%\2\u009e\u00a0\5K&\2\u009f\u009d\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5\7\4\2\u00a2\6\3\2\2\2"+
		"\u00a3\u00a5\5w<\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ac\3\2\2\2\u00a8\u00ac\5\t\5\2\u00a9"+
		"\u00ac\5\13\6\2\u00aa\u00ac\5\r\7\2\u00ab\u00a4\3\2\2\2\u00ab\u00a8\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\b\3\2\2\2\u00ad\u00af"+
		"\5\25\13\2\u00ae\u00b0\5y=\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\n\3\2\2\2\u00b3\u00b5\5\27\f"+
		"\2\u00b4\u00b6\5{>\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\f\3\2\2\2\u00b9\u00bb\5\33\16\2\u00ba"+
		"\u00bc\5}?\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\u00bd\u00be\3\2\2\2\u00be\16\3\2\2\2\u00bf\u00c1\5\u0083B\2\u00c0\u00c2"+
		"\5w<\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00cc\3\2\2\2\u00c5\u00c9\t\2\2\2\u00c6\u00c8\13"+
		"\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c5\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\20\3\2\2\2\u00ce\u00d0\5\u0081A\2\u00cf"+
		"\u00d1\5w<\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2"+
		"\2\u00d2\u00d3\3\2\2\2\u00d3\22\3\2\2\2\u00d4\u00d6\5\31\r\2\u00d5\u00d7"+
		"\5w<\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\24\3\2\2\2\u00da\u00db\7\62\2\2\u00db\u00dc\7d\2"+
		"\2\u00dc\26\3\2\2\2\u00dd\u00de\7\62\2\2\u00de\u00df\7q\2\2\u00df\30\3"+
		"\2\2\2\u00e0\u00e1\7y\2\2\u00e1\32\3\2\2\2\u00e2\u00e3\7\62\2\2\u00e3"+
		"\u00e4\7z\2\2\u00e4\34\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7t\2\2\u00e7"+
		"\u00e8\7w\2\2\u00e8\u00e9\7g\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb"+
		"\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef \3\2\2\2\u00f0\u00f1\7s\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7g\2"+
		"\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7{\2\2\u00f5\"\3\2\2\2\u00f6\u00f7\7"+
		"c\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb"+
		"\7{\2\2\u00fb$\3\2\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7{\2\2\u00fe\u00ff"+
		"\7o\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7q\2\2\u0101\u0102\7n\2\2\u0102"+
		"\u0103\7k\2\2\u0103\u0104\7e\2\2\u0104&\3\2\2\2\u0105\u0106\7<\2\2\u0106"+
		"(\3\2\2\2\u0107\u0108\7/\2\2\u0108\u0109\7@\2\2\u0109*\3\2\2\2\u010a\u010b"+
		"\7?\2\2\u010b,\3\2\2\2\u010c\u010d\7.\2\2\u010d.\3\2\2\2\u010e\u010f\7"+
		"P\2\2\u010f\u0110\7q\2\2\u0110\u0111\7v\2\2\u0111\60\3\2\2\2\u0112\u0113"+
		"\7U\2\2\u0113\u0114\7j\2\2\u0114\u0115\7n\2\2\u0115\62\3\2\2\2\u0116\u0117"+
		"\7N\2\2\u0117\u0118\7U\2\2\u0118\u0119\7j\2\2\u0119\u011a\7t\2\2\u011a"+
		"\64\3\2\2\2\u011b\u011c\7C\2\2\u011c\u011d\7U\2\2\u011d\u011e\7j\2\2\u011e"+
		"\u011f\7t\2\2\u011f\66\3\2\2\2\u0120\u0121\7E\2\2\u0121\u0122\7q\2\2\u0122"+
		"\u0123\7p\2\2\u0123\u0124\7e\2\2\u0124\u0125\7c\2\2\u0125\u0126\7v\2\2"+
		"\u01268\3\2\2\2\u0127\u0128\7G\2\2\u0128\u0129\7z\2\2\u0129\u012a\7v\2"+
		"\2\u012a\u012b\7t\2\2\u012b\u012c\7c\2\2\u012c\u012d\7e\2\2\u012d\u012e"+
		"\7v\2\2\u012e:\3\2\2\2\u012f\u0130\7\\\2\2\u0130\u0131\7G\2\2\u0131\u0132"+
		"\7z\2\2\u0132\u0133\7v\2\2\u0133<\3\2\2\2\u0134\u0135\7U\2\2\u0135\u0136"+
		"\7G\2\2\u0136\u0137\7z\2\2\u0137\u0138\7v\2\2\u0138>\3\2\2\2\u0139\u013a"+
		"\7T\2\2\u013a\u013b\7g\2\2\u013b\u013c\7c\2\2\u013c\u013d\7f\2\2\u013d"+
		"@\3\2\2\2\u013e\u013f\7U\2\2\u013f\u0140\7g\2\2\u0140\u0141\7n\2\2\u0141"+
		"\u0142\7g\2\2\u0142\u0143\7e\2\2\u0143\u0144\7v\2\2\u0144B\3\2\2\2\u0145"+
		"\u0146\7P\2\2\u0146\u0147\7g\2\2\u0147\u0148\7i\2\2\u0148D\3\2\2\2\u0149"+
		"\u014a\7T\2\2\u014a\u014b\7g\2\2\u014b\u014c\7c\2\2\u014c\u014d\7f\2\2"+
		"\u014d\u014e\7N\2\2\u014e\u014f\7U\2\2\u014f\u0150\7D\2\2\u0150F\3\2\2"+
		"\2\u0151\u0152\7T\2\2\u0152\u0153\7g\2\2\u0153\u0154\7c\2\2\u0154\u0155"+
		"\7f\2\2\u0155\u0156\7O\2\2\u0156\u0157\7U\2\2\u0157\u0158\7D\2\2\u0158"+
		"H\3\2\2\2\u0159\u015a\7-\2\2\u015aJ\3\2\2\2\u015b\u015c\7/\2\2\u015cL"+
		"\3\2\2\2\u015d\u015e\7B\2\2\u015eN\3\2\2\2\u015f\u0160\7C\2\2\u0160\u0161"+
		"\7p\2\2\u0161\u0162\7f\2\2\u0162P\3\2\2\2\u0163\u0164\7Q\2\2\u0164\u0165"+
		"\7t\2\2\u0165R\3\2\2\2\u0166\u0167\7Z\2\2\u0167\u0168\7q\2\2\u0168\u0169"+
		"\7t\2\2\u0169T\3\2\2\2\u016a\u016b\7G\2\2\u016b\u016c\7s\2\2\u016cV\3"+
		"\2\2\2\u016d\u016e\7P\2\2\u016e\u016f\7g\2\2\u016fX\3\2\2\2\u0170\u0171"+
		"\7W\2\2\u0171\u0172\7n\2\2\u0172\u0173\7v\2\2\u0173Z\3\2\2\2\u0174\u0175"+
		"\7W\2\2\u0175\u0176\7n\2\2\u0176\u0177\7g\2\2\u0177\\\3\2\2\2\u0178\u0179"+
		"\7W\2\2\u0179\u017a\7i\2\2\u017a\u017b\7v\2\2\u017b^\3\2\2\2\u017c\u017d"+
		"\7W\2\2\u017d\u017e\7i\2\2\u017e\u017f\7g\2\2\u017f`\3\2\2\2\u0180\u0181"+
		"\7U\2\2\u0181\u0182\7n\2\2\u0182\u0183\7v\2\2\u0183b\3\2\2\2\u0184\u0185"+
		"\7U\2\2\u0185\u0186\7n\2\2\u0186\u0187\7g\2\2\u0187d\3\2\2\2\u0188\u0189"+
		"\7U\2\2\u0189\u018a\7i\2\2\u018a\u018b\7v\2\2\u018bf\3\2\2\2\u018c\u018d"+
		"\7U\2\2\u018d\u018e\7i\2\2\u018e\u018f\7g\2\2\u018fh\3\2\2\2\u0190\u0191"+
		"\7C\2\2\u0191\u0192\7f\2\2\u0192\u0193\7f\2\2\u0193j\3\2\2\2\u0194\u0195"+
		"\7U\2\2\u0195\u0196\7w\2\2\u0196\u0197\7d\2\2\u0197l\3\2\2\2\u0198\u0199"+
		"\7O\2\2\u0199\u019a\7w\2\2\u019a\u019b\7n\2\2\u019bn\3\2\2\2\u019c\u019d"+
		"\7W\2\2\u019d\u019e\7F\2\2\u019e\u019f\7k\2\2\u019f\u01a0\7x\2\2\u01a0"+
		"p\3\2\2\2\u01a1\u01a2\7W\2\2\u01a2\u01a3\7T\2\2\u01a3\u01a4\7g\2\2\u01a4"+
		"\u01a5\7o\2\2\u01a5r\3\2\2\2\u01a6\u01a7\7U\2\2\u01a7\u01a8\7F\2\2\u01a8"+
		"\u01a9\7k\2\2\u01a9\u01aa\7x\2\2\u01aat\3\2\2\2\u01ab\u01ac\7U\2\2\u01ac"+
		"\u01ad\7T\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7o\2\2\u01afv\3\2\2\2\u01b0"+
		"\u01b1\4\62;\2\u01b1x\3\2\2\2\u01b2\u01b3\t\3\2\2\u01b3z\3\2\2\2\u01b4"+
		"\u01b5\t\4\2\2\u01b5|\3\2\2\2\u01b6\u01b7\t\5\2\2\u01b7~\3\2\2\2\u01b8"+
		"\u01bc\t\6\2\2\u01b9\u01bb\t\7\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u0080\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c0\7k\2\2\u01c0\u0082\3\2\2\2\u01c1\u01c2\7h\2"+
		"\2\u01c2\u01c3\7r\2\2\u01c3\u0084\3\2\2\2\u01c4\u01c6\t\b\2\2\u01c5\u01c4"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ca\bC\2\2\u01ca\u0086\3\2\2\2\u01cb\u01cd\7\17"+
		"\2\2\u01cc\u01ce\7\f\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01d1\7\f\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\bD\2\2\u01d3\u0088\3\2\2\2\u01d4"+
		"\u01d8\7%\2\2\u01d5\u01d7\13\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01db\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01db\u01dc\7%\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\bE\2"+
		"\2\u01de\u008a\3\2\2\2\u01df\u01e3\7%\2\2\u01e0\u01e2\n\t\2\2\u01e1\u01e0"+
		"\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\bF\2\2\u01e7\u008c\3\2"+
		"\2\2\u01e8\u01e9\7*\2\2\u01e9\u008e\3\2\2\2\u01ea\u01eb\7+\2\2\u01eb\u0090"+
		"\3\2\2\2\u01ec\u01ed\7]\2\2\u01ed\u0092\3\2\2\2\u01ee\u01ef\7_\2\2\u01ef"+
		"\u0094\3\2\2\2\u01f0\u01f1\7}\2\2\u01f1\u0096\3\2\2\2\u01f2\u01f3\7\177"+
		"\2\2\u01f3\u0098\3\2\2\2\25\2\u009b\u009f\u00a6\u00ab\u00b1\u00b7\u00bd"+
		"\u00c3\u00c9\u00cc\u00d2\u00d8\u01bc\u01c7\u01cd\u01d0\u01d8\u01e3\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}