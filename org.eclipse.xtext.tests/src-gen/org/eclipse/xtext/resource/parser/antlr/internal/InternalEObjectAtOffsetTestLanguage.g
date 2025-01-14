/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalEObjectAtOffsetTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.resource.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.resource.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.resource.services.EObjectAtOffsetTestLanguageGrammarAccess;

}

@parser::members {

 	private EObjectAtOffsetTestLanguageGrammarAccess grammarAccess;

    public InternalEObjectAtOffsetTestLanguageParser(TokenStream input, EObjectAtOffsetTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected EObjectAtOffsetTestLanguageGrammarAccess getGrammarAccess() {
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
				{
					newCompositeNode(grammarAccess.getModelAccess().getFoosFooParserRuleCall_0_0());
				}
				lv_foos_0_0=ruleFoo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"foos",
						lv_foos_0_0,
						"org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage.Foo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getBarsAbstractBarParserRuleCall_1_0());
				}
				lv_bars_1_0=ruleAbstractBar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"bars",
						lv_bars_1_0,
						"org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage.AbstractBar");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
;

// Entry rule entryRuleAbstractBar
entryRuleAbstractBar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractBarRule()); }
	iv_ruleAbstractBar=ruleAbstractBar
	{ $current=$iv_ruleAbstractBar.current; }
	EOF;

// Rule AbstractBar
ruleAbstractBar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='zonk'
			{
				newLeafNode(otherlv_0, grammarAccess.getAbstractBarAccess().getZonkKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				newLeafNode(this_INT_1, grammarAccess.getAbstractBarAccess().getINTTerminalRuleCall_1());
			}
		)?
		{
			newCompositeNode(grammarAccess.getAbstractBarAccess().getBarParserRuleCall_2());
		}
		this_Bar_2=ruleBar
		{
			$current = $this_Bar_2.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAbstractBarAccess().getFooBarBarAction_3_0(),
						$current);
				}
			)
			otherlv_4='foobar'
			{
				newLeafNode(otherlv_4, grammarAccess.getAbstractBarAccess().getFoobarKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAbstractBarRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getAbstractBarAccess().getFooFooCrossReference_3_2_0());
					}
					ruleQualifiedNameWithOtherDelim
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbstractBarRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAbstractBarAccess().getFooFooCrossReference_4_0());
				}
				ruleQualifiedNameWithOtherDelim
				{
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleBar
entryRuleBar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBarRule()); }
	iv_ruleBar=ruleBar
	{ $current=$iv_ruleBar.current; }
	EOF;

// Rule Bar
ruleBar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='bar'
		{
			newLeafNode(otherlv_0, grammarAccess.getBarAccess().getBarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBarAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBarRule());
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
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBarRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBarAccess().getFooFooCrossReference_2_0());
				}
				ruleQualifiedNameWithOtherDelim
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getBarAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBarRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getBarAccess().getFooFooCrossReference_3_1_0());
					}
					ruleQualifiedNameWithOtherDelim
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

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
		otherlv_0='foo'
		{
			newLeafNode(otherlv_0, grammarAccess.getFooAccess().getFooKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFooAccess().getNameQualifiedNameWithOtherDelimParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedNameWithOtherDelim
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFooRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage.QualifiedNameWithOtherDelim");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedNameWithOtherDelim
entryRuleQualifiedNameWithOtherDelim returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithOtherDelimRule()); }
	iv_ruleQualifiedNameWithOtherDelim=ruleQualifiedNameWithOtherDelim
	{ $current=$iv_ruleQualifiedNameWithOtherDelim.current.getText(); }
	EOF;

// Rule QualifiedNameWithOtherDelim
ruleQualifiedNameWithOtherDelim returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameWithOtherDelimAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='='
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameWithOtherDelimAccess().getEqualsSignKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getQualifiedNameWithOtherDelimAccess().getQualifiedNameParserRuleCall_1_1());
			}
			this_QualifiedName_2=ruleQualifiedName
			{
				$current.merge(this_QualifiedName_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
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
