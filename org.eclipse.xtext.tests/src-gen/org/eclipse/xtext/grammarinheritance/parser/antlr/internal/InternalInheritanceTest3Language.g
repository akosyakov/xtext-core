/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalInheritanceTest3Language;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.grammarinheritance.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.grammarinheritance.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.grammarinheritance.services.InheritanceTest3LanguageGrammarAccess;

}

@parser::members {

 	private InheritanceTest3LanguageGrammarAccess grammarAccess;

    public InternalInheritanceTest3LanguageParser(TokenStream input, InheritanceTest3LanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected InheritanceTest3LanguageGrammarAccess getGrammarAccess() {
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
	{
		newCompositeNode(grammarAccess.getModelAccess().getModelParserRuleCall());
	}
	this_Model_0=superModel
	{
		$current = $this_Model_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementAccess().getElementParserRuleCall_0());
		}
		this_Element_0=superElement
		{
			$current = $this_Element_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementAccess().getElementAction_1_0(),
						$current);
				}
			)
			otherlv_2='element'
			{
				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getElementKeyword_1_1());
			}
			(
				(
					lv_name_3_0=SUPER_ID
					{
						newLeafNode(lv_name_3_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_3_0,
							"org.eclipse.xtext.grammarinheritance.InheritanceTestLanguage.ID");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementAccess().getElementAction_2_0(),
						$current);
				}
			)
			otherlv_5='element'
			{
				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getElementKeyword_2_1());
			}
			(
				(
					lv_name_6_0=SUPER_1_ID
					{
						newLeafNode(lv_name_6_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_2_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_6_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementAccess().getElementAction_3_0(),
						$current);
				}
			)
			otherlv_8='element'
			{
				newLeafNode(otherlv_8, grammarAccess.getElementAccess().getElementKeyword_3_1());
			}
			(
				(
					lv_name_9_0=RULE_STRING
					{
						newLeafNode(lv_name_9_0, grammarAccess.getElementAccess().getNameSTRINGTerminalRuleCall_3_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_9_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
	)
;

// Entry rule entrySuperModel
entrySuperModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInheritanceTestLanguageModelRule()); }
	iv_superModel=superModel
	{ $current=$iv_superModel.current; }
	EOF;

// Rule Model
superModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getInheritanceTestLanguageModelAccess().getModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInheritanceTestLanguageModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInheritanceTestLanguageModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.InheritanceTest3Language.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getInheritanceTestLanguageModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInheritanceTestLanguageModelAccess().getElementsElementParserRuleCall_3_0());
				}
				lv_elements_3_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInheritanceTestLanguageModelRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"org.eclipse.xtext.grammarinheritance.InheritanceTest3Language.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getInheritanceTestLanguageModelAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entrySuperElement
entrySuperElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInheritanceTestLanguageElementRule()); }
	iv_superElement=superElement
	{ $current=$iv_superElement.current; }
	EOF;

// Rule Element
superElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getInheritanceTestLanguageElementAccess().getElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInheritanceTestLanguageElementAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInheritanceTestLanguageElementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.InheritanceTest3Language.ID");
				}
			)
		)
	)
;

RULE_ID : 'id';

SUPER_ID : ('a'..'z')+;

SUPER_1_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
