/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.fragments.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
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
public class FragmentTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ParserRuleFragmentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.ParserRuleFragments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParserRuleFragmentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cNumberSignDigitOneKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cElementAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cElementPRFNamedParserRuleCall_1_0_1_0 = (RuleCall)cElementAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cNumberSignDigitTwoKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementPRFNamedParserRuleCall_1_1_1_0 = (RuleCall)cElementAssignment_1_1_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		private final Assignment cRefAssignment_1_1_3 = (Assignment)cGroup_1_1.eContents().get(3);
		private final CrossReference cRefPRFNamedCrossReference_1_1_3_0 = (CrossReference)cRefAssignment_1_1_3.eContents().get(0);
		private final RuleCall cRefPRFNamedIDTerminalRuleCall_1_1_3_0_1 = (RuleCall)cRefPRFNamedCrossReference_1_1_3_0.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cNumberSignDigitThreeKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cElementAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cElementPRFNamedRefFirstParserRuleCall_1_2_1_0 = (RuleCall)cElementAssignment_1_2_1.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cAlternatives_1.eContents().get(3);
		private final Keyword cNumberSignDigitFourKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cElementAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cElementPRFNamedWithActionParserRuleCall_1_3_1_0 = (RuleCall)cElementAssignment_1_3_1.eContents().get(0);
		private final Group cGroup_1_4 = (Group)cAlternatives_1.eContents().get(4);
		private final Keyword cNumberSignDigitEightKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cElementAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final RuleCall cElementPRFNamedWithFQNParserRuleCall_1_4_1_0 = (RuleCall)cElementAssignment_1_4_1.eContents().get(0);
		private final Group cGroup_1_5 = (Group)cAlternatives_1.eContents().get(5);
		private final Keyword cNumberSignDigitNineKeyword_1_5_0 = (Keyword)cGroup_1_5.eContents().get(0);
		private final Assignment cElementAssignment_1_5_1 = (Assignment)cGroup_1_5.eContents().get(1);
		private final RuleCall cElementPRFWithPredicateParserRuleCall_1_5_1_0 = (RuleCall)cElementAssignment_1_5_1.eContents().get(0);
		private final Group cGroup_1_6 = (Group)cAlternatives_1.eContents().get(6);
		private final Keyword cNumberSignDigitOneDigitZeroKeyword_1_6_0 = (Keyword)cGroup_1_6.eContents().get(0);
		private final Assignment cElementAssignment_1_6_1 = (Assignment)cGroup_1_6.eContents().get(1);
		private final RuleCall cElementPRFNamedRecursiveParserRuleCall_1_6_1_0 = (RuleCall)cElementAssignment_1_6_1.eContents().get(0);
		private final Group cGroup_1_7 = (Group)cAlternatives_1.eContents().get(7);
		private final Keyword cNumberSignDigitOneDigitOneKeyword_1_7_0 = (Keyword)cGroup_1_7.eContents().get(0);
		private final Assignment cElementAssignment_1_7_1 = (Assignment)cGroup_1_7.eContents().get(1);
		private final RuleCall cElementPRFNamedRecursiveFragmentParserRuleCall_1_7_1_0 = (RuleCall)cElementAssignment_1_7_1.eContents().get(0);
		
		//ParserRuleFragments: {ParserRuleFragments}
		//  ( '#1' element=PRFNamed
		//  | '#2' element=PRFNamed '->' ref=[PRFNamed]
		//  | '#3' element=PRFNamedRefFirst
		//  | '#4' element=PRFNamedWithAction
		////  | '#5' element=PRFNamedWithActionInFragment
		////  | '#6' element=PRFNamedWithActionInFragment2
		////  | '#7' element=PRFNamedWithActionInFragment3
		//  | '#8' element=PRFNamedWithFQN
		//  | '#9' element=PRFWithPredicate
		//  | '#10' element=PRFNamedRecursive
		//  | '#11' element=PRFNamedRecursiveFragment
		//  )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		// {ParserRuleFragments}
		//  ( '#1' element=PRFNamed
		//  | '#2' element=PRFNamed '->' ref=[PRFNamed]
		//  | '#3' element=PRFNamedRefFirst
		//  | '#4' element=PRFNamedWithAction
		////  | '#5' element=PRFNamedWithActionInFragment
		////  | '#6' element=PRFNamedWithActionInFragment2
		////  | '#7' element=PRFNamedWithActionInFragment3
		//  | '#8' element=PRFNamedWithFQN
		//  | '#9' element=PRFWithPredicate
		//  | '#10' element=PRFNamedRecursive
		//  | '#11' element=PRFNamedRecursiveFragment
		//  )
		public Group getGroup() { return cGroup; }
		
		//{ParserRuleFragments}
		public Action getParserRuleFragmentsAction_0() { return cParserRuleFragmentsAction_0; }
		
		//  ( '#1' element=PRFNamed
		//  | '#2' element=PRFNamed '->' ref=[PRFNamed]
		//  | '#3' element=PRFNamedRefFirst
		//  | '#4' element=PRFNamedWithAction
		////  | '#5' element=PRFNamedWithActionInFragment
		////  | '#6' element=PRFNamedWithActionInFragment2
		////  | '#7' element=PRFNamedWithActionInFragment3
		//  | '#8' element=PRFNamedWithFQN
		//  | '#9' element=PRFWithPredicate
		//  | '#10' element=PRFNamedRecursive
		//  | '#11' element=PRFNamedRecursiveFragment
		//  )
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'#1' element=PRFNamed
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'#1'
		public Keyword getNumberSignDigitOneKeyword_1_0_0() { return cNumberSignDigitOneKeyword_1_0_0; }
		
		//element=PRFNamed
		public Assignment getElementAssignment_1_0_1() { return cElementAssignment_1_0_1; }
		
		//PRFNamed
		public RuleCall getElementPRFNamedParserRuleCall_1_0_1_0() { return cElementPRFNamedParserRuleCall_1_0_1_0; }
		
		//'#2' element=PRFNamed '->' ref=[PRFNamed]
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'#2'
		public Keyword getNumberSignDigitTwoKeyword_1_1_0() { return cNumberSignDigitTwoKeyword_1_1_0; }
		
		//element=PRFNamed
		public Assignment getElementAssignment_1_1_1() { return cElementAssignment_1_1_1; }
		
		//PRFNamed
		public RuleCall getElementPRFNamedParserRuleCall_1_1_1_0() { return cElementPRFNamedParserRuleCall_1_1_1_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1_1_2() { return cHyphenMinusGreaterThanSignKeyword_1_1_2; }
		
		//ref=[PRFNamed]
		public Assignment getRefAssignment_1_1_3() { return cRefAssignment_1_1_3; }
		
		//[PRFNamed]
		public CrossReference getRefPRFNamedCrossReference_1_1_3_0() { return cRefPRFNamedCrossReference_1_1_3_0; }
		
		//ID
		public RuleCall getRefPRFNamedIDTerminalRuleCall_1_1_3_0_1() { return cRefPRFNamedIDTerminalRuleCall_1_1_3_0_1; }
		
		//'#3' element=PRFNamedRefFirst
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'#3'
		public Keyword getNumberSignDigitThreeKeyword_1_2_0() { return cNumberSignDigitThreeKeyword_1_2_0; }
		
		//element=PRFNamedRefFirst
		public Assignment getElementAssignment_1_2_1() { return cElementAssignment_1_2_1; }
		
		//PRFNamedRefFirst
		public RuleCall getElementPRFNamedRefFirstParserRuleCall_1_2_1_0() { return cElementPRFNamedRefFirstParserRuleCall_1_2_1_0; }
		
		//'#4' element=PRFNamedWithAction
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//'#4'
		public Keyword getNumberSignDigitFourKeyword_1_3_0() { return cNumberSignDigitFourKeyword_1_3_0; }
		
		//element=PRFNamedWithAction
		public Assignment getElementAssignment_1_3_1() { return cElementAssignment_1_3_1; }
		
		//PRFNamedWithAction
		public RuleCall getElementPRFNamedWithActionParserRuleCall_1_3_1_0() { return cElementPRFNamedWithActionParserRuleCall_1_3_1_0; }
		
		//'#8' element=PRFNamedWithFQN
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//'#8'
		public Keyword getNumberSignDigitEightKeyword_1_4_0() { return cNumberSignDigitEightKeyword_1_4_0; }
		
		//element=PRFNamedWithFQN
		public Assignment getElementAssignment_1_4_1() { return cElementAssignment_1_4_1; }
		
		//PRFNamedWithFQN
		public RuleCall getElementPRFNamedWithFQNParserRuleCall_1_4_1_0() { return cElementPRFNamedWithFQNParserRuleCall_1_4_1_0; }
		
		//'#9' element=PRFWithPredicate
		public Group getGroup_1_5() { return cGroup_1_5; }
		
		//'#9'
		public Keyword getNumberSignDigitNineKeyword_1_5_0() { return cNumberSignDigitNineKeyword_1_5_0; }
		
		//element=PRFWithPredicate
		public Assignment getElementAssignment_1_5_1() { return cElementAssignment_1_5_1; }
		
		//PRFWithPredicate
		public RuleCall getElementPRFWithPredicateParserRuleCall_1_5_1_0() { return cElementPRFWithPredicateParserRuleCall_1_5_1_0; }
		
		//'#10' element=PRFNamedRecursive
		public Group getGroup_1_6() { return cGroup_1_6; }
		
		//'#10'
		public Keyword getNumberSignDigitOneDigitZeroKeyword_1_6_0() { return cNumberSignDigitOneDigitZeroKeyword_1_6_0; }
		
		//element=PRFNamedRecursive
		public Assignment getElementAssignment_1_6_1() { return cElementAssignment_1_6_1; }
		
		//PRFNamedRecursive
		public RuleCall getElementPRFNamedRecursiveParserRuleCall_1_6_1_0() { return cElementPRFNamedRecursiveParserRuleCall_1_6_1_0; }
		
		//'#11' element=PRFNamedRecursiveFragment
		public Group getGroup_1_7() { return cGroup_1_7; }
		
		//'#11'
		public Keyword getNumberSignDigitOneDigitOneKeyword_1_7_0() { return cNumberSignDigitOneDigitOneKeyword_1_7_0; }
		
		//element=PRFNamedRecursiveFragment
		public Assignment getElementAssignment_1_7_1() { return cElementAssignment_1_7_1; }
		
		//PRFNamedRecursiveFragment
		public RuleCall getElementPRFNamedRecursiveFragmentParserRuleCall_1_7_1_0() { return cElementPRFNamedRecursiveFragmentParserRuleCall_1_7_1_0; }
	}
	public class PRFNamedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamed");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPRFNamedFragmentParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cColonKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cRefAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final CrossReference cRefPRFNamedCrossReference_1_0_1_0 = (CrossReference)cRefAssignment_1_0_1.eContents().get(0);
		private final RuleCall cRefPRFNamedIDTerminalRuleCall_1_0_1_0_1 = (RuleCall)cRefPRFNamedCrossReference_1_0_1_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final RuleCall cPRFNamedRefParserRuleCall_1_1_1 = (RuleCall)cGroup_1_1.eContents().get(1);
		
		//PRFNamed: PRFNamedFragment (
		//      ':' ref=[PRFNamed]
		//    | '-' PRFNamedRef
		//    )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//PRFNamedFragment (
		//     ':' ref=[PRFNamed]
		//   | '-' PRFNamedRef
		//   )?
		public Group getGroup() { return cGroup; }
		
		//PRFNamedFragment
		public RuleCall getPRFNamedFragmentParserRuleCall_0() { return cPRFNamedFragmentParserRuleCall_0; }
		
		//(
		//     ':' ref=[PRFNamed]
		//   | '-' PRFNamedRef
		//   )?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//':' ref=[PRFNamed]
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_0_0() { return cColonKeyword_1_0_0; }
		
		//ref=[PRFNamed]
		public Assignment getRefAssignment_1_0_1() { return cRefAssignment_1_0_1; }
		
		//[PRFNamed]
		public CrossReference getRefPRFNamedCrossReference_1_0_1_0() { return cRefPRFNamedCrossReference_1_0_1_0; }
		
		//ID
		public RuleCall getRefPRFNamedIDTerminalRuleCall_1_0_1_0_1() { return cRefPRFNamedIDTerminalRuleCall_1_0_1_0_1; }
		
		//'-' PRFNamedRef
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1_0() { return cHyphenMinusKeyword_1_1_0; }
		
		//PRFNamedRef
		public RuleCall getPRFNamedRefParserRuleCall_1_1_1() { return cPRFNamedRefParserRuleCall_1_1_1; }
	}
	public class PRFNamedRecursiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedRecursive");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final RuleCall cRecursiveFromFragmentParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//PRFNamedRecursive returns PRFNamedWithAction:
		//    name=ID RecursiveFromFragment
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID RecursiveFromFragment
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//RecursiveFromFragment
		public RuleCall getRecursiveFromFragmentParserRuleCall_1() { return cRecursiveFromFragmentParserRuleCall_1; }
	}
	public class PRFNamedRecursiveFragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedRecursiveFragment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final RuleCall cRecursiveFragmentParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//PRFNamedRecursiveFragment returns PRFNamedWithAction:
		//    name=ID RecursiveFragment
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID RecursiveFragment
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//RecursiveFragment
		public RuleCall getRecursiveFragmentParserRuleCall_1() { return cRecursiveFragmentParserRuleCall_1; }
	}
	public class PRFNamedRefFirstElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedRefFirst");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cRefPRFNamedCrossReference_0_0 = (CrossReference)cRefAssignment_0.eContents().get(0);
		private final RuleCall cRefPRFNamedIDTerminalRuleCall_0_0_1 = (RuleCall)cRefPRFNamedCrossReference_0_0.eContents().get(1);
		private final Keyword cLessThanSignHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cPRFNamedFragmentParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//PRFNamedRefFirst returns PRFNamed:
		//    ref=[PRFNamed] '<-' PRFNamedFragment
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref=[PRFNamed] '<-' PRFNamedFragment
		public Group getGroup() { return cGroup; }
		
		//ref=[PRFNamed]
		public Assignment getRefAssignment_0() { return cRefAssignment_0; }
		
		//[PRFNamed]
		public CrossReference getRefPRFNamedCrossReference_0_0() { return cRefPRFNamedCrossReference_0_0; }
		
		//ID
		public RuleCall getRefPRFNamedIDTerminalRuleCall_0_0_1() { return cRefPRFNamedIDTerminalRuleCall_0_0_1; }
		
		//'<-'
		public Keyword getLessThanSignHyphenMinusKeyword_1() { return cLessThanSignHyphenMinusKeyword_1; }
		
		//PRFNamedFragment
		public RuleCall getPRFNamedFragmentParserRuleCall_2() { return cPRFNamedFragmentParserRuleCall_2; }
	}
	public class PRFNamedWithActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedWithAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPRFNamedParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Action cPRFNamedWithActionPrevAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cRefAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final CrossReference cRefPRFNamedCrossReference_3_0_0 = (CrossReference)cRefAssignment_3_0.eContents().get(0);
		private final RuleCall cRefPRFNamedIDTerminalRuleCall_3_0_0_1 = (RuleCall)cRefPRFNamedCrossReference_3_0_0.eContents().get(1);
		private final Assignment cRef2Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cRef2PRFNamedCrossReference_3_1_0 = (CrossReference)cRef2Assignment_3_1.eContents().get(0);
		private final RuleCall cRef2PRFNamedIDTerminalRuleCall_3_1_0_1 = (RuleCall)cRef2PRFNamedCrossReference_3_1_0.eContents().get(1);
		
		//PRFNamedWithAction returns PRFNamed:
		//    PRFNamed {PRFNamedWithAction.prev=current} name=ID (ref=[PRFNamed] ref2=[PRFNamed])?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//PRFNamed {PRFNamedWithAction.prev=current} name=ID (ref=[PRFNamed] ref2=[PRFNamed])?
		public Group getGroup() { return cGroup; }
		
		//PRFNamed
		public RuleCall getPRFNamedParserRuleCall_0() { return cPRFNamedParserRuleCall_0; }
		
		//{PRFNamedWithAction.prev=current}
		public Action getPRFNamedWithActionPrevAction_1() { return cPRFNamedWithActionPrevAction_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//(ref=[PRFNamed] ref2=[PRFNamed])?
		public Group getGroup_3() { return cGroup_3; }
		
		//ref=[PRFNamed]
		public Assignment getRefAssignment_3_0() { return cRefAssignment_3_0; }
		
		//[PRFNamed]
		public CrossReference getRefPRFNamedCrossReference_3_0_0() { return cRefPRFNamedCrossReference_3_0_0; }
		
		//ID
		public RuleCall getRefPRFNamedIDTerminalRuleCall_3_0_0_1() { return cRefPRFNamedIDTerminalRuleCall_3_0_0_1; }
		
		//ref2=[PRFNamed]
		public Assignment getRef2Assignment_3_1() { return cRef2Assignment_3_1; }
		
		//[PRFNamed]
		public CrossReference getRef2PRFNamedCrossReference_3_1_0() { return cRef2PRFNamedCrossReference_3_1_0; }
		
		//ID
		public RuleCall getRef2PRFNamedIDTerminalRuleCall_3_1_0_1() { return cRef2PRFNamedIDTerminalRuleCall_3_1_0_1; }
	}
	public class PRFNamedWithFQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedWithFQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameFQNParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cRefAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cRefPRFNamedCrossReference_1_1_0 = (CrossReference)cRefAssignment_1_1.eContents().get(0);
		private final RuleCall cRefPRFNamedFQN2ParserRuleCall_1_1_0_1 = (RuleCall)cRefPRFNamedCrossReference_1_1_0.eContents().get(1);
		
		////PRFNamedWithActionInFragment returns PRFNamed:
		////    FragmentWithAction ('-' ref=[PRFNamed])?
		////;
		////
		////PRFNamedWithActionInFragment2 returns PRFNamed:
		////    name=ID FragmentWithAction2 ('-' ref=[PRFNamed])?
		////;
		////
		////PRFNamedWithActionInFragment3 returns PRFNamed:
		////    FragmentWithAction3 ('-' ref=[PRFNamed])?
		////;
		//PRFNamedWithFQN returns PRFNamed:
		//    name=FQN ('-' ref=[PRFNamed|FQN2])?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=FQN ('-' ref=[PRFNamed|FQN2])?
		public Group getGroup() { return cGroup; }
		
		//name=FQN
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//FQN
		public RuleCall getNameFQNParserRuleCall_0_0() { return cNameFQNParserRuleCall_0_0; }
		
		//('-' ref=[PRFNamed|FQN2])?
		public Group getGroup_1() { return cGroup_1; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0() { return cHyphenMinusKeyword_1_0; }
		
		//ref=[PRFNamed|FQN2]
		public Assignment getRefAssignment_1_1() { return cRefAssignment_1_1; }
		
		//[PRFNamed|FQN2]
		public CrossReference getRefPRFNamedCrossReference_1_1_0() { return cRefPRFNamedCrossReference_1_1_0; }
		
		//FQN2
		public RuleCall getRefPRFNamedFQN2ParserRuleCall_1_1_0_1() { return cRefPRFNamedFQN2ParserRuleCall_1_1_0_1; }
	}
	public class PRFWithPredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFWithPredicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPRFNamedFragmentParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final RuleCall cPRFNamedRefParserRuleCall_1_0_1 = (RuleCall)cGroup_1_0.eContents().get(1);
		
		//PRFWithPredicate returns PRFNamed:
		//    PRFNamedFragment =>('-' PRFNamedRef)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//PRFNamedFragment =>('-' PRFNamedRef)?
		public Group getGroup() { return cGroup; }
		
		//PRFNamedFragment
		public RuleCall getPRFNamedFragmentParserRuleCall_0() { return cPRFNamedFragmentParserRuleCall_0; }
		
		//=>('-' PRFNamedRef)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'-' PRFNamedRef
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_0() { return cHyphenMinusKeyword_1_0_0; }
		
		//PRFNamedRef
		public RuleCall getPRFNamedRefParserRuleCall_1_0_1() { return cPRFNamedRefParserRuleCall_1_0_1; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cSuffixParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//FQN:
		//    ID Suffix?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ID Suffix?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//Suffix?
		public RuleCall getSuffixParserRuleCall_1() { return cSuffixParserRuleCall_1; }
	}
	public class FQN2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.FQN2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cSuffix2ParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//FQN2:
		//    ID Suffix2*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ID Suffix2*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//Suffix2*
		public RuleCall getSuffix2ParserRuleCall_1() { return cSuffix2ParserRuleCall_1; }
	}
	public class SuffixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.Suffix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFullStopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cSuffixParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//fragment Suffix:
		//    '.' ID Suffix?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'.' ID Suffix?
		public Group getGroup() { return cGroup; }
		
		//'.'
		public Keyword getFullStopKeyword_0() { return cFullStopKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//Suffix?
		public RuleCall getSuffixParserRuleCall_2() { return cSuffixParserRuleCall_2; }
	}
	public class Suffix2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.Suffix2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFullStopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//fragment Suffix2:
		//    '.' ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'.' ID
		public Group getGroup() { return cGroup; }
		
		//'.'
		public Keyword getFullStopKeyword_0() { return cFullStopKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class PRFNamedFragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedFragment");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		////fragment FragmentWithAction returns PRFNamed:
		////    name=ID {PRFNamedWithAction.prev=current} name=ID (ref2=[PRFNamed])?
		////;
		////
		////fragment FragmentWithAction2 returns PRFNamed:
		////    {PRFNamedWithAction.prev=current} name=ID (ref2=[PRFNamed])?
		////;
		////
		////fragment FragmentWithAction3 returns PRFNamed:
		////    name=ID ({PRFNamedWithAction.prev=current} '->' name=ID (ref2=[PRFNamed])?)*
		////;
		//fragment PRFNamedFragment returns PRFNamed:
		//    name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class PRFNamedRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.PRFNamedRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefPRFNamedCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefPRFNamedIDTerminalRuleCall_0_1 = (RuleCall)cRefPRFNamedCrossReference_0.eContents().get(1);
		
		//fragment PRFNamedRef returns PRFNamed:
		//    ref=[PRFNamed]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref=[PRFNamed]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[PRFNamed]
		public CrossReference getRefPRFNamedCrossReference_0() { return cRefPRFNamedCrossReference_0; }
		
		//ID
		public RuleCall getRefPRFNamedIDTerminalRuleCall_0_1() { return cRefPRFNamedIDTerminalRuleCall_0_1; }
	}
	public class RecursiveFromFragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.RecursiveFromFragment");
		private final Assignment cPrevAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPrevNamedInParenthesesParserRuleCall_0 = (RuleCall)cPrevAssignment.eContents().get(0);
		
		//fragment RecursiveFromFragment returns PRFNamedWithAction:
		//    prev=NamedInParentheses
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//prev=NamedInParentheses
		public Assignment getPrevAssignment() { return cPrevAssignment; }
		
		//NamedInParentheses
		public RuleCall getPrevNamedInParenthesesParserRuleCall_0() { return cPrevNamedInParenthesesParserRuleCall_0; }
	}
	public class NamedInParenthesesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.NamedInParentheses");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cNamedInParenthesesParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cPRFNamedAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		
		//NamedInParentheses returns PRFNamed:
		//    '(' NamedInParentheses ')' | {PRFNamed} name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' NamedInParentheses ')' | {PRFNamed} name=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' NamedInParentheses ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//NamedInParentheses
		public RuleCall getNamedInParenthesesParserRuleCall_0_1() { return cNamedInParenthesesParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//{PRFNamed} name=ID
		public Group getGroup_1() { return cGroup_1; }
		
		//{PRFNamed}
		public Action getPRFNamedAction_1_0() { return cPRFNamedAction_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_1_0() { return cNameIDTerminalRuleCall_1_1_0; }
	}
	public class RecursiveFragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.RecursiveFragment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cRecursiveFragmentParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cPrevAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cPrevNamedByActionParserRuleCall_1_0 = (RuleCall)cPrevAssignment_1.eContents().get(0);
		
		//fragment RecursiveFragment returns PRFNamedWithAction:
		//    '(' RecursiveFragment ')' | prev=NamedByAction
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' RecursiveFragment ')' | prev=NamedByAction
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' RecursiveFragment ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//RecursiveFragment
		public RuleCall getRecursiveFragmentParserRuleCall_0_1() { return cRecursiveFragmentParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//prev=NamedByAction
		public Assignment getPrevAssignment_1() { return cPrevAssignment_1; }
		
		//NamedByAction
		public RuleCall getPrevNamedByActionParserRuleCall_1_0() { return cPrevNamedByActionParserRuleCall_1_0; }
	}
	public class NamedByActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.fragments.FragmentTestLanguage.NamedByAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPRFNamedAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//NamedByAction returns PRFNamed:
		//    {PRFNamed} name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{PRFNamed} name=ID
		public Group getGroup() { return cGroup; }
		
		//{PRFNamed}
		public Action getPRFNamedAction_0() { return cPRFNamedAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final ParserRuleFragmentsElements pParserRuleFragments;
	private final PRFNamedElements pPRFNamed;
	private final PRFNamedRecursiveElements pPRFNamedRecursive;
	private final PRFNamedRecursiveFragmentElements pPRFNamedRecursiveFragment;
	private final PRFNamedRefFirstElements pPRFNamedRefFirst;
	private final PRFNamedWithActionElements pPRFNamedWithAction;
	private final PRFNamedWithFQNElements pPRFNamedWithFQN;
	private final PRFWithPredicateElements pPRFWithPredicate;
	private final FQNElements pFQN;
	private final FQN2Elements pFQN2;
	private final SuffixElements pSuffix;
	private final Suffix2Elements pSuffix2;
	private final PRFNamedFragmentElements pPRFNamedFragment;
	private final PRFNamedRefElements pPRFNamedRef;
	private final RecursiveFromFragmentElements pRecursiveFromFragment;
	private final NamedInParenthesesElements pNamedInParentheses;
	private final RecursiveFragmentElements pRecursiveFragment;
	private final NamedByActionElements pNamedByAction;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FragmentTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pParserRuleFragments = new ParserRuleFragmentsElements();
		this.pPRFNamed = new PRFNamedElements();
		this.pPRFNamedRecursive = new PRFNamedRecursiveElements();
		this.pPRFNamedRecursiveFragment = new PRFNamedRecursiveFragmentElements();
		this.pPRFNamedRefFirst = new PRFNamedRefFirstElements();
		this.pPRFNamedWithAction = new PRFNamedWithActionElements();
		this.pPRFNamedWithFQN = new PRFNamedWithFQNElements();
		this.pPRFWithPredicate = new PRFWithPredicateElements();
		this.pFQN = new FQNElements();
		this.pFQN2 = new FQN2Elements();
		this.pSuffix = new SuffixElements();
		this.pSuffix2 = new Suffix2Elements();
		this.pPRFNamedFragment = new PRFNamedFragmentElements();
		this.pPRFNamedRef = new PRFNamedRefElements();
		this.pRecursiveFromFragment = new RecursiveFromFragmentElements();
		this.pNamedInParentheses = new NamedInParenthesesElements();
		this.pRecursiveFragment = new RecursiveFragmentElements();
		this.pNamedByAction = new NamedByActionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.fragments.FragmentTestLanguage".equals(grammar.getName())) {
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

	
	//ParserRuleFragments: {ParserRuleFragments}
	//  ( '#1' element=PRFNamed
	//  | '#2' element=PRFNamed '->' ref=[PRFNamed]
	//  | '#3' element=PRFNamedRefFirst
	//  | '#4' element=PRFNamedWithAction
	////  | '#5' element=PRFNamedWithActionInFragment
	////  | '#6' element=PRFNamedWithActionInFragment2
	////  | '#7' element=PRFNamedWithActionInFragment3
	//  | '#8' element=PRFNamedWithFQN
	//  | '#9' element=PRFWithPredicate
	//  | '#10' element=PRFNamedRecursive
	//  | '#11' element=PRFNamedRecursiveFragment
	//  )
	//;
	public ParserRuleFragmentsElements getParserRuleFragmentsAccess() {
		return pParserRuleFragments;
	}
	
	public ParserRule getParserRuleFragmentsRule() {
		return getParserRuleFragmentsAccess().getRule();
	}
	
	//PRFNamed: PRFNamedFragment (
	//      ':' ref=[PRFNamed]
	//    | '-' PRFNamedRef
	//    )?
	//;
	public PRFNamedElements getPRFNamedAccess() {
		return pPRFNamed;
	}
	
	public ParserRule getPRFNamedRule() {
		return getPRFNamedAccess().getRule();
	}
	
	//PRFNamedRecursive returns PRFNamedWithAction:
	//    name=ID RecursiveFromFragment
	//;
	public PRFNamedRecursiveElements getPRFNamedRecursiveAccess() {
		return pPRFNamedRecursive;
	}
	
	public ParserRule getPRFNamedRecursiveRule() {
		return getPRFNamedRecursiveAccess().getRule();
	}
	
	//PRFNamedRecursiveFragment returns PRFNamedWithAction:
	//    name=ID RecursiveFragment
	//;
	public PRFNamedRecursiveFragmentElements getPRFNamedRecursiveFragmentAccess() {
		return pPRFNamedRecursiveFragment;
	}
	
	public ParserRule getPRFNamedRecursiveFragmentRule() {
		return getPRFNamedRecursiveFragmentAccess().getRule();
	}
	
	//PRFNamedRefFirst returns PRFNamed:
	//    ref=[PRFNamed] '<-' PRFNamedFragment
	//;
	public PRFNamedRefFirstElements getPRFNamedRefFirstAccess() {
		return pPRFNamedRefFirst;
	}
	
	public ParserRule getPRFNamedRefFirstRule() {
		return getPRFNamedRefFirstAccess().getRule();
	}
	
	//PRFNamedWithAction returns PRFNamed:
	//    PRFNamed {PRFNamedWithAction.prev=current} name=ID (ref=[PRFNamed] ref2=[PRFNamed])?
	//;
	public PRFNamedWithActionElements getPRFNamedWithActionAccess() {
		return pPRFNamedWithAction;
	}
	
	public ParserRule getPRFNamedWithActionRule() {
		return getPRFNamedWithActionAccess().getRule();
	}
	
	////PRFNamedWithActionInFragment returns PRFNamed:
	////    FragmentWithAction ('-' ref=[PRFNamed])?
	////;
	////
	////PRFNamedWithActionInFragment2 returns PRFNamed:
	////    name=ID FragmentWithAction2 ('-' ref=[PRFNamed])?
	////;
	////
	////PRFNamedWithActionInFragment3 returns PRFNamed:
	////    FragmentWithAction3 ('-' ref=[PRFNamed])?
	////;
	//PRFNamedWithFQN returns PRFNamed:
	//    name=FQN ('-' ref=[PRFNamed|FQN2])?
	//;
	public PRFNamedWithFQNElements getPRFNamedWithFQNAccess() {
		return pPRFNamedWithFQN;
	}
	
	public ParserRule getPRFNamedWithFQNRule() {
		return getPRFNamedWithFQNAccess().getRule();
	}
	
	//PRFWithPredicate returns PRFNamed:
	//    PRFNamedFragment =>('-' PRFNamedRef)?
	//;
	public PRFWithPredicateElements getPRFWithPredicateAccess() {
		return pPRFWithPredicate;
	}
	
	public ParserRule getPRFWithPredicateRule() {
		return getPRFWithPredicateAccess().getRule();
	}
	
	//FQN:
	//    ID Suffix?
	//;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//FQN2:
	//    ID Suffix2*
	//;
	public FQN2Elements getFQN2Access() {
		return pFQN2;
	}
	
	public ParserRule getFQN2Rule() {
		return getFQN2Access().getRule();
	}
	
	//fragment Suffix:
	//    '.' ID Suffix?
	//;
	public SuffixElements getSuffixAccess() {
		return pSuffix;
	}
	
	public ParserRule getSuffixRule() {
		return getSuffixAccess().getRule();
	}
	
	//fragment Suffix2:
	//    '.' ID
	//;
	public Suffix2Elements getSuffix2Access() {
		return pSuffix2;
	}
	
	public ParserRule getSuffix2Rule() {
		return getSuffix2Access().getRule();
	}
	
	////fragment FragmentWithAction returns PRFNamed:
	////    name=ID {PRFNamedWithAction.prev=current} name=ID (ref2=[PRFNamed])?
	////;
	////
	////fragment FragmentWithAction2 returns PRFNamed:
	////    {PRFNamedWithAction.prev=current} name=ID (ref2=[PRFNamed])?
	////;
	////
	////fragment FragmentWithAction3 returns PRFNamed:
	////    name=ID ({PRFNamedWithAction.prev=current} '->' name=ID (ref2=[PRFNamed])?)*
	////;
	//fragment PRFNamedFragment returns PRFNamed:
	//    name=ID
	//;
	public PRFNamedFragmentElements getPRFNamedFragmentAccess() {
		return pPRFNamedFragment;
	}
	
	public ParserRule getPRFNamedFragmentRule() {
		return getPRFNamedFragmentAccess().getRule();
	}
	
	//fragment PRFNamedRef returns PRFNamed:
	//    ref=[PRFNamed]
	//;
	public PRFNamedRefElements getPRFNamedRefAccess() {
		return pPRFNamedRef;
	}
	
	public ParserRule getPRFNamedRefRule() {
		return getPRFNamedRefAccess().getRule();
	}
	
	//fragment RecursiveFromFragment returns PRFNamedWithAction:
	//    prev=NamedInParentheses
	//;
	public RecursiveFromFragmentElements getRecursiveFromFragmentAccess() {
		return pRecursiveFromFragment;
	}
	
	public ParserRule getRecursiveFromFragmentRule() {
		return getRecursiveFromFragmentAccess().getRule();
	}
	
	//NamedInParentheses returns PRFNamed:
	//    '(' NamedInParentheses ')' | {PRFNamed} name=ID
	//;
	public NamedInParenthesesElements getNamedInParenthesesAccess() {
		return pNamedInParentheses;
	}
	
	public ParserRule getNamedInParenthesesRule() {
		return getNamedInParenthesesAccess().getRule();
	}
	
	//fragment RecursiveFragment returns PRFNamedWithAction:
	//    '(' RecursiveFragment ')' | prev=NamedByAction
	//;
	public RecursiveFragmentElements getRecursiveFragmentAccess() {
		return pRecursiveFragment;
	}
	
	public ParserRule getRecursiveFragmentRule() {
		return getRecursiveFragmentAccess().getRule();
	}
	
	//NamedByAction returns PRFNamed:
	//    {PRFNamed} name=ID
	//;
	public NamedByActionElements getNamedByActionAccess() {
		return pNamedByAction;
	}
	
	public ParserRule getNamedByActionRule() {
		return getNamedByActionAccess().getRule();
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
