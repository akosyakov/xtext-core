/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalTerminalRulesTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.terminalrules.services.TerminalRulesTestLanguageGrammarAccess;

}

@parser::members {

 	private TerminalRulesTestLanguageGrammarAccess grammarAccess;

    public InternalTerminalRulesTestLanguageParser(TokenStream input, TerminalRulesTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected TerminalRulesTestLanguageGrammarAccess getGrammarAccess() {
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
				lv_idValue_0_0=RULE_ID
				{
					newLeafNode(lv_idValue_0_0, grammarAccess.getModelAccess().getIdValueIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"idValue",
						lv_idValue_0_0,
						"org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.ID");
				}
			)
		)
		    |
		(
			(
				lv_intValue_1_0=RULE_INT
				{
					newLeafNode(lv_intValue_1_0, grammarAccess.getModelAccess().getIntValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"intValue",
						lv_intValue_1_0,
						"org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.INT");
				}
			)
		)
		    |
		(
			(
				lv_stringValue_2_0=RULE_STRING
				{
					newLeafNode(lv_stringValue_2_0, grammarAccess.getModelAccess().getStringValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"stringValue",
						lv_stringValue_2_0,
						"org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.STRING");
				}
			)
		)
		    |
		(
			(
				lv_richStringValue_3_0=RULE_RICH_STRING
				{
					newLeafNode(lv_richStringValue_3_0, grammarAccess.getModelAccess().getRichStringValueRICH_STRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"richStringValue",
						lv_richStringValue_3_0,
						"org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.RICH_STRING");
				}
			)
		)
		    |
		(
			(
				lv_mlCommentValue_4_0=RULE_ML_COMMENT
				{
					newLeafNode(lv_mlCommentValue_4_0, grammarAccess.getModelAccess().getMlCommentValueML_COMMENTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"mlCommentValue",
						lv_mlCommentValue_4_0,
						"org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.ML_COMMENT");
				}
			)
		)
		    |
		(
			(
				lv_slCommentValue_5_0=RULE_SL_COMMENT
				{
					newLeafNode(lv_slCommentValue_5_0, grammarAccess.getModelAccess().getSlCommentValueSL_COMMENTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"slCommentValue",
						lv_slCommentValue_5_0,
						"org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.SL_COMMENT");
				}
			)
		)
		    |
		(
			(
				lv_wsValue_6_0=RULE_WS
				{
					newLeafNode(lv_wsValue_6_0, grammarAccess.getModelAccess().getWsValueWSTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"wsValue",
						lv_wsValue_6_0,
						"org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.WS");
				}
			)
		)
		    |
		(
			(
				lv_anyValue_7_0=RULE_ANY_OTHER
				{
					newLeafNode(lv_anyValue_7_0, grammarAccess.getModelAccess().getAnyValueANY_OTHERTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"anyValue",
						lv_anyValue_7_0,
						"org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.ANY_OTHER");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' (RULE_ESCAPED_CHAR|~(('\\'|'"')))* '"'|'\'' (RULE_ESCAPED_CHAR|~(('\\'|'\'')))* '\'');

RULE_RICH_STRING : '\'\'\'' RULE_IN_RICH_STRING* ('\'\'\''|('\'' '\''?)? EOF);

fragment RULE_IN_RICH_STRING : ('\'\'' ~(('\u00AB'|'\''))|'\'' ~(('\u00AB'|'\''))|~(('\u00AB'|'\'')));

fragment RULE_ESCAPED_CHAR : '\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
