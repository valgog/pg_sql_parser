// Generated from de/zalando/plpgsql/ast/LostAndFound.g4 by ANTLR 4.2.3-SNAPSHOT
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LostAndFound extends Lexer {
    static { RuntimeMetaData.checkVersion("4.2.3-SNAPSHOT"); }
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WITH_TIME=1, TYPECAST=2, DOT_DOT=3, NULLS_FIRST=4, NULLS_LAST=5, LESS_LESS=6, 
		GREATER_GREATER=7, COLON_EQUALS=8, ICONST=9, IDENT=10, SCONST=11, FCONST=12, 
		BCONST=13, XCONST=14, PARAM=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"TIME", "WITH", "WITH_TIME", "TYPECAST", "DOT_DOT", "NULLS", "FIRST", 
		"LAST", "NULLS_FIRST", "NULLS_LAST", "LESS_LESS", "GREATER_GREATER", "COLON_EQUALS", 
		"ICONST", "IDENT", "SCONST", "HEX_DIGIT", "FCONST", "BCONST", "XCONST", 
		"PARAM", "DIGIT"
	};


	public LostAndFound(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LostAndFound.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00dd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\6\17d\n"+
		"\17\r\17\16\17e\3\17\3\17\7\17j\n\17\f\17\16\17m\13\17\5\17o\n\17\3\17"+
		"\3\17\5\17s\n\17\3\17\6\17v\n\17\r\17\16\17w\5\17z\n\17\3\17\3\17\6\17"+
		"~\n\17\r\17\16\17\177\3\17\3\17\5\17\u0084\n\17\3\17\6\17\u0087\n\17\r"+
		"\17\16\17\u0088\5\17\u008b\n\17\5\17\u008d\n\17\3\20\3\20\3\20\3\20\7"+
		"\20\u0093\n\20\f\20\16\20\u0096\13\20\3\20\3\20\3\20\3\20\3\20\7\20\u009d"+
		"\n\20\f\20\16\20\u00a0\13\20\3\20\3\20\3\20\7\20\u00a5\n\20\f\20\16\20"+
		"\u00a8\13\20\3\20\3\20\3\20\7\20\u00ad\n\20\f\20\16\20\u00b0\13\20\5\20"+
		"\u00b2\n\20\3\21\3\21\3\21\3\21\7\21\u00b8\n\21\f\21\16\21\u00bb\13\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\7\23\u00c4\n\23\f\23\16\23\u00c7\13"+
		"\23\3\24\3\24\3\24\3\25\6\25\u00cd\n\25\r\25\16\25\u00ce\3\26\3\26\7\26"+
		"\u00d3\n\26\f\26\16\26\u00d6\13\26\3\26\3\26\5\26\u00da\n\26\3\27\3\27"+
		"\2\2\30\3\2\5\2\7\3\t\4\13\5\r\2\17\2\21\2\23\6\25\7\27\b\31\t\33\n\35"+
		"\13\37\f!\r#\2%\16\'\17)\20+\21-\2\3\2\32\4\2VVvv\4\2KKkk\4\2OOoo\4\2"+
		"GGgg\4\2YYyy\4\2JJjj\4\2PPpp\4\2WWww\4\2NNnn\4\2UUuu\4\2HHhh\4\2TTtt\4"+
		"\2CCcc\4\2--//\3\2$$\3\2bb\3\2__\5\2C\\aac|\6\2\62;C\\aac|\3\2))\5\2\62"+
		";CHch\3\2\62;\4\2ZZzz\5\2&&<<BB\u00ef\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\3/\3\2\2\2\5\64\3\2\2\2\79\3\2\2\2\t<\3\2\2\2\13?\3\2\2"+
		"\2\rB\3\2\2\2\17H\3\2\2\2\21N\3\2\2\2\23S\3\2\2\2\25V\3\2\2\2\27Y\3\2"+
		"\2\2\31\\\3\2\2\2\33_\3\2\2\2\35\u008c\3\2\2\2\37\u00b1\3\2\2\2!\u00b3"+
		"\3\2\2\2#\u00be\3\2\2\2%\u00c0\3\2\2\2\'\u00c8\3\2\2\2)\u00cc\3\2\2\2"+
		"+\u00d9\3\2\2\2-\u00db\3\2\2\2/\60\t\2\2\2\60\61\t\3\2\2\61\62\t\4\2\2"+
		"\62\63\t\5\2\2\63\4\3\2\2\2\64\65\t\6\2\2\65\66\t\3\2\2\66\67\t\2\2\2"+
		"\678\t\7\2\28\6\3\2\2\29:\5\5\3\2:;\5\3\2\2;\b\3\2\2\2<=\7<\2\2=>\7<\2"+
		"\2>\n\3\2\2\2?@\7\60\2\2@A\7\60\2\2A\f\3\2\2\2BC\t\b\2\2CD\t\t\2\2DE\t"+
		"\n\2\2EF\t\n\2\2FG\t\13\2\2G\16\3\2\2\2HI\t\f\2\2IJ\t\3\2\2JK\t\r\2\2"+
		"KL\t\13\2\2LM\t\2\2\2M\20\3\2\2\2NO\t\n\2\2OP\t\16\2\2PQ\t\13\2\2QR\t"+
		"\2\2\2R\22\3\2\2\2ST\5\r\7\2TU\5\17\b\2U\24\3\2\2\2VW\5\r\7\2WX\5\21\t"+
		"\2X\26\3\2\2\2YZ\7>\2\2Z[\7>\2\2[\30\3\2\2\2\\]\7@\2\2]^\7@\2\2^\32\3"+
		"\2\2\2_`\7<\2\2`a\7?\2\2a\34\3\2\2\2bd\5-\27\2cb\3\2\2\2de\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2fn\3\2\2\2gk\7\60\2\2hj\5-\27\2ih\3\2\2\2jm\3\2\2\2ki"+
		"\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2ng\3\2\2\2no\3\2\2\2oy\3\2\2\2p"+
		"r\t\5\2\2qs\t\17\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\5-\27\2ut\3\2\2\2"+
		"vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yp\3\2\2\2yz\3\2\2\2z\u008d\3"+
		"\2\2\2{}\7\60\2\2|~\5-\27\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u008a\3\2\2\2\u0081\u0083\t\5\2\2\u0082\u0084\t\17\2\2"+
		"\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087"+
		"\5-\27\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008cc\3\2\2\2\u008c{\3\2\2\2\u008d\36\3\2\2"+
		"\2\u008e\u0094\7$\2\2\u008f\u0093\n\20\2\2\u0090\u0091\7$\2\2\u0091\u0093"+
		"\7$\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u00b2\7$\2\2\u0098\u009e\7b\2\2\u0099\u009d\n\21\2\2\u009a"+
		"\u009b\7b\2\2\u009b\u009d\7b\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2"+
		"\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00b2\7b\2\2\u00a2\u00a6\7]\2\2\u00a3"+
		"\u00a5\n\22\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00b2\7_\2\2\u00aa\u00ae\t\23\2\2\u00ab\u00ad\t\24\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u008e\3\2\2\2\u00b1\u0098\3\2"+
		"\2\2\u00b1\u00a2\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b2 \3\2\2\2\u00b3\u00b9"+
		"\7)\2\2\u00b4\u00b8\n\25\2\2\u00b5\u00b6\7)\2\2\u00b6\u00b8\7)\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7)\2\2\u00bd\"\3\2\2\2\u00be\u00bf\t\26\2\2\u00bf$\3\2\2\2\u00c0"+
		"\u00c1\t\27\2\2\u00c1\u00c5\7\60\2\2\u00c2\u00c4\t\27\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"&\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\t\30\2\2\u00c9\u00ca\5!\21\2"+
		"\u00ca(\3\2\2\2\u00cb\u00cd\5#\22\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf*\3\2\2\2\u00d0\u00d4"+
		"\7A\2\2\u00d1\u00d3\5-\27\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\t\31\2\2\u00d8\u00da\5\37\20\2\u00d9\u00d0\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da,\3\2\2\2\u00db\u00dc\t\27\2\2\u00dc.\3\2\2\2\33\2"+
		"eknrwy\177\u0083\u0088\u008a\u008c\u0092\u0094\u009c\u009e\u00a6\u00ae"+
		"\u00b1\u00b7\u00b9\u00c5\u00ce\u00d4\u00d9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}