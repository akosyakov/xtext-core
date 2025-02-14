/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalMetamodelRefTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.metamodelreferencing.tests.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.metamodelreferencing.tests.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.metamodelreferencing.tests.services.MetamodelRefTestLanguageGrammarAccess;

}

@parser::members {

 	private MetamodelRefTestLanguageGrammarAccess grammarAccess;

    public InternalMetamodelRefTestLanguageParser(TokenStream input, MetamodelRefTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Foo";
   	}

   	@Override
   	protected MetamodelRefTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFoo
entryRuleFoo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFooRule()); }
	iv_ruleFoo=ruleFoo
	{ $current=$iv_ruleFoo.current; }
	EOF;

// Rule Foo
ruleFoo returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getFooAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFooRule());
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
				{
					newCompositeNode(grammarAccess.getFooAccess().getNameRefsNameRefParserRuleCall_1_0());
				}
				lv_nameRefs_1_0=ruleNameRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFooRule());
					}
					add(
						$current,
						"nameRefs",
						lv_nameRefs_1_0,
						"org.eclipse.xtext.metamodelreferencing.tests.MetamodelRefTestLanguage.NameRef");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleNameRef
entryRuleNameRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNameRefRule()); }
	iv_ruleNameRef=ruleNameRef
	{ $current=$iv_ruleNameRef.current; }
	EOF;

// Rule NameRef
ruleNameRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNameRefRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getNameRefAccess().getRuleParserRuleCrossReference_0());
			}
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
