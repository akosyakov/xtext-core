/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalUnassignedTextTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parsetree.unassignedtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parsetree.unassignedtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parsetree.unassignedtext.services.UnassignedTextTestLanguageGrammarAccess;

}

@parser::members {

 	private UnassignedTextTestLanguageGrammarAccess grammarAccess;

    public InternalUnassignedTextTestLanguageParser(TokenStream input, UnassignedTextTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected UnassignedTextTestLanguageGrammarAccess getGrammarAccess() {
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
		{
			newCompositeNode(grammarAccess.getModelAccess().getCaseInsensitiveKeywordRuleParserRuleCall_0());
		}
		this_CaseInsensitiveKeywordRule_0=ruleCaseInsensitiveKeywordRule
		{
			$current = $this_CaseInsensitiveKeywordRule_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getPluralRuleParserRuleCall_1());
		}
		this_PluralRule_1=rulePluralRule
		{
			$current = $this_PluralRule_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getMultiRuleParserRuleCall_2());
		}
		this_MultiRule_2=ruleMultiRule
		{
			$current = $this_MultiRule_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getDatatypeRuleParserRuleCall_3());
		}
		this_DatatypeRule_3=ruleDatatypeRule
		{
			$current = $this_DatatypeRule_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getCommonTerminalsRuleParserRuleCall_4());
		}
		this_CommonTerminalsRule_4=ruleCommonTerminalsRule
		{
			$current = $this_CommonTerminalsRule_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getGroupRuleParserRuleCall_5());
		}
		this_GroupRule_5=ruleGroupRule
		{
			$current = $this_GroupRule_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCaseInsensitiveKeywordRule
entryRuleCaseInsensitiveKeywordRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCaseInsensitiveKeywordRuleRule()); }
	iv_ruleCaseInsensitiveKeywordRule=ruleCaseInsensitiveKeywordRule
	{ $current=$iv_ruleCaseInsensitiveKeywordRule.current; }
	EOF;

// Rule CaseInsensitiveKeywordRule
ruleCaseInsensitiveKeywordRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CaseInsensitiveKeyword_0=RULE_CASEINSENSITIVEKEYWORD
		{
			newLeafNode(this_CaseInsensitiveKeyword_0, grammarAccess.getCaseInsensitiveKeywordRuleAccess().getCaseInsensitiveKeywordTerminalRuleCall_0());
		}
		(
			(
				lv_val_1_0=RULE_INT
				{
					newLeafNode(lv_val_1_0, grammarAccess.getCaseInsensitiveKeywordRuleAccess().getValINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCaseInsensitiveKeywordRuleRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRulePluralRule
entryRulePluralRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPluralRuleRule()); }
	iv_rulePluralRule=rulePluralRule
	{ $current=$iv_rulePluralRule.current; }
	EOF;

// Rule PluralRule
rulePluralRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='contents:'
		{
			newLeafNode(otherlv_0, grammarAccess.getPluralRuleAccess().getContentsKeyword_0());
		}
		(
			(
				lv_count_1_0=RULE_INT
				{
					newLeafNode(lv_count_1_0, grammarAccess.getPluralRuleAccess().getCountINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPluralRuleRule());
					}
					setWithLastConsumed(
						$current,
						"count",
						lv_count_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		this_Plural_2=RULE_PLURAL
		{
			newLeafNode(this_Plural_2, grammarAccess.getPluralRuleAccess().getPluralTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleMultiRule
entryRuleMultiRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiRuleRule()); }
	iv_ruleMultiRule=ruleMultiRule
	{ $current=$iv_ruleMultiRule.current; }
	EOF;

// Rule MultiRule
ruleMultiRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='multi'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiRuleAccess().getMultiKeyword_0());
		}
		(
			(
				lv_val_1_0=RULE_INT
				{
					newLeafNode(lv_val_1_0, grammarAccess.getMultiRuleAccess().getValINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMultiRuleRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		this_Multi_2=RULE_MULTI
		{
			newLeafNode(this_Multi_2, grammarAccess.getMultiRuleAccess().getMultiTerminalRuleCall_2());
		}
		this_Multi_3=RULE_MULTI
		{
			newLeafNode(this_Multi_3, grammarAccess.getMultiRuleAccess().getMultiTerminalRuleCall_3());
		}
		this_Multi_4=RULE_MULTI
		{
			newLeafNode(this_Multi_4, grammarAccess.getMultiRuleAccess().getMultiTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleDatatypeRule
entryRuleDatatypeRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDatatypeRuleRule()); }
	iv_ruleDatatypeRule=ruleDatatypeRule
	{ $current=$iv_ruleDatatypeRule.current; }
	EOF;

// Rule DatatypeRule
ruleDatatypeRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getDatatypeRuleAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_val_1_0=RULE_INT
				{
					newLeafNode(lv_val_1_0, grammarAccess.getDatatypeRuleAccess().getValINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatatypeRuleRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getDatatypeRuleAccess().getDatatypeParserRuleCall_2());
		}
		ruleDatatype
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDatatype
entryRuleDatatype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatatypeRule()); }
	iv_ruleDatatype=ruleDatatype
	{ $current=$iv_ruleDatatype.current.getText(); }
	EOF;

// Rule Datatype
ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='str'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDatatypeAccess().getStrKeyword_0());
		}
		    |
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getDatatypeAccess().getINTTerminalRuleCall_1());
		}
		    |
		{
			newCompositeNode(grammarAccess.getDatatypeAccess().getDatatype2ParserRuleCall_2());
		}
		this_Datatype2_2=ruleDatatype2
		{
			$current.merge(this_Datatype2_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDatatype2
entryRuleDatatype2 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatatype2Rule()); }
	iv_ruleDatatype2=ruleDatatype2
	{ $current=$iv_ruleDatatype2.current.getText(); }
	EOF;

// Rule Datatype2
ruleDatatype2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getDatatype2Access().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleCommonTerminalsRule
entryRuleCommonTerminalsRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommonTerminalsRuleRule()); }
	iv_ruleCommonTerminalsRule=ruleCommonTerminalsRule
	{ $current=$iv_ruleCommonTerminalsRule.current; }
	EOF;

// Rule CommonTerminalsRule
ruleCommonTerminalsRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='terminals'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommonTerminalsRuleAccess().getTerminalsKeyword_0());
		}
		this_ID_1=RULE_ID
		{
			newLeafNode(this_ID_1, grammarAccess.getCommonTerminalsRuleAccess().getIDTerminalRuleCall_1());
		}
		this_INT_2=RULE_INT
		{
			newLeafNode(this_INT_2, grammarAccess.getCommonTerminalsRuleAccess().getINTTerminalRuleCall_2());
		}
		this_STRING_3=RULE_STRING
		{
			newLeafNode(this_STRING_3, grammarAccess.getCommonTerminalsRuleAccess().getSTRINGTerminalRuleCall_3());
		}
		(
			(
				lv_val_4_0=RULE_ID
				{
					newLeafNode(lv_val_4_0, grammarAccess.getCommonTerminalsRuleAccess().getValIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommonTerminalsRuleRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleGroupRule
entryRuleGroupRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGroupRuleRule()); }
	iv_ruleGroupRule=ruleGroupRule
	{ $current=$iv_ruleGroupRule.current; }
	EOF;

// Rule GroupRule
ruleGroupRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGroupRuleAccess().getGroupRuleAction_0(),
					$current);
			}
		)
		otherlv_1='group'
		{
			newLeafNode(otherlv_1, grammarAccess.getGroupRuleAccess().getGroupKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getGroupRuleAccess().getGroupDataTypeRuleParserRuleCall_2());
		}
		ruleGroupDataTypeRule
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGroupDataTypeRule
entryRuleGroupDataTypeRule returns [String current=null]:
	{ newCompositeNode(grammarAccess.getGroupDataTypeRuleRule()); }
	iv_ruleGroupDataTypeRule=ruleGroupDataTypeRule
	{ $current=$iv_ruleGroupDataTypeRule.current.getText(); }
	EOF;

// Rule GroupDataTypeRule
ruleGroupDataTypeRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='this'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGroupDataTypeRuleAccess().getThisKeyword_0());
		}
		kw='is'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGroupDataTypeRuleAccess().getIsKeyword_1());
		}
		kw='a'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGroupDataTypeRuleAccess().getAKeyword_2());
		}
		kw='test'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGroupDataTypeRuleAccess().getTestKeyword_3());
		}
	)
;

RULE_CASEINSENSITIVEKEYWORD : ('k'|'K') ('e'|'E') ('y'|'Y') ('w'|'W') ('o'|'O') ('r'|'R') ('d'|'D');

RULE_PLURAL : ('item'|'items');

RULE_MULTI : 'a' 'b'? 'c'+ 'd'* ('e'|'f') (('g'|'h')|'i'+) RULE_MULTI2 '0'..'9' ('0'..'9')+;

fragment RULE_MULTI2 : 'j';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
