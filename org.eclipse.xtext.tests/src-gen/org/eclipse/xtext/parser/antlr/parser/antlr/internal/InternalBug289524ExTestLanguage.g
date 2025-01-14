/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug289524ExTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
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
import org.eclipse.xtext.parser.antlr.services.Bug289524ExTestLanguageGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private Bug289524ExTestLanguageGrammarAccess grammarAccess;

    public InternalBug289524ExTestLanguageParser(TokenStream input, Bug289524ExTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug289524ExTestLanguageGrammarAccess getGrammarAccess() {
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
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getModelAccess().getModelAction_0(),
					$current);
			}
		)
		otherlv_1='Model'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getRefsModelElementParserRuleCall_2_0());
				}
				lv_refs_2_0=ruleModelElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"refs",
						lv_refs_2_0,
						"org.eclipse.xtext.parser.antlr.Bug289524ExTestLanguage.ModelElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleModelElement
entryRuleModelElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelElementRule()); }
	iv_ruleModelElement=ruleModelElement
	{ $current=$iv_ruleModelElement.current; }
	EOF;

// Rule ModelElement
ruleModelElement returns [EObject current=null]
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
					grammarAccess.getModelElementAccess().getModelElementAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getModelElementAccess().getContainmentsContainedParserRuleCall_1_0_0());
					}
					lv_containments_1_0=ruleContained
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelElementRule());
						}
						add(
							$current,
							"containments",
							lv_containments_1_0,
							"org.eclipse.xtext.parser.antlr.Bug289524ExTestLanguage.Contained");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_2='reference'
				{
					newLeafNode(otherlv_2, grammarAccess.getModelElementAccess().getReferenceKeyword_1_1_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelElementRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getModelElementAccess().getRefsContainedCrossReference_1_1_1_0());
						}
					)
				)
				(
					otherlv_4='$'
					{
						newLeafNode(otherlv_4, grammarAccess.getModelElementAccess().getDollarSignKeyword_1_1_2_0());
					}
					(
						(
							{
								/* */
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getModelElementRule());
								}
							}
							otherlv_5=RULE_ID
							{
								newLeafNode(otherlv_5, grammarAccess.getModelElementAccess().getRefsContainedCrossReference_1_1_2_1_0());
							}
						)
					)
				)*
			)
		)+
	)
;

// Entry rule entryRuleContained
entryRuleContained returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainedRule()); }
	iv_ruleContained=ruleContained
	{ $current=$iv_ruleContained.current; }
	EOF;

// Rule Contained
ruleContained returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='containment'
		{
			newLeafNode(otherlv_0, grammarAccess.getContainedAccess().getContainmentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getContainedAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContainedRule());
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
