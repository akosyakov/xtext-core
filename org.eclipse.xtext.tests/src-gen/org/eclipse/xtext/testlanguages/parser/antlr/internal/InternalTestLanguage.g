/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.services.TestLanguageGrammarAccess;

}

@parser::members {

 	private TestLanguageGrammarAccess grammarAccess;

    public InternalTestLanguageParser(TokenStream input, TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "EntryRule";
   	}

   	@Override
   	protected TestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEntryRule
entryRuleEntryRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntryRuleRule()); }
	iv_ruleEntryRule=ruleEntryRule
	{ $current=$iv_ruleEntryRule.current; }
	EOF;

// Rule EntryRule
ruleEntryRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getEntryRuleAccess().getMultiFeatureAbstractRuleParserRuleCall_0());
			}
			lv_multiFeature_0_0=ruleAbstractRule
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getEntryRuleRule());
				}
				add(
					$current,
					"multiFeature",
					lv_multiFeature_0_0,
					"org.eclipse.xtext.testlanguages.TestLanguage.AbstractRule");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAbstractRule
entryRuleAbstractRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractRuleRule()); }
	iv_ruleAbstractRule=ruleAbstractRule
	{ $current=$iv_ruleAbstractRule.current; }
	EOF;

// Rule AbstractRule
ruleAbstractRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractRuleAccess().getChoiceRuleParserRuleCall_0());
		}
		this_ChoiceRule_0=ruleChoiceRule
		{
			$current = $this_ChoiceRule_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractRuleAccess().getReducibleRuleParserRuleCall_1());
		}
		this_ReducibleRule_1=ruleReducibleRule
		{
			$current = $this_ReducibleRule_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleChoiceRule
entryRuleChoiceRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChoiceRuleRule()); }
	iv_ruleChoiceRule=ruleChoiceRule
	{ $current=$iv_ruleChoiceRule.current; }
	EOF;

// Rule ChoiceRule
ruleChoiceRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='choice'
		{
			newLeafNode(otherlv_0, grammarAccess.getChoiceRuleAccess().getChoiceKeyword_0());
		}
		(
			(
				lv_optionalKeyword_1_0='optional'
				{
					newLeafNode(lv_optionalKeyword_1_0, grammarAccess.getChoiceRuleAccess().getOptionalKeywordOptionalKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChoiceRuleRule());
					}
					setWithLastConsumed($current, "optionalKeyword", lv_optionalKeyword_1_0 != null, "optional");
				}
			)
		)?
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getChoiceRuleAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChoiceRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleReducibleRule
entryRuleReducibleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReducibleRuleRule()); }
	iv_ruleReducibleRule=ruleReducibleRule
	{ $current=$iv_ruleReducibleRule.current; }
	EOF;

// Rule ReducibleRule
ruleReducibleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='reducible'
		{
			newLeafNode(otherlv_0, grammarAccess.getReducibleRuleAccess().getReducibleKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getReducibleRuleAccess().getTerminalRuleParserRuleCall_1());
		}
		this_TerminalRule_1=ruleTerminalRule
		{
			$current = $this_TerminalRule_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getReducibleRuleAccess().getReducibleCompositeActionFeatureAction_2_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getReducibleRuleAccess().getActionFeatureTerminalRuleParserRuleCall_2_1_0());
					}
					lv_actionFeature_3_0=ruleTerminalRule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getReducibleRuleRule());
						}
						add(
							$current,
							"actionFeature",
							lv_actionFeature_3_0,
							"org.eclipse.xtext.testlanguages.TestLanguage.TerminalRule");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleTerminalRule
entryRuleTerminalRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalRuleRule()); }
	iv_ruleTerminalRule=ruleTerminalRule
	{ $current=$iv_ruleTerminalRule.current; }
	EOF;

// Rule TerminalRule
ruleTerminalRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_stringFeature_0_0=RULE_STRING
			{
				newLeafNode(lv_stringFeature_0_0, grammarAccess.getTerminalRuleAccess().getStringFeatureSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTerminalRuleRule());
				}
				setWithLastConsumed(
					$current,
					"stringFeature",
					lv_stringFeature_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
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
