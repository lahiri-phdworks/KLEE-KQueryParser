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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SignedConstant", "Constant", "BinConstant", "OctConstant", "HexConstant", 
			"FloatingPointType", "IntegerType", "WidthType", "BinId", "OctId", "WIDTH", 
			"HexId", "TrueMatch", "FalseMatch", "Query", "Array", "Symbolic", "Colon", 
			"Arrow", "Equal", "COMMA", "NOT", "SHL", "LSHR", "ASHR", "CONCAT", "EXTRACT", 
			"ZEXT", "SEXT", "READ", "SELECT", "NEGETION", "READLSB", "READMSB", "PLUS", 
			"MINUS", "INT", "ATR", "FP", "BITWISEAND", "BITWISEOR", "BITWISEXOR", 
			"EQ", "NEQ", "ULT", "ULE", "UGT", "UGE", "SLT", "SLE", "SGT", "SGE", 
			"ADD", "SUB", "MUL", "UDIV", "UREM", "SDIV", "SREM", "DIGIT", "BIN_DIGIT", 
			"OCTAL_DIGIT", "HEX_DIGIT", "Identifier", "Whitespace", "Newline", "BlockComment", 
			"LineComment", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u01ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\5\2\u009a\n\2\3\2\3\2\3\3\6\3\u009f\n\3\r\3\16"+
		"\3\u00a0\3\3\3\3\3\3\5\3\u00a6\n\3\3\4\3\4\6\4\u00aa\n\4\r\4\16\4\u00ab"+
		"\3\5\3\5\6\5\u00b0\n\5\r\5\16\5\u00b1\3\6\3\6\6\6\u00b6\n\6\r\6\16\6\u00b7"+
		"\3\7\3\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1\13\7\5\7\u00c3\n\7\3\b\3"+
		"\b\6\b\u00c7\n\b\r\b\16\b\u00c8\3\t\3\t\6\t\u00cd\n\t\r\t\16\t\u00ce\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*"+
		"\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3"+
		"<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\7A\u01b6\nA\fA\16A\u01b9\13"+
		"A\3B\6B\u01bc\nB\rB\16B\u01bd\3B\3B\3C\3C\5C\u01c4\nC\3C\5C\u01c7\nC\3"+
		"C\3C\3D\3D\3D\3D\7D\u01cf\nD\fD\16D\u01d2\13D\3D\3D\3D\3D\3D\3E\3E\7E"+
		"\u01db\nE\fE\16E\u01de\13E\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\4"+
		"\u00bf\u01d0\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y\2{>}?\177@\u0081A\u0083B\u0085C\u0087D\u0089"+
		"E\u008bF\u008dG\u008fH\u0091I\u0093J\u0095K\3\2\t\4\2\62\63aa\4\2\629"+
		"aa\6\2\62;CHaach\5\2C\\aac|\7\2\60\60\62;C\\aac|\4\2\13\13\"\"\4\2\f\f"+
		"\17\17\2\u01fd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2"+
		"\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\3\u0099\3\2\2\2\5\u00a5\3\2\2\2\7\u00a7\3\2\2\2\t\u00ad\3\2\2\2\13"+
		"\u00b3\3\2\2\2\r\u00b9\3\2\2\2\17\u00c4\3\2\2\2\21\u00ca\3\2\2\2\23\u00d0"+
		"\3\2\2\2\25\u00d3\3\2\2\2\27\u00d6\3\2\2\2\31\u00d8\3\2\2\2\33\u00db\3"+
		"\2\2\2\35\u00e0\3\2\2\2\37\u00e6\3\2\2\2!\u00ec\3\2\2\2#\u00f2\3\2\2\2"+
		"%\u00fb\3\2\2\2\'\u00fd\3\2\2\2)\u0100\3\2\2\2+\u0102\3\2\2\2-\u0104\3"+
		"\2\2\2/\u0108\3\2\2\2\61\u010c\3\2\2\2\63\u0111\3\2\2\2\65\u0116\3\2\2"+
		"\2\67\u011d\3\2\2\29\u0125\3\2\2\2;\u012a\3\2\2\2=\u012f\3\2\2\2?\u0134"+
		"\3\2\2\2A\u013b\3\2\2\2C\u013f\3\2\2\2E\u0147\3\2\2\2G\u014f\3\2\2\2I"+
		"\u0151\3\2\2\2K\u0153\3\2\2\2M\u0155\3\2\2\2O\u0157\3\2\2\2Q\u015a\3\2"+
		"\2\2S\u015e\3\2\2\2U\u0161\3\2\2\2W\u0165\3\2\2\2Y\u0168\3\2\2\2[\u016b"+
		"\3\2\2\2]\u016f\3\2\2\2_\u0173\3\2\2\2a\u0177\3\2\2\2c\u017b\3\2\2\2e"+
		"\u017f\3\2\2\2g\u0183\3\2\2\2i\u0187\3\2\2\2k\u018b\3\2\2\2m\u018f\3\2"+
		"\2\2o\u0193\3\2\2\2q\u0197\3\2\2\2s\u019c\3\2\2\2u\u01a1\3\2\2\2w\u01a6"+
		"\3\2\2\2y\u01ab\3\2\2\2{\u01ad\3\2\2\2}\u01af\3\2\2\2\177\u01b1\3\2\2"+
		"\2\u0081\u01b3\3\2\2\2\u0083\u01bb\3\2\2\2\u0085\u01c6\3\2\2\2\u0087\u01ca"+
		"\3\2\2\2\u0089\u01d8\3\2\2\2\u008b\u01e1\3\2\2\2\u008d\u01e3\3\2\2\2\u008f"+
		"\u01e5\3\2\2\2\u0091\u01e7\3\2\2\2\u0093\u01e9\3\2\2\2\u0095\u01eb\3\2"+
		"\2\2\u0097\u009a\5G$\2\u0098\u009a\5I%\2\u0099\u0097\3\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\5\5\3\2\u009c\4\3\2\2\2\u009d"+
		"\u009f\5y=\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2\u00a6\5\7\4\2\u00a3\u00a6"+
		"\5\t\5\2\u00a4\u00a6\5\13\6\2\u00a5\u009e\3\2\2\2\u00a5\u00a2\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\6\3\2\2\2\u00a7\u00a9\5"+
		"\23\n\2\u00a8\u00aa\5{>\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\b\3\2\2\2\u00ad\u00af\5\25\13"+
		"\2\u00ae\u00b0\5}?\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\n\3\2\2\2\u00b3\u00b5\5\31\r\2\u00b4"+
		"\u00b6\5\177@\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\f\3\2\2\2\u00b9\u00ba\5O(\2\u00ba\u00c2"+
		"\5y=\2\u00bb\u00bf\13\2\2\2\u00bc\u00be\13\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\16\3\2\2\2\u00c4\u00c6\5K&\2\u00c5\u00c7\5y=\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\20\3\2\2"+
		"\2\u00ca\u00cc\5\27\f\2\u00cb\u00cd\5y=\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\22\3\2\2\2\u00d0"+
		"\u00d1\7\62\2\2\u00d1\u00d2\7d\2\2\u00d2\24\3\2\2\2\u00d3\u00d4\7\62\2"+
		"\2\u00d4\u00d5\7q\2\2\u00d5\26\3\2\2\2\u00d6\u00d7\7y\2\2\u00d7\30\3\2"+
		"\2\2\u00d8\u00d9\7\62\2\2\u00d9\u00da\7z\2\2\u00da\32\3\2\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7g\2\2\u00df"+
		"\34\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7n\2\2\u00e3"+
		"\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5\36\3\2\2\2\u00e6\u00e7\7s\2\2\u00e7"+
		"\u00e8\7w\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7{\2\2"+
		"\u00eb \3\2\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7t\2"+
		"\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7{\2\2\u00f1\"\3\2\2\2\u00f2\u00f3\7"+
		"u\2\2\u00f3\u00f4\7{\2\2\u00f4\u00f5\7o\2\2\u00f5\u00f6\7d\2\2\u00f6\u00f7"+
		"\7q\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7e\2\2\u00fa"+
		"$\3\2\2\2\u00fb\u00fc\7<\2\2\u00fc&\3\2\2\2\u00fd\u00fe\7/\2\2\u00fe\u00ff"+
		"\7@\2\2\u00ff(\3\2\2\2\u0100\u0101\7?\2\2\u0101*\3\2\2\2\u0102\u0103\7"+
		".\2\2\u0103,\3\2\2\2\u0104\u0105\7P\2\2\u0105\u0106\7q\2\2\u0106\u0107"+
		"\7v\2\2\u0107.\3\2\2\2\u0108\u0109\7U\2\2\u0109\u010a\7j\2\2\u010a\u010b"+
		"\7n\2\2\u010b\60\3\2\2\2\u010c\u010d\7N\2\2\u010d\u010e\7U\2\2\u010e\u010f"+
		"\7j\2\2\u010f\u0110\7t\2\2\u0110\62\3\2\2\2\u0111\u0112\7C\2\2\u0112\u0113"+
		"\7U\2\2\u0113\u0114\7j\2\2\u0114\u0115\7t\2\2\u0115\64\3\2\2\2\u0116\u0117"+
		"\7E\2\2\u0117\u0118\7q\2\2\u0118\u0119\7p\2\2\u0119\u011a\7e\2\2\u011a"+
		"\u011b\7c\2\2\u011b\u011c\7v\2\2\u011c\66\3\2\2\2\u011d\u011e\7G\2\2\u011e"+
		"\u011f\7z\2\2\u011f\u0120\7v\2\2\u0120\u0121\7t\2\2\u0121\u0122\7c\2\2"+
		"\u0122\u0123\7e\2\2\u0123\u0124\7v\2\2\u01248\3\2\2\2\u0125\u0126\7\\"+
		"\2\2\u0126\u0127\7G\2\2\u0127\u0128\7z\2\2\u0128\u0129\7v\2\2\u0129:\3"+
		"\2\2\2\u012a\u012b\7U\2\2\u012b\u012c\7G\2\2\u012c\u012d\7z\2\2\u012d"+
		"\u012e\7v\2\2\u012e<\3\2\2\2\u012f\u0130\7T\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0132\7c\2\2\u0132\u0133\7f\2\2\u0133>\3\2\2\2\u0134\u0135\7U\2\2\u0135"+
		"\u0136\7g\2\2\u0136\u0137\7n\2\2\u0137\u0138\7g\2\2\u0138\u0139\7e\2\2"+
		"\u0139\u013a\7v\2\2\u013a@\3\2\2\2\u013b\u013c\7P\2\2\u013c\u013d\7g\2"+
		"\2\u013d\u013e\7i\2\2\u013eB\3\2\2\2\u013f\u0140\7T\2\2\u0140\u0141\7"+
		"g\2\2\u0141\u0142\7c\2\2\u0142\u0143\7f\2\2\u0143\u0144\7N\2\2\u0144\u0145"+
		"\7U\2\2\u0145\u0146\7D\2\2\u0146D\3\2\2\2\u0147\u0148\7T\2\2\u0148\u0149"+
		"\7g\2\2\u0149\u014a\7c\2\2\u014a\u014b\7f\2\2\u014b\u014c\7O\2\2\u014c"+
		"\u014d\7U\2\2\u014d\u014e\7D\2\2\u014eF\3\2\2\2\u014f\u0150\7-\2\2\u0150"+
		"H\3\2\2\2\u0151\u0152\7/\2\2\u0152J\3\2\2\2\u0153\u0154\7k\2\2\u0154L"+
		"\3\2\2\2\u0155\u0156\7B\2\2\u0156N\3\2\2\2\u0157\u0158\7h\2\2\u0158\u0159"+
		"\7r\2\2\u0159P\3\2\2\2\u015a\u015b\7C\2\2\u015b\u015c\7p\2\2\u015c\u015d"+
		"\7f\2\2\u015dR\3\2\2\2\u015e\u015f\7Q\2\2\u015f\u0160\7t\2\2\u0160T\3"+
		"\2\2\2\u0161\u0162\7Z\2\2\u0162\u0163\7q\2\2\u0163\u0164\7t\2\2\u0164"+
		"V\3\2\2\2\u0165\u0166\7G\2\2\u0166\u0167\7s\2\2\u0167X\3\2\2\2\u0168\u0169"+
		"\7P\2\2\u0169\u016a\7g\2\2\u016aZ\3\2\2\2\u016b\u016c\7W\2\2\u016c\u016d"+
		"\7n\2\2\u016d\u016e\7v\2\2\u016e\\\3\2\2\2\u016f\u0170\7W\2\2\u0170\u0171"+
		"\7n\2\2\u0171\u0172\7g\2\2\u0172^\3\2\2\2\u0173\u0174\7W\2\2\u0174\u0175"+
		"\7i\2\2\u0175\u0176\7v\2\2\u0176`\3\2\2\2\u0177\u0178\7W\2\2\u0178\u0179"+
		"\7i\2\2\u0179\u017a\7g\2\2\u017ab\3\2\2\2\u017b\u017c\7U\2\2\u017c\u017d"+
		"\7n\2\2\u017d\u017e\7v\2\2\u017ed\3\2\2\2\u017f\u0180\7U\2\2\u0180\u0181"+
		"\7n\2\2\u0181\u0182\7g\2\2\u0182f\3\2\2\2\u0183\u0184\7U\2\2\u0184\u0185"+
		"\7i\2\2\u0185\u0186\7v\2\2\u0186h\3\2\2\2\u0187\u0188\7U\2\2\u0188\u0189"+
		"\7i\2\2\u0189\u018a\7g\2\2\u018aj\3\2\2\2\u018b\u018c\7C\2\2\u018c\u018d"+
		"\7f\2\2\u018d\u018e\7f\2\2\u018el\3\2\2\2\u018f\u0190\7U\2\2\u0190\u0191"+
		"\7w\2\2\u0191\u0192\7d\2\2\u0192n\3\2\2\2\u0193\u0194\7O\2\2\u0194\u0195"+
		"\7w\2\2\u0195\u0196\7n\2\2\u0196p\3\2\2\2\u0197\u0198\7W\2\2\u0198\u0199"+
		"\7F\2\2\u0199\u019a\7k\2\2\u019a\u019b\7x\2\2\u019br\3\2\2\2\u019c\u019d"+
		"\7W\2\2\u019d\u019e\7T\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7o\2\2\u01a0"+
		"t\3\2\2\2\u01a1\u01a2\7U\2\2\u01a2\u01a3\7F\2\2\u01a3\u01a4\7k\2\2\u01a4"+
		"\u01a5\7x\2\2\u01a5v\3\2\2\2\u01a6\u01a7\7U\2\2\u01a7\u01a8\7T\2\2\u01a8"+
		"\u01a9\7g\2\2\u01a9\u01aa\7o\2\2\u01aax\3\2\2\2\u01ab\u01ac\4\62;\2\u01ac"+
		"z\3\2\2\2\u01ad\u01ae\t\2\2\2\u01ae|\3\2\2\2\u01af\u01b0\t\3\2\2\u01b0"+
		"~\3\2\2\2\u01b1\u01b2\t\4\2\2\u01b2\u0080\3\2\2\2\u01b3\u01b7\t\5\2\2"+
		"\u01b4\u01b6\t\6\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u0082\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bc\t\7\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\bB\2\2\u01c0"+
		"\u0084\3\2\2\2\u01c1\u01c3\7\17\2\2\u01c2\u01c4\7\f\2\2\u01c3\u01c2\3"+
		"\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c7\7\f\2\2\u01c6"+
		"\u01c1\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\bC"+
		"\2\2\u01c9\u0086\3\2\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cc\7,\2\2\u01cc"+
		"\u01d0\3\2\2\2\u01cd\u01cf\13\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\u01d4\7,\2\2\u01d4\u01d5\7\61\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d7\bD\2\2\u01d7\u0088\3\2\2\2\u01d8\u01dc\7%\2\2\u01d9\u01db"+
		"\n\b\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\bE"+
		"\2\2\u01e0\u008a\3\2\2\2\u01e1\u01e2\7*\2\2\u01e2\u008c\3\2\2\2\u01e3"+
		"\u01e4\7+\2\2\u01e4\u008e\3\2\2\2\u01e5\u01e6\7]\2\2\u01e6\u0090\3\2\2"+
		"\2\u01e7\u01e8\7_\2\2\u01e8\u0092\3\2\2\2\u01e9\u01ea\7}\2\2\u01ea\u0094"+
		"\3\2\2\2\u01eb\u01ec\7\177\2\2\u01ec\u0096\3\2\2\2\23\2\u0099\u00a0\u00a5"+
		"\u00ab\u00b1\u00b7\u00bf\u00c2\u00c8\u00ce\u01b7\u01bd\u01c3\u01c6\u01d0"+
		"\u01dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}