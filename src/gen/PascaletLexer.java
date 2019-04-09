package gen;// Generated from C:/Users/ptrck/Github/pascalet/src\Pascalet.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascaletLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST=1, AND=2, ARRAY=3, BEGIN=4, BOOLEAN=5, CHAR=6, DIV=7, DO=8, ELSE=9, 
		END=10, FOR=11, FUNCTION=12, IF=13, IN=14, INTEGER=15, LABEL=16, MOD=17, 
		NOT=18, OF=19, OR=20, PROCEDURE=21, PROGRAM=22, THEN=23, TO=24, TYPE=25, 
		UNTIL=26, VAR=27, PLUS=28, MINUS=29, STAR=30, SLASH=31, ASSIGN=32, COMMA=33, 
		SEMI=34, COLON=35, EQUAL=36, NOT_EQUAL=37, LT=38, LE=39, GE=40, GT=41, 
		LPAREN=42, RPAREN=43, LBRACK=44, LBRACK2=45, RBRACK=46, RBRACK2=47, POINTER=48, 
		AT=49, DOT=50, DOTDOT=51, LCURLY=52, RCURLY=53, USES=54, STRING=55, TRUE=56, 
		FALSE=57, WS=58, COMMENT_1=59, COMMENT_2=60, IDENT=61, STRING_LITERAL=62, 
		NUM_INT=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CONST", 
			"AND", "ARRAY", "BEGIN", "BOOLEAN", "CHAR", "DIV", "DO", "ELSE", "END", 
			"FOR", "FUNCTION", "IF", "IN", "INTEGER", "LABEL", "MOD", "NOT", "OF", 
			"OR", "PROCEDURE", "PROGRAM", "THEN", "TO", "TYPE", "UNTIL", "VAR", "PLUS", 
			"MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", 
			"NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", 
			"RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", 
			"USES", "STRING", "TRUE", "FALSE", "WS", "COMMENT_1", "COMMENT_2", "IDENT", 
			"STRING_LITERAL", "NUM_INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", 
			"':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", 
			"'(.'", "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST", "AND", "ARRAY", "BEGIN", "BOOLEAN", "CHAR", "DIV", "DO", 
			"ELSE", "END", "FOR", "FUNCTION", "IF", "IN", "INTEGER", "LABEL", "MOD", 
			"NOT", "OF", "OR", "PROCEDURE", "PROGRAM", "THEN", "TO", "TYPE", "UNTIL", 
			"VAR", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", 
			"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
			"LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", 
			"RCURLY", "USES", "STRING", "TRUE", "FALSE", "WS", "COMMENT_1", "COMMENT_2", 
			"IDENT", "STRING_LITERAL", "NUM_INT"
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


	public PascaletLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammars/Pascalet.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u01fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A"+
		"\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3I\3I\3J\3J\3J\3K"+
		"\3K\3L\3L\3M\3M\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R"+
		"\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\3V\7V\u01cf"+
		"\nV\fV\16V\u01d2\13V\3V\3V\3V\3V\3V\3W\3W\7W\u01db\nW\fW\16W\u01de\13"+
		"W\3W\3W\3W\3W\3X\3X\7X\u01e6\nX\fX\16X\u01e9\13X\3Y\3Y\3Y\3Y\7Y\u01ef"+
		"\nY\fY\16Y\u01f2\13Y\3Y\3Y\3Z\6Z\u01f7\nZ\rZ\16Z\u01f8\4\u01d0\u01dc\2"+
		"[\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG"+
		"\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34"+
		"k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b"+
		"-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65"+
		"\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af"+
		"?\u00b1@\u00b3A\3\2 \4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2"+
		"))\2\u01e5\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\3\u00b5"+
		"\3\2\2\2\5\u00b7\3\2\2\2\7\u00b9\3\2\2\2\t\u00bb\3\2\2\2\13\u00bd\3\2"+
		"\2\2\r\u00bf\3\2\2\2\17\u00c1\3\2\2\2\21\u00c3\3\2\2\2\23\u00c5\3\2\2"+
		"\2\25\u00c7\3\2\2\2\27\u00c9\3\2\2\2\31\u00cb\3\2\2\2\33\u00cd\3\2\2\2"+
		"\35\u00cf\3\2\2\2\37\u00d1\3\2\2\2!\u00d3\3\2\2\2#\u00d5\3\2\2\2%\u00d7"+
		"\3\2\2\2\'\u00d9\3\2\2\2)\u00db\3\2\2\2+\u00dd\3\2\2\2-\u00df\3\2\2\2"+
		"/\u00e1\3\2\2\2\61\u00e3\3\2\2\2\63\u00e5\3\2\2\2\65\u00e7\3\2\2\2\67"+
		"\u00e9\3\2\2\29\u00ef\3\2\2\2;\u00f3\3\2\2\2=\u00f9\3\2\2\2?\u00ff\3\2"+
		"\2\2A\u0107\3\2\2\2C\u010c\3\2\2\2E\u0110\3\2\2\2G\u0113\3\2\2\2I\u0118"+
		"\3\2\2\2K\u011c\3\2\2\2M\u0120\3\2\2\2O\u0129\3\2\2\2Q\u012c\3\2\2\2S"+
		"\u012f\3\2\2\2U\u0137\3\2\2\2W\u013d\3\2\2\2Y\u0141\3\2\2\2[\u0145\3\2"+
		"\2\2]\u0148\3\2\2\2_\u014b\3\2\2\2a\u0155\3\2\2\2c\u015d\3\2\2\2e\u0162"+
		"\3\2\2\2g\u0165\3\2\2\2i\u016a\3\2\2\2k\u0170\3\2\2\2m\u0174\3\2\2\2o"+
		"\u0176\3\2\2\2q\u0178\3\2\2\2s\u017a\3\2\2\2u\u017c\3\2\2\2w\u017f\3\2"+
		"\2\2y\u0181\3\2\2\2{\u0183\3\2\2\2}\u0185\3\2\2\2\177\u0187\3\2\2\2\u0081"+
		"\u018a\3\2\2\2\u0083\u018c\3\2\2\2\u0085\u018f\3\2\2\2\u0087\u0192\3\2"+
		"\2\2\u0089\u0194\3\2\2\2\u008b\u0196\3\2\2\2\u008d\u0198\3\2\2\2\u008f"+
		"\u019a\3\2\2\2\u0091\u019d\3\2\2\2\u0093\u019f\3\2\2\2\u0095\u01a2\3\2"+
		"\2\2\u0097\u01a4\3\2\2\2\u0099\u01a6\3\2\2\2\u009b\u01a8\3\2\2\2\u009d"+
		"\u01ab\3\2\2\2\u009f\u01ad\3\2\2\2\u00a1\u01af\3\2\2\2\u00a3\u01b4\3\2"+
		"\2\2\u00a5\u01bb\3\2\2\2\u00a7\u01c0\3\2\2\2\u00a9\u01c6\3\2\2\2\u00ab"+
		"\u01ca\3\2\2\2\u00ad\u01d8\3\2\2\2\u00af\u01e3\3\2\2\2\u00b1\u01ea\3\2"+
		"\2\2\u00b3\u01f6\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6\4\3\2\2\2\u00b7\u00b8"+
		"\t\3\2\2\u00b8\6\3\2\2\2\u00b9\u00ba\t\4\2\2\u00ba\b\3\2\2\2\u00bb\u00bc"+
		"\t\5\2\2\u00bc\n\3\2\2\2\u00bd\u00be\t\6\2\2\u00be\f\3\2\2\2\u00bf\u00c0"+
		"\t\7\2\2\u00c0\16\3\2\2\2\u00c1\u00c2\t\b\2\2\u00c2\20\3\2\2\2\u00c3\u00c4"+
		"\t\t\2\2\u00c4\22\3\2\2\2\u00c5\u00c6\t\n\2\2\u00c6\24\3\2\2\2\u00c7\u00c8"+
		"\t\13\2\2\u00c8\26\3\2\2\2\u00c9\u00ca\t\f\2\2\u00ca\30\3\2\2\2\u00cb"+
		"\u00cc\t\r\2\2\u00cc\32\3\2\2\2\u00cd\u00ce\t\16\2\2\u00ce\34\3\2\2\2"+
		"\u00cf\u00d0\t\17\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\t\20\2\2\u00d2 \3\2"+
		"\2\2\u00d3\u00d4\t\21\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\t\22\2\2\u00d6$"+
		"\3\2\2\2\u00d7\u00d8\t\23\2\2\u00d8&\3\2\2\2\u00d9\u00da\t\24\2\2\u00da"+
		"(\3\2\2\2\u00db\u00dc\t\25\2\2\u00dc*\3\2\2\2\u00dd\u00de\t\26\2\2\u00de"+
		",\3\2\2\2\u00df\u00e0\t\27\2\2\u00e0.\3\2\2\2\u00e1\u00e2\t\30\2\2\u00e2"+
		"\60\3\2\2\2\u00e3\u00e4\t\31\2\2\u00e4\62\3\2\2\2\u00e5\u00e6\t\32\2\2"+
		"\u00e6\64\3\2\2\2\u00e7\u00e8\t\33\2\2\u00e8\66\3\2\2\2\u00e9\u00ea\5"+
		"\7\4\2\u00ea\u00eb\5\37\20\2\u00eb\u00ec\5\35\17\2\u00ec\u00ed\5\'\24"+
		"\2\u00ed\u00ee\5)\25\2\u00ee8\3\2\2\2\u00ef\u00f0\5\3\2\2\u00f0\u00f1"+
		"\5\35\17\2\u00f1\u00f2\5\t\5\2\u00f2:\3\2\2\2\u00f3\u00f4\5\3\2\2\u00f4"+
		"\u00f5\5%\23\2\u00f5\u00f6\5%\23\2\u00f6\u00f7\5\3\2\2\u00f7\u00f8\5\63"+
		"\32\2\u00f8<\3\2\2\2\u00f9\u00fa\5\5\3\2\u00fa\u00fb\5\13\6\2\u00fb\u00fc"+
		"\5\17\b\2\u00fc\u00fd\5\23\n\2\u00fd\u00fe\5\35\17\2\u00fe>\3\2\2\2\u00ff"+
		"\u0100\5\5\3\2\u0100\u0101\5\37\20\2\u0101\u0102\5\37\20\2\u0102\u0103"+
		"\5\31\r\2\u0103\u0104\5\13\6\2\u0104\u0105\5\3\2\2\u0105\u0106\5\35\17"+
		"\2\u0106@\3\2\2\2\u0107\u0108\5\7\4\2\u0108\u0109\5\21\t\2\u0109\u010a"+
		"\5\3\2\2\u010a\u010b\5%\23\2\u010bB\3\2\2\2\u010c\u010d\5\t\5\2\u010d"+
		"\u010e\5\23\n\2\u010e\u010f\5-\27\2\u010fD\3\2\2\2\u0110\u0111\5\t\5\2"+
		"\u0111\u0112\5\37\20\2\u0112F\3\2\2\2\u0113\u0114\5\13\6\2\u0114\u0115"+
		"\5\31\r\2\u0115\u0116\5\'\24\2\u0116\u0117\5\13\6\2\u0117H\3\2\2\2\u0118"+
		"\u0119\5\13\6\2\u0119\u011a\5\35\17\2\u011a\u011b\5\t\5\2\u011bJ\3\2\2"+
		"\2\u011c\u011d\5\r\7\2\u011d\u011e\5\37\20\2\u011e\u011f\5%\23\2\u011f"+
		"L\3\2\2\2\u0120\u0121\5\r\7\2\u0121\u0122\5+\26\2\u0122\u0123\5\35\17"+
		"\2\u0123\u0124\5\7\4\2\u0124\u0125\5)\25\2\u0125\u0126\5\23\n\2\u0126"+
		"\u0127\5\37\20\2\u0127\u0128\5\35\17\2\u0128N\3\2\2\2\u0129\u012a\5\23"+
		"\n\2\u012a\u012b\5\r\7\2\u012bP\3\2\2\2\u012c\u012d\5\23\n\2\u012d\u012e"+
		"\5\35\17\2\u012eR\3\2\2\2\u012f\u0130\5\23\n\2\u0130\u0131\5\35\17\2\u0131"+
		"\u0132\5)\25\2\u0132\u0133\5\13\6\2\u0133\u0134\5\17\b\2\u0134\u0135\5"+
		"\13\6\2\u0135\u0136\5%\23\2\u0136T\3\2\2\2\u0137\u0138\5\31\r\2\u0138"+
		"\u0139\5\3\2\2\u0139\u013a\5\5\3\2\u013a\u013b\5\13\6\2\u013b\u013c\5"+
		"\31\r\2\u013cV\3\2\2\2\u013d\u013e\5\33\16\2\u013e\u013f\5\37\20\2\u013f"+
		"\u0140\5\t\5\2\u0140X\3\2\2\2\u0141\u0142\5\35\17\2\u0142\u0143\5\37\20"+
		"\2\u0143\u0144\5)\25\2\u0144Z\3\2\2\2\u0145\u0146\5\37\20\2\u0146\u0147"+
		"\5\r\7\2\u0147\\\3\2\2\2\u0148\u0149\5\37\20\2\u0149\u014a\5%\23\2\u014a"+
		"^\3\2\2\2\u014b\u014c\5!\21\2\u014c\u014d\5%\23\2\u014d\u014e\5\37\20"+
		"\2\u014e\u014f\5\7\4\2\u014f\u0150\5\13\6\2\u0150\u0151\5\t\5\2\u0151"+
		"\u0152\5+\26\2\u0152\u0153\5%\23\2\u0153\u0154\5\13\6\2\u0154`\3\2\2\2"+
		"\u0155\u0156\5!\21\2\u0156\u0157\5%\23\2\u0157\u0158\5\37\20\2\u0158\u0159"+
		"\5\17\b\2\u0159\u015a\5%\23\2\u015a\u015b\5\3\2\2\u015b\u015c\5\33\16"+
		"\2\u015cb\3\2\2\2\u015d\u015e\5)\25\2\u015e\u015f\5\21\t\2\u015f\u0160"+
		"\5\13\6\2\u0160\u0161\5\35\17\2\u0161d\3\2\2\2\u0162\u0163\5)\25\2\u0163"+
		"\u0164\5\37\20\2\u0164f\3\2\2\2\u0165\u0166\5)\25\2\u0166\u0167\5\63\32"+
		"\2\u0167\u0168\5!\21\2\u0168\u0169\5\13\6\2\u0169h\3\2\2\2\u016a\u016b"+
		"\5+\26\2\u016b\u016c\5\35\17\2\u016c\u016d\5)\25\2\u016d\u016e\5\23\n"+
		"\2\u016e\u016f\5\31\r\2\u016fj\3\2\2\2\u0170\u0171\5-\27\2\u0171\u0172"+
		"\5\3\2\2\u0172\u0173\5%\23\2\u0173l\3\2\2\2\u0174\u0175\7-\2\2\u0175n"+
		"\3\2\2\2\u0176\u0177\7/\2\2\u0177p\3\2\2\2\u0178\u0179\7,\2\2\u0179r\3"+
		"\2\2\2\u017a\u017b\7\61\2\2\u017bt\3\2\2\2\u017c\u017d\7<\2\2\u017d\u017e"+
		"\7?\2\2\u017ev\3\2\2\2\u017f\u0180\7.\2\2\u0180x\3\2\2\2\u0181\u0182\7"+
		"=\2\2\u0182z\3\2\2\2\u0183\u0184\7<\2\2\u0184|\3\2\2\2\u0185\u0186\7?"+
		"\2\2\u0186~\3\2\2\2\u0187\u0188\7>\2\2\u0188\u0189\7@\2\2\u0189\u0080"+
		"\3\2\2\2\u018a\u018b\7>\2\2\u018b\u0082\3\2\2\2\u018c\u018d\7>\2\2\u018d"+
		"\u018e\7?\2\2\u018e\u0084\3\2\2\2\u018f\u0190\7@\2\2\u0190\u0191\7?\2"+
		"\2\u0191\u0086\3\2\2\2\u0192\u0193\7@\2\2\u0193\u0088\3\2\2\2\u0194\u0195"+
		"\7*\2\2\u0195\u008a\3\2\2\2\u0196\u0197\7+\2\2\u0197\u008c\3\2\2\2\u0198"+
		"\u0199\7]\2\2\u0199\u008e\3\2\2\2\u019a\u019b\7*\2\2\u019b\u019c\7\60"+
		"\2\2\u019c\u0090\3\2\2\2\u019d\u019e\7_\2\2\u019e\u0092\3\2\2\2\u019f"+
		"\u01a0\7\60\2\2\u01a0\u01a1\7+\2\2\u01a1\u0094\3\2\2\2\u01a2\u01a3\7`"+
		"\2\2\u01a3\u0096\3\2\2\2\u01a4\u01a5\7B\2\2\u01a5\u0098\3\2\2\2\u01a6"+
		"\u01a7\7\60\2\2\u01a7\u009a\3\2\2\2\u01a8\u01a9\7\60\2\2\u01a9\u01aa\7"+
		"\60\2\2\u01aa\u009c\3\2\2\2\u01ab\u01ac\7}\2\2\u01ac\u009e\3\2\2\2\u01ad"+
		"\u01ae\7\177\2\2\u01ae\u00a0\3\2\2\2\u01af\u01b0\5+\26\2\u01b0\u01b1\5"+
		"\'\24\2\u01b1\u01b2\5\13\6\2\u01b2\u01b3\5\'\24\2\u01b3\u00a2\3\2\2\2"+
		"\u01b4\u01b5\5\'\24\2\u01b5\u01b6\5)\25\2\u01b6\u01b7\5%\23\2\u01b7\u01b8"+
		"\5\23\n\2\u01b8\u01b9\5\35\17\2\u01b9\u01ba\5\17\b\2\u01ba\u00a4\3\2\2"+
		"\2\u01bb\u01bc\5)\25\2\u01bc\u01bd\5%\23\2\u01bd\u01be\5+\26\2\u01be\u01bf"+
		"\5\13\6\2\u01bf\u00a6\3\2\2\2\u01c0\u01c1\5\r\7\2\u01c1\u01c2\5\3\2\2"+
		"\u01c2\u01c3\5\31\r\2\u01c3\u01c4\5\'\24\2\u01c4\u01c5\5\13\6\2\u01c5"+
		"\u00a8\3\2\2\2\u01c6\u01c7\t\34\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\b"+
		"U\2\2\u01c9\u00aa\3\2\2\2\u01ca\u01cb\7*\2\2\u01cb\u01cc\7,\2\2\u01cc"+
		"\u01d0\3\2\2\2\u01cd\u01cf\13\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\u01d4\7,\2\2\u01d4\u01d5\7+\2\2\u01d5\u01d6\3\2\2"+
		"\2\u01d6\u01d7\bV\2\2\u01d7\u00ac\3\2\2\2\u01d8\u01dc\7}\2\2\u01d9\u01db"+
		"\13\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01dd\3\2\2\2"+
		"\u01dc\u01da\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0"+
		"\7\177\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\bW\2\2\u01e2\u00ae\3\2\2\2"+
		"\u01e3\u01e7\t\35\2\2\u01e4\u01e6\t\36\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u00b0\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01f0\7)\2\2\u01eb\u01ec\7)\2\2\u01ec\u01ef\7)\2"+
		"\2\u01ed\u01ef\n\37\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7)\2\2\u01f4\u00b2\3\2\2\2\u01f5"+
		"\u01f7\4\62;\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u00b4\3\2\2\2\t\2\u01d0\u01dc\u01e7\u01ee"+
		"\u01f0\u01f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}