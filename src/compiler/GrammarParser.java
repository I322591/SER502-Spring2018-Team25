// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		Space=25, Digit=26, Identifier=27, Cap=28, StartBrace=29, EndBrace=30, 
		StartQuotes=31, EndQuotes=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'var'", "'terminate'", "'true'", "'range'", "'>='", 
		"';'", "'<'", "'=='", "'otherwise'", "'='", "'>'", "' '", "'until'", "'<='", 
		"'check'", "'start'", "'display'", "'*'", "'+'", "'then'", "','", "'-'", 
		"'false'", "''", "Digit", "Identifier", "Cap", "'{'", "'}'", "StartQuotes", 
		"EndQuotes"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_declaration = 2, RULE_command = 3, 
		RULE_disp = 4, RULE_bool = 5, RULE_addSubExpression = 6, RULE_mulDivExpression = 7, 
		RULE_term = 8, RULE_number = 9, RULE_value = 10, RULE_string = 11;
	public static final String[] ruleNames = {
		"program", "block", "declaration", "command", "disp", "bool", "addSubExpression", 
		"mulDivExpression", "term", "number", "value", "string"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); block();
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(T__7);
			setState(27); declaration();
			setState(28); match(T__17);
			setState(29); command();
			setState(30); match(T__21);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DispContext disp() {
			return getRuleContext(DispContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); match(T__22);
				setState(33); match(Identifier);
				setState(34); match(T__13);
				setState(35); number();
				setState(36); match(T__17);
				setState(37); declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); match(T__22);
				setState(40); match(Identifier);
				setState(41); match(T__13);
				setState(42); number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43); match(T__22);
				setState(44); match(Identifier);
				setState(45); match(T__17);
				setState(46); declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47); match(T__22);
				setState(48); match(Identifier);
				setState(49); disp();
				setState(50); match(T__17);
				setState(51); declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53); disp();
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public List<TerminalNode> StartBrace() { return getTokens(GrammarParser.StartBrace); }
		public TerminalNode StartBrace(int i) {
			return getToken(GrammarParser.StartBrace, i);
		}
		public DispContext disp() {
			return getRuleContext(DispContext.class,0);
		}
		public TerminalNode EndBrace(int i) {
			return getToken(GrammarParser.EndBrace, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<TerminalNode> EndBrace() { return getTokens(GrammarParser.EndBrace); }
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); match(Identifier);
				setState(57); match(T__13);
				setState(58); addSubExpression();
				setState(59); match(T__17);
				setState(60); command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); match(Identifier);
				setState(63); match(T__13);
				setState(64); addSubExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); match(T__8);
				setState(66); bool();
				setState(67); match(T__3);
				setState(68); match(StartBrace);
				setState(69); command();
				setState(70); match(EndBrace);
				setState(71); match(T__14);
				setState(72); match(StartBrace);
				setState(73); command();
				setState(74); match(EndBrace);
				setState(75); match(T__17);
				setState(76); command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78); match(T__8);
				setState(79); bool();
				setState(80); match(T__3);
				setState(81); match(StartBrace);
				setState(82); command();
				setState(83); match(EndBrace);
				setState(84); match(T__14);
				setState(85); match(StartBrace);
				setState(86); command();
				setState(87); match(EndBrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89); match(T__10);
				setState(90); bool();
				setState(91); match(StartBrace);
				setState(92); command();
				setState(93); match(EndBrace);
				setState(94); match(T__17);
				setState(95); command();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97); match(T__10);
				setState(98); bool();
				setState(99); match(StartBrace);
				setState(100); command();
				setState(101); match(EndBrace);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103); disp();
				setState(104); match(T__17);
				setState(105); command();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(107); disp();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(108); block();
				setState(109); match(T__17);
				setState(110); command();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(112); block();
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

	public static class DispContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public TerminalNode StartQuotes() { return getToken(GrammarParser.StartQuotes, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode StartBrace() { return getToken(GrammarParser.StartBrace, 0); }
		public TerminalNode EndQuotes() { return getToken(GrammarParser.EndQuotes, 0); }
		public TerminalNode EndBrace() { return getToken(GrammarParser.EndBrace, 0); }
		public DispContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDisp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDisp(this);
		}
	}

	public final DispContext disp() throws RecognitionException {
		DispContext _localctx = new DispContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_disp);
		try {
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); match(T__6);
				setState(116); match(StartBrace);
				setState(117); match(Identifier);
				setState(118); match(EndBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(T__6);
				setState(120); match(StartBrace);
				setState(121); match(StartQuotes);
				setState(122); string();
				setState(123); match(EndQuotes);
				setState(124); match(EndBrace);
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

	public static class BoolContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddSubExpressionContext> addSubExpression() {
			return getRuleContexts(AddSubExpressionContext.class);
		}
		public TerminalNode StartBrace() { return getToken(GrammarParser.StartBrace, 0); }
		public TerminalNode EndBrace() { return getToken(GrammarParser.EndBrace, 0); }
		public AddSubExpressionContext addSubExpression(int i) {
			return getRuleContext(AddSubExpressionContext.class,i);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool);
		try {
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130); addSubExpression();
				setState(131); match(T__15);
				setState(132); addSubExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); addSubExpression();
				setState(135); match(T__16);
				setState(136); addSubExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138); addSubExpression();
				setState(139); match(T__12);
				setState(140); addSubExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142); addSubExpression();
				setState(143); match(T__9);
				setState(144); addSubExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146); addSubExpression();
				setState(147); match(T__18);
				setState(148); addSubExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150); match(T__19);
				setState(151); match(StartBrace);
				setState(152); term();
				setState(153); match(T__2);
				setState(154); term();
				setState(155); match(EndBrace);
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

	public static class AddSubExpressionContext extends ParserRuleContext {
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public AddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddSubExpression(this);
		}
	}

	public final AddSubExpressionContext addSubExpression() throws RecognitionException {
		AddSubExpressionContext _localctx = new AddSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addSubExpression);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); mulDivExpression();
				setState(160); match(T__4);
				setState(161); addSubExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); mulDivExpression();
				setState(164); match(T__1);
				setState(165); addSubExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); mulDivExpression();
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

	public static class MulDivExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public MulDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulDivExpression(this);
		}
	}

	public final MulDivExpressionContext mulDivExpression() throws RecognitionException {
		MulDivExpressionContext _localctx = new MulDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mulDivExpression);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); term();
				setState(171); match(T__23);
				setState(172); mulDivExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); term();
				setState(175); match(T__5);
				setState(176); mulDivExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178); term();
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

	public static class TermContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); number();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); match(Identifier);
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

	public static class NumberContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Digit() { return getToken(GrammarParser.Digit, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(Digit);
			setState(186); value();
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

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Space() { return getToken(GrammarParser.Space, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case Space:
				enterOuterAlt(_localctx, 1);
				{
				setState(188); match(Space);
				}
				break;
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); number();
				setState(190); value();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Cap() { return getToken(GrammarParser.Cap, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); match(Identifier);
				setState(195); string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); match(Identifier);
				setState(197); match(T__11);
				setState(198); string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199); match(Cap);
				setState(200); string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201); match(Cap);
				setState(202); match(T__11);
				setState(203); string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204); match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205); match(Cap);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00d3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0081\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00a0\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ab\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b6\n\t\3\n\3\n\5\n\u00ba\n\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00c3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d1\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\2\u00e6\2\32\3\2\2\2\4\34\3\2\2\2\68\3\2\2\2\bs\3\2\2\2\n\u0080"+
		"\3\2\2\2\f\u009f\3\2\2\2\16\u00aa\3\2\2\2\20\u00b5\3\2\2\2\22\u00b9\3"+
		"\2\2\2\24\u00bb\3\2\2\2\26\u00c2\3\2\2\2\30\u00d0\3\2\2\2\32\33\5\4\3"+
		"\2\33\3\3\2\2\2\34\35\7\23\2\2\35\36\5\6\4\2\36\37\7\t\2\2\37 \5\b\5\2"+
		" !\7\5\2\2!\5\3\2\2\2\"#\7\4\2\2#$\7\35\2\2$%\7\r\2\2%&\5\24\13\2&\'\7"+
		"\t\2\2\'(\5\6\4\2(9\3\2\2\2)*\7\4\2\2*+\7\35\2\2+,\7\r\2\2,9\5\24\13\2"+
		"-.\7\4\2\2./\7\35\2\2/\60\7\t\2\2\609\5\6\4\2\61\62\7\4\2\2\62\63\7\35"+
		"\2\2\63\64\5\n\6\2\64\65\7\t\2\2\65\66\5\6\4\2\669\3\2\2\2\679\5\n\6\2"+
		"8\"\3\2\2\28)\3\2\2\28-\3\2\2\28\61\3\2\2\28\67\3\2\2\29\7\3\2\2\2:;\7"+
		"\35\2\2;<\7\r\2\2<=\5\16\b\2=>\7\t\2\2>?\5\b\5\2?t\3\2\2\2@A\7\35\2\2"+
		"AB\7\r\2\2Bt\5\16\b\2CD\7\22\2\2DE\5\f\7\2EF\7\27\2\2FG\7\37\2\2GH\5\b"+
		"\5\2HI\7 \2\2IJ\7\f\2\2JK\7\37\2\2KL\5\b\5\2LM\7 \2\2MN\7\t\2\2NO\5\b"+
		"\5\2Ot\3\2\2\2PQ\7\22\2\2QR\5\f\7\2RS\7\27\2\2ST\7\37\2\2TU\5\b\5\2UV"+
		"\7 \2\2VW\7\f\2\2WX\7\37\2\2XY\5\b\5\2YZ\7 \2\2Zt\3\2\2\2[\\\7\20\2\2"+
		"\\]\5\f\7\2]^\7\37\2\2^_\5\b\5\2_`\7 \2\2`a\7\t\2\2ab\5\b\5\2bt\3\2\2"+
		"\2cd\7\20\2\2de\5\f\7\2ef\7\37\2\2fg\5\b\5\2gh\7 \2\2ht\3\2\2\2ij\5\n"+
		"\6\2jk\7\t\2\2kl\5\b\5\2lt\3\2\2\2mt\5\n\6\2no\5\4\3\2op\7\t\2\2pq\5\b"+
		"\5\2qt\3\2\2\2rt\5\4\3\2s:\3\2\2\2s@\3\2\2\2sC\3\2\2\2sP\3\2\2\2s[\3\2"+
		"\2\2sc\3\2\2\2si\3\2\2\2sm\3\2\2\2sn\3\2\2\2sr\3\2\2\2t\t\3\2\2\2uv\7"+
		"\24\2\2vw\7\37\2\2wx\7\35\2\2x\u0081\7 \2\2yz\7\24\2\2z{\7\37\2\2{|\7"+
		"!\2\2|}\5\30\r\2}~\7\"\2\2~\177\7 \2\2\177\u0081\3\2\2\2\u0080u\3\2\2"+
		"\2\u0080y\3\2\2\2\u0081\13\3\2\2\2\u0082\u00a0\7\6\2\2\u0083\u00a0\7\32"+
		"\2\2\u0084\u0085\5\16\b\2\u0085\u0086\7\13\2\2\u0086\u0087\5\16\b\2\u0087"+
		"\u00a0\3\2\2\2\u0088\u0089\5\16\b\2\u0089\u008a\7\n\2\2\u008a\u008b\5"+
		"\16\b\2\u008b\u00a0\3\2\2\2\u008c\u008d\5\16\b\2\u008d\u008e\7\16\2\2"+
		"\u008e\u008f\5\16\b\2\u008f\u00a0\3\2\2\2\u0090\u0091\5\16\b\2\u0091\u0092"+
		"\7\21\2\2\u0092\u0093\5\16\b\2\u0093\u00a0\3\2\2\2\u0094\u0095\5\16\b"+
		"\2\u0095\u0096\7\b\2\2\u0096\u0097\5\16\b\2\u0097\u00a0\3\2\2\2\u0098"+
		"\u0099\7\7\2\2\u0099\u009a\7\37\2\2\u009a\u009b\5\22\n\2\u009b\u009c\7"+
		"\30\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7 \2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u0082\3\2\2\2\u009f\u0083\3\2\2\2\u009f\u0084\3\2\2\2\u009f\u0088\3\2"+
		"\2\2\u009f\u008c\3\2\2\2\u009f\u0090\3\2\2\2\u009f\u0094\3\2\2\2\u009f"+
		"\u0098\3\2\2\2\u00a0\r\3\2\2\2\u00a1\u00a2\5\20\t\2\u00a2\u00a3\7\26\2"+
		"\2\u00a3\u00a4\5\16\b\2\u00a4\u00ab\3\2\2\2\u00a5\u00a6\5\20\t\2\u00a6"+
		"\u00a7\7\31\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00ab\3\2\2\2\u00a9\u00ab\5"+
		"\20\t\2\u00aa\u00a1\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\17\3\2\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7\3\2\2\u00ae\u00af\5\20"+
		"\t\2\u00af\u00b6\3\2\2\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\7\25\2\2\u00b2"+
		"\u00b3\5\20\t\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\5\22\n\2\u00b5\u00ac\3"+
		"\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\21\3\2\2\2\u00b7"+
		"\u00ba\5\24\13\2\u00b8\u00ba\7\35\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\23\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc\u00bd\5\26\f\2\u00bd"+
		"\25\3\2\2\2\u00be\u00c3\7\33\2\2\u00bf\u00c0\5\24\13\2\u00c0\u00c1\5\26"+
		"\f\2\u00c1\u00c3\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3"+
		"\27\3\2\2\2\u00c4\u00c5\7\35\2\2\u00c5\u00d1\5\30\r\2\u00c6\u00c7\7\35"+
		"\2\2\u00c7\u00c8\7\17\2\2\u00c8\u00d1\5\30\r\2\u00c9\u00ca\7\36\2\2\u00ca"+
		"\u00d1\5\30\r\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00d1"+
		"\5\30\r\2\u00ce\u00d1\7\35\2\2\u00cf\u00d1\7\36\2\2\u00d0\u00c4\3\2\2"+
		"\2\u00d0\u00c6\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\31\3\2\2\2\138s\u0080\u009f\u00aa\u00b5"+
		"\u00b9\u00c2\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}