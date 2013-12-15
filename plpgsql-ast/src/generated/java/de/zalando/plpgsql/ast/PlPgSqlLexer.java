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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, STRING=6, INTEGER_VALUE=7, DECIMAL_VALUE=8, 
		ALIAS=9, FOR=10, CREATE=11, REPLACE=12, FUNCTION=13, OR=14, IN=15, OUT=16, 
		INOUT=17, VARIADIC=18, LANGUAGE=19, LANGUAGE_NAME=20, ASSIGN_OP=21, DEFAULT=22, 
		RETURNS=23, TABLE=24, AS=25, DECLARE=26, BEGIN=27, END=28, DOLLAR_QUOTE=29, 
		WINDOW=30, IMMUTABLE=31, STABLE=32, VOLATILE=33, CALLED_ON_NULL_INPUT=34, 
		RETURNS_NULL_ON_NULL_INPUT=35, STRICT=36, EXTERNAL=37, SECURITY=38, SECURITY_INVOKER=39, 
		SECURITY_DEFINER=40, COST=41, ROWS=42, CONSTANT=43, COLLATE=44, NOT=45, 
		NULL=46, ID=47, SL_COMMENT=48, ML_COMMENT=49, WS=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'.'", "')'", "','", "'('", "';'", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", 
		"ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", "OR", "IN", "OUT", "INOUT", 
		"VARIADIC", "LANGUAGE", "LANGUAGE_NAME", "ASSIGN_OP", "DEFAULT", "RETURNS", 
		"TABLE", "AS", "DECLARE", "BEGIN", "END", "DOLLAR_QUOTE", "WINDOW", "IMMUTABLE", 
		"STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"STRICT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", 
		"COST", "ROWS", "CONSTANT", "COLLATE", "NOT", "NULL", "ID", "SL_COMMENT", 
		"ML_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", 
		"ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", "OR", "IN", "OUT", "INOUT", 
		"VARIADIC", "LANGUAGE", "LANGUAGE_NAME", "ASSIGN_OP", "DEFAULT", "RETURNS", 
		"TABLE", "AS", "DECLARE", "BEGIN", "END", "DOLLAR_QUOTE", "WINDOW", "IMMUTABLE", 
		"STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"STRICT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", 
		"COST", "ROWS", "CONSTANT", "COLLATE", "NOT", "NULL", "ID", "SL_COMMENT", 
		"ML_COMMENT", "WS", "EXPONENT", "DIGIT"
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
		case 47: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 48: ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 49: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\64\u01fb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\7\7z\n\7\f\7\16\7}\13\7\3\7\3\7\3\b\6\b\u0082\n\b\r\b\16\b\u0083\3"+
		"\t\6\t\u0087\n\t\r\t\16\t\u0088\3\t\3\t\7\t\u008d\n\t\f\t\16\t\u0090\13"+
		"\t\3\t\3\t\6\t\u0094\n\t\r\t\16\t\u0095\3\t\6\t\u0099\n\t\r\t\16\t\u009a"+
		"\3\t\3\t\7\t\u009f\n\t\f\t\16\t\u00a2\13\t\5\t\u00a4\n\t\3\t\3\t\3\t\3"+
		"\t\6\t\u00aa\n\t\r\t\16\t\u00ab\3\t\3\t\5\t\u00b0\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\5\26\u0101\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u0130\n\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\5(\u0189\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\5)\u0195\n)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\7\60\u01c7\n\60\f\60\16\60\u01ca\13\60\3\61\3\61\3\61\3\61\7\61\u01d0"+
		"\n\61\f\61\16\61\u01d3\13\61\3\61\5\61\u01d6\n\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\7\62\u01e0\n\62\f\62\16\62\u01e3\13\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\6\63\u01eb\n\63\r\63\16\63\u01ec\3\63\3\63\3\64\3"+
		"\64\5\64\u01f3\n\64\3\64\6\64\u01f6\n\64\r\64\16\64\u01f7\3\65\3\65\4"+
		"\u01d1\u01e1\66\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1"+
		";\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1["+
		"/\1]\60\1_\61\1a\62\2c\63\3e\64\4g\2\1i\2\1\3\2\36\3\2))\4\2CCcc\4\2N"+
		"Nnn\4\2KKkk\4\2UUuu\4\2HHhh\4\2QQqq\4\2TTtt\4\2EEee\4\2GGgg\4\2VVvv\4"+
		"\2RRrr\4\2WWww\4\2PPpp\4\2XXxx\4\2FFff\4\2IIii\4\2SSss\4\2DDdd\4\2YYy"+
		"y\4\2OOoo\4\2ZZzz\4\2[[{{\4\2MMmm\5\2C\\aac|\5\2\13\f\17\17\"\"\4\2--"+
		"//\3\2\62;\u0211\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o"+
		"\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17\u0081\3\2\2\2\21\u00af\3"+
		"\2\2\2\23\u00b1\3\2\2\2\25\u00b7\3\2\2\2\27\u00bb\3\2\2\2\31\u00c2\3\2"+
		"\2\2\33\u00ca\3\2\2\2\35\u00d3\3\2\2\2\37\u00d6\3\2\2\2!\u00d9\3\2\2\2"+
		"#\u00dd\3\2\2\2%\u00e3\3\2\2\2\'\u00ec\3\2\2\2)\u00f5\3\2\2\2+\u0100\3"+
		"\2\2\2-\u0102\3\2\2\2/\u010a\3\2\2\2\61\u0112\3\2\2\2\63\u0118\3\2\2\2"+
		"\65\u011b\3\2\2\2\67\u0123\3\2\2\29\u0129\3\2\2\2;\u012d\3\2\2\2=\u0133"+
		"\3\2\2\2?\u013a\3\2\2\2A\u0144\3\2\2\2C\u014b\3\2\2\2E\u0154\3\2\2\2G"+
		"\u0163\3\2\2\2I\u016e\3\2\2\2K\u0175\3\2\2\2M\u017e\3\2\2\2O\u0188\3\2"+
		"\2\2Q\u0194\3\2\2\2S\u019f\3\2\2\2U\u01a4\3\2\2\2W\u01a9\3\2\2\2Y\u01b2"+
		"\3\2\2\2[\u01ba\3\2\2\2]\u01be\3\2\2\2_\u01c3\3\2\2\2a\u01cb\3\2\2\2c"+
		"\u01db\3\2\2\2e\u01ea\3\2\2\2g\u01f0\3\2\2\2i\u01f9\3\2\2\2kl\7\60\2\2"+
		"l\4\3\2\2\2mn\7+\2\2n\6\3\2\2\2op\7.\2\2p\b\3\2\2\2qr\7*\2\2r\n\3\2\2"+
		"\2st\7=\2\2t\f\3\2\2\2u{\7)\2\2vz\n\2\2\2wx\7)\2\2xz\7)\2\2yv\3\2\2\2"+
		"yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7)\2"+
		"\2\177\16\3\2\2\2\u0080\u0082\5i\65\2\u0081\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\20\3\2\2\2\u0085"+
		"\u0087\5i\65\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\7\60\2\2\u008b"+
		"\u008d\5i\65\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u00b0\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0093\7\60\2\2\u0092\u0094\5i\65\2\u0093\u0092\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00b0\3\2\2\2\u0097"+
		"\u0099\5i\65\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u00a3\3\2\2\2\u009c\u00a0\7\60\2\2\u009d"+
		"\u009f\5i\65\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u009c\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5g"+
		"\64\2\u00a6\u00b0\3\2\2\2\u00a7\u00a9\7\60\2\2\u00a8\u00aa\5i\65\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5g\64\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u0086\3\2\2\2\u00af\u0091\3\2\2\2\u00af\u0098\3\2\2\2\u00af\u00a7\3\2"+
		"\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\t\3\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00b4"+
		"\t\5\2\2\u00b4\u00b5\t\3\2\2\u00b5\u00b6\t\6\2\2\u00b6\24\3\2\2\2\u00b7"+
		"\u00b8\t\7\2\2\u00b8\u00b9\t\b\2\2\u00b9\u00ba\t\t\2\2\u00ba\26\3\2\2"+
		"\2\u00bb\u00bc\t\n\2\2\u00bc\u00bd\t\t\2\2\u00bd\u00be\t\13\2\2\u00be"+
		"\u00bf\t\3\2\2\u00bf\u00c0\t\f\2\2\u00c0\u00c1\t\13\2\2\u00c1\30\3\2\2"+
		"\2\u00c2\u00c3\t\t\2\2\u00c3\u00c4\t\13\2\2\u00c4\u00c5\t\r\2\2\u00c5"+
		"\u00c6\t\4\2\2\u00c6\u00c7\t\3\2\2\u00c7\u00c8\t\n\2\2\u00c8\u00c9\t\13"+
		"\2\2\u00c9\32\3\2\2\2\u00ca\u00cb\t\7\2\2\u00cb\u00cc\t\16\2\2\u00cc\u00cd"+
		"\t\17\2\2\u00cd\u00ce\t\n\2\2\u00ce\u00cf\t\f\2\2\u00cf\u00d0\t\5\2\2"+
		"\u00d0\u00d1\t\b\2\2\u00d1\u00d2\t\17\2\2\u00d2\34\3\2\2\2\u00d3\u00d4"+
		"\t\b\2\2\u00d4\u00d5\t\t\2\2\u00d5\36\3\2\2\2\u00d6\u00d7\t\5\2\2\u00d7"+
		"\u00d8\t\17\2\2\u00d8 \3\2\2\2\u00d9\u00da\t\b\2\2\u00da\u00db\t\16\2"+
		"\2\u00db\u00dc\t\f\2\2\u00dc\"\3\2\2\2\u00dd\u00de\t\5\2\2\u00de\u00df"+
		"\t\17\2\2\u00df\u00e0\t\b\2\2\u00e0\u00e1\t\16\2\2\u00e1\u00e2\t\f\2\2"+
		"\u00e2$\3\2\2\2\u00e3\u00e4\t\20\2\2\u00e4\u00e5\t\3\2\2\u00e5\u00e6\t"+
		"\t\2\2\u00e6\u00e7\t\5\2\2\u00e7\u00e8\t\3\2\2\u00e8\u00e9\t\21\2\2\u00e9"+
		"\u00ea\t\5\2\2\u00ea\u00eb\t\n\2\2\u00eb&\3\2\2\2\u00ec\u00ed\t\4\2\2"+
		"\u00ed\u00ee\t\3\2\2\u00ee\u00ef\t\17\2\2\u00ef\u00f0\t\22\2\2\u00f0\u00f1"+
		"\t\16\2\2\u00f1\u00f2\t\3\2\2\u00f2\u00f3\t\22\2\2\u00f3\u00f4\t\13\2"+
		"\2\u00f4(\3\2\2\2\u00f5\u00f6\t\r\2\2\u00f6\u00f7\t\4\2\2\u00f7\u00f8"+
		"\t\r\2\2\u00f8\u00f9\t\22\2\2\u00f9\u00fa\t\6\2\2\u00fa\u00fb\t\23\2\2"+
		"\u00fb\u00fc\t\4\2\2\u00fc*\3\2\2\2\u00fd\u0101\7?\2\2\u00fe\u00ff\7<"+
		"\2\2\u00ff\u0101\7?\2\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		",\3\2\2\2\u0102\u0103\t\21\2\2\u0103\u0104\t\13\2\2\u0104\u0105\t\7\2"+
		"\2\u0105\u0106\t\3\2\2\u0106\u0107\t\16\2\2\u0107\u0108\t\4\2\2\u0108"+
		"\u0109\t\f\2\2\u0109.\3\2\2\2\u010a\u010b\t\t\2\2\u010b\u010c\t\13\2\2"+
		"\u010c\u010d\t\f\2\2\u010d\u010e\t\16\2\2\u010e\u010f\t\t\2\2\u010f\u0110"+
		"\t\17\2\2\u0110\u0111\t\6\2\2\u0111\60\3\2\2\2\u0112\u0113\t\f\2\2\u0113"+
		"\u0114\t\3\2\2\u0114\u0115\t\24\2\2\u0115\u0116\t\4\2\2\u0116\u0117\t"+
		"\13\2\2\u0117\62\3\2\2\2\u0118\u0119\t\3\2\2\u0119\u011a\t\6\2\2\u011a"+
		"\64\3\2\2\2\u011b\u011c\t\21\2\2\u011c\u011d\t\13\2\2\u011d\u011e\t\n"+
		"\2\2\u011e\u011f\t\4\2\2\u011f\u0120\t\3\2\2\u0120\u0121\t\t\2\2\u0121"+
		"\u0122\t\13\2\2\u0122\66\3\2\2\2\u0123\u0124\t\24\2\2\u0124\u0125\t\13"+
		"\2\2\u0125\u0126\t\22\2\2\u0126\u0127\t\5\2\2\u0127\u0128\t\17\2\2\u0128"+
		"8\3\2\2\2\u0129\u012a\t\13\2\2\u012a\u012b\t\17\2\2\u012b\u012c\t\21\2"+
		"\2\u012c:\3\2\2\2\u012d\u012f\7&\2\2\u012e\u0130\5_\60\2\u012f\u012e\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7&\2\2\u0132"+
		"<\3\2\2\2\u0133\u0134\t\25\2\2\u0134\u0135\t\5\2\2\u0135\u0136\t\17\2"+
		"\2\u0136\u0137\t\21\2\2\u0137\u0138\t\b\2\2\u0138\u0139\t\25\2\2\u0139"+
		">\3\2\2\2\u013a\u013b\t\5\2\2\u013b\u013c\t\26\2\2\u013c\u013d\t\26\2"+
		"\2\u013d\u013e\t\16\2\2\u013e\u013f\t\f\2\2\u013f\u0140\t\3\2\2\u0140"+
		"\u0141\t\24\2\2\u0141\u0142\t\4\2\2\u0142\u0143\t\13\2\2\u0143@\3\2\2"+
		"\2\u0144\u0145\t\6\2\2\u0145\u0146\t\f\2\2\u0146\u0147\t\3\2\2\u0147\u0148"+
		"\t\24\2\2\u0148\u0149\t\4\2\2\u0149\u014a\t\13\2\2\u014aB\3\2\2\2\u014b"+
		"\u014c\t\20\2\2\u014c\u014d\t\b\2\2\u014d\u014e\t\4\2\2\u014e\u014f\t"+
		"\3\2\2\u014f\u0150\t\f\2\2\u0150\u0151\t\5\2\2\u0151\u0152\t\4\2\2\u0152"+
		"\u0153\t\13\2\2\u0153D\3\2\2\2\u0154\u0155\t\n\2\2\u0155\u0156\t\3\2\2"+
		"\u0156\u0157\t\4\2\2\u0157\u0158\t\4\2\2\u0158\u0159\t\13\2\2\u0159\u015a"+
		"\t\21\2\2\u015a\u015b\t\b\2\2\u015b\u015c\t\17\2\2\u015c\u015d\5]/\2\u015d"+
		"\u015e\t\5\2\2\u015e\u015f\t\17\2\2\u015f\u0160\t\r\2\2\u0160\u0161\t"+
		"\16\2\2\u0161\u0162\t\f\2\2\u0162F\3\2\2\2\u0163\u0164\5/\30\2\u0164\u0165"+
		"\5]/\2\u0165\u0166\t\b\2\2\u0166\u0167\t\17\2\2\u0167\u0168\5]/\2\u0168"+
		"\u0169\t\5\2\2\u0169\u016a\t\17\2\2\u016a\u016b\t\r\2\2\u016b\u016c\t"+
		"\16\2\2\u016c\u016d\t\f\2\2\u016dH\3\2\2\2\u016e\u016f\t\6\2\2\u016f\u0170"+
		"\t\f\2\2\u0170\u0171\t\t\2\2\u0171\u0172\t\5\2\2\u0172\u0173\t\n\2\2\u0173"+
		"\u0174\t\f\2\2\u0174J\3\2\2\2\u0175\u0176\t\13\2\2\u0176\u0177\t\27\2"+
		"\2\u0177\u0178\t\f\2\2\u0178\u0179\t\13\2\2\u0179\u017a\t\t\2\2\u017a"+
		"\u017b\t\17\2\2\u017b\u017c\t\3\2\2\u017c\u017d\t\4\2\2\u017dL\3\2\2\2"+
		"\u017e\u017f\t\6\2\2\u017f\u0180\t\13\2\2\u0180\u0181\t\n\2\2\u0181\u0182"+
		"\t\16\2\2\u0182\u0183\t\t\2\2\u0183\u0184\t\5\2\2\u0184\u0185\t\f\2\2"+
		"\u0185\u0186\t\30\2\2\u0186N\3\2\2\2\u0187\u0189\5K&\2\u0188\u0187\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5M\'\2\u018b"+
		"\u018c\t\5\2\2\u018c\u018d\t\17\2\2\u018d\u018e\t\20\2\2\u018e\u018f\t"+
		"\b\2\2\u018f\u0190\t\31\2\2\u0190\u0191\t\13\2\2\u0191\u0192\t\t\2\2\u0192"+
		"P\3\2\2\2\u0193\u0195\5K&\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\5M\'\2\u0197\u0198\t\21\2\2\u0198\u0199\t\13"+
		"\2\2\u0199\u019a\t\7\2\2\u019a\u019b\t\5\2\2\u019b\u019c\t\17\2\2\u019c"+
		"\u019d\t\13\2\2\u019d\u019e\t\t\2\2\u019eR\3\2\2\2\u019f\u01a0\t\n\2\2"+
		"\u01a0\u01a1\t\b\2\2\u01a1\u01a2\t\6\2\2\u01a2\u01a3\t\f\2\2\u01a3T\3"+
		"\2\2\2\u01a4\u01a5\t\t\2\2\u01a5\u01a6\t\b\2\2\u01a6\u01a7\t\25\2\2\u01a7"+
		"\u01a8\t\6\2\2\u01a8V\3\2\2\2\u01a9\u01aa\t\n\2\2\u01aa\u01ab\t\b\2\2"+
		"\u01ab\u01ac\t\17\2\2\u01ac\u01ad\t\6\2\2\u01ad\u01ae\t\f\2\2\u01ae\u01af"+
		"\t\3\2\2\u01af\u01b0\t\17\2\2\u01b0\u01b1\t\f\2\2\u01b1X\3\2\2\2\u01b2"+
		"\u01b3\t\n\2\2\u01b3\u01b4\t\b\2\2\u01b4\u01b5\t\4\2\2\u01b5\u01b6\t\4"+
		"\2\2\u01b6\u01b7\t\3\2\2\u01b7\u01b8\t\f\2\2\u01b8\u01b9\t\13\2\2\u01b9"+
		"Z\3\2\2\2\u01ba\u01bb\t\17\2\2\u01bb\u01bc\t\b\2\2\u01bc\u01bd\t\f\2\2"+
		"\u01bd\\\3\2\2\2\u01be\u01bf\t\17\2\2\u01bf\u01c0\t\16\2\2\u01c0\u01c1"+
		"\t\4\2\2\u01c1\u01c2\t\4\2\2\u01c2^\3\2\2\2\u01c3\u01c8\t\32\2\2\u01c4"+
		"\u01c7\t\32\2\2\u01c5\u01c7\5i\65\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3"+
		"\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"`\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7/\2\2\u01cc\u01cd\7/\2\2\u01cd"+
		"\u01d1\3\2\2\2\u01ce\u01d0\13\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3"+
		"\2\2\2\u01d1\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01d6\7\17\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3"+
		"\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7\f\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\b\61\2\2\u01dab\3\2\2\2\u01db\u01dc\7\61\2\2\u01dc\u01dd\7,\2\2"+
		"\u01dd\u01e1\3\2\2\2\u01de\u01e0\13\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e5\7,\2\2\u01e5\u01e6\7\61\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01e8\b\62\3\2\u01e8d\3\2\2\2\u01e9\u01eb\t\33\2\2\u01ea\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\b\63\4\2\u01eff\3\2\2\2\u01f0\u01f2\7G\2\2"+
		"\u01f1\u01f3\t\34\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5"+
		"\3\2\2\2\u01f4\u01f6\5i\65\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8h\3\2\2\2\u01f9\u01fa\t\35\2\2"+
		"\u01faj\3\2\2\2\32\2y{\u0083\u0088\u008e\u0095\u009a\u00a0\u00a3\u00ab"+
		"\u00af\u0100\u012f\u0188\u0194\u01c6\u01c8\u01d1\u01d5\u01e1\u01ec\u01f2"+
		"\u01f7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}