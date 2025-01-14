/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.parameters.services;

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
public class TwoParametersTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ParserRuleParametersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.ParserRuleParameters");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParserRuleParametersAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cNumberSignDigitOneKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cScenarioAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cScenarioScenario5ParserRuleCall_1_0_1_0 = (RuleCall)cScenarioAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cNumberSignDigitTwoKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cScenarioAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cScenarioScenario5ParserRuleCall_1_1_1_0 = (RuleCall)cScenarioAssignment_1_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cNumberSignDigitThreeKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cScenarioAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cScenarioScenario6ParserRuleCall_1_2_1_0 = (RuleCall)cScenarioAssignment_1_2_1.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cAlternatives_1.eContents().get(3);
		private final Keyword cNumberSignDigitFourKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cScenarioAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cScenarioScenario6ParserRuleCall_1_3_1_0 = (RuleCall)cScenarioAssignment_1_3_1.eContents().get(0);
		private final Group cGroup_1_4 = (Group)cAlternatives_1.eContents().get(4);
		private final Group cGroup_1_4_0 = (Group)cGroup_1_4.eContents().get(0);
		private final Keyword cNumberSignDigitFiveKeyword_1_4_0_0 = (Keyword)cGroup_1_4_0.eContents().get(0);
		private final Assignment cScenarioAssignment_1_4_0_1 = (Assignment)cGroup_1_4_0.eContents().get(1);
		private final RuleCall cScenarioScenario6ParserRuleCall_1_4_0_1_0 = (RuleCall)cScenarioAssignment_1_4_0_1.eContents().get(0);
		private final Group cGroup_1_5 = (Group)cAlternatives_1.eContents().get(5);
		private final Group cGroup_1_5_0 = (Group)cGroup_1_5.eContents().get(0);
		private final Keyword cNumberSignDigitSixKeyword_1_5_0_0 = (Keyword)cGroup_1_5_0.eContents().get(0);
		private final Assignment cScenarioAssignment_1_5_0_1 = (Assignment)cGroup_1_5_0.eContents().get(1);
		private final RuleCall cScenarioScenario6ParserRuleCall_1_5_0_1_0 = (RuleCall)cScenarioAssignment_1_5_0_1.eContents().get(0);
		private final Group cGroup_1_6 = (Group)cAlternatives_1.eContents().get(6);
		private final Keyword cNumberSignDigitSevenKeyword_1_6_0 = (Keyword)cGroup_1_6.eContents().get(0);
		private final Assignment cScenarioAssignment_1_6_1 = (Assignment)cGroup_1_6.eContents().get(1);
		private final RuleCall cScenarioScenario7ParserRuleCall_1_6_1_0 = (RuleCall)cScenarioAssignment_1_6_1.eContents().get(0);
		private final Group cGroup_1_7 = (Group)cAlternatives_1.eContents().get(7);
		private final Keyword cNumberSignDigitEightKeyword_1_7_0 = (Keyword)cGroup_1_7.eContents().get(0);
		private final Assignment cScenarioAssignment_1_7_1 = (Assignment)cGroup_1_7.eContents().get(1);
		private final RuleCall cScenarioScenario7ParserRuleCall_1_7_1_0 = (RuleCall)cScenarioAssignment_1_7_1.eContents().get(0);
		private final Group cGroup_1_8 = (Group)cAlternatives_1.eContents().get(8);
		private final Keyword cNumberSignDigitNineKeyword_1_8_0 = (Keyword)cGroup_1_8.eContents().get(0);
		private final Alternatives cAlternatives_1_8_1 = (Alternatives)cGroup_1_8.eContents().get(1);
		private final Assignment cScenarioAssignment_1_8_1_0 = (Assignment)cAlternatives_1_8_1.eContents().get(0);
		private final RuleCall cScenarioScenario8ParserRuleCall_1_8_1_0_0 = (RuleCall)cScenarioAssignment_1_8_1_0.eContents().get(0);
		private final Group cGroup_1_8_1_1 = (Group)cAlternatives_1_8_1.eContents().get(1);
		private final Assignment cScenarioAssignment_1_8_1_1_0 = (Assignment)cGroup_1_8_1_1.eContents().get(0);
		private final RuleCall cScenarioScenario6ParserRuleCall_1_8_1_1_0_0 = (RuleCall)cScenarioAssignment_1_8_1_1_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1_8_1_1_1 = (Keyword)cGroup_1_8_1_1.eContents().get(1);
		private final Group cGroup_1_9 = (Group)cAlternatives_1.eContents().get(9);
		private final Keyword cNumberSignDigitOneDigitZeroKeyword_1_9_0 = (Keyword)cGroup_1_9.eContents().get(0);
		private final Alternatives cAlternatives_1_9_1 = (Alternatives)cGroup_1_9.eContents().get(1);
		private final Assignment cScenarioAssignment_1_9_1_0 = (Assignment)cAlternatives_1_9_1.eContents().get(0);
		private final RuleCall cScenarioScenario8ParserRuleCall_1_9_1_0_0 = (RuleCall)cScenarioAssignment_1_9_1_0.eContents().get(0);
		private final Group cGroup_1_9_1_1 = (Group)cAlternatives_1_9_1.eContents().get(1);
		private final Assignment cScenarioAssignment_1_9_1_1_0 = (Assignment)cGroup_1_9_1_1.eContents().get(0);
		private final RuleCall cScenarioScenario6ParserRuleCall_1_9_1_1_0_0 = (RuleCall)cScenarioAssignment_1_9_1_1_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1_9_1_1_1 = (Keyword)cGroup_1_9_1_1.eContents().get(1);
		private final Group cGroup_1_10 = (Group)cAlternatives_1.eContents().get(10);
		private final Keyword cNumberSignDigitOneDigitOneKeyword_1_10_0 = (Keyword)cGroup_1_10.eContents().get(0);
		private final Alternatives cAlternatives_1_10_1 = (Alternatives)cGroup_1_10.eContents().get(1);
		private final Assignment cScenarioAssignment_1_10_1_0 = (Assignment)cAlternatives_1_10_1.eContents().get(0);
		private final RuleCall cScenarioScenario8ParserRuleCall_1_10_1_0_0 = (RuleCall)cScenarioAssignment_1_10_1_0.eContents().get(0);
		private final Group cGroup_1_10_1_1 = (Group)cAlternatives_1_10_1.eContents().get(1);
		private final Assignment cScenarioAssignment_1_10_1_1_0 = (Assignment)cGroup_1_10_1_1.eContents().get(0);
		private final RuleCall cScenarioScenario6ParserRuleCall_1_10_1_1_0_0 = (RuleCall)cScenarioAssignment_1_10_1_1_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1_10_1_1_1 = (Keyword)cGroup_1_10_1_1.eContents().get(1);
		private final Group cGroup_1_11 = (Group)cAlternatives_1.eContents().get(11);
		private final Keyword cNumberSignDigitOneDigitTwoKeyword_1_11_0 = (Keyword)cGroup_1_11.eContents().get(0);
		private final Alternatives cAlternatives_1_11_1 = (Alternatives)cGroup_1_11.eContents().get(1);
		private final Assignment cScenarioAssignment_1_11_1_0 = (Assignment)cAlternatives_1_11_1.eContents().get(0);
		private final RuleCall cScenarioScenario8ParserRuleCall_1_11_1_0_0 = (RuleCall)cScenarioAssignment_1_11_1_0.eContents().get(0);
		private final Group cGroup_1_11_1_1 = (Group)cAlternatives_1_11_1.eContents().get(1);
		private final Assignment cScenarioAssignment_1_11_1_1_0 = (Assignment)cGroup_1_11_1_1.eContents().get(0);
		private final RuleCall cScenarioScenario6ParserRuleCall_1_11_1_1_0_0 = (RuleCall)cScenarioAssignment_1_11_1_1_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1_11_1_1_1 = (Keyword)cGroup_1_11_1_1.eContents().get(1);
		
		//@Override
		//ParserRuleParameters: {ParserRuleParameters}
		//  ( '#1' scenario=Scenario5<true, true>
		//  |    '#2' scenario=Scenario5<false, false>
		//  | '#3' scenario=Scenario6<true, true>
		//  | '#4' scenario=Scenario6<false, true>
		//  | =>('#5' scenario=Scenario6<true, true>)
		//  | =>('#6' scenario=Scenario6<false, false>)
		//  | '#7' scenario=Scenario7<true, true>
		//  | '#8' scenario=Scenario7<false, true>
		//  | '#9' (scenario=Scenario8<true, true> | scenario=Scenario6<true, true> 'keyword'?)
		//  | '#10' (scenario=Scenario8<true, true> | scenario=Scenario6<false, false> 'keyword'?)
		//  | '#11' (scenario=Scenario8<false, false> | scenario=Scenario6<true, true> 'keyword'?)
		//  | '#12' (scenario=Scenario8<false, false> | scenario=Scenario6<false, false> 'keyword'?)
		//  )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{ParserRuleParameters}
		// ( '#1' scenario=Scenario5<true, true>
		// |    '#2' scenario=Scenario5<false, false>
		// | '#3' scenario=Scenario6<true, true>
		// | '#4' scenario=Scenario6<false, true>
		// | =>('#5' scenario=Scenario6<true, true>)
		// | =>('#6' scenario=Scenario6<false, false>)
		// | '#7' scenario=Scenario7<true, true>
		// | '#8' scenario=Scenario7<false, true>
		// | '#9' (scenario=Scenario8<true, true> | scenario=Scenario6<true, true> 'keyword'?)
		// | '#10' (scenario=Scenario8<true, true> | scenario=Scenario6<false, false> 'keyword'?)
		// | '#11' (scenario=Scenario8<false, false> | scenario=Scenario6<true, true> 'keyword'?)
		// | '#12' (scenario=Scenario8<false, false> | scenario=Scenario6<false, false> 'keyword'?)
		// )
		public Group getGroup() { return cGroup; }
		
		//{ParserRuleParameters}
		public Action getParserRuleParametersAction_0() { return cParserRuleParametersAction_0; }
		
		//( '#1' scenario=Scenario5<true, true>
		//|    '#2' scenario=Scenario5<false, false>
		//| '#3' scenario=Scenario6<true, true>
		//| '#4' scenario=Scenario6<false, true>
		//| =>('#5' scenario=Scenario6<true, true>)
		//| =>('#6' scenario=Scenario6<false, false>)
		//| '#7' scenario=Scenario7<true, true>
		//| '#8' scenario=Scenario7<false, true>
		//| '#9' (scenario=Scenario8<true, true> | scenario=Scenario6<true, true> 'keyword'?)
		//| '#10' (scenario=Scenario8<true, true> | scenario=Scenario6<false, false> 'keyword'?)
		//| '#11' (scenario=Scenario8<false, false> | scenario=Scenario6<true, true> 'keyword'?)
		//| '#12' (scenario=Scenario8<false, false> | scenario=Scenario6<false, false> 'keyword'?)
		//)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'#1' scenario=Scenario5<true, true>
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'#1'
		public Keyword getNumberSignDigitOneKeyword_1_0_0() { return cNumberSignDigitOneKeyword_1_0_0; }
		
		//scenario=Scenario5<true, true>
		public Assignment getScenarioAssignment_1_0_1() { return cScenarioAssignment_1_0_1; }
		
		//Scenario5<true, true>
		public RuleCall getScenarioScenario5ParserRuleCall_1_0_1_0() { return cScenarioScenario5ParserRuleCall_1_0_1_0; }
		
		//'#2' scenario=Scenario5<false, false>
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'#2'
		public Keyword getNumberSignDigitTwoKeyword_1_1_0() { return cNumberSignDigitTwoKeyword_1_1_0; }
		
		//scenario=Scenario5<false, false>
		public Assignment getScenarioAssignment_1_1_1() { return cScenarioAssignment_1_1_1; }
		
		//Scenario5<false, false>
		public RuleCall getScenarioScenario5ParserRuleCall_1_1_1_0() { return cScenarioScenario5ParserRuleCall_1_1_1_0; }
		
		//'#3' scenario=Scenario6<true, true>
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'#3'
		public Keyword getNumberSignDigitThreeKeyword_1_2_0() { return cNumberSignDigitThreeKeyword_1_2_0; }
		
		//scenario=Scenario6<true, true>
		public Assignment getScenarioAssignment_1_2_1() { return cScenarioAssignment_1_2_1; }
		
		//Scenario6<true, true>
		public RuleCall getScenarioScenario6ParserRuleCall_1_2_1_0() { return cScenarioScenario6ParserRuleCall_1_2_1_0; }
		
		//'#4' scenario=Scenario6<false, true>
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//'#4'
		public Keyword getNumberSignDigitFourKeyword_1_3_0() { return cNumberSignDigitFourKeyword_1_3_0; }
		
		//scenario=Scenario6<false, true>
		public Assignment getScenarioAssignment_1_3_1() { return cScenarioAssignment_1_3_1; }
		
		//Scenario6<false, true>
		public RuleCall getScenarioScenario6ParserRuleCall_1_3_1_0() { return cScenarioScenario6ParserRuleCall_1_3_1_0; }
		
		//=>('#5' scenario=Scenario6<true, true>)
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//'#5' scenario=Scenario6<true, true>
		public Group getGroup_1_4_0() { return cGroup_1_4_0; }
		
		//'#5'
		public Keyword getNumberSignDigitFiveKeyword_1_4_0_0() { return cNumberSignDigitFiveKeyword_1_4_0_0; }
		
		//scenario=Scenario6<true, true>
		public Assignment getScenarioAssignment_1_4_0_1() { return cScenarioAssignment_1_4_0_1; }
		
		//Scenario6<true, true>
		public RuleCall getScenarioScenario6ParserRuleCall_1_4_0_1_0() { return cScenarioScenario6ParserRuleCall_1_4_0_1_0; }
		
		//=>('#6' scenario=Scenario6<false, false>)
		public Group getGroup_1_5() { return cGroup_1_5; }
		
		//'#6' scenario=Scenario6<false, false>
		public Group getGroup_1_5_0() { return cGroup_1_5_0; }
		
		//'#6'
		public Keyword getNumberSignDigitSixKeyword_1_5_0_0() { return cNumberSignDigitSixKeyword_1_5_0_0; }
		
		//scenario=Scenario6<false, false>
		public Assignment getScenarioAssignment_1_5_0_1() { return cScenarioAssignment_1_5_0_1; }
		
		//Scenario6<false, false>
		public RuleCall getScenarioScenario6ParserRuleCall_1_5_0_1_0() { return cScenarioScenario6ParserRuleCall_1_5_0_1_0; }
		
		//'#7' scenario=Scenario7<true, true>
		public Group getGroup_1_6() { return cGroup_1_6; }
		
		//'#7'
		public Keyword getNumberSignDigitSevenKeyword_1_6_0() { return cNumberSignDigitSevenKeyword_1_6_0; }
		
		//scenario=Scenario7<true, true>
		public Assignment getScenarioAssignment_1_6_1() { return cScenarioAssignment_1_6_1; }
		
		//Scenario7<true, true>
		public RuleCall getScenarioScenario7ParserRuleCall_1_6_1_0() { return cScenarioScenario7ParserRuleCall_1_6_1_0; }
		
		//'#8' scenario=Scenario7<false, true>
		public Group getGroup_1_7() { return cGroup_1_7; }
		
		//'#8'
		public Keyword getNumberSignDigitEightKeyword_1_7_0() { return cNumberSignDigitEightKeyword_1_7_0; }
		
		//scenario=Scenario7<false, true>
		public Assignment getScenarioAssignment_1_7_1() { return cScenarioAssignment_1_7_1; }
		
		//Scenario7<false, true>
		public RuleCall getScenarioScenario7ParserRuleCall_1_7_1_0() { return cScenarioScenario7ParserRuleCall_1_7_1_0; }
		
		//'#9' (scenario=Scenario8<true, true> | scenario=Scenario6<true, true> 'keyword'?)
		public Group getGroup_1_8() { return cGroup_1_8; }
		
		//'#9'
		public Keyword getNumberSignDigitNineKeyword_1_8_0() { return cNumberSignDigitNineKeyword_1_8_0; }
		
		//(scenario=Scenario8<true, true> | scenario=Scenario6<true, true> 'keyword'?)
		public Alternatives getAlternatives_1_8_1() { return cAlternatives_1_8_1; }
		
		//scenario=Scenario8<true, true>
		public Assignment getScenarioAssignment_1_8_1_0() { return cScenarioAssignment_1_8_1_0; }
		
		//Scenario8<true, true>
		public RuleCall getScenarioScenario8ParserRuleCall_1_8_1_0_0() { return cScenarioScenario8ParserRuleCall_1_8_1_0_0; }
		
		//scenario=Scenario6<true, true> 'keyword'?
		public Group getGroup_1_8_1_1() { return cGroup_1_8_1_1; }
		
		//scenario=Scenario6<true, true>
		public Assignment getScenarioAssignment_1_8_1_1_0() { return cScenarioAssignment_1_8_1_1_0; }
		
		//Scenario6<true, true>
		public RuleCall getScenarioScenario6ParserRuleCall_1_8_1_1_0_0() { return cScenarioScenario6ParserRuleCall_1_8_1_1_0_0; }
		
		//'keyword'?
		public Keyword getKeywordKeyword_1_8_1_1_1() { return cKeywordKeyword_1_8_1_1_1; }
		
		//'#10' (scenario=Scenario8<true, true> | scenario=Scenario6<false, false> 'keyword'?)
		public Group getGroup_1_9() { return cGroup_1_9; }
		
		//'#10'
		public Keyword getNumberSignDigitOneDigitZeroKeyword_1_9_0() { return cNumberSignDigitOneDigitZeroKeyword_1_9_0; }
		
		//(scenario=Scenario8<true, true> | scenario=Scenario6<false, false> 'keyword'?)
		public Alternatives getAlternatives_1_9_1() { return cAlternatives_1_9_1; }
		
		//scenario=Scenario8<true, true>
		public Assignment getScenarioAssignment_1_9_1_0() { return cScenarioAssignment_1_9_1_0; }
		
		//Scenario8<true, true>
		public RuleCall getScenarioScenario8ParserRuleCall_1_9_1_0_0() { return cScenarioScenario8ParserRuleCall_1_9_1_0_0; }
		
		//scenario=Scenario6<false, false> 'keyword'?
		public Group getGroup_1_9_1_1() { return cGroup_1_9_1_1; }
		
		//scenario=Scenario6<false, false>
		public Assignment getScenarioAssignment_1_9_1_1_0() { return cScenarioAssignment_1_9_1_1_0; }
		
		//Scenario6<false, false>
		public RuleCall getScenarioScenario6ParserRuleCall_1_9_1_1_0_0() { return cScenarioScenario6ParserRuleCall_1_9_1_1_0_0; }
		
		//'keyword'?
		public Keyword getKeywordKeyword_1_9_1_1_1() { return cKeywordKeyword_1_9_1_1_1; }
		
		//'#11' (scenario=Scenario8<false, false> | scenario=Scenario6<true, true> 'keyword'?)
		public Group getGroup_1_10() { return cGroup_1_10; }
		
		//'#11'
		public Keyword getNumberSignDigitOneDigitOneKeyword_1_10_0() { return cNumberSignDigitOneDigitOneKeyword_1_10_0; }
		
		//(scenario=Scenario8<false, false> | scenario=Scenario6<true, true> 'keyword'?)
		public Alternatives getAlternatives_1_10_1() { return cAlternatives_1_10_1; }
		
		//scenario=Scenario8<false, false>
		public Assignment getScenarioAssignment_1_10_1_0() { return cScenarioAssignment_1_10_1_0; }
		
		//Scenario8<false, false>
		public RuleCall getScenarioScenario8ParserRuleCall_1_10_1_0_0() { return cScenarioScenario8ParserRuleCall_1_10_1_0_0; }
		
		//scenario=Scenario6<true, true> 'keyword'?
		public Group getGroup_1_10_1_1() { return cGroup_1_10_1_1; }
		
		//scenario=Scenario6<true, true>
		public Assignment getScenarioAssignment_1_10_1_1_0() { return cScenarioAssignment_1_10_1_1_0; }
		
		//Scenario6<true, true>
		public RuleCall getScenarioScenario6ParserRuleCall_1_10_1_1_0_0() { return cScenarioScenario6ParserRuleCall_1_10_1_1_0_0; }
		
		//'keyword'?
		public Keyword getKeywordKeyword_1_10_1_1_1() { return cKeywordKeyword_1_10_1_1_1; }
		
		//'#12' (scenario=Scenario8<false, false> | scenario=Scenario6<false, false> 'keyword'?)
		public Group getGroup_1_11() { return cGroup_1_11; }
		
		//'#12'
		public Keyword getNumberSignDigitOneDigitTwoKeyword_1_11_0() { return cNumberSignDigitOneDigitTwoKeyword_1_11_0; }
		
		//(scenario=Scenario8<false, false> | scenario=Scenario6<false, false> 'keyword'?)
		public Alternatives getAlternatives_1_11_1() { return cAlternatives_1_11_1; }
		
		//scenario=Scenario8<false, false>
		public Assignment getScenarioAssignment_1_11_1_0() { return cScenarioAssignment_1_11_1_0; }
		
		//Scenario8<false, false>
		public RuleCall getScenarioScenario8ParserRuleCall_1_11_1_0_0() { return cScenarioScenario8ParserRuleCall_1_11_1_0_0; }
		
		//scenario=Scenario6<false, false> 'keyword'?
		public Group getGroup_1_11_1_1() { return cGroup_1_11_1_1; }
		
		//scenario=Scenario6<false, false>
		public Assignment getScenarioAssignment_1_11_1_1_0() { return cScenarioAssignment_1_11_1_1_0; }
		
		//Scenario6<false, false>
		public RuleCall getScenarioScenario6ParserRuleCall_1_11_1_1_0_0() { return cScenarioScenario6ParserRuleCall_1_11_1_1_0_0; }
		
		//'keyword'?
		public Keyword getKeywordKeyword_1_11_1_1_1() { return cKeywordKeyword_1_11_1_1_1; }
	}
	public class Scenario5Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario5");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cFirstAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cFirstIDTerminalRuleCall_0_0_0 = (RuleCall)cFirstAssignment_0_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cSecondAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cSecondIDTerminalRuleCall_1_0_0 = (RuleCall)cSecondAssignment_1_0.eContents().get(0);
		
		//Scenario5<A, B> returns Scenario:
		//    <A & B> first=ID
		//  | <!A | !B> second=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  <A & B> first=ID
		//| <!A | !B> second=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//<A & B> first=ID
		public Group getGroup_0() { return cGroup_0; }
		
		//first=ID
		public Assignment getFirstAssignment_0_0() { return cFirstAssignment_0_0; }
		
		//ID
		public RuleCall getFirstIDTerminalRuleCall_0_0_0() { return cFirstIDTerminalRuleCall_0_0_0; }
		
		//<!A | !B> second=ID
		public Group getGroup_1() { return cGroup_1; }
		
		//second=ID
		public Assignment getSecondAssignment_1_0() { return cSecondAssignment_1_0; }
		
		//ID
		public RuleCall getSecondIDTerminalRuleCall_1_0_0() { return cSecondIDTerminalRuleCall_1_0_0; }
	}
	public class Scenario6Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario6");
		private final Assignment cFirstAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFirstIdOrKeyword2ParserRuleCall_0 = (RuleCall)cFirstAssignment.eContents().get(0);
		
		//Scenario6<A, B> returns Scenario:
		//    first=IdOrKeyword2<A, B, A&B>
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//first=IdOrKeyword2<A, B, A&B>
		public Assignment getFirstAssignment() { return cFirstAssignment; }
		
		//IdOrKeyword2<A, B, A&B>
		public RuleCall getFirstIdOrKeyword2ParserRuleCall_0() { return cFirstIdOrKeyword2ParserRuleCall_0; }
	}
	public class Scenario7Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario7");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cFirstAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cFirstIdOrKeyword2ParserRuleCall_0_0 = (RuleCall)cFirstAssignment_0.eContents().get(0);
		private final Assignment cSecondAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cSecondKeywordKeyword_1_0 = (Keyword)cSecondAssignment_1.eContents().get(0);
		
		//Scenario7<A, B> returns Scenario:
		//    =>first=IdOrKeyword2<A, B, A&B>
		//    | second='keyword'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//=>first=IdOrKeyword2<A, B, A&B>
		//| second='keyword'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//=>first=IdOrKeyword2<A, B, A&B>
		public Assignment getFirstAssignment_0() { return cFirstAssignment_0; }
		
		//IdOrKeyword2<A, B, A&B>
		public RuleCall getFirstIdOrKeyword2ParserRuleCall_0_0() { return cFirstIdOrKeyword2ParserRuleCall_0_0; }
		
		//second='keyword'
		public Assignment getSecondAssignment_1() { return cSecondAssignment_1; }
		
		//'keyword'
		public Keyword getSecondKeywordKeyword_1_0() { return cSecondKeywordKeyword_1_0; }
	}
	public class Scenario8Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario8");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSecondAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSecondIdOrKeyword2ParserRuleCall_0_0 = (RuleCall)cSecondAssignment_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Scenario8<A, B> returns Scenario:
		//    =>second=IdOrKeyword2<A, B, A|B> 'keyword'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//=>second=IdOrKeyword2<A, B, A|B> 'keyword'
		public Group getGroup() { return cGroup; }
		
		//=>second=IdOrKeyword2<A, B, A|B>
		public Assignment getSecondAssignment_0() { return cSecondAssignment_0; }
		
		//IdOrKeyword2<A, B, A|B>
		public RuleCall getSecondIdOrKeyword2ParserRuleCall_0_0() { return cSecondIdOrKeyword2ParserRuleCall_0_0; }
		
		//'keyword'
		public Keyword getKeywordKeyword_1() { return cKeywordKeyword_1; }
	}
	public class IdOrKeyword2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.IdOrKeyword2");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cKeywordKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//IdOrKeyword2<A, B, C>:
		//    <A & B | C> 'keyword'
		//    | ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//<A & B | C> 'keyword'
		//| ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//<A & B | C> 'keyword'
		public Group getGroup_0() { return cGroup_0; }
		
		//'keyword'
		public Keyword getKeywordKeyword_0_0() { return cKeywordKeyword_0_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final ParserRuleParametersElements pParserRuleParameters;
	private final Scenario5Elements pScenario5;
	private final Scenario6Elements pScenario6;
	private final Scenario7Elements pScenario7;
	private final Scenario8Elements pScenario8;
	private final IdOrKeyword2Elements pIdOrKeyword2;
	
	private final Grammar grammar;
	
	private final ParametersTestLanguageGrammarAccess gaParametersTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TwoParametersTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			ParametersTestLanguageGrammarAccess gaParametersTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaParametersTestLanguage = gaParametersTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pParserRuleParameters = new ParserRuleParametersElements();
		this.pScenario5 = new Scenario5Elements();
		this.pScenario6 = new Scenario6Elements();
		this.pScenario7 = new Scenario7Elements();
		this.pScenario8 = new Scenario8Elements();
		this.pIdOrKeyword2 = new IdOrKeyword2Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage".equals(grammar.getName())) {
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
	
	
	public ParametersTestLanguageGrammarAccess getParametersTestLanguageGrammarAccess() {
		return gaParametersTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//@Override
	//ParserRuleParameters: {ParserRuleParameters}
	//  ( '#1' scenario=Scenario5<true, true>
	//  |    '#2' scenario=Scenario5<false, false>
	//  | '#3' scenario=Scenario6<true, true>
	//  | '#4' scenario=Scenario6<false, true>
	//  | =>('#5' scenario=Scenario6<true, true>)
	//  | =>('#6' scenario=Scenario6<false, false>)
	//  | '#7' scenario=Scenario7<true, true>
	//  | '#8' scenario=Scenario7<false, true>
	//  | '#9' (scenario=Scenario8<true, true> | scenario=Scenario6<true, true> 'keyword'?)
	//  | '#10' (scenario=Scenario8<true, true> | scenario=Scenario6<false, false> 'keyword'?)
	//  | '#11' (scenario=Scenario8<false, false> | scenario=Scenario6<true, true> 'keyword'?)
	//  | '#12' (scenario=Scenario8<false, false> | scenario=Scenario6<false, false> 'keyword'?)
	//  )
	//;
	public ParserRuleParametersElements getParserRuleParametersAccess() {
		return pParserRuleParameters;
	}
	
	public ParserRule getParserRuleParametersRule() {
		return getParserRuleParametersAccess().getRule();
	}
	
	//Scenario5<A, B> returns Scenario:
	//    <A & B> first=ID
	//  | <!A | !B> second=ID
	//;
	public Scenario5Elements getScenario5Access() {
		return pScenario5;
	}
	
	public ParserRule getScenario5Rule() {
		return getScenario5Access().getRule();
	}
	
	//Scenario6<A, B> returns Scenario:
	//    first=IdOrKeyword2<A, B, A&B>
	//;
	public Scenario6Elements getScenario6Access() {
		return pScenario6;
	}
	
	public ParserRule getScenario6Rule() {
		return getScenario6Access().getRule();
	}
	
	//Scenario7<A, B> returns Scenario:
	//    =>first=IdOrKeyword2<A, B, A&B>
	//    | second='keyword'
	//;
	public Scenario7Elements getScenario7Access() {
		return pScenario7;
	}
	
	public ParserRule getScenario7Rule() {
		return getScenario7Access().getRule();
	}
	
	//Scenario8<A, B> returns Scenario:
	//    =>second=IdOrKeyword2<A, B, A|B> 'keyword'
	//;
	public Scenario8Elements getScenario8Access() {
		return pScenario8;
	}
	
	public ParserRule getScenario8Rule() {
		return getScenario8Access().getRule();
	}
	
	//IdOrKeyword2<A, B, C>:
	//    <A & B | C> 'keyword'
	//    | ID
	//;
	public IdOrKeyword2Elements getIdOrKeyword2Access() {
		return pIdOrKeyword2;
	}
	
	public ParserRule getIdOrKeyword2Rule() {
		return getIdOrKeyword2Access().getRule();
	}
	
	//Scenario1<Param> returns Scenario:
	//    <Param> first=ID
	//  | <!Param> second=ID
	//;
	public ParametersTestLanguageGrammarAccess.Scenario1Elements getScenario1Access() {
		return gaParametersTestLanguage.getScenario1Access();
	}
	
	public ParserRule getScenario1Rule() {
		return getScenario1Access().getRule();
	}
	
	//Scenario2<AllowKeyword> returns Scenario:
	//    first=IdOrKeyword<AllowKeyword>
	//;
	public ParametersTestLanguageGrammarAccess.Scenario2Elements getScenario2Access() {
		return gaParametersTestLanguage.getScenario2Access();
	}
	
	public ParserRule getScenario2Rule() {
		return getScenario2Access().getRule();
	}
	
	//Scenario3<AllowKeyword> returns Scenario:
	//    =>first=IdOrKeyword<AllowKeyword>
	//    | second='keyword'
	//;
	public ParametersTestLanguageGrammarAccess.Scenario3Elements getScenario3Access() {
		return gaParametersTestLanguage.getScenario3Access();
	}
	
	public ParserRule getScenario3Rule() {
		return getScenario3Access().getRule();
	}
	
	//Scenario4<AllowKeyword> returns Scenario:
	//    =>second=IdOrKeyword<AllowKeyword> 'keyword'
	//;
	public ParametersTestLanguageGrammarAccess.Scenario4Elements getScenario4Access() {
		return gaParametersTestLanguage.getScenario4Access();
	}
	
	public ParserRule getScenario4Rule() {
		return getScenario4Access().getRule();
	}
	
	//IdOrKeyword<Keyword>:
	//    <Keyword> 'keyword'
	//    | ID
	//;
	public ParametersTestLanguageGrammarAccess.IdOrKeywordElements getIdOrKeywordAccess() {
		return gaParametersTestLanguage.getIdOrKeywordAccess();
	}
	
	public ParserRule getIdOrKeywordRule() {
		return getIdOrKeywordAccess().getRule();
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
