/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug289515TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
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
import org.eclipse.xtext.parser.antlr.services.Bug289515TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug289515TestLanguageGrammarAccess grammarAccess;

    public InternalBug289515TestLanguageParser(TokenStream input, Bug289515TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug289515TestLanguageGrammarAccess getGrammarAccess() {
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
			otherlv_0='1'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDigitOneKeyword_0_0());
			}
			(
				(
					lv_value_1_0='%'
					{
						newLeafNode(lv_value_1_0, grammarAccess.getModelAccess().getValuePercentSignKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed($current, "value", lv_value_1_0, "\%");
					}
				)
			)
		)
		    |
		(
			otherlv_2='2'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDigitTwoKeyword_1_0());
			}
			(
				(
					lv_value_3_0='%'
					{
						newLeafNode(lv_value_3_0, grammarAccess.getModelAccess().getValuePercentSignKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed($current, "value", lv_value_3_0, "\%");
					}
				)
			)
		)
		    |
		(
			otherlv_4='3'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getDigitThreeKeyword_2_0());
			}
			(
				(
					lv_value_5_0='\\%'
					{
						newLeafNode(lv_value_5_0, grammarAccess.getModelAccess().getValueReverseSolidusPercentSignKeyword_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed($current, "value", lv_value_5_0, "\\\%");
					}
				)
			)
		)
		    |
		(
			otherlv_6='4'
			{
				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getDigitFourKeyword_3_0());
			}
			(
				(
					lv_value_7_0='\\%'
					{
						newLeafNode(lv_value_7_0, grammarAccess.getModelAccess().getValueReverseSolidusPercentSignKeyword_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed($current, "value", lv_value_7_0, "\\\%");
					}
				)
			)
		)
		    |
		(
			otherlv_8='5'
			{
				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getDigitFiveKeyword_4_0());
			}
			(
				(
					lv_value_9_0='%%'
					{
						newLeafNode(lv_value_9_0, grammarAccess.getModelAccess().getValuePercentSignPercentSignKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed($current, "value", lv_value_9_0, "\%\%");
					}
				)
			)
		)
		    |
		(
			otherlv_10='6'
			{
				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getDigitSixKeyword_5_0());
			}
			(
				(
					lv_value_11_0='%%'
					{
						newLeafNode(lv_value_11_0, grammarAccess.getModelAccess().getValuePercentSignPercentSignKeyword_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed($current, "value", lv_value_11_0, "\%\%");
					}
				)
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
