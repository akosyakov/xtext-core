/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug385636;

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
import org.eclipse.xtext.resource.services.Bug385636GrammarAccess;

}

@parser::members {

 	private Bug385636GrammarAccess grammarAccess;

    public InternalBug385636Parser(TokenStream input, Bug385636GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected Bug385636GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getProgramAccess().getDefineDefineVariablesParserRuleCall_0_0());
				}
				lv_define_0_0=ruleDefineVariables
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"define",
						lv_define_0_0,
						"org.eclipse.xtext.resource.Bug385636.DefineVariables");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_1_0());
				}
				lv_statements_1_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"statements",
						lv_statements_1_0,
						"org.eclipse.xtext.resource.Bug385636.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_2='END'
		{
			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getENDKeyword_2());
		}
	)
;

// Entry rule entryRuleDefineVariables
entryRuleDefineVariables returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefineVariablesRule()); }
	iv_ruleDefineVariables=ruleDefineVariables
	{ $current=$iv_ruleDefineVariables.current; }
	EOF;

// Rule DefineVariables
ruleDefineVariables returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VARIABLES'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefineVariablesAccess().getVARIABLESKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefineVariablesAccess().getVariablesDefineVariableParserRuleCall_1_0());
				}
				lv_variables_1_0=ruleDefineVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefineVariablesRule());
					}
					add(
						$current,
						"variables",
						lv_variables_1_0,
						"org.eclipse.xtext.resource.Bug385636.DefineVariable");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='ENDVARIABLES'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefineVariablesAccess().getENDVARIABLESKeyword_2());
		}
	)
;

// Entry rule entryRuleDefineVariable
entryRuleDefineVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefineVariableRule()); }
	iv_ruleDefineVariable=ruleDefineVariable
	{ $current=$iv_ruleDefineVariable.current; }
	EOF;

// Rule DefineVariable
ruleDefineVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='NAME'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefineVariableAccess().getNAMEKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDefineVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefineVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleNVariableAccess
entryRuleNVariableAccess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNVariableAccessRule()); }
	iv_ruleNVariableAccess=ruleNVariableAccess
	{ $current=$iv_ruleNVariableAccess.current; }
	EOF;

// Rule NVariableAccess
ruleNVariableAccess returns [EObject current=null]
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
					$current = createModelElement(grammarAccess.getNVariableAccessRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getNVariableAccessAccess().getVariableDefineVariableCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getExpression_VariableNameParserRuleCall_0());
		}
		this_Expression_VariableName_0=ruleExpression_VariableName
		{
			$current = $this_Expression_VariableName_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				otherlv_1='C1'
				{
					newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getC1Keyword_1_0_0());
				}
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getStatementAccess().getExpression_Larger_EqualLeftAction_1_0_1(),
							$current);
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getStatementAccess().getRightExpression_VariableNameParserRuleCall_1_0_2_0());
						}
						lv_right_3_0=ruleExpression_VariableName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStatementRule());
							}
							set(
								$current,
								"right",
								lv_right_3_0,
								"org.eclipse.xtext.resource.Bug385636.Expression_VariableName");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_4='C2'
				{
					newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getC2Keyword_1_1_0());
				}
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getStatementAccess().getExpression_SmallerLeftAction_1_1_1(),
							$current);
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getStatementAccess().getRightExpression_VariableNameParserRuleCall_1_1_2_0());
						}
						lv_right_6_0=ruleExpression_VariableName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStatementRule());
							}
							set(
								$current,
								"right",
								lv_right_6_0,
								"org.eclipse.xtext.resource.Bug385636.Expression_VariableName");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_7='C3'
				{
					newLeafNode(otherlv_7, grammarAccess.getStatementAccess().getC3Keyword_1_2_0());
				}
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getStatementAccess().getExpression_Smaller_EqualLeftAction_1_2_1(),
							$current);
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getStatementAccess().getRightExpression_VariableNameParserRuleCall_1_2_2_0());
						}
						lv_right_9_0=ruleExpression_VariableName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStatementRule());
							}
							set(
								$current,
								"right",
								lv_right_9_0,
								"org.eclipse.xtext.resource.Bug385636.Expression_VariableName");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_10='C4'
				{
					newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getC4Keyword_1_3_0());
				}
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getStatementAccess().getExpression_EqualLeftAction_1_3_1(),
							$current);
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getStatementAccess().getRightExpression_VariableNameParserRuleCall_1_3_2_0());
						}
						lv_right_12_0=ruleExpression_VariableName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStatementRule());
							}
							set(
								$current,
								"right",
								lv_right_12_0,
								"org.eclipse.xtext.resource.Bug385636.Expression_VariableName");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_13='C5'
				{
					newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getC5Keyword_1_4_0());
				}
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getStatementAccess().getExpression_Not_EqualLeftAction_1_4_1(),
							$current);
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getStatementAccess().getRightExpression_VariableNameParserRuleCall_1_4_2_0());
						}
						lv_right_15_0=ruleExpression_VariableName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStatementRule());
							}
							set(
								$current,
								"right",
								lv_right_15_0,
								"org.eclipse.xtext.resource.Bug385636.Expression_VariableName");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					otherlv_16='C6'
					{
						newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getC6Keyword_1_5_0_0());
					}
					otherlv_17='C7'
					{
						newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getC7Keyword_1_5_0_1());
					}
				)
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getStatementAccess().getExpression_Not_LessLeftAction_1_5_1(),
							$current);
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getStatementAccess().getRightExpression_VariableNameParserRuleCall_1_5_2_0());
						}
						lv_right_19_0=ruleExpression_VariableName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStatementRule());
							}
							set(
								$current,
								"right",
								lv_right_19_0,
								"org.eclipse.xtext.resource.Bug385636.Expression_VariableName");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					otherlv_20='C6'
					{
						newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getC6Keyword_1_6_0_0());
					}
					otherlv_21='C8'
					{
						newLeafNode(otherlv_21, grammarAccess.getStatementAccess().getC8Keyword_1_6_0_1());
					}
				)
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getStatementAccess().getExpression_Not_GreaterLeftAction_1_6_1(),
							$current);
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getStatementAccess().getRightExpression_VariableNameParserRuleCall_1_6_2_0());
						}
						lv_right_23_0=ruleExpression_VariableName
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStatementRule());
							}
							set(
								$current,
								"right",
								lv_right_23_0,
								"org.eclipse.xtext.resource.Bug385636.Expression_VariableName");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleExpression_VariableName
entryRuleExpression_VariableName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression_VariableNameRule()); }
	iv_ruleExpression_VariableName=ruleExpression_VariableName
	{ $current=$iv_ruleExpression_VariableName.current; }
	EOF;

// Rule Expression_VariableName
ruleExpression_VariableName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExpression_VariableNameAccess().getVariableNVariableAccessParserRuleCall_0());
			}
			lv_variable_0_0=ruleNVariableAccess
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getExpression_VariableNameRule());
				}
				set(
					$current,
					"variable",
					lv_variable_0_0,
					"org.eclipse.xtext.resource.Bug385636.NVariableAccess");
				afterParserOrEnumRuleCall();
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
