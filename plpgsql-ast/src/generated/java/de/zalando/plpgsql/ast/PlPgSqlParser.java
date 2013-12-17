// Generated from de/zalando/plpgsql/ast/PlPgSql.g4 by ANTLR 4.1
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
public class PlPgSqlParser extends Parser {
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
		RULE_unit = 0, RULE_plFunction = 1, RULE_functionArgsList = 2, RULE_functionArg = 3, 
		RULE_functionReturns = 4, RULE_functionBody = 5, RULE_blockStmt = 6, RULE_functionSettings = 7, 
		RULE_functionBehavior = 8, RULE_window = 9, RULE_functionInputHandling = 10, 
		RULE_functionSecurity = 11, RULE_functionCosts = 12, RULE_functionRows = 13, 
		RULE_varDeclarationList = 14, RULE_varDeclaration = 15, RULE_aliasDeclaration = 16, 
		RULE_stmts = 17, RULE_stmt = 18, RULE_assignStmt = 19, RULE_selectStmt = 20, 
		RULE_select = 21, RULE_selectList = 22, RULE_distinctClause = 23, RULE_selectSpecific = 24, 
		RULE_selectAll = 25, RULE_intoClause = 26, RULE_limitClause = 27, RULE_offsetClause = 28, 
		RULE_orderByClause = 29, RULE_orderByItem = 30, RULE_orderByUsing = 31, 
		RULE_nullsOrdering = 32, RULE_fromClause = 33, RULE_tableExpression = 34, 
		RULE_columnAlias = 35, RULE_columnAliasItem = 36, RULE_whereClause = 37, 
		RULE_groupByClause = 38, RULE_havingClause = 39, RULE_bulkOperationClause = 40, 
		RULE_condition = 41, RULE_fetchClause = 42, RULE_forClause = 43, RULE_lockedTables = 44, 
		RULE_lockedTable = 45, RULE_functionCallExpr = 46, RULE_numericConstant = 47, 
		RULE_constantOfOtherTypes = 48, RULE_numericalExpr = 49, RULE_booleanExpr = 50, 
		RULE_expression = 51, RULE_assignOperator = 52;
	public static final String[] ruleNames = {
		"unit", "plFunction", "functionArgsList", "functionArg", "functionReturns", 
		"functionBody", "blockStmt", "functionSettings", "functionBehavior", "window", 
		"functionInputHandling", "functionSecurity", "functionCosts", "functionRows", 
		"varDeclarationList", "varDeclaration", "aliasDeclaration", "stmts", "stmt", 
		"assignStmt", "selectStmt", "select", "selectList", "distinctClause", 
		"selectSpecific", "selectAll", "intoClause", "limitClause", "offsetClause", 
		"orderByClause", "orderByItem", "orderByUsing", "nullsOrdering", "fromClause", 
		"tableExpression", "columnAlias", "columnAliasItem", "whereClause", "groupByClause", 
		"havingClause", "bulkOperationClause", "condition", "fetchClause", "forClause", 
		"lockedTables", "lockedTable", "functionCallExpr", "numericConstant", 
		"constantOfOtherTypes", "numericalExpr", "booleanExpr", "expression", 
		"assignOperator"
	};

	@Override
	public String getGrammarFileName() { return "PlPgSql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlPgSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UnitContext extends ParserRuleContext {
		public List<PlFunctionContext> plFunction() {
			return getRuleContexts(PlFunctionContext.class);
		}
		public PlFunctionContext plFunction(int i) {
			return getRuleContext(PlFunctionContext.class,i);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106); plFunction();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CREATE );
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

	public static class PlFunctionContext extends ParserRuleContext {
		public Token functionName;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode CREATE() { return getToken(PlPgSqlParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(PlPgSqlParser.OR, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(PlPgSqlParser.FUNCTION, 0); }
		public TerminalNode REPLACE() { return getToken(PlPgSqlParser.REPLACE, 0); }
		public TerminalNode LANGUAGE_NAME() { return getToken(PlPgSqlParser.LANGUAGE_NAME, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode LANGUAGE() { return getToken(PlPgSqlParser.LANGUAGE, 0); }
		public FunctionReturnsContext functionReturns() {
			return getRuleContext(FunctionReturnsContext.class,0);
		}
		public FunctionArgsListContext functionArgsList() {
			return getRuleContext(FunctionArgsListContext.class,0);
		}
		public FunctionSettingsContext functionSettings() {
			return getRuleContext(FunctionSettingsContext.class,0);
		}
		public PlFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterPlFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitPlFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitPlFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlFunctionContext plFunction() throws RecognitionException {
		PlFunctionContext _localctx = new PlFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_plFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(CREATE);
			setState(114);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(112); match(OR);
				setState(113); match(REPLACE);
				}
			}

			setState(116); match(FUNCTION);
			setState(117); ((PlFunctionContext)_localctx).functionName = match(ID);
			setState(118); match(7);
			setState(119); functionArgsList();
			setState(120); match(3);
			setState(121); functionReturns();
			setState(122); match(AS);
			setState(123); functionBody();
			setState(124); match(LANGUAGE);
			setState(125); match(LANGUAGE_NAME);
			setState(127);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(126); functionSettings();
				}
			}

			setState(129); match(8);
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

	public static class FunctionArgsListContext extends ParserRuleContext {
		public List<FunctionArgContext> functionArg() {
			return getRuleContexts(FunctionArgContext.class);
		}
		public FunctionArgContext functionArg(int i) {
			return getRuleContext(FunctionArgContext.class,i);
		}
		public FunctionArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsListContext functionArgsList() throws RecognitionException {
		FunctionArgsListContext _localctx = new FunctionArgsListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionArgsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (IN - 70)) | (1L << (OUT - 70)) | (1L << (INOUT - 70)) | (1L << (VARIADIC - 70)) | (1L << (ID - 70)))) != 0)) {
				{
				setState(131); functionArg();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(132); match(4);
					setState(133); functionArg();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class FunctionArgContext extends ParserRuleContext {
		public Token argMode;
		public Token argName;
		public Token type;
		public Token initOperator;
		public TerminalNode IN() { return getToken(PlPgSqlParser.IN, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(PlPgSqlParser.ARRAY_TYPE, 0); }
		public TerminalNode DEFAULT() { return getToken(PlPgSqlParser.DEFAULT, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode OUT() { return getToken(PlPgSqlParser.OUT, 0); }
		public TerminalNode VARIADIC() { return getToken(PlPgSqlParser.VARIADIC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INOUT() { return getToken(PlPgSqlParser.INOUT, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(PlPgSqlParser.ASSIGN_OP, 0); }
		public TerminalNode EQ() { return getToken(PlPgSqlParser.EQ, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (IN - 70)) | (1L << (OUT - 70)) | (1L << (INOUT - 70)) | (1L << (VARIADIC - 70)))) != 0)) {
				{
				setState(141);
				((FunctionArgContext)_localctx).argMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (IN - 70)) | (1L << (OUT - 70)) | (1L << (INOUT - 70)) | (1L << (VARIADIC - 70)))) != 0)) ) {
					((FunctionArgContext)_localctx).argMode = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(144); ((FunctionArgContext)_localctx).argName = match(ID);
			setState(145);
			((FunctionArgContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)))) != 0)) ) {
				((FunctionArgContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(148);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (ASSIGN_OP - 15)) | (1L << (EQ - 15)) | (1L << (DEFAULT - 15)))) != 0)) {
				{
				setState(146);
				((FunctionArgContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (ASSIGN_OP - 15)) | (1L << (EQ - 15)) | (1L << (DEFAULT - 15)))) != 0)) ) {
					((FunctionArgContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(147); expression(0);
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

	public static class FunctionReturnsContext extends ParserRuleContext {
		public Token type;
		public Token outName;
		public List<TerminalNode> ARRAY_TYPE() { return getTokens(PlPgSqlParser.ARRAY_TYPE); }
		public TerminalNode QNAME(int i) {
			return getToken(PlPgSqlParser.QNAME, i);
		}
		public TerminalNode ROW_TYPE(int i) {
			return getToken(PlPgSqlParser.ROW_TYPE, i);
		}
		public List<TerminalNode> COPY_TYPE() { return getTokens(PlPgSqlParser.COPY_TYPE); }
		public List<TerminalNode> QNAME() { return getTokens(PlPgSqlParser.QNAME); }
		public List<TerminalNode> ROW_TYPE() { return getTokens(PlPgSqlParser.ROW_TYPE); }
		public TerminalNode COPY_TYPE(int i) {
			return getToken(PlPgSqlParser.COPY_TYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ARRAY_TYPE(int i) {
			return getToken(PlPgSqlParser.ARRAY_TYPE, i);
		}
		public TerminalNode RETURNS() { return getToken(PlPgSqlParser.RETURNS, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public FunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnsContext functionReturns() throws RecognitionException {
		FunctionReturnsContext _localctx = new FunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionReturns);
		int _la;
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); match(RETURNS);
				setState(151);
				((FunctionReturnsContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); match(RETURNS);
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					((FunctionReturnsContext)_localctx).type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
						((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(154); ((FunctionReturnsContext)_localctx).outName = match(ID);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0) );
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode QUOTE(int i) {
			return getToken(PlPgSqlParser.QUOTE, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(PlPgSqlParser.QUOTE); }
		public List<TerminalNode> DOLLAR_QUOTE() { return getTokens(PlPgSqlParser.DOLLAR_QUOTE); }
		public TerminalNode DOLLAR_QUOTE(int i) {
			return getToken(PlPgSqlParser.DOLLAR_QUOTE, i);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionBody);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case DOLLAR_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); match(DOLLAR_QUOTE);
				setState(162); blockStmt();
				setState(163); match(DOLLAR_QUOTE);
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); match(QUOTE);
				setState(166); blockStmt();
				setState(167); match(QUOTE);
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

	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode DECLARE(int i) {
			return getToken(PlPgSqlParser.DECLARE, i);
		}
		public VarDeclarationListContext varDeclarationList(int i) {
			return getRuleContext(VarDeclarationListContext.class,i);
		}
		public List<TerminalNode> DECLARE() { return getTokens(PlPgSqlParser.DECLARE); }
		public List<VarDeclarationListContext> varDeclarationList() {
			return getRuleContexts(VarDeclarationListContext.class);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(PlPgSqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE) {
				{
				{
				setState(171); match(DECLARE);
				setState(172); varDeclarationList();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178); match(BEGIN);
			setState(179); stmts();
			setState(180); match(END);
			setState(181); match(8);
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

	public static class FunctionSettingsContext extends ParserRuleContext {
		public FunctionInputHandlingContext functionInputHandling() {
			return getRuleContext(FunctionInputHandlingContext.class,0);
		}
		public WindowContext window() {
			return getRuleContext(WindowContext.class,0);
		}
		public FunctionRowsContext functionRows() {
			return getRuleContext(FunctionRowsContext.class,0);
		}
		public FunctionSecurityContext functionSecurity() {
			return getRuleContext(FunctionSecurityContext.class,0);
		}
		public FunctionCostsContext functionCosts() {
			return getRuleContext(FunctionCostsContext.class,0);
		}
		public FunctionBehaviorContext functionBehavior() {
			return getRuleContext(FunctionBehaviorContext.class,0);
		}
		public FunctionSettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSettings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionSettings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionSettings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionSettings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSettingsContext functionSettings() throws RecognitionException {
		FunctionSettingsContext _localctx = new FunctionSettingsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionSettings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); window();
			setState(184); functionBehavior();
			setState(185); functionInputHandling();
			setState(186); functionSecurity();
			setState(187); functionCosts();
			setState(188); functionRows();
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

	public static class FunctionBehaviorContext extends ParserRuleContext {
		public TerminalNode STABLE() { return getToken(PlPgSqlParser.STABLE, 0); }
		public TerminalNode VOLATILE() { return getToken(PlPgSqlParser.VOLATILE, 0); }
		public TerminalNode IMMUTABLE() { return getToken(PlPgSqlParser.IMMUTABLE, 0); }
		public FunctionBehaviorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBehavior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionBehavior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionBehavior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionBehavior(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBehaviorContext functionBehavior() throws RecognitionException {
		FunctionBehaviorContext _localctx = new FunctionBehaviorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBehavior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (IMMUTABLE - 86)) | (1L << (STABLE - 86)) | (1L << (VOLATILE - 86)))) != 0)) ) {
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

	public static class WindowContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(PlPgSqlParser.WINDOW, 0); }
		public WindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowContext window() throws RecognitionException {
		WindowContext _localctx = new WindowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_window);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(WINDOW);
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

	public static class FunctionInputHandlingContext extends ParserRuleContext {
		public TerminalNode CALLED_ON_NULL_INPUT() { return getToken(PlPgSqlParser.CALLED_ON_NULL_INPUT, 0); }
		public TerminalNode RETURNS_NULL_ON_NULL_INPUT() { return getToken(PlPgSqlParser.RETURNS_NULL_ON_NULL_INPUT, 0); }
		public TerminalNode STRICT() { return getToken(PlPgSqlParser.STRICT, 0); }
		public FunctionInputHandlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInputHandling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionInputHandling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionInputHandling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionInputHandling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInputHandlingContext functionInputHandling() throws RecognitionException {
		FunctionInputHandlingContext _localctx = new FunctionInputHandlingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionInputHandling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (STRICT - 53)) | (1L << (CALLED_ON_NULL_INPUT - 53)) | (1L << (RETURNS_NULL_ON_NULL_INPUT - 53)))) != 0)) ) {
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

	public static class FunctionSecurityContext extends ParserRuleContext {
		public TerminalNode SECURITY_DEFINER() { return getToken(PlPgSqlParser.SECURITY_DEFINER, 0); }
		public TerminalNode SECURITY_INVOKER() { return getToken(PlPgSqlParser.SECURITY_INVOKER, 0); }
		public FunctionSecurityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSecurity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionSecurity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionSecurity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionSecurity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSecurityContext functionSecurity() throws RecognitionException {
		FunctionSecurityContext _localctx = new FunctionSecurityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionSecurity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==SECURITY_INVOKER || _la==SECURITY_DEFINER) ) {
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

	public static class FunctionCostsContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode COST() { return getToken(PlPgSqlParser.COST, 0); }
		public FunctionCostsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCosts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionCosts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionCosts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionCosts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCostsContext functionCosts() throws RecognitionException {
		FunctionCostsContext _localctx = new FunctionCostsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCosts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(COST);
			setState(199); ((FunctionCostsContext)_localctx).value = match(INTEGER_VALUE);
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

	public static class FunctionRowsContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode ROWS() { return getToken(PlPgSqlParser.ROWS, 0); }
		public FunctionRowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionRows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionRows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionRowsContext functionRows() throws RecognitionException {
		FunctionRowsContext _localctx = new FunctionRowsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionRows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(ROWS);
			setState(202); ((FunctionRowsContext)_localctx).value = match(INTEGER_VALUE);
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

	public static class VarDeclarationListContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public AliasDeclarationContext aliasDeclaration(int i) {
			return getRuleContext(AliasDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<AliasDeclarationContext> aliasDeclaration() {
			return getRuleContexts(AliasDeclarationContext.class);
		}
		public VarDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterVarDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitVarDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitVarDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationListContext varDeclarationList() throws RecognitionException {
		VarDeclarationListContext _localctx = new VarDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(206);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(204); varDeclaration();
					}
					break;

				case 2:
					{
					setState(205); aliasDeclaration();
					}
					break;
				}
				}
				setState(210);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public Token varName;
		public Token type;
		public Token collationName;
		public Token initOperator;
		public TerminalNode ARRAY_TYPE() { return getToken(PlPgSqlParser.ARRAY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ROW_TYPE() { return getToken(PlPgSqlParser.ROW_TYPE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PlPgSqlParser.EQ, 0); }
		public TerminalNode CONSTANT() { return getToken(PlPgSqlParser.CONSTANT, 0); }
		public TerminalNode DEFAULT() { return getToken(PlPgSqlParser.DEFAULT, 0); }
		public TerminalNode COPY_TYPE() { return getToken(PlPgSqlParser.COPY_TYPE, 0); }
		public TerminalNode COLLATE() { return getToken(PlPgSqlParser.COLLATE, 0); }
		public TerminalNode NOT() { return getToken(PlPgSqlParser.NOT, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(PlPgSqlParser.ASSIGN_OP, 0); }
		public TerminalNode NULL() { return getToken(PlPgSqlParser.NULL, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); ((VarDeclarationContext)_localctx).varName = match(ID);
			setState(213);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(212); match(CONSTANT);
				}
			}

			setState(215);
			((VarDeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
				((VarDeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(218);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(216); match(COLLATE);
				setState(217); ((VarDeclarationContext)_localctx).collationName = match(ID);
				}
			}

			setState(222);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(220); match(NOT);
				setState(221); match(NULL);
				}
			}

			setState(226);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (ASSIGN_OP - 15)) | (1L << (EQ - 15)) | (1L << (DEFAULT - 15)))) != 0)) {
				{
				setState(224);
				((VarDeclarationContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (ASSIGN_OP - 15)) | (1L << (EQ - 15)) | (1L << (DEFAULT - 15)))) != 0)) ) {
					((VarDeclarationContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(225); expression(0);
				}
			}

			setState(228); match(8);
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

	public static class AliasDeclarationContext extends ParserRuleContext {
		public Token newVarName;
		public Token oldVarName;
		public TerminalNode FOR() { return getToken(PlPgSqlParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ALIAS() { return getToken(PlPgSqlParser.ALIAS, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public AliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterAliasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitAliasDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitAliasDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasDeclarationContext aliasDeclaration() throws RecognitionException {
		AliasDeclarationContext _localctx = new AliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aliasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); ((AliasDeclarationContext)_localctx).newVarName = match(ID);
			setState(231); match(ALIAS);
			setState(232); match(FOR);
			setState(233); ((AliasDeclarationContext)_localctx).oldVarName = match(ID);
			setState(234); match(8);
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
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << NOT) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAST - 64)) | (1L << (DECLARE - 64)) | (1L << (BEGIN - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (STRING - 64)) | (1L << (INTEGER_VALUE - 64)) | (1L << (DECIMAL_VALUE - 64)) | (1L << (ID - 64)) | (1L << (QNAME - 64)) | (1L << (ARRAY_TYPE - 64)) | (1L << (COPY_TYPE - 64)) | (1L << (ROW_TYPE - 64)))) != 0)) {
				{
				{
				setState(236); stmt();
				}
				}
				setState(241);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case DECLARE:
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); blockStmt();
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
				enterOuterAlt(_localctx, 2);
				{
				setState(243); assignStmt();
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

	public static class AssignStmtContext extends ParserRuleContext {
		public ExpressionContext receiver;
		public ExpressionContext value;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); ((AssignStmtContext)_localctx).receiver = expression(0);
			setState(247); assignOperator();
			setState(248); ((AssignStmtContext)_localctx).value = expression(0);
			setState(249); match(8);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); select();
			setState(252); match(8);
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
		public TerminalNode SELECT() { return getToken(PlPgSqlParser.SELECT, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(SELECT);
			setState(255); selectList();
			setState(257);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(256); fromClause();
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
		public TerminalNode ALL() { return getToken(PlPgSqlParser.ALL, 0); }
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(259); match(ALL);
				}
				break;
			case DISTINCT:
				{
				setState(260); distinctClause();
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
			setState(265);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(263); selectAll();
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
				setState(264); selectSpecific();
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
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode DISTINCT() { return getToken(PlPgSqlParser.DISTINCT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DistinctClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterDistinctClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitDistinctClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitDistinctClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctClauseContext distinctClause() throws RecognitionException {
		DistinctClauseContext _localctx = new DistinctClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_distinctClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(DISTINCT);
			setState(268); match(ON);
			setState(269); expression(0);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(270); match(4);
				setState(271); expression(0);
				}
				}
				setState(276);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelectSpecific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelectSpecific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelectSpecific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSpecificContext selectSpecific() throws RecognitionException {
		SelectSpecificContext _localctx = new SelectSpecificContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selectSpecific);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); expression(0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(278); match(4);
				setState(279); expression(0);
				}
				}
				setState(284);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectAllContext selectAll() throws RecognitionException {
		SelectAllContext _localctx = new SelectAllContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selectAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(MUL);
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
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode INTO() { return getToken(PlPgSqlParser.INTO, 0); }
		public TerminalNode STRICT() { return getToken(PlPgSqlParser.STRICT, 0); }
		public IntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterIntoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitIntoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoClauseContext intoClause() throws RecognitionException {
		IntoClauseContext _localctx = new IntoClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(INTO);
			setState(289);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(288); ((IntoClauseContext)_localctx).strict = match(STRICT);
				}
			}

			setState(291); ((IntoClauseContext)_localctx).target = match(ID);
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
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode LIMIT() { return getToken(PlPgSqlParser.LIMIT, 0); }
		public TerminalNode ALL() { return getToken(PlPgSqlParser.ALL, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(LIMIT);
			setState(294);
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
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode OFFSET() { return getToken(PlPgSqlParser.OFFSET, 0); }
		public TerminalNode ROW() { return getToken(PlPgSqlParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PlPgSqlParser.ROWS, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_offsetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(OFFSET);
			setState(297); ((OffsetClauseContext)_localctx).offset = match(INTEGER_VALUE);
			setState(299);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(298);
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
		public TerminalNode ORDER_BY() { return getToken(PlPgSqlParser.ORDER_BY, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(ORDER_BY);
			setState(302); orderByItem();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(303); match(4);
				setState(304); orderByItem();
				}
				}
				setState(309);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUsingOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUsingOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUsingOrdering(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StandardOrderingContext extends OrderByItemContext {
		public Token ordering;
		public NullsOrderingContext nullsOrdering() {
			return getRuleContext(NullsOrderingContext.class,0);
		}
		public TerminalNode DESC() { return getToken(PlPgSqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(PlPgSqlParser.ASC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StandardOrderingContext(OrderByItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStandardOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStandardOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStandardOrdering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_orderByItem);
		int _la;
		try {
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new StandardOrderingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310); expression(0);
				setState(312);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(311);
					((StandardOrderingContext)_localctx).ordering = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
						((StandardOrderingContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(315);
				_la = _input.LA(1);
				if (_la==NULLS) {
					{
					setState(314); nullsOrdering();
					}
				}

				}
				break;

			case 2:
				_localctx = new UsingOrderingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317); expression(0);
				setState(318); orderByUsing();
				setState(320);
				_la = _input.LA(1);
				if (_la==NULLS) {
					{
					setState(319); nullsOrdering();
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
		public TerminalNode GTE() { return getToken(PlPgSqlParser.GTE, 0); }
		public TerminalNode LT() { return getToken(PlPgSqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PlPgSqlParser.LTE, 0); }
		public TerminalNode USING() { return getToken(PlPgSqlParser.USING, 0); }
		public TerminalNode GT() { return getToken(PlPgSqlParser.GT, 0); }
		public OrderByUsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByUsing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterOrderByUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitOrderByUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitOrderByUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByUsingContext orderByUsing() throws RecognitionException {
		OrderByUsingContext _localctx = new OrderByUsingContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orderByUsing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(USING);
			setState(325);
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
		public TerminalNode FIRST() { return getToken(PlPgSqlParser.FIRST, 0); }
		public TerminalNode NULLS() { return getToken(PlPgSqlParser.NULLS, 0); }
		public TerminalNode LAST() { return getToken(PlPgSqlParser.LAST, 0); }
		public NullsOrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullsOrdering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNullsOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNullsOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNullsOrdering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullsOrderingContext nullsOrdering() throws RecognitionException {
		NullsOrderingContext _localctx = new NullsOrderingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nullsOrdering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(NULLS);
			setState(328);
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
		public TerminalNode FROM() { return getToken(PlPgSqlParser.FROM, 0); }
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(FROM);
			setState(331); tableExpression();
			{
			setState(332); match(4);
			setState(333); tableExpression();
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
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode ONLY() { return getToken(PlPgSqlParser.ONLY, 0); }
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public FromTableContext(TableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromSelectContext extends TableExpressionContext {
		public Token alias;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public FromSelectContext(TableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFromSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFromSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFromSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExpressionContext tableExpression() throws RecognitionException {
		TableExpressionContext _localctx = new TableExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableExpression);
		int _la;
		try {
			setState(359);
			switch (_input.LA(1)) {
			case ONLY:
			case QNAME:
				_localctx = new FromTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(335); ((FromTableContext)_localctx).only = match(ONLY);
					}
				}

				setState(338); ((FromTableContext)_localctx).tableName = match(QNAME);
				setState(340);
				_la = _input.LA(1);
				if (_la==MUL) {
					{
					setState(339); match(MUL);
					}
				}

				setState(347);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(343);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(342); match(AS);
						}
					}

					setState(345); ((FromTableContext)_localctx).alias = match(ID);
					setState(346); columnAlias();
					}
				}

				}
				break;
			case 7:
				_localctx = new FromSelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349); match(7);
				setState(350); select();
				setState(351); match(3);
				setState(353);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(352); match(AS);
					}
				}

				setState(355); ((FromSelectContext)_localctx).alias = match(ID);
				setState(357);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(356); columnAlias();
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterColumnAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitColumnAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitColumnAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasContext columnAlias() throws RecognitionException {
		ColumnAliasContext _localctx = new ColumnAliasContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_columnAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(7);
			setState(362); columnAliasItem();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(363); match(4);
				setState(364); columnAliasItem();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370); match(3);
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
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ColumnAliasItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliasItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterColumnAliasItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitColumnAliasItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitColumnAliasItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasItemContext columnAliasItem() throws RecognitionException {
		ColumnAliasItemContext _localctx = new ColumnAliasItemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_columnAliasItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); match(ID);
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
		public TerminalNode WHERE() { return getToken(PlPgSqlParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(WHERE);
			setState(375); condition();
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
		public TerminalNode GROUP_BY() { return getToken(PlPgSqlParser.GROUP_BY, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(GROUP_BY);
			setState(378); expression(0);
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
		public TerminalNode HAVING() { return getToken(PlPgSqlParser.HAVING, 0); }
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(HAVING);
			setState(381); condition();
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
		public TerminalNode EXCEPT() { return getToken(PlPgSqlParser.EXCEPT, 0); }
		public TerminalNode UNION() { return getToken(PlPgSqlParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(PlPgSqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(PlPgSqlParser.DISTINCT, 0); }
		public TerminalNode INTERSECT() { return getToken(PlPgSqlParser.INTERSECT, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public BulkOperationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulkOperationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBulkOperationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBulkOperationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBulkOperationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BulkOperationClauseContext bulkOperationClause() throws RecognitionException {
		BulkOperationClauseContext _localctx = new BulkOperationClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bulkOperationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTERSECT) | (1L << EXCEPT))) != 0)) {
				{
				setState(383);
				((BulkOperationClauseContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTERSECT) | (1L << EXCEPT))) != 0)) ) {
					((BulkOperationClauseContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(384);
				((BulkOperationClauseContext)_localctx).selectMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
					((BulkOperationClauseContext)_localctx).selectMode = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(385); select();
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); booleanExpr();
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
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode NEXT() { return getToken(PlPgSqlParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(PlPgSqlParser.FIRST, 0); }
		public TerminalNode ROW() { return getToken(PlPgSqlParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PlPgSqlParser.ROWS, 0); }
		public TerminalNode ONLY() { return getToken(PlPgSqlParser.ONLY, 0); }
		public TerminalNode FETCH() { return getToken(PlPgSqlParser.FETCH, 0); }
		public FetchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFetchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFetchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFetchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchClauseContext fetchClause() throws RecognitionException {
		FetchClauseContext _localctx = new FetchClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fetchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); match(FETCH);
			setState(392);
			_la = _input.LA(1);
			if (_la==FIRST || _la==NEXT) {
				{
				setState(391);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(395);
			_la = _input.LA(1);
			if (_la==INTEGER_VALUE) {
				{
				setState(394); ((FetchClauseContext)_localctx).count = match(INTEGER_VALUE);
				}
			}

			setState(398);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(397);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(400); match(ONLY);
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
		public TerminalNode FOR() { return getToken(PlPgSqlParser.FOR, 0); }
		public TerminalNode NOWAIT() { return getToken(PlPgSqlParser.NOWAIT, 0); }
		public LockedTablesContext lockedTables() {
			return getRuleContext(LockedTablesContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(PlPgSqlParser.UPDATE, 0); }
		public TerminalNode SHARE() { return getToken(PlPgSqlParser.SHARE, 0); }
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); match(FOR);
			setState(403);
			((ForClauseContext)_localctx).lockMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UPDATE || _la==SHARE) ) {
				((ForClauseContext)_localctx).lockMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(405);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(404); lockedTables();
				}
			}

			setState(408);
			_la = _input.LA(1);
			if (_la==NOWAIT) {
				{
				setState(407); ((ForClauseContext)_localctx).nowait = match(NOWAIT);
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
		public TerminalNode OF() { return getToken(PlPgSqlParser.OF, 0); }
		public LockedTableContext lockedTable(int i) {
			return getRuleContext(LockedTableContext.class,i);
		}
		public LockedTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockedTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLockedTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLockedTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLockedTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockedTablesContext lockedTables() throws RecognitionException {
		LockedTablesContext _localctx = new LockedTablesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lockedTables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); match(OF);
			setState(411); lockedTable();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(412); match(4);
				setState(413); lockedTable();
				}
				}
				setState(418);
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
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public LockedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockedTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLockedTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLockedTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLockedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockedTableContext lockedTable() throws RecognitionException {
		LockedTableContext _localctx = new LockedTableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lockedTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(ID);
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
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExprContext functionCallExpr() throws RecognitionException {
		FunctionCallExprContext _localctx = new FunctionCallExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionCallExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
			setState(422); match(7);
			setState(431);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << NOT) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAST - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (STRING - 64)) | (1L << (INTEGER_VALUE - 64)) | (1L << (DECIMAL_VALUE - 64)) | (1L << (ID - 64)) | (1L << (QNAME - 64)) | (1L << (ARRAY_TYPE - 64)) | (1L << (COPY_TYPE - 64)) | (1L << (ROW_TYPE - 64)))) != 0)) {
				{
				setState(423); expression(0);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(424); match(4);
					setState(425); expression(0);
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(433); match(3);
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
			return getToken(PlPgSqlParser.QUOTE, i);
		}
		public TerminalNode ARRAY_TYPE() { return getToken(PlPgSqlParser.ARRAY_TYPE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(PlPgSqlParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(PlPgSqlParser.QUOTE); }
		public TerminalNode ROW_TYPE() { return getToken(PlPgSqlParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(PlPgSqlParser.DECIMAL_VALUE, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_numericConstant);
		int _la;
		try {
			setState(442);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(436); match(5);
				setState(437);
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
				setState(438);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(439); match(QUOTE);
				setState(440);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(441); match(QUOTE);
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
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(PlPgSqlParser.ARRAY_TYPE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(PlPgSqlParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ROW_TYPE() { return getToken(PlPgSqlParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PlPgSqlParser.STRING, 0); }
		public TerminalNode CAST() { return getToken(PlPgSqlParser.CAST, 0); }
		public ConstantOfOtherTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantOfOtherTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterConstantOfOtherTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitConstantOfOtherTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitConstantOfOtherTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantOfOtherTypesContext constantOfOtherTypes() throws RecognitionException {
		ConstantOfOtherTypesContext _localctx = new ConstantOfOtherTypesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constantOfOtherTypes);
		int _la;
		try {
			setState(455);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(445); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(446); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(447); match(5);
				setState(448);
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
				setState(449); match(CAST);
				setState(450); match(7);
				setState(451); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(452); match(AS);
				setState(453);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(454); match(3);
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
		public TerminalNode DECIMAL_VALUE() { return getToken(PlPgSqlParser.DECIMAL_VALUE, 0); }
		public NumericalLiteralExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNumericalLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNumericalLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNumericalLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public TerminalNode DIV() { return getToken(PlPgSqlParser.DIV, 0); }
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public DivExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitDivExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExponentiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExponentiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExponentiationExpression(this);
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
		public TerminalNode SUB() { return getToken(PlPgSqlParser.SUB, 0); }
		public SubExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends NumericalExprContext {
		public Token unaryOperator;
		public NumericalExprContext numericalExpr() {
			return getRuleContext(NumericalExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(PlPgSqlParser.SUB, 0); }
		public UnaryExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUnaryExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public TerminalNode MUL() { return getToken(PlPgSqlParser.MUL, 0); }
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public MulExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitMulExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNumericalExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNumericalExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNumericalExpressionGroup(this);
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
		public TerminalNode ADD() { return getToken(PlPgSqlParser.ADD, 0); }
		public AddExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitAddExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNumericalFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNumericalFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNumericalFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public TerminalNode MOD() { return getToken(PlPgSqlParser.MOD, 0); }
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public ModExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericVariableExpressionContext extends NumericalExprContext {
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public NumericVariableExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNumericVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNumericVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNumericVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalExprContext numericalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumericalExprContext _localctx = new NumericalExprContext(_ctx, _parentState, _p);
		NumericalExprContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, RULE_numericalExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(458); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(459); numericalExpr(12);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(460); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(461); numericalExpr(11);
				}
				break;

			case 3:
				{
				_localctx = new NumericalFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(462); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new NumericalExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(463); match(7);
				setState(464); numericalExpr(0);
				setState(465); match(3);
				}
				break;

			case 5:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(467); numericConstant();
				}
				break;

			case 6:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(468); match(INTEGER_VALUE);
				}
				break;

			case 7:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(469); match(DECIMAL_VALUE);
				}
				break;

			case 8:
				{
				_localctx = new NumericVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(470); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(491);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(473);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(474); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(475); numericalExpr(11);
						}
						break;

					case 2:
						{
						_localctx = new DivExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(476);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(477); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(478); numericalExpr(10);
						}
						break;

					case 3:
						{
						_localctx = new ModExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(479);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(480); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(481); numericalExpr(9);
						}
						break;

					case 4:
						{
						_localctx = new AddExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(482);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(483); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(484); numericalExpr(8);
						}
						break;

					case 5:
						{
						_localctx = new SubExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(485);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(486); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(487); numericalExpr(7);
						}
						break;

					case 6:
						{
						_localctx = new ExponentiationExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(488);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(489); match(2);
						setState(490); numericalExpr(5);
						}
						break;
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		public TerminalNode TRUE() { return getToken(PlPgSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlPgSqlParser.FALSE, 0); }
		public BooleanConstantContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBooleanConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExpressionContext extends BooleanExprContext {
		public TerminalNode NOT() { return getToken(PlPgSqlParser.NOT, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public NegateExpressionContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNegateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNegateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNegateExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBooleanArbitraryConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBooleanArbitraryConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBooleanArbitraryConstantExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBooeleanExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBooeleanExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBooeleanExpressionGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVariableExpressionContext extends BooleanExprContext {
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public BooleanVariableExpressionContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBooleanVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBooleanVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBooleanVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_booleanExpr);
		int _la;
		try {
			setState(505);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new BooeleanExpressionGroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(496); match(7);
				setState(497); booleanExpr();
				setState(498); match(3);
				}
				break;

			case 2:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(500); match(NOT);
				setState(501); booleanExpr();
				}
				break;

			case 3:
				_localctx = new BooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
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
				setState(503); constantOfOtherTypes();
				}
				break;

			case 5:
				_localctx = new BooleanVariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(504); match(ID);
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
		public TerminalNode STRING() { return getToken(PlPgSqlParser.STRING, 0); }
		public StringLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStringLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStringLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitVariableExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNumericalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNumericalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNumericalExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExpressionGroup(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBooleanExpression(this);
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
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterArbitraryConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitArbitraryConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitArbitraryConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token operator;
		public Token not;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(PlPgSqlParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SIMILAR_OP() { return getToken(PlPgSqlParser.SIMILAR_OP, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalConjunctionExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(PlPgSqlParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LogicalConjunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLogicalConjunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLogicalConjunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLogicalConjunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(508); functionCallExpr();
				}
				break;

			case 2:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(509); match(7);
				setState(510); expression(0);
				setState(511); match(3);
				}
				break;

			case 3:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(513); booleanExpr();
				}
				break;

			case 4:
				{
				_localctx = new NumericalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(514); numericalExpr(0);
				}
				break;

			case 5:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(515); constantOfOtherTypes();
				}
				break;

			case 6:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(516); match(ID);
				}
				break;

			case 7:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(517); match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(565);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(520);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(521); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(522); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(523);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(524); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(525); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(526);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(527); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(528); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(529);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(530); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(531); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(532);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(533); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(534); expression(10);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(535);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(536); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(537); expression(9);
						}
						break;

					case 7:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(538);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(539); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(540); expression(6);
						}
						break;

					case 8:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(541);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(542); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(543); expression(5);
						}
						break;

					case 9:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(544);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(549); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(545); match(6);
								setState(546); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = numericalExpr(0);
								setState(547); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(551); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 10:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(553);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(555);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(554); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(557); ((ComparisonExpressionContext)_localctx).operator = match(LIKE);
						setState(558); expression(0);
						}
						break;

					case 11:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(559);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(561);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(560); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(563); ((ComparisonExpressionContext)_localctx).operator = match(SIMILAR_OP);
						setState(564); expression(0);
						}
						break;
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		public TerminalNode ASSIGN_OP() { return getToken(PlPgSqlParser.ASSIGN_OP, 0); }
		public TerminalNode EQ() { return getToken(PlPgSqlParser.EQ, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		case 49: return numericalExpr_sempred((NumericalExprContext)_localctx, predIndex);

		case 51: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3t\u023f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\6\2n\n\2\r\2\16\2o\3\3\3\3\3\3\5\3u\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0082\n\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4\u0089\n\4\f\4\16\4\u008c\13\4\5\4\u008e\n\4\3\5\5\5\u0091\n"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0097\n\5\3\6\3\6\3\6\3\6\3\6\6\6\u009e\n\6\r\6"+
		"\16\6\u009f\5\6\u00a2\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n"+
		"\7\3\b\3\b\7\b\u00b0\n\b\f\b\16\b\u00b3\13\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\7\20\u00d1\n\20\f\20\16\20\u00d4\13\20\3\21"+
		"\3\21\5\21\u00d8\n\21\3\21\3\21\3\21\5\21\u00dd\n\21\3\21\3\21\5\21\u00e1"+
		"\n\21\3\21\3\21\5\21\u00e5\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\7\23\u00f0\n\23\f\23\16\23\u00f3\13\23\3\24\3\24\5\24\u00f7\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0104\n\27"+
		"\3\30\3\30\5\30\u0108\n\30\3\30\3\30\5\30\u010c\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\7\31\u0113\n\31\f\31\16\31\u0116\13\31\3\32\3\32\3\32\7\32\u011b"+
		"\n\32\f\32\16\32\u011e\13\32\3\33\3\33\3\34\3\34\5\34\u0124\n\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u012e\n\36\3\37\3\37\3\37\3\37"+
		"\7\37\u0134\n\37\f\37\16\37\u0137\13\37\3 \3 \5 \u013b\n \3 \5 \u013e"+
		"\n \3 \3 \3 \5 \u0143\n \5 \u0145\n \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3$\5$\u0153\n$\3$\3$\5$\u0157\n$\3$\5$\u015a\n$\3$\3$\5$\u015e\n$"+
		"\3$\3$\3$\3$\5$\u0164\n$\3$\3$\5$\u0168\n$\5$\u016a\n$\3%\3%\3%\3%\7%"+
		"\u0170\n%\f%\16%\u0173\13%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\5*\u0185\n*\3+\3+\3,\3,\5,\u018b\n,\3,\5,\u018e\n,\3,\5,\u0191"+
		"\n,\3,\3,\3-\3-\3-\5-\u0198\n-\3-\5-\u019b\n-\3.\3.\3.\3.\7.\u01a1\n."+
		"\f.\16.\u01a4\13.\3/\3/\3\60\3\60\3\60\3\60\3\60\7\60\u01ad\n\60\f\60"+
		"\16\60\u01b0\13\60\5\60\u01b2\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u01bd\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u01ca\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u01da\n\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u01ee"+
		"\n\63\f\63\16\63\u01f1\13\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\5\64\u01fc\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0209\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\6\65\u0228\n\65\r\65\16\65\u0229\3\65\3\65\5"+
		"\65\u022e\n\65\3\65\3\65\3\65\3\65\5\65\u0234\n\65\3\65\3\65\7\65\u0238"+
		"\n\65\f\65\16\65\u023b\13\65\3\66\3\66\3\66\2\67\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\25"+
		"\3\2HK\3\2mo\5\2\21\21\34\34PP\3\2mq\3\2XZ\4\2\67\67[\\\3\2_`\4\2##kk"+
		"\3\2./\3\2;<\3\2\36!\4\2??AA\3\28:\3\2#$\3\2?@\3\2\62\63\3\2kl\3\2ef\4"+
		"\2\21\21\34\34\u0262\2m\3\2\2\2\4q\3\2\2\2\6\u008d\3\2\2\2\b\u0090\3\2"+
		"\2\2\n\u00a1\3\2\2\2\f\u00ab\3\2\2\2\16\u00b1\3\2\2\2\20\u00b9\3\2\2\2"+
		"\22\u00c0\3\2\2\2\24\u00c2\3\2\2\2\26\u00c4\3\2\2\2\30\u00c6\3\2\2\2\32"+
		"\u00c8\3\2\2\2\34\u00cb\3\2\2\2\36\u00d2\3\2\2\2 \u00d5\3\2\2\2\"\u00e8"+
		"\3\2\2\2$\u00f1\3\2\2\2&\u00f6\3\2\2\2(\u00f8\3\2\2\2*\u00fd\3\2\2\2,"+
		"\u0100\3\2\2\2.\u0107\3\2\2\2\60\u010d\3\2\2\2\62\u0117\3\2\2\2\64\u011f"+
		"\3\2\2\2\66\u0121\3\2\2\28\u0127\3\2\2\2:\u012a\3\2\2\2<\u012f\3\2\2\2"+
		">\u0144\3\2\2\2@\u0146\3\2\2\2B\u0149\3\2\2\2D\u014c\3\2\2\2F\u0169\3"+
		"\2\2\2H\u016b\3\2\2\2J\u0176\3\2\2\2L\u0178\3\2\2\2N\u017b\3\2\2\2P\u017e"+
		"\3\2\2\2R\u0184\3\2\2\2T\u0186\3\2\2\2V\u0188\3\2\2\2X\u0194\3\2\2\2Z"+
		"\u019c\3\2\2\2\\\u01a5\3\2\2\2^\u01a7\3\2\2\2`\u01bc\3\2\2\2b\u01c9\3"+
		"\2\2\2d\u01d9\3\2\2\2f\u01fb\3\2\2\2h\u0208\3\2\2\2j\u023c\3\2\2\2ln\5"+
		"\4\3\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\3\3\2\2\2qt\7E\2\2rs\7"+
		"\20\2\2su\7F\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7G\2\2wx\7m\2\2xy\7\t"+
		"\2\2yz\5\6\4\2z{\7\5\2\2{|\5\n\6\2|}\7S\2\2}~\5\f\7\2~\177\7N\2\2\177"+
		"\u0081\7O\2\2\u0080\u0082\5\20\t\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\n\2\2\u0084\5\3\2\2\2\u0085\u008a"+
		"\5\b\5\2\u0086\u0087\7\6\2\2\u0087\u0089\5\b\5\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\7\3\2\2\2\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0093\7m\2\2\u0093\u0096\t\3\2\2\u0094\u0095"+
		"\t\4\2\2\u0095\u0097\5h\65\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\t\3\2\2\2\u0098\u0099\7Q\2\2\u0099\u00a2\t\5\2\2\u009a\u009d\7Q\2\2\u009b"+
		"\u009c\t\5\2\2\u009c\u009e\7m\2\2\u009d\u009b\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u0098\3\2\2\2\u00a1\u009a\3\2\2\2\u00a2\13\3\2\2\2\u00a3\u00a4\7h\2\2"+
		"\u00a4\u00a5\5\16\b\2\u00a5\u00a6\7h\2\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8"+
		"\7i\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7i\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ae\7T\2\2"+
		"\u00ae\u00b0\5\36\20\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7U\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7\7V\2\2\u00b7\u00b8\7\n\2"+
		"\2\u00b8\17\3\2\2\2\u00b9\u00ba\5\24\13\2\u00ba\u00bb\5\22\n\2\u00bb\u00bc"+
		"\5\26\f\2\u00bc\u00bd\5\30\r\2\u00bd\u00be\5\32\16\2\u00be\u00bf\5\34"+
		"\17\2\u00bf\21\3\2\2\2\u00c0\u00c1\t\6\2\2\u00c1\23\3\2\2\2\u00c2\u00c3"+
		"\7W\2\2\u00c3\25\3\2\2\2\u00c4\u00c5\t\7\2\2\u00c5\27\3\2\2\2\u00c6\u00c7"+
		"\t\b\2\2\u00c7\31\3\2\2\2\u00c8\u00c9\7a\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\33\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\7k\2\2\u00cd\35\3\2\2\2\u00ce"+
		"\u00d1\5 \21\2\u00cf\u00d1\5\"\22\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\37\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7m\2\2\u00d6\u00d8\7b\2\2"+
		"\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc"+
		"\t\5\2\2\u00da\u00db\7c\2\2\u00db\u00dd\7m\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\7\24\2\2\u00df\u00e1\7"+
		"d\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e3\t\4\2\2\u00e3\u00e5\5h\65\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\n\2\2\u00e7!\3\2\2\2\u00e8\u00e9"+
		"\7m\2\2\u00e9\u00ea\7C\2\2\u00ea\u00eb\7D\2\2\u00eb\u00ec\7m\2\2\u00ec"+
		"\u00ed\7\n\2\2\u00ed#\3\2\2\2\u00ee\u00f0\5&\24\2\u00ef\u00ee\3\2\2\2"+
		"\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2%\3"+
		"\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\5\16\b\2\u00f5\u00f7\5(\25\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u00f9\5h\65\2"+
		"\u00f9\u00fa\5j\66\2\u00fa\u00fb\5h\65\2\u00fb\u00fc\7\n\2\2\u00fc)\3"+
		"\2\2\2\u00fd\u00fe\5,\27\2\u00fe\u00ff\7\n\2\2\u00ff+\3\2\2\2\u0100\u0101"+
		"\7\"\2\2\u0101\u0103\5.\30\2\u0102\u0104\5D#\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104-\3\2\2\2\u0105\u0108\7#\2\2\u0106\u0108\5\60\31\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u010c\5\64\33\2\u010a\u010c\5\62\32\2\u010b\u0109\3\2\2"+
		"\2\u010b\u010a\3\2\2\2\u010c/\3\2\2\2\u010d\u010e\7$\2\2\u010e\u010f\7"+
		"L\2\2\u010f\u0114\5h\65\2\u0110\u0111\7\6\2\2\u0111\u0113\5h\65\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\61\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011c\5h\65\2\u0118\u0119"+
		"\7\6\2\2\u0119\u011b\5h\65\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\63\3\2\2\2\u011e\u011c\3\2\2"+
		"\2\u011f\u0120\7\27\2\2\u0120\65\3\2\2\2\u0121\u0123\7\66\2\2\u0122\u0124"+
		"\7\67\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0126\7m\2\2\u0126\67\3\2\2\2\u0127\u0128\7,\2\2\u0128\u0129\t"+
		"\t\2\2\u01299\3\2\2\2\u012a\u012b\7-\2\2\u012b\u012d\7k\2\2\u012c\u012e"+
		"\t\n\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e;\3\2\2\2\u012f"+
		"\u0130\7*\2\2\u0130\u0135\5> \2\u0131\u0132\7\6\2\2\u0132\u0134\5> \2"+
		"\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136=\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\5h\65\2\u0139"+
		"\u013b\t\13\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3"+
		"\2\2\2\u013c\u013e\5B\"\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0145\3\2\2\2\u013f\u0140\5h\65\2\u0140\u0142\5@!\2\u0141\u0143\5B\""+
		"\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0138"+
		"\3\2\2\2\u0144\u013f\3\2\2\2\u0145?\3\2\2\2\u0146\u0147\7=\2\2\u0147\u0148"+
		"\t\f\2\2\u0148A\3\2\2\2\u0149\u014a\7>\2\2\u014a\u014b\t\r\2\2\u014bC"+
		"\3\2\2\2\u014c\u014d\7%\2\2\u014d\u014e\5F$\2\u014e\u014f\7\6\2\2\u014f"+
		"\u0150\5F$\2\u0150E\3\2\2\2\u0151\u0153\7\61\2\2\u0152\u0151\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\7n\2\2\u0155\u0157\7\27"+
		"\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015d\3\2\2\2\u0158"+
		"\u015a\7S\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\7m\2\2\u015c\u015e\5H%\2\u015d\u0159\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u016a\3\2\2\2\u015f\u0160\7\t\2\2\u0160\u0161\5,\27\2\u0161"+
		"\u0163\7\5\2\2\u0162\u0164\7S\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7m\2\2\u0166\u0168\5H%\2\u0167\u0166"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0152\3\2\2\2\u0169"+
		"\u015f\3\2\2\2\u016aG\3\2\2\2\u016b\u016c\7\t\2\2\u016c\u0171\5J&\2\u016d"+
		"\u016e\7\6\2\2\u016e\u0170\5J&\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2"+
		"\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\7\5\2\2\u0175I\3\2\2\2\u0176\u0177\7m\2\2\u0177K"+
		"\3\2\2\2\u0178\u0179\7&\2\2\u0179\u017a\5T+\2\u017aM\3\2\2\2\u017b\u017c"+
		"\7\'\2\2\u017c\u017d\5h\65\2\u017dO\3\2\2\2\u017e\u017f\7M\2\2\u017f\u0180"+
		"\5T+\2\u0180Q\3\2\2\2\u0181\u0182\t\16\2\2\u0182\u0183\t\17\2\2\u0183"+
		"\u0185\5,\27\2\u0184\u0181\3\2\2\2\u0184\u0185\3\2\2\2\u0185S\3\2\2\2"+
		"\u0186\u0187\5f\64\2\u0187U\3\2\2\2\u0188\u018a\7\60\2\2\u0189\u018b\t"+
		"\20\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u018e\7k\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2"+
		"\2\2\u018f\u0191\t\n\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0193\7\61\2\2\u0193W\3\2\2\2\u0194\u0195\7D\2\2"+
		"\u0195\u0197\t\21\2\2\u0196\u0198\5Z.\2\u0197\u0196\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u019b\7\65\2\2\u019a\u0199\3\2\2\2"+
		"\u019a\u019b\3\2\2\2\u019bY\3\2\2\2\u019c\u019d\7\64\2\2\u019d\u01a2\5"+
		"\\/\2\u019e\u019f\7\6\2\2\u019f\u01a1\5\\/\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3[\3\2\2\2"+
		"\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7m\2\2\u01a6]\3\2\2\2\u01a7\u01a8\7m"+
		"\2\2\u01a8\u01b1\7\t\2\2\u01a9\u01ae\5h\65\2\u01aa\u01ab\7\6\2\2\u01ab"+
		"\u01ad\5h\65\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1"+
		"\u01a9\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7\5"+
		"\2\2\u01b4_\3\2\2\2\u01b5\u01b6\t\22\2\2\u01b6\u01b7\7\7\2\2\u01b7\u01bd"+
		"\t\5\2\2\u01b8\u01b9\t\5\2\2\u01b9\u01ba\7i\2\2\u01ba\u01bb\t\22\2\2\u01bb"+
		"\u01bd\7i\2\2\u01bc\u01b5\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bda\3\2\2\2\u01be"+
		"\u01bf\t\5\2\2\u01bf\u01ca\7j\2\2\u01c0\u01c1\7j\2\2\u01c1\u01c2\7\7\2"+
		"\2\u01c2\u01ca\t\5\2\2\u01c3\u01c4\7B\2\2\u01c4\u01c5\7\t\2\2\u01c5\u01c6"+
		"\7j\2\2\u01c6\u01c7\7S\2\2\u01c7\u01c8\t\5\2\2\u01c8\u01ca\7\5\2\2\u01c9"+
		"\u01be\3\2\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01c3\3\2\2\2\u01cac\3\2\2\2"+
		"\u01cb\u01cc\b\63\1\2\u01cc\u01cd\7\32\2\2\u01cd\u01da\5d\63\2\u01ce\u01cf"+
		"\7\33\2\2\u01cf\u01da\5d\63\2\u01d0\u01da\5^\60\2\u01d1\u01d2\7\t\2\2"+
		"\u01d2\u01d3\5d\63\2\u01d3\u01d4\7\5\2\2\u01d4\u01da\3\2\2\2\u01d5\u01da"+
		"\5`\61\2\u01d6\u01da\7k\2\2\u01d7\u01da\7l\2\2\u01d8\u01da\7m\2\2\u01d9"+
		"\u01cb\3\2\2\2\u01d9\u01ce\3\2\2\2\u01d9\u01d0\3\2\2\2\u01d9\u01d1\3\2"+
		"\2\2\u01d9\u01d5\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01d8\3\2\2\2\u01da\u01ef\3\2\2\2\u01db\u01dc\6\63\2\3\u01dc\u01dd\7"+
		"\27\2\2\u01dd\u01ee\5d\63\2\u01de\u01df\6\63\3\3\u01df\u01e0\7\30\2\2"+
		"\u01e0\u01ee\5d\63\2\u01e1\u01e2\6\63\4\3\u01e2\u01e3\7\31\2\2\u01e3\u01ee"+
		"\5d\63\2\u01e4\u01e5\6\63\5\3\u01e5\u01e6\7\32\2\2\u01e6\u01ee\5d\63\2"+
		"\u01e7\u01e8\6\63\6\3\u01e8\u01e9\7\33\2\2\u01e9\u01ee\5d\63\2\u01ea\u01eb"+
		"\6\63\7\3\u01eb\u01ec\7\4\2\2\u01ec\u01ee\5d\63\2\u01ed\u01db\3\2\2\2"+
		"\u01ed\u01de\3\2\2\2\u01ed\u01e1\3\2\2\2\u01ed\u01e4\3\2\2\2\u01ed\u01e7"+
		"\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0e\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7\t\2\2"+
		"\u01f3\u01f4\5f\64\2\u01f4\u01f5\7\5\2\2\u01f5\u01fc\3\2\2\2\u01f6\u01f7"+
		"\7\24\2\2\u01f7\u01fc\5f\64\2\u01f8\u01fc\t\23\2\2\u01f9\u01fc\5b\62\2"+
		"\u01fa\u01fc\7m\2\2\u01fb\u01f2\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fb\u01f8"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fcg\3\2\2\2\u01fd"+
		"\u01fe\b\65\1\2\u01fe\u0209\5^\60\2\u01ff\u0200\7\t\2\2\u0200\u0201\5"+
		"h\65\2\u0201\u0202\7\5\2\2\u0202\u0209\3\2\2\2\u0203\u0209\5f\64\2\u0204"+
		"\u0209\5d\63\2\u0205\u0209\5b\62\2\u0206\u0209\7m\2\2\u0207\u0209\7j\2"+
		"\2\u0208\u01fd\3\2\2\2\u0208\u01ff\3\2\2\2\u0208\u0203\3\2\2\2\u0208\u0204"+
		"\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209"+
		"\u0239\3\2\2\2\u020a\u020b\6\65\b\3\u020b\u020c\7\34\2\2\u020c\u0238\5"+
		"h\65\2\u020d\u020e\6\65\t\3\u020e\u020f\7\35\2\2\u020f\u0238\5h\65\2\u0210"+
		"\u0211\6\65\n\3\u0211\u0212\7\36\2\2\u0212\u0238\5h\65\2\u0213\u0214\6"+
		"\65\13\3\u0214\u0215\7\37\2\2\u0215\u0238\5h\65\2\u0216\u0217\6\65\f\3"+
		"\u0217\u0218\7 \2\2\u0218\u0238\5h\65\2\u0219\u021a\6\65\r\3\u021a\u021b"+
		"\7!\2\2\u021b\u0238\5h\65\2\u021c\u021d\6\65\16\3\u021d\u021e\7\17\2\2"+
		"\u021e\u0238\5h\65\2\u021f\u0220\6\65\17\3\u0220\u0221\7\20\2\2\u0221"+
		"\u0238\5h\65\2\u0222\u0227\6\65\20\3\u0223\u0224\7\b\2\2\u0224\u0225\5"+
		"d\63\2\u0225\u0226\7\3\2\2\u0226\u0228\3\2\2\2\u0227\u0223\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0238\3\2"+
		"\2\2\u022b\u022d\6\65\21\3\u022c\u022e\7\24\2\2\u022d\u022c\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7\13\2\2\u0230\u0238\5"+
		"h\65\2\u0231\u0233\6\65\22\3\u0232\u0234\7\24\2\2\u0233\u0232\3\2\2\2"+
		"\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7\f\2\2\u0236\u0238"+
		"\5h\65\2\u0237\u020a\3\2\2\2\u0237\u020d\3\2\2\2\u0237\u0210\3\2\2\2\u0237"+
		"\u0213\3\2\2\2\u0237\u0216\3\2\2\2\u0237\u0219\3\2\2\2\u0237\u021c\3\2"+
		"\2\2\u0237\u021f\3\2\2\2\u0237\u0222\3\2\2\2\u0237\u022b\3\2\2\2\u0237"+
		"\u0231\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023ai\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\t\24\2\2\u023dk\3"+
		"\2\2\2>ot\u0081\u008a\u008d\u0090\u0096\u009f\u00a1\u00ab\u00b1\u00d0"+
		"\u00d2\u00d7\u00dc\u00e0\u00e4\u00f1\u00f6\u0103\u0107\u010b\u0114\u011c"+
		"\u0123\u012d\u0135\u013a\u013d\u0142\u0144\u0152\u0156\u0159\u015d\u0163"+
		"\u0167\u0169\u0171\u0184\u018a\u018d\u0190\u0197\u019a\u01a2\u01ae\u01b1"+
		"\u01bc\u01c9\u01d9\u01ed\u01ef\u01fb\u0208\u0229\u022d\u0233\u0237\u0239";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}