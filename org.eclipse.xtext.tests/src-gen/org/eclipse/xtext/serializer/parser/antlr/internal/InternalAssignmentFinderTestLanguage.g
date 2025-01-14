/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalAssignmentFinderTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.serializer.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.serializer.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.serializer.services.AssignmentFinderTestLanguageGrammarAccess;

}

@parser::members {

 	private AssignmentFinderTestLanguageGrammarAccess grammarAccess;

    public InternalAssignmentFinderTestLanguageParser(TokenStream input, AssignmentFinderTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected AssignmentFinderTestLanguageGrammarAccess getGrammarAccess() {
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
			otherlv_0='#00'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitZeroKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getKeywordValKeywordValParserRuleCall_0_1_0());
					}
					lv_keywordVal_1_0=ruleKeywordVal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"keywordVal",
							lv_keywordVal_1_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.KeywordVal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='#01'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitOneKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getTerminalValTerminalValParserRuleCall_1_1_0());
					}
					lv_terminalVal_3_0=ruleTerminalVal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"terminalVal",
							lv_terminalVal_3_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.TerminalVal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_4='#02'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitTwoKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getEnumValEnumValParserRuleCall_2_1_0());
					}
					lv_enumVal_5_0=ruleEnumVal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"enumVal",
							lv_enumVal_5_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.EnumVal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_6='#03'
			{
				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitThreeKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getKeywordBoolKeywordBoolParserRuleCall_3_1_0());
					}
					lv_keywordBool_7_0=ruleKeywordBool
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"keywordBool",
							lv_keywordBool_7_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.KeywordBool");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_8='#04'
			{
				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitFourKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getTerminalBoolTerminalBoolParserRuleCall_4_1_0());
					}
					lv_terminalBool_9_0=ruleTerminalBool
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"terminalBool",
							lv_terminalBool_9_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.TerminalBool");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_10='#05'
			{
				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitFiveKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getEnumBoolEnumBoolParserRuleCall_5_1_0());
					}
					lv_enumBool_11_0=ruleEnumBool
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"enumBool",
							lv_enumBool_11_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.EnumBool");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_12='#06'
			{
				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitSixKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getMixedBoolMixedBoolParserRuleCall_6_1_0());
					}
					lv_mixedBool_13_0=ruleMixedBool
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"mixedBool",
							lv_mixedBool_13_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.MixedBool");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_14='#07'
			{
				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitSevenKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getMixedValueMixedValueParserRuleCall_7_1_0());
					}
					lv_mixedValue_15_0=ruleMixedValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"mixedValue",
							lv_mixedValue_15_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.MixedValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_16='#08'
			{
				newLeafNode(otherlv_16, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitEightKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getContainmentRefContainmentRefParserRuleCall_8_1_0());
					}
					lv_containmentRef_17_0=ruleContainmentRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"containmentRef",
							lv_containmentRef_17_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.ContainmentRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_18='#09'
			{
				newLeafNode(otherlv_18, grammarAccess.getModelAccess().getNumberSignDigitZeroDigitNineKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getCrossRefCrossRefParserRuleCall_9_1_0());
					}
					lv_crossRef_19_0=ruleCrossRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"crossRef",
							lv_crossRef_19_0,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.CrossRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleKeywordVal
entryRuleKeywordVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeywordValRule()); }
	iv_ruleKeywordVal=ruleKeywordVal
	{ $current=$iv_ruleKeywordVal.current; }
	EOF;

// Rule KeywordVal
ruleKeywordVal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_kw_0_0='kw1'
				{
					newLeafNode(lv_kw_0_0, grammarAccess.getKeywordValAccess().getKwKw1Keyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKeywordValRule());
					}
					setWithLastConsumed($current, "kw", lv_kw_0_0, "kw1");
				}
			)
		)
		    |
		(
			(
				lv_kw_1_0='kw2'
				{
					newLeafNode(lv_kw_1_0, grammarAccess.getKeywordValAccess().getKwKw2Keyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKeywordValRule());
					}
					setWithLastConsumed($current, "kw", lv_kw_1_0, "kw2");
				}
			)
		)
	)
;

// Entry rule entryRuleTerminalVal
entryRuleTerminalVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalValRule()); }
	iv_ruleTerminalVal=ruleTerminalVal
	{ $current=$iv_ruleTerminalVal.current; }
	EOF;

// Rule TerminalVal
ruleTerminalVal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_term_0_0=RULE_TERMINAL1
				{
					newLeafNode(lv_term_0_0, grammarAccess.getTerminalValAccess().getTermTerminal1TerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminalValRule());
					}
					setWithLastConsumed(
						$current,
						"term",
						lv_term_0_0,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Terminal1");
				}
			)
		)
		    |
		(
			(
				lv_term_1_0=RULE_TERMINAL2
				{
					newLeafNode(lv_term_1_0, grammarAccess.getTerminalValAccess().getTermTerminal2TerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminalValRule());
					}
					setWithLastConsumed(
						$current,
						"term",
						lv_term_1_0,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Terminal2");
				}
			)
		)
		    |
		(
			(
				lv_term_2_0='%foo'
				{
					newLeafNode(lv_term_2_0, grammarAccess.getTerminalValAccess().getTermFooKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminalValRule());
					}
					setWithLastConsumed($current, "term", lv_term_2_0, "\%foo");
				}
			)
		)
	)
;

// Entry rule entryRuleEnumVal
entryRuleEnumVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumValRule()); }
	iv_ruleEnumVal=ruleEnumVal
	{ $current=$iv_ruleEnumVal.current; }
	EOF;

// Rule EnumVal
ruleEnumVal returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getEnumValAccess().getEnEnum1EnumRuleCall_0_0());
				}
				lv_en_0_0=ruleEnum1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumValRule());
					}
					set(
						$current,
						"en",
						lv_en_0_0,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Enum1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumValAccess().getEnEnum2EnumRuleCall_1_0());
				}
				lv_en_1_0=ruleEnum2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumValRule());
					}
					set(
						$current,
						"en",
						lv_en_1_0,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Enum2");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleKeywordBool
entryRuleKeywordBool returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeywordBoolRule()); }
	iv_ruleKeywordBool=ruleKeywordBool
	{ $current=$iv_ruleKeywordBool.current; }
	EOF;

// Rule KeywordBool
ruleKeywordBool returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_kw_0_0='kw1'
				{
					newLeafNode(lv_kw_0_0, grammarAccess.getKeywordBoolAccess().getKwKw1Keyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKeywordBoolRule());
					}
					setWithLastConsumed($current, "kw", lv_kw_0_0 != null, "kw1");
				}
			)
		)
		    |
		(
			(
				lv_kw_1_0='kw2'
				{
					newLeafNode(lv_kw_1_0, grammarAccess.getKeywordBoolAccess().getKwKw2Keyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKeywordBoolRule());
					}
					setWithLastConsumed($current, "kw", lv_kw_1_0 != null, "kw2");
				}
			)
		)
	)
;

// Entry rule entryRuleTerminalBool
entryRuleTerminalBool returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalBoolRule()); }
	iv_ruleTerminalBool=ruleTerminalBool
	{ $current=$iv_ruleTerminalBool.current; }
	EOF;

// Rule TerminalBool
ruleTerminalBool returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_term_0_0=RULE_TERMINAL1
				{
					newLeafNode(lv_term_0_0, grammarAccess.getTerminalBoolAccess().getTermTerminal1TerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminalBoolRule());
					}
					setWithLastConsumed(
						$current,
						"term",
						lv_term_0_0 != null,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Terminal1");
				}
			)
		)
		    |
		(
			(
				lv_term_1_0=RULE_TERMINAL2
				{
					newLeafNode(lv_term_1_0, grammarAccess.getTerminalBoolAccess().getTermTerminal2TerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminalBoolRule());
					}
					setWithLastConsumed(
						$current,
						"term",
						lv_term_1_0 != null,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Terminal2");
				}
			)
		)
		    |
		(
			(
				lv_term_2_0='%foo'
				{
					newLeafNode(lv_term_2_0, grammarAccess.getTerminalBoolAccess().getTermFooKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminalBoolRule());
					}
					setWithLastConsumed($current, "term", lv_term_2_0 != null, "\%foo");
				}
			)
		)
	)
;

// Entry rule entryRuleEnumBool
entryRuleEnumBool returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumBoolRule()); }
	iv_ruleEnumBool=ruleEnumBool
	{ $current=$iv_ruleEnumBool.current; }
	EOF;

// Rule EnumBool
ruleEnumBool returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getEnumBoolAccess().getEnEnum1EnumRuleCall_0_0());
				}
				lv_en_0_0=ruleEnum1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumBoolRule());
					}
					set(
						$current,
						"en",
						lv_en_0_0 != null,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Enum1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumBoolAccess().getEnEnum2EnumRuleCall_1_0());
				}
				lv_en_1_0=ruleEnum2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumBoolRule());
					}
					set(
						$current,
						"en",
						lv_en_1_0 != null,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Enum2");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMixedBool
entryRuleMixedBool returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMixedBoolRule()); }
	iv_ruleMixedBool=ruleMixedBool
	{ $current=$iv_ruleMixedBool.current; }
	EOF;

// Rule MixedBool
ruleMixedBool returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_val_0_0='kw1'
				{
					newLeafNode(lv_val_0_0, grammarAccess.getMixedBoolAccess().getValKw1Keyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMixedBoolRule());
					}
					setWithLastConsumed($current, "val", lv_val_0_0 != null, "kw1");
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getMixedBoolAccess().getValBooleanParserRuleCall_1_0());
				}
				lv_val_1_0=ruleBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMixedBoolRule());
					}
					set(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Boolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	iv_ruleBoolean=ruleBoolean
	{ $current=$iv_ruleBoolean.current.getText(); }
	EOF;

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleMixedValue
entryRuleMixedValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMixedValueRule()); }
	iv_ruleMixedValue=ruleMixedValue
	{ $current=$iv_ruleMixedValue.current; }
	EOF;

// Rule MixedValue
ruleMixedValue returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getMixedValueAccess().getValEnum1EnumRuleCall_0_0());
				}
				lv_val_0_0=ruleEnum1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMixedValueRule());
					}
					set(
						$current,
						"val",
						lv_val_0_0,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Enum1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getMixedValueAccess().getValDatEnumParserRuleCall_1_0());
				}
				lv_val_1_0=ruleDatEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMixedValueRule());
					}
					set(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.DatEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDatEnum
entryRuleDatEnum returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatEnumRule()); }
	iv_ruleDatEnum=ruleDatEnum
	{ $current=$iv_ruleDatEnum.current.getText(); }
	EOF;

// Rule DatEnum
ruleDatEnum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='lit3'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getDatEnumAccess().getLit3Keyword());
	}
;

// Entry rule entryRuleContainmentRef
entryRuleContainmentRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainmentRefRule()); }
	iv_ruleContainmentRef=ruleContainmentRef
	{ $current=$iv_ruleContainmentRef.current; }
	EOF;

// Rule ContainmentRef
ruleContainmentRef returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getContainmentRefAccess().getCtxContainmentRef1ParserRuleCall_0_0());
				}
				lv_ctx_0_0=ruleContainmentRef1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainmentRefRule());
					}
					set(
						$current,
						"ctx",
						lv_ctx_0_0,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.ContainmentRef1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getContainmentRefAccess().getCtxContainmentRef2ParserRuleCall_1_0());
				}
				lv_ctx_1_0=ruleContainmentRef2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainmentRefRule());
					}
					set(
						$current,
						"ctx",
						lv_ctx_1_0,
						"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.ContainmentRef2");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleContainmentRef1
entryRuleContainmentRef1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainmentRef1Rule()); }
	iv_ruleContainmentRef1=ruleContainmentRef1
	{ $current=$iv_ruleContainmentRef1.current; }
	EOF;

// Rule ContainmentRef1
ruleContainmentRef1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw1'
		{
			newLeafNode(otherlv_0, grammarAccess.getContainmentRef1Access().getKw1Keyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getContainmentRef1Access().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContainmentRef1Rule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleContainmentRef2
entryRuleContainmentRef2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainmentRef2Rule()); }
	iv_ruleContainmentRef2=ruleContainmentRef2
	{ $current=$iv_ruleContainmentRef2.current; }
	EOF;

// Rule ContainmentRef2
ruleContainmentRef2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw2'
		{
			newLeafNode(otherlv_0, grammarAccess.getContainmentRef2Access().getKw2Keyword_0());
		}
		(
			(
				lv_val2_1_0=RULE_ID
				{
					newLeafNode(lv_val2_1_0, grammarAccess.getContainmentRef2Access().getVal2IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContainmentRef2Rule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCrossRef
entryRuleCrossRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCrossRefRule()); }
	iv_ruleCrossRef=ruleCrossRef
	{ $current=$iv_ruleCrossRef.current; }
	EOF;

// Rule CrossRef
ruleCrossRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_name_0_1=RULE_TERMINAL1
					{
						newLeafNode(lv_name_0_1, grammarAccess.getCrossRefAccess().getNameTerminal1TerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCrossRefRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_0_1,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Terminal1");
					}
					    |
					lv_name_0_2=RULE_TERMINAL2
					{
						newLeafNode(lv_name_0_2, grammarAccess.getCrossRefAccess().getNameTerminal2TerminalRuleCall_0_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCrossRefRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_0_2,
							"org.eclipse.xtext.serializer.AssignmentFinderTestLanguage.Terminal2");
					}
				)
			)
		)
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCrossRefRule());
						}
					}
					otherlv_1=RULE_TERMINAL1
					{
						newLeafNode(otherlv_1, grammarAccess.getCrossRefAccess().getCrossRefCrossRefCrossReference_1_0_0());
					}
				)
			)
			    |
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCrossRefRule());
						}
					}
					otherlv_2=RULE_TERMINAL2
					{
						newLeafNode(otherlv_2, grammarAccess.getCrossRefAccess().getCrossRefCrossRefCrossReference_1_1_0());
					}
				)
			)
		)
	)
;

// Rule Enum1
ruleEnum1 returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='lit1'
		{
			$current = grammarAccess.getEnum1Access().getLit1EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getEnum1Access().getLit1EnumLiteralDeclaration());
		}
	)
;

// Rule Enum2
ruleEnum2 returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='lit2'
		{
			$current = grammarAccess.getEnum2Access().getLit2EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getEnum2Access().getLit2EnumLiteralDeclaration());
		}
	)
;

RULE_TERMINAL1 : '%' ('A'..'Z')*;

RULE_TERMINAL2 : '%' ('a'..'z')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
