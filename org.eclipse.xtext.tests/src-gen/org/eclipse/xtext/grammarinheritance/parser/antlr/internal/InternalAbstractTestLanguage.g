/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalAbstractTestLanguage;

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
import org.eclipse.xtext.grammarinheritance.services.AbstractTestLanguageGrammarAccess;

}

@parser::members {

 	private AbstractTestLanguageGrammarAccess grammarAccess;

    public InternalAbstractTestLanguageParser(TokenStream input, AbstractTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "InheritedParserRule";
   	}

   	@Override
   	protected AbstractTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleInheritedParserRule
entryRuleInheritedParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInheritedParserRuleRule()); }
	iv_ruleInheritedParserRule=ruleInheritedParserRule
	{ $current=$iv_ruleInheritedParserRule.current; }
	EOF;

// Rule InheritedParserRule
ruleInheritedParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getInheritedParserRuleAccess().getElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInheritedParserRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInheritedParserRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleOverridableParserRule
entryRuleOverridableParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOverridableParserRuleRule()); }
	iv_ruleOverridableParserRule=ruleOverridableParserRule
	{ $current=$iv_ruleOverridableParserRule.current; }
	EOF;

// Rule OverridableParserRule
ruleOverridableParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getOverridableParserRuleAccess().getElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOverridableParserRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOverridableParserRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleExtendableParserRule
entryRuleExtendableParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtendableParserRuleRule()); }
	iv_ruleExtendableParserRule=ruleExtendableParserRule
	{ $current=$iv_ruleExtendableParserRule.current; }
	EOF;

// Rule ExtendableParserRule
ruleExtendableParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getExtendableParserRuleAccess().getElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getExtendableParserRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtendableParserRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.grammarinheritance.AbstractTestLanguage.ID");
				}
			)
		)
	)
;

RULE_REAL : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'\u00F6'|'\u00E4'|'\u00FC'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
