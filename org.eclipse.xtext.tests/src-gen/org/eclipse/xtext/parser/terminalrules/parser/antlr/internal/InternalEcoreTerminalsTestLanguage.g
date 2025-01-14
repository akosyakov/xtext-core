/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalEcoreTerminalsTestLanguage;

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
import org.eclipse.xtext.parser.terminalrules.services.EcoreTerminalsTestLanguageGrammarAccess;

}

@parser::members {

 	private EcoreTerminalsTestLanguageGrammarAccess grammarAccess;

    public InternalEcoreTerminalsTestLanguageParser(TokenStream input, EcoreTerminalsTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected EcoreTerminalsTestLanguageGrammarAccess getGrammarAccess() {
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
			otherlv_0='int'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getIntKeyword_0_0());
			}
			(
				(
					lv_intValues_1_0=RULE_EINT
					{
						newLeafNode(lv_intValues_1_0, grammarAccess.getModelAccess().getIntValuesEINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						addWithLastConsumed(
							$current,
							"intValues",
							lv_intValues_1_0,
							"org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.EINT");
					}
				)
			)
		)
		    |
		(
			otherlv_2='double'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDoubleKeyword_1_0());
			}
			(
				(
					lv_doubleValues_3_0=RULE_EDOUBLE
					{
						newLeafNode(lv_doubleValues_3_0, grammarAccess.getModelAccess().getDoubleValuesEDOUBLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						addWithLastConsumed(
							$current,
							"doubleValues",
							lv_doubleValues_3_0,
							"org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.EDOUBLE");
					}
				)
			)
		)
		    |
		(
			otherlv_4='date'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getDateKeyword_2_0());
			}
			(
				(
					lv_dateValues_5_0=RULE_EDATE
					{
						newLeafNode(lv_dateValues_5_0, grammarAccess.getModelAccess().getDateValuesEDATETerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						addWithLastConsumed(
							$current,
							"dateValues",
							lv_dateValues_5_0,
							"org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.EDATE");
					}
				)
			)
		)
	)*
;

RULE_EDOUBLE : ('.' ('0'..'9')+|('0'..'9')+ '.' ('0'..'9')*) (('E'|'e') ('-'|'+'?) ('0'..'9')+)?;

RULE_EDATE : '0'..'9' '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' 'T' '0'..'9' '0'..'9' ':' '0'..'9' '0'..'9' ':' '0'..'9' '0'..'9' '.' '0'..'9' '0'..'9' '0'..'9' ('+'|'-') '0'..'9' '0'..'9' '0'..'9' '0'..'9';

RULE_EINT : '-'? ('0'..'9')+;

RULE_WS : (' '|'\t'|'\r'|'\n')+;
