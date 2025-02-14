/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.serializer.services;

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
public class SyntacticSequencerTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cX1Assignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cX1MandatoryKeywordsParserRuleCall_0_0 = (RuleCall)cX1Assignment_0.eContents().get(0);
		private final Assignment cX2Assignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cX2Exp0ParserRuleCall_1_0 = (RuleCall)cX2Assignment_1.eContents().get(0);
		private final Assignment cX3Assignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cX3Exp1ParserRuleCall_2_0 = (RuleCall)cX3Assignment_2.eContents().get(0);
		private final Assignment cX4Assignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cX4Exp2ParserRuleCall_3_0 = (RuleCall)cX4Assignment_3.eContents().get(0);
		private final Assignment cX5Assignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cX5SingleCrossReferenceParserRuleCall_4_0 = (RuleCall)cX5Assignment_4.eContents().get(0);
		private final Assignment cX6Assignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cX6BooleanAlternativeParserRuleCall_5_0 = (RuleCall)cX6Assignment_5.eContents().get(0);
		private final Assignment cX7Assignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cX7UnassignedDatatypeParserRuleCall_6_0 = (RuleCall)cX7Assignment_6.eContents().get(0);
		private final Assignment cX8Assignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cX8OptionalSingleTransitionParserRuleCall_7_0 = (RuleCall)cX8Assignment_7.eContents().get(0);
		private final Assignment cX9Assignment_8 = (Assignment)cAlternatives.eContents().get(8);
		private final RuleCall cX9OptionalManyTransitionParserRuleCall_8_0 = (RuleCall)cX9Assignment_8.eContents().get(0);
		private final Assignment cX10Assignment_9 = (Assignment)cAlternatives.eContents().get(9);
		private final RuleCall cX10MandatoryManyTransitionParserRuleCall_9_0 = (RuleCall)cX10Assignment_9.eContents().get(0);
		private final Assignment cX11Assignment_10 = (Assignment)cAlternatives.eContents().get(10);
		private final RuleCall cX11AlternativeTransitionParserRuleCall_10_0 = (RuleCall)cX11Assignment_10.eContents().get(0);
		private final Assignment cX12Assignment_11 = (Assignment)cAlternatives.eContents().get(11);
		private final RuleCall cX12BooleanValuesParserRuleCall_11_0 = (RuleCall)cX12Assignment_11.eContents().get(0);
		private final Assignment cX13Assignment_12 = (Assignment)cAlternatives.eContents().get(12);
		private final RuleCall cX13LongAlternativeParserRuleCall_12_0 = (RuleCall)cX13Assignment_12.eContents().get(0);
		private final Assignment cX14Assignment_13 = (Assignment)cAlternatives.eContents().get(13);
		private final RuleCall cX14ActionOnlyParserRuleCall_13_0 = (RuleCall)cX14Assignment_13.eContents().get(0);
		private final Assignment cX15Assignment_14 = (Assignment)cAlternatives.eContents().get(14);
		private final RuleCall cX15FragmentCallerParserRuleCall_14_0 = (RuleCall)cX15Assignment_14.eContents().get(0);
		private final Assignment cX16Assignment_15 = (Assignment)cAlternatives.eContents().get(15);
		private final RuleCall cX16Bug398890ParserRuleCall_15_0 = (RuleCall)cX16Assignment_15.eContents().get(0);
		
		//Model:
		//    x1=MandatoryKeywords | x2=Exp0 | x3=Exp1 | x4=Exp2 | x5=SingleCrossReference | x6=BooleanAlternative |
		//    x7=UnassignedDatatype | x8=OptionalSingleTransition | x9=OptionalManyTransition | x10=MandatoryManyTransition |
		//    x11=AlternativeTransition | x12=BooleanValues | x13=LongAlternative | x14=ActionOnly | x15=FragmentCaller | x16=Bug398890;
		@Override public ParserRule getRule() { return rule; }
		
		//x1=MandatoryKeywords | x2=Exp0 | x3=Exp1 | x4=Exp2 | x5=SingleCrossReference | x6=BooleanAlternative |
		//x7=UnassignedDatatype | x8=OptionalSingleTransition | x9=OptionalManyTransition | x10=MandatoryManyTransition |
		//x11=AlternativeTransition | x12=BooleanValues | x13=LongAlternative | x14=ActionOnly | x15=FragmentCaller | x16=Bug398890
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//x1=MandatoryKeywords
		public Assignment getX1Assignment_0() { return cX1Assignment_0; }
		
		//MandatoryKeywords
		public RuleCall getX1MandatoryKeywordsParserRuleCall_0_0() { return cX1MandatoryKeywordsParserRuleCall_0_0; }
		
		//x2=Exp0
		public Assignment getX2Assignment_1() { return cX2Assignment_1; }
		
		//Exp0
		public RuleCall getX2Exp0ParserRuleCall_1_0() { return cX2Exp0ParserRuleCall_1_0; }
		
		//x3=Exp1
		public Assignment getX3Assignment_2() { return cX3Assignment_2; }
		
		//Exp1
		public RuleCall getX3Exp1ParserRuleCall_2_0() { return cX3Exp1ParserRuleCall_2_0; }
		
		//x4=Exp2
		public Assignment getX4Assignment_3() { return cX4Assignment_3; }
		
		//Exp2
		public RuleCall getX4Exp2ParserRuleCall_3_0() { return cX4Exp2ParserRuleCall_3_0; }
		
		//x5=SingleCrossReference
		public Assignment getX5Assignment_4() { return cX5Assignment_4; }
		
		//SingleCrossReference
		public RuleCall getX5SingleCrossReferenceParserRuleCall_4_0() { return cX5SingleCrossReferenceParserRuleCall_4_0; }
		
		//x6=BooleanAlternative
		public Assignment getX6Assignment_5() { return cX6Assignment_5; }
		
		//BooleanAlternative
		public RuleCall getX6BooleanAlternativeParserRuleCall_5_0() { return cX6BooleanAlternativeParserRuleCall_5_0; }
		
		//x7=UnassignedDatatype
		public Assignment getX7Assignment_6() { return cX7Assignment_6; }
		
		//UnassignedDatatype
		public RuleCall getX7UnassignedDatatypeParserRuleCall_6_0() { return cX7UnassignedDatatypeParserRuleCall_6_0; }
		
		//x8=OptionalSingleTransition
		public Assignment getX8Assignment_7() { return cX8Assignment_7; }
		
		//OptionalSingleTransition
		public RuleCall getX8OptionalSingleTransitionParserRuleCall_7_0() { return cX8OptionalSingleTransitionParserRuleCall_7_0; }
		
		//x9=OptionalManyTransition
		public Assignment getX9Assignment_8() { return cX9Assignment_8; }
		
		//OptionalManyTransition
		public RuleCall getX9OptionalManyTransitionParserRuleCall_8_0() { return cX9OptionalManyTransitionParserRuleCall_8_0; }
		
		//x10=MandatoryManyTransition
		public Assignment getX10Assignment_9() { return cX10Assignment_9; }
		
		//MandatoryManyTransition
		public RuleCall getX10MandatoryManyTransitionParserRuleCall_9_0() { return cX10MandatoryManyTransitionParserRuleCall_9_0; }
		
		//x11=AlternativeTransition
		public Assignment getX11Assignment_10() { return cX11Assignment_10; }
		
		//AlternativeTransition
		public RuleCall getX11AlternativeTransitionParserRuleCall_10_0() { return cX11AlternativeTransitionParserRuleCall_10_0; }
		
		//x12=BooleanValues
		public Assignment getX12Assignment_11() { return cX12Assignment_11; }
		
		//BooleanValues
		public RuleCall getX12BooleanValuesParserRuleCall_11_0() { return cX12BooleanValuesParserRuleCall_11_0; }
		
		//x13=LongAlternative
		public Assignment getX13Assignment_12() { return cX13Assignment_12; }
		
		//LongAlternative
		public RuleCall getX13LongAlternativeParserRuleCall_12_0() { return cX13LongAlternativeParserRuleCall_12_0; }
		
		//x14=ActionOnly
		public Assignment getX14Assignment_13() { return cX14Assignment_13; }
		
		//ActionOnly
		public RuleCall getX14ActionOnlyParserRuleCall_13_0() { return cX14ActionOnlyParserRuleCall_13_0; }
		
		//x15=FragmentCaller
		public Assignment getX15Assignment_14() { return cX15Assignment_14; }
		
		//FragmentCaller
		public RuleCall getX15FragmentCallerParserRuleCall_14_0() { return cX15FragmentCallerParserRuleCall_14_0; }
		
		//x16=Bug398890
		public Assignment getX16Assignment_15() { return cX16Assignment_15; }
		
		//Bug398890
		public RuleCall getX16Bug398890ParserRuleCall_15_0() { return cX16Bug398890ParserRuleCall_15_0; }
	}
	public class MandatoryKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.MandatoryKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Keyword cKw1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVal2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVal2IDTerminalRuleCall_3_0 = (RuleCall)cVal2Assignment_3.eContents().get(0);
		private final Keyword cKw2Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cKw3Keyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cVal3Assignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cVal3IDTerminalRuleCall_6_0 = (RuleCall)cVal3Assignment_6.eContents().get(0);
		private final Keyword cKw4Keyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MandatoryKeywords:
		//    "#1" val1=ID "kw1" val2=ID "kw2" "kw3" val3=ID "kw4";
		@Override public ParserRule getRule() { return rule; }
		
		//"#1" val1=ID "kw1" val2=ID "kw2" "kw3" val3=ID "kw4"
		public Group getGroup() { return cGroup; }
		
		//"#1"
		public Keyword getNumberSignDigitOneKeyword_0() { return cNumberSignDigitOneKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2() { return cKw1Keyword_2; }
		
		//val2=ID
		public Assignment getVal2Assignment_3() { return cVal2Assignment_3; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_3_0() { return cVal2IDTerminalRuleCall_3_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_4() { return cKw2Keyword_4; }
		
		//"kw3"
		public Keyword getKw3Keyword_5() { return cKw3Keyword_5; }
		
		//val3=ID
		public Assignment getVal3Assignment_6() { return cVal3Assignment_6; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_6_0() { return cVal3IDTerminalRuleCall_6_0; }
		
		//"kw4"
		public Keyword getKw4Keyword_7() { return cKw4Keyword_7; }
	}
	public class Exp0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Exp0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAddition0ParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Exp0:
		//    "#2" Addition0;
		@Override public ParserRule getRule() { return rule; }
		
		//"#2" Addition0
		public Group getGroup() { return cGroup; }
		
		//"#2"
		public Keyword getNumberSignDigitTwoKeyword_0() { return cNumberSignDigitTwoKeyword_0; }
		
		//Addition0
		public RuleCall getAddition0ParserRuleCall_1() { return cAddition0ParserRuleCall_1; }
	}
	public class Addition0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Addition0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrim0ParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAdd0LeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrim0ParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Addition0 returns Exp0:
		//    Prim0 ({Add0.left=current} '+' right=Prim0)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Prim0 ({Add0.left=current} '+' right=Prim0)*
		public Group getGroup() { return cGroup; }
		
		//Prim0
		public RuleCall getPrim0ParserRuleCall_0() { return cPrim0ParserRuleCall_0; }
		
		//({Add0.left=current} '+' right=Prim0)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Add0.left=current}
		public Action getAdd0LeftAction_1_0() { return cAdd0LeftAction_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }
		
		//right=Prim0
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Prim0
		public RuleCall getRightPrim0ParserRuleCall_1_2_0() { return cRightPrim0ParserRuleCall_1_2_0; }
	}
	public class Prim0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Prim0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVal0Action_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Prim0 returns Exp0:
		//    {Val0} name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//{Val0} name=ID
		public Group getGroup() { return cGroup; }
		
		//{Val0}
		public Action getVal0Action_0() { return cVal0Action_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class Exp1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Exp1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAddition1ParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Exp1:
		//    "#3" Addition1;
		@Override public ParserRule getRule() { return rule; }
		
		//"#3" Addition1
		public Group getGroup() { return cGroup; }
		
		//"#3"
		public Keyword getNumberSignDigitThreeKeyword_0() { return cNumberSignDigitThreeKeyword_0; }
		
		//Addition1
		public RuleCall getAddition1ParserRuleCall_1() { return cAddition1ParserRuleCall_1; }
	}
	public class Addition1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Addition1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrim1ParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAdd1LeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrim1ParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Addition1 returns Exp1:
		//    Prim1 ({Add1.left=current} '+' right=Prim1)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Prim1 ({Add1.left=current} '+' right=Prim1)*
		public Group getGroup() { return cGroup; }
		
		//Prim1
		public RuleCall getPrim1ParserRuleCall_0() { return cPrim1ParserRuleCall_0; }
		
		//({Add1.left=current} '+' right=Prim1)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Add1.left=current}
		public Action getAdd1LeftAction_1_0() { return cAdd1LeftAction_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }
		
		//right=Prim1
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Prim1
		public RuleCall getRightPrim1ParserRuleCall_1_2_0() { return cRightPrim1ParserRuleCall_1_2_0; }
	}
	public class Prim1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Prim1");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cVal1Action_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cAddition1ParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Prim1 returns Exp1:
		//    {Val1} name=ID | '(' Addition1 ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{Val1} name=ID | '(' Addition1 ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Val1} name=ID
		public Group getGroup_0() { return cGroup_0; }
		
		//{Val1}
		public Action getVal1Action_0_0() { return cVal1Action_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//'(' Addition1 ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Addition1
		public RuleCall getAddition1ParserRuleCall_1_1() { return cAddition1ParserRuleCall_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	public class Exp2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Exp2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAddition2ParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Exp2:
		//    "#4" Addition2;
		@Override public ParserRule getRule() { return rule; }
		
		//"#4" Addition2
		public Group getGroup() { return cGroup; }
		
		//"#4"
		public Keyword getNumberSignDigitFourKeyword_0() { return cNumberSignDigitFourKeyword_0; }
		
		//Addition2
		public RuleCall getAddition2ParserRuleCall_1() { return cAddition2ParserRuleCall_1; }
	}
	public class Addition2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Addition2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplication2ParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAdd2LeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMultiplication2ParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Addition2 returns Exp2:
		//    Multiplication2 ({Add2.left=current} '+' right=Multiplication2)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Multiplication2 ({Add2.left=current} '+' right=Multiplication2)*
		public Group getGroup() { return cGroup; }
		
		//Multiplication2
		public RuleCall getMultiplication2ParserRuleCall_0() { return cMultiplication2ParserRuleCall_0; }
		
		//({Add2.left=current} '+' right=Multiplication2)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Add2.left=current}
		public Action getAdd2LeftAction_1_0() { return cAdd2LeftAction_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }
		
		//right=Multiplication2
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Multiplication2
		public RuleCall getRightMultiplication2ParserRuleCall_1_2_0() { return cRightMultiplication2ParserRuleCall_1_2_0; }
	}
	public class Multiplication2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Multiplication2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrim2ParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMult2LeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrim2ParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Multiplication2 returns Exp2:
		//    Prim2 ({Mult2.left=current} '*' right=Prim2)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Prim2 ({Mult2.left=current} '*' right=Prim2)*
		public Group getGroup() { return cGroup; }
		
		//Prim2
		public RuleCall getPrim2ParserRuleCall_0() { return cPrim2ParserRuleCall_0; }
		
		//({Mult2.left=current} '*' right=Prim2)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Mult2.left=current}
		public Action getMult2LeftAction_1_0() { return cMult2LeftAction_1_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_1() { return cAsteriskKeyword_1_1; }
		
		//right=Prim2
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Prim2
		public RuleCall getRightPrim2ParserRuleCall_1_2_0() { return cRightPrim2ParserRuleCall_1_2_0; }
	}
	public class Prim2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Prim2");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cVal2Action_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cAddition2ParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Prim2 returns Exp2:
		//    {Val2} name=ID | '(' Addition2 ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{Val2} name=ID | '(' Addition2 ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Val2} name=ID
		public Group getGroup_0() { return cGroup_0; }
		
		//{Val2}
		public Action getVal2Action_0_0() { return cVal2Action_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//'(' Addition2 ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Addition2
		public RuleCall getAddition2ParserRuleCall_1_1() { return cAddition2ParserRuleCall_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	public class DatatypeIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.DatatypeID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DatatypeID:
		//    ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class SingleCrossReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.SingleCrossReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitFiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameTERMINAL_IDTerminalRuleCall_1_0_0 = (RuleCall)cNameAlternatives_1_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_1 = (RuleCall)cNameAlternatives_1_0.eContents().get(1);
		private final Keyword cNameKw5Keyword_1_0_2 = (Keyword)cNameAlternatives_1_0.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cKw1Keyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRef1Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cRef1SingleCrossReferenceCrossReference_2_1_0 = (CrossReference)cRef1Assignment_2_1.eContents().get(0);
		private final RuleCall cRef1SingleCrossReferenceTERMINAL_IDTerminalRuleCall_2_1_0_1 = (RuleCall)cRef1SingleCrossReferenceCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cKw2Keyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cRef2Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cRef2SingleCrossReferenceCrossReference_3_1_0 = (CrossReference)cRef2Assignment_3_1.eContents().get(0);
		private final RuleCall cRef2SingleCrossReferenceDatatypeIDParserRuleCall_3_1_0_1 = (RuleCall)cRef2SingleCrossReferenceCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cKw3Keyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRef3Assignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cRef3SingleCrossReferenceCrossReference_4_1_0 = (CrossReference)cRef3Assignment_4_1.eContents().get(0);
		private final RuleCall cRef3SingleCrossReferenceIDTerminalRuleCall_4_1_0_1 = (RuleCall)cRef3SingleCrossReferenceCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cKw4Keyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cRef4Assignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cRef4SingleCrossReferenceCrossReference_5_1_0 = (CrossReference)cRef4Assignment_5_1.eContents().get(0);
		private final RuleCall cRef4SingleCrossReferenceIDTerminalRuleCall_5_1_0_1 = (RuleCall)cRef4SingleCrossReferenceCrossReference_5_1_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cKw5Keyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cRef5Assignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cRef5SingleCrossReferenceCrossReference_6_1_0 = (CrossReference)cRef5Assignment_6_1.eContents().get(0);
		private final Keyword cRef5SingleCrossReferenceKw5Keyword_6_1_0_1 = (Keyword)cRef5SingleCrossReferenceCrossReference_6_1_0.eContents().get(1);
		
		//SingleCrossReference:
		//    "#5" name=(TERMINAL_ID | ID | "kw5")
		//    ("kw1" ref1=[SingleCrossReference|TERMINAL_ID])?
		//    ("kw2" ref2=[SingleCrossReference|DatatypeID])?
		//    ("kw3" ref3=[SingleCrossReference|ID])?
		//    ("kw4" ref4=[SingleCrossReference])?
		//    ("kw5" ref5=[SingleCrossReference|"kw5"])?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#5" name=(TERMINAL_ID | ID | "kw5")
		//("kw1" ref1=[SingleCrossReference|TERMINAL_ID])?
		//("kw2" ref2=[SingleCrossReference|DatatypeID])?
		//("kw3" ref3=[SingleCrossReference|ID])?
		//("kw4" ref4=[SingleCrossReference])?
		//("kw5" ref5=[SingleCrossReference|"kw5"])?
		public Group getGroup() { return cGroup; }
		
		//"#5"
		public Keyword getNumberSignDigitFiveKeyword_0() { return cNumberSignDigitFiveKeyword_0; }
		
		//name=(TERMINAL_ID | ID | "kw5")
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//(TERMINAL_ID | ID | "kw5")
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }
		
		//TERMINAL_ID
		public RuleCall getNameTERMINAL_IDTerminalRuleCall_1_0_0() { return cNameTERMINAL_IDTerminalRuleCall_1_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_1() { return cNameIDTerminalRuleCall_1_0_1; }
		
		//"kw5"
		public Keyword getNameKw5Keyword_1_0_2() { return cNameKw5Keyword_1_0_2; }
		
		//("kw1" ref1=[SingleCrossReference|TERMINAL_ID])?
		public Group getGroup_2() { return cGroup_2; }
		
		//"kw1"
		public Keyword getKw1Keyword_2_0() { return cKw1Keyword_2_0; }
		
		//ref1=[SingleCrossReference|TERMINAL_ID]
		public Assignment getRef1Assignment_2_1() { return cRef1Assignment_2_1; }
		
		//[SingleCrossReference|TERMINAL_ID]
		public CrossReference getRef1SingleCrossReferenceCrossReference_2_1_0() { return cRef1SingleCrossReferenceCrossReference_2_1_0; }
		
		//TERMINAL_ID
		public RuleCall getRef1SingleCrossReferenceTERMINAL_IDTerminalRuleCall_2_1_0_1() { return cRef1SingleCrossReferenceTERMINAL_IDTerminalRuleCall_2_1_0_1; }
		
		//("kw2" ref2=[SingleCrossReference|DatatypeID])?
		public Group getGroup_3() { return cGroup_3; }
		
		//"kw2"
		public Keyword getKw2Keyword_3_0() { return cKw2Keyword_3_0; }
		
		//ref2=[SingleCrossReference|DatatypeID]
		public Assignment getRef2Assignment_3_1() { return cRef2Assignment_3_1; }
		
		//[SingleCrossReference|DatatypeID]
		public CrossReference getRef2SingleCrossReferenceCrossReference_3_1_0() { return cRef2SingleCrossReferenceCrossReference_3_1_0; }
		
		//DatatypeID
		public RuleCall getRef2SingleCrossReferenceDatatypeIDParserRuleCall_3_1_0_1() { return cRef2SingleCrossReferenceDatatypeIDParserRuleCall_3_1_0_1; }
		
		//("kw3" ref3=[SingleCrossReference|ID])?
		public Group getGroup_4() { return cGroup_4; }
		
		//"kw3"
		public Keyword getKw3Keyword_4_0() { return cKw3Keyword_4_0; }
		
		//ref3=[SingleCrossReference|ID]
		public Assignment getRef3Assignment_4_1() { return cRef3Assignment_4_1; }
		
		//[SingleCrossReference|ID]
		public CrossReference getRef3SingleCrossReferenceCrossReference_4_1_0() { return cRef3SingleCrossReferenceCrossReference_4_1_0; }
		
		//ID
		public RuleCall getRef3SingleCrossReferenceIDTerminalRuleCall_4_1_0_1() { return cRef3SingleCrossReferenceIDTerminalRuleCall_4_1_0_1; }
		
		//("kw4" ref4=[SingleCrossReference])?
		public Group getGroup_5() { return cGroup_5; }
		
		//"kw4"
		public Keyword getKw4Keyword_5_0() { return cKw4Keyword_5_0; }
		
		//ref4=[SingleCrossReference]
		public Assignment getRef4Assignment_5_1() { return cRef4Assignment_5_1; }
		
		//[SingleCrossReference]
		public CrossReference getRef4SingleCrossReferenceCrossReference_5_1_0() { return cRef4SingleCrossReferenceCrossReference_5_1_0; }
		
		//ID
		public RuleCall getRef4SingleCrossReferenceIDTerminalRuleCall_5_1_0_1() { return cRef4SingleCrossReferenceIDTerminalRuleCall_5_1_0_1; }
		
		//("kw5" ref5=[SingleCrossReference|"kw5"])?
		public Group getGroup_6() { return cGroup_6; }
		
		//"kw5"
		public Keyword getKw5Keyword_6_0() { return cKw5Keyword_6_0; }
		
		//ref5=[SingleCrossReference|"kw5"]
		public Assignment getRef5Assignment_6_1() { return cRef5Assignment_6_1; }
		
		//[SingleCrossReference|"kw5"]
		public CrossReference getRef5SingleCrossReferenceCrossReference_6_1_0() { return cRef5SingleCrossReferenceCrossReference_6_1_0; }
		
		//"kw5"
		public Keyword getRef5SingleCrossReferenceKw5Keyword_6_1_0_1() { return cRef5SingleCrossReferenceKw5Keyword_6_1_0_1; }
	}
	public class BooleanAlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BooleanAlternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitSixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBoolAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBoolBooleanAlternativeLiteralParserRuleCall_1_0 = (RuleCall)cBoolAssignment_1.eContents().get(0);
		
		//BooleanAlternative:
		//    "#6" bool=BooleanAlternativeLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//"#6" bool=BooleanAlternativeLiteral
		public Group getGroup() { return cGroup; }
		
		//"#6"
		public Keyword getNumberSignDigitSixKeyword_0() { return cNumberSignDigitSixKeyword_0; }
		
		//bool=BooleanAlternativeLiteral
		public Assignment getBoolAssignment_1() { return cBoolAssignment_1; }
		
		//BooleanAlternativeLiteral
		public RuleCall getBoolBooleanAlternativeLiteralParserRuleCall_1_0() { return cBoolBooleanAlternativeLiteralParserRuleCall_1_0; }
	}
	public class BooleanAlternativeLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BooleanAlternativeLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanAlternativeLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cKw1Keyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Assignment cIsTrueAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final Keyword cIsTrueKw2Keyword_1_1_0 = (Keyword)cIsTrueAssignment_1_1.eContents().get(0);
		
		//BooleanAlternativeLiteral:
		//    {BooleanAlternativeLiteral} ("kw1" | isTrue?="kw2");
		@Override public ParserRule getRule() { return rule; }
		
		//{BooleanAlternativeLiteral} ("kw1" | isTrue?="kw2")
		public Group getGroup() { return cGroup; }
		
		//{BooleanAlternativeLiteral}
		public Action getBooleanAlternativeLiteralAction_0() { return cBooleanAlternativeLiteralAction_0; }
		
		//("kw1" | isTrue?="kw2")
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_0() { return cKw1Keyword_1_0; }
		
		//isTrue?="kw2"
		public Assignment getIsTrueAssignment_1_1() { return cIsTrueAssignment_1_1; }
		
		//"kw2"
		public Keyword getIsTrueKw2Keyword_1_1_0() { return cIsTrueKw2Keyword_1_1_0; }
	}
	public class UnassignedDatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.UnassignedDatatype");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitSevenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValIDTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		private final RuleCall cKW1ParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//UnassignedDatatype:
		//    "#7" val=ID KW1;
		@Override public ParserRule getRule() { return rule; }
		
		//"#7" val=ID KW1
		public Group getGroup() { return cGroup; }
		
		//"#7"
		public Keyword getNumberSignDigitSevenKeyword_0() { return cNumberSignDigitSevenKeyword_0; }
		
		//val=ID
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_0() { return cValIDTerminalRuleCall_1_0; }
		
		//KW1
		public RuleCall getKW1ParserRuleCall_2() { return cKW1ParserRuleCall_2; }
	}
	public class KW1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.KW1");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cKw1Keyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cMatchedKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//KW1:
		//    "kw1" | "matched" INT?;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw1" | "matched" INT?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"kw1"
		public Keyword getKw1Keyword_0() { return cKw1Keyword_0; }
		
		//"matched" INT?
		public Group getGroup_1() { return cGroup_1; }
		
		//"matched"
		public Keyword getMatchedKeyword_1_0() { return cMatchedKeyword_1_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
	}
	public class OptionalSingleTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.OptionalSingleTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitEightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cKW1ParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValIDTerminalRuleCall_2_0 = (RuleCall)cValAssignment_2.eContents().get(0);
		
		//OptionalSingleTransition:
		//    "#8" KW1? val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#8" KW1? val=ID
		public Group getGroup() { return cGroup; }
		
		//"#8"
		public Keyword getNumberSignDigitEightKeyword_0() { return cNumberSignDigitEightKeyword_0; }
		
		//KW1?
		public RuleCall getKW1ParserRuleCall_1() { return cKW1ParserRuleCall_1; }
		
		//val=ID
		public Assignment getValAssignment_2() { return cValAssignment_2; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_2_0() { return cValIDTerminalRuleCall_2_0; }
	}
	public class OptionalManyTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.OptionalManyTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitNineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cKW1ParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValIDTerminalRuleCall_2_0 = (RuleCall)cValAssignment_2.eContents().get(0);
		
		//OptionalManyTransition:
		//    "#9" KW1* val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#9" KW1* val=ID
		public Group getGroup() { return cGroup; }
		
		//"#9"
		public Keyword getNumberSignDigitNineKeyword_0() { return cNumberSignDigitNineKeyword_0; }
		
		//KW1*
		public RuleCall getKW1ParserRuleCall_1() { return cKW1ParserRuleCall_1; }
		
		//val=ID
		public Assignment getValAssignment_2() { return cValAssignment_2; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_2_0() { return cValIDTerminalRuleCall_2_0; }
	}
	public class MandatoryManyTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.MandatoryManyTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitZeroKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cKW1ParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValIDTerminalRuleCall_2_0 = (RuleCall)cValAssignment_2.eContents().get(0);
		
		//MandatoryManyTransition:
		//    "#10" KW1+ val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#10" KW1+ val=ID
		public Group getGroup() { return cGroup; }
		
		//"#10"
		public Keyword getNumberSignDigitOneDigitZeroKeyword_0() { return cNumberSignDigitOneDigitZeroKeyword_0; }
		
		//KW1+
		public RuleCall getKW1ParserRuleCall_1() { return cKW1ParserRuleCall_1; }
		
		//val=ID
		public Assignment getValAssignment_2() { return cValAssignment_2; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_2_0() { return cValIDTerminalRuleCall_2_0; }
	}
	public class AlternativeTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.AlternativeTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cKW1ParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final Keyword cKw2Keyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Assignment cValAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValIDTerminalRuleCall_2_0 = (RuleCall)cValAssignment_2.eContents().get(0);
		
		//AlternativeTransition:
		//    "#11" (KW1 | "kw2") val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#11" (KW1 | "kw2") val=ID
		public Group getGroup() { return cGroup; }
		
		//"#11"
		public Keyword getNumberSignDigitOneDigitOneKeyword_0() { return cNumberSignDigitOneDigitOneKeyword_0; }
		
		//(KW1 | "kw2")
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//KW1
		public RuleCall getKW1ParserRuleCall_1_0() { return cKW1ParserRuleCall_1_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_1_1() { return cKw2Keyword_1_1; }
		
		//val=ID
		public Assignment getValAssignment_2() { return cValAssignment_2; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_2_0() { return cValIDTerminalRuleCall_2_0; }
	}
	public class BooleanDatatypeIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BooleanDatatypeID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//BooleanDatatypeID:
		//    ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class BooleanValuesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BooleanValues");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanValuesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNumberSignDigitOneDigitTwoKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVal1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cVal1Kw1Keyword_2_0 = (Keyword)cVal1Assignment_2.eContents().get(0);
		private final Assignment cVal2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVal2BOOLEAN_TERMINAL_IDTerminalRuleCall_3_0 = (RuleCall)cVal2Assignment_3.eContents().get(0);
		private final Assignment cVal3Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cVal3BooleanDatatypeIDParserRuleCall_4_0 = (RuleCall)cVal3Assignment_4.eContents().get(0);
		
		//BooleanValues:
		//    {BooleanValues} "#12" val1?="kw1"? val2?=BOOLEAN_TERMINAL_ID? val3?=BooleanDatatypeID?;
		@Override public ParserRule getRule() { return rule; }
		
		//{BooleanValues} "#12" val1?="kw1"? val2?=BOOLEAN_TERMINAL_ID? val3?=BooleanDatatypeID?
		public Group getGroup() { return cGroup; }
		
		//{BooleanValues}
		public Action getBooleanValuesAction_0() { return cBooleanValuesAction_0; }
		
		//"#12"
		public Keyword getNumberSignDigitOneDigitTwoKeyword_1() { return cNumberSignDigitOneDigitTwoKeyword_1; }
		
		//val1?="kw1"?
		public Assignment getVal1Assignment_2() { return cVal1Assignment_2; }
		
		//"kw1"
		public Keyword getVal1Kw1Keyword_2_0() { return cVal1Kw1Keyword_2_0; }
		
		//val2?=BOOLEAN_TERMINAL_ID?
		public Assignment getVal2Assignment_3() { return cVal2Assignment_3; }
		
		//BOOLEAN_TERMINAL_ID
		public RuleCall getVal2BOOLEAN_TERMINAL_IDTerminalRuleCall_3_0() { return cVal2BOOLEAN_TERMINAL_IDTerminalRuleCall_3_0; }
		
		//val3?=BooleanDatatypeID?
		public Assignment getVal3Assignment_4() { return cVal3Assignment_4; }
		
		//BooleanDatatypeID
		public RuleCall getVal3BooleanDatatypeIDParserRuleCall_4_0() { return cVal3BooleanDatatypeIDParserRuleCall_4_0; }
	}
	public class LongAlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.LongAlternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFooAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFooIDTerminalRuleCall_1_0 = (RuleCall)cFooAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cKw1Keyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cVal1Assignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_2_0_1_0 = (RuleCall)cVal1Assignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cKw2Keyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cVal2Assignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_2_1_1_0 = (RuleCall)cVal2Assignment_2_1_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cAlternatives_2.eContents().get(2);
		private final Keyword cKw3Keyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cVal3Assignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_2_2_1_0 = (RuleCall)cVal3Assignment_2_2_1.eContents().get(0);
		private final Group cGroup_2_3 = (Group)cAlternatives_2.eContents().get(3);
		private final Keyword cKw4Keyword_2_3_0 = (Keyword)cGroup_2_3.eContents().get(0);
		private final Assignment cVal4Assignment_2_3_1 = (Assignment)cGroup_2_3.eContents().get(1);
		private final RuleCall cVal4IDTerminalRuleCall_2_3_1_0 = (RuleCall)cVal4Assignment_2_3_1.eContents().get(0);
		private final Group cGroup_2_4 = (Group)cAlternatives_2.eContents().get(4);
		private final Keyword cKw5Keyword_2_4_0 = (Keyword)cGroup_2_4.eContents().get(0);
		private final Assignment cVal5Assignment_2_4_1 = (Assignment)cGroup_2_4.eContents().get(1);
		private final RuleCall cVal5IDTerminalRuleCall_2_4_1_0 = (RuleCall)cVal5Assignment_2_4_1.eContents().get(0);
		private final Group cGroup_2_5 = (Group)cAlternatives_2.eContents().get(5);
		private final Keyword cKw6Keyword_2_5_0 = (Keyword)cGroup_2_5.eContents().get(0);
		private final Assignment cVal6Assignment_2_5_1 = (Assignment)cGroup_2_5.eContents().get(1);
		private final RuleCall cVal6IDTerminalRuleCall_2_5_1_0 = (RuleCall)cVal6Assignment_2_5_1.eContents().get(0);
		private final Group cGroup_2_6 = (Group)cAlternatives_2.eContents().get(6);
		private final Keyword cKw7Keyword_2_6_0 = (Keyword)cGroup_2_6.eContents().get(0);
		private final Assignment cVal7Assignment_2_6_1 = (Assignment)cGroup_2_6.eContents().get(1);
		private final RuleCall cVal7IDTerminalRuleCall_2_6_1_0 = (RuleCall)cVal7Assignment_2_6_1.eContents().get(0);
		private final Group cGroup_2_7 = (Group)cAlternatives_2.eContents().get(7);
		private final Keyword cKw8Keyword_2_7_0 = (Keyword)cGroup_2_7.eContents().get(0);
		private final Assignment cVal8Assignment_2_7_1 = (Assignment)cGroup_2_7.eContents().get(1);
		private final RuleCall cVal8IDTerminalRuleCall_2_7_1_0 = (RuleCall)cVal8Assignment_2_7_1.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//LongAlternative:
		//  '#13' foo=ID
		//    ("kw1" val1+=ID? |
		//     "kw2" val2+=ID? |
		//     "kw3" val3+=ID? |
		//     "kw4" val4+=ID? |
		//     "kw5" val5+=ID? |
		//     "kw6" val6+=ID? |
		//     "kw7" val7+=ID? |
		//     "kw8" val8+=ID?)*
		//  '!';
		@Override public ParserRule getRule() { return rule; }
		
		//'#13' foo=ID
		//  ("kw1" val1+=ID? |
		//   "kw2" val2+=ID? |
		//   "kw3" val3+=ID? |
		//   "kw4" val4+=ID? |
		//   "kw5" val5+=ID? |
		//   "kw6" val6+=ID? |
		//   "kw7" val7+=ID? |
		//   "kw8" val8+=ID?)*
		//'!'
		public Group getGroup() { return cGroup; }
		
		//'#13'
		public Keyword getNumberSignDigitOneDigitThreeKeyword_0() { return cNumberSignDigitOneDigitThreeKeyword_0; }
		
		//foo=ID
		public Assignment getFooAssignment_1() { return cFooAssignment_1; }
		
		//ID
		public RuleCall getFooIDTerminalRuleCall_1_0() { return cFooIDTerminalRuleCall_1_0; }
		
		//("kw1" val1+=ID? |
		// "kw2" val2+=ID? |
		// "kw3" val3+=ID? |
		// "kw4" val4+=ID? |
		// "kw5" val5+=ID? |
		// "kw6" val6+=ID? |
		// "kw7" val7+=ID? |
		// "kw8" val8+=ID?)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//"kw1" val1+=ID?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2_0_0() { return cKw1Keyword_2_0_0; }
		
		//val1+=ID?
		public Assignment getVal1Assignment_2_0_1() { return cVal1Assignment_2_0_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_0_1_0() { return cVal1IDTerminalRuleCall_2_0_1_0; }
		
		//"kw2" val2+=ID?
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//"kw2"
		public Keyword getKw2Keyword_2_1_0() { return cKw2Keyword_2_1_0; }
		
		//val2+=ID?
		public Assignment getVal2Assignment_2_1_1() { return cVal2Assignment_2_1_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_2_1_1_0() { return cVal2IDTerminalRuleCall_2_1_1_0; }
		
		//"kw3" val3+=ID?
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//"kw3"
		public Keyword getKw3Keyword_2_2_0() { return cKw3Keyword_2_2_0; }
		
		//val3+=ID?
		public Assignment getVal3Assignment_2_2_1() { return cVal3Assignment_2_2_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_2_2_1_0() { return cVal3IDTerminalRuleCall_2_2_1_0; }
		
		//"kw4" val4+=ID?
		public Group getGroup_2_3() { return cGroup_2_3; }
		
		//"kw4"
		public Keyword getKw4Keyword_2_3_0() { return cKw4Keyword_2_3_0; }
		
		//val4+=ID?
		public Assignment getVal4Assignment_2_3_1() { return cVal4Assignment_2_3_1; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_2_3_1_0() { return cVal4IDTerminalRuleCall_2_3_1_0; }
		
		//"kw5" val5+=ID?
		public Group getGroup_2_4() { return cGroup_2_4; }
		
		//"kw5"
		public Keyword getKw5Keyword_2_4_0() { return cKw5Keyword_2_4_0; }
		
		//val5+=ID?
		public Assignment getVal5Assignment_2_4_1() { return cVal5Assignment_2_4_1; }
		
		//ID
		public RuleCall getVal5IDTerminalRuleCall_2_4_1_0() { return cVal5IDTerminalRuleCall_2_4_1_0; }
		
		//"kw6" val6+=ID?
		public Group getGroup_2_5() { return cGroup_2_5; }
		
		//"kw6"
		public Keyword getKw6Keyword_2_5_0() { return cKw6Keyword_2_5_0; }
		
		//val6+=ID?
		public Assignment getVal6Assignment_2_5_1() { return cVal6Assignment_2_5_1; }
		
		//ID
		public RuleCall getVal6IDTerminalRuleCall_2_5_1_0() { return cVal6IDTerminalRuleCall_2_5_1_0; }
		
		//"kw7" val7+=ID?
		public Group getGroup_2_6() { return cGroup_2_6; }
		
		//"kw7"
		public Keyword getKw7Keyword_2_6_0() { return cKw7Keyword_2_6_0; }
		
		//val7+=ID?
		public Assignment getVal7Assignment_2_6_1() { return cVal7Assignment_2_6_1; }
		
		//ID
		public RuleCall getVal7IDTerminalRuleCall_2_6_1_0() { return cVal7IDTerminalRuleCall_2_6_1_0; }
		
		//"kw8" val8+=ID?
		public Group getGroup_2_7() { return cGroup_2_7; }
		
		//"kw8"
		public Keyword getKw8Keyword_2_7_0() { return cKw8Keyword_2_7_0; }
		
		//val8+=ID?
		public Assignment getVal8Assignment_2_7_1() { return cVal8Assignment_2_7_1; }
		
		//ID
		public RuleCall getVal8IDTerminalRuleCall_2_7_1_0() { return cVal8IDTerminalRuleCall_2_7_1_0; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_3() { return cExclamationMarkKeyword_3; }
	}
	public class ActionOnlyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.ActionOnly");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cKw1Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Action cActionOnlyAction_3 = (Action)cGroup.eContents().get(3);
		private final Keyword cKw2Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cIDTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//ActionOnly:
		//    "#14" "kw1"? =>ID? {ActionOnly} "kw2"? ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#14" "kw1"? =>ID? {ActionOnly} "kw2"? ID?
		public Group getGroup() { return cGroup; }
		
		//"#14"
		public Keyword getNumberSignDigitOneDigitFourKeyword_0() { return cNumberSignDigitOneDigitFourKeyword_0; }
		
		//"kw1"?
		public Keyword getKw1Keyword_1() { return cKw1Keyword_1; }
		
		//=>ID?
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
		
		//{ActionOnly}
		public Action getActionOnlyAction_3() { return cActionOnlyAction_3; }
		
		//"kw2"?
		public Keyword getKw2Keyword_4() { return cKw2Keyword_4; }
		
		//ID?
		public RuleCall getIDTerminalRuleCall_5() { return cIDTerminalRuleCall_5; }
	}
	public class FragmentCallerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.FragmentCaller");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitFiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final RuleCall cFragment1ParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cValAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValIDTerminalRuleCall_3_0 = (RuleCall)cValAssignment_3.eContents().get(0);
		
		//FragmentCaller returns FragmentCallerType:
		//    "#15" val1=ID Fragment1 val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#15" val1=ID Fragment1 val=ID
		public Group getGroup() { return cGroup; }
		
		//"#15"
		public Keyword getNumberSignDigitOneDigitFiveKeyword_0() { return cNumberSignDigitOneDigitFiveKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//Fragment1
		public RuleCall getFragment1ParserRuleCall_2() { return cFragment1ParserRuleCall_2; }
		
		//val=ID
		public Assignment getValAssignment_3() { return cValAssignment_3; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_3_0() { return cValIDTerminalRuleCall_3_0; }
	}
	public class Fragment1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Fragment1");
		private final Assignment cFragValAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFragValIDTerminalRuleCall_0 = (RuleCall)cFragValAssignment.eContents().get(0);
		
		//fragment Fragment1 returns FragmentCallerType:
		//    fragVal=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//fragVal=ID
		public Assignment getFragValAssignment() { return cFragValAssignment; }
		
		//ID
		public RuleCall getFragValIDTerminalRuleCall_0() { return cFragValIDTerminalRuleCall_0; }
	}
	public class Bug398890Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Bug398890");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cC_COMMENT_ENDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Bug398890:
		//    C_COMMENT_END name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//C_COMMENT_END name=ID
		public Group getGroup() { return cGroup; }
		
		//C_COMMENT_END
		public RuleCall getC_COMMENT_ENDTerminalRuleCall_0() { return cC_COMMENT_ENDTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final MandatoryKeywordsElements pMandatoryKeywords;
	private final Exp0Elements pExp0;
	private final Addition0Elements pAddition0;
	private final Prim0Elements pPrim0;
	private final Exp1Elements pExp1;
	private final Addition1Elements pAddition1;
	private final Prim1Elements pPrim1;
	private final Exp2Elements pExp2;
	private final Addition2Elements pAddition2;
	private final Multiplication2Elements pMultiplication2;
	private final Prim2Elements pPrim2;
	private final TerminalRule tTERMINAL_ID;
	private final DatatypeIDElements pDatatypeID;
	private final SingleCrossReferenceElements pSingleCrossReference;
	private final BooleanAlternativeElements pBooleanAlternative;
	private final BooleanAlternativeLiteralElements pBooleanAlternativeLiteral;
	private final UnassignedDatatypeElements pUnassignedDatatype;
	private final KW1Elements pKW1;
	private final OptionalSingleTransitionElements pOptionalSingleTransition;
	private final OptionalManyTransitionElements pOptionalManyTransition;
	private final MandatoryManyTransitionElements pMandatoryManyTransition;
	private final AlternativeTransitionElements pAlternativeTransition;
	private final TerminalRule tBOOLEAN_TERMINAL_ID;
	private final BooleanDatatypeIDElements pBooleanDatatypeID;
	private final BooleanValuesElements pBooleanValues;
	private final LongAlternativeElements pLongAlternative;
	private final ActionOnlyElements pActionOnly;
	private final FragmentCallerElements pFragmentCaller;
	private final Fragment1Elements pFragment1;
	private final Bug398890Elements pBug398890;
	private final TerminalRule tC_COMMENT_END;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SyntacticSequencerTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pMandatoryKeywords = new MandatoryKeywordsElements();
		this.pExp0 = new Exp0Elements();
		this.pAddition0 = new Addition0Elements();
		this.pPrim0 = new Prim0Elements();
		this.pExp1 = new Exp1Elements();
		this.pAddition1 = new Addition1Elements();
		this.pPrim1 = new Prim1Elements();
		this.pExp2 = new Exp2Elements();
		this.pAddition2 = new Addition2Elements();
		this.pMultiplication2 = new Multiplication2Elements();
		this.pPrim2 = new Prim2Elements();
		this.tTERMINAL_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.TERMINAL_ID");
		this.pDatatypeID = new DatatypeIDElements();
		this.pSingleCrossReference = new SingleCrossReferenceElements();
		this.pBooleanAlternative = new BooleanAlternativeElements();
		this.pBooleanAlternativeLiteral = new BooleanAlternativeLiteralElements();
		this.pUnassignedDatatype = new UnassignedDatatypeElements();
		this.pKW1 = new KW1Elements();
		this.pOptionalSingleTransition = new OptionalSingleTransitionElements();
		this.pOptionalManyTransition = new OptionalManyTransitionElements();
		this.pMandatoryManyTransition = new MandatoryManyTransitionElements();
		this.pAlternativeTransition = new AlternativeTransitionElements();
		this.tBOOLEAN_TERMINAL_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BOOLEAN_TERMINAL_ID");
		this.pBooleanDatatypeID = new BooleanDatatypeIDElements();
		this.pBooleanValues = new BooleanValuesElements();
		this.pLongAlternative = new LongAlternativeElements();
		this.pActionOnly = new ActionOnlyElements();
		this.pFragmentCaller = new FragmentCallerElements();
		this.pFragment1 = new Fragment1Elements();
		this.pBug398890 = new Bug398890Elements();
		this.tC_COMMENT_END = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.C_COMMENT_END");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage".equals(grammar.getName())) {
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

	
	//Model:
	//    x1=MandatoryKeywords | x2=Exp0 | x3=Exp1 | x4=Exp2 | x5=SingleCrossReference | x6=BooleanAlternative |
	//    x7=UnassignedDatatype | x8=OptionalSingleTransition | x9=OptionalManyTransition | x10=MandatoryManyTransition |
	//    x11=AlternativeTransition | x12=BooleanValues | x13=LongAlternative | x14=ActionOnly | x15=FragmentCaller | x16=Bug398890;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//MandatoryKeywords:
	//    "#1" val1=ID "kw1" val2=ID "kw2" "kw3" val3=ID "kw4";
	public MandatoryKeywordsElements getMandatoryKeywordsAccess() {
		return pMandatoryKeywords;
	}
	
	public ParserRule getMandatoryKeywordsRule() {
		return getMandatoryKeywordsAccess().getRule();
	}
	
	//Exp0:
	//    "#2" Addition0;
	public Exp0Elements getExp0Access() {
		return pExp0;
	}
	
	public ParserRule getExp0Rule() {
		return getExp0Access().getRule();
	}
	
	//Addition0 returns Exp0:
	//    Prim0 ({Add0.left=current} '+' right=Prim0)*;
	public Addition0Elements getAddition0Access() {
		return pAddition0;
	}
	
	public ParserRule getAddition0Rule() {
		return getAddition0Access().getRule();
	}
	
	//Prim0 returns Exp0:
	//    {Val0} name=ID;
	public Prim0Elements getPrim0Access() {
		return pPrim0;
	}
	
	public ParserRule getPrim0Rule() {
		return getPrim0Access().getRule();
	}
	
	//Exp1:
	//    "#3" Addition1;
	public Exp1Elements getExp1Access() {
		return pExp1;
	}
	
	public ParserRule getExp1Rule() {
		return getExp1Access().getRule();
	}
	
	//Addition1 returns Exp1:
	//    Prim1 ({Add1.left=current} '+' right=Prim1)*;
	public Addition1Elements getAddition1Access() {
		return pAddition1;
	}
	
	public ParserRule getAddition1Rule() {
		return getAddition1Access().getRule();
	}
	
	//Prim1 returns Exp1:
	//    {Val1} name=ID | '(' Addition1 ')';
	public Prim1Elements getPrim1Access() {
		return pPrim1;
	}
	
	public ParserRule getPrim1Rule() {
		return getPrim1Access().getRule();
	}
	
	//Exp2:
	//    "#4" Addition2;
	public Exp2Elements getExp2Access() {
		return pExp2;
	}
	
	public ParserRule getExp2Rule() {
		return getExp2Access().getRule();
	}
	
	//Addition2 returns Exp2:
	//    Multiplication2 ({Add2.left=current} '+' right=Multiplication2)*;
	public Addition2Elements getAddition2Access() {
		return pAddition2;
	}
	
	public ParserRule getAddition2Rule() {
		return getAddition2Access().getRule();
	}
	
	//Multiplication2 returns Exp2:
	//    Prim2 ({Mult2.left=current} '*' right=Prim2)*;
	public Multiplication2Elements getMultiplication2Access() {
		return pMultiplication2;
	}
	
	public ParserRule getMultiplication2Rule() {
		return getMultiplication2Access().getRule();
	}
	
	//Prim2 returns Exp2:
	//    {Val2} name=ID | '(' Addition2 ')';
	public Prim2Elements getPrim2Access() {
		return pPrim2;
	}
	
	public ParserRule getPrim2Rule() {
		return getPrim2Access().getRule();
	}
	
	//terminal TERMINAL_ID:
	//    '$1' ID;
	public TerminalRule getTERMINAL_IDRule() {
		return tTERMINAL_ID;
	}
	
	//DatatypeID:
	//    ID;
	public DatatypeIDElements getDatatypeIDAccess() {
		return pDatatypeID;
	}
	
	public ParserRule getDatatypeIDRule() {
		return getDatatypeIDAccess().getRule();
	}
	
	//SingleCrossReference:
	//    "#5" name=(TERMINAL_ID | ID | "kw5")
	//    ("kw1" ref1=[SingleCrossReference|TERMINAL_ID])?
	//    ("kw2" ref2=[SingleCrossReference|DatatypeID])?
	//    ("kw3" ref3=[SingleCrossReference|ID])?
	//    ("kw4" ref4=[SingleCrossReference])?
	//    ("kw5" ref5=[SingleCrossReference|"kw5"])?;
	public SingleCrossReferenceElements getSingleCrossReferenceAccess() {
		return pSingleCrossReference;
	}
	
	public ParserRule getSingleCrossReferenceRule() {
		return getSingleCrossReferenceAccess().getRule();
	}
	
	//BooleanAlternative:
	//    "#6" bool=BooleanAlternativeLiteral;
	public BooleanAlternativeElements getBooleanAlternativeAccess() {
		return pBooleanAlternative;
	}
	
	public ParserRule getBooleanAlternativeRule() {
		return getBooleanAlternativeAccess().getRule();
	}
	
	//BooleanAlternativeLiteral:
	//    {BooleanAlternativeLiteral} ("kw1" | isTrue?="kw2");
	public BooleanAlternativeLiteralElements getBooleanAlternativeLiteralAccess() {
		return pBooleanAlternativeLiteral;
	}
	
	public ParserRule getBooleanAlternativeLiteralRule() {
		return getBooleanAlternativeLiteralAccess().getRule();
	}
	
	//UnassignedDatatype:
	//    "#7" val=ID KW1;
	public UnassignedDatatypeElements getUnassignedDatatypeAccess() {
		return pUnassignedDatatype;
	}
	
	public ParserRule getUnassignedDatatypeRule() {
		return getUnassignedDatatypeAccess().getRule();
	}
	
	//KW1:
	//    "kw1" | "matched" INT?;
	public KW1Elements getKW1Access() {
		return pKW1;
	}
	
	public ParserRule getKW1Rule() {
		return getKW1Access().getRule();
	}
	
	//OptionalSingleTransition:
	//    "#8" KW1? val=ID;
	public OptionalSingleTransitionElements getOptionalSingleTransitionAccess() {
		return pOptionalSingleTransition;
	}
	
	public ParserRule getOptionalSingleTransitionRule() {
		return getOptionalSingleTransitionAccess().getRule();
	}
	
	//OptionalManyTransition:
	//    "#9" KW1* val=ID;
	public OptionalManyTransitionElements getOptionalManyTransitionAccess() {
		return pOptionalManyTransition;
	}
	
	public ParserRule getOptionalManyTransitionRule() {
		return getOptionalManyTransitionAccess().getRule();
	}
	
	//MandatoryManyTransition:
	//    "#10" KW1+ val=ID;
	public MandatoryManyTransitionElements getMandatoryManyTransitionAccess() {
		return pMandatoryManyTransition;
	}
	
	public ParserRule getMandatoryManyTransitionRule() {
		return getMandatoryManyTransitionAccess().getRule();
	}
	
	//AlternativeTransition:
	//    "#11" (KW1 | "kw2") val=ID;
	public AlternativeTransitionElements getAlternativeTransitionAccess() {
		return pAlternativeTransition;
	}
	
	public ParserRule getAlternativeTransitionRule() {
		return getAlternativeTransitionAccess().getRule();
	}
	
	//terminal BOOLEAN_TERMINAL_ID:
	//    '%1' ID;
	public TerminalRule getBOOLEAN_TERMINAL_IDRule() {
		return tBOOLEAN_TERMINAL_ID;
	}
	
	//BooleanDatatypeID:
	//    ID;
	public BooleanDatatypeIDElements getBooleanDatatypeIDAccess() {
		return pBooleanDatatypeID;
	}
	
	public ParserRule getBooleanDatatypeIDRule() {
		return getBooleanDatatypeIDAccess().getRule();
	}
	
	//BooleanValues:
	//    {BooleanValues} "#12" val1?="kw1"? val2?=BOOLEAN_TERMINAL_ID? val3?=BooleanDatatypeID?;
	public BooleanValuesElements getBooleanValuesAccess() {
		return pBooleanValues;
	}
	
	public ParserRule getBooleanValuesRule() {
		return getBooleanValuesAccess().getRule();
	}
	
	//LongAlternative:
	//  '#13' foo=ID
	//    ("kw1" val1+=ID? |
	//     "kw2" val2+=ID? |
	//     "kw3" val3+=ID? |
	//     "kw4" val4+=ID? |
	//     "kw5" val5+=ID? |
	//     "kw6" val6+=ID? |
	//     "kw7" val7+=ID? |
	//     "kw8" val8+=ID?)*
	//  '!';
	public LongAlternativeElements getLongAlternativeAccess() {
		return pLongAlternative;
	}
	
	public ParserRule getLongAlternativeRule() {
		return getLongAlternativeAccess().getRule();
	}
	
	//ActionOnly:
	//    "#14" "kw1"? =>ID? {ActionOnly} "kw2"? ID?;
	public ActionOnlyElements getActionOnlyAccess() {
		return pActionOnly;
	}
	
	public ParserRule getActionOnlyRule() {
		return getActionOnlyAccess().getRule();
	}
	
	//FragmentCaller returns FragmentCallerType:
	//    "#15" val1=ID Fragment1 val=ID;
	public FragmentCallerElements getFragmentCallerAccess() {
		return pFragmentCaller;
	}
	
	public ParserRule getFragmentCallerRule() {
		return getFragmentCallerAccess().getRule();
	}
	
	//fragment Fragment1 returns FragmentCallerType:
	//    fragVal=ID;
	public Fragment1Elements getFragment1Access() {
		return pFragment1;
	}
	
	public ParserRule getFragment1Rule() {
		return getFragment1Access().getRule();
	}
	
	//Bug398890:
	//    C_COMMENT_END name=ID
	//;
	public Bug398890Elements getBug398890Access() {
		return pBug398890;
	}
	
	public ParserRule getBug398890Rule() {
		return getBug398890Access().getRule();
	}
	
	//terminal C_COMMENT_END: '*/';
	public TerminalRule getC_COMMENT_ENDRule() {
		return tC_COMMENT_END;
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
