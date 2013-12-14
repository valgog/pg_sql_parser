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
		IN=9, OUT=10, INOUT=11, VARIADIC=12, LANGUAGE=13, LANGUAGE_NAME=14, ASSIGN_OP=15, 
		DEFAULT=16, RETURNS=17, TABLE=18, AS=19, DECLARE=20, BEGIN=21, END=22, 
		DOLLAR_QUOTE=23, WINDOW=24, IMMUTABLE=25, STABLE=26, VOLATILE=27, CALLED_ON_NULL_INPUT=28, 
		RETURNS_NULL_ON_NULL_INPUT=29, STRICT=30, EXTERNAL=31, SECURITY=32, SECURITY_INVOKER=33, 
		SECURITY_DEFINER=34, COST=35, COST_VALUE=36, ROWS=37, ROWS_VALUE=38, NULL=39, 
		ID=40, SL_COMMENT=41, ML_COMMENT=42, NL=43, WS=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "';'", "CREATE", "REPLACE", "FUNCTION", "OR", "IN", 
		"OUT", "INOUT", "VARIADIC", "LANGUAGE", "LANGUAGE_NAME", "ASSIGN_OP", 
		"DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", "END", "DOLLAR_QUOTE", 
		"WINDOW", "IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"STRICT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", 
		"COST", "COST_VALUE", "ROWS", "ROWS_VALUE", "NULL", "ID", "SL_COMMENT", 
		"ML_COMMENT", "NL", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "CREATE", "REPLACE", "FUNCTION", "OR", 
		"IN", "OUT", "INOUT", "VARIADIC", "LANGUAGE", "LANGUAGE_NAME", "ASSIGN_OP", 
		"DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", "END", "DOLLAR_QUOTE", 
		"WINDOW", "IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
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
		case 40: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 41: ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 43: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2.\u018e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00a9"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\5\30\u00d8\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\5\"\u0131\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\5"+
		"#\u013d\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\6%\u014e\n%\r"+
		"%\16%\u014f\3&\3&\3&\3&\3&\3\'\6\'\u0158\n\'\r\'\16\'\u0159\3(\3(\3(\3"+
		"(\3(\3)\3)\7)\u0163\n)\f)\16)\u0166\13)\3*\3*\3*\3*\7*\u016c\n*\f*\16"+
		"*\u016f\13*\3*\3*\3*\3*\3+\3+\3+\3+\7+\u0179\n+\f+\16+\u017c\13+\3+\3"+
		"+\3+\3+\3+\3,\5,\u0184\n,\3,\3,\3-\6-\u0189\n-\r-\16-\u018a\3-\3-\4\u016d"+
		"\u017a.\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= "+
		"\1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\2U,\3W-\1Y.\4\3\2\35\4"+
		"\2EEee\4\2TTtt\4\2GGgg\4\2CCcc\4\2VVvv\4\2RRrr\4\2NNnn\4\2HHhh\4\2WWw"+
		"w\4\2PPpp\4\2KKkk\4\2QQqq\4\2XXxx\4\2FFff\4\2IIii\4\2UUuu\4\2SSss\4\2"+
		"DDdd\4\2YYyy\4\2OOoo\4\2ZZzz\4\2[[{{\4\2MMmm\3\2\62;\5\2C\\aac|\6\2\62"+
		";C\\aac|\5\2\13\f\17\17\"\"\u0198\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3"+
		"\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\rj\3\2\2\2\17r\3\2"+
		"\2\2\21{\3\2\2\2\23~\3\2\2\2\25\u0081\3\2\2\2\27\u0085\3\2\2\2\31\u008b"+
		"\3\2\2\2\33\u0094\3\2\2\2\35\u009d\3\2\2\2\37\u00a8\3\2\2\2!\u00aa\3\2"+
		"\2\2#\u00b2\3\2\2\2%\u00ba\3\2\2\2\'\u00c0\3\2\2\2)\u00c3\3\2\2\2+\u00cb"+
		"\3\2\2\2-\u00d1\3\2\2\2/\u00d5\3\2\2\2\61\u00db\3\2\2\2\63\u00e2\3\2\2"+
		"\2\65\u00ec\3\2\2\2\67\u00f3\3\2\2\29\u00fc\3\2\2\2;\u010b\3\2\2\2=\u0116"+
		"\3\2\2\2?\u011d\3\2\2\2A\u0126\3\2\2\2C\u0130\3\2\2\2E\u013c\3\2\2\2G"+
		"\u0147\3\2\2\2I\u014d\3\2\2\2K\u0151\3\2\2\2M\u0157\3\2\2\2O\u015b\3\2"+
		"\2\2Q\u0160\3\2\2\2S\u0167\3\2\2\2U\u0174\3\2\2\2W\u0183\3\2\2\2Y\u0188"+
		"\3\2\2\2[\\\7+\2\2\\\4\3\2\2\2]^\7.\2\2^\6\3\2\2\2_`\7*\2\2`\b\3\2\2\2"+
		"ab\7=\2\2b\n\3\2\2\2cd\t\2\2\2de\t\3\2\2ef\t\4\2\2fg\t\5\2\2gh\t\6\2\2"+
		"hi\t\4\2\2i\f\3\2\2\2jk\t\3\2\2kl\t\4\2\2lm\t\7\2\2mn\t\b\2\2no\t\5\2"+
		"\2op\t\2\2\2pq\t\4\2\2q\16\3\2\2\2rs\t\t\2\2st\t\n\2\2tu\t\13\2\2uv\t"+
		"\2\2\2vw\t\6\2\2wx\t\f\2\2xy\t\r\2\2yz\t\13\2\2z\20\3\2\2\2{|\t\r\2\2"+
		"|}\t\3\2\2}\22\3\2\2\2~\177\t\f\2\2\177\u0080\t\13\2\2\u0080\24\3\2\2"+
		"\2\u0081\u0082\t\r\2\2\u0082\u0083\t\n\2\2\u0083\u0084\t\6\2\2\u0084\26"+
		"\3\2\2\2\u0085\u0086\t\f\2\2\u0086\u0087\t\13\2\2\u0087\u0088\t\r\2\2"+
		"\u0088\u0089\t\n\2\2\u0089\u008a\t\6\2\2\u008a\30\3\2\2\2\u008b\u008c"+
		"\t\16\2\2\u008c\u008d\t\5\2\2\u008d\u008e\t\3\2\2\u008e\u008f\t\f\2\2"+
		"\u008f\u0090\t\5\2\2\u0090\u0091\t\17\2\2\u0091\u0092\t\f\2\2\u0092\u0093"+
		"\t\2\2\2\u0093\32\3\2\2\2\u0094\u0095\t\b\2\2\u0095\u0096\t\5\2\2\u0096"+
		"\u0097\t\13\2\2\u0097\u0098\t\20\2\2\u0098\u0099\t\n\2\2\u0099\u009a\t"+
		"\5\2\2\u009a\u009b\t\20\2\2\u009b\u009c\t\4\2\2\u009c\34\3\2\2\2\u009d"+
		"\u009e\t\7\2\2\u009e\u009f\t\b\2\2\u009f\u00a0\t\7\2\2\u00a0\u00a1\t\20"+
		"\2\2\u00a1\u00a2\t\21\2\2\u00a2\u00a3\t\22\2\2\u00a3\u00a4\t\b\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a9\7?\2\2\u00a6\u00a7\7<\2\2\u00a7\u00a9\7?\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9 \3\2\2\2\u00aa\u00ab\t\17\2\2"+
		"\u00ab\u00ac\t\4\2\2\u00ac\u00ad\t\t\2\2\u00ad\u00ae\t\5\2\2\u00ae\u00af"+
		"\t\n\2\2\u00af\u00b0\t\b\2\2\u00b0\u00b1\t\6\2\2\u00b1\"\3\2\2\2\u00b2"+
		"\u00b3\t\3\2\2\u00b3\u00b4\t\4\2\2\u00b4\u00b5\t\6\2\2\u00b5\u00b6\t\n"+
		"\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00b8\t\13\2\2\u00b8\u00b9\t\21\2\2\u00b9"+
		"$\3\2\2\2\u00ba\u00bb\t\6\2\2\u00bb\u00bc\t\5\2\2\u00bc\u00bd\t\23\2\2"+
		"\u00bd\u00be\t\b\2\2\u00be\u00bf\t\4\2\2\u00bf&\3\2\2\2\u00c0\u00c1\t"+
		"\5\2\2\u00c1\u00c2\t\21\2\2\u00c2(\3\2\2\2\u00c3\u00c4\t\17\2\2\u00c4"+
		"\u00c5\t\4\2\2\u00c5\u00c6\t\2\2\2\u00c6\u00c7\t\b\2\2\u00c7\u00c8\t\5"+
		"\2\2\u00c8\u00c9\t\3\2\2\u00c9\u00ca\t\4\2\2\u00ca*\3\2\2\2\u00cb\u00cc"+
		"\t\23\2\2\u00cc\u00cd\t\4\2\2\u00cd\u00ce\t\20\2\2\u00ce\u00cf\t\f\2\2"+
		"\u00cf\u00d0\t\13\2\2\u00d0,\3\2\2\2\u00d1\u00d2\t\4\2\2\u00d2\u00d3\t"+
		"\13\2\2\u00d3\u00d4\t\17\2\2\u00d4.\3\2\2\2\u00d5\u00d7\7&\2\2\u00d6\u00d8"+
		"\5Q)\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\7&\2\2\u00da\60\3\2\2\2\u00db\u00dc\t\24\2\2\u00dc\u00dd\t\f\2"+
		"\2\u00dd\u00de\t\13\2\2\u00de\u00df\t\17\2\2\u00df\u00e0\t\r\2\2\u00e0"+
		"\u00e1\t\24\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\t\f\2\2\u00e3\u00e4\t\25"+
		"\2\2\u00e4\u00e5\t\25\2\2\u00e5\u00e6\t\n\2\2\u00e6\u00e7\t\6\2\2\u00e7"+
		"\u00e8\t\5\2\2\u00e8\u00e9\t\23\2\2\u00e9\u00ea\t\b\2\2\u00ea\u00eb\t"+
		"\4\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\t\21\2\2\u00ed\u00ee\t\6\2\2\u00ee"+
		"\u00ef\t\5\2\2\u00ef\u00f0\t\23\2\2\u00f0\u00f1\t\b\2\2\u00f1\u00f2\t"+
		"\4\2\2\u00f2\66\3\2\2\2\u00f3\u00f4\t\16\2\2\u00f4\u00f5\t\r\2\2\u00f5"+
		"\u00f6\t\b\2\2\u00f6\u00f7\t\5\2\2\u00f7\u00f8\t\6\2\2\u00f8\u00f9\t\f"+
		"\2\2\u00f9\u00fa\t\b\2\2\u00fa\u00fb\t\4\2\2\u00fb8\3\2\2\2\u00fc\u00fd"+
		"\t\2\2\2\u00fd\u00fe\t\5\2\2\u00fe\u00ff\t\b\2\2\u00ff\u0100\t\b\2\2\u0100"+
		"\u0101\t\4\2\2\u0101\u0102\t\17\2\2\u0102\u0103\t\r\2\2\u0103\u0104\t"+
		"\13\2\2\u0104\u0105\5O(\2\u0105\u0106\t\f\2\2\u0106\u0107\t\13\2\2\u0107"+
		"\u0108\t\7\2\2\u0108\u0109\t\n\2\2\u0109\u010a\t\6\2\2\u010a:\3\2\2\2"+
		"\u010b\u010c\5#\22\2\u010c\u010d\5O(\2\u010d\u010e\t\r\2\2\u010e\u010f"+
		"\t\13\2\2\u010f\u0110\5O(\2\u0110\u0111\t\f\2\2\u0111\u0112\t\13\2\2\u0112"+
		"\u0113\t\7\2\2\u0113\u0114\t\n\2\2\u0114\u0115\t\6\2\2\u0115<\3\2\2\2"+
		"\u0116\u0117\t\21\2\2\u0117\u0118\t\6\2\2\u0118\u0119\t\3\2\2\u0119\u011a"+
		"\t\f\2\2\u011a\u011b\t\2\2\2\u011b\u011c\t\6\2\2\u011c>\3\2\2\2\u011d"+
		"\u011e\t\4\2\2\u011e\u011f\t\26\2\2\u011f\u0120\t\6\2\2\u0120\u0121\t"+
		"\4\2\2\u0121\u0122\t\3\2\2\u0122\u0123\t\13\2\2\u0123\u0124\t\5\2\2\u0124"+
		"\u0125\t\b\2\2\u0125@\3\2\2\2\u0126\u0127\t\21\2\2\u0127\u0128\t\4\2\2"+
		"\u0128\u0129\t\2\2\2\u0129\u012a\t\n\2\2\u012a\u012b\t\3\2\2\u012b\u012c"+
		"\t\f\2\2\u012c\u012d\t\6\2\2\u012d\u012e\t\27\2\2\u012eB\3\2\2\2\u012f"+
		"\u0131\5? \2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0133\5A!\2\u0133\u0134\t\f\2\2\u0134\u0135\t\13\2\2\u0135\u0136"+
		"\t\16\2\2\u0136\u0137\t\r\2\2\u0137\u0138\t\30\2\2\u0138\u0139\t\4\2\2"+
		"\u0139\u013a\t\3\2\2\u013aD\3\2\2\2\u013b\u013d\5? \2\u013c\u013b\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\5A!\2\u013f\u0140"+
		"\t\17\2\2\u0140\u0141\t\4\2\2\u0141\u0142\t\t\2\2\u0142\u0143\t\f\2\2"+
		"\u0143\u0144\t\13\2\2\u0144\u0145\t\4\2\2\u0145\u0146\t\3\2\2\u0146F\3"+
		"\2\2\2\u0147\u0148\t\2\2\2\u0148\u0149\t\r\2\2\u0149\u014a\t\21\2\2\u014a"+
		"\u014b\t\6\2\2\u014bH\3\2\2\2\u014c\u014e\t\31\2\2\u014d\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150J\3"+
		"\2\2\2\u0151\u0152\t\3\2\2\u0152\u0153\t\r\2\2\u0153\u0154\t\24\2\2\u0154"+
		"\u0155\t\21\2\2\u0155L\3\2\2\2\u0156\u0158\t\31\2\2\u0157\u0156\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015aN"+
		"\3\2\2\2\u015b\u015c\t\13\2\2\u015c\u015d\t\n\2\2\u015d\u015e\t\b\2\2"+
		"\u015e\u015f\t\b\2\2\u015fP\3\2\2\2\u0160\u0164\t\32\2\2\u0161\u0163\t"+
		"\33\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165R\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7/\2\2\u0168"+
		"\u0169\7/\2\2\u0169\u016d\3\2\2\2\u016a\u016c\13\2\2\2\u016b\u016a\3\2"+
		"\2\2\u016c\u016f\3\2\2\2\u016d\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\5W,\2\u0171\u0172\3\2\2"+
		"\2\u0172\u0173\b*\2\2\u0173T\3\2\2\2\u0174\u0175\7\61\2\2\u0175\u0176"+
		"\7,\2\2\u0176\u017a\3\2\2\2\u0177\u0179\13\2\2\2\u0178\u0177\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7,\2\2\u017e\u017f\7\61\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\b+\3\2\u0181V\3\2\2\2\u0182\u0184\7\17\2\2"+
		"\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186"+
		"\7\f\2\2\u0186X\3\2\2\2\u0187\u0189\t\34\2\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018d\b-\4\2\u018dZ\3\2\2\2\16\2\u00a8\u00d7\u0130\u013c\u014f"+
		"\u0159\u0164\u016d\u017a\u0183\u018a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}