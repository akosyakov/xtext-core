/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalEcoreReferenceTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.metamodelreferencing.tests.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.metamodelreferencing.tests.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.metamodelreferencing.tests.services.EcoreReferenceTestLanguageGrammarAccess;

}

@parser::members {

 	private EcoreReferenceTestLanguageGrammarAccess grammarAccess;

    public InternalEcoreReferenceTestLanguageParser(TokenStream input, EcoreReferenceTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected EcoreReferenceTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

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
					newCompositeNode(grammarAccess.getModelAccess().getExtendsExtendsNsURIEObjectParserRuleCall_0_0());
				}
				lv_extends_0_0=ruleExtendsNsURIEObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"extends",
						lv_extends_0_0,
						"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsNsURIEObject");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getExtendsExtendsPluginEObjectParserRuleCall_1_0());
				}
				lv_extends_1_0=ruleExtendsPluginEObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"extends",
						lv_extends_1_0,
						"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsPluginEObject");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getExtendsExtendsResourceEObjectParserRuleCall_2_0());
				}
				lv_extends_2_0=ruleExtendsResourceEObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"extends",
						lv_extends_2_0,
						"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsResourceEObject");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExtendsNsURIEObject
entryRuleExtendsNsURIEObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtendsNsURIEObjectRule()); }
	iv_ruleExtendsNsURIEObject=ruleExtendsNsURIEObject
	{ $current=$iv_ruleExtendsNsURIEObject.current; }
	EOF;

// Rule ExtendsNsURIEObject
ruleExtendsNsURIEObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ExtendsNsURIEObject'
		{
			newLeafNode(otherlv_0, grammarAccess.getExtendsNsURIEObjectAccess().getExtendsNsURIEObjectKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExtendsNsURIEObjectAccess().getNameValidIDParserRuleCall_1_0());
				}
				lv_name_1_0=ruleValidID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExtendsNsURIEObjectRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ValidID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_2='EObject'
				{
					newLeafNode(otherlv_2, grammarAccess.getExtendsNsURIEObjectAccess().getEObjectKeyword_2_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsNsURIEObjectRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getExtendsNsURIEObjectAccess().getEObjectReference1EObjectCrossReference_2_0_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_4='ExtendsNsURIEObject'
				{
					newLeafNode(otherlv_4, grammarAccess.getExtendsNsURIEObjectAccess().getExtendsNsURIEObjectKeyword_2_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsNsURIEObjectRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getExtendsNsURIEObjectAccess().getEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_6='ExtendsPluginEObject'
				{
					newLeafNode(otherlv_6, grammarAccess.getExtendsNsURIEObjectAccess().getExtendsPluginEObjectKeyword_2_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsNsURIEObjectRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getExtendsNsURIEObjectAccess().getEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_8='ExtendsResourceEObject'
				{
					newLeafNode(otherlv_8, grammarAccess.getExtendsNsURIEObjectAccess().getExtendsResourceEObjectKeyword_2_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsNsURIEObjectRule());
							}
						}
						otherlv_9=RULE_ID
						{
							newLeafNode(otherlv_9, grammarAccess.getExtendsNsURIEObjectAccess().getEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0());
						}
					)
				)
			)
		)
		(
			otherlv_10='ExtendsPluginEObject'
			{
				newLeafNode(otherlv_10, grammarAccess.getExtendsNsURIEObjectAccess().getExtendsPluginEObjectKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsNsURIEObjectRule());
						}
					}
					otherlv_11=RULE_ID
					{
						newLeafNode(otherlv_11, grammarAccess.getExtendsNsURIEObjectAccess().getEAttributeReferenceMyEAttributeCrossReference_3_1_0());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsNsURIEObjectRule());
						}
					}
					otherlv_12=RULE_ID
					{
						newLeafNode(otherlv_12, grammarAccess.getExtendsNsURIEObjectAccess().getEObjectReference2ExtendsNsURIEObjectCrossReference_3_2_0());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsNsURIEObjectRule());
						}
					}
					otherlv_13=RULE_ID
					{
						newLeafNode(otherlv_13, grammarAccess.getExtendsNsURIEObjectAccess().getEObjectReference3ExtendsPluginEObjectCrossReference_3_3_0());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsNsURIEObjectRule());
						}
					}
					otherlv_14=RULE_ID
					{
						newLeafNode(otherlv_14, grammarAccess.getExtendsNsURIEObjectAccess().getEObjectReference4ExtendsResourceEObjectCrossReference_3_4_0());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsNsURIEObjectAccess().getEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_5_0());
					}
					lv_eObjectContainment_15_0=ruleExtendsNsURIEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsNsURIEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_15_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsNsURIEObject");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsNsURIEObjectAccess().getEObjectContainmentExtendsPluginEObjectParserRuleCall_3_6_0());
					}
					lv_eObjectContainment_16_0=ruleExtendsPluginEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsNsURIEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_16_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsPluginEObject");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsNsURIEObjectAccess().getEObjectContainmentExtendsResourceEObjectParserRuleCall_3_7_0());
					}
					lv_eObjectContainment_17_0=ruleExtendsResourceEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsNsURIEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_17_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsResourceEObject");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsNsURIEObjectAccess().getEObjectContainmentEObjectParserRuleCall_3_8_0());
					}
					lv_eObjectContainment_18_0=ruleEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsNsURIEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_18_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.EObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsNsURIEObjectAccess().getEObjectContainmentEAttributeParserRuleCall_3_9_0());
					}
					lv_eObjectContainment_19_0=ruleEAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsNsURIEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_19_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.EAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsNsURIEObjectAccess().getEObjectContainmentMyEAttributeParserRuleCall_3_10_0());
					}
					lv_eObjectContainment_20_0=ruleMyEAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsNsURIEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_20_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.MyEAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleMyEAttribute
entryRuleMyEAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMyEAttributeRule()); }
	iv_ruleMyEAttribute=ruleMyEAttribute
	{ $current=$iv_ruleMyEAttribute.current; }
	EOF;

// Rule MyEAttribute
ruleMyEAttribute returns [EObject current=null]
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
					grammarAccess.getMyEAttributeAccess().getMyEAttributeAction_0(),
					$current);
			}
		)
		otherlv_1='MyEAttribute'
		{
			newLeafNode(otherlv_1, grammarAccess.getMyEAttributeAccess().getMyEAttributeKeyword_1());
		}
	)
;

// Entry rule entryRuleEAttribute
entryRuleEAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEAttributeRule()); }
	iv_ruleEAttribute=ruleEAttribute
	{ $current=$iv_ruleEAttribute.current; }
	EOF;

// Rule EAttribute
ruleEAttribute returns [EObject current=null]
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
					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
					$current);
			}
		)
		otherlv_1='EAttribute'
		{
			newLeafNode(otherlv_1, grammarAccess.getEAttributeAccess().getEAttributeKeyword_1());
		}
	)
;

// Entry rule entryRuleExtendsPluginEObject
entryRuleExtendsPluginEObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtendsPluginEObjectRule()); }
	iv_ruleExtendsPluginEObject=ruleExtendsPluginEObject
	{ $current=$iv_ruleExtendsPluginEObject.current; }
	EOF;

// Rule ExtendsPluginEObject
ruleExtendsPluginEObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ExtendsPluginEObject'
		{
			newLeafNode(otherlv_0, grammarAccess.getExtendsPluginEObjectAccess().getExtendsPluginEObjectKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExtendsPluginEObjectAccess().getNameValidIDParserRuleCall_1_0());
				}
				lv_name_1_0=ruleValidID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExtendsPluginEObjectRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ValidID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_2='EObject'
				{
					newLeafNode(otherlv_2, grammarAccess.getExtendsPluginEObjectAccess().getEObjectKeyword_2_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsPluginEObjectRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getExtendsPluginEObjectAccess().getEObjectReference1EObjectCrossReference_2_0_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_4='ExtendsNsURIEObject'
				{
					newLeafNode(otherlv_4, grammarAccess.getExtendsPluginEObjectAccess().getExtendsNsURIEObjectKeyword_2_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsPluginEObjectRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getExtendsPluginEObjectAccess().getEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_6='ExtendsPluginEObject'
				{
					newLeafNode(otherlv_6, grammarAccess.getExtendsPluginEObjectAccess().getExtendsPluginEObjectKeyword_2_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsPluginEObjectRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getExtendsPluginEObjectAccess().getEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_8='ExtendsResourceEObject'
				{
					newLeafNode(otherlv_8, grammarAccess.getExtendsPluginEObjectAccess().getExtendsResourceEObjectKeyword_2_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsPluginEObjectRule());
							}
						}
						otherlv_9=RULE_ID
						{
							newLeafNode(otherlv_9, grammarAccess.getExtendsPluginEObjectAccess().getEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0());
						}
					)
				)
			)
		)
		(
			otherlv_10='ExtendsPluginEObject'
			{
				newLeafNode(otherlv_10, grammarAccess.getExtendsPluginEObjectAccess().getExtendsPluginEObjectKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsPluginEObjectRule());
						}
					}
					otherlv_11=RULE_ID
					{
						newLeafNode(otherlv_11, grammarAccess.getExtendsPluginEObjectAccess().getEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsPluginEObjectRule());
						}
					}
					otherlv_12=RULE_ID
					{
						newLeafNode(otherlv_12, grammarAccess.getExtendsPluginEObjectAccess().getEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsPluginEObjectRule());
						}
					}
					otherlv_13=RULE_ID
					{
						newLeafNode(otherlv_13, grammarAccess.getExtendsPluginEObjectAccess().getEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsPluginEObjectAccess().getEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_4_0());
					}
					lv_eObjectContainment_14_0=ruleExtendsNsURIEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsPluginEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_14_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsNsURIEObject");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsPluginEObjectAccess().getEObjectContainmentExtendsPluginEObjectParserRuleCall_3_5_0());
					}
					lv_eObjectContainment_15_0=ruleExtendsPluginEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsPluginEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_15_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsPluginEObject");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsPluginEObjectAccess().getEObjectContainmentExtendsResourceEObjectParserRuleCall_3_6_0());
					}
					lv_eObjectContainment_16_0=ruleExtendsResourceEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsPluginEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_16_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsResourceEObject");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsPluginEObjectAccess().getEObjectContainmentEObjectParserRuleCall_3_7_0());
					}
					lv_eObjectContainment_17_0=ruleEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsPluginEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_17_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.EObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsPluginEObjectAccess().getEObjectContainmentEAttributeParserRuleCall_3_8_0());
					}
					lv_eObjectContainment_18_0=ruleEAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsPluginEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_18_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.EAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsPluginEObjectAccess().getEObjectContainmentMyEAttributeParserRuleCall_3_9_0());
					}
					lv_eObjectContainment_19_0=ruleMyEAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsPluginEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_19_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.MyEAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleExtendsResourceEObject
entryRuleExtendsResourceEObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtendsResourceEObjectRule()); }
	iv_ruleExtendsResourceEObject=ruleExtendsResourceEObject
	{ $current=$iv_ruleExtendsResourceEObject.current; }
	EOF;

// Rule ExtendsResourceEObject
ruleExtendsResourceEObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ExtendsResourceEObject'
		{
			newLeafNode(otherlv_0, grammarAccess.getExtendsResourceEObjectAccess().getExtendsResourceEObjectKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExtendsResourceEObjectAccess().getNameValidIDParserRuleCall_1_0());
				}
				lv_name_1_0=ruleValidID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExtendsResourceEObjectRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ValidID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_2='EObject'
				{
					newLeafNode(otherlv_2, grammarAccess.getExtendsResourceEObjectAccess().getEObjectKeyword_2_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsResourceEObjectRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getExtendsResourceEObjectAccess().getEObjectReference1EObjectCrossReference_2_0_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_4='ExtendsNsURIEObject'
				{
					newLeafNode(otherlv_4, grammarAccess.getExtendsResourceEObjectAccess().getExtendsNsURIEObjectKeyword_2_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsResourceEObjectRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getExtendsResourceEObjectAccess().getEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_6='ExtendsPluginEObject'
				{
					newLeafNode(otherlv_6, grammarAccess.getExtendsResourceEObjectAccess().getExtendsPluginEObjectKeyword_2_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsResourceEObjectRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getExtendsResourceEObjectAccess().getEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0());
						}
					)
				)
			)
			    |
			(
				otherlv_8='ExtendsResourceEObject'
				{
					newLeafNode(otherlv_8, grammarAccess.getExtendsResourceEObjectAccess().getExtendsResourceEObjectKeyword_2_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtendsResourceEObjectRule());
							}
						}
						otherlv_9=RULE_ID
						{
							newLeafNode(otherlv_9, grammarAccess.getExtendsResourceEObjectAccess().getEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0());
						}
					)
				)
			)
		)
		(
			otherlv_10='ExtendsResourceEObject'
			{
				newLeafNode(otherlv_10, grammarAccess.getExtendsResourceEObjectAccess().getExtendsResourceEObjectKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsResourceEObjectRule());
						}
					}
					otherlv_11=RULE_ID
					{
						newLeafNode(otherlv_11, grammarAccess.getExtendsResourceEObjectAccess().getEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsResourceEObjectRule());
						}
					}
					otherlv_12=RULE_ID
					{
						newLeafNode(otherlv_12, grammarAccess.getExtendsResourceEObjectAccess().getEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendsResourceEObjectRule());
						}
					}
					otherlv_13=RULE_ID
					{
						newLeafNode(otherlv_13, grammarAccess.getExtendsResourceEObjectAccess().getEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsResourceEObjectAccess().getEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_4_0());
					}
					lv_eObjectContainment_14_0=ruleExtendsNsURIEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsResourceEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_14_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsNsURIEObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsResourceEObjectAccess().getEObjectContainmentExtendsPluginEObjectParserRuleCall_3_5_0());
					}
					lv_eObjectContainment_15_0=ruleExtendsPluginEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsResourceEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_15_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsPluginEObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsResourceEObjectAccess().getEObjectContainmentExtendsResourceEObjectParserRuleCall_3_6_0());
					}
					lv_eObjectContainment_16_0=ruleExtendsResourceEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsResourceEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_16_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsResourceEObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsResourceEObjectAccess().getEObjectContainmentEObjectParserRuleCall_3_7_0());
					}
					lv_eObjectContainment_17_0=ruleEObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsResourceEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_17_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.EObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsResourceEObjectAccess().getEObjectContainmentEAttributeParserRuleCall_3_8_0());
					}
					lv_eObjectContainment_18_0=ruleEAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsResourceEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_18_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.EAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExtendsResourceEObjectAccess().getEObjectContainmentMyEAttributeParserRuleCall_3_9_0());
					}
					lv_eObjectContainment_19_0=ruleMyEAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtendsResourceEObjectRule());
						}
						add(
							$current,
							"eObjectContainment",
							lv_eObjectContainment_19_0,
							"org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.MyEAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleEObject
entryRuleEObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEObjectRule()); }
	iv_ruleEObject=ruleEObject
	{ $current=$iv_ruleEObject.current; }
	EOF;

// Rule EObject
ruleEObject returns [EObject current=null]
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
					grammarAccess.getEObjectAccess().getEObjectAction_0(),
					$current);
			}
		)
		otherlv_1='object'
		{
			newLeafNode(otherlv_1, grammarAccess.getEObjectAccess().getObjectKeyword_1());
		}
	)
;

// Entry rule entryRuleValidID
entryRuleValidID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValidIDRule()); }
	iv_ruleValidID=ruleValidID
	{ $current=$iv_ruleValidID.current.getText(); }
	EOF;

// Rule ValidID
ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
