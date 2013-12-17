// Generated from de/zalando/plpgsql/ast/CommonParserRules.g4 by ANTLR 4.1
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
public class CommonParserRulesParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, LIKE=8, SIMILAR=9, 
		TO=10, AND=11, OR=12, ASSIGN_OP=13, BETWEEN=14, IS=15, NOT=16, ISNULL=17, 
		NOTNULL=18, MUL=19, DIV=20, MOD=21, ADD=22, SUB=23, EQ=24, NEQ=25, LT=26, 
		LTE=27, GT=28, GTE=29, SELECT=30, ALL=31, DISTINCT=32, FROM=33, WHERE=34, 
		GROUP_BY=35, GROUP=36, BY=37, ORDER_BY=38, ORDER=39, LIMIT=40, OFFSET=41, 
		ROW=42, ROWS=43, FETCH=44, ONLY=45, UPDATE=46, SHARE=47, OF=48, NOWAIT=49, 
		INTO=50, STRICT=51, UNION=52, INTERSECT=53, EXCEPT=54, ASC=55, DESC=56, 
		USING=57, NULLS=58, FIRST=59, NEXT=60, LAST=61, CAST=62, ALIAS=63, FOR=64, 
		CREATE=65, REPLACE=66, FUNCTION=67, IN=68, OUT=69, INOUT=70, VARIADIC=71, 
		ON=72, HAVING=73, LANGUAGE=74, LANGUAGE_NAME=75, EXCEPTION=76, DEFAULT=77, 
		RETURNS=78, TABLE=79, AS=80, DECLARE=81, BEGIN=82, END=83, WHEN=84, THEN=85, 
		WINDOW=86, IMMUTABLE=87, STABLE=88, VOLATILE=89, CALLED_ON_NULL_INPUT=90, 
		RETURNS_NULL_ON_NULL_INPUT=91, EXTERNAL=92, SECURITY=93, SECURITY_INVOKER=94, 
		SECURITY_DEFINER=95, COST=96, CONSTANT=97, COLLATE=98, NULL=99, TRUE=100, 
		FALSE=101, UNKNOWN=102, DOLLAR_QUOTE=103, QUOTE=104, INTEGER_VALUE=105, 
		DECIMAL_VALUE=106, ID=107, QNAME=108, ARRAY_TYPE=109, COPY_TYPE=110, ROW_TYPE=111, 
		STRING=112, SL_COMMENT=113, ML_COMMENT=114, WS=115;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'^'", "')'", "','", "'::'", "'['", "'('", "LIKE", 
		"SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", "IS", "NOT", "ISNULL", 
		"NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "NEQ", "'<'", "'<='", 
		"'>'", "'>='", "SELECT", "ALL", "DISTINCT", "FROM", "WHERE", "GROUP_BY", 
		"GROUP", "BY", "ORDER_BY", "ORDER", "LIMIT", "OFFSET", "ROW", "ROWS", 
		"FETCH", "ONLY", "UPDATE", "SHARE", "OF", "NOWAIT", "INTO", "STRICT", 
		"UNION", "INTERSECT", "EXCEPT", "ASC", "DESC", "USING", "NULLS", "FIRST", 
		"NEXT", "LAST", "CAST", "ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", 
		"IN", "OUT", "INOUT", "VARIADIC", "ON", "HAVING", "LANGUAGE", "LANGUAGE_NAME", 
		"EXCEPTION", "DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", 
		"END", "WHEN", "THEN", "WINDOW", "IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", 
		"RETURNS_NULL_ON_NULL_INPUT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", 
		"SECURITY_DEFINER", "COST", "CONSTANT", "COLLATE", "NULL", "TRUE", "FALSE", 
		"UNKNOWN", "DOLLAR_QUOTE", "'''", "INTEGER_VALUE", "DECIMAL_VALUE", "ID", 
		"QNAME", "ARRAY_TYPE", "COPY_TYPE", "ROW_TYPE", "STRING", "SL_COMMENT", 
		"ML_COMMENT", "WS"
	};
	public static final int
		RULE_varExpr = 0, RULE_functionCallExpr = 1, RULE_numericConstant = 2, 
		RULE_constantOfOtherTypes = 3, RULE_numericalLiteralExpr = 4, RULE_booleanLiteralExpr = 5, 
		RULE_stringLiteralExpr = 6, RULE_expression = 7, RULE_assignOperator = 8;
	public static final String[] ruleNames = {
		"varExpr", "functionCallExpr", "numericConstant", "constantOfOtherTypes", 
		"numericalLiteralExpr", "booleanLiteralExpr", "stringLiteralExpr", "expression", 
		"assignOperator"
	};

	@Override
	public String getGrammarFileName() { return "CommonParserRules.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommonParserRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VarExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(ID);
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
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExprContext functionCallExpr() throws RecognitionException {
		FunctionCallExprContext _localctx = new FunctionCallExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionCallExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
			setState(21); match(7);
			setState(30);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << CAST))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (TRUE - 100)) | (1L << (FALSE - 100)) | (1L << (INTEGER_VALUE - 100)) | (1L << (DECIMAL_VALUE - 100)) | (1L << (ID - 100)) | (1L << (QNAME - 100)) | (1L << (ARRAY_TYPE - 100)) | (1L << (COPY_TYPE - 100)) | (1L << (ROW_TYPE - 100)) | (1L << (STRING - 100)))) != 0)) {
				{
				setState(22); expression(0);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(23); match(4);
					setState(24); expression(0);
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(32); match(3);
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
			return getToken(CommonParserRulesParser.QUOTE, i);
		}
		public TerminalNode ARRAY_TYPE() { return getToken(CommonParserRulesParser.ARRAY_TYPE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(CommonParserRulesParser.INTEGER_VALUE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(CommonParserRulesParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(CommonParserRulesParser.QNAME, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(CommonParserRulesParser.QUOTE); }
		public TerminalNode ROW_TYPE() { return getToken(CommonParserRulesParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(CommonParserRulesParser.DECIMAL_VALUE, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericConstant);
		int _la;
		try {
			setState(41);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(35); match(5);
				setState(36);
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
				setState(37);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(38); match(QUOTE);
				setState(39);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(40); match(QUOTE);
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
		public TerminalNode AS() { return getToken(CommonParserRulesParser.AS, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(CommonParserRulesParser.ARRAY_TYPE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(CommonParserRulesParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(CommonParserRulesParser.QNAME, 0); }
		public TerminalNode ROW_TYPE() { return getToken(CommonParserRulesParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public TerminalNode STRING() { return getToken(CommonParserRulesParser.STRING, 0); }
		public TerminalNode CAST() { return getToken(CommonParserRulesParser.CAST, 0); }
		public ConstantOfOtherTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantOfOtherTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterConstantOfOtherTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitConstantOfOtherTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitConstantOfOtherTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantOfOtherTypesContext constantOfOtherTypes() throws RecognitionException {
		ConstantOfOtherTypesContext _localctx = new ConstantOfOtherTypesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constantOfOtherTypes);
		int _la;
		try {
			setState(54);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(44); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(46); match(5);
				setState(47);
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
				setState(48); match(CAST);
				setState(49); match(7);
				setState(50); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(51); match(AS);
				setState(52);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (ID - 107)) | (1L << (QNAME - 107)) | (1L << (ARRAY_TYPE - 107)) | (1L << (COPY_TYPE - 107)) | (1L << (ROW_TYPE - 107)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(53); match(3);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericalConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericalConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericalConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalLiteralContext extends NumericalLiteralExprContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(CommonParserRulesParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumericalLiteralExprContext {
		public TerminalNode INTEGER_VALUE() { return getToken(CommonParserRulesParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalLiteralExprContext numericalLiteralExpr() throws RecognitionException {
		NumericalLiteralExprContext _localctx = new NumericalLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numericalLiteralExpr);
		try {
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NumericalConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56); numericConstant();
				}
				break;

			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57); match(INTEGER_VALUE);
				}
				break;

			case 3:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58); match(DECIMAL_VALUE);
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
		public TerminalNode NOT() { return getToken(CommonParserRulesParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateExpressionContext(BooleanLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNegateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNegateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNegateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends BooleanLiteralExprContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(CommonParserRulesParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CommonParserRulesParser.FALSE, 0); }
		public BooleanLiteralContext(BooleanLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralExprContext booleanLiteralExpr() throws RecognitionException {
		BooleanLiteralExprContext _localctx = new BooleanLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_booleanLiteralExpr);
		int _la;
		try {
			setState(64);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61); match(NOT);
				setState(62); expression(0);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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
		public TerminalNode STRING() { return getToken(CommonParserRulesParser.STRING, 0); }
		public StringLiteralContext(StringLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralExprContext stringLiteralExpr() throws RecognitionException {
		StringLiteralExprContext _localctx = new StringLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringLiteralExpr);
		try {
			_localctx = new StringLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(STRING);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericalLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericalLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericalLiteralExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterStringLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitStringLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitVariableExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterBooleanLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitBooleanLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitBooleanLiteralExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitExpressionGroup(this);
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
		public TerminalNode SUB() { return getToken(CommonParserRulesParser.SUB, 0); }
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token unaryOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CommonParserRulesParser.SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CommonParserRulesParser.MUL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitMulExpression(this);
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
		public TerminalNode ADD() { return getToken(CommonParserRulesParser.ADD, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeExpressionContext extends ExpressionContext {
		public Token not;
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CommonParserRulesParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LIKE() { return getToken(CommonParserRulesParser.LIKE, 0); }
		public LikeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterLikeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitLikeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitLikeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(CommonParserRulesParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitDivExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterExponentiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitExponentiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitExponentiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelExpressionContext extends ExpressionContext {
		public Token label;
		public TerminalNode AS() { return getToken(CommonParserRulesParser.AS, 0); }
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterLabelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitLabelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitLabelExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterArbitraryConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitArbitraryConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitArbitraryConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(CommonParserRulesParser.GTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalConjunctionExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(CommonParserRulesParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LogicalConjunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterLogicalConjunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitLogicalConjunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitLogicalConjunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimilarToExpressionContext extends ExpressionContext {
		public Token not;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SIMILAR() { return getToken(CommonParserRulesParser.SIMILAR, 0); }
		public TerminalNode NOT() { return getToken(CommonParserRulesParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode TO() { return getToken(CommonParserRulesParser.TO, 0); }
		public SimilarToExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterSimilarToExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitSimilarToExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitSimilarToExpression(this);
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
		public TerminalNode MOD() { return getToken(CommonParserRulesParser.MOD, 0); }
		public ModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(70); expression(16);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(72); expression(15);
				}
				break;

			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74); match(7);
				setState(75); expression(0);
				setState(76); match(3);
				}
				break;

			case 5:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78); constantOfOtherTypes();
				}
				break;

			case 6:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79); varExpr();
				}
				break;

			case 7:
				{
				_localctx = new BooleanLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80); booleanLiteralExpr();
				}
				break;

			case 8:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81); numericalLiteralExpr();
				}
				break;

			case 9:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82); stringLiteralExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(86); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(87); expression(25);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(89); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(90); expression(24);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(92); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(93); expression(23);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(95); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(96); expression(22);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(98); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(99); expression(21);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(101); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(102); expression(20);
						}
						break;

					case 7:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(104); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(105); expression(15);
						}
						break;

					case 8:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(107); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(108); expression(14);
						}
						break;

					case 9:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(110); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(111); expression(13);
						}
						break;

					case 10:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(113); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(114); expression(12);
						}
						break;

					case 11:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(116); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(117); expression(11);
						}
						break;

					case 12:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(119); match(2);
						setState(120); expression(9);
						}
						break;

					case 13:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(122); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(123); expression(9);
						}
						break;

					case 14:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(125); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(126); expression(8);
						}
						break;

					case 15:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(132); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(128); match(6);
								setState(129); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = expression(0);
								setState(130); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(134); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 16:
						{
						_localctx = new LikeExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(138);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(137); ((LikeExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(140); ((LikeExpressionContext)_localctx).operator = match(LIKE);
						setState(141); expression(0);
						}
						break;

					case 17:
						{
						_localctx = new SimilarToExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(144);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(143); ((SimilarToExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(146); match(SIMILAR);
						setState(147); match(TO);
						setState(148); expression(0);
						}
						break;

					case 18:
						{
						_localctx = new LabelExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(150); match(AS);
						setState(151); ((LabelExpressionContext)_localctx).label = match(ID);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode ASSIGN_OP() { return getToken(CommonParserRulesParser.ASSIGN_OP, 0); }
		public TerminalNode EQ() { return getToken(CommonParserRulesParser.EQ, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3u\u00a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\5\3!\n\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\59\n\5\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\5\7C\n\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tV\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0087\n\t\r\t\16\t"+
		"\u0088\3\t\3\t\5\t\u008d\n\t\3\t\3\t\3\t\3\t\5\t\u0093\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e\13\t\3\n\3\n\3\n\2\13\2\4\6"+
		"\b\n\f\16\20\22\2\6\3\2kl\3\2mq\3\2fg\4\2\17\17\32\32\u00bd\2\24\3\2\2"+
		"\2\4\26\3\2\2\2\6+\3\2\2\2\b8\3\2\2\2\n=\3\2\2\2\fB\3\2\2\2\16D\3\2\2"+
		"\2\20U\3\2\2\2\22\u009f\3\2\2\2\24\25\7m\2\2\25\3\3\2\2\2\26\27\7m\2\2"+
		"\27 \7\t\2\2\30\35\5\20\t\2\31\32\7\6\2\2\32\34\5\20\t\2\33\31\3\2\2\2"+
		"\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2 "+
		"\30\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\5\2\2#\5\3\2\2\2$%\t\2\2\2%&\7\7"+
		"\2\2&,\t\3\2\2\'(\t\3\2\2()\7j\2\2)*\t\2\2\2*,\7j\2\2+$\3\2\2\2+\'\3\2"+
		"\2\2,\7\3\2\2\2-.\t\3\2\2.9\7r\2\2/\60\7r\2\2\60\61\7\7\2\2\619\t\3\2"+
		"\2\62\63\7@\2\2\63\64\7\t\2\2\64\65\7r\2\2\65\66\7R\2\2\66\67\t\3\2\2"+
		"\679\7\5\2\28-\3\2\2\28/\3\2\2\28\62\3\2\2\29\t\3\2\2\2:>\5\6\4\2;>\7"+
		"k\2\2<>\7l\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\13\3\2\2\2?@\7\22\2\2@C"+
		"\5\20\t\2AC\t\4\2\2B?\3\2\2\2BA\3\2\2\2C\r\3\2\2\2DE\7r\2\2E\17\3\2\2"+
		"\2FG\b\t\1\2GH\7\30\2\2HV\5\20\t\2IJ\7\31\2\2JV\5\20\t\2KV\5\4\3\2LM\7"+
		"\t\2\2MN\5\20\t\2NO\7\5\2\2OV\3\2\2\2PV\5\b\5\2QV\5\2\2\2RV\5\f\7\2SV"+
		"\5\n\6\2TV\5\16\b\2UF\3\2\2\2UI\3\2\2\2UK\3\2\2\2UL\3\2\2\2UP\3\2\2\2"+
		"UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\u009c\3\2\2\2WX\6\t\2\3XY\7"+
		"\32\2\2Y\u009b\5\20\t\2Z[\6\t\3\3[\\\7\33\2\2\\\u009b\5\20\t\2]^\6\t\4"+
		"\3^_\7\34\2\2_\u009b\5\20\t\2`a\6\t\5\3ab\7\35\2\2b\u009b\5\20\t\2cd\6"+
		"\t\6\3de\7\36\2\2e\u009b\5\20\t\2fg\6\t\7\3gh\7\37\2\2h\u009b\5\20\t\2"+
		"ij\6\t\b\3jk\7\25\2\2k\u009b\5\20\t\2lm\6\t\t\3mn\7\26\2\2n\u009b\5\20"+
		"\t\2op\6\t\n\3pq\7\27\2\2q\u009b\5\20\t\2rs\6\t\13\3st\7\30\2\2t\u009b"+
		"\5\20\t\2uv\6\t\f\3vw\7\31\2\2w\u009b\5\20\t\2xy\6\t\r\3yz\7\4\2\2z\u009b"+
		"\5\20\t\2{|\6\t\16\3|}\7\r\2\2}\u009b\5\20\t\2~\177\6\t\17\3\177\u0080"+
		"\7\16\2\2\u0080\u009b\5\20\t\2\u0081\u0086\6\t\20\3\u0082\u0083\7\b\2"+
		"\2\u0083\u0084\5\20\t\2\u0084\u0085\7\3\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0082\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u009b\3\2\2\2\u008a\u008c\6\t\21\3\u008b\u008d\7\22\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\n"+
		"\2\2\u008f\u009b\5\20\t\2\u0090\u0092\6\t\22\3\u0091\u0093\7\22\2\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\13"+
		"\2\2\u0095\u0096\7\f\2\2\u0096\u009b\5\20\t\2\u0097\u0098\6\t\23\3\u0098"+
		"\u0099\7R\2\2\u0099\u009b\7m\2\2\u009aW\3\2\2\2\u009aZ\3\2\2\2\u009a]"+
		"\3\2\2\2\u009a`\3\2\2\2\u009ac\3\2\2\2\u009af\3\2\2\2\u009ai\3\2\2\2\u009a"+
		"l\3\2\2\2\u009ao\3\2\2\2\u009ar\3\2\2\2\u009au\3\2\2\2\u009ax\3\2\2\2"+
		"\u009a{\3\2\2\2\u009a~\3\2\2\2\u009a\u0081\3\2\2\2\u009a\u008a\3\2\2\2"+
		"\u009a\u0090\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\21\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\t\5\2\2\u00a0\23\3\2\2\2\16\35 +8=BU\u0088\u008c\u0092\u009a\u009c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}