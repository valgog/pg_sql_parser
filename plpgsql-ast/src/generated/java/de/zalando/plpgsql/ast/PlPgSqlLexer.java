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
		CREATE=9, REPLACE=10, FUNCTION=11, OR=12, IN=13, OUT=14, INOUT=15, VARIADIC=16, 
		LANGUAGE=17, LANGUAGE_NAME=18, ASSIGN_OP=19, DEFAULT=20, RETURNS=21, TABLE=22, 
		AS=23, DECLARE=24, BEGIN=25, END=26, DOLLAR_QUOTE=27, WINDOW=28, IMMUTABLE=29, 
		STABLE=30, VOLATILE=31, CALLED_ON_NULL_INPUT=32, RETURNS_NULL_ON_NULL_INPUT=33, 
		STRICT=34, EXTERNAL=35, SECURITY=36, SECURITY_INVOKER=37, SECURITY_DEFINER=38, 
		COST=39, ROWS=40, CONSTANT=41, COLLATE=42, NOT=43, NULL=44, ID=45, SL_COMMENT=46, 
		ML_COMMENT=47, WS=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'.'", "')'", "','", "'('", "';'", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", 
		"CREATE", "REPLACE", "FUNCTION", "OR", "IN", "OUT", "INOUT", "VARIADIC", 
		"LANGUAGE", "LANGUAGE_NAME", "ASSIGN_OP", "DEFAULT", "RETURNS", "TABLE", 
		"AS", "DECLARE", "BEGIN", "END", "DOLLAR_QUOTE", "WINDOW", "IMMUTABLE", 
		"STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"STRICT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", 
		"COST", "ROWS", "CONSTANT", "COLLATE", "NOT", "NULL", "ID", "SL_COMMENT", 
		"ML_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", 
		"CREATE", "REPLACE", "FUNCTION", "OR", "IN", "OUT", "INOUT", "VARIADIC", 
		"LANGUAGE", "LANGUAGE_NAME", "ASSIGN_OP", "DEFAULT", "RETURNS", "TABLE", 
		"AS", "DECLARE", "BEGIN", "END", "DOLLAR_QUOTE", "WINDOW", "IMMUTABLE", 
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
		case 45: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 46: ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 47: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\62\u01ed\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7v\n\7\f\7\16\7"+
		"y\13\7\3\7\3\7\3\b\6\b~\n\b\r\b\16\b\177\3\t\6\t\u0083\n\t\r\t\16\t\u0084"+
		"\3\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t\3\t\6\t\u0090\n\t\r\t\16"+
		"\t\u0091\3\t\6\t\u0095\n\t\r\t\16\t\u0096\3\t\3\t\7\t\u009b\n\t\f\t\16"+
		"\t\u009e\13\t\5\t\u00a0\n\t\3\t\3\t\3\t\3\t\6\t\u00a6\n\t\r\t\16\t\u00a7"+
		"\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5"+
		"\24\u00f3\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\5\34\u0122\n\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\5&\u017b\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\5\'\u0187"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\7.\u01b9\n.\f.\16.\u01bc\13.\3/\3/\3/\3/\7/\u01c2"+
		"\n/\f/\16/\u01c5\13/\3/\5/\u01c8\n/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7"+
		"\60\u01d2\n\60\f\60\16\60\u01d5\13\60\3\60\3\60\3\60\3\60\3\60\3\61\6"+
		"\61\u01dd\n\61\r\61\16\61\u01de\3\61\3\61\3\62\3\62\5\62\u01e5\n\62\3"+
		"\62\6\62\u01e8\n\62\r\62\16\62\u01e9\3\63\3\63\4\u01c3\u01d3\64\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30"+
		"\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1"+
		"E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\2_\61\3a\62\4c\2"+
		"\1e\2\1\3\2\36\3\2))\4\2EEee\4\2TTtt\4\2GGgg\4\2CCcc\4\2VVvv\4\2RRrr\4"+
		"\2NNnn\4\2HHhh\4\2WWww\4\2PPpp\4\2KKkk\4\2QQqq\4\2XXxx\4\2FFff\4\2IIi"+
		"i\4\2UUuu\4\2SSss\4\2DDdd\4\2YYyy\4\2OOoo\4\2ZZzz\4\2[[{{\4\2MMmm\5\2"+
		"C\\aac|\5\2\13\f\17\17\"\"\4\2--//\3\2\62;\u0203\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3g\3\2\2\2\5i\3"+
		"\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17}\3\2\2\2\21\u00ab"+
		"\3\2\2\2\23\u00ad\3\2\2\2\25\u00b4\3\2\2\2\27\u00bc\3\2\2\2\31\u00c5\3"+
		"\2\2\2\33\u00c8\3\2\2\2\35\u00cb\3\2\2\2\37\u00cf\3\2\2\2!\u00d5\3\2\2"+
		"\2#\u00de\3\2\2\2%\u00e7\3\2\2\2\'\u00f2\3\2\2\2)\u00f4\3\2\2\2+\u00fc"+
		"\3\2\2\2-\u0104\3\2\2\2/\u010a\3\2\2\2\61\u010d\3\2\2\2\63\u0115\3\2\2"+
		"\2\65\u011b\3\2\2\2\67\u011f\3\2\2\29\u0125\3\2\2\2;\u012c\3\2\2\2=\u0136"+
		"\3\2\2\2?\u013d\3\2\2\2A\u0146\3\2\2\2C\u0155\3\2\2\2E\u0160\3\2\2\2G"+
		"\u0167\3\2\2\2I\u0170\3\2\2\2K\u017a\3\2\2\2M\u0186\3\2\2\2O\u0191\3\2"+
		"\2\2Q\u0196\3\2\2\2S\u019b\3\2\2\2U\u01a4\3\2\2\2W\u01ac\3\2\2\2Y\u01b0"+
		"\3\2\2\2[\u01b5\3\2\2\2]\u01bd\3\2\2\2_\u01cd\3\2\2\2a\u01dc\3\2\2\2c"+
		"\u01e2\3\2\2\2e\u01eb\3\2\2\2gh\7\60\2\2h\4\3\2\2\2ij\7+\2\2j\6\3\2\2"+
		"\2kl\7.\2\2l\b\3\2\2\2mn\7*\2\2n\n\3\2\2\2op\7=\2\2p\f\3\2\2\2qw\7)\2"+
		"\2rv\n\2\2\2st\7)\2\2tv\7)\2\2ur\3\2\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7)\2\2{\16\3\2\2\2|~\5e\63\2}|\3\2\2"+
		"\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\20\3\2\2\2\u0081"+
		"\u0083\5e\63\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a\7\60\2\2\u0087"+
		"\u0089\5e\63\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u00ac\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008f\7\60\2\2\u008e\u0090\5e\63\2\u008f\u008e\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u00ac\3\2\2\2\u0093"+
		"\u0095\5e\63\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u009f\3\2\2\2\u0098\u009c\7\60\2\2\u0099"+
		"\u009b\5e\63\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u0098\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5c"+
		"\62\2\u00a2\u00ac\3\2\2\2\u00a3\u00a5\7\60\2\2\u00a4\u00a6\5e\63\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5c\62\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u0082\3\2\2\2\u00ab\u008d\3\2\2\2\u00ab\u0094\3\2\2\2\u00ab\u00a3\3\2"+
		"\2\2\u00ac\22\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae\u00af\t\4\2\2\u00af\u00b0"+
		"\t\5\2\2\u00b0\u00b1\t\6\2\2\u00b1\u00b2\t\7\2\2\u00b2\u00b3\t\5\2\2\u00b3"+
		"\24\3\2\2\2\u00b4\u00b5\t\4\2\2\u00b5\u00b6\t\5\2\2\u00b6\u00b7\t\b\2"+
		"\2\u00b7\u00b8\t\t\2\2\u00b8\u00b9\t\6\2\2\u00b9\u00ba\t\3\2\2\u00ba\u00bb"+
		"\t\5\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\t\n\2\2\u00bd\u00be\t\13\2\2\u00be"+
		"\u00bf\t\f\2\2\u00bf\u00c0\t\3\2\2\u00c0\u00c1\t\7\2\2\u00c1\u00c2\t\r"+
		"\2\2\u00c2\u00c3\t\16\2\2\u00c3\u00c4\t\f\2\2\u00c4\30\3\2\2\2\u00c5\u00c6"+
		"\t\16\2\2\u00c6\u00c7\t\4\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\t\r\2\2\u00c9"+
		"\u00ca\t\f\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\t\16\2\2\u00cc\u00cd\t\13"+
		"\2\2\u00cd\u00ce\t\7\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\t\r\2\2\u00d0\u00d1"+
		"\t\f\2\2\u00d1\u00d2\t\16\2\2\u00d2\u00d3\t\13\2\2\u00d3\u00d4\t\7\2\2"+
		"\u00d4 \3\2\2\2\u00d5\u00d6\t\17\2\2\u00d6\u00d7\t\6\2\2\u00d7\u00d8\t"+
		"\4\2\2\u00d8\u00d9\t\r\2\2\u00d9\u00da\t\6\2\2\u00da\u00db\t\20\2\2\u00db"+
		"\u00dc\t\r\2\2\u00dc\u00dd\t\3\2\2\u00dd\"\3\2\2\2\u00de\u00df\t\t\2\2"+
		"\u00df\u00e0\t\6\2\2\u00e0\u00e1\t\f\2\2\u00e1\u00e2\t\21\2\2\u00e2\u00e3"+
		"\t\13\2\2\u00e3\u00e4\t\6\2\2\u00e4\u00e5\t\21\2\2\u00e5\u00e6\t\5\2\2"+
		"\u00e6$\3\2\2\2\u00e7\u00e8\t\b\2\2\u00e8\u00e9\t\t\2\2\u00e9\u00ea\t"+
		"\b\2\2\u00ea\u00eb\t\21\2\2\u00eb\u00ec\t\22\2\2\u00ec\u00ed\t\23\2\2"+
		"\u00ed\u00ee\t\t\2\2\u00ee&\3\2\2\2\u00ef\u00f3\7?\2\2\u00f0\u00f1\7<"+
		"\2\2\u00f1\u00f3\7?\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"(\3\2\2\2\u00f4\u00f5\t\20\2\2\u00f5\u00f6\t\5\2\2\u00f6\u00f7\t\n\2\2"+
		"\u00f7\u00f8\t\6\2\2\u00f8\u00f9\t\13\2\2\u00f9\u00fa\t\t\2\2\u00fa\u00fb"+
		"\t\7\2\2\u00fb*\3\2\2\2\u00fc\u00fd\t\4\2\2\u00fd\u00fe\t\5\2\2\u00fe"+
		"\u00ff\t\7\2\2\u00ff\u0100\t\13\2\2\u0100\u0101\t\4\2\2\u0101\u0102\t"+
		"\f\2\2\u0102\u0103\t\22\2\2\u0103,\3\2\2\2\u0104\u0105\t\7\2\2\u0105\u0106"+
		"\t\6\2\2\u0106\u0107\t\24\2\2\u0107\u0108\t\t\2\2\u0108\u0109\t\5\2\2"+
		"\u0109.\3\2\2\2\u010a\u010b\t\6\2\2\u010b\u010c\t\22\2\2\u010c\60\3\2"+
		"\2\2\u010d\u010e\t\20\2\2\u010e\u010f\t\5\2\2\u010f\u0110\t\3\2\2\u0110"+
		"\u0111\t\t\2\2\u0111\u0112\t\6\2\2\u0112\u0113\t\4\2\2\u0113\u0114\t\5"+
		"\2\2\u0114\62\3\2\2\2\u0115\u0116\t\24\2\2\u0116\u0117\t\5\2\2\u0117\u0118"+
		"\t\21\2\2\u0118\u0119\t\r\2\2\u0119\u011a\t\f\2\2\u011a\64\3\2\2\2\u011b"+
		"\u011c\t\5\2\2\u011c\u011d\t\f\2\2\u011d\u011e\t\20\2\2\u011e\66\3\2\2"+
		"\2\u011f\u0121\7&\2\2\u0120\u0122\5[.\2\u0121\u0120\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7&\2\2\u01248\3\2\2\2\u0125\u0126"+
		"\t\25\2\2\u0126\u0127\t\r\2\2\u0127\u0128\t\f\2\2\u0128\u0129\t\20\2\2"+
		"\u0129\u012a\t\16\2\2\u012a\u012b\t\25\2\2\u012b:\3\2\2\2\u012c\u012d"+
		"\t\r\2\2\u012d\u012e\t\26\2\2\u012e\u012f\t\26\2\2\u012f\u0130\t\13\2"+
		"\2\u0130\u0131\t\7\2\2\u0131\u0132\t\6\2\2\u0132\u0133\t\24\2\2\u0133"+
		"\u0134\t\t\2\2\u0134\u0135\t\5\2\2\u0135<\3\2\2\2\u0136\u0137\t\22\2\2"+
		"\u0137\u0138\t\7\2\2\u0138\u0139\t\6\2\2\u0139\u013a\t\24\2\2\u013a\u013b"+
		"\t\t\2\2\u013b\u013c\t\5\2\2\u013c>\3\2\2\2\u013d\u013e\t\17\2\2\u013e"+
		"\u013f\t\16\2\2\u013f\u0140\t\t\2\2\u0140\u0141\t\6\2\2\u0141\u0142\t"+
		"\7\2\2\u0142\u0143\t\r\2\2\u0143\u0144\t\t\2\2\u0144\u0145\t\5\2\2\u0145"+
		"@\3\2\2\2\u0146\u0147\t\3\2\2\u0147\u0148\t\6\2\2\u0148\u0149\t\t\2\2"+
		"\u0149\u014a\t\t\2\2\u014a\u014b\t\5\2\2\u014b\u014c\t\20\2\2\u014c\u014d"+
		"\t\16\2\2\u014d\u014e\t\f\2\2\u014e\u014f\5Y-\2\u014f\u0150\t\r\2\2\u0150"+
		"\u0151\t\f\2\2\u0151\u0152\t\b\2\2\u0152\u0153\t\13\2\2\u0153\u0154\t"+
		"\7\2\2\u0154B\3\2\2\2\u0155\u0156\5+\26\2\u0156\u0157\5Y-\2\u0157\u0158"+
		"\t\16\2\2\u0158\u0159\t\f\2\2\u0159\u015a\5Y-\2\u015a\u015b\t\r\2\2\u015b"+
		"\u015c\t\f\2\2\u015c\u015d\t\b\2\2\u015d\u015e\t\13\2\2\u015e\u015f\t"+
		"\7\2\2\u015fD\3\2\2\2\u0160\u0161\t\22\2\2\u0161\u0162\t\7\2\2\u0162\u0163"+
		"\t\4\2\2\u0163\u0164\t\r\2\2\u0164\u0165\t\3\2\2\u0165\u0166\t\7\2\2\u0166"+
		"F\3\2\2\2\u0167\u0168\t\5\2\2\u0168\u0169\t\27\2\2\u0169\u016a\t\7\2\2"+
		"\u016a\u016b\t\5\2\2\u016b\u016c\t\4\2\2\u016c\u016d\t\f\2\2\u016d\u016e"+
		"\t\6\2\2\u016e\u016f\t\t\2\2\u016fH\3\2\2\2\u0170\u0171\t\22\2\2\u0171"+
		"\u0172\t\5\2\2\u0172\u0173\t\3\2\2\u0173\u0174\t\13\2\2\u0174\u0175\t"+
		"\4\2\2\u0175\u0176\t\r\2\2\u0176\u0177\t\7\2\2\u0177\u0178\t\30\2\2\u0178"+
		"J\3\2\2\2\u0179\u017b\5G$\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\5I%\2\u017d\u017e\t\r\2\2\u017e\u017f\t\f\2"+
		"\2\u017f\u0180\t\17\2\2\u0180\u0181\t\16\2\2\u0181\u0182\t\31\2\2\u0182"+
		"\u0183\t\5\2\2\u0183\u0184\t\4\2\2\u0184L\3\2\2\2\u0185\u0187\5G$\2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\5I"+
		"%\2\u0189\u018a\t\20\2\2\u018a\u018b\t\5\2\2\u018b\u018c\t\n\2\2\u018c"+
		"\u018d\t\r\2\2\u018d\u018e\t\f\2\2\u018e\u018f\t\5\2\2\u018f\u0190\t\4"+
		"\2\2\u0190N\3\2\2\2\u0191\u0192\t\3\2\2\u0192\u0193\t\16\2\2\u0193\u0194"+
		"\t\22\2\2\u0194\u0195\t\7\2\2\u0195P\3\2\2\2\u0196\u0197\t\4\2\2\u0197"+
		"\u0198\t\16\2\2\u0198\u0199\t\25\2\2\u0199\u019a\t\22\2\2\u019aR\3\2\2"+
		"\2\u019b\u019c\t\3\2\2\u019c\u019d\t\16\2\2\u019d\u019e\t\f\2\2\u019e"+
		"\u019f\t\22\2\2\u019f\u01a0\t\7\2\2\u01a0\u01a1\t\6\2\2\u01a1\u01a2\t"+
		"\f\2\2\u01a2\u01a3\t\7\2\2\u01a3T\3\2\2\2\u01a4\u01a5\t\3\2\2\u01a5\u01a6"+
		"\t\16\2\2\u01a6\u01a7\t\t\2\2\u01a7\u01a8\t\t\2\2\u01a8\u01a9\t\6\2\2"+
		"\u01a9\u01aa\t\7\2\2\u01aa\u01ab\t\5\2\2\u01abV\3\2\2\2\u01ac\u01ad\t"+
		"\f\2\2\u01ad\u01ae\t\16\2\2\u01ae\u01af\t\7\2\2\u01afX\3\2\2\2\u01b0\u01b1"+
		"\t\f\2\2\u01b1\u01b2\t\13\2\2\u01b2\u01b3\t\t\2\2\u01b3\u01b4\t\t\2\2"+
		"\u01b4Z\3\2\2\2\u01b5\u01ba\t\32\2\2\u01b6\u01b9\t\32\2\2\u01b7\u01b9"+
		"\5e\63\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\\\3\2\2\2\u01bc\u01ba\3\2\2\2"+
		"\u01bd\u01be\7/\2\2\u01be\u01bf\7/\2\2\u01bf\u01c3\3\2\2\2\u01c0\u01c2"+
		"\13\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c4\3\2\2\2"+
		"\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8"+
		"\7\17\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2"+
		"\u01c9\u01ca\7\f\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\b/\2\2\u01cc^\3\2"+
		"\2\2\u01cd\u01ce\7\61\2\2\u01ce\u01cf\7,\2\2\u01cf\u01d3\3\2\2\2\u01d0"+
		"\u01d2\13\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d4\3"+
		"\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6"+
		"\u01d7\7,\2\2\u01d7\u01d8\7\61\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\b\60"+
		"\3\2\u01da`\3\2\2\2\u01db\u01dd\t\33\2\2\u01dc\u01db\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\b\61\4\2\u01e1b\3\2\2\2\u01e2\u01e4\7G\2\2\u01e3\u01e5\t\34\2\2"+
		"\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e8"+
		"\5e\63\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ead\3\2\2\2\u01eb\u01ec\t\35\2\2\u01ecf\3\2\2\2\32\2"+
		"uw\177\u0084\u008a\u0091\u0096\u009c\u009f\u00a7\u00ab\u00f2\u0121\u017a"+
		"\u0186\u01b8\u01ba\u01c3\u01c7\u01d3\u01de\u01e4\u01e9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}