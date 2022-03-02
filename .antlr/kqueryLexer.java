// Generated from /home/clustfuzz/Documents/LLVM/KLEE-KQueryParser/kquery.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kqueryLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "SignedConstant", "Constant", "DecConstant", 
			"BinConstant", "OctConstant", "HexConstant", "WidthType", "Identifier", 
			"Digit", "WS", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace"
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


	public kqueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "kquery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0195\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\5/\u014f\n/\3\60\3\60\3\60\3\60\5\60"+
		"\u0155\n\60\3\61\6\61\u0158\n\61\r\61\16\61\u0159\3\62\3\62\3\62\3\62"+
		"\6\62\u0160\n\62\r\62\16\62\u0161\3\63\3\63\3\63\3\63\6\63\u0168\n\63"+
		"\r\63\16\63\u0169\3\64\3\64\3\64\3\64\6\64\u0170\n\64\r\64\16\64\u0171"+
		"\3\65\3\65\6\65\u0176\n\65\r\65\16\65\u0177\3\66\3\66\7\66\u017c\n\66"+
		"\f\66\16\66\u017f\13\66\3\67\3\67\38\68\u0184\n8\r8\168\u0185\38\38\3"+
		"9\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\2\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?\3\2\t\4\2--//\4"+
		"\2\62\63aa\4\2\629aa\6\2\62;C\\aac|\5\2C\\aac|\7\2\60\60\62;C\\aac|\5"+
		"\2\13\f\17\17\"\"\2\u01a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0083\3\2\2\2\7\u0089\3"+
		"\2\2\2\t\u008b\3\2\2\2\13\u008e\3\2\2\2\r\u0090\3\2\2\2\17\u0099\3\2\2"+
		"\2\21\u009d\3\2\2\2\23\u00a1\3\2\2\2\25\u00a6\3\2\2\2\27\u00ab\3\2\2\2"+
		"\31\u00b2\3\2\2\2\33\u00ba\3\2\2\2\35\u00bf\3\2\2\2\37\u00c4\3\2\2\2!"+
		"\u00c9\3\2\2\2#\u00d0\3\2\2\2%\u00d4\3\2\2\2\'\u00dc\3\2\2\2)\u00e4\3"+
		"\2\2\2+\u00e8\3\2\2\2-\u00eb\3\2\2\2/\u00ef\3\2\2\2\61\u00f2\3\2\2\2\63"+
		"\u00f5\3\2\2\2\65\u00f9\3\2\2\2\67\u00fd\3\2\2\29\u0101\3\2\2\2;\u0105"+
		"\3\2\2\2=\u0109\3\2\2\2?\u010d\3\2\2\2A\u0111\3\2\2\2C\u0115\3\2\2\2E"+
		"\u0119\3\2\2\2G\u011d\3\2\2\2I\u0121\3\2\2\2K\u0126\3\2\2\2M\u012b\3\2"+
		"\2\2O\u0130\3\2\2\2Q\u0135\3\2\2\2S\u0137\3\2\2\2U\u013c\3\2\2\2W\u0142"+
		"\3\2\2\2Y\u0145\3\2\2\2[\u0147\3\2\2\2]\u0149\3\2\2\2_\u0154\3\2\2\2a"+
		"\u0157\3\2\2\2c\u015b\3\2\2\2e\u0163\3\2\2\2g\u016b\3\2\2\2i\u0173\3\2"+
		"\2\2k\u0179\3\2\2\2m\u0180\3\2\2\2o\u0183\3\2\2\2q\u0189\3\2\2\2s\u018b"+
		"\3\2\2\2u\u018d\3\2\2\2w\u018f\3\2\2\2y\u0191\3\2\2\2{\u0193\3\2\2\2}"+
		"~\7s\2\2~\177\7w\2\2\177\u0080\7g\2\2\u0080\u0081\7t\2\2\u0081\u0082\7"+
		"{\2\2\u0082\4\3\2\2\2\u0083\u0084\7c\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7c\2\2\u0087\u0088\7{\2\2\u0088\6\3\2\2\2\u0089\u008a"+
		"\7<\2\2\u008a\b\3\2\2\2\u008b\u008c\7/\2\2\u008c\u008d\7@\2\2\u008d\n"+
		"\3\2\2\2\u008e\u008f\7?\2\2\u008f\f\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092"+
		"\7{\2\2\u0092\u0093\7o\2\2\u0093\u0094\7d\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7n\2\2\u0096\u0097\7k\2\2\u0097\u0098\7e\2\2\u0098\16\3\2\2\2\u0099"+
		"\u009a\7P\2\2\u009a\u009b\7q\2\2\u009b\u009c\7v\2\2\u009c\20\3\2\2\2\u009d"+
		"\u009e\7U\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7n\2\2\u00a0\22\3\2\2\2\u00a1"+
		"\u00a2\7N\2\2\u00a2\u00a3\7U\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7t\2\2"+
		"\u00a5\24\3\2\2\2\u00a6\u00a7\7C\2\2\u00a7\u00a8\7U\2\2\u00a8\u00a9\7"+
		"j\2\2\u00a9\u00aa\7t\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\7E\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\7z\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7e\2\2"+
		"\u00b8\u00b9\7v\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7\\\2\2\u00bb\u00bc\7"+
		"G\2\2\u00bc\u00bd\7z\2\2\u00bd\u00be\7v\2\2\u00be\34\3\2\2\2\u00bf\u00c0"+
		"\7U\2\2\u00c0\u00c1\7G\2\2\u00c1\u00c2\7z\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"\36\3\2\2\2\u00c4\u00c5\7T\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7f\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7U\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7v\2\2"+
		"\u00cf\"\3\2\2\2\u00d0\u00d1\7P\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7i"+
		"\2\2\u00d3$\3\2\2\2\u00d4\u00d5\7T\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7"+
		"\7c\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9\7N\2\2\u00d9\u00da\7U\2\2\u00da"+
		"\u00db\7D\2\2\u00db&\3\2\2\2\u00dc\u00dd\7T\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7c\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7O\2\2\u00e1\u00e2\7U\2\2"+
		"\u00e2\u00e3\7D\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7C\2\2\u00e5\u00e6\7p\2"+
		"\2\u00e6\u00e7\7f\2\2\u00e7*\3\2\2\2\u00e8\u00e9\7Q\2\2\u00e9\u00ea\7"+
		"t\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7Z\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7G\2\2\u00f0\u00f1\7s\2\2\u00f1\60"+
		"\3\2\2\2\u00f2\u00f3\7P\2\2\u00f3\u00f4\7g\2\2\u00f4\62\3\2\2\2\u00f5"+
		"\u00f6\7W\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7v\2\2\u00f8\64\3\2\2\2\u00f9"+
		"\u00fa\7W\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7g\2\2\u00fc\66\3\2\2\2\u00fd"+
		"\u00fe\7W\2\2\u00fe\u00ff\7i\2\2\u00ff\u0100\7v\2\2\u01008\3\2\2\2\u0101"+
		"\u0102\7W\2\2\u0102\u0103\7i\2\2\u0103\u0104\7g\2\2\u0104:\3\2\2\2\u0105"+
		"\u0106\7U\2\2\u0106\u0107\7n\2\2\u0107\u0108\7v\2\2\u0108<\3\2\2\2\u0109"+
		"\u010a\7U\2\2\u010a\u010b\7n\2\2\u010b\u010c\7g\2\2\u010c>\3\2\2\2\u010d"+
		"\u010e\7U\2\2\u010e\u010f\7i\2\2\u010f\u0110\7v\2\2\u0110@\3\2\2\2\u0111"+
		"\u0112\7U\2\2\u0112\u0113\7i\2\2\u0113\u0114\7g\2\2\u0114B\3\2\2\2\u0115"+
		"\u0116\7C\2\2\u0116\u0117\7f\2\2\u0117\u0118\7f\2\2\u0118D\3\2\2\2\u0119"+
		"\u011a\7U\2\2\u011a\u011b\7w\2\2\u011b\u011c\7d\2\2\u011cF\3\2\2\2\u011d"+
		"\u011e\7O\2\2\u011e\u011f\7w\2\2\u011f\u0120\7n\2\2\u0120H\3\2\2\2\u0121"+
		"\u0122\7W\2\2\u0122\u0123\7F\2\2\u0123\u0124\7k\2\2\u0124\u0125\7x\2\2"+
		"\u0125J\3\2\2\2\u0126\u0127\7W\2\2\u0127\u0128\7T\2\2\u0128\u0129\7g\2"+
		"\2\u0129\u012a\7o\2\2\u012aL\3\2\2\2\u012b\u012c\7U\2\2\u012c\u012d\7"+
		"F\2\2\u012d\u012e\7k\2\2\u012e\u012f\7x\2\2\u012fN\3\2\2\2\u0130\u0131"+
		"\7U\2\2\u0131\u0132\7T\2\2\u0132\u0133\7g\2\2\u0133\u0134\7o\2\2\u0134"+
		"P\3\2\2\2\u0135\u0136\7.\2\2\u0136R\3\2\2\2\u0137\u0138\7v\2\2\u0138\u0139"+
		"\7t\2\2\u0139\u013a\7w\2\2\u013a\u013b\7g\2\2\u013bT\3\2\2\2\u013c\u013d"+
		"\7h\2\2\u013d\u013e\7c\2\2\u013e\u013f\7n\2\2\u013f\u0140\7u\2\2\u0140"+
		"\u0141\7g\2\2\u0141V\3\2\2\2\u0142\u0143\7h\2\2\u0143\u0144\7r\2\2\u0144"+
		"X\3\2\2\2\u0145\u0146\7k\2\2\u0146Z\3\2\2\2\u0147\u0148\7B\2\2\u0148\\"+
		"\3\2\2\2\u0149\u014e\t\2\2\2\u014a\u014f\5a\61\2\u014b\u014f\5c\62\2\u014c"+
		"\u014f\5e\63\2\u014d\u014f\5g\64\2\u014e\u014a\3\2\2\2\u014e\u014b\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f^\3\2\2\2\u0150\u0155"+
		"\5a\61\2\u0151\u0155\5c\62\2\u0152\u0155\5e\63\2\u0153\u0155\5g\64\2\u0154"+
		"\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2"+
		"\2\2\u0155`\3\2\2\2\u0156\u0158\5m\67\2\u0157\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015ab\3\2\2\2\u015b"+
		"\u015c\7\62\2\2\u015c\u015d\7d\2\2\u015d\u015f\3\2\2\2\u015e\u0160\t\3"+
		"\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162d\3\2\2\2\u0163\u0164\7\62\2\2\u0164\u0165\7q\2\2"+
		"\u0165\u0167\3\2\2\2\u0166\u0168\t\4\2\2\u0167\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016af\3\2\2\2\u016b"+
		"\u016c\7\62\2\2\u016c\u016d\7z\2\2\u016d\u016f\3\2\2\2\u016e\u0170\t\5"+
		"\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172h\3\2\2\2\u0173\u0175\7y\2\2\u0174\u0176\5m\67\2\u0175"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178j\3\2\2\2\u0179\u017d\t\6\2\2\u017a\u017c\t\7\2\2\u017b\u017a"+
		"\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"l\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\4\62;\2\u0181n\3\2\2\2\u0182"+
		"\u0184\t\b\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b8\2\2\u0188"+
		"p\3\2\2\2\u0189\u018a\7*\2\2\u018ar\3\2\2\2\u018b\u018c\7+\2\2\u018ct"+
		"\3\2\2\2\u018d\u018e\7]\2\2\u018ev\3\2\2\2\u018f\u0190\7_\2\2\u0190x\3"+
		"\2\2\2\u0191\u0192\7}\2\2\u0192z\3\2\2\2\u0193\u0194\7\177\2\2\u0194|"+
		"\3\2\2\2\f\2\u014e\u0154\u0159\u0161\u0169\u0171\u0177\u017d\u0185\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}