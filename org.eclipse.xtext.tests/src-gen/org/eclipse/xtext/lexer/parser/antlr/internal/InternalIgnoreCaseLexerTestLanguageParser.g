/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
parser grammar InternalIgnoreCaseLexerTestLanguageParser;

options {
	tokenVocab=InternalIgnoreCaseLexerTestLanguageLexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
package org.eclipse.xtext.lexer.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.lexer.services.IgnoreCaseLexerTestLanguageGrammarAccess;

}

@members {

 	private IgnoreCaseLexerTestLanguageGrammarAccess grammarAccess;

    public InternalIgnoreCaseLexerTestLanguageParser(TokenStream input, IgnoreCaseLexerTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected IgnoreCaseLexerTestLanguageGrammarAccess getGrammarAccess() {
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
		otherlv_0=Case
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getCaseKeyword_0());
		}
		(
			otherlv_1=Foo
			{
				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getFooKeyword_1());
			}
		)?
		(
			(
				lv_value_2_0=Case
				{
					newLeafNode(lv_value_2_0, grammarAccess.getModelAccess().getValueCaSeKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed($current, "value", lv_value_2_0, "CaSe");
				}
			)
		)
	)
;
