/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug287184TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.assignments.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.assignments.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.assignments.services.Bug287184TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug287184TestLanguageGrammarAccess grammarAccess;

    public InternalBug287184TestLanguageParser(TokenStream input, Bug287184TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug287184TestLanguageGrammarAccess getGrammarAccess() {
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
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getNameFQNParserRuleCall_1_0());
				}
				lv_name_1_0=ruleFQN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.parser.assignments.Bug287184TestLanguage.FQN");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getDetailDetailParserRuleCall_2_0_0());
					}
					lv_detail_2_1=ruleDetail
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"detail",
							lv_detail_2_1,
							"org.eclipse.xtext.parser.assignments.Bug287184TestLanguage.Detail");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getModelAccess().getDetailAssociatedDetailParserRuleCall_2_0_1());
					}
					lv_detail_2_2=ruleAssociatedDetail
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"detail",
							lv_detail_2_2,
							"org.eclipse.xtext.parser.assignments.Bug287184TestLanguage.AssociatedDetail");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
	)
;

// Entry rule entryRuleDetail
entryRuleDetail returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDetailRule()); }
	iv_ruleDetail=ruleDetail
	{ $current=$iv_ruleDetail.current; }
	EOF;

// Rule Detail
ruleDetail returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='detail'
		{
			newLeafNode(otherlv_0, grammarAccess.getDetailAccess().getDetailKeyword_0());
		}
		(
			(
				(
					lv_visibility_1_1='private'
					{
						newLeafNode(lv_visibility_1_1, grammarAccess.getDetailAccess().getVisibilityPrivateKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDetailRule());
						}
						setWithLastConsumed($current, "visibility", lv_visibility_1_1, null);
					}
					    |
					lv_visibility_1_2='protected'
					{
						newLeafNode(lv_visibility_1_2, grammarAccess.getDetailAccess().getVisibilityProtectedKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDetailRule());
						}
						setWithLastConsumed($current, "visibility", lv_visibility_1_2, null);
					}
					    |
					lv_visibility_1_3='public'
					{
						newLeafNode(lv_visibility_1_3, grammarAccess.getDetailAccess().getVisibilityPublicKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDetailRule());
						}
						setWithLastConsumed($current, "visibility", lv_visibility_1_3, null);
					}
				)
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDetailRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDetailAccess().getDetailClassModelCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssociatedDetail
entryRuleAssociatedDetail returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociatedDetailRule()); }
	iv_ruleAssociatedDetail=ruleAssociatedDetail
	{ $current=$iv_ruleAssociatedDetail.current; }
	EOF;

// Rule AssociatedDetail
ruleAssociatedDetail returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='associated'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssociatedDetailAccess().getAssociatedKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociatedDetailRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAssociatedDetailAccess().getDetailClassModelCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getAssociatedDetailAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
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
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
