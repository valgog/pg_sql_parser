// Generated from de/zalando/plpgsql/ast/SelectStmtGrammar.g4 by ANTLR 4.1
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
public class SelectStmtGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, LIKE=9, 
		SIMILAR_OP=10, SIMILAR=11, TO=12, AND=13, OR=14, ASSIGN_OP=15, BETWEEN=16, 
		IS=17, NOT=18, ISNULL=19, NOTNULL=20, MUL=21, DIV=22, MOD=23, ADD=24, 
		SUB=25, EQ=26, NEQ=27, LT=28, LTE=29, GT=30, GTE=31, SELECT=32, ALL=33, 
		DISTINCT=34, FROM=35, WHERE=36, GROUP_BY=37, GROUP=38, BY=39, ORDER_BY=40, 
		ORDER=41, LIMIT=42, OFFSET=43, ROW=44, ROWS=45, FETCH=46, ONLY=47, UPDATE=48, 
		SHARE=49, OF=50, NOWAIT=51, INTO=52, STRICT=53, UNION=54, INTERSECT=55, 
		EXCEPT=56, ASC=57, DESC=58, USING=59, NULLS=60, FIRST=61, NEXT=62, LAST=63, 
		CAST=64, ALIAS=65, FOR=66, CREATE=67, REPLACE=68, FUNCTION=69, IN=70, 
		OUT=71, INOUT=72, VARIADIC=73, ON=74, HAVING=75, LANGUAGE=76, LANGUAGE_NAME=77, 
		DEFAULT=78, RETURNS=79, TABLE=80, AS=81, DECLARE=82, BEGIN=83, END=84, 
		WINDOW=85, IMMUTABLE=86, STABLE=87, VOLATILE=88, CALLED_ON_NULL_INPUT=89, 
		RETURNS_NULL_ON_NULL_INPUT=90, EXTERNAL=91, SECURITY=92, SECURITY_INVOKER=93, 
		SECURITY_DEFINER=94, COST=95, CONSTANT=96, COLLATE=97, NULL=98, TRUE=99, 
		FALSE=100, UNKNOWN=101, DOLLAR_QUOTE=102, QUOTE=103, STRING=104, INTEGER_VALUE=105, 
		DECIMAL_VALUE=106, ID=107, QNAME=108, ARRAY_TYPE=109, COPY_TYPE=110, ROW_TYPE=111, 
		SL_COMMENT=112, ML_COMMENT=113, WS=114;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'^'", "')'", "','", "'::'", "'['", "'('", "';'", 
		"LIKE", "SIMILAR_OP", "SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", 
		"IS", "NOT", "ISNULL", "NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", 
		"NEQ", "'<'", "'<='", "'>'", "'>='", "SELECT", "ALL", "DISTINCT", "FROM", 
		"WHERE", "GROUP_BY", "GROUP", "BY", "ORDER_BY", "ORDER", "LIMIT", "OFFSET", 
		"ROW", "ROWS", "FETCH", "ONLY", "UPDATE", "SHARE", "OF", "NOWAIT", "INTO", 
		"STRICT", "UNION", "INTERSECT", "EXCEPT", "ASC", "DESC", "USING", "NULLS", 
		"FIRST", "NEXT", "LAST", "CAST", "ALIAS", "FOR", "CREATE", "REPLACE", 
		"FUNCTION", "IN", "OUT", "INOUT", "VARIADIC", "ON", "HAVING", "LANGUAGE", 
		"LANGUAGE_NAME", "DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", 
		"END", "WINDOW", "IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", 
		"RETURNS_NULL_ON_NULL_INPUT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", 
		"SECURITY_DEFINER", "COST", "CONSTANT", "COLLATE", "NULL", "TRUE", "FALSE", 
		"UNKNOWN", "DOLLAR_QUOTE", "'''", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", 
		"ID", "QNAME", "ARRAY_TYPE", "COPY_TYPE", "ROW_TYPE", "SL_COMMENT", "ML_COMMENT", 
		"WS"
	};
	public static final int
		RULE_selectStmt = 0, RULE_select = 1, RULE_selectList = 2, RULE_distinctClause = 3, 
		RULE_selectSpecific = 4, RULE_selectAll = 5, RULE_intoClause = 6, RULE_limitClause = 7, 
		RULE_offsetClause = 8, RULE_orderByClause = 9, RULE_orderByItem = 10, 
		RULE_orderByUsing = 11, RULE_nullsOrdering = 12, RULE_fromClause = 13, 
		RULE_tableExpression = 14, RULE_columnAlias = 15, RULE_columnAliasItem = 16, 
		RULE_whereClause = 17, RULE_groupByClause = 18, RULE_havingClause = 19, 
		RULE_bulkOperationClause = 20, RULE_condition = 21, RULE_fetchClause = 22, 
		RULE_forClause = 23, RULE_lockedTables = 24, RULE_lockedTable = 25, RULE_functionCallExpr = 26, 
		RULE_numericConstant = 27, RULE_constantOfOtherTypes = 28, RULE_numericalExpr = 29, 
		RULE_booleanExpr = 30, RULE_expression = 31, RULE_assignOperator = 32;
	public static final String[] ruleNames = {
		"selectStmt", "select", "selectList", "distinctClause", "selectSpecific", 
		"selectAll", "intoClause", "limitClause", "offsetClause", "orderByClause", 
		"orderByItem", "orderByUsing", "nullsOrdering", "fromClause", "tableExpression", 
		"columnAlias", "columnAliasItem", "whereClause", "groupByClause", "havingClause", 
		"bulkOperationClause", "condition", "fetchClause", "forClause", "lockedTables", 
		"lockedTable", "functionCallExpr", "numericConstant", "constantOfOtherTypes", 
		"numericalExpr", "booleanExpr", "expression", "assignOperator"
	};

	@Override
	public String getGrammarFileName() { return "SelectStmtGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SelectStmtGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SelectStmtContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); select();
			setState(67); match(8);
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

	public static class SelectContext extends ParserRuleContext {
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(SelectStmtGrammarParser.SELECT, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(SELECT);
			setState(70); selectList();
			setState(72);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(71); fromClause();
				}
			}

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

	public static class SelectListContext extends ParserRuleContext {
		public DistinctClauseContext distinctClause() {
			return getRuleContext(DistinctClauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SelectStmtGrammarParser.ALL, 0); }
		public SelectSpecificContext selectSpecific() {
			return getRuleContext(SelectSpecificContext.class,0);
		}
		public SelectAllContext selectAll() {
			return getRuleContext(SelectAllContext.class,0);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(74); match(ALL);
				}
				break;
			case DISTINCT:
				{
				setState(75); distinctClause();
				}
				break;
			case 7:
			case NOT:
			case MUL:
			case ADD:
			case SUB:
			case CAST:
			case TRUE:
			case FALSE:
			case STRING:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(80);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(78); selectAll();
				}
				break;
			case 7:
			case NOT:
			case ADD:
			case SUB:
			case CAST:
			case TRUE:
			case FALSE:
			case STRING:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				{
				setState(79); selectSpecific();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class DistinctClauseContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ON() { return getToken(SelectStmtGrammarParser.ON, 0); }
		public TerminalNode DISTINCT() { return getToken(SelectStmtGrammarParser.DISTINCT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DistinctClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterDistinctClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitDistinctClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitDistinctClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctClauseContext distinctClause() throws RecognitionException {
		DistinctClauseContext _localctx = new DistinctClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_distinctClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(DISTINCT);
			setState(83); match(ON);
			setState(84); expression(0);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(85); match(4);
				setState(86); expression(0);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SelectSpecificContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SelectSpecificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpecific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterSelectSpecific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitSelectSpecific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitSelectSpecific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSpecificContext selectSpecific() throws RecognitionException {
		SelectSpecificContext _localctx = new SelectSpecificContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectSpecific);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); expression(0);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(93); match(4);
				setState(94); expression(0);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SelectAllContext extends ParserRuleContext {
		public SelectAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectAllContext selectAll() throws RecognitionException {
		SelectAllContext _localctx = new SelectAllContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(MUL);
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

	public static class IntoClauseContext extends ParserRuleContext {
		public Token strict;
		public Token target;
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public TerminalNode INTO() { return getToken(SelectStmtGrammarParser.INTO, 0); }
		public TerminalNode STRICT() { return getToken(SelectStmtGrammarParser.STRICT, 0); }
		public IntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterIntoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitIntoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoClauseContext intoClause() throws RecognitionException {
		IntoClauseContext _localctx = new IntoClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(INTO);
			setState(104);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(103); ((IntoClauseContext)_localctx).strict = match(STRICT);
				}
			}

			setState(106); ((IntoClauseContext)_localctx).target = match(ID);
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

	public static class LimitClauseContext extends ParserRuleContext {
		public Token limit;
		public TerminalNode INTEGER_VALUE() { return getToken(SelectStmtGrammarParser.INTEGER_VALUE, 0); }
		public TerminalNode LIMIT() { return getToken(SelectStmtGrammarParser.LIMIT, 0); }
		public TerminalNode ALL() { return getToken(SelectStmtGrammarParser.ALL, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(LIMIT);
			setState(109);
			((LimitClauseContext)_localctx).limit = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
				((LimitClauseContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OffsetClauseContext extends ParserRuleContext {
		public Token offset;
		public TerminalNode INTEGER_VALUE() { return getToken(SelectStmtGrammarParser.INTEGER_VALUE, 0); }
		public TerminalNode OFFSET() { return getToken(SelectStmtGrammarParser.OFFSET, 0); }
		public TerminalNode ROW() { return getToken(SelectStmtGrammarParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SelectStmtGrammarParser.ROWS, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_offsetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(OFFSET);
			setState(112); ((OffsetClauseContext)_localctx).offset = match(INTEGER_VALUE);
			setState(114);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

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

	public static class OrderByClauseContext extends ParserRuleContext {
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public TerminalNode ORDER_BY() { return getToken(SelectStmtGrammarParser.ORDER_BY, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(ORDER_BY);
			setState(117); orderByItem();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(118); match(4);
				setState(119); orderByItem();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class OrderByItemContext extends ParserRuleContext {
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	 
		public OrderByItemContext() { }
		public void copyFrom(OrderByItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsingOrderingContext extends OrderByItemContext {
		public OrderByUsingContext orderByUsing() {
			return getRuleContext(OrderByUsingContext.class,0);
		}
		public NullsOrderingContext nullsOrdering() {
			return getRuleContext(NullsOrderingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UsingOrderingContext(OrderByItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterUsingOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitUsingOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitUsingOrdering(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StandardOrderingContext extends OrderByItemContext {
		public Token ordering;
		public NullsOrderingContext nullsOrdering() {
			return getRuleContext(NullsOrderingContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SelectStmtGrammarParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(SelectStmtGrammarParser.ASC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StandardOrderingContext(OrderByItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterStandardOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitStandardOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitStandardOrdering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_orderByItem);
		int _la;
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new StandardOrderingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125); expression(0);
				setState(127);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(126);
					((StandardOrderingContext)_localctx).ordering = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
						((StandardOrderingContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(130);
				_la = _input.LA(1);
				if (_la==NULLS) {
					{
					setState(129); nullsOrdering();
					}
				}

				}
				break;

			case 2:
				_localctx = new UsingOrderingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132); expression(0);
				setState(133); orderByUsing();
				setState(135);
				_la = _input.LA(1);
				if (_la==NULLS) {
					{
					setState(134); nullsOrdering();
					}
				}

				}
				break;
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

	public static class OrderByUsingContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode GTE() { return getToken(SelectStmtGrammarParser.GTE, 0); }
		public TerminalNode LT() { return getToken(SelectStmtGrammarParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SelectStmtGrammarParser.LTE, 0); }
		public TerminalNode USING() { return getToken(SelectStmtGrammarParser.USING, 0); }
		public TerminalNode GT() { return getToken(SelectStmtGrammarParser.GT, 0); }
		public OrderByUsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByUsing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterOrderByUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitOrderByUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitOrderByUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByUsingContext orderByUsing() throws RecognitionException {
		OrderByUsingContext _localctx = new OrderByUsingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderByUsing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(USING);
			setState(140);
			((OrderByUsingContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
				((OrderByUsingContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NullsOrderingContext extends ParserRuleContext {
		public Token ordering;
		public TerminalNode FIRST() { return getToken(SelectStmtGrammarParser.FIRST, 0); }
		public TerminalNode NULLS() { return getToken(SelectStmtGrammarParser.NULLS, 0); }
		public TerminalNode LAST() { return getToken(SelectStmtGrammarParser.LAST, 0); }
		public NullsOrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullsOrdering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterNullsOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitNullsOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitNullsOrdering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullsOrderingContext nullsOrdering() throws RecognitionException {
		NullsOrderingContext _localctx = new NullsOrderingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nullsOrdering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(NULLS);
			setState(143);
			((NullsOrderingContext)_localctx).ordering = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==LAST) ) {
				((NullsOrderingContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FromClauseContext extends ParserRuleContext {
		public TableExpressionContext tableExpression(int i) {
			return getRuleContext(TableExpressionContext.class,i);
		}
		public List<TableExpressionContext> tableExpression() {
			return getRuleContexts(TableExpressionContext.class);
		}
		public TerminalNode FROM() { return getToken(SelectStmtGrammarParser.FROM, 0); }
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(FROM);
			setState(146); tableExpression();
			{
			setState(147); match(4);
			setState(148); tableExpression();
			}
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

	public static class TableExpressionContext extends ParserRuleContext {
		public TableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpression; }
	 
		public TableExpressionContext() { }
		public void copyFrom(TableExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FromTableContext extends TableExpressionContext {
		public Token only;
		public Token tableName;
		public Token alias;
		public TerminalNode AS() { return getToken(SelectStmtGrammarParser.AS, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public TerminalNode ONLY() { return getToken(SelectStmtGrammarParser.ONLY, 0); }
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public FromTableContext(TableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromSelectContext extends TableExpressionContext {
		public Token alias;
		public TerminalNode AS() { return getToken(SelectStmtGrammarParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public FromSelectContext(TableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterFromSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitFromSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitFromSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExpressionContext tableExpression() throws RecognitionException {
		TableExpressionContext _localctx = new TableExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableExpression);
		int _la;
		try {
			setState(174);
			switch (_input.LA(1)) {
			case ONLY:
			case QNAME:
				_localctx = new FromTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(150); ((FromTableContext)_localctx).only = match(ONLY);
					}
				}

				setState(153); ((FromTableContext)_localctx).tableName = match(QNAME);
				setState(155);
				_la = _input.LA(1);
				if (_la==MUL) {
					{
					setState(154); match(MUL);
					}
				}

				setState(162);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(158);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(157); match(AS);
						}
					}

					setState(160); ((FromTableContext)_localctx).alias = match(ID);
					setState(161); columnAlias();
					}
				}

				}
				break;
			case 7:
				_localctx = new FromSelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(7);
				setState(165); select();
				setState(166); match(3);
				setState(168);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(167); match(AS);
					}
				}

				setState(170); ((FromSelectContext)_localctx).alias = match(ID);
				setState(172);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(171); columnAlias();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ColumnAliasContext extends ParserRuleContext {
		public ColumnAliasItemContext columnAliasItem(int i) {
			return getRuleContext(ColumnAliasItemContext.class,i);
		}
		public List<ColumnAliasItemContext> columnAliasItem() {
			return getRuleContexts(ColumnAliasItemContext.class);
		}
		public ColumnAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterColumnAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitColumnAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitColumnAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasContext columnAlias() throws RecognitionException {
		ColumnAliasContext _localctx = new ColumnAliasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_columnAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(7);
			setState(177); columnAliasItem();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(178); match(4);
				setState(179); columnAliasItem();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185); match(3);
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

	public static class ColumnAliasItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public ColumnAliasItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliasItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterColumnAliasItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitColumnAliasItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitColumnAliasItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasItemContext columnAliasItem() throws RecognitionException {
		ColumnAliasItemContext _localctx = new ColumnAliasItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columnAliasItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(ID);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SelectStmtGrammarParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(WHERE);
			setState(190); condition();
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GROUP_BY() { return getToken(SelectStmtGrammarParser.GROUP_BY, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(GROUP_BY);
			setState(193); expression(0);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SelectStmtGrammarParser.HAVING, 0); }
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(HAVING);
			setState(196); condition();
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

	public static class BulkOperationClauseContext extends ParserRuleContext {
		public Token operator;
		public Token selectMode;
		public TerminalNode EXCEPT() { return getToken(SelectStmtGrammarParser.EXCEPT, 0); }
		public TerminalNode UNION() { return getToken(SelectStmtGrammarParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(SelectStmtGrammarParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(SelectStmtGrammarParser.DISTINCT, 0); }
		public TerminalNode INTERSECT() { return getToken(SelectStmtGrammarParser.INTERSECT, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public BulkOperationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulkOperationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterBulkOperationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitBulkOperationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitBulkOperationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BulkOperationClauseContext bulkOperationClause() throws RecognitionException {
		BulkOperationClauseContext _localctx = new BulkOperationClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bulkOperationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTERSECT) | (1L << EXCEPT))) != 0)) {
				{
				setState(198);
				((BulkOperationClauseContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTERSECT) | (1L << EXCEPT))) != 0)) ) {
					((BulkOperationClauseContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(199);
				((BulkOperationClauseContext)_localctx).selectMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
					((BulkOperationClauseContext)_localctx).selectMode = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(200); select();
				}
			}

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

	public static class ConditionContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); booleanExpr();
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

	public static class FetchClauseContext extends ParserRuleContext {
		public Token count;
		public TerminalNode INTEGER_VALUE() { return getToken(SelectStmtGrammarParser.INTEGER_VALUE, 0); }
		public TerminalNode NEXT() { return getToken(SelectStmtGrammarParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(SelectStmtGrammarParser.FIRST, 0); }
		public TerminalNode ROW() { return getToken(SelectStmtGrammarParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SelectStmtGrammarParser.ROWS, 0); }
		public TerminalNode ONLY() { return getToken(SelectStmtGrammarParser.ONLY, 0); }
		public TerminalNode FETCH() { return getToken(SelectStmtGrammarParser.FETCH, 0); }
		public FetchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterFetchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitFetchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitFetchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchClauseContext fetchClause() throws RecognitionException {
		FetchClauseContext _localctx = new FetchClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fetchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(FETCH);
			setState(207);
			_la = _input.LA(1);
			if (_la==FIRST || _la==NEXT) {
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(210);
			_la = _input.LA(1);
			if (_la==INTEGER_VALUE) {
				{
				setState(209); ((FetchClauseContext)_localctx).count = match(INTEGER_VALUE);
				}
			}

			setState(213);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(215); match(ONLY);
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

	public static class ForClauseContext extends ParserRuleContext {
		public Token lockMode;
		public Token nowait;
		public TerminalNode FOR() { return getToken(SelectStmtGrammarParser.FOR, 0); }
		public TerminalNode NOWAIT() { return getToken(SelectStmtGrammarParser.NOWAIT, 0); }
		public LockedTablesContext lockedTables() {
			return getRuleContext(LockedTablesContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(SelectStmtGrammarParser.UPDATE, 0); }
		public TerminalNode SHARE() { return getToken(SelectStmtGrammarParser.SHARE, 0); }
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(FOR);
			setState(218);
			((ForClauseContext)_localctx).lockMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UPDATE || _la==SHARE) ) {
				((ForClauseContext)_localctx).lockMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(220);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(219); lockedTables();
				}
			}

			setState(223);
			_la = _input.LA(1);
			if (_la==NOWAIT) {
				{
				setState(222); ((ForClauseContext)_localctx).nowait = match(NOWAIT);
				}
			}

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

	public static class LockedTablesContext extends ParserRuleContext {
		public List<LockedTableContext> lockedTable() {
			return getRuleContexts(LockedTableContext.class);
		}
		public TerminalNode OF() { return getToken(SelectStmtGrammarParser.OF, 0); }
		public LockedTableContext lockedTable(int i) {
			return getRuleContext(LockedTableContext.class,i);
		}
		public LockedTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockedTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterLockedTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitLockedTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitLockedTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockedTablesContext lockedTables() throws RecognitionException {
		LockedTablesContext _localctx = new LockedTablesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lockedTables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(OF);
			setState(226); lockedTable();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(227); match(4);
				setState(228); lockedTable();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LockedTableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public LockedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockedTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterLockedTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitLockedTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitLockedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockedTableContext lockedTable() throws RecognitionException {
		LockedTableContext _localctx = new LockedTableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lockedTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(ID);
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

	public static class FunctionCallExprContext extends ParserRuleContext {
		public Token functionCallName;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExprContext functionCallExpr() throws RecognitionException {
		FunctionCallExprContext _localctx = new FunctionCallExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCallExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
			setState(237); match(7);
			setState(246);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << NOT) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAST - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (STRING - 64)) | (1L << (INTEGER_VALUE - 64)) | (1L << (DECIMAL_VALUE - 64)) | (1L << (ID - 64)) | (1L << (QNAME - 64)) | (1L << (ARRAY_TYPE - 64)) | (1L << (COPY_TYPE - 64)) | (1L << (ROW_TYPE - 64)))) != 0)) {
				{
				setState(238); expression(0);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(239); match(4);
					setState(240); expression(0);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(248); match(3);
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

	public static class NumericConstantContext extends ParserRuleContext {
		public Token value;
		public Token type;
		public Token typeName;
		public TerminalNode QUOTE(int i) {
			return getToken(SelectStmtGrammarParser.QUOTE, i);
		}
		public TerminalNode ARRAY_TYPE() { return getToken(SelectStmtGrammarParser.ARRAY_TYPE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SelectStmtGrammarParser.INTEGER_VALUE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(SelectStmtGrammarParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(SelectStmtGrammarParser.QUOTE); }
		public TerminalNode ROW_TYPE() { return getToken(SelectStmtGrammarParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SelectStmtGrammarParser.DECIMAL_VALUE, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numericConstant);
		int _la;
		try {
			setState(257);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(251); match(5);
				setState(252);
				((NumericConstantContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((NumericConstantContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(254); match(QUOTE);
				setState(255);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(256); match(QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstantOfOtherTypesContext extends ParserRuleContext {
		public Token type;
		public Token value;
		public TerminalNode AS() { return getToken(SelectStmtGrammarParser.AS, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(SelectStmtGrammarParser.ARRAY_TYPE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(SelectStmtGrammarParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode ROW_TYPE() { return getToken(SelectStmtGrammarParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SelectStmtGrammarParser.STRING, 0); }
		public TerminalNode CAST() { return getToken(SelectStmtGrammarParser.CAST, 0); }
		public ConstantOfOtherTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantOfOtherTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterConstantOfOtherTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitConstantOfOtherTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitConstantOfOtherTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantOfOtherTypesContext constantOfOtherTypes() throws RecognitionException {
		ConstantOfOtherTypesContext _localctx = new ConstantOfOtherTypesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constantOfOtherTypes);
		int _la;
		try {
			setState(270);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(260); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(262); match(5);
				setState(263);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(264); match(CAST);
				setState(265); match(7);
				setState(266); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(267); match(AS);
				setState(268);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(269); match(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumericalExprContext extends ParserRuleContext {
		public int _p;
		public NumericalExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NumericalExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_numericalExpr; }
	 
		public NumericalExprContext() { }
		public void copyFrom(NumericalExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class NumericalLiteralExpressionContext extends NumericalExprContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SelectStmtGrammarParser.DECIMAL_VALUE, 0); }
		public NumericalLiteralExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterNumericalLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitNumericalLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitNumericalLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public TerminalNode DIV() { return getToken(SelectStmtGrammarParser.DIV, 0); }
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public DivExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentiationExpressionContext extends NumericalExprContext {
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public ExponentiationExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterExponentiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitExponentiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitExponentiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(SelectStmtGrammarParser.SUB, 0); }
		public SubExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends NumericalExprContext {
		public Token unaryOperator;
		public NumericalExprContext numericalExpr() {
			return getRuleContext(NumericalExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(SelectStmtGrammarParser.SUB, 0); }
		public UnaryExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExpressionContext extends NumericalExprContext {
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public ConstantExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public TerminalNode MUL() { return getToken(SelectStmtGrammarParser.MUL, 0); }
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public MulExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalExpressionGroupContext extends NumericalExprContext {
		public NumericalExprContext numericalExpr() {
			return getRuleContext(NumericalExprContext.class,0);
		}
		public NumericalExpressionGroupContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterNumericalExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitNumericalExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitNumericalExpressionGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SelectStmtGrammarParser.ADD, 0); }
		public AddExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalFunctionExpressionContext extends NumericalExprContext {
		public FunctionCallExprContext functionCallExpr() {
			return getRuleContext(FunctionCallExprContext.class,0);
		}
		public NumericalFunctionExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterNumericalFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitNumericalFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitNumericalFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public TerminalNode MOD() { return getToken(SelectStmtGrammarParser.MOD, 0); }
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public ModExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericVariableExpressionContext extends NumericalExprContext {
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public NumericVariableExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterNumericVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitNumericVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitNumericVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalExprContext numericalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumericalExprContext _localctx = new NumericalExprContext(_ctx, _parentState, _p);
		NumericalExprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, RULE_numericalExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(273); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(274); numericalExpr(12);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(276); numericalExpr(11);
				}
				break;

			case 3:
				{
				_localctx = new NumericalFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new NumericalExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278); match(7);
				setState(279); numericalExpr(0);
				setState(280); match(3);
				}
				break;

			case 5:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282); numericConstant();
				}
				break;

			case 6:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283); match(INTEGER_VALUE);
				}
				break;

			case 7:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284); match(DECIMAL_VALUE);
				}
				break;

			case 8:
				{
				_localctx = new NumericVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(306);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(288);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(289); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(290); numericalExpr(11);
						}
						break;

					case 2:
						{
						_localctx = new DivExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(291);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(292); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(293); numericalExpr(10);
						}
						break;

					case 3:
						{
						_localctx = new ModExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(294);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(295); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(296); numericalExpr(9);
						}
						break;

					case 4:
						{
						_localctx = new AddExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(297);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(298); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(299); numericalExpr(8);
						}
						break;

					case 5:
						{
						_localctx = new SubExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(300);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(301); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(302); numericalExpr(7);
						}
						break;

					case 6:
						{
						_localctx = new ExponentiationExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(303);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(304); match(2);
						setState(305); numericalExpr(5);
						}
						break;
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BooleanExprContext extends ParserRuleContext {
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
	 
		public BooleanExprContext() { }
		public void copyFrom(BooleanExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanConstantContext extends BooleanExprContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(SelectStmtGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SelectStmtGrammarParser.FALSE, 0); }
		public BooleanConstantContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitBooleanConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExpressionContext extends BooleanExprContext {
		public TerminalNode NOT() { return getToken(SelectStmtGrammarParser.NOT, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public NegateExpressionContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterNegateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitNegateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitNegateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanArbitraryConstantExpressionContext extends BooleanExprContext {
		public ConstantOfOtherTypesContext constantOfOtherTypes() {
			return getRuleContext(ConstantOfOtherTypesContext.class,0);
		}
		public BooleanArbitraryConstantExpressionContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterBooleanArbitraryConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitBooleanArbitraryConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitBooleanArbitraryConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooeleanExpressionGroupContext extends BooleanExprContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public BooeleanExpressionGroupContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterBooeleanExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitBooeleanExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitBooeleanExpressionGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVariableExpressionContext extends BooleanExprContext {
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public BooleanVariableExpressionContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterBooleanVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitBooleanVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitBooleanVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_booleanExpr);
		int _la;
		try {
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new BooeleanExpressionGroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311); match(7);
				setState(312); booleanExpr();
				setState(313); match(3);
				}
				break;

			case 2:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315); match(NOT);
				setState(316); booleanExpr();
				}
				break;

			case 3:
				_localctx = new BooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				((BooleanConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 4:
				_localctx = new BooleanArbitraryConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318); constantOfOtherTypes();
				}
				break;

			case 5:
				_localctx = new BooleanVariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(319); match(ID);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class StringLiteralExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(SelectStmtGrammarParser.STRING, 0); }
		public StringLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterStringLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitStringLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalExpressionContext extends ExpressionContext {
		public NumericalExprContext numericalExpr() {
			return getRuleContext(NumericalExprContext.class,0);
		}
		public NumericalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterNumericalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitNumericalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitNumericalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionGroupContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionGroupContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitExpressionGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public NumericalExprContext arrayIndexExpr;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallExprContext functionCallExpr() {
			return getRuleContext(FunctionCallExprContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionContext extends ExpressionContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArbitraryConstantExpressionContext extends ExpressionContext {
		public ConstantOfOtherTypesContext constantOfOtherTypes() {
			return getRuleContext(ConstantOfOtherTypesContext.class,0);
		}
		public ArbitraryConstantExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterArbitraryConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitArbitraryConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitArbitraryConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token operator;
		public Token not;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SelectStmtGrammarParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SIMILAR_OP() { return getToken(SelectStmtGrammarParser.SIMILAR_OP, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalConjunctionExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(SelectStmtGrammarParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LogicalConjunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterLogicalConjunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitLogicalConjunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitLogicalConjunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(323); functionCallExpr();
				}
				break;

			case 2:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324); match(7);
				setState(325); expression(0);
				setState(326); match(3);
				}
				break;

			case 3:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328); booleanExpr();
				}
				break;

			case 4:
				{
				_localctx = new NumericalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329); numericalExpr(0);
				}
				break;

			case 5:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330); constantOfOtherTypes();
				}
				break;

			case 6:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331); match(ID);
				}
				break;

			case 7:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332); match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(380);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(335);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(336); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(337); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(339); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(340); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(342); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(343); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(345); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(346); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(348); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(349); expression(10);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(351); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(352); expression(9);
						}
						break;

					case 7:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(354); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(355); expression(6);
						}
						break;

					case 8:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(357); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(358); expression(5);
						}
						break;

					case 9:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(364); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(360); match(6);
								setState(361); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = numericalExpr(0);
								setState(362); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(366); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 10:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(368);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(370);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(369); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(372); ((ComparisonExpressionContext)_localctx).operator = match(LIKE);
						setState(373); expression(0);
						}
						break;

					case 11:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(376);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(375); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(378); ((ComparisonExpressionContext)_localctx).operator = match(SIMILAR_OP);
						setState(379); expression(0);
						}
						break;
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN_OP() { return getToken(SelectStmtGrammarParser.ASSIGN_OP, 0); }
		public TerminalNode EQ() { return getToken(SelectStmtGrammarParser.EQ, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN_OP || _la==EQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29: return numericalExpr_sempred((NumericalExprContext)_localctx, predIndex);

		case 31: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return 6 >= _localctx._p;

		case 6: return 13 >= _localctx._p;

		case 7: return 12 >= _localctx._p;

		case 8: return 11 >= _localctx._p;

		case 9: return 10 >= _localctx._p;

		case 10: return 9 >= _localctx._p;

		case 11: return 8 >= _localctx._p;

		case 12: return 5 >= _localctx._p;

		case 13: return 4 >= _localctx._p;

		case 14: return 14 >= _localctx._p;

		case 15: return 7 >= _localctx._p;
		}
		return true;
	}
	private boolean numericalExpr_sempred(NumericalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;

		case 5: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3t\u0186\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\5\4O\n\4\3\4\3\4"+
		"\5\4S\n\4\3\5\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3\6\3\6\7\6"+
		"b\n\6\f\6\16\6e\13\6\3\7\3\7\3\b\3\b\5\bk\n\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\5\nu\n\n\3\13\3\13\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\f"+
		"\3\f\5\f\u0082\n\f\3\f\5\f\u0085\n\f\3\f\3\f\3\f\5\f\u008a\n\f\5\f\u008c"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\5\20\u009a"+
		"\n\20\3\20\3\20\5\20\u009e\n\20\3\20\5\20\u00a1\n\20\3\20\3\20\5\20\u00a5"+
		"\n\20\3\20\3\20\3\20\3\20\5\20\u00ab\n\20\3\20\3\20\5\20\u00af\n\20\5"+
		"\20\u00b1\n\20\3\21\3\21\3\21\3\21\7\21\u00b7\n\21\f\21\16\21\u00ba\13"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\5\26\u00cc\n\26\3\27\3\27\3\30\3\30\5\30\u00d2\n\30\3\30"+
		"\5\30\u00d5\n\30\3\30\5\30\u00d8\n\30\3\30\3\30\3\31\3\31\3\31\5\31\u00df"+
		"\n\31\3\31\5\31\u00e2\n\31\3\32\3\32\3\32\3\32\7\32\u00e8\n\32\f\32\16"+
		"\32\u00eb\13\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u00f4\n\34\f\34"+
		"\16\34\u00f7\13\34\5\34\u00f9\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0104\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0111\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0121\n\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0135"+
		"\n\37\f\37\16\37\u0138\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0143\n \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0150\n!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\6!\u016f"+
		"\n!\r!\16!\u0170\3!\3!\5!\u0175\n!\3!\3!\3!\3!\5!\u017b\n!\3!\3!\7!\u017f"+
		"\n!\f!\16!\u0182\13!\3\"\3\"\3\"\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@B\2\17\4\2##kk\3\2./\3\2;<\3\2\36!\4\2??"+
		"AA\3\28:\3\2#$\3\2?@\3\2\62\63\3\2kl\3\2mq\3\2ef\4\2\21\21\34\34\u01aa"+
		"\2D\3\2\2\2\4G\3\2\2\2\6N\3\2\2\2\bT\3\2\2\2\n^\3\2\2\2\ff\3\2\2\2\16"+
		"h\3\2\2\2\20n\3\2\2\2\22q\3\2\2\2\24v\3\2\2\2\26\u008b\3\2\2\2\30\u008d"+
		"\3\2\2\2\32\u0090\3\2\2\2\34\u0093\3\2\2\2\36\u00b0\3\2\2\2 \u00b2\3\2"+
		"\2\2\"\u00bd\3\2\2\2$\u00bf\3\2\2\2&\u00c2\3\2\2\2(\u00c5\3\2\2\2*\u00cb"+
		"\3\2\2\2,\u00cd\3\2\2\2.\u00cf\3\2\2\2\60\u00db\3\2\2\2\62\u00e3\3\2\2"+
		"\2\64\u00ec\3\2\2\2\66\u00ee\3\2\2\28\u0103\3\2\2\2:\u0110\3\2\2\2<\u0120"+
		"\3\2\2\2>\u0142\3\2\2\2@\u014f\3\2\2\2B\u0183\3\2\2\2DE\5\4\3\2EF\7\n"+
		"\2\2F\3\3\2\2\2GH\7\"\2\2HJ\5\6\4\2IK\5\34\17\2JI\3\2\2\2JK\3\2\2\2K\5"+
		"\3\2\2\2LO\7#\2\2MO\5\b\5\2NL\3\2\2\2NM\3\2\2\2NO\3\2\2\2OR\3\2\2\2PS"+
		"\5\f\7\2QS\5\n\6\2RP\3\2\2\2RQ\3\2\2\2S\7\3\2\2\2TU\7$\2\2UV\7L\2\2V["+
		"\5@!\2WX\7\6\2\2XZ\5@!\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t"+
		"\3\2\2\2][\3\2\2\2^c\5@!\2_`\7\6\2\2`b\5@!\2a_\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2d\13\3\2\2\2ec\3\2\2\2fg\7\27\2\2g\r\3\2\2\2hj\7\66\2\2"+
		"ik\7\67\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7m\2\2m\17\3\2\2\2no\7,\2"+
		"\2op\t\2\2\2p\21\3\2\2\2qr\7-\2\2rt\7k\2\2su\t\3\2\2ts\3\2\2\2tu\3\2\2"+
		"\2u\23\3\2\2\2vw\7*\2\2w|\5\26\f\2xy\7\6\2\2y{\5\26\f\2zx\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~|\3\2\2\2\177\u0081\5@!\2\u0080"+
		"\u0082\t\4\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2"+
		"\2\2\u0083\u0085\5\32\16\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u008c\3\2\2\2\u0086\u0087\5@!\2\u0087\u0089\5\30\r\2\u0088\u008a\5\32"+
		"\16\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\177\3\2\2\2\u008b\u0086\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e\7=\2\2\u008e"+
		"\u008f\t\5\2\2\u008f\31\3\2\2\2\u0090\u0091\7>\2\2\u0091\u0092\t\6\2\2"+
		"\u0092\33\3\2\2\2\u0093\u0094\7%\2\2\u0094\u0095\5\36\20\2\u0095\u0096"+
		"\7\6\2\2\u0096\u0097\5\36\20\2\u0097\35\3\2\2\2\u0098\u009a\7\61\2\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7n"+
		"\2\2\u009c\u009e\7\27\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a4\3\2\2\2\u009f\u00a1\7S\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7m\2\2\u00a3\u00a5\5 \21\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b1\3\2\2\2\u00a6\u00a7\7\t"+
		"\2\2\u00a7\u00a8\5\4\3\2\u00a8\u00aa\7\5\2\2\u00a9\u00ab\7S\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7m"+
		"\2\2\u00ad\u00af\5 \21\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u0099\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b1\37\3\2\2"+
		"\2\u00b2\u00b3\7\t\2\2\u00b3\u00b8\5\"\22\2\u00b4\u00b5\7\6\2\2\u00b5"+
		"\u00b7\5\"\22\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7\5\2\2\u00bc!\3\2\2\2\u00bd\u00be\7m\2\2\u00be#\3\2\2\2\u00bf"+
		"\u00c0\7&\2\2\u00c0\u00c1\5,\27\2\u00c1%\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3"+
		"\u00c4\5@!\2\u00c4\'\3\2\2\2\u00c5\u00c6\7M\2\2\u00c6\u00c7\5,\27\2\u00c7"+
		")\3\2\2\2\u00c8\u00c9\t\7\2\2\u00c9\u00ca\t\b\2\2\u00ca\u00cc\5\4\3\2"+
		"\u00cb\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc+\3\2\2\2\u00cd\u00ce\5"+
		"> \2\u00ce-\3\2\2\2\u00cf\u00d1\7\60\2\2\u00d0\u00d2\t\t\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\7k\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\t\3"+
		"\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\7\61\2\2\u00da/\3\2\2\2\u00db\u00dc\7D\2\2\u00dc\u00de\t\n\2\2"+
		"\u00dd\u00df\5\62\32\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1"+
		"\3\2\2\2\u00e0\u00e2\7\65\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\61\3\2\2\2\u00e3\u00e4\7\64\2\2\u00e4\u00e9\5\64\33\2\u00e5\u00e6"+
		"\7\6\2\2\u00e6\u00e8\5\64\33\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\63\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\7m\2\2\u00ed\65\3\2\2\2\u00ee\u00ef\7m\2\2\u00ef"+
		"\u00f8\7\t\2\2\u00f0\u00f5\5@!\2\u00f1\u00f2\7\6\2\2\u00f2\u00f4\5@!\2"+
		"\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\5\2\2\u00fb\67\3\2\2"+
		"\2\u00fc\u00fd\t\13\2\2\u00fd\u00fe\7\7\2\2\u00fe\u0104\t\f\2\2\u00ff"+
		"\u0100\t\f\2\2\u0100\u0101\7i\2\2\u0101\u0102\t\13\2\2\u0102\u0104\7i"+
		"\2\2\u0103\u00fc\3\2\2\2\u0103\u00ff\3\2\2\2\u01049\3\2\2\2\u0105\u0106"+
		"\t\f\2\2\u0106\u0111\7j\2\2\u0107\u0108\7j\2\2\u0108\u0109\7\7\2\2\u0109"+
		"\u0111\t\f\2\2\u010a\u010b\7B\2\2\u010b\u010c\7\t\2\2\u010c\u010d\7j\2"+
		"\2\u010d\u010e\7S\2\2\u010e\u010f\t\f\2\2\u010f\u0111\7\5\2\2\u0110\u0105"+
		"\3\2\2\2\u0110\u0107\3\2\2\2\u0110\u010a\3\2\2\2\u0111;\3\2\2\2\u0112"+
		"\u0113\b\37\1\2\u0113\u0114\7\32\2\2\u0114\u0121\5<\37\2\u0115\u0116\7"+
		"\33\2\2\u0116\u0121\5<\37\2\u0117\u0121\5\66\34\2\u0118\u0119\7\t\2\2"+
		"\u0119\u011a\5<\37\2\u011a\u011b\7\5\2\2\u011b\u0121\3\2\2\2\u011c\u0121"+
		"\58\35\2\u011d\u0121\7k\2\2\u011e\u0121\7l\2\2\u011f\u0121\7m\2\2\u0120"+
		"\u0112\3\2\2\2\u0120\u0115\3\2\2\2\u0120\u0117\3\2\2\2\u0120\u0118\3\2"+
		"\2\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0136\3\2\2\2\u0122\u0123\6\37\2\3\u0123\u0124\7"+
		"\27\2\2\u0124\u0135\5<\37\2\u0125\u0126\6\37\3\3\u0126\u0127\7\30\2\2"+
		"\u0127\u0135\5<\37\2\u0128\u0129\6\37\4\3\u0129\u012a\7\31\2\2\u012a\u0135"+
		"\5<\37\2\u012b\u012c\6\37\5\3\u012c\u012d\7\32\2\2\u012d\u0135\5<\37\2"+
		"\u012e\u012f\6\37\6\3\u012f\u0130\7\33\2\2\u0130\u0135\5<\37\2\u0131\u0132"+
		"\6\37\7\3\u0132\u0133\7\4\2\2\u0133\u0135\5<\37\2\u0134\u0122\3\2\2\2"+
		"\u0134\u0125\3\2\2\2\u0134\u0128\3\2\2\2\u0134\u012b\3\2\2\2\u0134\u012e"+
		"\3\2\2\2\u0134\u0131\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137=\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\t\2\2"+
		"\u013a\u013b\5> \2\u013b\u013c\7\5\2\2\u013c\u0143\3\2\2\2\u013d\u013e"+
		"\7\24\2\2\u013e\u0143\5> \2\u013f\u0143\t\r\2\2\u0140\u0143\5:\36\2\u0141"+
		"\u0143\7m\2\2\u0142\u0139\3\2\2\2\u0142\u013d\3\2\2\2\u0142\u013f\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143?\3\2\2\2\u0144\u0145"+
		"\b!\1\2\u0145\u0150\5\66\34\2\u0146\u0147\7\t\2\2\u0147\u0148\5@!\2\u0148"+
		"\u0149\7\5\2\2\u0149\u0150\3\2\2\2\u014a\u0150\5> \2\u014b\u0150\5<\37"+
		"\2\u014c\u0150\5:\36\2\u014d\u0150\7m\2\2\u014e\u0150\7j\2\2\u014f\u0144"+
		"\3\2\2\2\u014f\u0146\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2\2\2\u014f"+
		"\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0180\3\2"+
		"\2\2\u0151\u0152\6!\b\3\u0152\u0153\7\34\2\2\u0153\u017f\5@!\2\u0154\u0155"+
		"\6!\t\3\u0155\u0156\7\35\2\2\u0156\u017f\5@!\2\u0157\u0158\6!\n\3\u0158"+
		"\u0159\7\36\2\2\u0159\u017f\5@!\2\u015a\u015b\6!\13\3\u015b\u015c\7\37"+
		"\2\2\u015c\u017f\5@!\2\u015d\u015e\6!\f\3\u015e\u015f\7 \2\2\u015f\u017f"+
		"\5@!\2\u0160\u0161\6!\r\3\u0161\u0162\7!\2\2\u0162\u017f\5@!\2\u0163\u0164"+
		"\6!\16\3\u0164\u0165\7\17\2\2\u0165\u017f\5@!\2\u0166\u0167\6!\17\3\u0167"+
		"\u0168\7\20\2\2\u0168\u017f\5@!\2\u0169\u016e\6!\20\3\u016a\u016b\7\b"+
		"\2\2\u016b\u016c\5<\37\2\u016c\u016d\7\3\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016a\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u017f\3\2\2\2\u0172\u0174\6!\21\3\u0173\u0175\7\24\2\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7\13"+
		"\2\2\u0177\u017f\5@!\2\u0178\u017a\6!\22\3\u0179\u017b\7\24\2\2\u017a"+
		"\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7\f"+
		"\2\2\u017d\u017f\5@!\2\u017e\u0151\3\2\2\2\u017e\u0154\3\2\2\2\u017e\u0157"+
		"\3\2\2\2\u017e\u015a\3\2\2\2\u017e\u015d\3\2\2\2\u017e\u0160\3\2\2\2\u017e"+
		"\u0163\3\2\2\2\u017e\u0166\3\2\2\2\u017e\u0169\3\2\2\2\u017e\u0172\3\2"+
		"\2\2\u017e\u0178\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181A\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\t\16\2\2"+
		"\u0184C\3\2\2\2+JNR[cjt|\u0081\u0084\u0089\u008b\u0099\u009d\u00a0\u00a4"+
		"\u00aa\u00ae\u00b0\u00b8\u00cb\u00d1\u00d4\u00d7\u00de\u00e1\u00e9\u00f5"+
		"\u00f8\u0103\u0110\u0120\u0134\u0136\u0142\u014f\u0170\u0174\u017a\u017e"+
		"\u0180";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}