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
		SIMILAR=10, TO=11, AND=12, OR=13, ASSIGN_OP=14, BETWEEN=15, IS=16, NOT=17, 
		ISNULL=18, NOTNULL=19, MUL=20, DIV=21, MOD=22, ADD=23, SUB=24, EQ=25, 
		NEQ=26, LT=27, LTE=28, GT=29, GTE=30, JOIN=31, INNER=32, LEFT=33, RIGHT=34, 
		FULL=35, CROSS=36, OUTER=37, NATURAL=38, SELECT=39, ALL=40, DISTINCT=41, 
		FROM=42, WHERE=43, GROUP_BY=44, GROUP=45, BY=46, ORDER_BY=47, ORDER=48, 
		LIMIT=49, OFFSET=50, ROW=51, ROWS=52, FETCH=53, ONLY=54, UPDATE=55, SHARE=56, 
		OF=57, NOWAIT=58, INTO=59, STRICT=60, UNION=61, INTERSECT=62, EXCEPT=63, 
		ASC=64, DESC=65, USING=66, NULLS=67, FIRST=68, NEXT=69, LAST=70, CAST=71, 
		ALIAS=72, FOR=73, CREATE=74, REPLACE=75, FUNCTION=76, IN=77, OUT=78, INOUT=79, 
		VARIADIC=80, ON=81, HAVING=82, LANGUAGE=83, LANGUAGE_NAME=84, EXCEPTION=85, 
		DEFAULT=86, RETURNS=87, TABLE=88, AS=89, DECLARE=90, BEGIN=91, END=92, 
		WHEN=93, THEN=94, WINDOW=95, IMMUTABLE=96, STABLE=97, VOLATILE=98, CALLED_ON_NULL_INPUT=99, 
		RETURNS_NULL_ON_NULL_INPUT=100, EXTERNAL=101, SECURITY=102, SECURITY_INVOKER=103, 
		SECURITY_DEFINER=104, COST=105, CONSTANT=106, COLLATE=107, NULL=108, TRUE=109, 
		FALSE=110, UNKNOWN=111, F_DOLLAR_QUOTE=112, F_QUOTE=113, DOLLAR_QUOTE=114, 
		QUOTE=115, INTEGER_VALUE=116, DECIMAL_VALUE=117, ID=118, QNAME=119, ARRAY_TYPE=120, 
		COPY_TYPE=121, ROW_TYPE=122, STRING=123, WS=124, SL_COMMENT=125, ML_COMMENT=126;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'^'", "')'", "','", "'::'", "'['", "'('", "';'", 
		"LIKE", "SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", "IS", "NOT", 
		"ISNULL", "NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "NEQ", 
		"'<'", "'<='", "'>'", "'>='", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", 
		"CROSS", "OUTER", "NATURAL", "SELECT", "ALL", "DISTINCT", "FROM", "WHERE", 
		"GROUP_BY", "GROUP", "BY", "ORDER_BY", "ORDER", "LIMIT", "OFFSET", "ROW", 
		"ROWS", "FETCH", "ONLY", "UPDATE", "SHARE", "OF", "NOWAIT", "INTO", "STRICT", 
		"UNION", "INTERSECT", "EXCEPT", "ASC", "DESC", "USING", "NULLS", "FIRST", 
		"NEXT", "LAST", "CAST", "ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", 
		"IN", "OUT", "INOUT", "VARIADIC", "ON", "HAVING", "LANGUAGE", "LANGUAGE_NAME", 
		"EXCEPTION", "DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", 
		"END", "WHEN", "THEN", "WINDOW", "IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", 
		"RETURNS_NULL_ON_NULL_INPUT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", 
		"SECURITY_DEFINER", "COST", "CONSTANT", "COLLATE", "NULL", "TRUE", "FALSE", 
		"UNKNOWN", "F_DOLLAR_QUOTE", "F_QUOTE", "DOLLAR_QUOTE", "'''", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "ID", "QNAME", "ARRAY_TYPE", "COPY_TYPE", "ROW_TYPE", 
		"STRING", "WS", "SL_COMMENT", "ML_COMMENT"
	};
	public static final int
		RULE_selectStmt = 0, RULE_select = 1, RULE_selectList = 2, RULE_distinctClause = 3, 
		RULE_selectSpecific = 4, RULE_selectAll = 5, RULE_intoClause = 6, RULE_limitClause = 7, 
		RULE_offsetClause = 8, RULE_orderByClause = 9, RULE_orderByItem = 10, 
		RULE_orderByUsing = 11, RULE_nullsOrdering = 12, RULE_fromClause = 13, 
		RULE_joinClause = 14, RULE_tableExpression = 15, RULE_join = 16, RULE_columnAlias = 17, 
		RULE_columnAliasItem = 18, RULE_whereClause = 19, RULE_groupByClause = 20, 
		RULE_havingClause = 21, RULE_bulkOperationClause = 22, RULE_condition = 23, 
		RULE_fetchClause = 24, RULE_forClause = 25, RULE_lockedTables = 26, RULE_lockedTable = 27, 
		RULE_varExpr = 28, RULE_functionCallExpr = 29, RULE_numericConstant = 30, 
		RULE_constantOfOtherTypes = 31, RULE_numericalLiteralExpr = 32, RULE_booleanLiteralExpr = 33, 
		RULE_stringLiteralExpr = 34, RULE_expression = 35, RULE_assignOperator = 36;
	public static final String[] ruleNames = {
		"selectStmt", "select", "selectList", "distinctClause", "selectSpecific", 
		"selectAll", "intoClause", "limitClause", "offsetClause", "orderByClause", 
		"orderByItem", "orderByUsing", "nullsOrdering", "fromClause", "joinClause", 
		"tableExpression", "join", "columnAlias", "columnAliasItem", "whereClause", 
		"groupByClause", "havingClause", "bulkOperationClause", "condition", "fetchClause", 
		"forClause", "lockedTables", "lockedTable", "varExpr", "functionCallExpr", 
		"numericConstant", "constantOfOtherTypes", "numericalLiteralExpr", "booleanLiteralExpr", 
		"stringLiteralExpr", "expression", "assignOperator"
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
			setState(74); select();
			setState(75); match(8);
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
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public BulkOperationClauseContext bulkOperationClause() {
			return getRuleContext(BulkOperationClauseContext.class,0);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public FetchClauseContext fetchClause() {
			return getRuleContext(FetchClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public IntoClauseContext intoClause() {
			return getRuleContext(IntoClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(SelectStmtGrammarParser.SELECT, 0); }
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
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
			setState(77); match(SELECT);
			setState(78); selectList();
			setState(116);
			_la = _input.LA(1);
			if (_la==FROM || _la==INTO) {
				{
				setState(80);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(79); intoClause();
					}
				}

				setState(82); fromClause();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JOIN) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << CROSS) | (1L << NATURAL))) != 0)) {
					{
					{
					setState(83); joinClause();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(89); whereClause();
					}
				}

				setState(93);
				_la = _input.LA(1);
				if (_la==GROUP_BY) {
					{
					setState(92); groupByClause();
					}
				}

				setState(96);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(95); havingClause();
					}
				}

				setState(99);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTERSECT) | (1L << EXCEPT))) != 0)) {
					{
					setState(98); bulkOperationClause();
					}
				}

				setState(102);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(101); orderByClause();
					}
					break;
				}
				setState(105);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(104); limitClause();
					}
					break;
				}
				setState(108);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(107); offsetClause();
					}
					break;
				}
				setState(111);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(110); fetchClause();
					}
					break;
				}
				setState(114);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(113); forClause();
					}
					break;
				}
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
			setState(120);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(118); match(ALL);
				}
				break;
			case DISTINCT:
				{
				setState(119); distinctClause();
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
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
			case STRING:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(122); selectAll();
				}
				break;
			case 7:
			case NOT:
			case ADD:
			case SUB:
			case CAST:
			case TRUE:
			case FALSE:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
			case STRING:
				{
				setState(123); selectSpecific();
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
			setState(126); match(DISTINCT);
			setState(127); match(ON);
			setState(128); expression(0);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(129); match(4);
				setState(130); expression(0);
				}
				}
				setState(135);
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
			setState(136); expression(0);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(137); match(4);
				setState(138); expression(0);
				}
				}
				setState(143);
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
			setState(144); match(MUL);
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
		public List<TerminalNode> ID() { return getTokens(SelectStmtGrammarParser.ID); }
		public TerminalNode INTO() { return getToken(SelectStmtGrammarParser.INTO, 0); }
		public TerminalNode STRICT() { return getToken(SelectStmtGrammarParser.STRICT, 0); }
		public TerminalNode ID(int i) {
			return getToken(SelectStmtGrammarParser.ID, i);
		}
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
			setState(146); match(INTO);
			setState(148);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(147); ((IntoClauseContext)_localctx).strict = match(STRICT);
				}
			}

			setState(150); ((IntoClauseContext)_localctx).target = match(ID);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(151); match(4);
				setState(152); ((IntoClauseContext)_localctx).target = match(ID);
				}
				}
				setState(157);
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
			setState(158); match(LIMIT);
			setState(159);
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
			setState(161); match(OFFSET);
			setState(162); ((OffsetClauseContext)_localctx).offset = match(INTEGER_VALUE);
			setState(164);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(163);
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
			setState(166); match(ORDER_BY);
			setState(167); orderByItem();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(168); match(4);
				setState(169); orderByItem();
				}
				}
				setState(174);
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
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new StandardOrderingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175); expression(0);
				setState(177);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(176);
					((StandardOrderingContext)_localctx).ordering = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
						((StandardOrderingContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(180);
				_la = _input.LA(1);
				if (_la==NULLS) {
					{
					setState(179); nullsOrdering();
					}
				}

				}
				break;

			case 2:
				_localctx = new UsingOrderingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182); expression(0);
				setState(183); orderByUsing();
				setState(185);
				_la = _input.LA(1);
				if (_la==NULLS) {
					{
					setState(184); nullsOrdering();
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
			setState(189); match(USING);
			setState(190);
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
			setState(192); match(NULLS);
			setState(193);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(FROM);
			setState(196); tableExpression();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(197); match(4);
				setState(198); tableExpression();
				}
				}
				setState(203);
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

	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode NATURAL() { return getToken(SelectStmtGrammarParser.NATURAL, 0); }
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(204); match(NATURAL);
				}
			}

			setState(207); join();
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
		enterRule(_localctx, 30, RULE_tableExpression);
		int _la;
		try {
			setState(233);
			switch (_input.LA(1)) {
			case ONLY:
			case QNAME:
				_localctx = new FromTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(209); ((FromTableContext)_localctx).only = match(ONLY);
					}
				}

				setState(212); ((FromTableContext)_localctx).tableName = match(QNAME);
				setState(214);
				_la = _input.LA(1);
				if (_la==MUL) {
					{
					setState(213); match(MUL);
					}
				}

				setState(221);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(217);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(216); match(AS);
						}
					}

					setState(219); ((FromTableContext)_localctx).alias = match(ID);
					setState(220); columnAlias();
					}
				}

				}
				break;
			case 7:
				_localctx = new FromSelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223); match(7);
				setState(224); select();
				setState(225); match(3);
				setState(227);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(226); match(AS);
					}
				}

				setState(229); ((FromSelectContext)_localctx).alias = match(ID);
				setState(231);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(230); columnAlias();
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

	public static class JoinContext extends ParserRuleContext {
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
	 
		public JoinContext() { }
		public void copyFrom(JoinContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LeftOuterJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(SelectStmtGrammarParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(SelectStmtGrammarParser.OUTER, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(SelectStmtGrammarParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public TerminalNode LEFT() { return getToken(SelectStmtGrammarParser.LEFT, 0); }
		public LeftOuterJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterLeftOuterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitLeftOuterJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitLeftOuterJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(SelectStmtGrammarParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(SelectStmtGrammarParser.OUTER, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(SelectStmtGrammarParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode FULL() { return getToken(SelectStmtGrammarParser.FULL, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public FullJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterFullJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitFullJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitFullJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullOuterJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(SelectStmtGrammarParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(SelectStmtGrammarParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode FULL() { return getToken(SelectStmtGrammarParser.FULL, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public FullOuterJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterFullOuterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitFullOuterJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitFullOuterJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(SelectStmtGrammarParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(SelectStmtGrammarParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public TerminalNode LEFT() { return getToken(SelectStmtGrammarParser.LEFT, 0); }
		public LeftJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterLeftJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitLeftJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitLeftJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightOuterJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(SelectStmtGrammarParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(SelectStmtGrammarParser.OUTER, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(SelectStmtGrammarParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(SelectStmtGrammarParser.RIGHT, 0); }
		public RightOuterJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterRightOuterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitRightOuterJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitRightOuterJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(SelectStmtGrammarParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(SelectStmtGrammarParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(SelectStmtGrammarParser.RIGHT, 0); }
		public RightJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterRightJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitRightJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitRightJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(SelectStmtGrammarParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(SelectStmtGrammarParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public TerminalNode INNER() { return getToken(SelectStmtGrammarParser.INNER, 0); }
		public InnerJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterInnerJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitInnerJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitInnerJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CrossJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(SelectStmtGrammarParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(SelectStmtGrammarParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(SelectStmtGrammarParser.QNAME, 0); }
		public TerminalNode CROSS() { return getToken(SelectStmtGrammarParser.CROSS, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public CrossJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterCrossJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitCrossJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitCrossJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_join);
		int _la;
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new InnerJoinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(235); match(INNER);
					}
				}

				setState(238); match(JOIN);
				setState(239);
				((InnerJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((InnerJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(240); match(ON);
				setState(241); condition();
				}
				break;

			case 2:
				_localctx = new LeftOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242); match(LEFT);
				setState(243); match(OUTER);
				setState(244); match(JOIN);
				setState(245);
				((LeftOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(246); match(ON);
				setState(247); condition();
				}
				break;

			case 3:
				_localctx = new LeftJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248); match(LEFT);
				setState(249); match(JOIN);
				setState(250);
				((LeftJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(251); match(ON);
				setState(252); condition();
				}
				break;

			case 4:
				_localctx = new RightOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253); match(RIGHT);
				setState(254); match(OUTER);
				setState(255); match(JOIN);
				setState(256);
				((RightOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(257); match(ON);
				setState(258); condition();
				}
				break;

			case 5:
				_localctx = new RightJoinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(259); match(RIGHT);
				setState(260); match(JOIN);
				setState(261);
				((RightJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(262); match(ON);
				setState(263); condition();
				}
				break;

			case 6:
				_localctx = new FullJoinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(264); match(FULL);
				setState(265); match(OUTER);
				setState(266); match(JOIN);
				setState(267);
				((FullJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(268); match(ON);
				setState(269); condition();
				}
				break;

			case 7:
				_localctx = new FullOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(270); match(FULL);
				setState(271); match(JOIN);
				setState(272);
				((FullOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(273); match(ON);
				setState(274); condition();
				}
				break;

			case 8:
				_localctx = new CrossJoinContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(275); match(CROSS);
				setState(276); match(JOIN);
				setState(277);
				((CrossJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((CrossJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(278); match(ON);
				setState(279); condition();
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
		enterRule(_localctx, 34, RULE_columnAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(7);
			setState(283); columnAliasItem();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(284); match(4);
				setState(285); columnAliasItem();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291); match(3);
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
		enterRule(_localctx, 36, RULE_columnAliasItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(ID);
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
		enterRule(_localctx, 38, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(WHERE);
			setState(296); condition();
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
		enterRule(_localctx, 40, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(GROUP_BY);
			setState(299); expression(0);
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
		enterRule(_localctx, 42, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(HAVING);
			setState(302); condition();
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
		enterRule(_localctx, 44, RULE_bulkOperationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			((BulkOperationClauseContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTERSECT) | (1L << EXCEPT))) != 0)) ) {
				((BulkOperationClauseContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(305);
			((BulkOperationClauseContext)_localctx).selectMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
				((BulkOperationClauseContext)_localctx).selectMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(306); select();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 46, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); expression(0);
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
		enterRule(_localctx, 48, RULE_fetchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(FETCH);
			setState(312);
			_la = _input.LA(1);
			if (_la==FIRST || _la==NEXT) {
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(315);
			_la = _input.LA(1);
			if (_la==INTEGER_VALUE) {
				{
				setState(314); ((FetchClauseContext)_localctx).count = match(INTEGER_VALUE);
				}
			}

			setState(318);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(317);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(320); match(ONLY);
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
		enterRule(_localctx, 50, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(FOR);
			setState(323);
			((ForClauseContext)_localctx).lockMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UPDATE || _la==SHARE) ) {
				((ForClauseContext)_localctx).lockMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(325);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(324); lockedTables();
				}
			}

			setState(328);
			_la = _input.LA(1);
			if (_la==NOWAIT) {
				{
				setState(327); ((ForClauseContext)_localctx).nowait = match(NOWAIT);
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
		enterRule(_localctx, 52, RULE_lockedTables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(OF);
			setState(331); lockedTable();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(332); match(4);
				setState(333); lockedTable();
				}
				}
				setState(338);
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
		enterRule(_localctx, 54, RULE_lockedTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(ID);
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

	public static class VarExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(ID);
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
		enterRule(_localctx, 58, RULE_functionCallExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
			setState(344); match(7);
			setState(353);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << NOT) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (CAST - 71)) | (1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (INTEGER_VALUE - 71)) | (1L << (DECIMAL_VALUE - 71)) | (1L << (ID - 71)) | (1L << (QNAME - 71)) | (1L << (ARRAY_TYPE - 71)) | (1L << (COPY_TYPE - 71)) | (1L << (ROW_TYPE - 71)) | (1L << (STRING - 71)))) != 0)) {
				{
				setState(345); expression(0);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(346); match(4);
					setState(347); expression(0);
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(355); match(3);
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
		enterRule(_localctx, 60, RULE_numericConstant);
		int _la;
		try {
			setState(364);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(358); match(5);
				setState(359);
				((NumericConstantContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (ID - 118)) | (1L << (QNAME - 118)) | (1L << (ARRAY_TYPE - 118)) | (1L << (COPY_TYPE - 118)) | (1L << (ROW_TYPE - 118)))) != 0)) ) {
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
				setState(360);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (ID - 118)) | (1L << (QNAME - 118)) | (1L << (ARRAY_TYPE - 118)) | (1L << (COPY_TYPE - 118)) | (1L << (ROW_TYPE - 118)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(361); match(QUOTE);
				setState(362);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(363); match(QUOTE);
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
		enterRule(_localctx, 62, RULE_constantOfOtherTypes);
		int _la;
		try {
			setState(377);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (ID - 118)) | (1L << (QNAME - 118)) | (1L << (ARRAY_TYPE - 118)) | (1L << (COPY_TYPE - 118)) | (1L << (ROW_TYPE - 118)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(367); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(369); match(5);
				setState(370);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (ID - 118)) | (1L << (QNAME - 118)) | (1L << (ARRAY_TYPE - 118)) | (1L << (COPY_TYPE - 118)) | (1L << (ROW_TYPE - 118)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(371); match(CAST);
				setState(372); match(7);
				setState(373); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(374); match(AS);
				setState(375);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (ID - 118)) | (1L << (QNAME - 118)) | (1L << (ARRAY_TYPE - 118)) | (1L << (COPY_TYPE - 118)) | (1L << (ROW_TYPE - 118)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(376); match(3);
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

	public static class NumericalLiteralExprContext extends ParserRuleContext {
		public NumericalLiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalLiteralExpr; }
	 
		public NumericalLiteralExprContext() { }
		public void copyFrom(NumericalLiteralExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericalConstantExpressionContext extends NumericalLiteralExprContext {
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public NumericalConstantExpressionContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterNumericalConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitNumericalConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitNumericalConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalLiteralContext extends NumericalLiteralExprContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SelectStmtGrammarParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumericalLiteralExprContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SelectStmtGrammarParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalLiteralExprContext numericalLiteralExpr() throws RecognitionException {
		NumericalLiteralExprContext _localctx = new NumericalLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numericalLiteralExpr);
		try {
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new NumericalConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379); numericConstant();
				}
				break;

			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380); match(INTEGER_VALUE);
				}
				break;

			case 3:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(381); match(DECIMAL_VALUE);
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

	public static class BooleanLiteralExprContext extends ParserRuleContext {
		public BooleanLiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteralExpr; }
	 
		public BooleanLiteralExprContext() { }
		public void copyFrom(BooleanLiteralExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegateExpressionContext extends BooleanLiteralExprContext {
		public TerminalNode NOT() { return getToken(SelectStmtGrammarParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateExpressionContext(BooleanLiteralExprContext ctx) { copyFrom(ctx); }
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
	public static class BooleanLiteralContext extends BooleanLiteralExprContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(SelectStmtGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SelectStmtGrammarParser.FALSE, 0); }
		public BooleanLiteralContext(BooleanLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralExprContext booleanLiteralExpr() throws RecognitionException {
		BooleanLiteralExprContext _localctx = new BooleanLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_booleanLiteralExpr);
		int _la;
		try {
			setState(387);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384); match(NOT);
				setState(385); expression(0);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				((BooleanLiteralContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanLiteralContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
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

	public static class StringLiteralExprContext extends ParserRuleContext {
		public StringLiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralExpr; }
	 
		public StringLiteralExprContext() { }
		public void copyFrom(StringLiteralExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends StringLiteralExprContext {
		public TerminalNode STRING() { return getToken(SelectStmtGrammarParser.STRING, 0); }
		public StringLiteralContext(StringLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralExprContext stringLiteralExpr() throws RecognitionException {
		StringLiteralExprContext _localctx = new StringLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stringLiteralExpr);
		try {
			_localctx = new StringLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(STRING);
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
	public static class NumericalLiteralExpressionContext extends ExpressionContext {
		public NumericalLiteralExprContext numericalLiteralExpr() {
			return getRuleContext(NumericalLiteralExprContext.class,0);
		}
		public NumericalLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class StringLiteralExpressionContext extends ExpressionContext {
		public StringLiteralExprContext stringLiteralExpr() {
			return getRuleContext(StringLiteralExprContext.class,0);
		}
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
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
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
	public static class BooleanLiteralExpressionContext extends ExpressionContext {
		public BooleanLiteralExprContext booleanLiteralExpr() {
			return getRuleContext(BooleanLiteralExprContext.class,0);
		}
		public BooleanLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterBooleanLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitBooleanLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitBooleanLiteralExpression(this);
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
	public static class SubExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUB() { return getToken(SelectStmtGrammarParser.SUB, 0); }
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token unaryOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(SelectStmtGrammarParser.SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class MulExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(SelectStmtGrammarParser.MUL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class AddExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ADD() { return getToken(SelectStmtGrammarParser.ADD, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class LikeExpressionContext extends ExpressionContext {
		public Token not;
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SelectStmtGrammarParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LIKE() { return getToken(SelectStmtGrammarParser.LIKE, 0); }
		public LikeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterLikeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitLikeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitLikeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(SelectStmtGrammarParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class ExponentiationExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExponentiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class LabelExpressionContext extends ExpressionContext {
		public Token label;
		public TerminalNode AS() { return getToken(SelectStmtGrammarParser.AS, 0); }
		public TerminalNode ID() { return getToken(SelectStmtGrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterLabelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitLabelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitLabelExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext arrayIndexExpr;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(SelectStmtGrammarParser.GTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
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
	public static class SimilarToExpressionContext extends ExpressionContext {
		public Token not;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SIMILAR() { return getToken(SelectStmtGrammarParser.SIMILAR, 0); }
		public TerminalNode NOT() { return getToken(SelectStmtGrammarParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode TO() { return getToken(SelectStmtGrammarParser.TO, 0); }
		public SimilarToExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).enterSimilarToExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SelectStmtGrammarListener ) ((SelectStmtGrammarListener)listener).exitSimilarToExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectStmtGrammarVisitor ) return ((SelectStmtGrammarVisitor<? extends T>)visitor).visitSimilarToExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode MOD() { return getToken(SelectStmtGrammarParser.MOD, 0); }
		public ModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(392); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(393); expression(16);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(395); expression(15);
				}
				break;

			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(396); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(397); match(7);
				setState(398); expression(0);
				setState(399); match(3);
				}
				break;

			case 5:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401); constantOfOtherTypes();
				}
				break;

			case 6:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(402); varExpr();
				}
				break;

			case 7:
				{
				_localctx = new BooleanLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(403); booleanLiteralExpr();
				}
				break;

			case 8:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(404); numericalLiteralExpr();
				}
				break;

			case 9:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(405); stringLiteralExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(475);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(408);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(409); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(410); expression(25);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(411);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(412); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(413); expression(24);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(414);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(415); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(416); expression(23);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(417);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(418); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(419); expression(22);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(420);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(421); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(422); expression(21);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(423);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(424); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(425); expression(20);
						}
						break;

					case 7:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(426);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(427); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(428); expression(15);
						}
						break;

					case 8:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(429);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(430); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(431); expression(14);
						}
						break;

					case 9:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(432);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(433); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(434); expression(13);
						}
						break;

					case 10:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(435);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(436); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(437); expression(12);
						}
						break;

					case 11:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(438);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(439); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(440); expression(11);
						}
						break;

					case 12:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(441);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(442); match(2);
						setState(443); expression(9);
						}
						break;

					case 13:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(444);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(445); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(446); expression(9);
						}
						break;

					case 14:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(447);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(448); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(449); expression(8);
						}
						break;

					case 15:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(450);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(455); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(451); match(6);
								setState(452); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = expression(0);
								setState(453); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(457); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 16:
						{
						_localctx = new LikeExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(459);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(461);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(460); ((LikeExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(463); ((LikeExpressionContext)_localctx).operator = match(LIKE);
						setState(464); expression(0);
						}
						break;

					case 17:
						{
						_localctx = new SimilarToExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(467);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(466); ((SimilarToExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(469); match(SIMILAR);
						setState(470); match(TO);
						setState(471); expression(0);
						}
						break;

					case 18:
						{
						_localctx = new LabelExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(472);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(473); match(AS);
						setState(474); ((LabelExpressionContext)_localctx).label = match(ID);
						}
						break;
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 72, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		case 35: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 24 >= _localctx._p;

		case 1: return 23 >= _localctx._p;

		case 2: return 22 >= _localctx._p;

		case 3: return 21 >= _localctx._p;

		case 4: return 20 >= _localctx._p;

		case 5: return 19 >= _localctx._p;

		case 6: return 14 >= _localctx._p;

		case 7: return 13 >= _localctx._p;

		case 8: return 12 >= _localctx._p;

		case 9: return 11 >= _localctx._p;

		case 10: return 10 >= _localctx._p;

		case 11: return 9 >= _localctx._p;

		case 12: return 8 >= _localctx._p;

		case 13: return 7 >= _localctx._p;

		case 14: return 25 >= _localctx._p;

		case 15: return 18 >= _localctx._p;

		case 17: return 5 >= _localctx._p;

		case 16: return 17 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u0080\u01e5\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\5\3S\n\3\3"+
		"\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\5\3]\n\3\3\3\5\3`\n\3\3\3\5\3c\n\3"+
		"\3\3\5\3f\n\3\3\3\5\3i\n\3\3\3\5\3l\n\3\3\3\5\3o\n\3\3\3\5\3r\n\3\3\3"+
		"\5\3u\n\3\5\3w\n\3\3\4\3\4\5\4{\n\4\3\4\3\4\5\4\177\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5\3\6\3\6\3\6\7\6\u008e\n\6\f\6"+
		"\16\6\u0091\13\6\3\7\3\7\3\b\3\b\5\b\u0097\n\b\3\b\3\b\3\b\7\b\u009c\n"+
		"\b\f\b\16\b\u009f\13\b\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00a7\n\n\3\13\3\13"+
		"\3\13\3\13\7\13\u00ad\n\13\f\13\16\13\u00b0\13\13\3\f\3\f\5\f\u00b4\n"+
		"\f\3\f\5\f\u00b7\n\f\3\f\3\f\3\f\5\f\u00bc\n\f\5\f\u00be\n\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00ca\n\17\f\17\16\17\u00cd"+
		"\13\17\3\20\5\20\u00d0\n\20\3\20\3\20\3\21\5\21\u00d5\n\21\3\21\3\21\5"+
		"\21\u00d9\n\21\3\21\5\21\u00dc\n\21\3\21\3\21\5\21\u00e0\n\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00e6\n\21\3\21\3\21\5\21\u00ea\n\21\5\21\u00ec\n\21\3"+
		"\22\5\22\u00ef\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u011b\n\22\3\23\3\23\3\23\3\23\7\23\u0121\n"+
		"\23\f\23\16\23\u0124\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u013b"+
		"\n\32\3\32\5\32\u013e\n\32\3\32\5\32\u0141\n\32\3\32\3\32\3\33\3\33\3"+
		"\33\5\33\u0148\n\33\3\33\5\33\u014b\n\33\3\34\3\34\3\34\3\34\7\34\u0151"+
		"\n\34\f\34\16\34\u0154\13\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\7\37\u015f\n\37\f\37\16\37\u0162\13\37\5\37\u0164\n\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \5 \u016f\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u017c"+
		"\n!\3\"\3\"\3\"\5\"\u0181\n\"\3#\3#\3#\5#\u0186\n#\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0199\n%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u01ca\n%\r%\16%\u01cb"+
		"\3%\3%\5%\u01d0\n%\3%\3%\3%\3%\5%\u01d6\n%\3%\3%\3%\3%\3%\3%\7%\u01de"+
		"\n%\f%\16%\u01e1\13%\3&\3&\3&\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\20\4\2**vv\3\2\65\66\3\2BC\3\2\35"+
		" \4\2FFHH\3\2xy\3\2?A\3\2*+\3\2FG\3\29:\3\2vw\3\2x|\3\2op\4\2\20\20\33"+
		"\33\u0215\2L\3\2\2\2\4O\3\2\2\2\6z\3\2\2\2\b\u0080\3\2\2\2\n\u008a\3\2"+
		"\2\2\f\u0092\3\2\2\2\16\u0094\3\2\2\2\20\u00a0\3\2\2\2\22\u00a3\3\2\2"+
		"\2\24\u00a8\3\2\2\2\26\u00bd\3\2\2\2\30\u00bf\3\2\2\2\32\u00c2\3\2\2\2"+
		"\34\u00c5\3\2\2\2\36\u00cf\3\2\2\2 \u00eb\3\2\2\2\"\u011a\3\2\2\2$\u011c"+
		"\3\2\2\2&\u0127\3\2\2\2(\u0129\3\2\2\2*\u012c\3\2\2\2,\u012f\3\2\2\2."+
		"\u0132\3\2\2\2\60\u0136\3\2\2\2\62\u0138\3\2\2\2\64\u0144\3\2\2\2\66\u014c"+
		"\3\2\2\28\u0155\3\2\2\2:\u0157\3\2\2\2<\u0159\3\2\2\2>\u016e\3\2\2\2@"+
		"\u017b\3\2\2\2B\u0180\3\2\2\2D\u0185\3\2\2\2F\u0187\3\2\2\2H\u0198\3\2"+
		"\2\2J\u01e2\3\2\2\2LM\5\4\3\2MN\7\n\2\2N\3\3\2\2\2OP\7)\2\2Pv\5\6\4\2"+
		"QS\5\16\b\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TX\5\34\17\2UW\5\36\20\2VU\3"+
		"\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[]\5(\25\2\\"+
		"[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\5*\26\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2"+
		"ac\5,\27\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5.\30\2ed\3\2\2\2ef\3\2\2\2"+
		"fh\3\2\2\2gi\5\24\13\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\5\20\t\2kj\3\2"+
		"\2\2kl\3\2\2\2ln\3\2\2\2mo\5\22\n\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\5"+
		"\62\32\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5\64\33\2ts\3\2\2\2tu\3\2\2\2"+
		"uw\3\2\2\2vR\3\2\2\2vw\3\2\2\2w\5\3\2\2\2x{\7*\2\2y{\5\b\5\2zx\3\2\2\2"+
		"zy\3\2\2\2z{\3\2\2\2{~\3\2\2\2|\177\5\f\7\2}\177\5\n\6\2~|\3\2\2\2~}\3"+
		"\2\2\2\177\7\3\2\2\2\u0080\u0081\7+\2\2\u0081\u0082\7S\2\2\u0082\u0087"+
		"\5H%\2\u0083\u0084\7\6\2\2\u0084\u0086\5H%\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\t\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u008a\u008f\5H%\2\u008b\u008c\7\6\2\2\u008c\u008e"+
		"\5H%\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\13\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\26\2"+
		"\2\u0093\r\3\2\2\2\u0094\u0096\7=\2\2\u0095\u0097\7>\2\2\u0096\u0095\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009d\7x\2\2\u0099"+
		"\u009a\7\6\2\2\u009a\u009c\7x\2\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\17\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a1\7\63\2\2\u00a1\u00a2\t\2\2\2\u00a2\21\3\2\2\2\u00a3"+
		"\u00a4\7\64\2\2\u00a4\u00a6\7v\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\23\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00ae"+
		"\5\26\f\2\u00aa\u00ab\7\6\2\2\u00ab\u00ad\5\26\f\2\u00ac\u00aa\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\25"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\5H%\2\u00b2\u00b4\t\4\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\5\32"+
		"\16\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00be\3\2\2\2\u00b8"+
		"\u00b9\5H%\2\u00b9\u00bb\5\30\r\2\u00ba\u00bc\5\32\16\2\u00bb\u00ba\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd"+
		"\u00b8\3\2\2\2\u00be\27\3\2\2\2\u00bf\u00c0\7D\2\2\u00c0\u00c1\t\5\2\2"+
		"\u00c1\31\3\2\2\2\u00c2\u00c3\7E\2\2\u00c3\u00c4\t\6\2\2\u00c4\33\3\2"+
		"\2\2\u00c5\u00c6\7,\2\2\u00c6\u00cb\5 \21\2\u00c7\u00c8\7\6\2\2\u00c8"+
		"\u00ca\5 \21\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\35\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0"+
		"\7(\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\5\"\22\2\u00d2\37\3\2\2\2\u00d3\u00d5\78\2\2\u00d4\u00d3\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7y\2\2\u00d7\u00d9"+
		"\7\26\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00df\3\2\2\2"+
		"\u00da\u00dc\7[\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\7x\2\2\u00de\u00e0\5$\23\2\u00df\u00db\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00ec\3\2\2\2\u00e1\u00e2\7\t\2\2\u00e2\u00e3\5\4"+
		"\3\2\u00e3\u00e5\7\5\2\2\u00e4\u00e6\7[\2\2\u00e5\u00e4\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7x\2\2\u00e8\u00ea\5$\23"+
		"\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00d4"+
		"\3\2\2\2\u00eb\u00e1\3\2\2\2\u00ec!\3\2\2\2\u00ed\u00ef\7\"\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7!"+
		"\2\2\u00f1\u00f2\t\7\2\2\u00f2\u00f3\7S\2\2\u00f3\u011b\5\60\31\2\u00f4"+
		"\u00f5\7#\2\2\u00f5\u00f6\7\'\2\2\u00f6\u00f7\7!\2\2\u00f7\u00f8\t\7\2"+
		"\2\u00f8\u00f9\7S\2\2\u00f9\u011b\5\60\31\2\u00fa\u00fb\7#\2\2\u00fb\u00fc"+
		"\7!\2\2\u00fc\u00fd\t\7\2\2\u00fd\u00fe\7S\2\2\u00fe\u011b\5\60\31\2\u00ff"+
		"\u0100\7$\2\2\u0100\u0101\7\'\2\2\u0101\u0102\7!\2\2\u0102\u0103\t\7\2"+
		"\2\u0103\u0104\7S\2\2\u0104\u011b\5\60\31\2\u0105\u0106\7$\2\2\u0106\u0107"+
		"\7!\2\2\u0107\u0108\t\7\2\2\u0108\u0109\7S\2\2\u0109\u011b\5\60\31\2\u010a"+
		"\u010b\7%\2\2\u010b\u010c\7\'\2\2\u010c\u010d\7!\2\2\u010d\u010e\t\7\2"+
		"\2\u010e\u010f\7S\2\2\u010f\u011b\5\60\31\2\u0110\u0111\7%\2\2\u0111\u0112"+
		"\7!\2\2\u0112\u0113\t\7\2\2\u0113\u0114\7S\2\2\u0114\u011b\5\60\31\2\u0115"+
		"\u0116\7&\2\2\u0116\u0117\7!\2\2\u0117\u0118\t\7\2\2\u0118\u0119\7S\2"+
		"\2\u0119\u011b\5\60\31\2\u011a\u00ee\3\2\2\2\u011a\u00f4\3\2\2\2\u011a"+
		"\u00fa\3\2\2\2\u011a\u00ff\3\2\2\2\u011a\u0105\3\2\2\2\u011a\u010a\3\2"+
		"\2\2\u011a\u0110\3\2\2\2\u011a\u0115\3\2\2\2\u011b#\3\2\2\2\u011c\u011d"+
		"\7\t\2\2\u011d\u0122\5&\24\2\u011e\u011f\7\6\2\2\u011f\u0121\5&\24\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\5\2\2\u0126"+
		"%\3\2\2\2\u0127\u0128\7x\2\2\u0128\'\3\2\2\2\u0129\u012a\7-\2\2\u012a"+
		"\u012b\5\60\31\2\u012b)\3\2\2\2\u012c\u012d\7.\2\2\u012d\u012e\5H%\2\u012e"+
		"+\3\2\2\2\u012f\u0130\7T\2\2\u0130\u0131\5\60\31\2\u0131-\3\2\2\2\u0132"+
		"\u0133\t\b\2\2\u0133\u0134\t\t\2\2\u0134\u0135\5\4\3\2\u0135/\3\2\2\2"+
		"\u0136\u0137\5H%\2\u0137\61\3\2\2\2\u0138\u013a\7\67\2\2\u0139\u013b\t"+
		"\n\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013e\7v\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2"+
		"\2\2\u013f\u0141\t\3\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\78\2\2\u0143\63\3\2\2\2\u0144\u0145\7K\2\2"+
		"\u0145\u0147\t\13\2\2\u0146\u0148\5\66\34\2\u0147\u0146\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\7<\2\2\u014a\u0149\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\65\3\2\2\2\u014c\u014d\7;\2\2\u014d\u0152"+
		"\58\35\2\u014e\u014f\7\6\2\2\u014f\u0151\58\35\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\67\3\2\2"+
		"\2\u0154\u0152\3\2\2\2\u0155\u0156\7x\2\2\u01569\3\2\2\2\u0157\u0158\7"+
		"x\2\2\u0158;\3\2\2\2\u0159\u015a\7x\2\2\u015a\u0163\7\t\2\2\u015b\u0160"+
		"\5H%\2\u015c\u015d\7\6\2\2\u015d\u015f\5H%\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\7\5\2\2\u0166=\3\2\2\2\u0167\u0168\t\f\2\2"+
		"\u0168\u0169\7\7\2\2\u0169\u016f\t\r\2\2\u016a\u016b\t\r\2\2\u016b\u016c"+
		"\7u\2\2\u016c\u016d\t\f\2\2\u016d\u016f\7u\2\2\u016e\u0167\3\2\2\2\u016e"+
		"\u016a\3\2\2\2\u016f?\3\2\2\2\u0170\u0171\t\r\2\2\u0171\u017c\7}\2\2\u0172"+
		"\u0173\7}\2\2\u0173\u0174\7\7\2\2\u0174\u017c\t\r\2\2\u0175\u0176\7I\2"+
		"\2\u0176\u0177\7\t\2\2\u0177\u0178\7}\2\2\u0178\u0179\7[\2\2\u0179\u017a"+
		"\t\r\2\2\u017a\u017c\7\5\2\2\u017b\u0170\3\2\2\2\u017b\u0172\3\2\2\2\u017b"+
		"\u0175\3\2\2\2\u017cA\3\2\2\2\u017d\u0181\5> \2\u017e\u0181\7v\2\2\u017f"+
		"\u0181\7w\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2"+
		"\2\2\u0181C\3\2\2\2\u0182\u0183\7\23\2\2\u0183\u0186\5H%\2\u0184\u0186"+
		"\t\16\2\2\u0185\u0182\3\2\2\2\u0185\u0184\3\2\2\2\u0186E\3\2\2\2\u0187"+
		"\u0188\7}\2\2\u0188G\3\2\2\2\u0189\u018a\b%\1\2\u018a\u018b\7\31\2\2\u018b"+
		"\u0199\5H%\2\u018c\u018d\7\32\2\2\u018d\u0199\5H%\2\u018e\u0199\5<\37"+
		"\2\u018f\u0190\7\t\2\2\u0190\u0191\5H%\2\u0191\u0192\7\5\2\2\u0192\u0199"+
		"\3\2\2\2\u0193\u0199\5@!\2\u0194\u0199\5:\36\2\u0195\u0199\5D#\2\u0196"+
		"\u0199\5B\"\2\u0197\u0199\5F$\2\u0198\u0189\3\2\2\2\u0198\u018c\3\2\2"+
		"\2\u0198\u018e\3\2\2\2\u0198\u018f\3\2\2\2\u0198\u0193\3\2\2\2\u0198\u0194"+
		"\3\2\2\2\u0198\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199"+
		"\u01df\3\2\2\2\u019a\u019b\6%\2\3\u019b\u019c\7\33\2\2\u019c\u01de\5H"+
		"%\2\u019d\u019e\6%\3\3\u019e\u019f\7\34\2\2\u019f\u01de\5H%\2\u01a0\u01a1"+
		"\6%\4\3\u01a1\u01a2\7\35\2\2\u01a2\u01de\5H%\2\u01a3\u01a4\6%\5\3\u01a4"+
		"\u01a5\7\36\2\2\u01a5\u01de\5H%\2\u01a6\u01a7\6%\6\3\u01a7\u01a8\7\37"+
		"\2\2\u01a8\u01de\5H%\2\u01a9\u01aa\6%\7\3\u01aa\u01ab\7 \2\2\u01ab\u01de"+
		"\5H%\2\u01ac\u01ad\6%\b\3\u01ad\u01ae\7\26\2\2\u01ae\u01de\5H%\2\u01af"+
		"\u01b0\6%\t\3\u01b0\u01b1\7\27\2\2\u01b1\u01de\5H%\2\u01b2\u01b3\6%\n"+
		"\3\u01b3\u01b4\7\30\2\2\u01b4\u01de\5H%\2\u01b5\u01b6\6%\13\3\u01b6\u01b7"+
		"\7\31\2\2\u01b7\u01de\5H%\2\u01b8\u01b9\6%\f\3\u01b9\u01ba\7\32\2\2\u01ba"+
		"\u01de\5H%\2\u01bb\u01bc\6%\r\3\u01bc\u01bd\7\4\2\2\u01bd\u01de\5H%\2"+
		"\u01be\u01bf\6%\16\3\u01bf\u01c0\7\16\2\2\u01c0\u01de\5H%\2\u01c1\u01c2"+
		"\6%\17\3\u01c2\u01c3\7\17\2\2\u01c3\u01de\5H%\2\u01c4\u01c9\6%\20\3\u01c5"+
		"\u01c6\7\b\2\2\u01c6\u01c7\5H%\2\u01c7\u01c8\7\3\2\2\u01c8\u01ca\3\2\2"+
		"\2\u01c9\u01c5\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01de\3\2\2\2\u01cd\u01cf\6%\21\3\u01ce\u01d0\7\23\2\2"+
		"\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2"+
		"\7\13\2\2\u01d2\u01de\5H%\2\u01d3\u01d5\6%\22\3\u01d4\u01d6\7\23\2\2\u01d5"+
		"\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7\f"+
		"\2\2\u01d8\u01d9\7\r\2\2\u01d9\u01de\5H%\2\u01da\u01db\6%\23\3\u01db\u01dc"+
		"\7[\2\2\u01dc\u01de\7x\2\2\u01dd\u019a\3\2\2\2\u01dd\u019d\3\2\2\2\u01dd"+
		"\u01a0\3\2\2\2\u01dd\u01a3\3\2\2\2\u01dd\u01a6\3\2\2\2\u01dd\u01a9\3\2"+
		"\2\2\u01dd\u01ac\3\2\2\2\u01dd\u01af\3\2\2\2\u01dd\u01b2\3\2\2\2\u01dd"+
		"\u01b5\3\2\2\2\u01dd\u01b8\3\2\2\2\u01dd\u01bb\3\2\2\2\u01dd\u01be\3\2"+
		"\2\2\u01dd\u01c1\3\2\2\2\u01dd\u01c4\3\2\2\2\u01dd\u01cd\3\2\2\2\u01dd"+
		"\u01d3\3\2\2\2\u01dd\u01da\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0I\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3"+
		"\t\17\2\2\u01e3K\3\2\2\28RX\\_behknqtvz~\u0087\u008f\u0096\u009d\u00a6"+
		"\u00ae\u00b3\u00b6\u00bb\u00bd\u00cb\u00cf\u00d4\u00d8\u00db\u00df\u00e5"+
		"\u00e9\u00eb\u00ee\u011a\u0122\u013a\u013d\u0140\u0147\u014a\u0152\u0160"+
		"\u0163\u016e\u017b\u0180\u0185\u0198\u01cb\u01cf\u01d5\u01dd\u01df";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}