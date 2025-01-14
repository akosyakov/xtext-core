/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalAssignmentsTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.assignments.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.assignments.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.assignments.services.AssignmentsTestLanguageGrammarAccess;

}

@parser::members {

 	private AssignmentsTestLanguageGrammarAccess grammarAccess;

    public InternalAssignmentsTestLanguageParser(TokenStream input, AssignmentsTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected AssignmentsTestLanguageGrammarAccess getGrammarAccess() {
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
			otherlv_0='simple'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSimpleKeyword_0_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getSingleSingleValueParserRuleCall_0_1_0_0());
						}
						lv_single_1_0=ruleSingleValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"single",
								lv_single_1_0,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.SingleValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getMultiMultiValueParserRuleCall_0_1_1_0());
						}
						lv_multi_2_0=ruleMultiValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"multi",
								lv_multi_2_0,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.MultiValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getSingleSingleDatatypeParserRuleCall_0_1_2_0());
						}
						lv_single_3_0=ruleSingleDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"single",
								lv_single_3_0,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.SingleDatatype");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getMultiMultiDatatypeParserRuleCall_0_1_3_0());
						}
						lv_multi_4_0=ruleMultiDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"multi",
								lv_multi_4_0,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.MultiDatatype");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_5='complex'
			{
				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getComplexKeyword_1_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getObjectSingleValueParserRuleCall_1_1_0_0());
						}
						lv_object_6_1=ruleSingleValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"object",
								lv_object_6_1,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.SingleValue");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getObjectMultiValueParserRuleCall_1_1_0_1());
						}
						lv_object_6_2=ruleMultiValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"object",
								lv_object_6_2,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.MultiValue");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getObjectSingleDatatypeParserRuleCall_1_1_0_2());
						}
						lv_object_6_3=ruleSingleDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"object",
								lv_object_6_3,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.SingleDatatype");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getObjectMultiDatatypeParserRuleCall_1_1_0_3());
						}
						lv_object_6_4=ruleMultiDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"object",
								lv_object_6_4,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.MultiDatatype");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleSingleValue
entryRuleSingleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleValueRule()); }
	iv_ruleSingleValue=ruleSingleValue
	{ $current=$iv_ruleSingleValue.current; }
	EOF;

// Rule SingleValue
ruleSingleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='id'
			{
				newLeafNode(otherlv_0, grammarAccess.getSingleValueAccess().getIdKeyword_0_0());
			}
			(
				(
					lv_value_1_0=RULE_ID
					{
						newLeafNode(lv_value_1_0, grammarAccess.getSingleValueAccess().getValueIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleValueRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		    |
		(
			otherlv_2='alternative'
			{
				newLeafNode(otherlv_2, grammarAccess.getSingleValueAccess().getAlternativeKeyword_1_0());
			}
			(
				(
					(
						lv_value_3_1=RULE_ID
						{
							newLeafNode(lv_value_3_1, grammarAccess.getSingleValueAccess().getValueIDTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSingleValueRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_3_1,
								"org.eclipse.xtext.common.Terminals.ID");
						}
						    |
						lv_value_3_2=RULE_STRING
						{
							newLeafNode(lv_value_3_2, grammarAccess.getSingleValueAccess().getValueSTRINGTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSingleValueRule());
							}
							setWithLastConsumed(
								$current,
								"value",
								lv_value_3_2,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
		)
		    |
		(
			otherlv_4='string'
			{
				newLeafNode(otherlv_4, grammarAccess.getSingleValueAccess().getStringKeyword_2_0());
			}
			(
				(
					lv_value_5_0=RULE_STRING
					{
						newLeafNode(lv_value_5_0, grammarAccess.getSingleValueAccess().getValueSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleValueRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleMultiValue
entryRuleMultiValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiValueRule()); }
	iv_ruleMultiValue=ruleMultiValue
	{ $current=$iv_ruleMultiValue.current; }
	EOF;

// Rule MultiValue
ruleMultiValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='ids'
			{
				newLeafNode(otherlv_0, grammarAccess.getMultiValueAccess().getIdsKeyword_0_0());
			}
			(
				(
					lv_value_1_0=RULE_ID
					{
						newLeafNode(lv_value_1_0, grammarAccess.getMultiValueAccess().getValueIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiValueRule());
						}
						addWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		    |
		(
			otherlv_2='alternatives'
			{
				newLeafNode(otherlv_2, grammarAccess.getMultiValueAccess().getAlternativesKeyword_1_0());
			}
			(
				(
					(
						lv_value_3_1=RULE_ID
						{
							newLeafNode(lv_value_3_1, grammarAccess.getMultiValueAccess().getValueIDTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiValueRule());
							}
							addWithLastConsumed(
								$current,
								"value",
								lv_value_3_1,
								"org.eclipse.xtext.common.Terminals.ID");
						}
						    |
						lv_value_3_2=RULE_STRING
						{
							newLeafNode(lv_value_3_2, grammarAccess.getMultiValueAccess().getValueSTRINGTerminalRuleCall_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiValueRule());
							}
							addWithLastConsumed(
								$current,
								"value",
								lv_value_3_2,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
		)
		    |
		(
			otherlv_4='strings'
			{
				newLeafNode(otherlv_4, grammarAccess.getMultiValueAccess().getStringsKeyword_2_0());
			}
			(
				(
					lv_value_5_0=RULE_STRING
					{
						newLeafNode(lv_value_5_0, grammarAccess.getMultiValueAccess().getValueSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiValueRule());
						}
						addWithLastConsumed(
							$current,
							"value",
							lv_value_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSingleDatatype
entryRuleSingleDatatype returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleDatatypeRule()); }
	iv_ruleSingleDatatype=ruleSingleDatatype
	{ $current=$iv_ruleSingleDatatype.current; }
	EOF;

// Rule SingleDatatype
ruleSingleDatatype returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='datatypeid'
			{
				newLeafNode(otherlv_0, grammarAccess.getSingleDatatypeAccess().getDatatypeidKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSingleDatatypeAccess().getValueIdDatatypeParserRuleCall_0_1_0());
					}
					lv_value_1_0=ruleIdDatatype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleDatatypeRule());
						}
						set(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.IdDatatype");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='datatypealternative'
			{
				newLeafNode(otherlv_2, grammarAccess.getSingleDatatypeAccess().getDatatypealternativeKeyword_1_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSingleDatatypeAccess().getValueIdDatatypeParserRuleCall_1_1_0_0());
						}
						lv_value_3_1=ruleIdDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSingleDatatypeRule());
							}
							set(
								$current,
								"value",
								lv_value_3_1,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.IdDatatype");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getSingleDatatypeAccess().getValueStringDatatypeParserRuleCall_1_1_0_1());
						}
						lv_value_3_2=ruleStringDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSingleDatatypeRule());
							}
							set(
								$current,
								"value",
								lv_value_3_2,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.StringDatatype");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_4='datatypestring'
			{
				newLeafNode(otherlv_4, grammarAccess.getSingleDatatypeAccess().getDatatypestringKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSingleDatatypeAccess().getValueStringDatatypeParserRuleCall_2_1_0());
					}
					lv_value_5_0=ruleStringDatatype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleDatatypeRule());
						}
						set(
							$current,
							"value",
							lv_value_5_0,
							"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.StringDatatype");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleMultiDatatype
entryRuleMultiDatatype returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiDatatypeRule()); }
	iv_ruleMultiDatatype=ruleMultiDatatype
	{ $current=$iv_ruleMultiDatatype.current; }
	EOF;

// Rule MultiDatatype
ruleMultiDatatype returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='datatypeids'
			{
				newLeafNode(otherlv_0, grammarAccess.getMultiDatatypeAccess().getDatatypeidsKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiDatatypeAccess().getValueIdDatatypeParserRuleCall_0_1_0());
					}
					lv_value_1_0=ruleIdDatatype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiDatatypeRule());
						}
						add(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.IdDatatype");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='datatypealternatives'
			{
				newLeafNode(otherlv_2, grammarAccess.getMultiDatatypeAccess().getDatatypealternativesKeyword_1_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiDatatypeAccess().getValueIdDatatypeParserRuleCall_1_1_0_0());
						}
						lv_value_3_1=ruleIdDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiDatatypeRule());
							}
							add(
								$current,
								"value",
								lv_value_3_1,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.IdDatatype");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getMultiDatatypeAccess().getValueStringDatatypeParserRuleCall_1_1_0_1());
						}
						lv_value_3_2=ruleStringDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiDatatypeRule());
							}
							add(
								$current,
								"value",
								lv_value_3_2,
								"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.StringDatatype");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_4='datatypestrings'
			{
				newLeafNode(otherlv_4, grammarAccess.getMultiDatatypeAccess().getDatatypestringsKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiDatatypeAccess().getValueStringDatatypeParserRuleCall_2_1_0());
					}
					lv_value_5_0=ruleStringDatatype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiDatatypeRule());
						}
						add(
							$current,
							"value",
							lv_value_5_0,
							"org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.StringDatatype");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleIdDatatype
entryRuleIdDatatype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIdDatatypeRule()); }
	iv_ruleIdDatatype=ruleIdDatatype
	{ $current=$iv_ruleIdDatatype.current.getText(); }
	EOF;

// Rule IdDatatype
ruleIdDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getIdDatatypeAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleStringDatatype
entryRuleStringDatatype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getStringDatatypeRule()); }
	iv_ruleStringDatatype=ruleStringDatatype
	{ $current=$iv_ruleStringDatatype.current.getText(); }
	EOF;

// Rule StringDatatype
ruleStringDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
		newLeafNode(this_STRING_0, grammarAccess.getStringDatatypeAccess().getSTRINGTerminalRuleCall());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
