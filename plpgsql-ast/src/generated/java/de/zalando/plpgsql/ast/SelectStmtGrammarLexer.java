// Generated from de/zalando/plpgsql/ast/SelectStmtGrammar.g4 by ANTLR 4.1
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
public class SelectStmtGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, ALL=2, DISTINCT=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"SELECT", "ALL", "DISTINCT"
	};
	public static final String[] ruleNames = {
		"SELECT", "ALL", "DISTINCT"
	};


	public SelectStmtGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SelectStmtGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\5\35\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\2\5\3\3\1\5\4\1\7\5\1\3\2\13\4\2UUuu\4\2GG"+
		"gg\4\2NNnn\4\2EEee\4\2VVvv\4\2CCcc\4\2FFff\4\2KKkk\4\2PPpp\34\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\t\3\2\2\2\5\20\3\2\2\2\7\24\3\2\2\2\t\n"+
		"\t\2\2\2\n\13\t\3\2\2\13\f\t\4\2\2\f\r\t\3\2\2\r\16\t\5\2\2\16\17\t\6"+
		"\2\2\17\4\3\2\2\2\20\21\t\7\2\2\21\22\t\4\2\2\22\23\t\4\2\2\23\6\3\2\2"+
		"\2\24\25\t\b\2\2\25\26\t\t\2\2\26\27\t\2\2\2\27\30\t\6\2\2\30\31\t\t\2"+
		"\2\31\32\t\n\2\2\32\33\t\5\2\2\33\34\t\6\2\2\34\b\3\2\2\2\3\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}