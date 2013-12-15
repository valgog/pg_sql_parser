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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, STRING=6, INTEGER_VALUE=7, DECIMAL_VALUE=8, 
		ALIAS=9, FOR=10, CREATE=11, REPLACE=12, FUNCTION=13, OR=14, IN=15, OUT=16, 
		INOUT=17, VARIADIC=18, LANGUAGE=19, LANGUAGE_NAME=20, ASSIGN_OP=21, DEFAULT=22, 
		RETURNS=23, TABLE=24, AS=25, DECLARE=26, BEGIN=27, END=28, DOLLAR_QUOTE=29, 
		WINDOW=30, IMMUTABLE=31, STABLE=32, VOLATILE=33, CALLED_ON_NULL_INPUT=34, 
		RETURNS_NULL_ON_NULL_INPUT=35, STRICT=36, EXTERNAL=37, SECURITY=38, SECURITY_INVOKER=39, 
		SECURITY_DEFINER=40, COST=41, ROWS=42, CONSTANT=43, COLLATE=44, NOT=45, 
		NULL=46, ID=47, SL_COMMENT=48, ML_COMMENT=49, WS=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "')'", "','", "'('", "';'", "STRING", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", "OR", 
		"IN", "OUT", "INOUT", "VARIADIC", "LANGUAGE", "LANGUAGE_NAME", "ASSIGN_OP", 
		"DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", "END", "DOLLAR_QUOTE", 
		"WINDOW", "IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"STRICT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", 
		"COST", "ROWS", "CONSTANT", "COLLATE", "NOT", "NULL", "ID", "SL_COMMENT", 
		"ML_COMMENT", "WS"
	};
	public static final int
		RULE_type = 0, RULE_unit = 1, RULE_functionName = 2, RULE_plFunction = 3, 
		RULE_functionArgsList = 4, RULE_functionArg = 5, RULE_functionReturns = 6, 
		RULE_functionBody = 7, RULE_block = 8, RULE_functionSettings = 9, RULE_functionBehavior = 10, 
		RULE_window = 11, RULE_functionInputHandling = 12, RULE_functionSecurity = 13, 
		RULE_functionCosts = 14, RULE_functionRows = 15, RULE_varDeclarationList = 16, 
		RULE_varDeclaration = 17, RULE_aliasDeclaration = 18, RULE_expr = 19, 
		RULE_stmts = 20, RULE_stmt = 21;
	public static final String[] ruleNames = {
		"type", "unit", "functionName", "plFunction", "functionArgsList", "functionArg", 
		"functionReturns", "functionBody", "block", "functionSettings", "functionBehavior", 
		"window", "functionInputHandling", "functionSecurity", "functionCosts", 
		"functionRows", "varDeclarationList", "varDeclaration", "aliasDeclaration", 
		"expr", "stmts", "stmt"
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
	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(ID);
			setState(47);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(45); match(1);
				setState(46); match(ID);
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
		enterRule(_localctx, 2, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49); plFunction();
				}
				}
				setState(52); 
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(ID);
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
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode CREATE() { return getToken(PlPgSqlParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(PlPgSqlParser.OR, 0); }
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
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
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
		enterRule(_localctx, 6, RULE_plFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(CREATE);
			setState(59);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(57); match(OR);
				setState(58); match(REPLACE);
				}
			}

			setState(61); match(FUNCTION);
			setState(62); functionName();
			setState(63); match(4);
			setState(64); functionArgsList();
			setState(65); match(2);
			setState(66); functionReturns();
			setState(67); match(AS);
			setState(68); functionBody();
			setState(69); match(LANGUAGE);
			setState(70); match(LANGUAGE_NAME);
			setState(72);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(71); functionSettings();
				}
			}

			setState(74); match(5);
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
		enterRule(_localctx, 8, RULE_functionArgsList);
		int _la;
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << VARIADIC) | (1L << ID))) != 0)) {
					{
					setState(76); functionArg();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); functionArg();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(80); match(3);
					setState(81); functionArg();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class FunctionArgContext extends ParserRuleContext {
		public Token argMode;
		public Token argName;
		public TerminalNode IN() { return getToken(PlPgSqlParser.IN, 0); }
		public TerminalNode DEFAULT() { return getToken(PlPgSqlParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode OUT() { return getToken(PlPgSqlParser.OUT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIADIC() { return getToken(PlPgSqlParser.VARIADIC, 0); }
		public TerminalNode INOUT() { return getToken(PlPgSqlParser.INOUT, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(PlPgSqlParser.ASSIGN_OP, 0); }
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
		enterRule(_localctx, 10, RULE_functionArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << VARIADIC))) != 0)) {
				{
				setState(89);
				((FunctionArgContext)_localctx).argMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << VARIADIC))) != 0)) ) {
					((FunctionArgContext)_localctx).argMode = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(92); ((FunctionArgContext)_localctx).argName = match(ID);
			setState(93); type();
			setState(96);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==DEFAULT) {
				{
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(95); expr();
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
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
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
		enterRule(_localctx, 12, RULE_functionReturns);
		int _la;
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); match(RETURNS);
				setState(99); type();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); match(RETURNS);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101); type();
					setState(102); match(ID);
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
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
		public List<TerminalNode> DOLLAR_QUOTE() { return getTokens(PlPgSqlParser.DOLLAR_QUOTE); }
		public TerminalNode DECLARE() { return getToken(PlPgSqlParser.DECLARE, 0); }
		public TerminalNode DOLLAR_QUOTE(int i) {
			return getToken(PlPgSqlParser.DOLLAR_QUOTE, i);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 14, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(DOLLAR_QUOTE);
			setState(113);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(111); match(DECLARE);
				setState(112); varDeclarationList();
				}
			}

			setState(115); block();
			setState(116); match(DOLLAR_QUOTE);
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
		public TerminalNode BEGIN() { return getToken(PlPgSqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(BEGIN);
			setState(119); stmts();
			setState(120); match(END);
			setState(121); match(5);
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
		enterRule(_localctx, 18, RULE_functionSettings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); window();
			setState(124); functionBehavior();
			setState(125); functionInputHandling();
			setState(126); functionSecurity();
			setState(127); functionCosts();
			setState(128); functionRows();
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
		enterRule(_localctx, 20, RULE_functionBehavior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMMUTABLE) | (1L << STABLE) | (1L << VOLATILE))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_window);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(WINDOW);
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
		enterRule(_localctx, 24, RULE_functionInputHandling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLED_ON_NULL_INPUT) | (1L << RETURNS_NULL_ON_NULL_INPUT) | (1L << STRICT))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_functionSecurity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		enterRule(_localctx, 28, RULE_functionCosts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(COST);
			setState(139); ((FunctionCostsContext)_localctx).value = match(INTEGER_VALUE);
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
		enterRule(_localctx, 30, RULE_functionRows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(ROWS);
			setState(142); ((FunctionRowsContext)_localctx).value = match(INTEGER_VALUE);
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
		enterRule(_localctx, 32, RULE_varDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(146);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(144); varDeclaration();
					}
					break;

				case 2:
					{
					setState(145); aliasDeclaration();
					}
					break;
				}
				}
				setState(150);
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
		public Token collationName;
		public TerminalNode DEFAULT() { return getToken(PlPgSqlParser.DEFAULT, 0); }
		public TerminalNode COLLATE() { return getToken(PlPgSqlParser.COLLATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode NOT() { return getToken(PlPgSqlParser.NOT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(PlPgSqlParser.ASSIGN_OP, 0); }
		public TerminalNode NULL() { return getToken(PlPgSqlParser.NULL, 0); }
		public TerminalNode CONSTANT() { return getToken(PlPgSqlParser.CONSTANT, 0); }
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
		enterRule(_localctx, 34, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); ((VarDeclarationContext)_localctx).varName = match(ID);
			setState(153);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(152); match(CONSTANT);
				}
			}

			setState(155); type();
			setState(158);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(156); match(COLLATE);
				setState(157); ((VarDeclarationContext)_localctx).collationName = match(ID);
				}
			}

			setState(162);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(160); match(NOT);
				setState(161); match(NULL);
				}
			}

			setState(166);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==DEFAULT) {
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(165); expr();
				}
			}

			setState(168); match(5);
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
		enterRule(_localctx, 36, RULE_aliasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); ((AliasDeclarationContext)_localctx).newVarName = match(ID);
			setState(171); match(ALIAS);
			setState(172); match(FOR);
			setState(173); ((AliasDeclarationContext)_localctx).oldVarName = match(ID);
			setState(174); match(5);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralContext extends ExprContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(PlPgSqlParser.DECIMAL_VALUE, 0); }
		public LiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(179);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new LiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176); match(STRING);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new LiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177); match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				_localctx = new LiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178); match(DECIMAL_VALUE);
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
		enterRule(_localctx, 40, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(181); stmt();
				}
				}
				setState(186);
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
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
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
		enterRule(_localctx, 42, RULE_stmt);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\64\u00c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\5\2\62"+
		"\n\2\3\3\6\3\65\n\3\r\3\16\3\66\3\4\3\4\3\5\3\5\3\5\5\5>\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\6\5\6P\n\6\3\6\3"+
		"\6\3\6\7\6U\n\6\f\6\16\6X\13\6\5\6Z\n\6\3\7\5\7]\n\7\3\7\3\7\3\7\3\7\5"+
		"\7c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\6\bk\n\b\r\b\16\bl\5\bo\n\b\3\t\3\t\3"+
		"\t\5\tt\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\7\22\u0095\n\22\f\22\16\22\u0098\13\22\3\23\3\23\5\23"+
		"\u009c\n\23\3\23\3\23\3\23\5\23\u00a1\n\23\3\23\3\23\5\23\u00a5\n\23\3"+
		"\23\3\23\5\23\u00a9\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u00b6\n\25\3\26\7\26\u00b9\n\26\f\26\16\26\u00bc\13\26"+
		"\3\27\3\27\3\27\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2"+
		"\7\3\2\21\24\3\2\27\30\3\2!#\3\2$&\3\2)*\u00be\2.\3\2\2\2\4\64\3\2\2\2"+
		"\68\3\2\2\2\b:\3\2\2\2\nY\3\2\2\2\f\\\3\2\2\2\16n\3\2\2\2\20p\3\2\2\2"+
		"\22x\3\2\2\2\24}\3\2\2\2\26\u0084\3\2\2\2\30\u0086\3\2\2\2\32\u0088\3"+
		"\2\2\2\34\u008a\3\2\2\2\36\u008c\3\2\2\2 \u008f\3\2\2\2\"\u0096\3\2\2"+
		"\2$\u0099\3\2\2\2&\u00ac\3\2\2\2(\u00b5\3\2\2\2*\u00ba\3\2\2\2,\u00bd"+
		"\3\2\2\2.\61\7\61\2\2/\60\7\3\2\2\60\62\7\61\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\3\3\2\2\2\63\65\5\b\5\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2"+
		"\2\2\66\67\3\2\2\2\67\5\3\2\2\289\7\61\2\29\7\3\2\2\2:=\7\r\2\2;<\7\20"+
		"\2\2<>\7\16\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\17\2\2@A\5\6\4\2AB\7"+
		"\6\2\2BC\5\n\6\2CD\7\4\2\2DE\5\16\b\2EF\7\33\2\2FG\5\20\t\2GH\7\25\2\2"+
		"HJ\7\26\2\2IK\5\24\13\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\7\2\2M\t\3\2"+
		"\2\2NP\5\f\7\2ON\3\2\2\2OP\3\2\2\2PZ\3\2\2\2QV\5\f\7\2RS\7\5\2\2SU\5\f"+
		"\7\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YO\3\2"+
		"\2\2YQ\3\2\2\2Z\13\3\2\2\2[]\t\2\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^"+
		"_\7\61\2\2_b\5\2\2\2`a\t\3\2\2ac\5(\25\2b`\3\2\2\2bc\3\2\2\2c\r\3\2\2"+
		"\2de\7\31\2\2eo\5\2\2\2fj\7\31\2\2gh\5\2\2\2hi\7\61\2\2ik\3\2\2\2jg\3"+
		"\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nd\3\2\2\2nf\3\2\2\2o\17"+
		"\3\2\2\2ps\7\37\2\2qr\7\34\2\2rt\5\"\22\2sq\3\2\2\2st\3\2\2\2tu\3\2\2"+
		"\2uv\5\22\n\2vw\7\37\2\2w\21\3\2\2\2xy\7\35\2\2yz\5*\26\2z{\7\36\2\2{"+
		"|\7\7\2\2|\23\3\2\2\2}~\5\30\r\2~\177\5\26\f\2\177\u0080\5\32\16\2\u0080"+
		"\u0081\5\34\17\2\u0081\u0082\5\36\20\2\u0082\u0083\5 \21\2\u0083\25\3"+
		"\2\2\2\u0084\u0085\t\4\2\2\u0085\27\3\2\2\2\u0086\u0087\7 \2\2\u0087\31"+
		"\3\2\2\2\u0088\u0089\t\5\2\2\u0089\33\3\2\2\2\u008a\u008b\t\6\2\2\u008b"+
		"\35\3\2\2\2\u008c\u008d\7+\2\2\u008d\u008e\7\t\2\2\u008e\37\3\2\2\2\u008f"+
		"\u0090\7,\2\2\u0090\u0091\7\t\2\2\u0091!\3\2\2\2\u0092\u0095\5$\23\2\u0093"+
		"\u0095\5&\24\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097#\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009b\7\61\2\2\u009a\u009c\7-\2\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\5\2\2\2\u009e\u009f\7."+
		"\2\2\u009f\u00a1\7\61\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3\u00a5\7\60\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7"+
		"\u00a9\5(\25\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\7\7\2\2\u00ab%\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae"+
		"\7\13\2\2\u00ae\u00af\7\f\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\7\7\2\2"+
		"\u00b1\'\3\2\2\2\u00b2\u00b6\7\b\2\2\u00b3\u00b6\7\t\2\2\u00b4\u00b6\7"+
		"\n\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		")\3\2\2\2\u00b7\u00b9\5,\27\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb+\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bd\u00be\7\61\2\2\u00be-\3\2\2\2\26\61\66=JOVY\\blns\u0094\u0096"+
		"\u009b\u00a0\u00a4\u00a8\u00b5\u00ba";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}