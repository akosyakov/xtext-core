/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalLazyLinkingTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.linking.lazy.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.linking.lazy.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.linking.lazy.services.LazyLinkingTestLanguageGrammarAccess;

}

@parser::members {

 	private LazyLinkingTestLanguageGrammarAccess grammarAccess;

    public InternalLazyLinkingTestLanguageParser(TokenStream input, LazyLinkingTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected LazyLinkingTestLanguageGrammarAccess getGrammarAccess() {
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
				newCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0());
			}
			lv_types_0_0=ruleType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"types",
					lv_types_0_0,
					"org.eclipse.xtext.linking.lazy.LazyLinkingTestLanguage.Type");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getExtendsKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getExtendsTypeCrossReference_2_1_0());
					}
				)
			)
			otherlv_4='.'
			{
				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getFullStopKeyword_2_2());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getParentIdPropertyCrossReference_2_3_0());
					}
				)
			)
		)?
		(
			otherlv_6='for'
			{
				newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getForKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getParentIdPropertyCrossReference_3_1_0());
					}
				)
			)
			otherlv_8='in'
			{
				newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getInKeyword_3_2());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
					}
					otherlv_9=RULE_ID
					{
						newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getExtendsTypeCrossReference_3_3_0());
					}
				)
			)
		)?
		otherlv_10='{'
		{
			newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeAccess().getPropertiesPropertyParserRuleCall_5_0());
				}
				lv_properties_11_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeRule());
					}
					add(
						$current,
						"properties",
						lv_properties_11_0,
						"org.eclipse.xtext.linking.lazy.LazyLinkingTestLanguage.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeAccess().getUnresolvedProxyPropertyUnresolvedProxyPropertyParserRuleCall_6_0());
				}
				lv_unresolvedProxyProperty_12_0=ruleUnresolvedProxyProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeRule());
					}
					add(
						$current,
						"unresolvedProxyProperty",
						lv_unresolvedProxyProperty_12_0,
						"org.eclipse.xtext.linking.lazy.LazyLinkingTestLanguage.UnresolvedProxyProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
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
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getTypeTypeCrossReference_0_0());
				}
			)
		)+
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleUnresolvedProxyProperty
entryRuleUnresolvedProxyProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnresolvedProxyPropertyRule()); }
	iv_ruleUnresolvedProxyProperty=ruleUnresolvedProxyProperty
	{ $current=$iv_ruleUnresolvedProxyProperty.current; }
	EOF;

// Rule UnresolvedProxyProperty
ruleUnresolvedProxyProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='unresolved'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnresolvedProxyPropertyAccess().getUnresolvedKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnresolvedProxyPropertyRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getUnresolvedProxyPropertyAccess().getTypeTypeCrossReference_1_0());
				}
			)
		)+
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getUnresolvedProxyPropertyAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnresolvedProxyPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getUnresolvedProxyPropertyAccess().getSemicolonKeyword_3());
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
