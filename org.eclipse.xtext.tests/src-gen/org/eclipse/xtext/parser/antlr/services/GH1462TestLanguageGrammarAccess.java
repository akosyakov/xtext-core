/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.antlr.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class GH1462TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Root");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cNumberSignDigitOneKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cElementAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cElementRule1ParserRuleCall_0_1_0 = (RuleCall)cElementAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cNumberSignDigitTwoKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cElementAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cElementRule2ParserRuleCall_1_1_0 = (RuleCall)cElementAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cNumberSignDigitThreeKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cElementAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cElementRule3ParserRuleCall_2_1_0 = (RuleCall)cElementAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cNumberSignDigitFourKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cElementAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cElementRule4ParserRuleCall_3_1_0 = (RuleCall)cElementAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cNumberSignDigitFiveKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cElementAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cElementRule5ParserRuleCall_4_1_0 = (RuleCall)cElementAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cNumberSignDigitSixKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cElementAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cElementRule6ParserRuleCall_5_1_0 = (RuleCall)cElementAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Keyword cNumberSignDigitSevenKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cElementAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cElementRule7ParserRuleCall_6_1_0 = (RuleCall)cElementAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Keyword cNumberSignDigitEightKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cElementAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cElementRule8ParserRuleCall_7_1_0 = (RuleCall)cElementAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cAlternatives.eContents().get(8);
		private final Keyword cNumberSignDigitNineKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cElementAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cElementRule9ParserRuleCall_8_1_0 = (RuleCall)cElementAssignment_8_1.eContents().get(0);
		private final Group cGroup_9 = (Group)cAlternatives.eContents().get(9);
		private final Keyword cNumberSignDigitOneDigitZeroKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cElementAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cElementRule10ParserRuleCall_9_1_0 = (RuleCall)cElementAssignment_9_1.eContents().get(0);
		private final Group cGroup_10 = (Group)cAlternatives.eContents().get(10);
		private final Keyword cNumberSignDigitOneDigitOneKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cElementAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cElementRule11ParserRuleCall_10_1_0 = (RuleCall)cElementAssignment_10_1.eContents().get(0);
		private final Group cGroup_11 = (Group)cAlternatives.eContents().get(11);
		private final Keyword cNumberSignDigitOneDigitTwoKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cElementAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cElementRule12ParserRuleCall_11_1_0 = (RuleCall)cElementAssignment_11_1.eContents().get(0);
		
		//Root:
		//      '#1' element=Rule1
		//    | '#2' element=Rule2
		//    | '#3' element=Rule3
		//    | '#4' element=Rule4
		//    | '#5' element=Rule5
		//    | '#6' element=Rule6
		//    | '#7' element=Rule7
		//    | '#8' element=Rule8
		//    | '#9' element=Rule9
		//    | '#10' element=Rule10
		//    | '#11' element=Rule11
		//    | '#12' element=Rule12
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  '#1' element=Rule1
		//| '#2' element=Rule2
		//| '#3' element=Rule3
		//| '#4' element=Rule4
		//| '#5' element=Rule5
		//| '#6' element=Rule6
		//| '#7' element=Rule7
		//| '#8' element=Rule8
		//| '#9' element=Rule9
		//| '#10' element=Rule10
		//| '#11' element=Rule11
		//| '#12' element=Rule12
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'#1' element=Rule1
		public Group getGroup_0() { return cGroup_0; }
		
		//'#1'
		public Keyword getNumberSignDigitOneKeyword_0_0() { return cNumberSignDigitOneKeyword_0_0; }
		
		//element=Rule1
		public Assignment getElementAssignment_0_1() { return cElementAssignment_0_1; }
		
		//Rule1
		public RuleCall getElementRule1ParserRuleCall_0_1_0() { return cElementRule1ParserRuleCall_0_1_0; }
		
		//'#2' element=Rule2
		public Group getGroup_1() { return cGroup_1; }
		
		//'#2'
		public Keyword getNumberSignDigitTwoKeyword_1_0() { return cNumberSignDigitTwoKeyword_1_0; }
		
		//element=Rule2
		public Assignment getElementAssignment_1_1() { return cElementAssignment_1_1; }
		
		//Rule2
		public RuleCall getElementRule2ParserRuleCall_1_1_0() { return cElementRule2ParserRuleCall_1_1_0; }
		
		//'#3' element=Rule3
		public Group getGroup_2() { return cGroup_2; }
		
		//'#3'
		public Keyword getNumberSignDigitThreeKeyword_2_0() { return cNumberSignDigitThreeKeyword_2_0; }
		
		//element=Rule3
		public Assignment getElementAssignment_2_1() { return cElementAssignment_2_1; }
		
		//Rule3
		public RuleCall getElementRule3ParserRuleCall_2_1_0() { return cElementRule3ParserRuleCall_2_1_0; }
		
		//'#4' element=Rule4
		public Group getGroup_3() { return cGroup_3; }
		
		//'#4'
		public Keyword getNumberSignDigitFourKeyword_3_0() { return cNumberSignDigitFourKeyword_3_0; }
		
		//element=Rule4
		public Assignment getElementAssignment_3_1() { return cElementAssignment_3_1; }
		
		//Rule4
		public RuleCall getElementRule4ParserRuleCall_3_1_0() { return cElementRule4ParserRuleCall_3_1_0; }
		
		//'#5' element=Rule5
		public Group getGroup_4() { return cGroup_4; }
		
		//'#5'
		public Keyword getNumberSignDigitFiveKeyword_4_0() { return cNumberSignDigitFiveKeyword_4_0; }
		
		//element=Rule5
		public Assignment getElementAssignment_4_1() { return cElementAssignment_4_1; }
		
		//Rule5
		public RuleCall getElementRule5ParserRuleCall_4_1_0() { return cElementRule5ParserRuleCall_4_1_0; }
		
		//'#6' element=Rule6
		public Group getGroup_5() { return cGroup_5; }
		
		//'#6'
		public Keyword getNumberSignDigitSixKeyword_5_0() { return cNumberSignDigitSixKeyword_5_0; }
		
		//element=Rule6
		public Assignment getElementAssignment_5_1() { return cElementAssignment_5_1; }
		
		//Rule6
		public RuleCall getElementRule6ParserRuleCall_5_1_0() { return cElementRule6ParserRuleCall_5_1_0; }
		
		//'#7' element=Rule7
		public Group getGroup_6() { return cGroup_6; }
		
		//'#7'
		public Keyword getNumberSignDigitSevenKeyword_6_0() { return cNumberSignDigitSevenKeyword_6_0; }
		
		//element=Rule7
		public Assignment getElementAssignment_6_1() { return cElementAssignment_6_1; }
		
		//Rule7
		public RuleCall getElementRule7ParserRuleCall_6_1_0() { return cElementRule7ParserRuleCall_6_1_0; }
		
		//'#8' element=Rule8
		public Group getGroup_7() { return cGroup_7; }
		
		//'#8'
		public Keyword getNumberSignDigitEightKeyword_7_0() { return cNumberSignDigitEightKeyword_7_0; }
		
		//element=Rule8
		public Assignment getElementAssignment_7_1() { return cElementAssignment_7_1; }
		
		//Rule8
		public RuleCall getElementRule8ParserRuleCall_7_1_0() { return cElementRule8ParserRuleCall_7_1_0; }
		
		//'#9' element=Rule9
		public Group getGroup_8() { return cGroup_8; }
		
		//'#9'
		public Keyword getNumberSignDigitNineKeyword_8_0() { return cNumberSignDigitNineKeyword_8_0; }
		
		//element=Rule9
		public Assignment getElementAssignment_8_1() { return cElementAssignment_8_1; }
		
		//Rule9
		public RuleCall getElementRule9ParserRuleCall_8_1_0() { return cElementRule9ParserRuleCall_8_1_0; }
		
		//'#10' element=Rule10
		public Group getGroup_9() { return cGroup_9; }
		
		//'#10'
		public Keyword getNumberSignDigitOneDigitZeroKeyword_9_0() { return cNumberSignDigitOneDigitZeroKeyword_9_0; }
		
		//element=Rule10
		public Assignment getElementAssignment_9_1() { return cElementAssignment_9_1; }
		
		//Rule10
		public RuleCall getElementRule10ParserRuleCall_9_1_0() { return cElementRule10ParserRuleCall_9_1_0; }
		
		//'#11' element=Rule11
		public Group getGroup_10() { return cGroup_10; }
		
		//'#11'
		public Keyword getNumberSignDigitOneDigitOneKeyword_10_0() { return cNumberSignDigitOneDigitOneKeyword_10_0; }
		
		//element=Rule11
		public Assignment getElementAssignment_10_1() { return cElementAssignment_10_1; }
		
		//Rule11
		public RuleCall getElementRule11ParserRuleCall_10_1_0() { return cElementRule11ParserRuleCall_10_1_0; }
		
		//'#12' element=Rule12
		public Group getGroup_11() { return cGroup_11; }
		
		//'#12'
		public Keyword getNumberSignDigitOneDigitTwoKeyword_11_0() { return cNumberSignDigitOneDigitTwoKeyword_11_0; }
		
		//element=Rule12
		public Assignment getElementAssignment_11_1() { return cElementAssignment_11_1; }
		
		//Rule12
		public RuleCall getElementRule12ParserRuleCall_11_1_0() { return cElementRule12ParserRuleCall_11_1_0; }
	}
	public class Rule1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftINTTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightINTTerminalRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule1:
		//    left=INT right=INT unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=INT right=INT unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=INT
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_0_0() { return cLeftINTTerminalRuleCall_0_0; }
		
		//right=INT
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//INT
		public RuleCall getRightINTTerminalRuleCall_1_0() { return cRightINTTerminalRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule2:
		//    INT value=INT unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//INT value=INT unit='s'
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftIDTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightSTRINGTerminalRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule3:
		//    left=ID right=STRING unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=ID right=STRING unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=ID
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//ID
		public RuleCall getLeftIDTerminalRuleCall_0_0() { return cLeftIDTerminalRuleCall_0_0; }
		
		//right=STRING
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//STRING
		public RuleCall getRightSTRINGTerminalRuleCall_1_0() { return cRightSTRINGTerminalRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule4Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule4");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftSTRINGTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightIDTerminalRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule4:
		//    left=STRING right=ID unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=STRING right=ID unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=STRING
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//STRING
		public RuleCall getLeftSTRINGTerminalRuleCall_0_0() { return cLeftSTRINGTerminalRuleCall_0_0; }
		
		//right=ID
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//ID
		public RuleCall getRightIDTerminalRuleCall_1_0() { return cRightIDTerminalRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule5Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule5");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftINTTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightIntegerParserRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule5:
		//    left=INT right=Integer unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=INT right=Integer unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=INT
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_0_0() { return cLeftINTTerminalRuleCall_0_0; }
		
		//right=Integer
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//Integer
		public RuleCall getRightIntegerParserRuleCall_1_0() { return cRightIntegerParserRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule6Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule6");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftINTTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightWrapperParserRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule6:
		//    left=INT right=Wrapper unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=INT right=Wrapper unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=INT
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_0_0() { return cLeftINTTerminalRuleCall_0_0; }
		
		//right=Wrapper
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//Wrapper
		public RuleCall getRightWrapperParserRuleCall_1_0() { return cRightWrapperParserRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule7Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule7");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftINTTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightINTTerminalRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule7:
		//    left=INT right?=INT unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=INT right?=INT unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=INT
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_0_0() { return cLeftINTTerminalRuleCall_0_0; }
		
		//right?=INT
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//INT
		public RuleCall getRightINTTerminalRuleCall_1_0() { return cRightINTTerminalRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule8Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule8");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftINTTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cRight1Keyword_1_0 = (Keyword)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule8:
		//    left=INT right?='#1' unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=INT right?='#1' unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=INT
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_0_0() { return cLeftINTTerminalRuleCall_0_0; }
		
		//right?='#1'
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//'#1'
		public Keyword getRight1Keyword_1_0() { return cRight1Keyword_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule9Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule9");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftINTTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightMaybeEmptyParserRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule9:
		//    left=INT right=MaybeEmpty unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=INT right=MaybeEmpty unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=INT
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_0_0() { return cLeftINTTerminalRuleCall_0_0; }
		
		//right=MaybeEmpty
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//MaybeEmpty
		public RuleCall getRightMaybeEmptyParserRuleCall_1_0() { return cRightMaybeEmptyParserRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule10Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule10");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftINTTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightMaybeEmptyParserRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule10:
		//    left=INT right?=MaybeEmpty unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=INT right?=MaybeEmpty unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=INT
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_0_0() { return cLeftINTTerminalRuleCall_0_0; }
		
		//right?=MaybeEmpty
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//MaybeEmpty
		public RuleCall getRightMaybeEmptyParserRuleCall_1_0() { return cRightMaybeEmptyParserRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule11Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule11");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftINTTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightIntegerParserRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule11:
		//    left=INT right?=Integer unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=INT right?=Integer unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=INT
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_0_0() { return cLeftINTTerminalRuleCall_0_0; }
		
		//right?=Integer
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//Integer
		public RuleCall getRightIntegerParserRuleCall_1_0() { return cRightIntegerParserRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class Rule12Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule12");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftINTTerminalRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightWrapperParserRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cUnitSKeyword_2_0 = (Keyword)cUnitAssignment_2.eContents().get(0);
		
		//Rule12:
		//    left=INT right?=Wrapper unit='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//left=INT right?=Wrapper unit='s'
		public Group getGroup() { return cGroup; }
		
		//left=INT
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//INT
		public RuleCall getLeftINTTerminalRuleCall_0_0() { return cLeftINTTerminalRuleCall_0_0; }
		
		//right?=Wrapper
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//Wrapper
		public RuleCall getRightWrapperParserRuleCall_1_0() { return cRightWrapperParserRuleCall_1_0; }
		
		//unit='s'
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//'s'
		public Keyword getUnitSKeyword_2_0() { return cUnitSKeyword_2_0; }
	}
	public class IntegerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Integer");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Integer returns EInt:
		//    INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class MaybeEmptyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.MaybeEmpty");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MaybeEmpty:
		//    INT?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class WrapperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Wrapper");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Wrapper:
		//    value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	
	
	private final RootElements pRoot;
	private final Rule1Elements pRule1;
	private final Rule2Elements pRule2;
	private final Rule3Elements pRule3;
	private final Rule4Elements pRule4;
	private final Rule5Elements pRule5;
	private final Rule6Elements pRule6;
	private final Rule7Elements pRule7;
	private final Rule8Elements pRule8;
	private final Rule9Elements pRule9;
	private final Rule10Elements pRule10;
	private final Rule11Elements pRule11;
	private final Rule12Elements pRule12;
	private final IntegerElements pInteger;
	private final MaybeEmptyElements pMaybeEmpty;
	private final WrapperElements pWrapper;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GH1462TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pRule1 = new Rule1Elements();
		this.pRule2 = new Rule2Elements();
		this.pRule3 = new Rule3Elements();
		this.pRule4 = new Rule4Elements();
		this.pRule5 = new Rule5Elements();
		this.pRule6 = new Rule6Elements();
		this.pRule7 = new Rule7Elements();
		this.pRule8 = new Rule8Elements();
		this.pRule9 = new Rule9Elements();
		this.pRule10 = new Rule10Elements();
		this.pRule11 = new Rule11Elements();
		this.pRule12 = new Rule12Elements();
		this.pInteger = new IntegerElements();
		this.pMaybeEmpty = new MaybeEmptyElements();
		this.pWrapper = new WrapperElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.antlr.GH1462TestLanguage".equals(grammar.getName())) {
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

	
	//Root:
	//      '#1' element=Rule1
	//    | '#2' element=Rule2
	//    | '#3' element=Rule3
	//    | '#4' element=Rule4
	//    | '#5' element=Rule5
	//    | '#6' element=Rule6
	//    | '#7' element=Rule7
	//    | '#8' element=Rule8
	//    | '#9' element=Rule9
	//    | '#10' element=Rule10
	//    | '#11' element=Rule11
	//    | '#12' element=Rule12
	//;
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//Rule1:
	//    left=INT right=INT unit='s'
	//;
	public Rule1Elements getRule1Access() {
		return pRule1;
	}
	
	public ParserRule getRule1Rule() {
		return getRule1Access().getRule();
	}
	
	//Rule2:
	//    INT value=INT unit='s'
	//;
	public Rule2Elements getRule2Access() {
		return pRule2;
	}
	
	public ParserRule getRule2Rule() {
		return getRule2Access().getRule();
	}
	
	//Rule3:
	//    left=ID right=STRING unit='s'
	//;
	public Rule3Elements getRule3Access() {
		return pRule3;
	}
	
	public ParserRule getRule3Rule() {
		return getRule3Access().getRule();
	}
	
	//Rule4:
	//    left=STRING right=ID unit='s'
	//;
	public Rule4Elements getRule4Access() {
		return pRule4;
	}
	
	public ParserRule getRule4Rule() {
		return getRule4Access().getRule();
	}
	
	//Rule5:
	//    left=INT right=Integer unit='s'
	//;
	public Rule5Elements getRule5Access() {
		return pRule5;
	}
	
	public ParserRule getRule5Rule() {
		return getRule5Access().getRule();
	}
	
	//Rule6:
	//    left=INT right=Wrapper unit='s'
	//;
	public Rule6Elements getRule6Access() {
		return pRule6;
	}
	
	public ParserRule getRule6Rule() {
		return getRule6Access().getRule();
	}
	
	//Rule7:
	//    left=INT right?=INT unit='s'
	//;
	public Rule7Elements getRule7Access() {
		return pRule7;
	}
	
	public ParserRule getRule7Rule() {
		return getRule7Access().getRule();
	}
	
	//Rule8:
	//    left=INT right?='#1' unit='s'
	//;
	public Rule8Elements getRule8Access() {
		return pRule8;
	}
	
	public ParserRule getRule8Rule() {
		return getRule8Access().getRule();
	}
	
	//Rule9:
	//    left=INT right=MaybeEmpty unit='s'
	//;
	public Rule9Elements getRule9Access() {
		return pRule9;
	}
	
	public ParserRule getRule9Rule() {
		return getRule9Access().getRule();
	}
	
	//Rule10:
	//    left=INT right?=MaybeEmpty unit='s'
	//;
	public Rule10Elements getRule10Access() {
		return pRule10;
	}
	
	public ParserRule getRule10Rule() {
		return getRule10Access().getRule();
	}
	
	//Rule11:
	//    left=INT right?=Integer unit='s'
	//;
	public Rule11Elements getRule11Access() {
		return pRule11;
	}
	
	public ParserRule getRule11Rule() {
		return getRule11Access().getRule();
	}
	
	//Rule12:
	//    left=INT right?=Wrapper unit='s'
	//;
	public Rule12Elements getRule12Access() {
		return pRule12;
	}
	
	public ParserRule getRule12Rule() {
		return getRule12Access().getRule();
	}
	
	//Integer returns EInt:
	//    INT
	//;
	public IntegerElements getIntegerAccess() {
		return pInteger;
	}
	
	public ParserRule getIntegerRule() {
		return getIntegerAccess().getRule();
	}
	
	//MaybeEmpty:
	//    INT?
	//;
	public MaybeEmptyElements getMaybeEmptyAccess() {
		return pMaybeEmpty;
	}
	
	public ParserRule getMaybeEmptyRule() {
		return getMaybeEmptyAccess().getRule();
	}
	
	//Wrapper:
	//    value=INT
	//;
	public WrapperElements getWrapperAccess() {
		return pWrapper;
	}
	
	public ParserRule getWrapperRule() {
		return getWrapperAccess().getRule();
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
