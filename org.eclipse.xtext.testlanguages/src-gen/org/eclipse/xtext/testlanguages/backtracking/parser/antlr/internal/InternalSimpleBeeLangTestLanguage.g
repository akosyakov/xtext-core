/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalSimpleBeeLangTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	memoize=true;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.backtracking.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.backtracking.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.backtracking.services.SimpleBeeLangTestLanguageGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private SimpleBeeLangTestLanguageGrammarAccess grammarAccess;

    public InternalSimpleBeeLangTestLanguageParser(TokenStream input, SimpleBeeLangTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DelegateModel";
   	}

   	@Override
   	protected SimpleBeeLangTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDelegateModel
entryRuleDelegateModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelegateModelRule()); }
	iv_ruleDelegateModel=ruleDelegateModel
	{ $current=$iv_ruleDelegateModel.current; }
	EOF;

// Rule DelegateModel
ruleDelegateModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getDelegateModelAccess().getModelParserRuleCall());
	}
	this_Model_0=ruleModel
	{
		$current = $this_Model_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getUnitsUnitParserRuleCall_0_0());
				}
				lv_units_0_0=ruleUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"units",
						lv_units_0_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Unit");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_1_0());
				}
				lv_functions_1_0=ruleFunction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"functions",
						lv_functions_1_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Function");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleUnit
entryRuleUnit returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getUnitAccess().getUnorderedGroup_7()
	);
}:
	{ newCompositeNode(grammarAccess.getUnitRule()); }
	iv_ruleUnit=ruleUnit
	{ $current=$iv_ruleUnit.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule Unit
ruleUnit returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getUnitAccess().getUnorderedGroup_7()
	);
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getUnitAccess().getUnitAction_0(),
					$current);
			}
		)
		(
			(
				lv_documentation_1_0=RULE_DOCUMENTATION
				{
					newLeafNode(lv_documentation_1_0, grammarAccess.getUnitAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnitRule());
					}
					setWithLastConsumed(
						$current,
						"documentation",
						lv_documentation_1_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.DOCUMENTATION");
				}
			)
		)?
		otherlv_2='unit'
		{
			newLeafNode(otherlv_2, grammarAccess.getUnitAccess().getUnitKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getUnitAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnitRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			otherlv_4='version'
			{
				newLeafNode(otherlv_4, grammarAccess.getUnitAccess().getVersionKeyword_4_0());
			}
			(
				(
					lv_version_5_0=RULE_ID
					{
						newLeafNode(lv_version_5_0, grammarAccess.getUnitAccess().getVersionIDTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUnitRule());
						}
						setWithLastConsumed(
							$current,
							"version",
							lv_version_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			otherlv_6='implements'
			{
				newLeafNode(otherlv_6, grammarAccess.getUnitAccess().getImplementsKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUnitAccess().getImplementsSimpleTypeRefParserRuleCall_5_1_0());
					}
					lv_implements_7_0=ruleSimpleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnitRule());
						}
						add(
							$current,
							"implements",
							lv_implements_7_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.SimpleTypeRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getUnitAccess().getCommaKeyword_5_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getUnitAccess().getImplementsSimpleTypeRefParserRuleCall_5_2_1_0());
						}
						lv_implements_9_0=ruleSimpleTypeRef
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getUnitRule());
							}
							add(
								$current,
								"implements",
								lv_implements_9_0,
								"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.SimpleTypeRef");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_10='{'
		{
			newLeafNode(otherlv_10, grammarAccess.getUnitAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getUnitAccess().getUnorderedGroup_7());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 0);
					}
								({true}?=>(otherlv_12='source'
								{
									newLeafNode(otherlv_12, grammarAccess.getUnitAccess().getSourceKeyword_7_0_0());
								}
								otherlv_13=':'
								{
									newLeafNode(otherlv_13, grammarAccess.getUnitAccess().getColonKeyword_7_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getUnitAccess().getSourceLocationPathParserRuleCall_7_0_2_0());
										}
										lv_sourceLocation_14_0=rulePath
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getUnitRule());
											}
											set(
												$current,
												"sourceLocation",
												lv_sourceLocation_14_0,
												"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Path");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_15=';'
								{
									newLeafNode(otherlv_15, grammarAccess.getUnitAccess().getSemicolonKeyword_7_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnitAccess().getUnorderedGroup_7());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 1);
					}
								({true}?=>(otherlv_16='output'
								{
									newLeafNode(otherlv_16, grammarAccess.getUnitAccess().getOutputKeyword_7_1_0());
								}
								otherlv_17=':'
								{
									newLeafNode(otherlv_17, grammarAccess.getUnitAccess().getColonKeyword_7_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getUnitAccess().getOutputLocationPathParserRuleCall_7_1_2_0());
										}
										lv_outputLocation_18_0=rulePath
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getUnitRule());
											}
											set(
												$current,
												"outputLocation",
												lv_outputLocation_18_0,
												"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Path");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_19=';'
								{
									newLeafNode(otherlv_19, grammarAccess.getUnitAccess().getSemicolonKeyword_7_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnitAccess().getUnorderedGroup_7());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 2);
					}
								({true}?=>(otherlv_20='provides'
								{
									newLeafNode(otherlv_20, grammarAccess.getUnitAccess().getProvidesKeyword_7_2_0());
								}
								otherlv_21=':'
								{
									newLeafNode(otherlv_21, grammarAccess.getUnitAccess().getColonKeyword_7_2_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getUnitAccess().getProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0());
										}
										lv_providedCapabilities_22_0=ruleProvidedCapability
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getUnitRule());
											}
											add(
												$current,
												"providedCapabilities",
												lv_providedCapabilities_22_0,
												"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ProvidedCapability");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_23=';'
								{
									newLeafNode(otherlv_23, grammarAccess.getUnitAccess().getSemicolonKeyword_7_2_3());
								}
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnitAccess().getUnorderedGroup_7());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 3);
					}
								({true}?=>(otherlv_24='requires'
								{
									newLeafNode(otherlv_24, grammarAccess.getUnitAccess().getRequiresKeyword_7_3_0());
								}
								otherlv_25=':'
								{
									newLeafNode(otherlv_25, grammarAccess.getUnitAccess().getColonKeyword_7_3_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getUnitAccess().getRequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0());
										}
										lv_requiredCapabilities_26_0=ruleAliasedRequiredCapability
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getUnitRule());
											}
											add(
												$current,
												"requiredCapabilities",
												lv_requiredCapabilities_26_0,
												"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AliasedRequiredCapability");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_27=';'
								{
									newLeafNode(otherlv_27, grammarAccess.getUnitAccess().getSemicolonKeyword_7_3_3());
								}
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnitAccess().getUnorderedGroup_7());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 4)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 4);
					}
								({true}?=>(otherlv_28='requires'
								{
									newLeafNode(otherlv_28, grammarAccess.getUnitAccess().getRequiresKeyword_7_4_0());
								}
								otherlv_29='env'
								{
									newLeafNode(otherlv_29, grammarAccess.getUnitAccess().getEnvKeyword_7_4_1());
								}
								otherlv_30=':'
								{
									newLeafNode(otherlv_30, grammarAccess.getUnitAccess().getColonKeyword_7_4_2());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getUnitAccess().getMetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0());
										}
										lv_metaRequiredCapabilities_31_0=ruleRequiredCapability
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getUnitRule());
											}
											add(
												$current,
												"metaRequiredCapabilities",
												lv_metaRequiredCapabilities_31_0,
												"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.RequiredCapability");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_32=';'
								{
									newLeafNode(otherlv_32, grammarAccess.getUnitAccess().getSemicolonKeyword_7_4_4());
								}
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnitAccess().getUnorderedGroup_7());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 5)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 5);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getUnitAccess().getFunctionsFunctionParserRuleCall_7_5_0());
									}
									lv_functions_33_0=ruleFunction
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getUnitRule());
										}
										add(
											$current,
											"functions",
											lv_functions_33_0,
											"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Function");
										afterParserOrEnumRuleCall();
									}
								)
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnitAccess().getUnorderedGroup_7());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getUnitAccess().getUnorderedGroup_7());
				}
		)
		otherlv_34='}'
		{
			newLeafNode(otherlv_34, grammarAccess.getUnitAccess().getRightCurlyBracketKeyword_8());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleProvidedCapability
entryRuleProvidedCapability returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1()
	);
}:
	{ newCompositeNode(grammarAccess.getProvidedCapabilityRule()); }
	iv_ruleProvidedCapability=ruleProvidedCapability
	{ $current=$iv_ruleProvidedCapability.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule ProvidedCapability
ruleProvidedCapability returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1()
	);
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getProvidedCapabilityAccess().getProvidedCapabilityAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_nameSpace_1_0=RULE_ID
					{
						newLeafNode(lv_nameSpace_1_0, grammarAccess.getProvidedCapabilityAccess().getNameSpaceIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProvidedCapabilityRule());
						}
						setWithLastConsumed(
							$current,
							"nameSpace",
							lv_nameSpace_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			otherlv_2='unit'
			{
				newLeafNode(otherlv_2, grammarAccess.getProvidedCapabilityAccess().getUnitKeyword_1_1());
			}
		)
		(
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getProvidedCapabilityAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 0);
						}
									({true}?=>(otherlv_5='when'
									{
										newLeafNode(otherlv_5, grammarAccess.getProvidedCapabilityAccess().getWhenKeyword_2_1_0_0());
									}
									otherlv_6=':'
									{
										newLeafNode(otherlv_6, grammarAccess.getProvidedCapabilityAccess().getColonKeyword_2_1_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getProvidedCapabilityAccess().getCondExprExpressionParserRuleCall_2_1_0_2_0());
											}
											lv_condExpr_7_0=ruleExpression
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getProvidedCapabilityRule());
												}
												set(
													$current,
													"condExpr",
													lv_condExpr_7_0,
													"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_8=';'
									{
										newLeafNode(otherlv_8, grammarAccess.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_0_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 1);
						}
									({true}?=>(otherlv_9='name'
									{
										newLeafNode(otherlv_9, grammarAccess.getProvidedCapabilityAccess().getNameKeyword_2_1_1_0());
									}
									otherlv_10=':'
									{
										newLeafNode(otherlv_10, grammarAccess.getProvidedCapabilityAccess().getColonKeyword_2_1_1_1());
									}
									(
										(
											lv_name_11_0=RULE_ID
											{
												newLeafNode(lv_name_11_0, grammarAccess.getProvidedCapabilityAccess().getNameIDTerminalRuleCall_2_1_1_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getProvidedCapabilityRule());
												}
												setWithLastConsumed(
													$current,
													"name",
													lv_name_11_0,
													"org.eclipse.xtext.common.Terminals.ID");
											}
										)
									)
									otherlv_12=';'
									{
										newLeafNode(otherlv_12, grammarAccess.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_1_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 2)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 2);
						}
									({true}?=>(otherlv_13='version'
									{
										newLeafNode(otherlv_13, grammarAccess.getProvidedCapabilityAccess().getVersionKeyword_2_1_2_0());
									}
									otherlv_14=':'
									{
										newLeafNode(otherlv_14, grammarAccess.getProvidedCapabilityAccess().getColonKeyword_2_1_2_1());
									}
									(
										(
											lv_version_15_0=RULE_ID
											{
												newLeafNode(lv_version_15_0, grammarAccess.getProvidedCapabilityAccess().getVersionIDTerminalRuleCall_2_1_2_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getProvidedCapabilityRule());
												}
												setWithLastConsumed(
													$current,
													"version",
													lv_version_15_0,
													"org.eclipse.xtext.common.Terminals.ID");
											}
										)
									)
									otherlv_16=';'
									{
										newLeafNode(otherlv_16, grammarAccess.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_2_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1());
					}
			)
			otherlv_17='}'
			{
				newLeafNode(otherlv_17, grammarAccess.getProvidedCapabilityAccess().getRightCurlyBracketKeyword_2_2());
			}
		)?
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleAliasedRequiredCapability
entryRuleAliasedRequiredCapability returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1()
	);
}:
	{ newCompositeNode(grammarAccess.getAliasedRequiredCapabilityRule()); }
	iv_ruleAliasedRequiredCapability=ruleAliasedRequiredCapability
	{ $current=$iv_ruleAliasedRequiredCapability.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule AliasedRequiredCapability
ruleAliasedRequiredCapability returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1()
	);
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_nameSpace_0_0=RULE_ID
					{
						newLeafNode(lv_nameSpace_0_0, grammarAccess.getAliasedRequiredCapabilityAccess().getNameSpaceIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAliasedRequiredCapabilityRule());
						}
						setWithLastConsumed(
							$current,
							"nameSpace",
							lv_nameSpace_0_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			otherlv_1='unit'
			{
				newLeafNode(otherlv_1, grammarAccess.getAliasedRequiredCapabilityAccess().getUnitKeyword_0_1());
			}
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAliasedRequiredCapabilityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAliasedRequiredCapabilityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='as'
			{
				newLeafNode(otherlv_3, grammarAccess.getAliasedRequiredCapabilityAccess().getAsKeyword_2_0());
			}
			(
				(
					lv_alias_4_0=RULE_ID
					{
						newLeafNode(lv_alias_4_0, grammarAccess.getAliasedRequiredCapabilityAccess().getAliasIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAliasedRequiredCapabilityRule());
						}
						setWithLastConsumed(
							$current,
							"alias",
							lv_alias_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getAliasedRequiredCapabilityAccess().getLeftCurlyBracketKeyword_3_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 0);
						}
									({true}?=>(otherlv_7='when'
									{
										newLeafNode(otherlv_7, grammarAccess.getAliasedRequiredCapabilityAccess().getWhenKeyword_3_1_0_0());
									}
									otherlv_8=':'
									{
										newLeafNode(otherlv_8, grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getAliasedRequiredCapabilityAccess().getCondExprExpressionParserRuleCall_3_1_0_2_0());
											}
											lv_condExpr_9_0=ruleExpression
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getAliasedRequiredCapabilityRule());
												}
												set(
													$current,
													"condExpr",
													lv_condExpr_9_0,
													"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_10=';'
									{
										newLeafNode(otherlv_10, grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_0_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 1);
						}
									({true}?=>((
										(
											lv_greedy_11_0='greedy'
											{
												newLeafNode(lv_greedy_11_0, grammarAccess.getAliasedRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getAliasedRequiredCapabilityRule());
												}
												setWithLastConsumed($current, "greedy", lv_greedy_11_0 != null, "greedy");
											}
										)
									)
									otherlv_12=';'
									{
										newLeafNode(otherlv_12, grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 2)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 2);
						}
									({true}?=>(otherlv_13='requires-min'
									{
										newLeafNode(otherlv_13, grammarAccess.getAliasedRequiredCapabilityAccess().getRequiresMinKeyword_3_1_2_0());
									}
									otherlv_14=':'
									{
										newLeafNode(otherlv_14, grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_2_1());
									}
									(
										(
											lv_min_15_0=RULE_INT
											{
												newLeafNode(lv_min_15_0, grammarAccess.getAliasedRequiredCapabilityAccess().getMinINTTerminalRuleCall_3_1_2_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getAliasedRequiredCapabilityRule());
												}
												setWithLastConsumed(
													$current,
													"min",
													lv_min_15_0,
													"org.eclipse.xtext.common.Terminals.INT");
											}
										)
									)
									otherlv_16=';'
									{
										newLeafNode(otherlv_16, grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_2_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 3)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 3);
						}
									({true}?=>(otherlv_17='requires-max'
									{
										newLeafNode(otherlv_17, grammarAccess.getAliasedRequiredCapabilityAccess().getRequiresMaxKeyword_3_1_3_0());
									}
									otherlv_18=':'
									{
										newLeafNode(otherlv_18, grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_3_1());
									}
									(
										(
											lv_max_19_0=RULE_INT
											{
												newLeafNode(lv_max_19_0, grammarAccess.getAliasedRequiredCapabilityAccess().getMaxINTTerminalRuleCall_3_1_3_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getAliasedRequiredCapabilityRule());
												}
												setWithLastConsumed(
													$current,
													"max",
													lv_max_19_0,
													"org.eclipse.xtext.common.Terminals.INT");
											}
										)
									)
									otherlv_20=';'
									{
										newLeafNode(otherlv_20, grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_3_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 4)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 4);
						}
									({true}?=>(otherlv_21='version'
									{
										newLeafNode(otherlv_21, grammarAccess.getAliasedRequiredCapabilityAccess().getVersionKeyword_3_1_4_0());
									}
									otherlv_22=':'
									{
										newLeafNode(otherlv_22, grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_4_1());
									}
									(
										(
											lv_versionRange_23_0=RULE_ID
											{
												newLeafNode(lv_versionRange_23_0, grammarAccess.getAliasedRequiredCapabilityAccess().getVersionRangeIDTerminalRuleCall_3_1_4_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getAliasedRequiredCapabilityRule());
												}
												setWithLastConsumed(
													$current,
													"versionRange",
													lv_versionRange_23_0,
													"org.eclipse.xtext.common.Terminals.ID");
											}
										)
									)
									otherlv_24=';'
									{
										newLeafNode(otherlv_24, grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_4_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)
						)*
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
					}
			)
			otherlv_25='}'
			{
				newLeafNode(otherlv_25, grammarAccess.getAliasedRequiredCapabilityAccess().getRightCurlyBracketKeyword_3_2());
			}
		)
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleRequiredCapability
entryRuleRequiredCapability returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1()
	);
}:
	{ newCompositeNode(grammarAccess.getRequiredCapabilityRule()); }
	iv_ruleRequiredCapability=ruleRequiredCapability
	{ $current=$iv_ruleRequiredCapability.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule RequiredCapability
ruleRequiredCapability returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1()
	);
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getRequiredCapabilityAccess().getRequiredCapabilityAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_nameSpace_1_0=RULE_ID
					{
						newLeafNode(lv_nameSpace_1_0, grammarAccess.getRequiredCapabilityAccess().getNameSpaceIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRequiredCapabilityRule());
						}
						setWithLastConsumed(
							$current,
							"nameSpace",
							lv_nameSpace_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			otherlv_2='unit'
			{
				newLeafNode(otherlv_2, grammarAccess.getRequiredCapabilityAccess().getUnitKeyword_1_1());
			}
		)
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getRequiredCapabilityAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequiredCapabilityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getRequiredCapabilityAccess().getLeftCurlyBracketKeyword_3_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 0);
						}
									({true}?=>(otherlv_6='when'
									{
										newLeafNode(otherlv_6, grammarAccess.getRequiredCapabilityAccess().getWhenKeyword_3_1_0_0());
									}
									otherlv_7=':'
									{
										newLeafNode(otherlv_7, grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getRequiredCapabilityAccess().getCondExprExpressionParserRuleCall_3_1_0_2_0());
											}
											lv_condExpr_8_0=ruleExpression
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getRequiredCapabilityRule());
												}
												set(
													$current,
													"condExpr",
													lv_condExpr_8_0,
													"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_9=';'
									{
										newLeafNode(otherlv_9, grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_0_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 1);
						}
									({true}?=>((
										(
											lv_greedy_10_0='greedy'
											{
												newLeafNode(lv_greedy_10_0, grammarAccess.getRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getRequiredCapabilityRule());
												}
												setWithLastConsumed($current, "greedy", lv_greedy_10_0 != null, "greedy");
											}
										)
									)
									otherlv_11=';'
									{
										newLeafNode(otherlv_11, grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 2)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 2);
						}
									({true}?=>(otherlv_12='requires-min'
									{
										newLeafNode(otherlv_12, grammarAccess.getRequiredCapabilityAccess().getRequiresMinKeyword_3_1_2_0());
									}
									otherlv_13=':'
									{
										newLeafNode(otherlv_13, grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_2_1());
									}
									(
										(
											lv_min_14_0=RULE_INT
											{
												newLeafNode(lv_min_14_0, grammarAccess.getRequiredCapabilityAccess().getMinINTTerminalRuleCall_3_1_2_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getRequiredCapabilityRule());
												}
												setWithLastConsumed(
													$current,
													"min",
													lv_min_14_0,
													"org.eclipse.xtext.common.Terminals.INT");
											}
										)
									)
									otherlv_15=';'
									{
										newLeafNode(otherlv_15, grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_2_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 3)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 3);
						}
									({true}?=>(otherlv_16='requires-max'
									{
										newLeafNode(otherlv_16, grammarAccess.getRequiredCapabilityAccess().getRequiresMaxKeyword_3_1_3_0());
									}
									otherlv_17=':'
									{
										newLeafNode(otherlv_17, grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_3_1());
									}
									(
										(
											lv_max_18_0=RULE_INT
											{
												newLeafNode(lv_max_18_0, grammarAccess.getRequiredCapabilityAccess().getMaxINTTerminalRuleCall_3_1_3_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getRequiredCapabilityRule());
												}
												setWithLastConsumed(
													$current,
													"max",
													lv_max_18_0,
													"org.eclipse.xtext.common.Terminals.INT");
											}
										)
									)
									otherlv_19=';'
									{
										newLeafNode(otherlv_19, grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_3_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 4)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 4);
						}
									({true}?=>(otherlv_20='version'
									{
										newLeafNode(otherlv_20, grammarAccess.getRequiredCapabilityAccess().getVersionKeyword_3_1_4_0());
									}
									otherlv_21=':'
									{
										newLeafNode(otherlv_21, grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_4_1());
									}
									(
										(
											lv_versionRange_22_0=RULE_ID
											{
												newLeafNode(lv_versionRange_22_0, grammarAccess.getRequiredCapabilityAccess().getVersionRangeIDTerminalRuleCall_3_1_4_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getRequiredCapabilityRule());
												}
												setWithLastConsumed(
													$current,
													"versionRange",
													lv_versionRange_22_0,
													"org.eclipse.xtext.common.Terminals.ID");
											}
										)
									)
									otherlv_23=';'
									{
										newLeafNode(otherlv_23, grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_4_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
						}
					)
				)
						)*
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
					}
			)
			otherlv_24='}'
			{
				newLeafNode(otherlv_24, grammarAccess.getRequiredCapabilityAccess().getRightCurlyBracketKeyword_3_2());
			}
		)
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRulePath
entryRulePath returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getPathRule()); }
	iv_rulePath=rulePath
	{ $current=$iv_rulePath.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Path
rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getPathAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		(
			(
				kw='/'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getPathAccess().getSolidusKeyword_1_0());
				}
			)?
			{
				newCompositeNode(grammarAccess.getPathAccess().getQIDParserRuleCall_1_1());
			}
			this_QID_2=ruleQID
			{
				$current.merge(this_QID_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
			(
				kw='/'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getPathAccess().getSolidusKeyword_1_2_0());
				}
				{
					newCompositeNode(grammarAccess.getPathAccess().getQIDParserRuleCall_1_2_1());
				}
				this_QID_4=ruleQID
				{
					$current.merge(this_QID_4);
				}
				{
					afterParserOrEnumRuleCall();
				}
			)*
			(
				kw='/'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getPathAccess().getSolidusKeyword_1_3());
				}
			)?
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleParameterList
entryRuleParameterList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterListRule()); }
	iv_ruleParameterList=ruleParameterList
	{ $current=$iv_ruleParameterList.current; }
	EOF;

// Rule ParameterList
ruleParameterList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterListAccess().getParametersFirstParameterParserRuleCall_0_0());
				}
				lv_parameters_0_0=ruleFirstParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterListRule());
					}
					add(
						$current,
						"parameters",
						lv_parameters_0_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.FirstParameter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getParameterListAccess().getParametersFirstParameterParserRuleCall_1_1_0());
					}
					lv_parameters_2_0=ruleFirstParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParameterListRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_2_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.FirstParameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleFirstParameter
entryRuleFirstParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFirstParameterRule()); }
	iv_ruleFirstParameter=ruleFirstParameter
	{ $current=$iv_ruleFirstParameter.current; }
	EOF;

// Rule FirstParameter
ruleFirstParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFirstParameterAccess().getClosureParameterParserRuleCall_0());
		}
		this_ClosureParameter_0=ruleClosureParameter
		{
			$current = $this_ClosureParameter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFirstParameterAccess().getParameterParserRuleCall_1());
		}
		this_Parameter_1=ruleParameter
		{
			$current = $this_Parameter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getParameterAccess().getExprExpressionParserRuleCall_0());
			}
			lv_expr_0_0=ruleExpression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getParameterRule());
				}
				set(
					$current,
					"expr",
					lv_expr_0_0,
					"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleClosureParameter
entryRuleClosureParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClosureParameterRule()); }
	iv_ruleClosureParameter=ruleClosureParameter
	{ $current=$iv_ruleClosureParameter.current; }
	EOF;

// Rule ClosureParameter
ruleClosureParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getClosureParameterAccess().getExprClosureExpressionParserRuleCall_0());
			}
			lv_expr_0_0=ruleClosureExpression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getClosureParameterRule());
				}
				set(
					$current,
					"expr",
					lv_expr_0_0,
					"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ClosureExpression");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleParameterDeclaration
entryRuleParameterDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterDeclarationRule()); }
	iv_ruleParameterDeclaration=ruleParameterDeclaration
	{ $current=$iv_ruleParameterDeclaration.current; }
	EOF;

// Rule ParameterDeclaration
ruleParameterDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeTypeRefParserRuleCall_0_0());
				}
				lv_type_0_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_documentation_0_0=RULE_DOCUMENTATION
				{
					newLeafNode(lv_documentation_0_0, grammarAccess.getFunctionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"documentation",
						lv_documentation_0_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.DOCUMENTATION");
				}
			)
		)?
		(
			(
				lv_visibility_1_0=RULE_ID
				{
					newLeafNode(lv_visibility_1_0, grammarAccess.getFunctionAccess().getVisibilityIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"visibility",
						lv_visibility_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				lv_final_2_0='final'
				{
					newLeafNode(lv_final_2_0, grammarAccess.getFunctionAccess().getFinalFinalKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed($current, "final", lv_final_2_0 != null, "final");
				}
			)
		)?
		otherlv_3='function'
		{
			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getFunctionKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeTypeRefParserRuleCall_4_0());
				}
				lv_returnType_4_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"returnType",
						lv_returnType_4_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_6='('
			{
				newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_6_0());
			}
			(
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_0_0());
							}
							lv_parameters_7_0=ruleParameterDeclaration
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFunctionRule());
								}
								add(
									$current,
									"parameters",
									lv_parameters_7_0,
									"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterDeclaration");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_8=','
						{
							newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getCommaKeyword_6_1_0_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0());
								}
								lv_parameters_9_0=ruleParameterDeclaration
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getFunctionRule());
									}
									add(
										$current,
										"parameters",
										lv_parameters_9_0,
										"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterDeclaration");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
					(
						otherlv_10=','
						{
							newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getCommaKeyword_6_1_0_2_0());
						}
						(
							(
								lv_varArgs_11_0='...'
								{
									newLeafNode(lv_varArgs_11_0, grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getFunctionRule());
									}
									setWithLastConsumed($current, "varArgs", lv_varArgs_11_0 != null, "...");
								}
							)
						)
						(
							(
								{
									newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0());
								}
								lv_parameters_12_0=ruleParameterDeclaration
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getFunctionRule());
									}
									add(
										$current,
										"parameters",
										lv_parameters_12_0,
										"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterDeclaration");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)?
				)
				    |
				(
					(
						(
							lv_varArgs_13_0='...'
							{
								newLeafNode(lv_varArgs_13_0, grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getFunctionRule());
								}
								setWithLastConsumed($current, "varArgs", lv_varArgs_13_0 != null, "...");
							}
						)
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_1_1_0());
							}
							lv_parameters_14_0=ruleParameterDeclaration
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFunctionRule());
								}
								add(
									$current,
									"parameters",
									lv_parameters_14_0,
									"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterDeclaration");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)?
			otherlv_15=')'
			{
				newLeafNode(otherlv_15, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6_2());
			}
		)?
		(
			otherlv_16='when'
			{
				newLeafNode(otherlv_16, grammarAccess.getFunctionAccess().getWhenKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getGuardGuardExpressionParserRuleCall_7_1_0());
					}
					lv_guard_17_0=ruleGuardExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						set(
							$current,
							"guard",
							lv_guard_17_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.GuardExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				otherlv_18=':'
				{
					newLeafNode(otherlv_18, grammarAccess.getFunctionAccess().getColonKeyword_8_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionAccess().getFuncExprExpressionParserRuleCall_8_0_1_0());
						}
						lv_funcExpr_19_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionRule());
							}
							set(
								$current,
								"funcExpr",
								lv_funcExpr_19_0,
								"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_20=';'
				{
					newLeafNode(otherlv_20, grammarAccess.getFunctionAccess().getSemicolonKeyword_8_0_2());
				}
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getFuncExprBlockExpressionParserRuleCall_8_1_0());
					}
					lv_funcExpr_21_0=ruleBlockExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						set(
							$current,
							"funcExpr",
							lv_funcExpr_21_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.BlockExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleGuardExpression
entryRuleGuardExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuardExpressionRule()); }
	iv_ruleGuardExpression=ruleGuardExpression
	{ $current=$iv_ruleGuardExpression.current; }
	EOF;

// Rule GuardExpression
ruleGuardExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0=':'
			{
				newLeafNode(otherlv_0, grammarAccess.getGuardExpressionAccess().getColonKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGuardExpressionAccess().getGuardExprExpressionParserRuleCall_0_1_0());
					}
					lv_guardExpr_1_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGuardExpressionRule());
						}
						set(
							$current,
							"guardExpr",
							lv_guardExpr_1_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getGuardExpressionAccess().getSemicolonKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getGuardExpressionAccess().getGuardExprBlockExpressionParserRuleCall_1_0());
				}
				lv_guardExpr_3_0=ruleBlockExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGuardExpressionRule());
					}
					set(
						$current,
						"guardExpr",
						lv_guardExpr_3_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.BlockExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssignmentOperator
entryRuleAssignmentOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentOperatorRule()); }
	iv_ruleAssignmentOperator=ruleAssignmentOperator
	{ $current=$iv_ruleAssignmentOperator.current.getText(); }
	EOF;

// Rule AssignmentOperator
ruleAssignmentOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0());
		}
		    |
		kw='+='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getPlusSignEqualsSignKeyword_1());
		}
		    |
		kw='-='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusEqualsSignKeyword_2());
		}
		    |
		kw='*='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getAsteriskEqualsSignKeyword_3());
		}
		    |
		kw='/='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getSolidusEqualsSignKeyword_4());
		}
		    |
		kw='%='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getPercentSignEqualsSignKeyword_5());
		}
	)
;

// Entry rule entryRuleRelationalOperator
entryRuleRelationalOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRelationalOperatorRule()); }
	iv_ruleRelationalOperator=ruleRelationalOperator
	{ $current=$iv_ruleRelationalOperator.current.getText(); }
	EOF;

// Rule RelationalOperator
ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='~='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getTildeEqualsSignKeyword_0());
		}
		    |
		kw='=='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_1());
		}
		    |
		kw='==='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignEqualsSignKeyword_2());
		}
		    |
		kw='!='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignKeyword_3());
		}
		    |
		kw='!=='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignEqualsSignKeyword_4());
		}
		    |
		kw='>='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_5());
		}
		    |
		kw='<='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_6());
		}
		    |
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_7());
		}
		    |
		kw='<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_8());
		}
	)
;

// Entry rule entryRuleTopLevelExpression
entryRuleTopLevelExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTopLevelExpressionRule()); }
	iv_ruleTopLevelExpression=ruleTopLevelExpression
	{ $current=$iv_ruleTopLevelExpression.current; }
	EOF;

// Rule TopLevelExpression
ruleTopLevelExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTopLevelExpressionAccess().getVarDeclarationParserRuleCall_0());
		}
		this_VarDeclaration_0=ruleVarDeclaration
		{
			$current = $this_VarDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTopLevelExpressionAccess().getValDeclarationParserRuleCall_1());
		}
		this_ValDeclaration_1=ruleValDeclaration
		{
			$current = $this_ValDeclaration_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTopLevelExpressionAccess().getAssignmentExpressionParserRuleCall_2());
		}
		this_AssignmentExpression_2=ruleAssignmentExpression
		{
			$current = $this_AssignmentExpression_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall());
	}
	this_AssignmentExpression_0=ruleAssignmentExpression
	{
		$current = $this_AssignmentExpression_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleAssignmentExpression
entryRuleAssignmentExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentExpressionRule()); }
	iv_ruleAssignmentExpression=ruleAssignmentExpression
	{ $current=$iv_ruleAssignmentExpression.current; }
	EOF;

// Rule AssignmentExpression
ruleAssignmentExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getCachedExpressionParserRuleCall_0());
		}
		this_CachedExpression_0=ruleCachedExpression
		{
			$current = $this_CachedExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getFunctionNameAssignmentOperatorParserRuleCall_1_1_0());
					}
					lv_functionName_2_0=ruleAssignmentOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
						}
						set(
							$current,
							"functionName",
							lv_functionName_2_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AssignmentOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRightExprAssignmentExpressionParserRuleCall_1_2_0());
					}
					lv_rightExpr_3_0=ruleAssignmentExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
						}
						set(
							$current,
							"rightExpr",
							lv_rightExpr_3_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AssignmentExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleVarDeclaration
entryRuleVarDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarDeclarationRule()); }
	iv_ruleVarDeclaration=ruleVarDeclaration
	{ $current=$iv_ruleVarDeclaration.current; }
	EOF;

// Rule VarDeclaration
ruleVarDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVarDeclarationAccess().getDefValueAction_0(),
					$current);
			}
		)
		(
			(
				lv_final_1_0='final'
				{
					newLeafNode(lv_final_1_0, grammarAccess.getVarDeclarationAccess().getFinalFinalKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarDeclarationRule());
					}
					setWithLastConsumed($current, "final", lv_final_1_0 != null, "final");
				}
			)
		)?
		(
			(
				otherlv_2='var'
				{
					newLeafNode(otherlv_2, grammarAccess.getVarDeclarationAccess().getVarKeyword_2_0_0());
				}
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeTypeRefParserRuleCall_2_0_1_0());
						}
						lv_type_3_0=ruleTypeRef
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
							}
							set(
								$current,
								"type",
								lv_type_3_0,
								"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.TypeRef");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			(
				(
					lv_name_4_0=RULE_ID
					{
						newLeafNode(lv_name_4_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVarDeclarationRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		(
			otherlv_5='='
			{
				newLeafNode(otherlv_5, grammarAccess.getVarDeclarationAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVarDeclarationAccess().getValueExprExpressionParserRuleCall_3_1_0());
					}
					lv_valueExpr_6_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
						}
						set(
							$current,
							"valueExpr",
							lv_valueExpr_6_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleValDeclaration
entryRuleValDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValDeclarationRule()); }
	iv_ruleValDeclaration=ruleValDeclaration
	{ $current=$iv_ruleValDeclaration.current; }
	EOF;

// Rule ValDeclaration
ruleValDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getValDeclarationAccess().getDefValueAction_0(),
					$current);
			}
		)
		(
			(
				lv_final_1_0='final'
				{
					newLeafNode(lv_final_1_0, grammarAccess.getValDeclarationAccess().getFinalFinalKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValDeclarationRule());
					}
					setWithLastConsumed($current, "final", lv_final_1_0 != null, "final");
				}
			)
		)?
		(
			(
				lv_immutable_2_0='val'
				{
					newLeafNode(lv_immutable_2_0, grammarAccess.getValDeclarationAccess().getImmutableValKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValDeclarationRule());
					}
					setWithLastConsumed($current, "immutable", lv_immutable_2_0 != null, "val");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getValDeclarationAccess().getTypeTypeRefParserRuleCall_3_0());
				}
				lv_type_3_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getValDeclarationRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getValDeclarationAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5='='
		{
			newLeafNode(otherlv_5, grammarAccess.getValDeclarationAccess().getEqualsSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getValDeclarationAccess().getValueExprExpressionParserRuleCall_6_0());
				}
				lv_valueExpr_6_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getValDeclarationRule());
					}
					set(
						$current,
						"valueExpr",
						lv_valueExpr_6_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTypeRef
entryRuleTypeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRefRule()); }
	iv_ruleTypeRef=ruleTypeRef
	{ $current=$iv_ruleTypeRef.current; }
	EOF;

// Rule TypeRef
ruleTypeRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeRefAccess().getClosureTypeRefParserRuleCall_0());
		}
		this_ClosureTypeRef_0=ruleClosureTypeRef
		{
			$current = $this_ClosureTypeRef_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeRefAccess().getSimpleTypeRefParserRuleCall_1());
		}
		this_SimpleTypeRef_1=ruleSimpleTypeRef
		{
			$current = $this_SimpleTypeRef_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSimpleTypeRef
entryRuleSimpleTypeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleTypeRefRule()); }
	iv_ruleSimpleTypeRef=ruleSimpleTypeRef
	{ $current=$iv_ruleSimpleTypeRef.current; }
	EOF;

// Rule SimpleTypeRef
ruleSimpleTypeRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_rawType_0_0=RULE_ID
				{
					newLeafNode(lv_rawType_0_0, grammarAccess.getSimpleTypeRefAccess().getRawTypeIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleTypeRefRule());
					}
					setWithLastConsumed(
						$current,
						"rawType",
						lv_rawType_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_1='<'
			{
				newLeafNode(otherlv_1, grammarAccess.getSimpleTypeRefAccess().getLessThanSignKeyword_1_0());
			}
			(
				(
					lv_actualArgumentsList_2_0=RULE_ID
					{
						newLeafNode(lv_actualArgumentsList_2_0, grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSimpleTypeRefRule());
						}
						addWithLastConsumed(
							$current,
							"actualArgumentsList",
							lv_actualArgumentsList_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getSimpleTypeRefAccess().getCommaKeyword_1_2_0());
				}
				(
					(
						lv_actualArgumentsList_4_0=RULE_ID
						{
							newLeafNode(lv_actualArgumentsList_4_0, grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListIDTerminalRuleCall_1_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSimpleTypeRefRule());
							}
							addWithLastConsumed(
								$current,
								"actualArgumentsList",
								lv_actualArgumentsList_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)*
			otherlv_5='>'
			{
				newLeafNode(otherlv_5, grammarAccess.getSimpleTypeRefAccess().getGreaterThanSignKeyword_1_3());
			}
		)?
	)
;

// Entry rule entryRuleClosureTypeRef
entryRuleClosureTypeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClosureTypeRefRule()); }
	iv_ruleClosureTypeRef=ruleClosureTypeRef
	{ $current=$iv_ruleClosureTypeRef.current; }
	EOF;

// Rule ClosureTypeRef
ruleClosureTypeRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getClosureTypeRefAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				(
					(
						lv_parameterTypes_1_0=RULE_ID
						{
							newLeafNode(lv_parameterTypes_1_0, grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getClosureTypeRefRule());
							}
							addWithLastConsumed(
								$current,
								"parameterTypes",
								lv_parameterTypes_1_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					otherlv_2=','
					{
						newLeafNode(otherlv_2, grammarAccess.getClosureTypeRefAccess().getCommaKeyword_1_0_1_0());
					}
					(
						(
							lv_parameterTypes_3_0=RULE_ID
							{
								newLeafNode(lv_parameterTypes_3_0, grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_1_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getClosureTypeRefRule());
								}
								addWithLastConsumed(
									$current,
									"parameterTypes",
									lv_parameterTypes_3_0,
									"org.eclipse.xtext.common.Terminals.ID");
							}
						)
					)
				)*
				(
					otherlv_4=','
					{
						newLeafNode(otherlv_4, grammarAccess.getClosureTypeRefAccess().getCommaKeyword_1_0_2_0());
					}
					(
						(
							lv_varArgs_5_0='...'
							{
								newLeafNode(lv_varArgs_5_0, grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getClosureTypeRefRule());
								}
								setWithLastConsumed($current, "varArgs", lv_varArgs_5_0 != null, "...");
							}
						)
					)
					(
						(
							lv_parameterTypes_6_0=RULE_ID
							{
								newLeafNode(lv_parameterTypes_6_0, grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_2_2_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getClosureTypeRefRule());
								}
								addWithLastConsumed(
									$current,
									"parameterTypes",
									lv_parameterTypes_6_0,
									"org.eclipse.xtext.common.Terminals.ID");
							}
						)
					)
				)?
			)
			    |
			(
				(
					(
						lv_varArgs_7_0='...'
						{
							newLeafNode(lv_varArgs_7_0, grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getClosureTypeRefRule());
							}
							setWithLastConsumed($current, "varArgs", lv_varArgs_7_0 != null, "...");
						}
					)
				)
				(
					(
						lv_parameterTypes_8_0=RULE_ID
						{
							newLeafNode(lv_parameterTypes_8_0, grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getClosureTypeRefRule());
							}
							addWithLastConsumed(
								$current,
								"parameterTypes",
								lv_parameterTypes_8_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)?
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getClosureTypeRefAccess().getRightParenthesisKeyword_2());
		}
		otherlv_10='=>'
		{
			newLeafNode(otherlv_10, grammarAccess.getClosureTypeRefAccess().getEqualsSignGreaterThanSignKeyword_3());
		}
		(
			(
				lv_returnType_11_0=RULE_ID
				{
					newLeafNode(lv_returnType_11_0, grammarAccess.getClosureTypeRefAccess().getReturnTypeIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClosureTypeRefRule());
					}
					setWithLastConsumed(
						$current,
						"returnType",
						lv_returnType_11_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCachedExpression
entryRuleCachedExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCachedExpressionRule()); }
	iv_ruleCachedExpression=ruleCachedExpression
	{ $current=$iv_ruleCachedExpression.current; }
	EOF;

// Rule CachedExpression
ruleCachedExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElement(
						grammarAccess.getCachedExpressionAccess().getCachedExpressionAction_0_0(),
						$current);
				}
			)
			otherlv_1='cached'
			{
				newLeafNode(otherlv_1, grammarAccess.getCachedExpressionAccess().getCachedKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCachedExpressionAccess().getExprOrExpressionParserRuleCall_0_2_0());
					}
					lv_expr_2_0=ruleOrExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCachedExpressionRule());
						}
						set(
							$current,
							"expr",
							lv_expr_2_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.OrExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getCachedExpressionAccess().getOrExpressionParserRuleCall_1());
		}
		this_OrExpression_3=ruleOrExpression
		{
			$current = $this_OrExpression_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleOrExpression
entryRuleOrExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExpressionRule()); }
	iv_ruleOrExpression=ruleOrExpression
	{ $current=$iv_ruleOrExpression.current; }
	EOF;

// Rule OrExpression
ruleOrExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
		}
		this_AndExpression_0=ruleAndExpression
		{
			$current = $this_AndExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0(),
						$current);
				}
			)
			otherlv_2='||'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0());
					}
					lv_rightExpr_3_0=ruleAndExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExpressionRule());
						}
						set(
							$current,
							"rightExpr",
							lv_rightExpr_3_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AndExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpression
entryRuleAndExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionRule()); }
	iv_ruleAndExpression=ruleAndExpression
	{ $current=$iv_ruleAndExpression.current; }
	EOF;

// Rule AndExpression
ruleAndExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0());
		}
		this_RelationalExpression_0=ruleRelationalExpression
		{
			$current = $this_RelationalExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0(),
						$current);
				}
			)
			otherlv_2='&&'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprRelationalExpressionParserRuleCall_1_2_0());
					}
					lv_rightExpr_3_0=ruleRelationalExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionRule());
						}
						set(
							$current,
							"rightExpr",
							lv_rightExpr_3_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.RelationalExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleRelationalExpression
entryRuleRelationalExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationalExpressionRule()); }
	iv_ruleRelationalExpression=ruleRelationalExpression
	{ $current=$iv_ruleRelationalExpression.current; }
	EOF;

// Rule RelationalExpression
ruleRelationalExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
		}
		this_AdditiveExpression_0=ruleAdditiveExpression
		{
			$current = $this_AdditiveExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getRelationalExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getFunctionNameRelationalOperatorParserRuleCall_1_1_0());
					}
					lv_functionName_2_0=ruleRelationalOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
						}
						set(
							$current,
							"functionName",
							lv_functionName_2_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.RelationalOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0());
					}
					lv_rightExpr_3_0=ruleAdditiveExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
						}
						set(
							$current,
							"rightExpr",
							lv_rightExpr_3_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.AdditiveExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAdditiveExpression
entryRuleAdditiveExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditiveExpressionRule()); }
	iv_ruleAdditiveExpression=ruleAdditiveExpression
	{ $current=$iv_ruleAdditiveExpression.current; }
	EOF;

// Rule AdditiveExpression
ruleAdditiveExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
		}
		this_MultiplicativeExpression_0=ruleMultiplicativeExpression
		{
			$current = $this_MultiplicativeExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAdditiveExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_functionName_2_1='+'
						{
							newLeafNode(lv_functionName_2_1, grammarAccess.getAdditiveExpressionAccess().getFunctionNamePlusSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAdditiveExpressionRule());
							}
							setWithLastConsumed($current, "functionName", lv_functionName_2_1, null);
						}
						    |
						lv_functionName_2_2='-'
						{
							newLeafNode(lv_functionName_2_2, grammarAccess.getAdditiveExpressionAccess().getFunctionNameHyphenMinusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAdditiveExpressionRule());
							}
							setWithLastConsumed($current, "functionName", lv_functionName_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0());
					}
					lv_rightExpr_3_0=ruleMultiplicativeExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
						}
						set(
							$current,
							"rightExpr",
							lv_rightExpr_3_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.MultiplicativeExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplicativeExpression
entryRuleMultiplicativeExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); }
	iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression
	{ $current=$iv_ruleMultiplicativeExpression.current; }
	EOF;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getSetExpressionParserRuleCall_0());
		}
		this_SetExpression_0=ruleSetExpression
		{
			$current = $this_SetExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplicativeExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_functionName_2_1='*'
						{
							newLeafNode(lv_functionName_2_1, grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameAsteriskKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
							}
							setWithLastConsumed($current, "functionName", lv_functionName_2_1, null);
						}
						    |
						lv_functionName_2_2='/'
						{
							newLeafNode(lv_functionName_2_2, grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameSolidusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
							}
							setWithLastConsumed($current, "functionName", lv_functionName_2_2, null);
						}
						    |
						lv_functionName_2_3='%'
						{
							newLeafNode(lv_functionName_2_3, grammarAccess.getMultiplicativeExpressionAccess().getFunctionNamePercentSignKeyword_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
							}
							setWithLastConsumed($current, "functionName", lv_functionName_2_3, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExprSetExpressionParserRuleCall_1_2_0());
					}
					lv_rightExpr_3_0=ruleSetExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
						}
						set(
							$current,
							"rightExpr",
							lv_rightExpr_3_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.SetExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSetExpression
entryRuleSetExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSetExpressionRule()); }
	iv_ruleSetExpression=ruleSetExpression
	{ $current=$iv_ruleSetExpression.current; }
	EOF;

// Rule SetExpression
ruleSetExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSetExpressionAccess().getUnaryOrInfixExpressionParserRuleCall_0());
		}
		this_UnaryOrInfixExpression_0=ruleUnaryOrInfixExpression
		{
			$current = $this_UnaryOrInfixExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getSetExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_functionName_2_0='..'
					{
						newLeafNode(lv_functionName_2_0, grammarAccess.getSetExpressionAccess().getFunctionNameFullStopFullStopKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSetExpressionRule());
						}
						setWithLastConsumed($current, "functionName", lv_functionName_2_0, "..");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSetExpressionAccess().getRightExprUnaryOrInfixExpressionParserRuleCall_1_2_0());
					}
					lv_rightExpr_3_0=ruleUnaryOrInfixExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSetExpressionRule());
						}
						set(
							$current,
							"rightExpr",
							lv_rightExpr_3_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.UnaryOrInfixExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleUnaryOrInfixExpression
entryRuleUnaryOrInfixExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnaryOrInfixExpressionRule()); }
	iv_ruleUnaryOrInfixExpression=ruleUnaryOrInfixExpression
	{ $current=$iv_ruleUnaryOrInfixExpression.current; }
	EOF;

// Rule UnaryOrInfixExpression
ruleUnaryOrInfixExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getUnaryOrInfixExpressionAccess().getPostopExpressionParserRuleCall_0());
		}
		this_PostopExpression_0=rulePostopExpression
		{
			$current = $this_PostopExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getUnaryOrInfixExpressionAccess().getUnaryExpressionParserRuleCall_1());
		}
		this_UnaryExpression_1=ruleUnaryExpression
		{
			$current = $this_UnaryExpression_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getUnaryOrInfixExpressionAccess().getPreopExpressionParserRuleCall_2());
		}
		this_PreopExpression_2=rulePreopExpression
		{
			$current = $this_PreopExpression_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleUnaryExpression
entryRuleUnaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnaryExpressionRule()); }
	iv_ruleUnaryExpression=ruleUnaryExpression
	{ $current=$iv_ruleUnaryExpression.current; }
	EOF;

// Rule UnaryExpression
ruleUnaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getUnaryExpressionAccess().getUnaryOpExpressionAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_functionName_1_1='!'
					{
						newLeafNode(lv_functionName_1_1, grammarAccess.getUnaryExpressionAccess().getFunctionNameExclamationMarkKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUnaryExpressionRule());
						}
						setWithLastConsumed($current, "functionName", lv_functionName_1_1, null);
					}
					    |
					lv_functionName_1_2='-'
					{
						newLeafNode(lv_functionName_1_2, grammarAccess.getUnaryExpressionAccess().getFunctionNameHyphenMinusKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUnaryExpressionRule());
						}
						setWithLastConsumed($current, "functionName", lv_functionName_1_2, null);
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExprInfixExpressionParserRuleCall_2_0());
				}
				lv_expr_2_0=ruleInfixExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
					}
					set(
						$current,
						"expr",
						lv_expr_2_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.InfixExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePreopExpression
entryRulePreopExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPreopExpressionRule()); }
	iv_rulePreopExpression=rulePreopExpression
	{ $current=$iv_rulePreopExpression.current; }
	EOF;

// Rule PreopExpression
rulePreopExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getPreopExpressionAccess().getUnaryPreOpExpressionAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_functionName_1_1='++'
					{
						newLeafNode(lv_functionName_1_1, grammarAccess.getPreopExpressionAccess().getFunctionNamePlusSignPlusSignKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPreopExpressionRule());
						}
						setWithLastConsumed($current, "functionName", lv_functionName_1_1, null);
					}
					    |
					lv_functionName_1_2='--'
					{
						newLeafNode(lv_functionName_1_2, grammarAccess.getPreopExpressionAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPreopExpressionRule());
						}
						setWithLastConsumed($current, "functionName", lv_functionName_1_2, null);
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPreopExpressionAccess().getExprInfixExpressionParserRuleCall_2_0());
				}
				lv_expr_2_0=ruleInfixExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPreopExpressionRule());
					}
					set(
						$current,
						"expr",
						lv_expr_2_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.InfixExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePostopExpression
entryRulePostopExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPostopExpressionRule()); }
	iv_rulePostopExpression=rulePostopExpression
	{ $current=$iv_rulePostopExpression.current; }
	EOF;

// Rule PostopExpression
rulePostopExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPostopExpressionAccess().getInfixExpressionParserRuleCall_0());
		}
		this_InfixExpression_0=ruleInfixExpression
		{
			$current = $this_InfixExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPostopExpressionAccess().getUnaryPostOpExpressionExprAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_functionName_2_1='--'
						{
							newLeafNode(lv_functionName_2_1, grammarAccess.getPostopExpressionAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPostopExpressionRule());
							}
							setWithLastConsumed($current, "functionName", lv_functionName_2_1, null);
						}
						    |
						lv_functionName_2_2='++'
						{
							newLeafNode(lv_functionName_2_2, grammarAccess.getPostopExpressionAccess().getFunctionNamePlusSignPlusSignKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPostopExpressionRule());
							}
							setWithLastConsumed($current, "functionName", lv_functionName_2_2, null);
						}
					)
				)
			)
		)?
	)
;

// Entry rule entryRuleInfixExpression
entryRuleInfixExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInfixExpressionRule()); }
	iv_ruleInfixExpression=ruleInfixExpression
	{ $current=$iv_ruleInfixExpression.current; }
	EOF;

// Rule InfixExpression
ruleInfixExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getInfixExpressionAccess().getCallExpressionParserRuleCall_0());
		}
		this_CallExpression_0=ruleCallExpression
		{
			$current = $this_CallExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getInfixExpressionAccess().getCallFeatureFuncExprAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='.'
				{
					newLeafNode(otherlv_2, grammarAccess.getInfixExpressionAccess().getFullStopKeyword_1_0_1());
				}
				(
					(
						lv_name_3_0=RULE_ID
						{
							newLeafNode(lv_name_3_0, grammarAccess.getInfixExpressionAccess().getNameIDTerminalRuleCall_1_0_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInfixExpressionRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				otherlv_4='('
				{
					newLeafNode(otherlv_4, grammarAccess.getInfixExpressionAccess().getLeftParenthesisKeyword_1_0_3());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getInfixExpressionAccess().getParameterListParameterListParserRuleCall_1_0_4_0());
						}
						lv_parameterList_5_0=ruleParameterList
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getInfixExpressionRule());
							}
							set(
								$current,
								"parameterList",
								lv_parameterList_5_0,
								"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterList");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				otherlv_6=')'
				{
					newLeafNode(otherlv_6, grammarAccess.getInfixExpressionAccess().getRightParenthesisKeyword_1_0_5());
				}
			)
			    |
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getInfixExpressionAccess().getAtExpressionObjExprAction_1_1_0(),
							$current);
					}
				)
				otherlv_8='['
				{
					newLeafNode(otherlv_8, grammarAccess.getInfixExpressionAccess().getLeftSquareBracketKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getInfixExpressionAccess().getIndexExprExpressionParserRuleCall_1_1_2_0());
						}
						lv_indexExpr_9_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getInfixExpressionRule());
							}
							set(
								$current,
								"indexExpr",
								lv_indexExpr_9_0,
								"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_10=']'
				{
					newLeafNode(otherlv_10, grammarAccess.getInfixExpressionAccess().getRightSquareBracketKeyword_1_1_3());
				}
			)
			    |
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getInfixExpressionAccess().getFeatureExpressionObjExprAction_1_2_0(),
							$current);
					}
				)
				otherlv_12='.'
				{
					newLeafNode(otherlv_12, grammarAccess.getInfixExpressionAccess().getFullStopKeyword_1_2_1());
				}
				(
					(
						lv_featureName_13_0=RULE_ID
						{
							newLeafNode(lv_featureName_13_0, grammarAccess.getInfixExpressionAccess().getFeatureNameIDTerminalRuleCall_1_2_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInfixExpressionRule());
							}
							setWithLastConsumed(
								$current,
								"featureName",
								lv_featureName_13_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleCallExpression
entryRuleCallExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallExpressionRule()); }
	iv_ruleCallExpression=ruleCallExpression
	{ $current=$iv_ruleCallExpression.current; }
	EOF;

// Rule CallExpression
ruleCallExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getCallExpressionAccess().getPrimaryExpressionParserRuleCall_0());
		}
		this_PrimaryExpression_0=rulePrimaryExpression
		{
			$current = $this_PrimaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getCallExpressionAccess().getCallFunctionFuncExprAction_1_0(),
						$current);
				}
			)
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getCallExpressionAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCallExpressionAccess().getParameterListParameterListParserRuleCall_1_2_0());
					}
					lv_parameterList_3_0=ruleParameterList
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCallExpressionRule());
						}
						set(
							$current,
							"parameterList",
							lv_parameterList_3_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterList");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getCallExpressionAccess().getRightParenthesisKeyword_1_3());
			}
		)*
	)
;

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	iv_rulePrimaryExpression=rulePrimaryExpression
	{ $current=$iv_rulePrimaryExpression.current; }
	EOF;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_0());
		}
		this_FeatureCall_0=ruleFeatureCall
		{
			$current = $this_FeatureCall_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstructorCallExpressionParserRuleCall_1());
		}
		this_ConstructorCallExpression_1=ruleConstructorCallExpression
		{
			$current = $this_ConstructorCallExpression_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueParserRuleCall_2());
		}
		this_Value_2=ruleValue
		{
			$current = $this_Value_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3());
		}
		this_Literal_3=ruleLiteral
		{
			$current = $this_Literal_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getKeywordVariablesParserRuleCall_4());
		}
		this_KeywordVariables_4=ruleKeywordVariables
		{
			$current = $this_KeywordVariables_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParanthesizedExpressionParserRuleCall_5());
		}
		this_ParanthesizedExpression_5=ruleParanthesizedExpression
		{
			$current = $this_ParanthesizedExpression_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBlockExpressionParserRuleCall_6());
		}
		this_BlockExpression_6=ruleBlockExpression
		{
			$current = $this_BlockExpression_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getWithExpressionParserRuleCall_7());
		}
		this_WithExpression_7=ruleWithExpression
		{
			$current = $this_WithExpression_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getWithContextExpressionParserRuleCall_8());
		}
		this_WithContextExpression_8=ruleWithContextExpression
		{
			$current = $this_WithContextExpression_8.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleWithExpression
entryRuleWithExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWithExpressionRule()); }
	iv_ruleWithExpression=ruleWithExpression
	{ $current=$iv_ruleWithExpression.current; }
	EOF;

// Rule WithExpression
ruleWithExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='with'
		{
			newLeafNode(otherlv_0, grammarAccess.getWithExpressionAccess().getWithKeyword_0());
		}
		(
			(
				(
					lv_referencedAdvice_1_0=RULE_ID
					{
						newLeafNode(lv_referencedAdvice_1_0, grammarAccess.getWithExpressionAccess().getReferencedAdviceIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getWithExpressionRule());
						}
						addWithLastConsumed(
							$current,
							"referencedAdvice",
							lv_referencedAdvice_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getWithExpressionAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						lv_referencedAdvice_3_0=RULE_ID
						{
							newLeafNode(lv_referencedAdvice_3_0, grammarAccess.getWithExpressionAccess().getReferencedAdviceIDTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getWithExpressionRule());
							}
							addWithLastConsumed(
								$current,
								"referencedAdvice",
								lv_referencedAdvice_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)*
		)?
		(
			(
				otherlv_4=':'
				{
					newLeafNode(otherlv_4, grammarAccess.getWithExpressionAccess().getColonKeyword_2_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getWithExpressionAccess().getFuncExprExpressionParserRuleCall_2_0_1_0());
						}
						lv_funcExpr_5_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getWithExpressionRule());
							}
							set(
								$current,
								"funcExpr",
								lv_funcExpr_5_0,
								"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_6='{'
				{
					newLeafNode(otherlv_6, grammarAccess.getWithExpressionAccess().getLeftCurlyBracketKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getWithExpressionAccess().getFuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0());
						}
						lv_funcExpr_7_0=ruleBlockExpressionWithoutBrackets
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getWithExpressionRule());
							}
							set(
								$current,
								"funcExpr",
								lv_funcExpr_7_0,
								"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.BlockExpressionWithoutBrackets");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_8='}'
				{
					newLeafNode(otherlv_8, grammarAccess.getWithExpressionAccess().getRightCurlyBracketKeyword_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleWithContextExpression
entryRuleWithContextExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWithContextExpressionRule()); }
	iv_ruleWithContextExpression=ruleWithContextExpression
	{ $current=$iv_ruleWithContextExpression.current; }
	EOF;

// Rule WithContextExpression
ruleWithContextExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='with'
		{
			newLeafNode(otherlv_0, grammarAccess.getWithContextExpressionAccess().getWithKeyword_0());
		}
		otherlv_1='context'
		{
			newLeafNode(otherlv_1, grammarAccess.getWithContextExpressionAccess().getContextKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWithContextExpressionAccess().getExprExpressionParserRuleCall_2_0());
				}
				lv_expr_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWithContextExpressionRule());
					}
					set(
						$current,
						"expr",
						lv_expr_2_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='as'
			{
				newLeafNode(otherlv_3, grammarAccess.getWithContextExpressionAccess().getAsKeyword_3_0());
			}
			(
				(
					lv_alias_4_0=RULE_ID
					{
						newLeafNode(lv_alias_4_0, grammarAccess.getWithContextExpressionAccess().getAliasIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getWithContextExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"alias",
							lv_alias_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getWithContextExpressionAccess().getContextBlockBlockExpressionParserRuleCall_4_0());
				}
				lv_contextBlock_5_0=ruleBlockExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWithContextExpressionRule());
					}
					set(
						$current,
						"contextBlock",
						lv_contextBlock_5_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.BlockExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBlockExpression
entryRuleBlockExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlockExpressionRule()); }
	iv_ruleBlockExpression=ruleBlockExpression
	{ $current=$iv_ruleBlockExpression.current; }
	EOF;

// Rule BlockExpression
ruleBlockExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getBlockExpressionAccess().getChainedExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getBlockExpressionAccess().getExpressionsTopLevelExpressionParserRuleCall_2_0_0());
					}
					lv_expressions_2_0=ruleTopLevelExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBlockExpressionRule());
						}
						add(
							$current,
							"expressions",
							lv_expressions_2_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.TopLevelExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1());
			}
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getValueAccess().getVariableExpressionAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleKeywordVariables
entryRuleKeywordVariables returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeywordVariablesRule()); }
	iv_ruleKeywordVariables=ruleKeywordVariables
	{ $current=$iv_ruleKeywordVariables.current; }
	EOF;

// Rule KeywordVariables
ruleKeywordVariables returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getKeywordVariablesAccess().getVariableExpressionAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_name_1_1='input'
					{
						newLeafNode(lv_name_1_1, grammarAccess.getKeywordVariablesAccess().getNameInputKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getKeywordVariablesRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_1, null);
					}
					    |
					lv_name_1_2='output'
					{
						newLeafNode(lv_name_1_2, grammarAccess.getKeywordVariablesAccess().getNameOutputKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getKeywordVariablesRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_2, null);
					}
					    |
					lv_name_1_3='source'
					{
						newLeafNode(lv_name_1_3, grammarAccess.getKeywordVariablesAccess().getNameSourceKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getKeywordVariablesRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_3, null);
					}
					    |
					lv_name_1_4='properties'
					{
						newLeafNode(lv_name_1_4, grammarAccess.getKeywordVariablesAccess().getNamePropertiesKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getKeywordVariablesRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_4, null);
					}
					    |
					lv_name_1_5='builder'
					{
						newLeafNode(lv_name_1_5, grammarAccess.getKeywordVariablesAccess().getNameBuilderKeyword_1_0_4());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getKeywordVariablesRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_5, null);
					}
					    |
					lv_name_1_6='unit'
					{
						newLeafNode(lv_name_1_6, grammarAccess.getKeywordVariablesAccess().getNameUnitKeyword_1_0_5());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getKeywordVariablesRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_6, null);
					}
					    |
					lv_name_1_7='this'
					{
						newLeafNode(lv_name_1_7, grammarAccess.getKeywordVariablesAccess().getNameThisKeyword_1_0_6());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getKeywordVariablesRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_7, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleFeatureCall
entryRuleFeatureCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureCallRule()); }
	iv_ruleFeatureCall=ruleFeatureCall
	{ $current=$iv_ruleFeatureCall.current; }
	EOF;

// Rule FeatureCall
ruleFeatureCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getFeatureCallAccess().getOperationCallParserRuleCall());
	}
	this_OperationCall_0=ruleOperationCall
	{
		$current = $this_OperationCall_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOperationCall
entryRuleOperationCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationCallRule()); }
	iv_ruleOperationCall=ruleOperationCall
	{ $current=$iv_ruleOperationCall.current; }
	EOF;

// Rule OperationCall
ruleOperationCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getOperationCallAccess().getCallNamedFunctionAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOperationCallAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationCallRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOperationCallAccess().getParameterListParameterListParserRuleCall_3_0());
				}
				lv_parameterList_3_0=ruleParameterList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperationCallRule());
					}
					set(
						$current,
						"parameterList",
						lv_parameterList_3_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterList");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleConstructorCallExpression
entryRuleConstructorCallExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstructorCallExpressionRule()); }
	iv_ruleConstructorCallExpression=ruleConstructorCallExpression
	{ $current=$iv_ruleConstructorCallExpression.current; }
	EOF;

// Rule ConstructorCallExpression
ruleConstructorCallExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getConstructorCallExpressionAccess().getCreateExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='new'
		{
			newLeafNode(otherlv_1, grammarAccess.getConstructorCallExpressionAccess().getNewKeyword_1());
		}
		(
			(
				lv_typeExpr_2_0=RULE_ID
				{
					newLeafNode(lv_typeExpr_2_0, grammarAccess.getConstructorCallExpressionAccess().getTypeExprIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstructorCallExpressionRule());
					}
					setWithLastConsumed(
						$current,
						"typeExpr",
						lv_typeExpr_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getConstructorCallExpressionAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConstructorCallExpressionAccess().getParameterListParameterListParserRuleCall_3_1_0());
					}
					lv_parameterList_4_0=ruleParameterList
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConstructorCallExpressionRule());
						}
						set(
							$current,
							"parameterList",
							lv_parameterList_4_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterList");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getConstructorCallExpressionAccess().getRightParenthesisKeyword_3_2());
			}
		)?
		(
			otherlv_6='as'
			{
				newLeafNode(otherlv_6, grammarAccess.getConstructorCallExpressionAccess().getAsKeyword_4_0());
			}
			(
				(
					lv_alias_7_0=RULE_ID
					{
						newLeafNode(lv_alias_7_0, grammarAccess.getConstructorCallExpressionAccess().getAliasIDTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConstructorCallExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"alias",
							lv_alias_7_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getConstructorCallExpressionAccess().getContextBlockInitializationBlockExpressionParserRuleCall_5_0());
				}
				lv_contextBlock_8_0=ruleInitializationBlockExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstructorCallExpressionRule());
					}
					set(
						$current,
						"contextBlock",
						lv_contextBlock_8_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.InitializationBlockExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleInitializationBlockExpression
entryRuleInitializationBlockExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitializationBlockExpressionRule()); }
	iv_ruleInitializationBlockExpression=ruleInitializationBlockExpression
	{ $current=$iv_ruleInitializationBlockExpression.current; }
	EOF;

// Rule InitializationBlockExpression
ruleInitializationBlockExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getInitializationBlockExpressionAccess().getChainedExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getInitializationBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInitializationBlockExpressionAccess().getExpressionsInitializationExpressionParserRuleCall_2_0());
				}
				lv_expressions_2_0=ruleInitializationExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitializationBlockExpressionRule());
					}
					add(
						$current,
						"expressions",
						lv_expressions_2_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.InitializationExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getInitializationBlockExpressionAccess().getSemicolonKeyword_3());
		}
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getInitializationBlockExpressionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInitializationExpression
entryRuleInitializationExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitializationExpressionRule()); }
	iv_ruleInitializationExpression=ruleInitializationExpression
	{ $current=$iv_ruleInitializationExpression.current; }
	EOF;

// Rule InitializationExpression
ruleInitializationExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getInitializationExpressionAccess().getAssignmentExpressionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInitializationExpressionAccess().getLeftExprFeatureOfThisParserRuleCall_1_0());
				}
				lv_leftExpr_1_0=ruleFeatureOfThis
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitializationExpressionRule());
					}
					set(
						$current,
						"leftExpr",
						lv_leftExpr_1_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.FeatureOfThis");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_functionName_2_0=':'
				{
					newLeafNode(lv_functionName_2_0, grammarAccess.getInitializationExpressionAccess().getFunctionNameColonKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInitializationExpressionRule());
					}
					setWithLastConsumed($current, "functionName", lv_functionName_2_0, ":");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInitializationExpressionAccess().getRightExprExpressionParserRuleCall_3_0());
				}
				lv_rightExpr_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitializationExpressionRule());
					}
					set(
						$current,
						"rightExpr",
						lv_rightExpr_3_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFeatureOfThis
entryRuleFeatureOfThis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureOfThisRule()); }
	iv_ruleFeatureOfThis=ruleFeatureOfThis
	{ $current=$iv_ruleFeatureOfThis.current; }
	EOF;

// Rule FeatureOfThis
ruleFeatureOfThis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getFeatureOfThisAccess().getFeatureExpressionAction_0(),
					$current);
			}
		)
		(
			(
				lv_featureName_1_0=RULE_ID
				{
					newLeafNode(lv_featureName_1_0, grammarAccess.getFeatureOfThisAccess().getFeatureNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureOfThisRule());
					}
					setWithLastConsumed(
						$current,
						"featureName",
						lv_featureName_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	iv_ruleLiteral=ruleLiteral
	{ $current=$iv_ruleLiteral.current; }
	EOF;

// Rule Literal
ruleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getValueLiteralParserRuleCall_0());
		}
		this_ValueLiteral_0=ruleValueLiteral
		{
			$current = $this_ValueLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getLiteralFunctionParserRuleCall_1());
		}
		this_LiteralFunction_1=ruleLiteralFunction
		{
			$current = $this_LiteralFunction_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLiteralFunction
entryRuleLiteralFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralFunctionRule()); }
	iv_ruleLiteralFunction=ruleLiteralFunction
	{ $current=$iv_ruleLiteralFunction.current; }
	EOF;

// Rule LiteralFunction
ruleLiteralFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getLiteralFunctionAccess().getLeftCurlyBracketKeyword_0());
		}
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralFunctionAccess().getClosureExpressionParserRuleCall_1());
		}
		this_ClosureExpression_1=ruleClosureExpression
		{
			$current = $this_ClosureExpression_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getLiteralFunctionAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleClosureExpression
entryRuleClosureExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClosureExpressionRule()); }
	iv_ruleClosureExpression=ruleClosureExpression
	{ $current=$iv_ruleClosureExpression.current; }
	EOF;

// Rule ClosureExpression
ruleClosureExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getClosureExpressionAccess().getFunctionAction_0(),
					$current);
			}
		)
		(
			otherlv_1='<'
			{
				newLeafNode(otherlv_1, grammarAccess.getClosureExpressionAccess().getLessThanSignKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClosureExpressionAccess().getReturnTypeTypeRefParserRuleCall_1_1_0());
					}
					lv_returnType_2_0=ruleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClosureExpressionRule());
						}
						set(
							$current,
							"returnType",
							lv_returnType_2_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.TypeRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3='>'
			{
				newLeafNode(otherlv_3, grammarAccess.getClosureExpressionAccess().getGreaterThanSignKeyword_1_2());
			}
		)?
		(
			(
				(
					otherlv_4='|'
					{
						newLeafNode(otherlv_4, grammarAccess.getClosureExpressionAccess().getVerticalLineKeyword_2_0_0());
					}
				)?
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_0_0());
							}
							lv_parameters_5_0=ruleParameterDeclaration
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getClosureExpressionRule());
								}
								add(
									$current,
									"parameters",
									lv_parameters_5_0,
									"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterDeclaration");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_6=','
						{
							newLeafNode(otherlv_6, grammarAccess.getClosureExpressionAccess().getCommaKeyword_2_0_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0());
								}
								lv_parameters_7_0=ruleParameterDeclaration
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getClosureExpressionRule());
									}
									add(
										$current,
										"parameters",
										lv_parameters_7_0,
										"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterDeclaration");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
					(
						otherlv_8=','
						{
							newLeafNode(otherlv_8, grammarAccess.getClosureExpressionAccess().getCommaKeyword_2_0_1_2_0());
						}
						(
							(
								lv_varArgs_9_0='...'
								{
									newLeafNode(lv_varArgs_9_0, grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getClosureExpressionRule());
									}
									setWithLastConsumed($current, "varArgs", lv_varArgs_9_0 != null, "...");
								}
							)
						)
						(
							(
								{
									newCompositeNode(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0());
								}
								lv_parameters_10_0=ruleParameterDeclaration
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getClosureExpressionRule());
									}
									add(
										$current,
										"parameters",
										lv_parameters_10_0,
										"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterDeclaration");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)?
				)
			)
			    |
			(
				(
					(
						lv_varArgs_11_0='...'
						{
							newLeafNode(lv_varArgs_11_0, grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getClosureExpressionRule());
							}
							setWithLastConsumed($current, "varArgs", lv_varArgs_11_0 != null, "...");
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_1_1_0());
						}
						lv_parameters_12_0=ruleParameterDeclaration
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClosureExpressionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_12_0,
								"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.ParameterDeclaration");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)?
		otherlv_13='|'
		{
			newLeafNode(otherlv_13, grammarAccess.getClosureExpressionAccess().getVerticalLineKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClosureExpressionAccess().getFuncExprOneOrManyExpressionsParserRuleCall_4_0());
				}
				lv_funcExpr_14_0=ruleOneOrManyExpressions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClosureExpressionRule());
					}
					set(
						$current,
						"funcExpr",
						lv_funcExpr_14_0,
						"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.OneOrManyExpressions");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOneOrManyExpressions
entryRuleOneOrManyExpressions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOneOrManyExpressionsRule()); }
	iv_ruleOneOrManyExpressions=ruleOneOrManyExpressions
	{ $current=$iv_ruleOneOrManyExpressions.current; }
	EOF;

// Rule OneOrManyExpressions
ruleOneOrManyExpressions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOneOrManyExpressionsAccess().getBlockExpressionWithoutBracketsParserRuleCall_0());
		}
		this_BlockExpressionWithoutBrackets_0=ruleBlockExpressionWithoutBrackets
		{
			$current = $this_BlockExpressionWithoutBrackets_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOneOrManyExpressionsAccess().getExpressionParserRuleCall_1());
		}
		this_Expression_1=ruleExpression
		{
			$current = $this_Expression_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBlockExpressionWithoutBrackets
entryRuleBlockExpressionWithoutBrackets returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlockExpressionWithoutBracketsRule()); }
	iv_ruleBlockExpressionWithoutBrackets=ruleBlockExpressionWithoutBrackets
	{ $current=$iv_ruleBlockExpressionWithoutBrackets.current; }
	EOF;

// Rule BlockExpressionWithoutBrackets
ruleBlockExpressionWithoutBrackets returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getBlockExpressionWithoutBracketsAccess().getChainedExpressionAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getBlockExpressionWithoutBracketsAccess().getExpressionsTopLevelExpressionParserRuleCall_1_0_0());
					}
					lv_expressions_1_0=ruleTopLevelExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBlockExpressionWithoutBracketsRule());
						}
						add(
							$current,
							"expressions",
							lv_expressions_1_0,
							"org.eclipse.xtext.testlanguages.backtracking.BeeLangTestLanguage.TopLevelExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getBlockExpressionWithoutBracketsAccess().getSemicolonKeyword_1_1());
			}
		)+
	)
;

// Entry rule entryRuleValueLiteral
entryRuleValueLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueLiteralRule()); }
	iv_ruleValueLiteral=ruleValueLiteral
	{ $current=$iv_ruleValueLiteral.current; }
	EOF;

// Rule ValueLiteral
ruleValueLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getValueLiteralAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getValueLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleParanthesizedExpression
entryRuleParanthesizedExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParanthesizedExpressionRule()); }
	iv_ruleParanthesizedExpression=ruleParanthesizedExpression
	{ $current=$iv_ruleParanthesizedExpression.current; }
	EOF;

// Rule ParanthesizedExpression
ruleParanthesizedExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParanthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		}
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getParanthesizedExpressionAccess().getExpressionParserRuleCall_1());
		}
		this_Expression_1=ruleExpression
		{
			$current = $this_Expression_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParanthesizedExpressionAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleQID
entryRuleQID returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getQIDRule()); }
	iv_ruleQID=ruleQID
	{ $current=$iv_ruleQID.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule QID
ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0());
		}
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getQIDAccess().getINTTerminalRuleCall_1_0());
			}
			    |
			this_HEX_2=RULE_HEX
			{
				$current.merge(this_HEX_2);
			}
			{
				newLeafNode(this_HEX_2, grammarAccess.getQIDAccess().getHEXTerminalRuleCall_1_1());
			}
			    |
			this_ID_3=RULE_ID
			{
				$current.merge(this_ID_3);
			}
			{
				newLeafNode(this_ID_3, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_2());
			}
		)*
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_2_0());
			}
			this_ID_5=RULE_ID
			{
				$current.merge(this_ID_5);
			}
			{
				newLeafNode(this_ID_5, grammarAccess.getQIDAccess().getIDTerminalRuleCall_2_1());
			}
			(
				this_INT_6=RULE_INT
				{
					$current.merge(this_INT_6);
				}
				{
					newLeafNode(this_INT_6, grammarAccess.getQIDAccess().getINTTerminalRuleCall_2_2_0());
				}
				    |
				this_HEX_7=RULE_HEX
				{
					$current.merge(this_HEX_7);
				}
				{
					newLeafNode(this_HEX_7, grammarAccess.getQIDAccess().getHEXTerminalRuleCall_2_2_1());
				}
				    |
				this_ID_8=RULE_ID
				{
					$current.merge(this_ID_8);
				}
				{
					newLeafNode(this_ID_8, grammarAccess.getQIDAccess().getIDTerminalRuleCall_2_2_2());
				}
			)*
		)*
	)
;
finally {
	myHiddenTokenState.restore();
}

RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
