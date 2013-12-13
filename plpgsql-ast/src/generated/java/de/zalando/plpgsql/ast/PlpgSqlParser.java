// Generated from de/zalando/plpgsql/ast/PlpgSql.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlpgSqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TYPE=2, LANGUAGE_ID=3, ID=4, LETTER=5, LINE_COMMENT=6, MULTI_LINE_COMMENT=7, 
		NL=8, WS=9, DOLLAR_COMMENT_TOKEN=10, BEGIN=11, END=12, DECLARE=13, CREATE=14, 
		OR=15, REPLACE=16, FUNCTION=17, RETURNS=18, AS=19, LANGUAGE=20;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "'VOID'", "LANGUAGE_ID", "ID", "LETTER", "LINE_COMMENT", 
		"MULTI_LINE_COMMENT", "NL", "WS", "DOLLAR_COMMENT_TOKEN", "BEGIN", "END", 
		"DECLARE", "CREATE", "OR", "REPLACE", "FUNCTION", "RETURNS", "AS", "LANGUAGE"
	};
	public static final int
		RULE_plpgsql = 0, RULE_function_body = 1, RULE_block = 2, RULE_stmts = 3;
	public static final String[] ruleNames = {
		"plpgsql", "function_body", "block", "stmts"
	};

	@Override
	public String getGrammarFileName() { return "PlpgSql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlpgSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PlpgsqlContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(PlpgSqlParser.AS, 0); }
		public TerminalNode CREATE() { return getToken(PlpgSqlParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(PlpgSqlParser.OR, 0); }
		public TerminalNode ID() { return getToken(PlpgSqlParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(PlpgSqlParser.FUNCTION, 0); }
		public TerminalNode REPLACE() { return getToken(PlpgSqlParser.REPLACE, 0); }
		public TerminalNode RETURNS() { return getToken(PlpgSqlParser.RETURNS, 0); }
		public TerminalNode LANGUAGE_ID() { return getToken(PlpgSqlParser.LANGUAGE_ID, 0); }
		public TerminalNode LANGUAGE() { return getToken(PlpgSqlParser.LANGUAGE, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public List<TerminalNode> DOLLAR_COMMENT_TOKEN() { return getTokens(PlpgSqlParser.DOLLAR_COMMENT_TOKEN); }
		public TerminalNode DOLLAR_COMMENT_TOKEN(int i) {
			return getToken(PlpgSqlParser.DOLLAR_COMMENT_TOKEN, i);
		}
		public TerminalNode TYPE() { return getToken(PlpgSqlParser.TYPE, 0); }
		public PlpgsqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plpgsql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgSqlListener ) ((PlpgSqlListener)listener).enterPlpgsql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgSqlListener ) ((PlpgSqlListener)listener).exitPlpgsql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgSqlVisitor ) return ((PlpgSqlVisitor<? extends T>)visitor).visitPlpgsql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlpgsqlContext plpgsql() throws RecognitionException {
		PlpgsqlContext _localctx = new PlpgsqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plpgsql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); match(CREATE);
			setState(11);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(9); match(OR);
				setState(10); match(REPLACE);
				}
			}

			setState(13); match(FUNCTION);
			setState(14); match(ID);
			setState(15); match(RETURNS);
			setState(16); match(TYPE);
			setState(17); match(AS);
			setState(18); match(DOLLAR_COMMENT_TOKEN);
			setState(19); function_body();
			setState(20); match(DOLLAR_COMMENT_TOKEN);
			setState(21); match(LANGUAGE);
			setState(22); match(LANGUAGE_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(PlpgSqlParser.DECLARE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgSqlListener ) ((PlpgSqlListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgSqlListener ) ((PlpgSqlListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgSqlVisitor ) return ((PlpgSqlVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(DECLARE);
			setState(25); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(PlpgSqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PlpgSqlParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgSqlListener ) ((PlpgSqlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgSqlListener ) ((PlpgSqlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgSqlVisitor ) return ((PlpgSqlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(BEGIN);
			setState(28); stmts();
			setState(29); match(END);
			setState(30); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(PlpgSqlParser.NL, 0); }
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgSqlListener ) ((PlpgSqlListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgSqlListener ) ((PlpgSqlListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgSqlVisitor ) return ((PlpgSqlVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\26%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\5\2\16\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\2\6\2\4\6"+
		"\b\2\2!\2\n\3\2\2\2\4\32\3\2\2\2\6\35\3\2\2\2\b\"\3\2\2\2\n\r\7\20\2\2"+
		"\13\f\7\21\2\2\f\16\7\22\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\17\3\2\2\2\17"+
		"\20\7\23\2\2\20\21\7\6\2\2\21\22\7\24\2\2\22\23\7\4\2\2\23\24\7\25\2\2"+
		"\24\25\7\f\2\2\25\26\5\4\3\2\26\27\7\f\2\2\27\30\7\26\2\2\30\31\7\5\2"+
		"\2\31\3\3\2\2\2\32\33\7\17\2\2\33\34\5\6\4\2\34\5\3\2\2\2\35\36\7\r\2"+
		"\2\36\37\5\b\5\2\37 \7\16\2\2 !\7\3\2\2!\7\3\2\2\2\"#\7\n\2\2#\t\3\2\2"+
		"\2\3\r";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}