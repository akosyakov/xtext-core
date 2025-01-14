/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalHiddenTokenSequencerTestLanguage;

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
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.serializer.services.HiddenTokenSequencerTestLanguageGrammarAccess;

}

@parser::members {

 	private HiddenTokenSequencerTestLanguageGrammarAccess grammarAccess;

    public InternalHiddenTokenSequencerTestLanguageParser(TokenStream input, HiddenTokenSequencerTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected HiddenTokenSequencerTestLanguageGrammarAccess getGrammarAccess() {
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
			{
				newCompositeNode(grammarAccess.getModelAccess().getDomainModelDomainModelParserRuleCall_0());
			}
			lv_domainModel_0_0=ruleDomainModel
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				set(
					$current,
					"domainModel",
					lv_domainModel_0_0,
					"org.eclipse.xtext.serializer.HiddenTokenSequencerTestLanguage.DomainModel");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleDomainModel
entryRuleDomainModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainModelRule()); }
	iv_ruleDomainModel=ruleDomainModel
	{ $current=$iv_ruleDomainModel.current; }
	EOF;

// Rule DomainModel
ruleDomainModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entities'
		{
			newLeafNode(otherlv_0, grammarAccess.getDomainModelAccess().getEntitiesKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_1_0());
				}
				lv_entities_1_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainModelRule());
					}
					add(
						$current,
						"entities",
						lv_entities_1_0,
						"org.eclipse.xtext.serializer.HiddenTokenSequencerTestLanguage.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_2='end'
		{
			newLeafNode(otherlv_2, grammarAccess.getDomainModelAccess().getEndKeyword_2());
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_description_1_0=RULE_STRING
				{
					newLeafNode(lv_description_1_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
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
