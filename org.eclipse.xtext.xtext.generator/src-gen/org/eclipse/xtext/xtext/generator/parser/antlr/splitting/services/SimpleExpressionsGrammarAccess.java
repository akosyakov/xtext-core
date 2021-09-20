/*
 * generated by Xtext
 */
package org.eclipse.xtext.xtext.generator.parser.antlr.splitting.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SimpleExpressionsGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class IfConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.IfCondition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElseifAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cElseifElseKeyword_0_0 = (Keyword)cElseifAssignment_0.eContents().get(0);
		private final Keyword cIfKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConditionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConditionExpressionParserRuleCall_3_0 = (RuleCall)cConditionAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//IfCondition:
		//  (elseif ?= 'else')? 'if' '(' condition = Expression ')' '{';
		@Override public ParserRule getRule() { return rule; }
		
		//(elseif ?= 'else')? 'if' '(' condition = Expression ')' '{'
		public Group getGroup() { return cGroup; }
		
		//(elseif ?= 'else')?
		public Assignment getElseifAssignment_0() { return cElseifAssignment_0; }
		
		//'else'
		public Keyword getElseifElseKeyword_0_0() { return cElseifElseKeyword_0_0; }
		
		//'if'
		public Keyword getIfKeyword_1() { return cIfKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//condition = Expression
		public Assignment getConditionAssignment_3() { return cConditionAssignment_3; }
		
		//Expression
		public RuleCall getConditionExpressionParserRuleCall_3_0() { return cConditionExpressionParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrExpressionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cVerticalLineVerticalLineKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Expression returns Expression:
		//    AndExpression ( {OrExpression.left = current} '||' right = AndExpression )*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//AndExpression ( {OrExpression.left = current} '||' right = AndExpression )*
		public Group getGroup() { return cGroup; }
		
		//AndExpression
		public RuleCall getAndExpressionParserRuleCall_0() { return cAndExpressionParserRuleCall_0; }
		
		//( {OrExpression.left = current} '||' right = AndExpression )*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrExpression.left = current}
		public Action getOrExpressionLeftAction_1_0() { return cOrExpressionLeftAction_1_0; }
		
		//'||'
		public Keyword getVerticalLineVerticalLineKeyword_1_1() { return cVerticalLineVerticalLineKeyword_1_1; }
		
		//right = AndExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//AndExpression
		public RuleCall getRightAndExpressionParserRuleCall_1_2_0() { return cRightAndExpressionParserRuleCall_1_2_0; }
	}
	public class AndExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.AndExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cComparisonParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndExpressionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAmpersandAmpersandKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightComparisonParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AndExpression returns Expression:
		//    Comparison ( {AndExpression.left = current} '&&' right = Comparison )*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Comparison ( {AndExpression.left = current} '&&' right = Comparison )*
		public Group getGroup() { return cGroup; }
		
		//Comparison
		public RuleCall getComparisonParserRuleCall_0() { return cComparisonParserRuleCall_0; }
		
		//( {AndExpression.left = current} '&&' right = Comparison )*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndExpression.left = current}
		public Action getAndExpressionLeftAction_1_0() { return cAndExpressionLeftAction_1_0; }
		
		//'&&'
		public Keyword getAmpersandAmpersandKeyword_1_1() { return cAmpersandAmpersandKeyword_1_1; }
		
		//right = Comparison
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Comparison
		public RuleCall getRightComparisonParserRuleCall_1_2_0() { return cRightComparisonParserRuleCall_1_2_0; }
	}
	public class ComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.Comparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrefixExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cComparisonLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOperatorAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOperatorAlternatives_1_1_0 = (Alternatives)cOperatorAssignment_1_1.eContents().get(0);
		private final Keyword cOperatorEqualsSignEqualsSignKeyword_1_1_0_0 = (Keyword)cOperatorAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOperatorLessThanSignEqualsSignKeyword_1_1_0_1 = (Keyword)cOperatorAlternatives_1_1_0.eContents().get(1);
		private final Keyword cOperatorGreaterThanSignEqualsSignKeyword_1_1_0_2 = (Keyword)cOperatorAlternatives_1_1_0.eContents().get(2);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrefixExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Comparison returns Expression:
		//    PrefixExpression ( {Comparison.left = current} operator = ('=='|'<='|'>=') right = PrefixExpression)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//PrefixExpression ( {Comparison.left = current} operator = ('=='|'<='|'>=') right = PrefixExpression)?
		public Group getGroup() { return cGroup; }
		
		//PrefixExpression
		public RuleCall getPrefixExpressionParserRuleCall_0() { return cPrefixExpressionParserRuleCall_0; }
		
		//( {Comparison.left = current} operator = ('=='|'<='|'>=') right = PrefixExpression)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Comparison.left = current}
		public Action getComparisonLeftAction_1_0() { return cComparisonLeftAction_1_0; }
		
		//operator = ('=='|'<='|'>=')
		public Assignment getOperatorAssignment_1_1() { return cOperatorAssignment_1_1; }
		
		//('=='|'<='|'>=')
		public Alternatives getOperatorAlternatives_1_1_0() { return cOperatorAlternatives_1_1_0; }
		
		//'=='
		public Keyword getOperatorEqualsSignEqualsSignKeyword_1_1_0_0() { return cOperatorEqualsSignEqualsSignKeyword_1_1_0_0; }
		
		//'<='
		public Keyword getOperatorLessThanSignEqualsSignKeyword_1_1_0_1() { return cOperatorLessThanSignEqualsSignKeyword_1_1_0_1; }
		
		//'>='
		public Keyword getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_2() { return cOperatorGreaterThanSignEqualsSignKeyword_1_1_0_2; }
		
		//right = PrefixExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//PrefixExpression
		public RuleCall getRightPrefixExpressionParserRuleCall_1_2_0() { return cRightPrefixExpressionParserRuleCall_1_2_0; }
	}
	public class PrefixExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.PrefixExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cNotExpressionAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cExpressionAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cExpressionAtomParserRuleCall_0_2_0 = (RuleCall)cExpressionAssignment_0_2.eContents().get(0);
		private final RuleCall cAtomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//PrefixExpression returns Expression:
		//    {NotExpression} '!' expression = Atom
		//  | Atom
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  {NotExpression} '!' expression = Atom
		//| Atom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{NotExpression} '!' expression = Atom
		public Group getGroup_0() { return cGroup_0; }
		
		//{NotExpression}
		public Action getNotExpressionAction_0_0() { return cNotExpressionAction_0_0; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_0_1() { return cExclamationMarkKeyword_0_1; }
		
		//expression = Atom
		public Assignment getExpressionAssignment_0_2() { return cExpressionAssignment_0_2; }
		
		//Atom
		public RuleCall getExpressionAtomParserRuleCall_0_2_0() { return cExpressionAtomParserRuleCall_0_2_0; }
		
		//Atom
		public RuleCall getAtomParserRuleCall_1() { return cAtomParserRuleCall_1; }
	}
	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.Atom");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cParenthesizedExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNumberLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMethodCallParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cBooleanLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Atom returns Expression:
		//    ParenthesizedExpression
		//  | NumberLiteral
		//  | MethodCall
		//  | BooleanLiteral
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  ParenthesizedExpression
		//| NumberLiteral
		//| MethodCall
		//| BooleanLiteral
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ParenthesizedExpression
		public RuleCall getParenthesizedExpressionParserRuleCall_0() { return cParenthesizedExpressionParserRuleCall_0; }
		
		//NumberLiteral
		public RuleCall getNumberLiteralParserRuleCall_1() { return cNumberLiteralParserRuleCall_1; }
		
		//MethodCall
		public RuleCall getMethodCallParserRuleCall_2() { return cMethodCallParserRuleCall_2; }
		
		//BooleanLiteral
		public RuleCall getBooleanLiteralParserRuleCall_3() { return cBooleanLiteralParserRuleCall_3; }
	}
	public class NumberLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.NumberLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//NumberLiteral:
		//    value = INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value = INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	public class BooleanLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.BooleanLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cValueTrueKeyword_1_0_0 = (Keyword)cValueAssignment_1_0.eContents().get(0);
		private final Keyword cFalseKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		
		//BooleanLiteral:
		//    {BooleanLiteral} (value?='true' | 'false')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{BooleanLiteral} (value?='true' | 'false')
		public Group getGroup() { return cGroup; }
		
		//{BooleanLiteral}
		public Action getBooleanLiteralAction_0() { return cBooleanLiteralAction_0; }
		
		//(value?='true' | 'false')
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//value?='true'
		public Assignment getValueAssignment_1_0() { return cValueAssignment_1_0; }
		
		//'true'
		public Keyword getValueTrueKeyword_1_0_0() { return cValueTrueKeyword_1_0_0; }
		
		//'false'
		public Keyword getFalseKeyword_1_1() { return cFalseKeyword_1_1; }
	}
	public class ParenthesizedExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.ParenthesizedExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParenthesizedExpression returns Expression:
		//    '(' Expression ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Expression ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_1() { return cExpressionParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class MethodCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.MethodCall");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueMethodCallLiteralParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//MethodCall:
		//    value = MethodCallLiteral
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value = MethodCallLiteral
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//MethodCallLiteral
		public RuleCall getValueMethodCallLiteralParserRuleCall_0() { return cValueMethodCallLiteralParserRuleCall_0; }
	}
	public class MethodCallLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.MethodCallLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFQNParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final RuleCall cArgumentParserRuleCall_1_1_0 = (RuleCall)cGroup_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cArgumentParserRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Group cGroup_1_3 = (Group)cGroup_1.eContents().get(3);
		private final Keyword cFullStopKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final RuleCall cMethodCallLiteralParserRuleCall_1_3_1 = (RuleCall)cGroup_1_3.eContents().get(1);
		
		//MethodCallLiteral:
		//    FQN ('(' (Argument (',' Argument )*)? ')' ('.' MethodCallLiteral)? )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//FQN ('(' (Argument (',' Argument )*)? ')' ('.' MethodCallLiteral)? )?
		public Group getGroup() { return cGroup; }
		
		//FQN
		public RuleCall getFQNParserRuleCall_0() { return cFQNParserRuleCall_0; }
		
		//('(' (Argument (',' Argument )*)? ')' ('.' MethodCallLiteral)? )?
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//(Argument (',' Argument )*)?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//Argument
		public RuleCall getArgumentParserRuleCall_1_1_0() { return cArgumentParserRuleCall_1_1_0; }
		
		//(',' Argument )*
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_1_0() { return cCommaKeyword_1_1_1_0; }
		
		//Argument
		public RuleCall getArgumentParserRuleCall_1_1_1_1() { return cArgumentParserRuleCall_1_1_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
		
		//('.' MethodCallLiteral)?
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//'.'
		public Keyword getFullStopKeyword_1_3_0() { return cFullStopKeyword_1_3_0; }
		
		//MethodCallLiteral
		public RuleCall getMethodCallLiteralParserRuleCall_1_3_1() { return cMethodCallLiteralParserRuleCall_1_3_1; }
	}
	public class ArgumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.Argument");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMethodCallLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Argument:
		//    MethodCallLiteral | INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//MethodCallLiteral | INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MethodCallLiteral
		public RuleCall getMethodCallLiteralParserRuleCall_0() { return cMethodCallLiteralParserRuleCall_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//    ID ('.' ID)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final IfConditionElements pIfCondition;
	private final ExpressionElements pExpression;
	private final AndExpressionElements pAndExpression;
	private final ComparisonElements pComparison;
	private final PrefixExpressionElements pPrefixExpression;
	private final AtomElements pAtom;
	private final NumberLiteralElements pNumberLiteral;
	private final BooleanLiteralElements pBooleanLiteral;
	private final ParenthesizedExpressionElements pParenthesizedExpression;
	private final MethodCallElements pMethodCall;
	private final MethodCallLiteralElements pMethodCallLiteral;
	private final ArgumentElements pArgument;
	private final FQNElements pFQN;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimpleExpressionsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pIfCondition = new IfConditionElements();
		this.pExpression = new ExpressionElements();
		this.pAndExpression = new AndExpressionElements();
		this.pComparison = new ComparisonElements();
		this.pPrefixExpression = new PrefixExpressionElements();
		this.pAtom = new AtomElements();
		this.pNumberLiteral = new NumberLiteralElements();
		this.pBooleanLiteral = new BooleanLiteralElements();
		this.pParenthesizedExpression = new ParenthesizedExpressionElements();
		this.pMethodCall = new MethodCallElements();
		this.pMethodCallLiteral = new MethodCallLiteralElements();
		this.pArgument = new ArgumentElements();
		this.pFQN = new FQNElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.xtext.generator.parser.antlr.splitting.SimpleExpressions".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//IfCondition:
	//  (elseif ?= 'else')? 'if' '(' condition = Expression ')' '{';
	public IfConditionElements getIfConditionAccess() {
		return pIfCondition;
	}
	
	public ParserRule getIfConditionRule() {
		return getIfConditionAccess().getRule();
	}
	
	//Expression returns Expression:
	//    AndExpression ( {OrExpression.left = current} '||' right = AndExpression )*
	//;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//AndExpression returns Expression:
	//    Comparison ( {AndExpression.left = current} '&&' right = Comparison )*
	//;
	public AndExpressionElements getAndExpressionAccess() {
		return pAndExpression;
	}
	
	public ParserRule getAndExpressionRule() {
		return getAndExpressionAccess().getRule();
	}
	
	//Comparison returns Expression:
	//    PrefixExpression ( {Comparison.left = current} operator = ('=='|'<='|'>=') right = PrefixExpression)?
	//;
	public ComparisonElements getComparisonAccess() {
		return pComparison;
	}
	
	public ParserRule getComparisonRule() {
		return getComparisonAccess().getRule();
	}
	
	//PrefixExpression returns Expression:
	//    {NotExpression} '!' expression = Atom
	//  | Atom
	//;
	public PrefixExpressionElements getPrefixExpressionAccess() {
		return pPrefixExpression;
	}
	
	public ParserRule getPrefixExpressionRule() {
		return getPrefixExpressionAccess().getRule();
	}
	
	//Atom returns Expression:
	//    ParenthesizedExpression
	//  | NumberLiteral
	//  | MethodCall
	//  | BooleanLiteral
	//;
	public AtomElements getAtomAccess() {
		return pAtom;
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}
	
	//NumberLiteral:
	//    value = INT
	//;
	public NumberLiteralElements getNumberLiteralAccess() {
		return pNumberLiteral;
	}
	
	public ParserRule getNumberLiteralRule() {
		return getNumberLiteralAccess().getRule();
	}
	
	//BooleanLiteral:
	//    {BooleanLiteral} (value?='true' | 'false')
	//;
	public BooleanLiteralElements getBooleanLiteralAccess() {
		return pBooleanLiteral;
	}
	
	public ParserRule getBooleanLiteralRule() {
		return getBooleanLiteralAccess().getRule();
	}
	
	//ParenthesizedExpression returns Expression:
	//    '(' Expression ')'
	//;
	public ParenthesizedExpressionElements getParenthesizedExpressionAccess() {
		return pParenthesizedExpression;
	}
	
	public ParserRule getParenthesizedExpressionRule() {
		return getParenthesizedExpressionAccess().getRule();
	}
	
	//MethodCall:
	//    value = MethodCallLiteral
	//;
	public MethodCallElements getMethodCallAccess() {
		return pMethodCall;
	}
	
	public ParserRule getMethodCallRule() {
		return getMethodCallAccess().getRule();
	}
	
	//MethodCallLiteral:
	//    FQN ('(' (Argument (',' Argument )*)? ')' ('.' MethodCallLiteral)? )?
	//;
	public MethodCallLiteralElements getMethodCallLiteralAccess() {
		return pMethodCallLiteral;
	}
	
	public ParserRule getMethodCallLiteralRule() {
		return getMethodCallLiteralAccess().getRule();
	}
	
	//Argument:
	//    MethodCallLiteral | INT
	//;
	public ArgumentElements getArgumentAccess() {
		return pArgument;
	}
	
	public ParserRule getArgumentRule() {
		return getArgumentAccess().getRule();
	}
	
	//FQN:
	//    ID ('.' ID)*
	//;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
