// Generated from de/zalando/plpgsql/ast/PlPgSql.g4 by ANTLR 4.1
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
public class PlPgSqlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, CREATE=5, REPLACE=6, FUNCTION=7, OR=8, 
		ARG_MODE=9, LANGUAGE=10, LANGUAGE_NAME=11, ASSIGN_OP=12, DEFAULT=13, RETURNS=14, 
		TABLE=15, AS=16, DECLARE=17, BEGIN=18, END=19, DOLLAR_QUOTE=20, WINDOW=21, 
		IMMUTABLE=22, STABLE=23, VOLATILE=24, CALLED_ON_NULL_INPUT=25, RETURNS_NULL_ON_NULL_INPUT=26, 
		STRICT=27, EXTERNAL=28, SECURITY=29, SECURITY_INVOKER=30, SECURITY_DEFINER=31, 
		COST=32, COST_VALUE=33, ROWS=34, ROWS_VALUE=35, NULL=36, ID=37, SL_COMMENT=38, 
		ML_COMMENT=39, NL=40, WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "';'", "CREATE", "REPLACE", "FUNCTION", "OR", "ARG_MODE", 
		"LANGUAGE", "LANGUAGE_NAME", "ASSIGN_OP", "DEFAULT", "RETURNS", "TABLE", 
		"AS", "DECLARE", "BEGIN", "END", "DOLLAR_QUOTE", "WINDOW", "IMMUTABLE", 
		"STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"STRICT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", 
		"COST", "COST_VALUE", "ROWS", "ROWS_VALUE", "NULL", "ID", "SL_COMMENT", 
		"ML_COMMENT", "NL", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "CREATE", "REPLACE", "FUNCTION", "OR", 
		"ARG_MODE", "LANGUAGE", "LANGUAGE_NAME", "ASSIGN_OP", "DEFAULT", "RETURNS", 
		"TABLE", "AS", "DECLARE", "BEGIN", "END", "DOLLAR_QUOTE", "WINDOW", "IMMUTABLE", 
		"STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"STRICT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", 
		"COST", "COST_VALUE", "ROWS", "ROWS_VALUE", "NULL", "ID", "SL_COMMENT", 
		"ML_COMMENT", "NL", "WS"
	};


		public static final int COMMENTS_CHANNEL = 0;


	public PlPgSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlPgSql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 37: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 38: ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 40: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = COMMENTS_CHANNEL;  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = COMMENTS_CHANNEL;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2+\u0186\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008b"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a1\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00d0\n\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\5\37\u0129\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \5 \u0135\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\6\""+
		"\u0146\n\"\r\"\16\"\u0147\3#\3#\3#\3#\3#\3$\6$\u0150\n$\r$\16$\u0151\3"+
		"%\3%\3%\3%\3%\3&\3&\7&\u015b\n&\f&\16&\u015e\13&\3\'\3\'\3\'\3\'\7\'\u0164"+
		"\n\'\f\'\16\'\u0167\13\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u0171\n(\f(\16"+
		"(\u0174\13(\3(\3(\3(\3(\3(\3)\5)\u017c\n)\3)\3)\3*\6*\u0181\n*\r*\16*"+
		"\u0182\3*\3*\4\u0165\u0172+\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67"+
		"\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\2O)\3Q*\1S+\4\3"+
		"\2\35\4\2EEee\4\2TTtt\4\2GGgg\4\2CCcc\4\2VVvv\4\2RRrr\4\2NNnn\4\2HHhh"+
		"\4\2WWww\4\2PPpp\4\2KKkk\4\2QQqq\4\2XXxx\4\2FFff\4\2IIii\4\2UUuu\4\2S"+
		"Sss\4\2DDdd\4\2YYyy\4\2OOoo\4\2ZZzz\4\2[[{{\4\2MMmm\3\2\62;\4\2C\\c|\5"+
		"\2\62;C\\c|\5\2\13\f\17\17\"\"\u0193\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t["+
		"\3\2\2\2\13]\3\2\2\2\rd\3\2\2\2\17l\3\2\2\2\21u\3\2\2\2\23\u008a\3\2\2"+
		"\2\25\u008c\3\2\2\2\27\u0095\3\2\2\2\31\u00a0\3\2\2\2\33\u00a2\3\2\2\2"+
		"\35\u00aa\3\2\2\2\37\u00b2\3\2\2\2!\u00b8\3\2\2\2#\u00bb\3\2\2\2%\u00c3"+
		"\3\2\2\2\'\u00c9\3\2\2\2)\u00cd\3\2\2\2+\u00d3\3\2\2\2-\u00da\3\2\2\2"+
		"/\u00e4\3\2\2\2\61\u00eb\3\2\2\2\63\u00f4\3\2\2\2\65\u0103\3\2\2\2\67"+
		"\u010e\3\2\2\29\u0115\3\2\2\2;\u011e\3\2\2\2=\u0128\3\2\2\2?\u0134\3\2"+
		"\2\2A\u013f\3\2\2\2C\u0145\3\2\2\2E\u0149\3\2\2\2G\u014f\3\2\2\2I\u0153"+
		"\3\2\2\2K\u0158\3\2\2\2M\u015f\3\2\2\2O\u016c\3\2\2\2Q\u017b\3\2\2\2S"+
		"\u0180\3\2\2\2UV\7+\2\2V\4\3\2\2\2WX\7.\2\2X\6\3\2\2\2YZ\7*\2\2Z\b\3\2"+
		"\2\2[\\\7=\2\2\\\n\3\2\2\2]^\t\2\2\2^_\t\3\2\2_`\t\4\2\2`a\t\5\2\2ab\t"+
		"\6\2\2bc\t\4\2\2c\f\3\2\2\2de\t\3\2\2ef\t\4\2\2fg\t\7\2\2gh\t\b\2\2hi"+
		"\t\5\2\2ij\t\2\2\2jk\t\4\2\2k\16\3\2\2\2lm\t\t\2\2mn\t\n\2\2no\t\13\2"+
		"\2op\t\2\2\2pq\t\6\2\2qr\t\f\2\2rs\t\r\2\2st\t\13\2\2t\20\3\2\2\2uv\t"+
		"\r\2\2vw\t\3\2\2w\22\3\2\2\2xy\t\f\2\2y\u008b\t\13\2\2z{\t\r\2\2{|\t\n"+
		"\2\2|\u008b\t\6\2\2}~\t\f\2\2~\177\t\13\2\2\177\u0080\t\r\2\2\u0080\u0081"+
		"\t\n\2\2\u0081\u008b\t\6\2\2\u0082\u0083\t\16\2\2\u0083\u0084\t\5\2\2"+
		"\u0084\u0085\t\3\2\2\u0085\u0086\t\f\2\2\u0086\u0087\t\5\2\2\u0087\u0088"+
		"\t\17\2\2\u0088\u0089\t\f\2\2\u0089\u008b\t\2\2\2\u008ax\3\2\2\2\u008a"+
		"z\3\2\2\2\u008a}\3\2\2\2\u008a\u0082\3\2\2\2\u008b\24\3\2\2\2\u008c\u008d"+
		"\t\b\2\2\u008d\u008e\t\5\2\2\u008e\u008f\t\13\2\2\u008f\u0090\t\20\2\2"+
		"\u0090\u0091\t\n\2\2\u0091\u0092\t\5\2\2\u0092\u0093\t\20\2\2\u0093\u0094"+
		"\t\4\2\2\u0094\26\3\2\2\2\u0095\u0096\t\7\2\2\u0096\u0097\t\b\2\2\u0097"+
		"\u0098\t\7\2\2\u0098\u0099\t\20\2\2\u0099\u009a\t\21\2\2\u009a\u009b\t"+
		"\22\2\2\u009b\u009c\t\b\2\2\u009c\30\3\2\2\2\u009d\u00a1\7?\2\2\u009e"+
		"\u009f\7<\2\2\u009f\u00a1\7?\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a1\32\3\2\2\2\u00a2\u00a3\t\17\2\2\u00a3\u00a4\t\4\2\2\u00a4\u00a5"+
		"\t\t\2\2\u00a5\u00a6\t\5\2\2\u00a6\u00a7\t\n\2\2\u00a7\u00a8\t\b\2\2\u00a8"+
		"\u00a9\t\6\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\t\3\2\2\u00ab\u00ac\t\4\2"+
		"\2\u00ac\u00ad\t\6\2\2\u00ad\u00ae\t\n\2\2\u00ae\u00af\t\3\2\2\u00af\u00b0"+
		"\t\13\2\2\u00b0\u00b1\t\21\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\t\6\2\2\u00b3"+
		"\u00b4\t\5\2\2\u00b4\u00b5\t\23\2\2\u00b5\u00b6\t\b\2\2\u00b6\u00b7\t"+
		"\4\2\2\u00b7 \3\2\2\2\u00b8\u00b9\t\5\2\2\u00b9\u00ba\t\21\2\2\u00ba\""+
		"\3\2\2\2\u00bb\u00bc\t\17\2\2\u00bc\u00bd\t\4\2\2\u00bd\u00be\t\2\2\2"+
		"\u00be\u00bf\t\b\2\2\u00bf\u00c0\t\5\2\2\u00c0\u00c1\t\3\2\2\u00c1\u00c2"+
		"\t\4\2\2\u00c2$\3\2\2\2\u00c3\u00c4\t\23\2\2\u00c4\u00c5\t\4\2\2\u00c5"+
		"\u00c6\t\20\2\2\u00c6\u00c7\t\f\2\2\u00c7\u00c8\t\13\2\2\u00c8&\3\2\2"+
		"\2\u00c9\u00ca\t\4\2\2\u00ca\u00cb\t\13\2\2\u00cb\u00cc\t\17\2\2\u00cc"+
		"(\3\2\2\2\u00cd\u00cf\7&\2\2\u00ce\u00d0\5K&\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7&\2\2\u00d2*\3\2\2\2\u00d3"+
		"\u00d4\t\24\2\2\u00d4\u00d5\t\f\2\2\u00d5\u00d6\t\13\2\2\u00d6\u00d7\t"+
		"\17\2\2\u00d7\u00d8\t\r\2\2\u00d8\u00d9\t\24\2\2\u00d9,\3\2\2\2\u00da"+
		"\u00db\t\f\2\2\u00db\u00dc\t\25\2\2\u00dc\u00dd\t\25\2\2\u00dd\u00de\t"+
		"\n\2\2\u00de\u00df\t\6\2\2\u00df\u00e0\t\5\2\2\u00e0\u00e1\t\23\2\2\u00e1"+
		"\u00e2\t\b\2\2\u00e2\u00e3\t\4\2\2\u00e3.\3\2\2\2\u00e4\u00e5\t\21\2\2"+
		"\u00e5\u00e6\t\6\2\2\u00e6\u00e7\t\5\2\2\u00e7\u00e8\t\23\2\2\u00e8\u00e9"+
		"\t\b\2\2\u00e9\u00ea\t\4\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\t\16\2\2\u00ec"+
		"\u00ed\t\r\2\2\u00ed\u00ee\t\b\2\2\u00ee\u00ef\t\5\2\2\u00ef\u00f0\t\6"+
		"\2\2\u00f0\u00f1\t\f\2\2\u00f1\u00f2\t\b\2\2\u00f2\u00f3\t\4\2\2\u00f3"+
		"\62\3\2\2\2\u00f4\u00f5\t\2\2\2\u00f5\u00f6\t\5\2\2\u00f6\u00f7\t\b\2"+
		"\2\u00f7\u00f8\t\b\2\2\u00f8\u00f9\t\4\2\2\u00f9\u00fa\t\17\2\2\u00fa"+
		"\u00fb\t\r\2\2\u00fb\u00fc\t\13\2\2\u00fc\u00fd\5I%\2\u00fd\u00fe\t\f"+
		"\2\2\u00fe\u00ff\t\13\2\2\u00ff\u0100\t\7\2\2\u0100\u0101\t\n\2\2\u0101"+
		"\u0102\t\6\2\2\u0102\64\3\2\2\2\u0103\u0104\5\35\17\2\u0104\u0105\5I%"+
		"\2\u0105\u0106\t\r\2\2\u0106\u0107\t\13\2\2\u0107\u0108\5I%\2\u0108\u0109"+
		"\t\f\2\2\u0109\u010a\t\13\2\2\u010a\u010b\t\7\2\2\u010b\u010c\t\n\2\2"+
		"\u010c\u010d\t\6\2\2\u010d\66\3\2\2\2\u010e\u010f\t\21\2\2\u010f\u0110"+
		"\t\6\2\2\u0110\u0111\t\3\2\2\u0111\u0112\t\f\2\2\u0112\u0113\t\2\2\2\u0113"+
		"\u0114\t\6\2\2\u01148\3\2\2\2\u0115\u0116\t\4\2\2\u0116\u0117\t\26\2\2"+
		"\u0117\u0118\t\6\2\2\u0118\u0119\t\4\2\2\u0119\u011a\t\3\2\2\u011a\u011b"+
		"\t\13\2\2\u011b\u011c\t\5\2\2\u011c\u011d\t\b\2\2\u011d:\3\2\2\2\u011e"+
		"\u011f\t\21\2\2\u011f\u0120\t\4\2\2\u0120\u0121\t\2\2\2\u0121\u0122\t"+
		"\n\2\2\u0122\u0123\t\3\2\2\u0123\u0124\t\f\2\2\u0124\u0125\t\6\2\2\u0125"+
		"\u0126\t\27\2\2\u0126<\3\2\2\2\u0127\u0129\59\35\2\u0128\u0127\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\5;\36\2\u012b\u012c"+
		"\t\f\2\2\u012c\u012d\t\13\2\2\u012d\u012e\t\16\2\2\u012e\u012f\t\r\2\2"+
		"\u012f\u0130\t\30\2\2\u0130\u0131\t\4\2\2\u0131\u0132\t\3\2\2\u0132>\3"+
		"\2\2\2\u0133\u0135\59\35\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\5;\36\2\u0137\u0138\t\17\2\2\u0138\u0139\t"+
		"\4\2\2\u0139\u013a\t\t\2\2\u013a\u013b\t\f\2\2\u013b\u013c\t\13\2\2\u013c"+
		"\u013d\t\4\2\2\u013d\u013e\t\3\2\2\u013e@\3\2\2\2\u013f\u0140\t\2\2\2"+
		"\u0140\u0141\t\r\2\2\u0141\u0142\t\21\2\2\u0142\u0143\t\6\2\2\u0143B\3"+
		"\2\2\2\u0144\u0146\t\31\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148D\3\2\2\2\u0149\u014a\t\3\2\2"+
		"\u014a\u014b\t\r\2\2\u014b\u014c\t\24\2\2\u014c\u014d\t\21\2\2\u014dF"+
		"\3\2\2\2\u014e\u0150\t\31\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2"+
		"\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152H\3\2\2\2\u0153\u0154\t"+
		"\13\2\2\u0154\u0155\t\n\2\2\u0155\u0156\t\b\2\2\u0156\u0157\t\b\2\2\u0157"+
		"J\3\2\2\2\u0158\u015c\t\32\2\2\u0159\u015b\t\33\2\2\u015a\u0159\3\2\2"+
		"\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015dL"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7/\2\2\u0160\u0161\7/\2\2\u0161"+
		"\u0165\3\2\2\2\u0162\u0164\13\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\5Q)\2\u0169\u016a\3\2\2\2\u016a\u016b\b\'\2"+
		"\2\u016bN\3\2\2\2\u016c\u016d\7\61\2\2\u016d\u016e\7,\2\2\u016e\u0172"+
		"\3\2\2\2\u016f\u0171\13\2\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0176\7,\2\2\u0176\u0177\7\61\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\b(\3\2\u0179P\3\2\2\2\u017a\u017c\7\17\2\2\u017b\u017a\3\2\2\2"+
		"\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7\f\2\2\u017eR\3"+
		"\2\2\2\u017f\u0181\t\34\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\b*"+
		"\4\2\u0185T\3\2\2\2\17\2\u008a\u00a0\u00cf\u0128\u0134\u0147\u0151\u015c"+
		"\u0165\u0172\u017b\u0182";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}