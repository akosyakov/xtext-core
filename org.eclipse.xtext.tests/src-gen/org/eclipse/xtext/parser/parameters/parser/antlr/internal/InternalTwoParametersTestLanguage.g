/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalTwoParametersTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.parameters.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.parameters.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.parameters.services.TwoParametersTestLanguageGrammarAccess;

}

@parser::members {

 	private TwoParametersTestLanguageGrammarAccess grammarAccess;

    public InternalTwoParametersTestLanguageParser(TokenStream input, TwoParametersTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ParserRuleParameters";
   	}

   	@Override
   	protected TwoParametersTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleParserRuleParameters
entryRuleParserRuleParameters returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParserRuleParametersRule()); }
	iv_ruleParserRuleParameters=ruleParserRuleParameters
	{ $current=$iv_ruleParserRuleParameters.current; }
	EOF;

// Rule ParserRuleParameters
ruleParserRuleParameters returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getParserRuleParametersAccess().getParserRuleParametersAction_0(),
					$current);
			}
		)
		(
			(
				otherlv_1='#1'
				{
					newLeafNode(otherlv_1, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneKeyword_1_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario5ParserRuleCall_1_0_1_0());
						}
						lv_scenario_2_0=norm3_Scenario5
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_2_0,
								"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario5");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_3='#2'
				{
					newLeafNode(otherlv_3, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitTwoKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario5ParserRuleCall_1_1_1_0());
						}
						lv_scenario_4_0=ruleScenario5
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_4_0,
								"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario5");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_5='#3'
				{
					newLeafNode(otherlv_5, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitThreeKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_2_1_0());
						}
						lv_scenario_6_0=norm3_Scenario6
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_6_0,
								"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario6");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_7='#4'
				{
					newLeafNode(otherlv_7, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitFourKeyword_1_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_3_1_0());
						}
						lv_scenario_8_0=norm2_Scenario6
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_8_0,
								"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario6");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				((
					'#5'
					(
						(
							norm3_Scenario6
						)
					)
				)
				)=>
				(
					otherlv_9='#5'
					{
						newLeafNode(otherlv_9, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitFiveKeyword_1_4_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_4_0_1_0());
							}
							lv_scenario_10_0=norm3_Scenario6
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_10_0,
									"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario6");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			    |
			(
				((
					'#6'
					(
						(
							ruleScenario6
						)
					)
				)
				)=>
				(
					otherlv_11='#6'
					{
						newLeafNode(otherlv_11, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitSixKeyword_1_5_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_5_0_1_0());
							}
							lv_scenario_12_0=ruleScenario6
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_12_0,
									"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario6");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			    |
			(
				otherlv_13='#7'
				{
					newLeafNode(otherlv_13, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitSevenKeyword_1_6_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_6_1_0());
						}
						lv_scenario_14_0=norm3_Scenario7
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_14_0,
								"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario7");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_15='#8'
				{
					newLeafNode(otherlv_15, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitEightKeyword_1_7_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_7_1_0());
						}
						lv_scenario_16_0=norm2_Scenario7
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_16_0,
								"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario7");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_17='#9'
				{
					newLeafNode(otherlv_17, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitNineKeyword_1_8_0());
				}
				(
					(
						((
							norm7_IdOrKeyword2
						)
						)=>
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario8ParserRuleCall_1_8_1_0_0());
							}
							lv_scenario_18_0=norm3_Scenario8
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_18_0,
									"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario8");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_8_1_1_0_0());
								}
								lv_scenario_19_0=norm3_Scenario6
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
									}
									set(
										$current,
										"scenario",
										lv_scenario_19_0,
										"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario6");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_20='keyword'
							{
								newLeafNode(otherlv_20, grammarAccess.getParserRuleParametersAccess().getKeywordKeyword_1_8_1_1_1());
							}
						)?
					)
				)
			)
			    |
			(
				otherlv_21='#10'
				{
					newLeafNode(otherlv_21, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitZeroKeyword_1_9_0());
				}
				(
					(
						((
							norm7_IdOrKeyword2
						)
						)=>
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario8ParserRuleCall_1_9_1_0_0());
							}
							lv_scenario_22_0=norm3_Scenario8
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_22_0,
									"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario8");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_9_1_1_0_0());
								}
								lv_scenario_23_0=ruleScenario6
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
									}
									set(
										$current,
										"scenario",
										lv_scenario_23_0,
										"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario6");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_24='keyword'
							{
								newLeafNode(otherlv_24, grammarAccess.getParserRuleParametersAccess().getKeywordKeyword_1_9_1_1_1());
							}
						)?
					)
				)
			)
			    |
			(
				otherlv_25='#11'
				{
					newLeafNode(otherlv_25, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitOneKeyword_1_10_0());
				}
				(
					(
						((
							ruleIdOrKeyword2
						)
						)=>
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario8ParserRuleCall_1_10_1_0_0());
							}
							lv_scenario_26_0=ruleScenario8
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_26_0,
									"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario8");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_10_1_1_0_0());
								}
								lv_scenario_27_0=norm3_Scenario6
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
									}
									set(
										$current,
										"scenario",
										lv_scenario_27_0,
										"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario6");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_28='keyword'
							{
								newLeafNode(otherlv_28, grammarAccess.getParserRuleParametersAccess().getKeywordKeyword_1_10_1_1_1());
							}
						)?
					)
				)
			)
			    |
			(
				otherlv_29='#12'
				{
					newLeafNode(otherlv_29, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitTwoKeyword_1_11_0());
				}
				(
					(
						((
							ruleIdOrKeyword2
						)
						)=>
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario8ParserRuleCall_1_11_1_0_0());
							}
							lv_scenario_30_0=ruleScenario8
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_30_0,
									"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario8");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_11_1_1_0_0());
								}
								lv_scenario_31_0=ruleScenario6
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
									}
									set(
										$current,
										"scenario",
										lv_scenario_31_0,
										"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.Scenario6");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_32='keyword'
							{
								newLeafNode(otherlv_32, grammarAccess.getParserRuleParametersAccess().getKeywordKeyword_1_11_1_1_1());
							}
						)?
					)
				)
			)
		)
	)
;

// Entry rule entryRuleScenario5
entryRuleScenario5 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario5Rule()); }
	iv_ruleScenario5=ruleScenario5
	{ $current=$iv_ruleScenario5.current; }
	EOF;

// Rule Scenario5
ruleScenario5 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_second_0_0=RULE_ID
			{
				newLeafNode(lv_second_0_0, grammarAccess.getScenario5Access().getSecondIDTerminalRuleCall_1_0_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getScenario5Rule());
				}
				setWithLastConsumed(
					$current,
					"second",
					lv_second_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;


// Rule Scenario5
norm3_Scenario5 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_first_0_0=RULE_ID
			{
				newLeafNode(lv_first_0_0, grammarAccess.getScenario5Access().getFirstIDTerminalRuleCall_0_0_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getScenario5Rule());
				}
				setWithLastConsumed(
					$current,
					"first",
					lv_first_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleScenario6
entryRuleScenario6 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario6Rule()); }
	iv_ruleScenario6=ruleScenario6
	{ $current=$iv_ruleScenario6.current; }
	EOF;

// Rule Scenario6
ruleScenario6 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getScenario6Access().getFirstIdOrKeyword2ParserRuleCall_0());
			}
			lv_first_0_0=ruleIdOrKeyword2
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getScenario6Rule());
				}
				set(
					$current,
					"first",
					lv_first_0_0,
					"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.IdOrKeyword2");
				afterParserOrEnumRuleCall();
			}
		)
	)
;


// Rule Scenario6
norm2_Scenario6 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getScenario6Access().getFirstIdOrKeyword2ParserRuleCall_0());
			}
			lv_first_0_0=norm2_IdOrKeyword2
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getScenario6Rule());
				}
				set(
					$current,
					"first",
					lv_first_0_0,
					"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.IdOrKeyword2");
				afterParserOrEnumRuleCall();
			}
		)
	)
;


// Rule Scenario6
norm3_Scenario6 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getScenario6Access().getFirstIdOrKeyword2ParserRuleCall_0());
			}
			lv_first_0_0=norm7_IdOrKeyword2
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getScenario6Rule());
				}
				set(
					$current,
					"first",
					lv_first_0_0,
					"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.IdOrKeyword2");
				afterParserOrEnumRuleCall();
			}
		)
	)
;


// Rule Scenario7
norm2_Scenario7 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				norm2_IdOrKeyword2
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getScenario7Access().getFirstIdOrKeyword2ParserRuleCall_0_0());
				}
				lv_first_0_0=norm2_IdOrKeyword2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenario7Rule());
					}
					set(
						$current,
						"first",
						lv_first_0_0,
						"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.IdOrKeyword2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				lv_second_1_0='keyword'
				{
					newLeafNode(lv_second_1_0, grammarAccess.getScenario7Access().getSecondKeywordKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScenario7Rule());
					}
					setWithLastConsumed($current, "second", lv_second_1_0, "keyword");
				}
			)
		)
	)
;


// Rule Scenario7
norm3_Scenario7 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				norm7_IdOrKeyword2
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getScenario7Access().getFirstIdOrKeyword2ParserRuleCall_0_0());
				}
				lv_first_0_0=norm7_IdOrKeyword2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenario7Rule());
					}
					set(
						$current,
						"first",
						lv_first_0_0,
						"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.IdOrKeyword2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				lv_second_1_0='keyword'
				{
					newLeafNode(lv_second_1_0, grammarAccess.getScenario7Access().getSecondKeywordKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScenario7Rule());
					}
					setWithLastConsumed($current, "second", lv_second_1_0, "keyword");
				}
			)
		)
	)
;

// Entry rule entryRuleScenario8
entryRuleScenario8 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario8Rule()); }
	iv_ruleScenario8=ruleScenario8
	{ $current=$iv_ruleScenario8.current; }
	EOF;

// Rule Scenario8
ruleScenario8 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				ruleIdOrKeyword2
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getScenario8Access().getSecondIdOrKeyword2ParserRuleCall_0_0());
				}
				lv_second_0_0=ruleIdOrKeyword2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenario8Rule());
					}
					set(
						$current,
						"second",
						lv_second_0_0,
						"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.IdOrKeyword2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='keyword'
		{
			newLeafNode(otherlv_1, grammarAccess.getScenario8Access().getKeywordKeyword_1());
		}
	)
;


// Rule Scenario8
norm3_Scenario8 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				norm7_IdOrKeyword2
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getScenario8Access().getSecondIdOrKeyword2ParserRuleCall_0_0());
				}
				lv_second_0_0=norm7_IdOrKeyword2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenario8Rule());
					}
					set(
						$current,
						"second",
						lv_second_0_0,
						"org.eclipse.xtext.parser.parameters.TwoParametersTestLanguage.IdOrKeyword2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='keyword'
		{
			newLeafNode(otherlv_1, grammarAccess.getScenario8Access().getKeywordKeyword_1());
		}
	)
;

// Entry rule entryRuleIdOrKeyword2
entryRuleIdOrKeyword2 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIdOrKeyword2Rule()); }
	iv_ruleIdOrKeyword2=ruleIdOrKeyword2
	{ $current=$iv_ruleIdOrKeyword2.current.getText(); }
	EOF;

// Rule IdOrKeyword2
ruleIdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
	}
;


// Rule IdOrKeyword2
norm1_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
	}
;


// Rule IdOrKeyword2
norm2_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
	}
;


// Rule IdOrKeyword2
norm5_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='keyword'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIdOrKeyword2Access().getKeywordKeyword_0_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
		}
	)
;


// Rule IdOrKeyword2
norm6_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='keyword'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIdOrKeyword2Access().getKeywordKeyword_0_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
		}
	)
;


// Rule IdOrKeyword2
norm7_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='keyword'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIdOrKeyword2Access().getKeywordKeyword_0_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleIdOrKeyword
entryRuleIdOrKeyword returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIdOrKeywordRule()); }
	iv_ruleIdOrKeyword=ruleIdOrKeyword
	{ $current=$iv_ruleIdOrKeyword.current.getText(); }
	EOF;

// Rule IdOrKeyword
ruleIdOrKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getIdOrKeywordAccess().getIDTerminalRuleCall_1());
	}
;


// Rule IdOrKeyword
norm1_IdOrKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='keyword'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIdOrKeywordAccess().getKeywordKeyword_0_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getIdOrKeywordAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
