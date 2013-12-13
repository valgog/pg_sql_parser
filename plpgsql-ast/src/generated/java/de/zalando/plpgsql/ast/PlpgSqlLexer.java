// Generated from de/zalando/plpgsql/ast/PlpgSql.g4 by ANTLR 4.1
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
public class PlpgSqlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TYPE=2, LANGUAGE_ID=3, ID=4, LETTER=5, LINE_COMMENT=6, MULTI_LINE_COMMENT=7, 
		NL=8, WS=9, DOLLAR_COMMENT_TOKEN=10, BEGIN=11, END=12, DECLARE=13, CREATE=14, 
		OR=15, REPLACE=16, FUNCTION=17, RETURNS=18, AS=19, LANGUAGE=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"';'", "'VOID'", "LANGUAGE_ID", "ID", "LETTER", "LINE_COMMENT", "MULTI_LINE_COMMENT", 
		"NL", "WS", "DOLLAR_COMMENT_TOKEN", "BEGIN", "END", "DECLARE", "CREATE", 
		"OR", "REPLACE", "FUNCTION", "RETURNS", "AS", "LANGUAGE"
	};
	public static final String[] ruleNames = {
		"T__0", "TYPE", "LANGUAGE_ID", "ID", "LETTER", "LINE_COMMENT", "MULTI_LINE_COMMENT", 
		"NL", "WS", "DOLLAR_COMMENT_TOKEN", "BEGIN", "END", "DECLARE", "CREATE", 
		"OR", "REPLACE", "FUNCTION", "RETURNS", "AS", "LANGUAGE"
	};


		public static final int COMMENTS_CHANNEL = 0;


	public PlpgSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlpgSql.g4"; }

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
		case 5: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 6: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 8: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = COMMENTS_CHANNEL;  break;
		}
	}
	private void MULTI_LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = COMMENTS_CHANNEL;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\26\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5>\n\5\r\5\16\5?\3\5\3\5\7\5"+
		"D\n\5\f\5\16\5G\13\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7O\n\7\f\7\16\7R\13\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\5\tg\n\t\3\t\3\t\3\n\6\nl\n\n\r\n\16\nm\3\n\3\n\3\13\3\13\7"+
		"\13t\n\13\f\13\16\13w\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\4P]\26\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\2\17\t\3\21\n\1\23\13\4"+
		"\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1\3\2\26\4\2RRrr\4\2NNnn\4\2IIii\4\2UUuu\4\2SSss\3\2\62;\4\2C\\"+
		"c|\5\2\13\f\17\17\"\"\4\2DDdd\4\2GGgg\4\2KKkk\4\2PPpp\4\2FFff\4\2EEee"+
		"\4\2CCcc\4\2TTtt\4\2VVvv\4\2QQqq\4\2HHhh\4\2WWww\u00c1\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7\62\3\2\2\2\t=\3\2\2\2\13"+
		"H\3\2\2\2\rJ\3\2\2\2\17W\3\2\2\2\21f\3\2\2\2\23k\3\2\2\2\25q\3\2\2\2\27"+
		"z\3\2\2\2\31\u0080\3\2\2\2\33\u0084\3\2\2\2\35\u008c\3\2\2\2\37\u0093"+
		"\3\2\2\2!\u0096\3\2\2\2#\u009e\3\2\2\2%\u00a7\3\2\2\2\'\u00af\3\2\2\2"+
		")\u00b2\3\2\2\2+,\7=\2\2,\4\3\2\2\2-.\7X\2\2./\7Q\2\2/\60\7K\2\2\60\61"+
		"\7F\2\2\61\6\3\2\2\2\62\63\7)\2\2\63\64\t\2\2\2\64\65\t\3\2\2\65\66\t"+
		"\2\2\2\66\67\t\4\2\2\678\t\5\2\289\t\6\2\29:\t\3\2\2:;\7)\2\2;\b\3\2\2"+
		"\2<>\5\13\6\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2AB\t\7"+
		"\2\2BD\5\13\6\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\n\3\2\2\2GE\3"+
		"\2\2\2HI\t\b\2\2I\f\3\2\2\2JK\7/\2\2KL\7/\2\2LP\3\2\2\2MO\13\2\2\2NM\3"+
		"\2\2\2OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5\21\t\2TU"+
		"\3\2\2\2UV\b\7\2\2V\16\3\2\2\2WX\7\61\2\2XY\7,\2\2Y]\3\2\2\2Z\\\13\2\2"+
		"\2[Z\3\2\2\2\\_\3\2\2\2]^\3\2\2\2][\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7,\2"+
		"\2ab\7\61\2\2bc\3\2\2\2cd\b\b\3\2d\20\3\2\2\2eg\7\17\2\2fe\3\2\2\2fg\3"+
		"\2\2\2gh\3\2\2\2hi\7\f\2\2i\22\3\2\2\2jl\t\t\2\2kj\3\2\2\2lm\3\2\2\2m"+
		"k\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\n\4\2p\24\3\2\2\2qu\7&\2\2rt\5\13\6"+
		"\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7&\2"+
		"\2y\26\3\2\2\2z{\t\n\2\2{|\t\13\2\2|}\t\4\2\2}~\t\f\2\2~\177\t\r\2\2\177"+
		"\30\3\2\2\2\u0080\u0081\t\13\2\2\u0081\u0082\t\r\2\2\u0082\u0083\t\16"+
		"\2\2\u0083\32\3\2\2\2\u0084\u0085\t\16\2\2\u0085\u0086\t\13\2\2\u0086"+
		"\u0087\t\17\2\2\u0087\u0088\t\3\2\2\u0088\u0089\t\20\2\2\u0089\u008a\t"+
		"\21\2\2\u008a\u008b\t\13\2\2\u008b\34\3\2\2\2\u008c\u008d\t\17\2\2\u008d"+
		"\u008e\t\21\2\2\u008e\u008f\t\13\2\2\u008f\u0090\t\20\2\2\u0090\u0091"+
		"\t\22\2\2\u0091\u0092\t\13\2\2\u0092\36\3\2\2\2\u0093\u0094\t\23\2\2\u0094"+
		"\u0095\t\21\2\2\u0095 \3\2\2\2\u0096\u0097\t\21\2\2\u0097\u0098\t\13\2"+
		"\2\u0098\u0099\t\2\2\2\u0099\u009a\t\3\2\2\u009a\u009b\t\20\2\2\u009b"+
		"\u009c\t\17\2\2\u009c\u009d\t\13\2\2\u009d\"\3\2\2\2\u009e\u009f\t\24"+
		"\2\2\u009f\u00a0\t\25\2\2\u00a0\u00a1\t\r\2\2\u00a1\u00a2\t\17\2\2\u00a2"+
		"\u00a3\t\22\2\2\u00a3\u00a4\t\f\2\2\u00a4\u00a5\t\23\2\2\u00a5\u00a6\t"+
		"\r\2\2\u00a6$\3\2\2\2\u00a7\u00a8\t\21\2\2\u00a8\u00a9\t\13\2\2\u00a9"+
		"\u00aa\t\22\2\2\u00aa\u00ab\t\25\2\2\u00ab\u00ac\t\21\2\2\u00ac\u00ad"+
		"\t\r\2\2\u00ad\u00ae\t\5\2\2\u00ae&\3\2\2\2\u00af\u00b0\t\20\2\2\u00b0"+
		"\u00b1\t\5\2\2\u00b1(\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3\u00b4\t\20\2\2"+
		"\u00b4\u00b5\t\r\2\2\u00b5\u00b6\t\4\2\2\u00b6\u00b7\t\25\2\2\u00b7\u00b8"+
		"\t\20\2\2\u00b8\u00b9\t\4\2\2\u00b9\u00ba\t\13\2\2\u00ba*\3\2\2\2\n\2"+
		"?EP]fmu";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}