/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.formatting2.regionaccess.internal.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
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
public class RegionAccessTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Root");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSimpleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDelegationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cUnassignedParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPrefixedUnassignedParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cDigitFiveKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cDigitSixKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final RuleCall cMixedParserRuleCall_5_1 = (RuleCall)cGroup_5.eContents().get(1);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Keyword cDigitSevenKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Group cGroup_6_1 = (Group)cGroup_6.eContents().get(1);
		private final Action cRootActionAction_6_1_0 = (Action)cGroup_6_1.eContents().get(0);
		private final Keyword cActionKeyword_6_1_1 = (Keyword)cGroup_6_1.eContents().get(1);
		private final Assignment cMixedAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cMixedMixedParserRuleCall_6_2_0 = (RuleCall)cMixedAssignment_6_2.eContents().get(0);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Keyword cDigitEightKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final RuleCall cValueListParserRuleCall_7_1 = (RuleCall)cGroup_7.eContents().get(1);
		
		//Root:
		//    Simple | Delegation | Unassigned | PrefixedUnassigned | "5" Expression | "6" Mixed | "7" ({RootAction} "action")? mixed=Mixed | "8" ValueList;
		@Override public ParserRule getRule() { return rule; }
		
		//Simple | Delegation | Unassigned | PrefixedUnassigned | "5" Expression | "6" Mixed | "7" ({RootAction} "action")? mixed=Mixed | "8" ValueList
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Simple
		public RuleCall getSimpleParserRuleCall_0() { return cSimpleParserRuleCall_0; }
		
		//Delegation
		public RuleCall getDelegationParserRuleCall_1() { return cDelegationParserRuleCall_1; }
		
		//Unassigned
		public RuleCall getUnassignedParserRuleCall_2() { return cUnassignedParserRuleCall_2; }
		
		//PrefixedUnassigned
		public RuleCall getPrefixedUnassignedParserRuleCall_3() { return cPrefixedUnassignedParserRuleCall_3; }
		
		//"5" Expression
		public Group getGroup_4() { return cGroup_4; }
		
		//"5"
		public Keyword getDigitFiveKeyword_4_0() { return cDigitFiveKeyword_4_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_4_1() { return cExpressionParserRuleCall_4_1; }
		
		//"6" Mixed
		public Group getGroup_5() { return cGroup_5; }
		
		//"6"
		public Keyword getDigitSixKeyword_5_0() { return cDigitSixKeyword_5_0; }
		
		//Mixed
		public RuleCall getMixedParserRuleCall_5_1() { return cMixedParserRuleCall_5_1; }
		
		//"7" ({RootAction} "action")? mixed=Mixed
		public Group getGroup_6() { return cGroup_6; }
		
		//"7"
		public Keyword getDigitSevenKeyword_6_0() { return cDigitSevenKeyword_6_0; }
		
		//({RootAction} "action")?
		public Group getGroup_6_1() { return cGroup_6_1; }
		
		//{RootAction}
		public Action getRootActionAction_6_1_0() { return cRootActionAction_6_1_0; }
		
		//"action"
		public Keyword getActionKeyword_6_1_1() { return cActionKeyword_6_1_1; }
		
		//mixed=Mixed
		public Assignment getMixedAssignment_6_2() { return cMixedAssignment_6_2; }
		
		//Mixed
		public RuleCall getMixedMixedParserRuleCall_6_2_0() { return cMixedMixedParserRuleCall_6_2_0; }
		
		//"8" ValueList
		public Group getGroup_7() { return cGroup_7; }
		
		//"8"
		public Keyword getDigitEightKeyword_7_0() { return cDigitEightKeyword_7_0; }
		
		//ValueList
		public RuleCall getValueListParserRuleCall_7_1() { return cValueListParserRuleCall_7_1; }
	}
	public class SimpleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Simple");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Simple:
		//    "1" name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"1" name=ID
		public Group getGroup() { return cGroup; }
		
		//"1"
		public Keyword getDigitOneKeyword_0() { return cDigitOneKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class DelegationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Delegation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDigitTwoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDelegateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDelegateDelegateParserRuleCall_1_0 = (RuleCall)cDelegateAssignment_1.eContents().get(0);
		
		//Delegation:
		//    "2" delegate=Delegate;
		@Override public ParserRule getRule() { return rule; }
		
		//"2" delegate=Delegate
		public Group getGroup() { return cGroup; }
		
		//"2"
		public Keyword getDigitTwoKeyword_0() { return cDigitTwoKeyword_0; }
		
		//delegate=Delegate
		public Assignment getDelegateAssignment_1() { return cDelegateAssignment_1; }
		
		//Delegate
		public RuleCall getDelegateDelegateParserRuleCall_1_0() { return cDelegateDelegateParserRuleCall_1_0; }
	}
	public class UnassignedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Unassigned");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cDelegateParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Unassigned:
		//    "3" Delegate;
		@Override public ParserRule getRule() { return rule; }
		
		//"3" Delegate
		public Group getGroup() { return cGroup; }
		
		//"3"
		public Keyword getDigitThreeKeyword_0() { return cDigitThreeKeyword_0; }
		
		//Delegate
		public RuleCall getDelegateParserRuleCall_1() { return cDelegateParserRuleCall_1; }
	}
	public class PrefixedUnassignedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.PrefixedUnassigned");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDelegateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDelegatePrefixedDelegateParserRuleCall_1_0 = (RuleCall)cDelegateAssignment_1.eContents().get(0);
		
		//PrefixedUnassigned:
		//    "4" delegate=PrefixedDelegate;
		@Override public ParserRule getRule() { return rule; }
		
		//"4" delegate=PrefixedDelegate
		public Group getGroup() { return cGroup; }
		
		//"4"
		public Keyword getDigitFourKeyword_0() { return cDigitFourKeyword_0; }
		
		//delegate=PrefixedDelegate
		public Assignment getDelegateAssignment_1() { return cDelegateAssignment_1; }
		
		//PrefixedDelegate
		public RuleCall getDelegatePrefixedDelegateParserRuleCall_1_0() { return cDelegatePrefixedDelegateParserRuleCall_1_0; }
	}
	public class PrefixedDelegateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.PrefixedDelegate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPrefixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cDelegateParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//PrefixedDelegate:
		//    "prefix" Delegate;
		@Override public ParserRule getRule() { return rule; }
		
		//"prefix" Delegate
		public Group getGroup() { return cGroup; }
		
		//"prefix"
		public Keyword getPrefixKeyword_0() { return cPrefixKeyword_0; }
		
		//Delegate
		public RuleCall getDelegateParserRuleCall_1() { return cDelegateParserRuleCall_1; }
	}
	public class DelegateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Delegate");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Delegate:
		//    name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAddLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Expression:
		//    Primary ({Add.left=current} "+" right=Primary)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary ({Add.left=current} "+" right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//({Add.left=current} "+" right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Add.left=current}
		public Action getAddLeftAction_1_0() { return cAddLeftAction_1_0; }
		
		//"+"
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_2_0() { return cRightPrimaryParserRuleCall_1_2_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cNamedAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final RuleCall cParenthesizedParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Primary returns Expression:
		//    {Named} name=ID | Parenthesized;
		@Override public ParserRule getRule() { return rule; }
		
		//{Named} name=ID | Parenthesized
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Named} name=ID
		public Group getGroup_0() { return cGroup_0; }
		
		//{Named}
		public Action getNamedAction_0_0() { return cNamedAction_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//Parenthesized
		public RuleCall getParenthesizedParserRuleCall_1() { return cParenthesizedParserRuleCall_1; }
	}
	public class ParenthesizedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Parenthesized");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parenthesized returns Expression:
		//    "(" Expression ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" Expression ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_1() { return cExpressionParserRuleCall_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class MixedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Mixed");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cUnassignedKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cDatatypeParserRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Action cActionAction_2_0_0 = (Action)cGroup_2_0.eContents().get(0);
		private final Group cGroup_2_0_1 = (Group)cGroup_2_0.eContents().get(1);
		private final Keyword cFragmentKeyword_2_0_1_0 = (Keyword)cGroup_2_0_1.eContents().get(0);
		private final RuleCall cFragmentParserRuleCall_2_0_1_1 = (RuleCall)cGroup_2_0_1.eContents().get(1);
		private final RuleCall cMixedParserRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		private final Alternatives cAlternatives_2_2 = (Alternatives)cAlternatives_2.eContents().get(2);
		private final Assignment cNameAssignment_2_2_0 = (Assignment)cAlternatives_2_2.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_2_2_0_0 = (RuleCall)cNameAssignment_2_2_0.eContents().get(0);
		private final Group cGroup_2_2_1 = (Group)cAlternatives_2_2.eContents().get(1);
		private final Keyword cChildKeyword_2_2_1_0 = (Keyword)cGroup_2_2_1.eContents().get(0);
		private final Assignment cEobjAssignment_2_2_1_1 = (Assignment)cGroup_2_2_1.eContents().get(1);
		private final RuleCall cEobjMixedParserRuleCall_2_2_1_1_0 = (RuleCall)cEobjAssignment_2_2_1_1.eContents().get(0);
		private final Assignment cDatatypeAssignment_2_2_2 = (Assignment)cAlternatives_2_2.eContents().get(2);
		private final RuleCall cDatatypeDatatypeParserRuleCall_2_2_2_0 = (RuleCall)cDatatypeAssignment_2_2_2.eContents().get(0);
		private final Group cGroup_2_2_3 = (Group)cAlternatives_2_2.eContents().get(3);
		private final Keyword cRefKeyword_2_2_3_0 = (Keyword)cGroup_2_2_3.eContents().get(0);
		private final Assignment cRefAssignment_2_2_3_1 = (Assignment)cGroup_2_2_3.eContents().get(1);
		private final CrossReference cRefMixedCrossReference_2_2_3_1_0 = (CrossReference)cRefAssignment_2_2_3_1.eContents().get(0);
		private final RuleCall cRefMixedIDTerminalRuleCall_2_2_3_1_0_1 = (RuleCall)cRefMixedCrossReference_2_2_3_1_0.eContents().get(1);
		private final Assignment cLitAssignment_2_2_4 = (Assignment)cAlternatives_2_2.eContents().get(4);
		private final RuleCall cLitEnumEnumRuleCall_2_2_4_0 = (RuleCall)cLitAssignment_2_2_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Action cAssignedActionChildAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Keyword cActionKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Assignment cBodyAssignment_4_2_0 = (Assignment)cGroup_4_2.eContents().get(0);
		private final RuleCall cBodyMixedParserRuleCall_4_2_0_0 = (RuleCall)cBodyAssignment_4_2_0.eContents().get(0);
		private final Keyword cEndKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		
		//Mixed:
		//    "("
		//    ("unassigned" (ID | Datatype))?
		//    ({Action} ("fragment" Fragment)? |
		//    Mixed |
		//    (name=ID | "child" eobj=Mixed | datatype=Datatype | "ref" ref=[Mixed|ID] | lit=Enum))
		//    ")"
		//    ({AssignedAction.child=current} "action" (body=Mixed "end")?)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"("
		//("unassigned" (ID | Datatype))?
		//({Action} ("fragment" Fragment)? |
		//Mixed |
		//(name=ID | "child" eobj=Mixed | datatype=Datatype | "ref" ref=[Mixed|ID] | lit=Enum))
		//")"
		//({AssignedAction.child=current} "action" (body=Mixed "end")?)*
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//("unassigned" (ID | Datatype))?
		public Group getGroup_1() { return cGroup_1; }
		
		//"unassigned"
		public Keyword getUnassignedKeyword_1_0() { return cUnassignedKeyword_1_0; }
		
		//(ID | Datatype)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1_0() { return cIDTerminalRuleCall_1_1_0; }
		
		//Datatype
		public RuleCall getDatatypeParserRuleCall_1_1_1() { return cDatatypeParserRuleCall_1_1_1; }
		
		//({Action} ("fragment" Fragment)? |
		//Mixed |
		//(name=ID | "child" eobj=Mixed | datatype=Datatype | "ref" ref=[Mixed|ID] | lit=Enum))
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//{Action} ("fragment" Fragment)?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//{Action}
		public Action getActionAction_2_0_0() { return cActionAction_2_0_0; }
		
		//("fragment" Fragment)?
		public Group getGroup_2_0_1() { return cGroup_2_0_1; }
		
		//"fragment"
		public Keyword getFragmentKeyword_2_0_1_0() { return cFragmentKeyword_2_0_1_0; }
		
		//Fragment
		public RuleCall getFragmentParserRuleCall_2_0_1_1() { return cFragmentParserRuleCall_2_0_1_1; }
		
		//Mixed
		public RuleCall getMixedParserRuleCall_2_1() { return cMixedParserRuleCall_2_1; }
		
		//(name=ID | "child" eobj=Mixed | datatype=Datatype | "ref" ref=[Mixed|ID] | lit=Enum)
		public Alternatives getAlternatives_2_2() { return cAlternatives_2_2; }
		
		//name=ID
		public Assignment getNameAssignment_2_2_0() { return cNameAssignment_2_2_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_2_0_0() { return cNameIDTerminalRuleCall_2_2_0_0; }
		
		//"child" eobj=Mixed
		public Group getGroup_2_2_1() { return cGroup_2_2_1; }
		
		//"child"
		public Keyword getChildKeyword_2_2_1_0() { return cChildKeyword_2_2_1_0; }
		
		//eobj=Mixed
		public Assignment getEobjAssignment_2_2_1_1() { return cEobjAssignment_2_2_1_1; }
		
		//Mixed
		public RuleCall getEobjMixedParserRuleCall_2_2_1_1_0() { return cEobjMixedParserRuleCall_2_2_1_1_0; }
		
		//datatype=Datatype
		public Assignment getDatatypeAssignment_2_2_2() { return cDatatypeAssignment_2_2_2; }
		
		//Datatype
		public RuleCall getDatatypeDatatypeParserRuleCall_2_2_2_0() { return cDatatypeDatatypeParserRuleCall_2_2_2_0; }
		
		//"ref" ref=[Mixed|ID]
		public Group getGroup_2_2_3() { return cGroup_2_2_3; }
		
		//"ref"
		public Keyword getRefKeyword_2_2_3_0() { return cRefKeyword_2_2_3_0; }
		
		//ref=[Mixed|ID]
		public Assignment getRefAssignment_2_2_3_1() { return cRefAssignment_2_2_3_1; }
		
		//[Mixed|ID]
		public CrossReference getRefMixedCrossReference_2_2_3_1_0() { return cRefMixedCrossReference_2_2_3_1_0; }
		
		//ID
		public RuleCall getRefMixedIDTerminalRuleCall_2_2_3_1_0_1() { return cRefMixedIDTerminalRuleCall_2_2_3_1_0_1; }
		
		//lit=Enum
		public Assignment getLitAssignment_2_2_4() { return cLitAssignment_2_2_4; }
		
		//Enum
		public RuleCall getLitEnumEnumRuleCall_2_2_4_0() { return cLitEnumEnumRuleCall_2_2_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//({AssignedAction.child=current} "action" (body=Mixed "end")?)*
		public Group getGroup_4() { return cGroup_4; }
		
		//{AssignedAction.child=current}
		public Action getAssignedActionChildAction_4_0() { return cAssignedActionChildAction_4_0; }
		
		//"action"
		public Keyword getActionKeyword_4_1() { return cActionKeyword_4_1; }
		
		//(body=Mixed "end")?
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//body=Mixed
		public Assignment getBodyAssignment_4_2_0() { return cBodyAssignment_4_2_0; }
		
		//Mixed
		public RuleCall getBodyMixedParserRuleCall_4_2_0_0() { return cBodyMixedParserRuleCall_4_2_0_0; }
		
		//"end"
		public Keyword getEndKeyword_4_2_1() { return cEndKeyword_4_2_1; }
	}
	public class DatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Datatype");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cDatatypeParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//Datatype:
		//    "datatype" (Datatype | ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"datatype" (Datatype | ID)
		public Group getGroup() { return cGroup; }
		
		//"datatype"
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }
		
		//(Datatype | ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//Datatype
		public RuleCall getDatatypeParserRuleCall_1_0() { return cDatatypeParserRuleCall_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class FragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Fragment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cFragNameAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cFragNameIDTerminalRuleCall_0_0 = (RuleCall)cFragNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cChildKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMixedAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMixedMixedParserRuleCall_1_1_0 = (RuleCall)cMixedAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cRecursionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cFragmentParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//fragment Fragment returns Mixed:
		//    fragName=ID | "child" mixed=Mixed | "recursion" Fragment;
		@Override public ParserRule getRule() { return rule; }
		
		//fragName=ID | "child" mixed=Mixed | "recursion" Fragment
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//fragName=ID
		public Assignment getFragNameAssignment_0() { return cFragNameAssignment_0; }
		
		//ID
		public RuleCall getFragNameIDTerminalRuleCall_0_0() { return cFragNameIDTerminalRuleCall_0_0; }
		
		//"child" mixed=Mixed
		public Group getGroup_1() { return cGroup_1; }
		
		//"child"
		public Keyword getChildKeyword_1_0() { return cChildKeyword_1_0; }
		
		//mixed=Mixed
		public Assignment getMixedAssignment_1_1() { return cMixedAssignment_1_1; }
		
		//Mixed
		public RuleCall getMixedMixedParserRuleCall_1_1_0() { return cMixedMixedParserRuleCall_1_1_0; }
		
		//"recursion" Fragment
		public Group getGroup_2() { return cGroup_2; }
		
		//"recursion"
		public Keyword getRecursionKeyword_2_0() { return cRecursionKeyword_2_0; }
		
		//Fragment
		public RuleCall getFragmentParserRuleCall_2_1() { return cFragmentParserRuleCall_2_1; }
	}
	public class ValueListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.ValueList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cValueListAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ValueList:
		//    {ValueList} name+=ID*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{ValueList} name+=ID*
		public Group getGroup() { return cGroup; }
		
		//{ValueList}
		public Action getValueListAction_0() { return cValueListAction_0; }
		
		//name+=ID*
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	public class EnumElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Enum");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLit1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLit1Lit1Keyword_0_0 = (Keyword)cLit1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLit2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLit2Lit2Keyword_1_0 = (Keyword)cLit2EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Enum:
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
	
	private final RootElements pRoot;
	private final SimpleElements pSimple;
	private final DelegationElements pDelegation;
	private final UnassignedElements pUnassigned;
	private final PrefixedUnassignedElements pPrefixedUnassigned;
	private final PrefixedDelegateElements pPrefixedDelegate;
	private final DelegateElements pDelegate;
	private final ExpressionElements pExpression;
	private final PrimaryElements pPrimary;
	private final ParenthesizedElements pParenthesized;
	private final MixedElements pMixed;
	private final DatatypeElements pDatatype;
	private final FragmentElements pFragment;
	private final EnumElements eEnum;
	private final ValueListElements pValueList;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RegionAccessTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pSimple = new SimpleElements();
		this.pDelegation = new DelegationElements();
		this.pUnassigned = new UnassignedElements();
		this.pPrefixedUnassigned = new PrefixedUnassignedElements();
		this.pPrefixedDelegate = new PrefixedDelegateElements();
		this.pDelegate = new DelegateElements();
		this.pExpression = new ExpressionElements();
		this.pPrimary = new PrimaryElements();
		this.pParenthesized = new ParenthesizedElements();
		this.pMixed = new MixedElements();
		this.pDatatype = new DatatypeElements();
		this.pFragment = new FragmentElements();
		this.eEnum = new EnumElements();
		this.pValueList = new ValueListElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage".equals(grammar.getName())) {
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
	//    Simple | Delegation | Unassigned | PrefixedUnassigned | "5" Expression | "6" Mixed | "7" ({RootAction} "action")? mixed=Mixed | "8" ValueList;
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//Simple:
	//    "1" name=ID;
	public SimpleElements getSimpleAccess() {
		return pSimple;
	}
	
	public ParserRule getSimpleRule() {
		return getSimpleAccess().getRule();
	}
	
	//Delegation:
	//    "2" delegate=Delegate;
	public DelegationElements getDelegationAccess() {
		return pDelegation;
	}
	
	public ParserRule getDelegationRule() {
		return getDelegationAccess().getRule();
	}
	
	//Unassigned:
	//    "3" Delegate;
	public UnassignedElements getUnassignedAccess() {
		return pUnassigned;
	}
	
	public ParserRule getUnassignedRule() {
		return getUnassignedAccess().getRule();
	}
	
	//PrefixedUnassigned:
	//    "4" delegate=PrefixedDelegate;
	public PrefixedUnassignedElements getPrefixedUnassignedAccess() {
		return pPrefixedUnassigned;
	}
	
	public ParserRule getPrefixedUnassignedRule() {
		return getPrefixedUnassignedAccess().getRule();
	}
	
	//PrefixedDelegate:
	//    "prefix" Delegate;
	public PrefixedDelegateElements getPrefixedDelegateAccess() {
		return pPrefixedDelegate;
	}
	
	public ParserRule getPrefixedDelegateRule() {
		return getPrefixedDelegateAccess().getRule();
	}
	
	//Delegate:
	//    name=ID;
	public DelegateElements getDelegateAccess() {
		return pDelegate;
	}
	
	public ParserRule getDelegateRule() {
		return getDelegateAccess().getRule();
	}
	
	//Expression:
	//    Primary ({Add.left=current} "+" right=Primary)*;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Primary returns Expression:
	//    {Named} name=ID | Parenthesized;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Parenthesized returns Expression:
	//    "(" Expression ")";
	public ParenthesizedElements getParenthesizedAccess() {
		return pParenthesized;
	}
	
	public ParserRule getParenthesizedRule() {
		return getParenthesizedAccess().getRule();
	}
	
	//Mixed:
	//    "("
	//    ("unassigned" (ID | Datatype))?
	//    ({Action} ("fragment" Fragment)? |
	//    Mixed |
	//    (name=ID | "child" eobj=Mixed | datatype=Datatype | "ref" ref=[Mixed|ID] | lit=Enum))
	//    ")"
	//    ({AssignedAction.child=current} "action" (body=Mixed "end")?)*;
	public MixedElements getMixedAccess() {
		return pMixed;
	}
	
	public ParserRule getMixedRule() {
		return getMixedAccess().getRule();
	}
	
	//Datatype:
	//    "datatype" (Datatype | ID);
	public DatatypeElements getDatatypeAccess() {
		return pDatatype;
	}
	
	public ParserRule getDatatypeRule() {
		return getDatatypeAccess().getRule();
	}
	
	//fragment Fragment returns Mixed:
	//    fragName=ID | "child" mixed=Mixed | "recursion" Fragment;
	public FragmentElements getFragmentAccess() {
		return pFragment;
	}
	
	public ParserRule getFragmentRule() {
		return getFragmentAccess().getRule();
	}
	
	//enum Enum:
	//    lit1 | lit2;
	public EnumElements getEnumAccess() {
		return eEnum;
	}
	
	public EnumRule getEnumRule() {
		return getEnumAccess().getRule();
	}
	
	//ValueList:
	//    {ValueList} name+=ID*
	//;
	public ValueListElements getValueListAccess() {
		return pValueList;
	}
	
	public ParserRule getValueListRule() {
		return getValueListAccess().getRule();
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
