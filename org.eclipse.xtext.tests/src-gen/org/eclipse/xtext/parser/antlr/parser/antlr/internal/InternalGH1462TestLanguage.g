/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalGH1462TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.antlr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.antlr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.antlr.services.GH1462TestLanguageGrammarAccess;

}

@parser::members {

 	private GH1462TestLanguageGrammarAccess grammarAccess;

    public InternalGH1462TestLanguageParser(TokenStream input, GH1462TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected GH1462TestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='#1'
			{
				newLeafNode(otherlv_0, grammarAccess.getRootAccess().getNumberSignDigitOneKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule1ParserRuleCall_0_1_0());
					}
					lv_element_1_0=ruleRule1
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_1_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule1");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='#2'
			{
				newLeafNode(otherlv_2, grammarAccess.getRootAccess().getNumberSignDigitTwoKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule2ParserRuleCall_1_1_0());
					}
					lv_element_3_0=ruleRule2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_3_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule2");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_4='#3'
			{
				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getNumberSignDigitThreeKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule3ParserRuleCall_2_1_0());
					}
					lv_element_5_0=ruleRule3
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_5_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule3");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_6='#4'
			{
				newLeafNode(otherlv_6, grammarAccess.getRootAccess().getNumberSignDigitFourKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule4ParserRuleCall_3_1_0());
					}
					lv_element_7_0=ruleRule4
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_7_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule4");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_8='#5'
			{
				newLeafNode(otherlv_8, grammarAccess.getRootAccess().getNumberSignDigitFiveKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule5ParserRuleCall_4_1_0());
					}
					lv_element_9_0=ruleRule5
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_9_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule5");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_10='#6'
			{
				newLeafNode(otherlv_10, grammarAccess.getRootAccess().getNumberSignDigitSixKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule6ParserRuleCall_5_1_0());
					}
					lv_element_11_0=ruleRule6
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_11_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule6");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_12='#7'
			{
				newLeafNode(otherlv_12, grammarAccess.getRootAccess().getNumberSignDigitSevenKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule7ParserRuleCall_6_1_0());
					}
					lv_element_13_0=ruleRule7
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_13_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule7");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_14='#8'
			{
				newLeafNode(otherlv_14, grammarAccess.getRootAccess().getNumberSignDigitEightKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule8ParserRuleCall_7_1_0());
					}
					lv_element_15_0=ruleRule8
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_15_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule8");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_16='#9'
			{
				newLeafNode(otherlv_16, grammarAccess.getRootAccess().getNumberSignDigitNineKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule9ParserRuleCall_8_1_0());
					}
					lv_element_17_0=ruleRule9
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_17_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule9");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_18='#10'
			{
				newLeafNode(otherlv_18, grammarAccess.getRootAccess().getNumberSignDigitOneDigitZeroKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule10ParserRuleCall_9_1_0());
					}
					lv_element_19_0=ruleRule10
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_19_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule10");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_20='#11'
			{
				newLeafNode(otherlv_20, grammarAccess.getRootAccess().getNumberSignDigitOneDigitOneKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule11ParserRuleCall_10_1_0());
					}
					lv_element_21_0=ruleRule11
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_21_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule11");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_22='#12'
			{
				newLeafNode(otherlv_22, grammarAccess.getRootAccess().getNumberSignDigitOneDigitTwoKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getElementRule12ParserRuleCall_11_1_0());
					}
					lv_element_23_0=ruleRule12
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"element",
							lv_element_23_0,
							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule12");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleRule1
entryRuleRule1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule1Rule()); }
	iv_ruleRule1=ruleRule1
	{ $current=$iv_ruleRule1.current; }
	EOF;

// Rule Rule1
ruleRule1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_INT
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule1Access().getLeftINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule1Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_right_1_0=RULE_INT
				{
					newLeafNode(lv_right_1_0, grammarAccess.getRule1Access().getRightINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule1Rule());
					}
					setWithLastConsumed(
						$current,
						"right",
						lv_right_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule1Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule1Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule2
entryRuleRule2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule2Rule()); }
	iv_ruleRule2=ruleRule2
	{ $current=$iv_ruleRule2.current; }
	EOF;

// Rule Rule2
ruleRule2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			newLeafNode(this_INT_0, grammarAccess.getRule2Access().getINTTerminalRuleCall_0());
		}
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getRule2Access().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule2Rule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule2Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule2Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule3
entryRuleRule3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule3Rule()); }
	iv_ruleRule3=ruleRule3
	{ $current=$iv_ruleRule3.current; }
	EOF;

// Rule Rule3
ruleRule3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_ID
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule3Access().getLeftIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule3Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_right_1_0=RULE_STRING
				{
					newLeafNode(lv_right_1_0, grammarAccess.getRule3Access().getRightSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule3Rule());
					}
					setWithLastConsumed(
						$current,
						"right",
						lv_right_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule3Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule3Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule4
entryRuleRule4 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule4Rule()); }
	iv_ruleRule4=ruleRule4
	{ $current=$iv_ruleRule4.current; }
	EOF;

// Rule Rule4
ruleRule4 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_STRING
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule4Access().getLeftSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule4Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_right_1_0=RULE_ID
				{
					newLeafNode(lv_right_1_0, grammarAccess.getRule4Access().getRightIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule4Rule());
					}
					setWithLastConsumed(
						$current,
						"right",
						lv_right_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule4Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule4Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule5
entryRuleRule5 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule5Rule()); }
	iv_ruleRule5=ruleRule5
	{ $current=$iv_ruleRule5.current; }
	EOF;

// Rule Rule5
ruleRule5 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_INT
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule5Access().getLeftINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule5Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRule5Access().getRightIntegerParserRuleCall_1_0());
				}
				lv_right_1_0=ruleInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule5Rule());
					}
					set(
						$current,
						"right",
						lv_right_1_0,
						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Integer");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule5Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule5Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule6
entryRuleRule6 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule6Rule()); }
	iv_ruleRule6=ruleRule6
	{ $current=$iv_ruleRule6.current; }
	EOF;

// Rule Rule6
ruleRule6 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_INT
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule6Access().getLeftINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule6Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRule6Access().getRightWrapperParserRuleCall_1_0());
				}
				lv_right_1_0=ruleWrapper
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule6Rule());
					}
					set(
						$current,
						"right",
						lv_right_1_0,
						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Wrapper");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule6Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule6Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule7
entryRuleRule7 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule7Rule()); }
	iv_ruleRule7=ruleRule7
	{ $current=$iv_ruleRule7.current; }
	EOF;

// Rule Rule7
ruleRule7 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_INT
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule7Access().getLeftINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule7Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_right_1_0=RULE_INT
				{
					newLeafNode(lv_right_1_0, grammarAccess.getRule7Access().getRightINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule7Rule());
					}
					setWithLastConsumed(
						$current,
						"right",
						lv_right_1_0 != null,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule7Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule7Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule8
entryRuleRule8 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule8Rule()); }
	iv_ruleRule8=ruleRule8
	{ $current=$iv_ruleRule8.current; }
	EOF;

// Rule Rule8
ruleRule8 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_INT
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule8Access().getLeftINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule8Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_right_1_0='#1'
				{
					newLeafNode(lv_right_1_0, grammarAccess.getRule8Access().getRight1Keyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule8Rule());
					}
					setWithLastConsumed($current, "right", lv_right_1_0 != null, "#1");
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule8Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule8Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule9
entryRuleRule9 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule9Rule()); }
	iv_ruleRule9=ruleRule9
	{ $current=$iv_ruleRule9.current; }
	EOF;

// Rule Rule9
ruleRule9 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_INT
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule9Access().getLeftINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule9Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRule9Access().getRightMaybeEmptyParserRuleCall_1_0());
				}
				lv_right_1_0=ruleMaybeEmpty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule9Rule());
					}
					set(
						$current,
						"right",
						lv_right_1_0,
						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.MaybeEmpty");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule9Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule9Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule10
entryRuleRule10 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule10Rule()); }
	iv_ruleRule10=ruleRule10
	{ $current=$iv_ruleRule10.current; }
	EOF;

// Rule Rule10
ruleRule10 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_INT
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule10Access().getLeftINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule10Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRule10Access().getRightMaybeEmptyParserRuleCall_1_0());
				}
				lv_right_1_0=ruleMaybeEmpty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule10Rule());
					}
					set(
						$current,
						"right",
						lv_right_1_0 != null,
						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.MaybeEmpty");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule10Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule10Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule11
entryRuleRule11 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule11Rule()); }
	iv_ruleRule11=ruleRule11
	{ $current=$iv_ruleRule11.current; }
	EOF;

// Rule Rule11
ruleRule11 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_INT
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule11Access().getLeftINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule11Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRule11Access().getRightIntegerParserRuleCall_1_0());
				}
				lv_right_1_0=ruleInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule11Rule());
					}
					set(
						$current,
						"right",
						lv_right_1_0 != null,
						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Integer");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule11Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule11Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleRule12
entryRuleRule12 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRule12Rule()); }
	iv_ruleRule12=ruleRule12
	{ $current=$iv_ruleRule12.current; }
	EOF;

// Rule Rule12
ruleRule12 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_left_0_0=RULE_INT
				{
					newLeafNode(lv_left_0_0, grammarAccess.getRule12Access().getLeftINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule12Rule());
					}
					setWithLastConsumed(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRule12Access().getRightWrapperParserRuleCall_1_0());
				}
				lv_right_1_0=ruleWrapper
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRule12Rule());
					}
					set(
						$current,
						"right",
						lv_right_1_0 != null,
						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Wrapper");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_unit_2_0='s'
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getRule12Access().getUnitSKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRule12Rule());
					}
					setWithLastConsumed($current, "unit", lv_unit_2_0, "s");
				}
			)
		)
	)
;

// Entry rule entryRuleInteger
entryRuleInteger returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	iv_ruleInteger=ruleInteger
	{ $current=$iv_ruleInteger.current.getText(); }
	EOF;

// Rule Integer
ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INT_0=RULE_INT
	{
		$current.merge(this_INT_0);
	}
	{
		newLeafNode(this_INT_0, grammarAccess.getIntegerAccess().getINTTerminalRuleCall());
	}
;

// Entry rule entryRuleMaybeEmpty
entryRuleMaybeEmpty returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMaybeEmptyRule()); }
	iv_ruleMaybeEmpty=ruleMaybeEmpty
	{ $current=$iv_ruleMaybeEmpty.current.getText(); }
	EOF;

// Rule MaybeEmpty
ruleMaybeEmpty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getMaybeEmptyAccess().getINTTerminalRuleCall());
		}
	)?
;

// Entry rule entryRuleWrapper
entryRuleWrapper returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWrapperRule()); }
	iv_ruleWrapper=ruleWrapper
	{ $current=$iv_ruleWrapper.current; }
	EOF;

// Rule Wrapper
ruleWrapper returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getWrapperAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getWrapperRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
