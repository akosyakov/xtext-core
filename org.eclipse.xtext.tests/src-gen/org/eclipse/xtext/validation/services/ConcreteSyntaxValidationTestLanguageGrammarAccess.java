/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.validation.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
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
public class ConcreteSyntaxValidationTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cX1Assignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cX1SimpleGroupParserRuleCall_0_0 = (RuleCall)cX1Assignment_0.eContents().get(0);
		private final Assignment cX2Assignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cX2SimpleAlternativeParserRuleCall_1_0 = (RuleCall)cX2Assignment_1.eContents().get(0);
		private final Assignment cX3Assignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cX3SimpleMultiplicitiesParserRuleCall_2_0 = (RuleCall)cX3Assignment_2.eContents().get(0);
		private final Assignment cX4Assignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cX4GroupMultiplicitiesParserRuleCall_3_0 = (RuleCall)cX4Assignment_3.eContents().get(0);
		private final Assignment cX5Assignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cX5AlternativeMultiplicitiesParserRuleCall_4_0 = (RuleCall)cX5Assignment_4.eContents().get(0);
		private final Assignment cX6Assignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cX6AssignedActionParserRuleCall_5_0 = (RuleCall)cX6Assignment_5.eContents().get(0);
		private final Assignment cX7Assignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cX7AssignedActionSecondParserRuleCall_6_0 = (RuleCall)cX7Assignment_6.eContents().get(0);
		private final Assignment cX8Assignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cX8UnassignedAction1ParserRuleCall_7_0 = (RuleCall)cX8Assignment_7.eContents().get(0);
		private final Assignment cX9Assignment_8 = (Assignment)cAlternatives.eContents().get(8);
		private final RuleCall cX9UnassignedAction2ParserRuleCall_8_0 = (RuleCall)cX9Assignment_8.eContents().get(0);
		private final Assignment cX10Assignment_9 = (Assignment)cAlternatives.eContents().get(9);
		private final RuleCall cX10UnassignedAction3ParserRuleCall_9_0 = (RuleCall)cX10Assignment_9.eContents().get(0);
		private final Assignment cX11Assignment_10 = (Assignment)cAlternatives.eContents().get(10);
		private final RuleCall cX11UnassignedRuleCall1ParserRuleCall_10_0 = (RuleCall)cX11Assignment_10.eContents().get(0);
		private final Assignment cX12Assignment_11 = (Assignment)cAlternatives.eContents().get(11);
		private final RuleCall cX12UnassignedRuleCall2ParserRuleCall_11_0 = (RuleCall)cX12Assignment_11.eContents().get(0);
		private final Assignment cX13Assignment_12 = (Assignment)cAlternatives.eContents().get(12);
		private final RuleCall cX13Combination1ParserRuleCall_12_0 = (RuleCall)cX13Assignment_12.eContents().get(0);
		private final Assignment cX14Assignment_13 = (Assignment)cAlternatives.eContents().get(13);
		private final RuleCall cX14Combination2ParserRuleCall_13_0 = (RuleCall)cX14Assignment_13.eContents().get(0);
		private final Assignment cX15Assignment_14 = (Assignment)cAlternatives.eContents().get(14);
		private final RuleCall cX15Combination3ParserRuleCall_14_0 = (RuleCall)cX15Assignment_14.eContents().get(0);
		private final Assignment cX16Assignment_15 = (Assignment)cAlternatives.eContents().get(15);
		private final RuleCall cX16Combination4ParserRuleCall_15_0 = (RuleCall)cX16Assignment_15.eContents().get(0);
		private final Assignment cX17Assignment_16 = (Assignment)cAlternatives.eContents().get(16);
		private final RuleCall cX17List1ParserRuleCall_16_0 = (RuleCall)cX17Assignment_16.eContents().get(0);
		private final Assignment cX18Assignment_17 = (Assignment)cAlternatives.eContents().get(17);
		private final RuleCall cX18List2ParserRuleCall_17_0 = (RuleCall)cX18Assignment_17.eContents().get(0);
		private final Assignment cX19Assignment_18 = (Assignment)cAlternatives.eContents().get(18);
		private final RuleCall cX19List3ParserRuleCall_18_0 = (RuleCall)cX19Assignment_18.eContents().get(0);
		private final Assignment cX20Assignment_19 = (Assignment)cAlternatives.eContents().get(19);
		private final RuleCall cX20List4ParserRuleCall_19_0 = (RuleCall)cX20Assignment_19.eContents().get(0);
		private final Assignment cX21Assignment_20 = (Assignment)cAlternatives.eContents().get(20);
		private final RuleCall cX21List5ParserRuleCall_20_0 = (RuleCall)cX21Assignment_20.eContents().get(0);
		private final Assignment cX22Assignment_21 = (Assignment)cAlternatives.eContents().get(21);
		private final RuleCall cX22AltList1ParserRuleCall_21_0 = (RuleCall)cX22Assignment_21.eContents().get(0);
		private final Assignment cX23Assignment_22 = (Assignment)cAlternatives.eContents().get(22);
		private final RuleCall cX23AltList2ParserRuleCall_22_0 = (RuleCall)cX23Assignment_22.eContents().get(0);
		private final Assignment cX24Assignment_23 = (Assignment)cAlternatives.eContents().get(23);
		private final RuleCall cX24TransientObjectParserRuleCall_23_0 = (RuleCall)cX24Assignment_23.eContents().get(0);
		private final Assignment cX25Assignment_24 = (Assignment)cAlternatives.eContents().get(24);
		private final RuleCall cX25TransientSerializeables1ParserRuleCall_24_0 = (RuleCall)cX25Assignment_24.eContents().get(0);
		private final Assignment cX26Assignment_25 = (Assignment)cAlternatives.eContents().get(25);
		private final RuleCall cX26StaticSimplificationParserRuleCall_25_0 = (RuleCall)cX26Assignment_25.eContents().get(0);
		private final Assignment cX27Assignment_26 = (Assignment)cAlternatives.eContents().get(26);
		private final RuleCall cX27TwoVersionParserRuleCall_26_0 = (RuleCall)cX27Assignment_26.eContents().get(0);
		private final Assignment cX28Assignment_27 = (Assignment)cAlternatives.eContents().get(27);
		private final RuleCall cX28Heuristic1ParserRuleCall_27_0 = (RuleCall)cX28Assignment_27.eContents().get(0);
		
		//Model:
		//    x1=SimpleGroup | x2=SimpleAlternative | x3=SimpleMultiplicities | x4=GroupMultiplicities | x5=AlternativeMultiplicities |
		//    x6=AssignedAction | x7=AssignedActionSecond | x8=UnassignedAction1 | x9=UnassignedAction2 | x10=UnassignedAction3 |
		//    x11=UnassignedRuleCall1 | x12=UnassignedRuleCall2 | x13=Combination1 | x14=Combination2 | x15=Combination3 | x16=Combination4 |
		//    x17=List1 | x18=List2 | x19=List3 | x20=List4 | x21=List5 | x22=AltList1 | x23=AltList2 |
		//    x24=TransientObject | x25=TransientSerializeables1 | x26=StaticSimplification | x27=TwoVersion | x28=Heuristic1;
		@Override public ParserRule getRule() { return rule; }
		
		//x1=SimpleGroup | x2=SimpleAlternative | x3=SimpleMultiplicities | x4=GroupMultiplicities | x5=AlternativeMultiplicities |
		//x6=AssignedAction | x7=AssignedActionSecond | x8=UnassignedAction1 | x9=UnassignedAction2 | x10=UnassignedAction3 |
		//x11=UnassignedRuleCall1 | x12=UnassignedRuleCall2 | x13=Combination1 | x14=Combination2 | x15=Combination3 | x16=Combination4 |
		//x17=List1 | x18=List2 | x19=List3 | x20=List4 | x21=List5 | x22=AltList1 | x23=AltList2 |
		//x24=TransientObject | x25=TransientSerializeables1 | x26=StaticSimplification | x27=TwoVersion | x28=Heuristic1
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//x1=SimpleGroup
		public Assignment getX1Assignment_0() { return cX1Assignment_0; }
		
		//SimpleGroup
		public RuleCall getX1SimpleGroupParserRuleCall_0_0() { return cX1SimpleGroupParserRuleCall_0_0; }
		
		//x2=SimpleAlternative
		public Assignment getX2Assignment_1() { return cX2Assignment_1; }
		
		//SimpleAlternative
		public RuleCall getX2SimpleAlternativeParserRuleCall_1_0() { return cX2SimpleAlternativeParserRuleCall_1_0; }
		
		//x3=SimpleMultiplicities
		public Assignment getX3Assignment_2() { return cX3Assignment_2; }
		
		//SimpleMultiplicities
		public RuleCall getX3SimpleMultiplicitiesParserRuleCall_2_0() { return cX3SimpleMultiplicitiesParserRuleCall_2_0; }
		
		//x4=GroupMultiplicities
		public Assignment getX4Assignment_3() { return cX4Assignment_3; }
		
		//GroupMultiplicities
		public RuleCall getX4GroupMultiplicitiesParserRuleCall_3_0() { return cX4GroupMultiplicitiesParserRuleCall_3_0; }
		
		//x5=AlternativeMultiplicities
		public Assignment getX5Assignment_4() { return cX5Assignment_4; }
		
		//AlternativeMultiplicities
		public RuleCall getX5AlternativeMultiplicitiesParserRuleCall_4_0() { return cX5AlternativeMultiplicitiesParserRuleCall_4_0; }
		
		//x6=AssignedAction
		public Assignment getX6Assignment_5() { return cX6Assignment_5; }
		
		//AssignedAction
		public RuleCall getX6AssignedActionParserRuleCall_5_0() { return cX6AssignedActionParserRuleCall_5_0; }
		
		//x7=AssignedActionSecond
		public Assignment getX7Assignment_6() { return cX7Assignment_6; }
		
		//AssignedActionSecond
		public RuleCall getX7AssignedActionSecondParserRuleCall_6_0() { return cX7AssignedActionSecondParserRuleCall_6_0; }
		
		//x8=UnassignedAction1
		public Assignment getX8Assignment_7() { return cX8Assignment_7; }
		
		//UnassignedAction1
		public RuleCall getX8UnassignedAction1ParserRuleCall_7_0() { return cX8UnassignedAction1ParserRuleCall_7_0; }
		
		//x9=UnassignedAction2
		public Assignment getX9Assignment_8() { return cX9Assignment_8; }
		
		//UnassignedAction2
		public RuleCall getX9UnassignedAction2ParserRuleCall_8_0() { return cX9UnassignedAction2ParserRuleCall_8_0; }
		
		//x10=UnassignedAction3
		public Assignment getX10Assignment_9() { return cX10Assignment_9; }
		
		//UnassignedAction3
		public RuleCall getX10UnassignedAction3ParserRuleCall_9_0() { return cX10UnassignedAction3ParserRuleCall_9_0; }
		
		//x11=UnassignedRuleCall1
		public Assignment getX11Assignment_10() { return cX11Assignment_10; }
		
		//UnassignedRuleCall1
		public RuleCall getX11UnassignedRuleCall1ParserRuleCall_10_0() { return cX11UnassignedRuleCall1ParserRuleCall_10_0; }
		
		//x12=UnassignedRuleCall2
		public Assignment getX12Assignment_11() { return cX12Assignment_11; }
		
		//UnassignedRuleCall2
		public RuleCall getX12UnassignedRuleCall2ParserRuleCall_11_0() { return cX12UnassignedRuleCall2ParserRuleCall_11_0; }
		
		//x13=Combination1
		public Assignment getX13Assignment_12() { return cX13Assignment_12; }
		
		//Combination1
		public RuleCall getX13Combination1ParserRuleCall_12_0() { return cX13Combination1ParserRuleCall_12_0; }
		
		//x14=Combination2
		public Assignment getX14Assignment_13() { return cX14Assignment_13; }
		
		//Combination2
		public RuleCall getX14Combination2ParserRuleCall_13_0() { return cX14Combination2ParserRuleCall_13_0; }
		
		//x15=Combination3
		public Assignment getX15Assignment_14() { return cX15Assignment_14; }
		
		//Combination3
		public RuleCall getX15Combination3ParserRuleCall_14_0() { return cX15Combination3ParserRuleCall_14_0; }
		
		//x16=Combination4
		public Assignment getX16Assignment_15() { return cX16Assignment_15; }
		
		//Combination4
		public RuleCall getX16Combination4ParserRuleCall_15_0() { return cX16Combination4ParserRuleCall_15_0; }
		
		//x17=List1
		public Assignment getX17Assignment_16() { return cX17Assignment_16; }
		
		//List1
		public RuleCall getX17List1ParserRuleCall_16_0() { return cX17List1ParserRuleCall_16_0; }
		
		//x18=List2
		public Assignment getX18Assignment_17() { return cX18Assignment_17; }
		
		//List2
		public RuleCall getX18List2ParserRuleCall_17_0() { return cX18List2ParserRuleCall_17_0; }
		
		//x19=List3
		public Assignment getX19Assignment_18() { return cX19Assignment_18; }
		
		//List3
		public RuleCall getX19List3ParserRuleCall_18_0() { return cX19List3ParserRuleCall_18_0; }
		
		//x20=List4
		public Assignment getX20Assignment_19() { return cX20Assignment_19; }
		
		//List4
		public RuleCall getX20List4ParserRuleCall_19_0() { return cX20List4ParserRuleCall_19_0; }
		
		//x21=List5
		public Assignment getX21Assignment_20() { return cX21Assignment_20; }
		
		//List5
		public RuleCall getX21List5ParserRuleCall_20_0() { return cX21List5ParserRuleCall_20_0; }
		
		//x22=AltList1
		public Assignment getX22Assignment_21() { return cX22Assignment_21; }
		
		//AltList1
		public RuleCall getX22AltList1ParserRuleCall_21_0() { return cX22AltList1ParserRuleCall_21_0; }
		
		//x23=AltList2
		public Assignment getX23Assignment_22() { return cX23Assignment_22; }
		
		//AltList2
		public RuleCall getX23AltList2ParserRuleCall_22_0() { return cX23AltList2ParserRuleCall_22_0; }
		
		//x24=TransientObject
		public Assignment getX24Assignment_23() { return cX24Assignment_23; }
		
		//TransientObject
		public RuleCall getX24TransientObjectParserRuleCall_23_0() { return cX24TransientObjectParserRuleCall_23_0; }
		
		//x25=TransientSerializeables1
		public Assignment getX25Assignment_24() { return cX25Assignment_24; }
		
		//TransientSerializeables1
		public RuleCall getX25TransientSerializeables1ParserRuleCall_24_0() { return cX25TransientSerializeables1ParserRuleCall_24_0; }
		
		//x26=StaticSimplification
		public Assignment getX26Assignment_25() { return cX26Assignment_25; }
		
		//StaticSimplification
		public RuleCall getX26StaticSimplificationParserRuleCall_25_0() { return cX26StaticSimplificationParserRuleCall_25_0; }
		
		//x27=TwoVersion
		public Assignment getX27Assignment_26() { return cX27Assignment_26; }
		
		//TwoVersion
		public RuleCall getX27TwoVersionParserRuleCall_26_0() { return cX27TwoVersionParserRuleCall_26_0; }
		
		//x28=Heuristic1
		public Assignment getX28Assignment_27() { return cX28Assignment_27; }
		
		//Heuristic1
		public RuleCall getX28Heuristic1ParserRuleCall_27_0() { return cX28Heuristic1ParserRuleCall_27_0; }
	}
	public class SimpleGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.SimpleGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Assignment cVal2Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVal2IDTerminalRuleCall_2_0 = (RuleCall)cVal2Assignment_2.eContents().get(0);
		
		//SimpleGroup:
		//    "#1" val1=ID val2=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#1" val1=ID val2=ID
		public Group getGroup() { return cGroup; }
		
		//"#1"
		public Keyword getNumberSignDigitOneKeyword_0() { return cNumberSignDigitOneKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_2() { return cVal2Assignment_2; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_2_0() { return cVal2IDTerminalRuleCall_2_0; }
	}
	public class SimpleAlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.SimpleAlternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cKw1Keyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cVal1Assignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_1_0 = (RuleCall)cVal1Assignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKw2Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVal2Assignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_1_1_1_0 = (RuleCall)cVal2Assignment_1_1_1.eContents().get(0);
		
		//SimpleAlternative:
		//    "#2" ("kw1" val1=ID | "kw2" val2=ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"#2" ("kw1" val1=ID | "kw2" val2=ID)
		public Group getGroup() { return cGroup; }
		
		//"#2"
		public Keyword getNumberSignDigitTwoKeyword_0() { return cNumberSignDigitTwoKeyword_0; }
		
		//("kw1" val1=ID | "kw2" val2=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"kw1" val1=ID
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_0_0() { return cKw1Keyword_1_0_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_0_1() { return cVal1Assignment_1_0_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_1_0() { return cVal1IDTerminalRuleCall_1_0_1_0; }
		
		//"kw2" val2=ID
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw2"
		public Keyword getKw2Keyword_1_1_0() { return cKw2Keyword_1_1_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_1_1() { return cVal2Assignment_1_1_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_1_1_0() { return cVal2IDTerminalRuleCall_1_1_1_0; }
	}
	public class SimpleMultiplicitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.SimpleMultiplicities");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Keyword cKw1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVal2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVal2IDTerminalRuleCall_3_0 = (RuleCall)cVal2Assignment_3.eContents().get(0);
		private final Keyword cKw2Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cVal3Assignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cVal3IDTerminalRuleCall_5_0 = (RuleCall)cVal3Assignment_5.eContents().get(0);
		private final Keyword cKw3Keyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cVal4Assignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cVal4IDTerminalRuleCall_7_0 = (RuleCall)cVal4Assignment_7.eContents().get(0);
		
		//SimpleMultiplicities:
		//    "#3" val1=ID "kw1" val2=ID? "kw2" val3+=ID+ "kw3" val4+=ID*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#3" val1=ID "kw1" val2=ID? "kw2" val3+=ID+ "kw3" val4+=ID*
		public Group getGroup() { return cGroup; }
		
		//"#3"
		public Keyword getNumberSignDigitThreeKeyword_0() { return cNumberSignDigitThreeKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2() { return cKw1Keyword_2; }
		
		//val2=ID?
		public Assignment getVal2Assignment_3() { return cVal2Assignment_3; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_3_0() { return cVal2IDTerminalRuleCall_3_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_4() { return cKw2Keyword_4; }
		
		//val3+=ID+
		public Assignment getVal3Assignment_5() { return cVal3Assignment_5; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_5_0() { return cVal3IDTerminalRuleCall_5_0; }
		
		//"kw3"
		public Keyword getKw3Keyword_6() { return cKw3Keyword_6; }
		
		//val4+=ID*
		public Assignment getVal4Assignment_7() { return cVal4Assignment_7; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_7_0() { return cVal4IDTerminalRuleCall_7_0; }
	}
	public class GroupMultiplicitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.GroupMultiplicities");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Keyword cKw1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cVal2Assignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cVal2IDTerminalRuleCall_3_0_0 = (RuleCall)cVal2Assignment_3_0.eContents().get(0);
		private final Assignment cVal3Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_3_1_0 = (RuleCall)cVal3Assignment_3_1.eContents().get(0);
		private final Keyword cKw2Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cVal4Assignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cVal4IDTerminalRuleCall_5_0_0 = (RuleCall)cVal4Assignment_5_0.eContents().get(0);
		private final Assignment cVal5Assignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cVal5IDTerminalRuleCall_5_1_0 = (RuleCall)cVal5Assignment_5_1.eContents().get(0);
		private final Keyword cKw3Keyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Assignment cVal6Assignment_7_0 = (Assignment)cGroup_7.eContents().get(0);
		private final RuleCall cVal6IDTerminalRuleCall_7_0_0 = (RuleCall)cVal6Assignment_7_0.eContents().get(0);
		private final Assignment cVal7Assignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cVal7IDTerminalRuleCall_7_1_0 = (RuleCall)cVal7Assignment_7_1.eContents().get(0);
		
		//GroupMultiplicities:
		//    "#4" val1=ID "kw1" (val2=ID val3=ID)? "kw2" (val4+=ID val5+=ID)+ "kw3" (val6+=ID val7+=ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#4" val1=ID "kw1" (val2=ID val3=ID)? "kw2" (val4+=ID val5+=ID)+ "kw3" (val6+=ID val7+=ID)*
		public Group getGroup() { return cGroup; }
		
		//"#4"
		public Keyword getNumberSignDigitFourKeyword_0() { return cNumberSignDigitFourKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2() { return cKw1Keyword_2; }
		
		//(val2=ID val3=ID)?
		public Group getGroup_3() { return cGroup_3; }
		
		//val2=ID
		public Assignment getVal2Assignment_3_0() { return cVal2Assignment_3_0; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_3_0_0() { return cVal2IDTerminalRuleCall_3_0_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_3_1() { return cVal3Assignment_3_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_3_1_0() { return cVal3IDTerminalRuleCall_3_1_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_4() { return cKw2Keyword_4; }
		
		//(val4+=ID val5+=ID)+
		public Group getGroup_5() { return cGroup_5; }
		
		//val4+=ID
		public Assignment getVal4Assignment_5_0() { return cVal4Assignment_5_0; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_5_0_0() { return cVal4IDTerminalRuleCall_5_0_0; }
		
		//val5+=ID
		public Assignment getVal5Assignment_5_1() { return cVal5Assignment_5_1; }
		
		//ID
		public RuleCall getVal5IDTerminalRuleCall_5_1_0() { return cVal5IDTerminalRuleCall_5_1_0; }
		
		//"kw3"
		public Keyword getKw3Keyword_6() { return cKw3Keyword_6; }
		
		//(val6+=ID val7+=ID)*
		public Group getGroup_7() { return cGroup_7; }
		
		//val6+=ID
		public Assignment getVal6Assignment_7_0() { return cVal6Assignment_7_0; }
		
		//ID
		public RuleCall getVal6IDTerminalRuleCall_7_0_0() { return cVal6IDTerminalRuleCall_7_0_0; }
		
		//val7+=ID
		public Assignment getVal7Assignment_7_1() { return cVal7Assignment_7_1; }
		
		//ID
		public RuleCall getVal7IDTerminalRuleCall_7_1_0() { return cVal7IDTerminalRuleCall_7_1_0; }
	}
	public class AlternativeMultiplicitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AlternativeMultiplicities");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitFiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cVal2Assignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cVal2IDTerminalRuleCall_1_0_0 = (RuleCall)cVal2Assignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKw1Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVal3Assignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_1_1_1_0 = (RuleCall)cVal3Assignment_1_1_1.eContents().get(0);
		private final Keyword cKw2Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cVal4Assignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cVal4IDTerminalRuleCall_3_0_0 = (RuleCall)cVal4Assignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cKw3Keyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cVal5Assignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cVal5IDTerminalRuleCall_3_1_1_0 = (RuleCall)cVal5Assignment_3_1_1.eContents().get(0);
		private final Keyword cKw4Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Assignment cVal6Assignment_5_0 = (Assignment)cAlternatives_5.eContents().get(0);
		private final RuleCall cVal6IDTerminalRuleCall_5_0_0 = (RuleCall)cVal6Assignment_5_0.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cAlternatives_5.eContents().get(1);
		private final Keyword cKw5Keyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cVal7Assignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cVal7IDTerminalRuleCall_5_1_1_0 = (RuleCall)cVal7Assignment_5_1_1.eContents().get(0);
		
		//AlternativeMultiplicities:
		//    "#5" (val2=ID | "kw1" val3=ID)? "kw2" (val4+=ID | "kw3" val5+=ID)+ "kw4" (val6+=ID | ("kw5" val7+=ID))*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#5" (val2=ID | "kw1" val3=ID)? "kw2" (val4+=ID | "kw3" val5+=ID)+ "kw4" (val6+=ID | ("kw5" val7+=ID))*
		public Group getGroup() { return cGroup; }
		
		//"#5"
		public Keyword getNumberSignDigitFiveKeyword_0() { return cNumberSignDigitFiveKeyword_0; }
		
		//(val2=ID | "kw1" val3=ID)?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_0() { return cVal2Assignment_1_0; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_0_0() { return cVal2IDTerminalRuleCall_1_0_0; }
		
		//"kw1" val3=ID
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_1_0() { return cKw1Keyword_1_1_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_1_1_1() { return cVal3Assignment_1_1_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_1_1_1_0() { return cVal3IDTerminalRuleCall_1_1_1_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_2() { return cKw2Keyword_2; }
		
		//(val4+=ID | "kw3" val5+=ID)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//val4+=ID
		public Assignment getVal4Assignment_3_0() { return cVal4Assignment_3_0; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_3_0_0() { return cVal4IDTerminalRuleCall_3_0_0; }
		
		//"kw3" val5+=ID
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//"kw3"
		public Keyword getKw3Keyword_3_1_0() { return cKw3Keyword_3_1_0; }
		
		//val5+=ID
		public Assignment getVal5Assignment_3_1_1() { return cVal5Assignment_3_1_1; }
		
		//ID
		public RuleCall getVal5IDTerminalRuleCall_3_1_1_0() { return cVal5IDTerminalRuleCall_3_1_1_0; }
		
		//"kw4"
		public Keyword getKw4Keyword_4() { return cKw4Keyword_4; }
		
		//(val6+=ID | ("kw5" val7+=ID))*
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//val6+=ID
		public Assignment getVal6Assignment_5_0() { return cVal6Assignment_5_0; }
		
		//ID
		public RuleCall getVal6IDTerminalRuleCall_5_0_0() { return cVal6IDTerminalRuleCall_5_0_0; }
		
		//("kw5" val7+=ID)
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//"kw5"
		public Keyword getKw5Keyword_5_1_0() { return cKw5Keyword_5_1_0; }
		
		//val7+=ID
		public Assignment getVal7Assignment_5_1_1() { return cVal7Assignment_5_1_1; }
		
		//ID
		public RuleCall getVal7IDTerminalRuleCall_5_1_1_0() { return cVal7IDTerminalRuleCall_5_1_1_0; }
	}
	public class AssignedActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AssignedAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitSixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Action cAssignedActionChildAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cVal1Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_2_1_0 = (RuleCall)cVal1Assignment_2_1.eContents().get(0);
		
		//AssignedAction:
		//    "#6" val1=ID ({AssignedAction.child=current} val1=ID)+;
		@Override public ParserRule getRule() { return rule; }
		
		//"#6" val1=ID ({AssignedAction.child=current} val1=ID)+
		public Group getGroup() { return cGroup; }
		
		//"#6"
		public Keyword getNumberSignDigitSixKeyword_0() { return cNumberSignDigitSixKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//({AssignedAction.child=current} val1=ID)+
		public Group getGroup_2() { return cGroup_2; }
		
		//{AssignedAction.child=current}
		public Action getAssignedActionChildAction_2_0() { return cAssignedActionChildAction_2_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_2_1() { return cVal1Assignment_2_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_1_0() { return cVal1IDTerminalRuleCall_2_1_0; }
	}
	public class AssignedActionSecondElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AssignedActionSecond");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitSevenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Keyword cKw1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVal2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVal2IDTerminalRuleCall_3_0 = (RuleCall)cVal2Assignment_3.eContents().get(0);
		
		//AssignedActionSecond returns AssignedAction:
		//    "#7" val1=ID "kw1" val2=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#7" val1=ID "kw1" val2=ID
		public Group getGroup() { return cGroup; }
		
		//"#7"
		public Keyword getNumberSignDigitSevenKeyword_0() { return cNumberSignDigitSevenKeyword_0; }
		
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
	}
	public class UnassignedAction1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedAction1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUnassignedAction1Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNumberSignDigitEightKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVal1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVal1IDTerminalRuleCall_2_0 = (RuleCall)cVal1Assignment_2.eContents().get(0);
		private final Assignment cVal2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVal2IDTerminalRuleCall_3_0 = (RuleCall)cVal2Assignment_3.eContents().get(0);
		
		//UnassignedAction1:
		//    {UnassignedAction1} "#8" val1=ID val2=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//{UnassignedAction1} "#8" val1=ID val2=ID?
		public Group getGroup() { return cGroup; }
		
		//{UnassignedAction1}
		public Action getUnassignedAction1Action_0() { return cUnassignedAction1Action_0; }
		
		//"#8"
		public Keyword getNumberSignDigitEightKeyword_1() { return cNumberSignDigitEightKeyword_1; }
		
		//val1=ID
		public Assignment getVal1Assignment_2() { return cVal1Assignment_2; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_0() { return cVal1IDTerminalRuleCall_2_0; }
		
		//val2=ID?
		public Assignment getVal2Assignment_3() { return cVal2Assignment_3; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_3_0() { return cVal2IDTerminalRuleCall_3_0; }
	}
	public class UnassignedAction2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedAction2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUnassignedAction2SubAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNumberSignDigitNineKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVal1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVal1IDTerminalRuleCall_2_0 = (RuleCall)cVal1Assignment_2.eContents().get(0);
		private final Assignment cVal2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVal2IDTerminalRuleCall_3_0 = (RuleCall)cVal2Assignment_3.eContents().get(0);
		
		//UnassignedAction2:
		//    {UnassignedAction2Sub} "#9" val1=ID val2=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//{UnassignedAction2Sub} "#9" val1=ID val2=ID?
		public Group getGroup() { return cGroup; }
		
		//{UnassignedAction2Sub}
		public Action getUnassignedAction2SubAction_0() { return cUnassignedAction2SubAction_0; }
		
		//"#9"
		public Keyword getNumberSignDigitNineKeyword_1() { return cNumberSignDigitNineKeyword_1; }
		
		//val1=ID
		public Assignment getVal1Assignment_2() { return cVal1Assignment_2; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_0() { return cVal1IDTerminalRuleCall_2_0; }
		
		//val2=ID?
		public Assignment getVal2Assignment_3() { return cVal2Assignment_3; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_3_0() { return cVal2IDTerminalRuleCall_3_0; }
	}
	public class UnassignedAction3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedAction3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitZeroKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cKw1Keyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Action cUnassignedAction2Sub1Action_1_0_1 = (Action)cGroup_1_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKw2Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Action cUnassignedAction2Sub2Action_1_1_1 = (Action)cGroup_1_1.eContents().get(1);
		private final Assignment cVal1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVal1IDTerminalRuleCall_2_0 = (RuleCall)cVal1Assignment_2.eContents().get(0);
		private final Assignment cVal2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVal2IDTerminalRuleCall_3_0 = (RuleCall)cVal2Assignment_3.eContents().get(0);
		
		//UnassignedAction3:
		//    "#10" ("kw1" {UnassignedAction2Sub1}|"kw2" {UnassignedAction2Sub2}) val1=ID val2=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#10" ("kw1" {UnassignedAction2Sub1}|"kw2" {UnassignedAction2Sub2}) val1=ID val2=ID?
		public Group getGroup() { return cGroup; }
		
		//"#10"
		public Keyword getNumberSignDigitOneDigitZeroKeyword_0() { return cNumberSignDigitOneDigitZeroKeyword_0; }
		
		//("kw1" {UnassignedAction2Sub1}|"kw2" {UnassignedAction2Sub2})
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"kw1" {UnassignedAction2Sub1}
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_0_0() { return cKw1Keyword_1_0_0; }
		
		//{UnassignedAction2Sub1}
		public Action getUnassignedAction2Sub1Action_1_0_1() { return cUnassignedAction2Sub1Action_1_0_1; }
		
		//"kw2" {UnassignedAction2Sub2}
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw2"
		public Keyword getKw2Keyword_1_1_0() { return cKw2Keyword_1_1_0; }
		
		//{UnassignedAction2Sub2}
		public Action getUnassignedAction2Sub2Action_1_1_1() { return cUnassignedAction2Sub2Action_1_1_1; }
		
		//val1=ID
		public Assignment getVal1Assignment_2() { return cVal1Assignment_2; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_0() { return cVal1IDTerminalRuleCall_2_0; }
		
		//val2=ID?
		public Assignment getVal2Assignment_3() { return cVal2Assignment_3; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_3_0() { return cVal2IDTerminalRuleCall_3_0; }
	}
	public class UnassignedRuleCall1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedRuleCall1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cUnassignedRuleCall1SubParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cVal2Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVal2IDTerminalRuleCall_2_0 = (RuleCall)cVal2Assignment_2.eContents().get(0);
		
		//UnassignedRuleCall1:
		//    "#11" UnassignedRuleCall1Sub val2=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#11" UnassignedRuleCall1Sub val2=ID
		public Group getGroup() { return cGroup; }
		
		//"#11"
		public Keyword getNumberSignDigitOneDigitOneKeyword_0() { return cNumberSignDigitOneDigitOneKeyword_0; }
		
		//UnassignedRuleCall1Sub
		public RuleCall getUnassignedRuleCall1SubParserRuleCall_1() { return cUnassignedRuleCall1SubParserRuleCall_1; }
		
		//val2=ID
		public Assignment getVal2Assignment_2() { return cVal2Assignment_2; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_2_0() { return cVal2IDTerminalRuleCall_2_0; }
	}
	public class UnassignedRuleCall1SubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedRuleCall1Sub");
		private final Assignment cVal1Assignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_0 = (RuleCall)cVal1Assignment.eContents().get(0);
		
		//UnassignedRuleCall1Sub:
		//    val1=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//val1=ID
		public Assignment getVal1Assignment() { return cVal1Assignment; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_0() { return cVal1IDTerminalRuleCall_0; }
	}
	public class UnassignedRuleCall2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedRuleCall2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitTwoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cUnassignedRuleCall2SubParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cVal2Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVal2IDTerminalRuleCall_2_0 = (RuleCall)cVal2Assignment_2.eContents().get(0);
		
		//UnassignedRuleCall2:
		//    "#12" UnassignedRuleCall2Sub val2=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#12" UnassignedRuleCall2Sub val2=ID
		public Group getGroup() { return cGroup; }
		
		//"#12"
		public Keyword getNumberSignDigitOneDigitTwoKeyword_0() { return cNumberSignDigitOneDigitTwoKeyword_0; }
		
		//UnassignedRuleCall2Sub
		public RuleCall getUnassignedRuleCall2SubParserRuleCall_1() { return cUnassignedRuleCall2SubParserRuleCall_1; }
		
		//val2=ID
		public Assignment getVal2Assignment_2() { return cVal2Assignment_2; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_2_0() { return cVal2IDTerminalRuleCall_2_0; }
	}
	public class UnassignedRuleCall2SubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedRuleCall2Sub");
		private final Action cUnassignedRuleCall2SubActionAction = (Action)rule.eContents().get(1);
		
		//UnassignedRuleCall2Sub:
		//    {UnassignedRuleCall2SubAction};
		@Override public ParserRule getRule() { return rule; }
		
		//{UnassignedRuleCall2SubAction}
		public Action getUnassignedRuleCall2SubActionAction() { return cUnassignedRuleCall2SubActionAction; }
	}
	public class Combination1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Combination1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cKw1Keyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVal2Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_2_1_0 = (RuleCall)cVal2Assignment_2_1.eContents().get(0);
		private final Alternatives cAlternatives_2_2 = (Alternatives)cGroup_2.eContents().get(2);
		private final Group cGroup_2_2_0 = (Group)cAlternatives_2_2.eContents().get(0);
		private final Keyword cKw2Keyword_2_2_0_0 = (Keyword)cGroup_2_2_0.eContents().get(0);
		private final Assignment cVal3Assignment_2_2_0_1 = (Assignment)cGroup_2_2_0.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_2_2_0_1_0 = (RuleCall)cVal3Assignment_2_2_0_1.eContents().get(0);
		private final Assignment cVal4Assignment_2_2_1 = (Assignment)cAlternatives_2_2.eContents().get(1);
		private final RuleCall cVal4IDTerminalRuleCall_2_2_1_0 = (RuleCall)cVal4Assignment_2_2_1.eContents().get(0);
		
		//Combination1:
		//    "#13" val1=ID ("kw1" val2=ID ("kw2" val3=ID | val4=ID))?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#13" val1=ID ("kw1" val2=ID ("kw2" val3=ID | val4=ID))?
		public Group getGroup() { return cGroup; }
		
		//"#13"
		public Keyword getNumberSignDigitOneDigitThreeKeyword_0() { return cNumberSignDigitOneDigitThreeKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//("kw1" val2=ID ("kw2" val3=ID | val4=ID))?
		public Group getGroup_2() { return cGroup_2; }
		
		//"kw1"
		public Keyword getKw1Keyword_2_0() { return cKw1Keyword_2_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_2_1() { return cVal2Assignment_2_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_2_1_0() { return cVal2IDTerminalRuleCall_2_1_0; }
		
		//("kw2" val3=ID | val4=ID)
		public Alternatives getAlternatives_2_2() { return cAlternatives_2_2; }
		
		//"kw2" val3=ID
		public Group getGroup_2_2_0() { return cGroup_2_2_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_2_2_0_0() { return cKw2Keyword_2_2_0_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_2_2_0_1() { return cVal3Assignment_2_2_0_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_2_2_0_1_0() { return cVal3IDTerminalRuleCall_2_2_0_1_0; }
		
		//val4=ID
		public Assignment getVal4Assignment_2_2_1() { return cVal4Assignment_2_2_1; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_2_2_1_0() { return cVal4IDTerminalRuleCall_2_2_1_0; }
	}
	public class Combination2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Combination2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cKw1Keyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cVal2Assignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_2_0_1_0 = (RuleCall)cVal2Assignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Assignment cVal3Assignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final RuleCall cVal3IDTerminalRuleCall_2_1_0_0 = (RuleCall)cVal3Assignment_2_1_0.eContents().get(0);
		private final Assignment cVal4Assignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cVal4IDTerminalRuleCall_2_1_1_0 = (RuleCall)cVal4Assignment_2_1_1.eContents().get(0);
		
		//Combination2:
		//    "#14" val1=ID (("kw1" val2=ID) | (val3+=ID val4+=ID)*);
		@Override public ParserRule getRule() { return rule; }
		
		//"#14" val1=ID (("kw1" val2=ID) | (val3+=ID val4+=ID)*)
		public Group getGroup() { return cGroup; }
		
		//"#14"
		public Keyword getNumberSignDigitOneDigitFourKeyword_0() { return cNumberSignDigitOneDigitFourKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//(("kw1" val2=ID) | (val3+=ID val4+=ID)*)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//("kw1" val2=ID)
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2_0_0() { return cKw1Keyword_2_0_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_2_0_1() { return cVal2Assignment_2_0_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_2_0_1_0() { return cVal2IDTerminalRuleCall_2_0_1_0; }
		
		//(val3+=ID val4+=ID)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//val3+=ID
		public Assignment getVal3Assignment_2_1_0() { return cVal3Assignment_2_1_0; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_2_1_0_0() { return cVal3IDTerminalRuleCall_2_1_0_0; }
		
		//val4+=ID
		public Assignment getVal4Assignment_2_1_1() { return cVal4Assignment_2_1_1; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_2_1_1_0() { return cVal4IDTerminalRuleCall_2_1_1_0; }
	}
	public class Combination3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Combination3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitFiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cVal1Assignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0 = (RuleCall)cVal1Assignment_1_0.eContents().get(0);
		private final Assignment cVal2Assignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cVal2INTTerminalRuleCall_1_1_0 = (RuleCall)cVal2Assignment_1_1.eContents().get(0);
		private final Assignment cVal3Assignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final RuleCall cVal3STRINGTerminalRuleCall_1_2_0 = (RuleCall)cVal3Assignment_1_2.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation, potentialOverride] */
		//Combination3:
		//    "#15" (val1=ID | val2=INT | val3=STRING)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#15" (val1=ID | val2=INT | val3=STRING)*
		public Group getGroup() { return cGroup; }
		
		//"#15"
		public Keyword getNumberSignDigitOneDigitFiveKeyword_0() { return cNumberSignDigitOneDigitFiveKeyword_0; }
		
		//(val1=ID | val2=INT | val3=STRING)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_0() { return cVal1Assignment_1_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0() { return cVal1IDTerminalRuleCall_1_0_0; }
		
		//val2=INT
		public Assignment getVal2Assignment_1_1() { return cVal2Assignment_1_1; }
		
		//INT
		public RuleCall getVal2INTTerminalRuleCall_1_1_0() { return cVal2INTTerminalRuleCall_1_1_0; }
		
		//val3=STRING
		public Assignment getVal3Assignment_1_2() { return cVal3Assignment_1_2; }
		
		//STRING
		public RuleCall getVal3STRINGTerminalRuleCall_1_2_0() { return cVal3STRINGTerminalRuleCall_1_2_0; }
	}
	public class Combination4Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Combination4");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitSixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cGroupKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_1_0 = (RuleCall)cVal1Assignment_1_1.eContents().get(0);
		private final Assignment cVal2Assignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cVal2IDTerminalRuleCall_1_2_0 = (RuleCall)cVal2Assignment_1_2.eContents().get(0);
		private final Assignment cVal3Assignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cVal3IDTerminalRuleCall_1_3_0 = (RuleCall)cVal3Assignment_1_3.eContents().get(0);
		
		//Combination4:
		//    "#16" ("group" val1+=ID val2+=ID val3+=ID)+;
		@Override public ParserRule getRule() { return rule; }
		
		//"#16" ("group" val1+=ID val2+=ID val3+=ID)+
		public Group getGroup() { return cGroup; }
		
		//"#16"
		public Keyword getNumberSignDigitOneDigitSixKeyword_0() { return cNumberSignDigitOneDigitSixKeyword_0; }
		
		//("group" val1+=ID val2+=ID val3+=ID)+
		public Group getGroup_1() { return cGroup_1; }
		
		//"group"
		public Keyword getGroupKeyword_1_0() { return cGroupKeyword_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_1() { return cVal1Assignment_1_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_1_0() { return cVal1IDTerminalRuleCall_1_1_0; }
		
		//val2+=ID
		public Assignment getVal2Assignment_1_2() { return cVal2Assignment_1_2; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_2_0() { return cVal2IDTerminalRuleCall_1_2_0; }
		
		//val3+=ID
		public Assignment getVal3Assignment_1_3() { return cVal3Assignment_1_3; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_1_3_0() { return cVal3IDTerminalRuleCall_1_3_0; }
	}
	public class List1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitSevenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVal1Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_2_1_0 = (RuleCall)cVal1Assignment_2_1.eContents().get(0);
		
		//List1:
		//    "#17" val1+=ID ("," val1+=ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#17" val1+=ID ("," val1+=ID)*
		public Group getGroup() { return cGroup; }
		
		//"#17"
		public Keyword getNumberSignDigitOneDigitSevenKeyword_0() { return cNumberSignDigitOneDigitSevenKeyword_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//("," val1+=ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_2_1() { return cVal1Assignment_2_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_1_0() { return cVal1IDTerminalRuleCall_2_1_0; }
	}
	public class List2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitEightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cVal1Assignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0 = (RuleCall)cVal1Assignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_1_1_0 = (RuleCall)cVal1Assignment_1_1_1.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation] */
		//List2:
		//    "#18" (val1+=ID ("," val1+=ID)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#18" (val1+=ID ("," val1+=ID)*)?
		public Group getGroup() { return cGroup; }
		
		//"#18"
		public Keyword getNumberSignDigitOneDigitEightKeyword_0() { return cNumberSignDigitOneDigitEightKeyword_0; }
		
		//(val1+=ID ("," val1+=ID)*)?
		public Group getGroup_1() { return cGroup_1; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_0() { return cVal1Assignment_1_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0() { return cVal1IDTerminalRuleCall_1_0_0; }
		
		//("," val1+=ID)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//","
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_1_1() { return cVal1Assignment_1_1_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_1_1_0() { return cVal1IDTerminalRuleCall_1_1_1_0; }
	}
	public class List3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List3");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cNumberSignDigitOneDigitNineKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Assignment cVal1Assignment_0_1_0 = (Assignment)cGroup_0_1.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_0_1_0_0 = (RuleCall)cVal1Assignment_0_1_0.eContents().get(0);
		private final Group cGroup_0_1_1 = (Group)cGroup_0_1.eContents().get(1);
		private final Keyword cCommaKeyword_0_1_1_0 = (Keyword)cGroup_0_1_1.eContents().get(0);
		private final Assignment cVal1Assignment_0_1_1_1 = (Assignment)cGroup_0_1_1.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_0_1_1_1_0 = (RuleCall)cVal1Assignment_0_1_1_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cKw3Keyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cVal2Assignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_1_1_0 = (RuleCall)cVal2Assignment_1_1.eContents().get(0);
		
		//List3:
		//    "#19" (val1+=ID ("," val1+=ID)*) | ("kw3" val2=ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"#19" (val1+=ID ("," val1+=ID)*) | ("kw3" val2=ID)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"#19" (val1+=ID ("," val1+=ID)*)
		public Group getGroup_0() { return cGroup_0; }
		
		//"#19"
		public Keyword getNumberSignDigitOneDigitNineKeyword_0_0() { return cNumberSignDigitOneDigitNineKeyword_0_0; }
		
		//(val1+=ID ("," val1+=ID)*)
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//val1+=ID
		public Assignment getVal1Assignment_0_1_0() { return cVal1Assignment_0_1_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_0_1_0_0() { return cVal1IDTerminalRuleCall_0_1_0_0; }
		
		//("," val1+=ID)*
		public Group getGroup_0_1_1() { return cGroup_0_1_1; }
		
		//","
		public Keyword getCommaKeyword_0_1_1_0() { return cCommaKeyword_0_1_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_0_1_1_1() { return cVal1Assignment_0_1_1_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_0_1_1_1_0() { return cVal1IDTerminalRuleCall_0_1_1_1_0; }
		
		//("kw3" val2=ID)
		public Group getGroup_1() { return cGroup_1; }
		
		//"kw3"
		public Keyword getKw3Keyword_1_0() { return cKw3Keyword_1_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_1() { return cVal2Assignment_1_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_1_0() { return cVal2IDTerminalRuleCall_1_1_0; }
	}
	public class List4Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List4");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitZeroKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVal1Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_2_1_0 = (RuleCall)cVal1Assignment_2_1.eContents().get(0);
		private final Keyword cKw3Keyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cVal2Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cVal2IDTerminalRuleCall_4_0 = (RuleCall)cVal2Assignment_4.eContents().get(0);
		
		//List4:
		//    "#20" val1+=ID ("," val1+=ID)* "kw3" val2=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#20" val1+=ID ("," val1+=ID)* "kw3" val2=ID
		public Group getGroup() { return cGroup; }
		
		//"#20"
		public Keyword getNumberSignDigitTwoDigitZeroKeyword_0() { return cNumberSignDigitTwoDigitZeroKeyword_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//("," val1+=ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_2_1() { return cVal1Assignment_2_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_1_0() { return cVal1IDTerminalRuleCall_2_1_0; }
		
		//"kw3"
		public Keyword getKw3Keyword_3() { return cKw3Keyword_3; }
		
		//val2=ID
		public Assignment getVal2Assignment_4() { return cVal2Assignment_4; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_4_0() { return cVal2IDTerminalRuleCall_4_0; }
	}
	public class List5Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List5");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0_0 = (RuleCall)cVal1Assignment_1_0_0.eContents().get(0);
		private final Group cGroup_1_0_1 = (Group)cGroup_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_1_0_1_0 = (Keyword)cGroup_1_0_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_0_1_1 = (Assignment)cGroup_1_0_1.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_1_1_0 = (RuleCall)cVal1Assignment_1_0_1_1.eContents().get(0);
		private final Keyword cKw3Keyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		private final Assignment cVal2Assignment_1_0_3 = (Assignment)cGroup_1_0.eContents().get(3);
		private final RuleCall cVal2IDTerminalRuleCall_1_0_3_0 = (RuleCall)cVal2Assignment_1_0_3.eContents().get(0);
		private final Assignment cVal3Assignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_1_1_0 = (RuleCall)cVal3Assignment_1_1.eContents().get(0);
		
		//List5:
		//    "#21" ((val1+=ID ("," val1+=ID)* "kw3" val2=ID) | val3=ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"#21" ((val1+=ID ("," val1+=ID)* "kw3" val2=ID) | val3=ID)
		public Group getGroup() { return cGroup; }
		
		//"#21"
		public Keyword getNumberSignDigitTwoDigitOneKeyword_0() { return cNumberSignDigitTwoDigitOneKeyword_0; }
		
		//((val1+=ID ("," val1+=ID)* "kw3" val2=ID) | val3=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//(val1+=ID ("," val1+=ID)* "kw3" val2=ID)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_0_0() { return cVal1Assignment_1_0_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0_0() { return cVal1IDTerminalRuleCall_1_0_0_0; }
		
		//("," val1+=ID)*
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//","
		public Keyword getCommaKeyword_1_0_1_0() { return cCommaKeyword_1_0_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_0_1_1() { return cVal1Assignment_1_0_1_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_1_1_0() { return cVal1IDTerminalRuleCall_1_0_1_1_0; }
		
		//"kw3"
		public Keyword getKw3Keyword_1_0_2() { return cKw3Keyword_1_0_2; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_0_3() { return cVal2Assignment_1_0_3; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_0_3_0() { return cVal2IDTerminalRuleCall_1_0_3_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_1_1() { return cVal3Assignment_1_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_1_1_0() { return cVal3IDTerminalRuleCall_1_1_0; }
	}
	public class AltList1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AltList1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitTwoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0_0 = (RuleCall)cVal1Assignment_1_0_0.eContents().get(0);
		private final Assignment cVal2Assignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_1_0_1_0 = (RuleCall)cVal2Assignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKw1Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_1_1_0 = (RuleCall)cVal1Assignment_1_1_1.eContents().get(0);
		private final Assignment cVal3Assignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cVal3IDTerminalRuleCall_1_1_2_0 = (RuleCall)cVal3Assignment_1_1_2.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cKw2Keyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cVal1Assignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_2_1_0 = (RuleCall)cVal1Assignment_1_2_1.eContents().get(0);
		private final Assignment cVal4Assignment_1_2_2 = (Assignment)cGroup_1_2.eContents().get(2);
		private final RuleCall cVal4IDTerminalRuleCall_1_2_2_0 = (RuleCall)cVal4Assignment_1_2_2.eContents().get(0);
		
		//AltList1:
		//    "#22" (val1=ID val2=ID | "kw1" val1=ID val3=ID | "kw2" val1=ID val4=ID?);
		@Override public ParserRule getRule() { return rule; }
		
		//"#22" (val1=ID val2=ID | "kw1" val1=ID val3=ID | "kw2" val1=ID val4=ID?)
		public Group getGroup() { return cGroup; }
		
		//"#22"
		public Keyword getNumberSignDigitTwoDigitTwoKeyword_0() { return cNumberSignDigitTwoDigitTwoKeyword_0; }
		
		//(val1=ID val2=ID | "kw1" val1=ID val3=ID | "kw2" val1=ID val4=ID?)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//val1=ID val2=ID
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_0_0() { return cVal1Assignment_1_0_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0_0() { return cVal1IDTerminalRuleCall_1_0_0_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_0_1() { return cVal2Assignment_1_0_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_0_1_0() { return cVal2IDTerminalRuleCall_1_0_1_0; }
		
		//"kw1" val1=ID val3=ID
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_1_0() { return cKw1Keyword_1_1_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_1_1() { return cVal1Assignment_1_1_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_1_1_0() { return cVal1IDTerminalRuleCall_1_1_1_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_1_1_2() { return cVal3Assignment_1_1_2; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_1_1_2_0() { return cVal3IDTerminalRuleCall_1_1_2_0; }
		
		//"kw2" val1=ID val4=ID?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//"kw2"
		public Keyword getKw2Keyword_1_2_0() { return cKw2Keyword_1_2_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_2_1() { return cVal1Assignment_1_2_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_2_1_0() { return cVal1IDTerminalRuleCall_1_2_1_0; }
		
		//val4=ID?
		public Assignment getVal4Assignment_1_2_2() { return cVal4Assignment_1_2_2; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_1_2_2_0() { return cVal4IDTerminalRuleCall_1_2_2_0; }
	}
	public class AltList2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AltList2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0_0 = (RuleCall)cVal1Assignment_1_0_0.eContents().get(0);
		private final Assignment cVal2Assignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_1_0_1_0 = (RuleCall)cVal2Assignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKwKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_1_1_0 = (RuleCall)cVal1Assignment_1_1_1.eContents().get(0);
		private final Group cGroup_1_1_2 = (Group)cGroup_1_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_1_2_0 = (Keyword)cGroup_1_1_2.eContents().get(0);
		private final Assignment cVal1Assignment_1_1_2_1 = (Assignment)cGroup_1_1_2.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_1_2_1_0 = (RuleCall)cVal1Assignment_1_1_2_1.eContents().get(0);
		private final Assignment cVal3Assignment_1_1_3 = (Assignment)cGroup_1_1.eContents().get(3);
		private final RuleCall cVal3IDTerminalRuleCall_1_1_3_0 = (RuleCall)cVal3Assignment_1_1_3.eContents().get(0);
		
		//AltList2:
		//    "#23" (val1+=ID val2=ID | "kw" val1+=ID ("," val1+=ID)* val3=ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"#23" (val1+=ID val2=ID | "kw" val1+=ID ("," val1+=ID)* val3=ID)
		public Group getGroup() { return cGroup; }
		
		//"#23"
		public Keyword getNumberSignDigitTwoDigitThreeKeyword_0() { return cNumberSignDigitTwoDigitThreeKeyword_0; }
		
		//(val1+=ID val2=ID | "kw" val1+=ID ("," val1+=ID)* val3=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//val1+=ID val2=ID
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_0_0() { return cVal1Assignment_1_0_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0_0() { return cVal1IDTerminalRuleCall_1_0_0_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_0_1() { return cVal2Assignment_1_0_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_0_1_0() { return cVal2IDTerminalRuleCall_1_0_1_0; }
		
		//"kw" val1+=ID ("," val1+=ID)* val3=ID
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw"
		public Keyword getKwKeyword_1_1_0() { return cKwKeyword_1_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_1_1() { return cVal1Assignment_1_1_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_1_1_0() { return cVal1IDTerminalRuleCall_1_1_1_0; }
		
		//("," val1+=ID)*
		public Group getGroup_1_1_2() { return cGroup_1_1_2; }
		
		//","
		public Keyword getCommaKeyword_1_1_2_0() { return cCommaKeyword_1_1_2_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_1_2_1() { return cVal1Assignment_1_1_2_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_1_2_1_0() { return cVal1IDTerminalRuleCall_1_1_2_1_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_1_1_3() { return cVal3Assignment_1_1_3; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_1_1_3_0() { return cVal3IDTerminalRuleCall_1_1_3_0; }
	}
	public class TransientObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TransientObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cVal1Assignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0 = (RuleCall)cVal1Assignment_1_0.eContents().get(0);
		private final Assignment cNestedAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNestedTransientObjectSubParserRuleCall_1_1_0 = (RuleCall)cNestedAssignment_1_1.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation] */
		//TransientObject:
		//    "#24" (val1=ID nested=TransientObjectSub)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#24" (val1=ID nested=TransientObjectSub)?
		public Group getGroup() { return cGroup; }
		
		//"#24"
		public Keyword getNumberSignDigitTwoDigitFourKeyword_0() { return cNumberSignDigitTwoDigitFourKeyword_0; }
		
		//(val1=ID nested=TransientObjectSub)?
		public Group getGroup_1() { return cGroup_1; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_0() { return cVal1Assignment_1_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0() { return cVal1IDTerminalRuleCall_1_0_0; }
		
		//nested=TransientObjectSub
		public Assignment getNestedAssignment_1_1() { return cNestedAssignment_1_1; }
		
		//TransientObjectSub
		public RuleCall getNestedTransientObjectSubParserRuleCall_1_1_0() { return cNestedTransientObjectSubParserRuleCall_1_1_0; }
	}
	public class TransientObjectSubElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TransientObjectSub");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVal2Assignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVal2IDTerminalRuleCall_0_0 = (RuleCall)cVal2Assignment_0.eContents().get(0);
		private final Assignment cVal3Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_1_0 = (RuleCall)cVal3Assignment_1.eContents().get(0);
		
		//TransientObjectSub:
		//    val2=ID val3=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//val2=ID val3=ID
		public Group getGroup() { return cGroup; }
		
		//val2=ID
		public Assignment getVal2Assignment_0() { return cVal2Assignment_0; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_0_0() { return cVal2IDTerminalRuleCall_0_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_1() { return cVal3Assignment_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_1_0() { return cVal3IDTerminalRuleCall_1_0; }
	}
	public class TransientSerializeables1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TransientSerializeables1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitFiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cVal1Assignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0 = (RuleCall)cVal1Assignment_1_0.eContents().get(0);
		private final Assignment cEnum1Assignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEnum1TransientSerializeables1EnumEnumRuleCall_1_1_0 = (RuleCall)cEnum1Assignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cVal2Assignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cVal2IDTerminalRuleCall_2_0_0 = (RuleCall)cVal2Assignment_2_0.eContents().get(0);
		private final Assignment cInt1Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cInt1INTTerminalRuleCall_2_1_0 = (RuleCall)cInt1Assignment_2_1.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation] */
		//TransientSerializeables1:
		//    "#25" (val1=ID enum1=TransientSerializeables1Enum)? (val2=ID int1=INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#25" (val1=ID enum1=TransientSerializeables1Enum)? (val2=ID int1=INT)?
		public Group getGroup() { return cGroup; }
		
		//"#25"
		public Keyword getNumberSignDigitTwoDigitFiveKeyword_0() { return cNumberSignDigitTwoDigitFiveKeyword_0; }
		
		//(val1=ID enum1=TransientSerializeables1Enum)?
		public Group getGroup_1() { return cGroup_1; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_0() { return cVal1Assignment_1_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0() { return cVal1IDTerminalRuleCall_1_0_0; }
		
		//enum1=TransientSerializeables1Enum
		public Assignment getEnum1Assignment_1_1() { return cEnum1Assignment_1_1; }
		
		//TransientSerializeables1Enum
		public RuleCall getEnum1TransientSerializeables1EnumEnumRuleCall_1_1_0() { return cEnum1TransientSerializeables1EnumEnumRuleCall_1_1_0; }
		
		//(val2=ID int1=INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//val2=ID
		public Assignment getVal2Assignment_2_0() { return cVal2Assignment_2_0; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_2_0_0() { return cVal2IDTerminalRuleCall_2_0_0; }
		
		//int1=INT
		public Assignment getInt1Assignment_2_1() { return cInt1Assignment_2_1; }
		
		//INT
		public RuleCall getInt1INTTerminalRuleCall_2_1_0() { return cInt1INTTerminalRuleCall_2_1_0; }
	}
	public class StaticSimplificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.StaticSimplification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitSixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cKw1Keyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Action cEmptyAlternativeSubAction_1_1 = (Action)cAlternatives_1.eContents().get(1);
		private final Assignment cVal1Assignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final RuleCall cVal1IDTerminalRuleCall_1_2_0 = (RuleCall)cVal1Assignment_1_2.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Keyword cKw2Keyword_2_0 = (Keyword)cAlternatives_2.eContents().get(0);
		private final Assignment cVal2Assignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_2_1_0 = (RuleCall)cVal2Assignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cKw3Keyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cKw4Keyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cVal3Assignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_3_1_1_0 = (RuleCall)cVal3Assignment_3_1_1.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation, potentialOverride] */
		//StaticSimplification:
		//    "#26" ("kw1"|{EmptyAlternativeSub}|val1=ID) ("kw2"|val2=ID) ("kw3" ("kw4" (val3=ID)+)?);
		@Override public ParserRule getRule() { return rule; }
		
		//"#26" ("kw1"|{EmptyAlternativeSub}|val1=ID) ("kw2"|val2=ID) ("kw3" ("kw4" (val3=ID)+)?)
		public Group getGroup() { return cGroup; }
		
		//"#26"
		public Keyword getNumberSignDigitTwoDigitSixKeyword_0() { return cNumberSignDigitTwoDigitSixKeyword_0; }
		
		//("kw1"|{EmptyAlternativeSub}|val1=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_0() { return cKw1Keyword_1_0; }
		
		//{EmptyAlternativeSub}
		public Action getEmptyAlternativeSubAction_1_1() { return cEmptyAlternativeSubAction_1_1; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_2() { return cVal1Assignment_1_2; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_2_0() { return cVal1IDTerminalRuleCall_1_2_0; }
		
		//("kw2"|val2=ID)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//"kw2"
		public Keyword getKw2Keyword_2_0() { return cKw2Keyword_2_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_2_1() { return cVal2Assignment_2_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_2_1_0() { return cVal2IDTerminalRuleCall_2_1_0; }
		
		//("kw3" ("kw4" (val3=ID)+)?)
		public Group getGroup_3() { return cGroup_3; }
		
		//"kw3"
		public Keyword getKw3Keyword_3_0() { return cKw3Keyword_3_0; }
		
		//("kw4" (val3=ID)+)?
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//"kw4"
		public Keyword getKw4Keyword_3_1_0() { return cKw4Keyword_3_1_0; }
		
		//(val3=ID)+
		public Assignment getVal3Assignment_3_1_1() { return cVal3Assignment_3_1_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_3_1_1_0() { return cVal3IDTerminalRuleCall_3_1_1_0; }
	}
	public class TwoVersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TwoVersion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitSevenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cTwoVersionNo1ParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cTwoVersionNo2ParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//TwoVersion:
		//    "#27" (TwoVersionNo1 | TwoVersionNo2);
		@Override public ParserRule getRule() { return rule; }
		
		//"#27" (TwoVersionNo1 | TwoVersionNo2)
		public Group getGroup() { return cGroup; }
		
		//"#27"
		public Keyword getNumberSignDigitTwoDigitSevenKeyword_0() { return cNumberSignDigitTwoDigitSevenKeyword_0; }
		
		//(TwoVersionNo1 | TwoVersionNo2)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//TwoVersionNo1
		public RuleCall getTwoVersionNo1ParserRuleCall_1_0() { return cTwoVersionNo1ParserRuleCall_1_0; }
		
		//TwoVersionNo2
		public RuleCall getTwoVersionNo2ParserRuleCall_1_1() { return cTwoVersionNo2ParserRuleCall_1_1; }
	}
	public class TwoVersionNo1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TwoVersionNo1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cShared1Assignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cShared1IDTerminalRuleCall_0_0 = (RuleCall)cShared1Assignment_0.eContents().get(0);
		private final Assignment cShared2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cShared2IDTerminalRuleCall_1_0 = (RuleCall)cShared2Assignment_1.eContents().get(0);
		private final Keyword cShortKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cShared3Assignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cShared3IDTerminalRuleCall_3_0_0 = (RuleCall)cShared3Assignment_3_0.eContents().get(0);
		private final Assignment cShared3Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cShared3IDTerminalRuleCall_3_1_0 = (RuleCall)cShared3Assignment_3_1.eContents().get(0);
		private final Keyword cOneKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cVersion1Assignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cVersion1IDTerminalRuleCall_5_0 = (RuleCall)cVersion1Assignment_5.eContents().get(0);
		
		//TwoVersionNo1 returns TwoVersion:
		//    shared1=ID? shared2=ID "short" (shared3+=ID shared3+=ID*)? "one" version1=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//shared1=ID? shared2=ID "short" (shared3+=ID shared3+=ID*)? "one" version1=ID?
		public Group getGroup() { return cGroup; }
		
		//shared1=ID?
		public Assignment getShared1Assignment_0() { return cShared1Assignment_0; }
		
		//ID
		public RuleCall getShared1IDTerminalRuleCall_0_0() { return cShared1IDTerminalRuleCall_0_0; }
		
		//shared2=ID
		public Assignment getShared2Assignment_1() { return cShared2Assignment_1; }
		
		//ID
		public RuleCall getShared2IDTerminalRuleCall_1_0() { return cShared2IDTerminalRuleCall_1_0; }
		
		//"short"
		public Keyword getShortKeyword_2() { return cShortKeyword_2; }
		
		//(shared3+=ID shared3+=ID*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//shared3+=ID
		public Assignment getShared3Assignment_3_0() { return cShared3Assignment_3_0; }
		
		//ID
		public RuleCall getShared3IDTerminalRuleCall_3_0_0() { return cShared3IDTerminalRuleCall_3_0_0; }
		
		//shared3+=ID*
		public Assignment getShared3Assignment_3_1() { return cShared3Assignment_3_1; }
		
		//ID
		public RuleCall getShared3IDTerminalRuleCall_3_1_0() { return cShared3IDTerminalRuleCall_3_1_0; }
		
		//"one"
		public Keyword getOneKeyword_4() { return cOneKeyword_4; }
		
		//version1=ID?
		public Assignment getVersion1Assignment_5() { return cVersion1Assignment_5; }
		
		//ID
		public RuleCall getVersion1IDTerminalRuleCall_5_0() { return cVersion1IDTerminalRuleCall_5_0; }
	}
	public class TwoVersionNo2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TwoVersionNo2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cShared1Assignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cShared1IDTerminalRuleCall_0_0 = (RuleCall)cShared1Assignment_0.eContents().get(0);
		private final Assignment cShared2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cShared2IDTerminalRuleCall_1_0 = (RuleCall)cShared2Assignment_1.eContents().get(0);
		private final Keyword cLongKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cShared3Assignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cShared3IDTerminalRuleCall_3_0_0 = (RuleCall)cShared3Assignment_3_0.eContents().get(0);
		private final Assignment cShared3Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cShared3IDTerminalRuleCall_3_1_0 = (RuleCall)cShared3Assignment_3_1.eContents().get(0);
		private final Keyword cExtraKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExtra1Assignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExtra1IDTerminalRuleCall_5_0 = (RuleCall)cExtra1Assignment_5.eContents().get(0);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cAlternatives_6.eContents().get(0);
		private final Assignment cExtra2Assignment_6_0_0 = (Assignment)cGroup_6_0.eContents().get(0);
		private final RuleCall cExtra2IDTerminalRuleCall_6_0_0_0 = (RuleCall)cExtra2Assignment_6_0_0.eContents().get(0);
		private final Assignment cExtra3Assignment_6_0_1 = (Assignment)cGroup_6_0.eContents().get(1);
		private final RuleCall cExtra3IDTerminalRuleCall_6_0_1_0 = (RuleCall)cExtra3Assignment_6_0_1.eContents().get(0);
		private final Group cGroup_6_1 = (Group)cAlternatives_6.eContents().get(1);
		private final Keyword cTwoKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cExtra4Assignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final RuleCall cExtra4IDTerminalRuleCall_6_1_1_0 = (RuleCall)cExtra4Assignment_6_1_1.eContents().get(0);
		
		//TwoVersionNo2 returns TwoVersion:
		//    shared1=ID? shared2=ID "long" (shared3+=ID shared3+=ID*)?
		//    "extra" extra1=ID? ((extra2=ID extra3=ID) | "two" extra4=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//shared1=ID? shared2=ID "long" (shared3+=ID shared3+=ID*)?
		//"extra" extra1=ID? ((extra2=ID extra3=ID) | "two" extra4=ID)?
		public Group getGroup() { return cGroup; }
		
		//shared1=ID?
		public Assignment getShared1Assignment_0() { return cShared1Assignment_0; }
		
		//ID
		public RuleCall getShared1IDTerminalRuleCall_0_0() { return cShared1IDTerminalRuleCall_0_0; }
		
		//shared2=ID
		public Assignment getShared2Assignment_1() { return cShared2Assignment_1; }
		
		//ID
		public RuleCall getShared2IDTerminalRuleCall_1_0() { return cShared2IDTerminalRuleCall_1_0; }
		
		//"long"
		public Keyword getLongKeyword_2() { return cLongKeyword_2; }
		
		//(shared3+=ID shared3+=ID*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//shared3+=ID
		public Assignment getShared3Assignment_3_0() { return cShared3Assignment_3_0; }
		
		//ID
		public RuleCall getShared3IDTerminalRuleCall_3_0_0() { return cShared3IDTerminalRuleCall_3_0_0; }
		
		//shared3+=ID*
		public Assignment getShared3Assignment_3_1() { return cShared3Assignment_3_1; }
		
		//ID
		public RuleCall getShared3IDTerminalRuleCall_3_1_0() { return cShared3IDTerminalRuleCall_3_1_0; }
		
		//"extra"
		public Keyword getExtraKeyword_4() { return cExtraKeyword_4; }
		
		//extra1=ID?
		public Assignment getExtra1Assignment_5() { return cExtra1Assignment_5; }
		
		//ID
		public RuleCall getExtra1IDTerminalRuleCall_5_0() { return cExtra1IDTerminalRuleCall_5_0; }
		
		//((extra2=ID extra3=ID) | "two" extra4=ID)?
		public Alternatives getAlternatives_6() { return cAlternatives_6; }
		
		//(extra2=ID extra3=ID)
		public Group getGroup_6_0() { return cGroup_6_0; }
		
		//extra2=ID
		public Assignment getExtra2Assignment_6_0_0() { return cExtra2Assignment_6_0_0; }
		
		//ID
		public RuleCall getExtra2IDTerminalRuleCall_6_0_0_0() { return cExtra2IDTerminalRuleCall_6_0_0_0; }
		
		//extra3=ID
		public Assignment getExtra3Assignment_6_0_1() { return cExtra3Assignment_6_0_1; }
		
		//ID
		public RuleCall getExtra3IDTerminalRuleCall_6_0_1_0() { return cExtra3IDTerminalRuleCall_6_0_1_0; }
		
		//"two" extra4=ID
		public Group getGroup_6_1() { return cGroup_6_1; }
		
		//"two"
		public Keyword getTwoKeyword_6_1_0() { return cTwoKeyword_6_1_0; }
		
		//extra4=ID
		public Assignment getExtra4Assignment_6_1_1() { return cExtra4Assignment_6_1_1; }
		
		//ID
		public RuleCall getExtra4IDTerminalRuleCall_6_1_1_0() { return cExtra4IDTerminalRuleCall_6_1_1_0; }
	}
	public class Heuristic1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Heuristic1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitEightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cKw1Keyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAIDTerminalRuleCall_1_1_0 = (RuleCall)cAAssignment_1_1.eContents().get(0);
		private final Assignment cBAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cBIDTerminalRuleCall_1_2_0 = (RuleCall)cBAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cKw2Keyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAIDTerminalRuleCall_2_1_0 = (RuleCall)cAAssignment_2_1.eContents().get(0);
		private final Assignment cCAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cCIDTerminalRuleCall_2_2_0 = (RuleCall)cCAssignment_2_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cKw3Keyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBIDTerminalRuleCall_3_1_0 = (RuleCall)cBAssignment_3_1.eContents().get(0);
		private final Assignment cCAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cCIDTerminalRuleCall_3_2_0 = (RuleCall)cCAssignment_3_2.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation] */
		//Heuristic1:
		//    "#28" ("kw1" a+=ID b+=ID)* ("kw2" a+=ID c+=ID)* ("kw3" b+=ID c+=ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#28" ("kw1" a+=ID b+=ID)* ("kw2" a+=ID c+=ID)* ("kw3" b+=ID c+=ID)*
		public Group getGroup() { return cGroup; }
		
		//"#28"
		public Keyword getNumberSignDigitTwoDigitEightKeyword_0() { return cNumberSignDigitTwoDigitEightKeyword_0; }
		
		//("kw1" a+=ID b+=ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_0() { return cKw1Keyword_1_0; }
		
		//a+=ID
		public Assignment getAAssignment_1_1() { return cAAssignment_1_1; }
		
		//ID
		public RuleCall getAIDTerminalRuleCall_1_1_0() { return cAIDTerminalRuleCall_1_1_0; }
		
		//b+=ID
		public Assignment getBAssignment_1_2() { return cBAssignment_1_2; }
		
		//ID
		public RuleCall getBIDTerminalRuleCall_1_2_0() { return cBIDTerminalRuleCall_1_2_0; }
		
		//("kw2" a+=ID c+=ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//"kw2"
		public Keyword getKw2Keyword_2_0() { return cKw2Keyword_2_0; }
		
		//a+=ID
		public Assignment getAAssignment_2_1() { return cAAssignment_2_1; }
		
		//ID
		public RuleCall getAIDTerminalRuleCall_2_1_0() { return cAIDTerminalRuleCall_2_1_0; }
		
		//c+=ID
		public Assignment getCAssignment_2_2() { return cCAssignment_2_2; }
		
		//ID
		public RuleCall getCIDTerminalRuleCall_2_2_0() { return cCIDTerminalRuleCall_2_2_0; }
		
		//("kw3" b+=ID c+=ID)*
		public Group getGroup_3() { return cGroup_3; }
		
		//"kw3"
		public Keyword getKw3Keyword_3_0() { return cKw3Keyword_3_0; }
		
		//b+=ID
		public Assignment getBAssignment_3_1() { return cBAssignment_3_1; }
		
		//ID
		public RuleCall getBIDTerminalRuleCall_3_1_0() { return cBIDTerminalRuleCall_3_1_0; }
		
		//c+=ID
		public Assignment getCAssignment_3_2() { return cCAssignment_3_2; }
		
		//ID
		public RuleCall getCIDTerminalRuleCall_3_2_0() { return cCIDTerminalRuleCall_3_2_0; }
	}
	
	public class TransientSerializeables1EnumElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TransientSerializeables1Enum");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLit1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLit1Lit1Keyword_0_0 = (Keyword)cLit1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLit2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLit2Lit2Keyword_1_0 = (Keyword)cLit2EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TransientSerializeables1Enum:
		//    lit1 | lit2;
		public EnumRule getRule() { return rule; }
		
		//lit1 | lit2
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//lit1
		public EnumLiteralDeclaration getLit1EnumLiteralDeclaration_0() { return cLit1EnumLiteralDeclaration_0; }
		
		public Keyword getLit1Lit1Keyword_0_0() { return cLit1Lit1Keyword_0_0; }
		
		//lit2
		public EnumLiteralDeclaration getLit2EnumLiteralDeclaration_1() { return cLit2EnumLiteralDeclaration_1; }
		
		public Keyword getLit2Lit2Keyword_1_0() { return cLit2Lit2Keyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final SimpleGroupElements pSimpleGroup;
	private final SimpleAlternativeElements pSimpleAlternative;
	private final SimpleMultiplicitiesElements pSimpleMultiplicities;
	private final GroupMultiplicitiesElements pGroupMultiplicities;
	private final AlternativeMultiplicitiesElements pAlternativeMultiplicities;
	private final AssignedActionElements pAssignedAction;
	private final AssignedActionSecondElements pAssignedActionSecond;
	private final UnassignedAction1Elements pUnassignedAction1;
	private final UnassignedAction2Elements pUnassignedAction2;
	private final UnassignedAction3Elements pUnassignedAction3;
	private final UnassignedRuleCall1Elements pUnassignedRuleCall1;
	private final UnassignedRuleCall1SubElements pUnassignedRuleCall1Sub;
	private final UnassignedRuleCall2Elements pUnassignedRuleCall2;
	private final UnassignedRuleCall2SubElements pUnassignedRuleCall2Sub;
	private final Combination1Elements pCombination1;
	private final Combination2Elements pCombination2;
	private final Combination3Elements pCombination3;
	private final Combination4Elements pCombination4;
	private final List1Elements pList1;
	private final List2Elements pList2;
	private final List3Elements pList3;
	private final List4Elements pList4;
	private final List5Elements pList5;
	private final AltList1Elements pAltList1;
	private final AltList2Elements pAltList2;
	private final TransientObjectElements pTransientObject;
	private final TransientObjectSubElements pTransientObjectSub;
	private final TransientSerializeables1Elements pTransientSerializeables1;
	private final TransientSerializeables1EnumElements eTransientSerializeables1Enum;
	private final StaticSimplificationElements pStaticSimplification;
	private final TwoVersionElements pTwoVersion;
	private final TwoVersionNo1Elements pTwoVersionNo1;
	private final TwoVersionNo2Elements pTwoVersionNo2;
	private final Heuristic1Elements pHeuristic1;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ConcreteSyntaxValidationTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSimpleGroup = new SimpleGroupElements();
		this.pSimpleAlternative = new SimpleAlternativeElements();
		this.pSimpleMultiplicities = new SimpleMultiplicitiesElements();
		this.pGroupMultiplicities = new GroupMultiplicitiesElements();
		this.pAlternativeMultiplicities = new AlternativeMultiplicitiesElements();
		this.pAssignedAction = new AssignedActionElements();
		this.pAssignedActionSecond = new AssignedActionSecondElements();
		this.pUnassignedAction1 = new UnassignedAction1Elements();
		this.pUnassignedAction2 = new UnassignedAction2Elements();
		this.pUnassignedAction3 = new UnassignedAction3Elements();
		this.pUnassignedRuleCall1 = new UnassignedRuleCall1Elements();
		this.pUnassignedRuleCall1Sub = new UnassignedRuleCall1SubElements();
		this.pUnassignedRuleCall2 = new UnassignedRuleCall2Elements();
		this.pUnassignedRuleCall2Sub = new UnassignedRuleCall2SubElements();
		this.pCombination1 = new Combination1Elements();
		this.pCombination2 = new Combination2Elements();
		this.pCombination3 = new Combination3Elements();
		this.pCombination4 = new Combination4Elements();
		this.pList1 = new List1Elements();
		this.pList2 = new List2Elements();
		this.pList3 = new List3Elements();
		this.pList4 = new List4Elements();
		this.pList5 = new List5Elements();
		this.pAltList1 = new AltList1Elements();
		this.pAltList2 = new AltList2Elements();
		this.pTransientObject = new TransientObjectElements();
		this.pTransientObjectSub = new TransientObjectSubElements();
		this.pTransientSerializeables1 = new TransientSerializeables1Elements();
		this.eTransientSerializeables1Enum = new TransientSerializeables1EnumElements();
		this.pStaticSimplification = new StaticSimplificationElements();
		this.pTwoVersion = new TwoVersionElements();
		this.pTwoVersionNo1 = new TwoVersionNo1Elements();
		this.pTwoVersionNo2 = new TwoVersionNo2Elements();
		this.pHeuristic1 = new Heuristic1Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage".equals(grammar.getName())) {
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
	//    x1=SimpleGroup | x2=SimpleAlternative | x3=SimpleMultiplicities | x4=GroupMultiplicities | x5=AlternativeMultiplicities |
	//    x6=AssignedAction | x7=AssignedActionSecond | x8=UnassignedAction1 | x9=UnassignedAction2 | x10=UnassignedAction3 |
	//    x11=UnassignedRuleCall1 | x12=UnassignedRuleCall2 | x13=Combination1 | x14=Combination2 | x15=Combination3 | x16=Combination4 |
	//    x17=List1 | x18=List2 | x19=List3 | x20=List4 | x21=List5 | x22=AltList1 | x23=AltList2 |
	//    x24=TransientObject | x25=TransientSerializeables1 | x26=StaticSimplification | x27=TwoVersion | x28=Heuristic1;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//SimpleGroup:
	//    "#1" val1=ID val2=ID;
	public SimpleGroupElements getSimpleGroupAccess() {
		return pSimpleGroup;
	}
	
	public ParserRule getSimpleGroupRule() {
		return getSimpleGroupAccess().getRule();
	}
	
	//SimpleAlternative:
	//    "#2" ("kw1" val1=ID | "kw2" val2=ID);
	public SimpleAlternativeElements getSimpleAlternativeAccess() {
		return pSimpleAlternative;
	}
	
	public ParserRule getSimpleAlternativeRule() {
		return getSimpleAlternativeAccess().getRule();
	}
	
	//SimpleMultiplicities:
	//    "#3" val1=ID "kw1" val2=ID? "kw2" val3+=ID+ "kw3" val4+=ID*;
	public SimpleMultiplicitiesElements getSimpleMultiplicitiesAccess() {
		return pSimpleMultiplicities;
	}
	
	public ParserRule getSimpleMultiplicitiesRule() {
		return getSimpleMultiplicitiesAccess().getRule();
	}
	
	//GroupMultiplicities:
	//    "#4" val1=ID "kw1" (val2=ID val3=ID)? "kw2" (val4+=ID val5+=ID)+ "kw3" (val6+=ID val7+=ID)*;
	public GroupMultiplicitiesElements getGroupMultiplicitiesAccess() {
		return pGroupMultiplicities;
	}
	
	public ParserRule getGroupMultiplicitiesRule() {
		return getGroupMultiplicitiesAccess().getRule();
	}
	
	//AlternativeMultiplicities:
	//    "#5" (val2=ID | "kw1" val3=ID)? "kw2" (val4+=ID | "kw3" val5+=ID)+ "kw4" (val6+=ID | ("kw5" val7+=ID))*;
	public AlternativeMultiplicitiesElements getAlternativeMultiplicitiesAccess() {
		return pAlternativeMultiplicities;
	}
	
	public ParserRule getAlternativeMultiplicitiesRule() {
		return getAlternativeMultiplicitiesAccess().getRule();
	}
	
	//AssignedAction:
	//    "#6" val1=ID ({AssignedAction.child=current} val1=ID)+;
	public AssignedActionElements getAssignedActionAccess() {
		return pAssignedAction;
	}
	
	public ParserRule getAssignedActionRule() {
		return getAssignedActionAccess().getRule();
	}
	
	//AssignedActionSecond returns AssignedAction:
	//    "#7" val1=ID "kw1" val2=ID;
	public AssignedActionSecondElements getAssignedActionSecondAccess() {
		return pAssignedActionSecond;
	}
	
	public ParserRule getAssignedActionSecondRule() {
		return getAssignedActionSecondAccess().getRule();
	}
	
	//UnassignedAction1:
	//    {UnassignedAction1} "#8" val1=ID val2=ID?;
	public UnassignedAction1Elements getUnassignedAction1Access() {
		return pUnassignedAction1;
	}
	
	public ParserRule getUnassignedAction1Rule() {
		return getUnassignedAction1Access().getRule();
	}
	
	//UnassignedAction2:
	//    {UnassignedAction2Sub} "#9" val1=ID val2=ID?;
	public UnassignedAction2Elements getUnassignedAction2Access() {
		return pUnassignedAction2;
	}
	
	public ParserRule getUnassignedAction2Rule() {
		return getUnassignedAction2Access().getRule();
	}
	
	//UnassignedAction3:
	//    "#10" ("kw1" {UnassignedAction2Sub1}|"kw2" {UnassignedAction2Sub2}) val1=ID val2=ID?;
	public UnassignedAction3Elements getUnassignedAction3Access() {
		return pUnassignedAction3;
	}
	
	public ParserRule getUnassignedAction3Rule() {
		return getUnassignedAction3Access().getRule();
	}
	
	//UnassignedRuleCall1:
	//    "#11" UnassignedRuleCall1Sub val2=ID;
	public UnassignedRuleCall1Elements getUnassignedRuleCall1Access() {
		return pUnassignedRuleCall1;
	}
	
	public ParserRule getUnassignedRuleCall1Rule() {
		return getUnassignedRuleCall1Access().getRule();
	}
	
	//UnassignedRuleCall1Sub:
	//    val1=ID;
	public UnassignedRuleCall1SubElements getUnassignedRuleCall1SubAccess() {
		return pUnassignedRuleCall1Sub;
	}
	
	public ParserRule getUnassignedRuleCall1SubRule() {
		return getUnassignedRuleCall1SubAccess().getRule();
	}
	
	//UnassignedRuleCall2:
	//    "#12" UnassignedRuleCall2Sub val2=ID;
	public UnassignedRuleCall2Elements getUnassignedRuleCall2Access() {
		return pUnassignedRuleCall2;
	}
	
	public ParserRule getUnassignedRuleCall2Rule() {
		return getUnassignedRuleCall2Access().getRule();
	}
	
	//UnassignedRuleCall2Sub:
	//    {UnassignedRuleCall2SubAction};
	public UnassignedRuleCall2SubElements getUnassignedRuleCall2SubAccess() {
		return pUnassignedRuleCall2Sub;
	}
	
	public ParserRule getUnassignedRuleCall2SubRule() {
		return getUnassignedRuleCall2SubAccess().getRule();
	}
	
	//Combination1:
	//    "#13" val1=ID ("kw1" val2=ID ("kw2" val3=ID | val4=ID))?;
	public Combination1Elements getCombination1Access() {
		return pCombination1;
	}
	
	public ParserRule getCombination1Rule() {
		return getCombination1Access().getRule();
	}
	
	//Combination2:
	//    "#14" val1=ID (("kw1" val2=ID) | (val3+=ID val4+=ID)*);
	public Combination2Elements getCombination2Access() {
		return pCombination2;
	}
	
	public ParserRule getCombination2Rule() {
		return getCombination2Access().getRule();
	}
	
	///* SuppressWarnings[noInstantiation, potentialOverride] */
	//Combination3:
	//    "#15" (val1=ID | val2=INT | val3=STRING)*;
	public Combination3Elements getCombination3Access() {
		return pCombination3;
	}
	
	public ParserRule getCombination3Rule() {
		return getCombination3Access().getRule();
	}
	
	//Combination4:
	//    "#16" ("group" val1+=ID val2+=ID val3+=ID)+;
	public Combination4Elements getCombination4Access() {
		return pCombination4;
	}
	
	public ParserRule getCombination4Rule() {
		return getCombination4Access().getRule();
	}
	
	//List1:
	//    "#17" val1+=ID ("," val1+=ID)*;
	public List1Elements getList1Access() {
		return pList1;
	}
	
	public ParserRule getList1Rule() {
		return getList1Access().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//List2:
	//    "#18" (val1+=ID ("," val1+=ID)*)?;
	public List2Elements getList2Access() {
		return pList2;
	}
	
	public ParserRule getList2Rule() {
		return getList2Access().getRule();
	}
	
	//List3:
	//    "#19" (val1+=ID ("," val1+=ID)*) | ("kw3" val2=ID);
	public List3Elements getList3Access() {
		return pList3;
	}
	
	public ParserRule getList3Rule() {
		return getList3Access().getRule();
	}
	
	//List4:
	//    "#20" val1+=ID ("," val1+=ID)* "kw3" val2=ID;
	public List4Elements getList4Access() {
		return pList4;
	}
	
	public ParserRule getList4Rule() {
		return getList4Access().getRule();
	}
	
	//List5:
	//    "#21" ((val1+=ID ("," val1+=ID)* "kw3" val2=ID) | val3=ID);
	public List5Elements getList5Access() {
		return pList5;
	}
	
	public ParserRule getList5Rule() {
		return getList5Access().getRule();
	}
	
	//AltList1:
	//    "#22" (val1=ID val2=ID | "kw1" val1=ID val3=ID | "kw2" val1=ID val4=ID?);
	public AltList1Elements getAltList1Access() {
		return pAltList1;
	}
	
	public ParserRule getAltList1Rule() {
		return getAltList1Access().getRule();
	}
	
	//AltList2:
	//    "#23" (val1+=ID val2=ID | "kw" val1+=ID ("," val1+=ID)* val3=ID);
	public AltList2Elements getAltList2Access() {
		return pAltList2;
	}
	
	public ParserRule getAltList2Rule() {
		return getAltList2Access().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//TransientObject:
	//    "#24" (val1=ID nested=TransientObjectSub)?;
	public TransientObjectElements getTransientObjectAccess() {
		return pTransientObject;
	}
	
	public ParserRule getTransientObjectRule() {
		return getTransientObjectAccess().getRule();
	}
	
	//TransientObjectSub:
	//    val2=ID val3=ID;
	public TransientObjectSubElements getTransientObjectSubAccess() {
		return pTransientObjectSub;
	}
	
	public ParserRule getTransientObjectSubRule() {
		return getTransientObjectSubAccess().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//TransientSerializeables1:
	//    "#25" (val1=ID enum1=TransientSerializeables1Enum)? (val2=ID int1=INT)?;
	public TransientSerializeables1Elements getTransientSerializeables1Access() {
		return pTransientSerializeables1;
	}
	
	public ParserRule getTransientSerializeables1Rule() {
		return getTransientSerializeables1Access().getRule();
	}
	
	//enum TransientSerializeables1Enum:
	//    lit1 | lit2;
	public TransientSerializeables1EnumElements getTransientSerializeables1EnumAccess() {
		return eTransientSerializeables1Enum;
	}
	
	public EnumRule getTransientSerializeables1EnumRule() {
		return getTransientSerializeables1EnumAccess().getRule();
	}
	
	///* SuppressWarnings[noInstantiation, potentialOverride] */
	//StaticSimplification:
	//    "#26" ("kw1"|{EmptyAlternativeSub}|val1=ID) ("kw2"|val2=ID) ("kw3" ("kw4" (val3=ID)+)?);
	public StaticSimplificationElements getStaticSimplificationAccess() {
		return pStaticSimplification;
	}
	
	public ParserRule getStaticSimplificationRule() {
		return getStaticSimplificationAccess().getRule();
	}
	
	//TwoVersion:
	//    "#27" (TwoVersionNo1 | TwoVersionNo2);
	public TwoVersionElements getTwoVersionAccess() {
		return pTwoVersion;
	}
	
	public ParserRule getTwoVersionRule() {
		return getTwoVersionAccess().getRule();
	}
	
	//TwoVersionNo1 returns TwoVersion:
	//    shared1=ID? shared2=ID "short" (shared3+=ID shared3+=ID*)? "one" version1=ID?;
	public TwoVersionNo1Elements getTwoVersionNo1Access() {
		return pTwoVersionNo1;
	}
	
	public ParserRule getTwoVersionNo1Rule() {
		return getTwoVersionNo1Access().getRule();
	}
	
	//TwoVersionNo2 returns TwoVersion:
	//    shared1=ID? shared2=ID "long" (shared3+=ID shared3+=ID*)?
	//    "extra" extra1=ID? ((extra2=ID extra3=ID) | "two" extra4=ID)?;
	public TwoVersionNo2Elements getTwoVersionNo2Access() {
		return pTwoVersionNo2;
	}
	
	public ParserRule getTwoVersionNo2Rule() {
		return getTwoVersionNo2Access().getRule();
	}
	
	///* SuppressWarnings[noInstantiation] */
	//Heuristic1:
	//    "#28" ("kw1" a+=ID b+=ID)* ("kw2" a+=ID c+=ID)* ("kw3" b+=ID c+=ID)*;
	public Heuristic1Elements getHeuristic1Access() {
		return pHeuristic1;
	}
	
	public ParserRule getHeuristic1Rule() {
		return getHeuristic1Access().getRule();
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
