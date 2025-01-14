/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.resource.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug385636GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.Bug385636.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDefineAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDefineDefineVariablesParserRuleCall_0_0 = (RuleCall)cDefineAssignment_0.eContents().get(0);
		private final Assignment cStatementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_1_0 = (RuleCall)cStatementsAssignment_1.eContents().get(0);
		private final Keyword cENDKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Program: define=DefineVariables statements+=Statement* 'END' ;
		@Override public ParserRule getRule() { return rule; }
		
		//define=DefineVariables statements+=Statement* 'END'
		public Group getGroup() { return cGroup; }
		
		//define=DefineVariables
		public Assignment getDefineAssignment_0() { return cDefineAssignment_0; }
		
		//DefineVariables
		public RuleCall getDefineDefineVariablesParserRuleCall_0_0() { return cDefineDefineVariablesParserRuleCall_0_0; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_1() { return cStatementsAssignment_1; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_1_0() { return cStatementsStatementParserRuleCall_1_0; }
		
		//'END'
		public Keyword getENDKeyword_2() { return cENDKeyword_2; }
	}
	public class DefineVariablesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.Bug385636.DefineVariables");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVARIABLESKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVariablesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVariablesDefineVariableParserRuleCall_1_0 = (RuleCall)cVariablesAssignment_1.eContents().get(0);
		private final Keyword cENDVARIABLESKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DefineVariables: 'VARIABLES' variables += DefineVariable+ 'ENDVARIABLES';
		@Override public ParserRule getRule() { return rule; }
		
		//'VARIABLES' variables += DefineVariable+ 'ENDVARIABLES'
		public Group getGroup() { return cGroup; }
		
		//'VARIABLES'
		public Keyword getVARIABLESKeyword_0() { return cVARIABLESKeyword_0; }
		
		//variables += DefineVariable+
		public Assignment getVariablesAssignment_1() { return cVariablesAssignment_1; }
		
		//DefineVariable
		public RuleCall getVariablesDefineVariableParserRuleCall_1_0() { return cVariablesDefineVariableParserRuleCall_1_0; }
		
		//'ENDVARIABLES'
		public Keyword getENDVARIABLESKeyword_2() { return cENDVARIABLESKeyword_2; }
	}
	public class DefineVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.Bug385636.DefineVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNAMEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//DefineVariable: 'NAME' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'NAME' name=ID
		public Group getGroup() { return cGroup; }
		
		//'NAME'
		public Keyword getNAMEKeyword_0() { return cNAMEKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class NVariableAccessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.Bug385636.NVariableAccess");
		private final Assignment cVariableAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cVariableDefineVariableCrossReference_0 = (CrossReference)cVariableAssignment.eContents().get(0);
		private final RuleCall cVariableDefineVariableIDTerminalRuleCall_0_1 = (RuleCall)cVariableDefineVariableCrossReference_0.eContents().get(1);
		
		//NVariableAccess: variable=[DefineVariable];
		@Override public ParserRule getRule() { return rule; }
		
		//variable=[DefineVariable]
		public Assignment getVariableAssignment() { return cVariableAssignment; }
		
		//[DefineVariable]
		public CrossReference getVariableDefineVariableCrossReference_0() { return cVariableDefineVariableCrossReference_0; }
		
		//ID
		public RuleCall getVariableDefineVariableIDTerminalRuleCall_0_1() { return cVariableDefineVariableIDTerminalRuleCall_0_1; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.Bug385636.Statement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpression_VariableNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cC1Keyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Action cExpression_Larger_EqualLeftAction_1_0_1 = (Action)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightExpression_VariableNameParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cC2Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Action cExpression_SmallerLeftAction_1_1_1 = (Action)cGroup_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRightExpression_VariableNameParserRuleCall_1_1_2_0 = (RuleCall)cRightAssignment_1_1_2.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cC3Keyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Action cExpression_Smaller_EqualLeftAction_1_2_1 = (Action)cGroup_1_2.eContents().get(1);
		private final Assignment cRightAssignment_1_2_2 = (Assignment)cGroup_1_2.eContents().get(2);
		private final RuleCall cRightExpression_VariableNameParserRuleCall_1_2_2_0 = (RuleCall)cRightAssignment_1_2_2.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cAlternatives_1.eContents().get(3);
		private final Keyword cC4Keyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Action cExpression_EqualLeftAction_1_3_1 = (Action)cGroup_1_3.eContents().get(1);
		private final Assignment cRightAssignment_1_3_2 = (Assignment)cGroup_1_3.eContents().get(2);
		private final RuleCall cRightExpression_VariableNameParserRuleCall_1_3_2_0 = (RuleCall)cRightAssignment_1_3_2.eContents().get(0);
		private final Group cGroup_1_4 = (Group)cAlternatives_1.eContents().get(4);
		private final Keyword cC5Keyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Action cExpression_Not_EqualLeftAction_1_4_1 = (Action)cGroup_1_4.eContents().get(1);
		private final Assignment cRightAssignment_1_4_2 = (Assignment)cGroup_1_4.eContents().get(2);
		private final RuleCall cRightExpression_VariableNameParserRuleCall_1_4_2_0 = (RuleCall)cRightAssignment_1_4_2.eContents().get(0);
		private final Group cGroup_1_5 = (Group)cAlternatives_1.eContents().get(5);
		private final Group cGroup_1_5_0 = (Group)cGroup_1_5.eContents().get(0);
		private final Keyword cC6Keyword_1_5_0_0 = (Keyword)cGroup_1_5_0.eContents().get(0);
		private final Keyword cC7Keyword_1_5_0_1 = (Keyword)cGroup_1_5_0.eContents().get(1);
		private final Action cExpression_Not_LessLeftAction_1_5_1 = (Action)cGroup_1_5.eContents().get(1);
		private final Assignment cRightAssignment_1_5_2 = (Assignment)cGroup_1_5.eContents().get(2);
		private final RuleCall cRightExpression_VariableNameParserRuleCall_1_5_2_0 = (RuleCall)cRightAssignment_1_5_2.eContents().get(0);
		private final Group cGroup_1_6 = (Group)cAlternatives_1.eContents().get(6);
		private final Group cGroup_1_6_0 = (Group)cGroup_1_6.eContents().get(0);
		private final Keyword cC6Keyword_1_6_0_0 = (Keyword)cGroup_1_6_0.eContents().get(0);
		private final Keyword cC8Keyword_1_6_0_1 = (Keyword)cGroup_1_6_0.eContents().get(1);
		private final Action cExpression_Not_GreaterLeftAction_1_6_1 = (Action)cGroup_1_6.eContents().get(1);
		private final Assignment cRightAssignment_1_6_2 = (Assignment)cGroup_1_6.eContents().get(2);
		private final RuleCall cRightExpression_VariableNameParserRuleCall_1_6_2_0 = (RuleCall)cRightAssignment_1_6_2.eContents().get(0);
		
		//// Comparisons: left associative, priority 2
		//Statement returns Expression:
		//    Expression_VariableName (
		//        (('C1') {Expression_Larger_Equal.left=current} right=Expression_VariableName) |
		//        (('C2') {Expression_Smaller.left=current} right=Expression_VariableName) |
		//        (('C3') {Expression_Smaller_Equal.left=current} right=Expression_VariableName) |
		//        (('C4') {Expression_Equal.left=current} right=Expression_VariableName) |
		//        (('C5') {Expression_Not_Equal.left=current} right=Expression_VariableName)|
		//        (('C6' 'C7') {Expression_Not_Less.left=current} right=Expression_VariableName) |
		//        (('C6' 'C8') {Expression_Not_Greater.left=current} right=Expression_VariableName)
		//    )*;
		@Override public ParserRule getRule() { return rule; }
		
		//Expression_VariableName (
		//    (('C1') {Expression_Larger_Equal.left=current} right=Expression_VariableName) |
		//    (('C2') {Expression_Smaller.left=current} right=Expression_VariableName) |
		//    (('C3') {Expression_Smaller_Equal.left=current} right=Expression_VariableName) |
		//    (('C4') {Expression_Equal.left=current} right=Expression_VariableName) |
		//    (('C5') {Expression_Not_Equal.left=current} right=Expression_VariableName)|
		//    (('C6' 'C7') {Expression_Not_Less.left=current} right=Expression_VariableName) |
		//    (('C6' 'C8') {Expression_Not_Greater.left=current} right=Expression_VariableName)
		//)*
		public Group getGroup() { return cGroup; }
		
		//Expression_VariableName
		public RuleCall getExpression_VariableNameParserRuleCall_0() { return cExpression_VariableNameParserRuleCall_0; }
		
		//(
		//       (('C1') {Expression_Larger_Equal.left=current} right=Expression_VariableName) |
		//       (('C2') {Expression_Smaller.left=current} right=Expression_VariableName) |
		//       (('C3') {Expression_Smaller_Equal.left=current} right=Expression_VariableName) |
		//       (('C4') {Expression_Equal.left=current} right=Expression_VariableName) |
		//       (('C5') {Expression_Not_Equal.left=current} right=Expression_VariableName)|
		//       (('C6' 'C7') {Expression_Not_Less.left=current} right=Expression_VariableName) |
		//       (('C6' 'C8') {Expression_Not_Greater.left=current} right=Expression_VariableName)
		//   )*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//(('C1') {Expression_Larger_Equal.left=current} right=Expression_VariableName)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//('C1')
		public Keyword getC1Keyword_1_0_0() { return cC1Keyword_1_0_0; }
		
		//{Expression_Larger_Equal.left=current}
		public Action getExpression_Larger_EqualLeftAction_1_0_1() { return cExpression_Larger_EqualLeftAction_1_0_1; }
		
		//right=Expression_VariableName
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//Expression_VariableName
		public RuleCall getRightExpression_VariableNameParserRuleCall_1_0_2_0() { return cRightExpression_VariableNameParserRuleCall_1_0_2_0; }
		
		//(('C2') {Expression_Smaller.left=current} right=Expression_VariableName)
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//('C2')
		public Keyword getC2Keyword_1_1_0() { return cC2Keyword_1_1_0; }
		
		//{Expression_Smaller.left=current}
		public Action getExpression_SmallerLeftAction_1_1_1() { return cExpression_SmallerLeftAction_1_1_1; }
		
		//right=Expression_VariableName
		public Assignment getRightAssignment_1_1_2() { return cRightAssignment_1_1_2; }
		
		//Expression_VariableName
		public RuleCall getRightExpression_VariableNameParserRuleCall_1_1_2_0() { return cRightExpression_VariableNameParserRuleCall_1_1_2_0; }
		
		//(('C3') {Expression_Smaller_Equal.left=current} right=Expression_VariableName)
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//('C3')
		public Keyword getC3Keyword_1_2_0() { return cC3Keyword_1_2_0; }
		
		//{Expression_Smaller_Equal.left=current}
		public Action getExpression_Smaller_EqualLeftAction_1_2_1() { return cExpression_Smaller_EqualLeftAction_1_2_1; }
		
		//right=Expression_VariableName
		public Assignment getRightAssignment_1_2_2() { return cRightAssignment_1_2_2; }
		
		//Expression_VariableName
		public RuleCall getRightExpression_VariableNameParserRuleCall_1_2_2_0() { return cRightExpression_VariableNameParserRuleCall_1_2_2_0; }
		
		//(('C4') {Expression_Equal.left=current} right=Expression_VariableName)
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//('C4')
		public Keyword getC4Keyword_1_3_0() { return cC4Keyword_1_3_0; }
		
		//{Expression_Equal.left=current}
		public Action getExpression_EqualLeftAction_1_3_1() { return cExpression_EqualLeftAction_1_3_1; }
		
		//right=Expression_VariableName
		public Assignment getRightAssignment_1_3_2() { return cRightAssignment_1_3_2; }
		
		//Expression_VariableName
		public RuleCall getRightExpression_VariableNameParserRuleCall_1_3_2_0() { return cRightExpression_VariableNameParserRuleCall_1_3_2_0; }
		
		//(('C5') {Expression_Not_Equal.left=current} right=Expression_VariableName)
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//('C5')
		public Keyword getC5Keyword_1_4_0() { return cC5Keyword_1_4_0; }
		
		//{Expression_Not_Equal.left=current}
		public Action getExpression_Not_EqualLeftAction_1_4_1() { return cExpression_Not_EqualLeftAction_1_4_1; }
		
		//right=Expression_VariableName
		public Assignment getRightAssignment_1_4_2() { return cRightAssignment_1_4_2; }
		
		//Expression_VariableName
		public RuleCall getRightExpression_VariableNameParserRuleCall_1_4_2_0() { return cRightExpression_VariableNameParserRuleCall_1_4_2_0; }
		
		//(('C6' 'C7') {Expression_Not_Less.left=current} right=Expression_VariableName)
		public Group getGroup_1_5() { return cGroup_1_5; }
		
		//('C6' 'C7')
		public Group getGroup_1_5_0() { return cGroup_1_5_0; }
		
		//'C6'
		public Keyword getC6Keyword_1_5_0_0() { return cC6Keyword_1_5_0_0; }
		
		//'C7'
		public Keyword getC7Keyword_1_5_0_1() { return cC7Keyword_1_5_0_1; }
		
		//{Expression_Not_Less.left=current}
		public Action getExpression_Not_LessLeftAction_1_5_1() { return cExpression_Not_LessLeftAction_1_5_1; }
		
		//right=Expression_VariableName
		public Assignment getRightAssignment_1_5_2() { return cRightAssignment_1_5_2; }
		
		//Expression_VariableName
		public RuleCall getRightExpression_VariableNameParserRuleCall_1_5_2_0() { return cRightExpression_VariableNameParserRuleCall_1_5_2_0; }
		
		//(('C6' 'C8') {Expression_Not_Greater.left=current} right=Expression_VariableName)
		public Group getGroup_1_6() { return cGroup_1_6; }
		
		//('C6' 'C8')
		public Group getGroup_1_6_0() { return cGroup_1_6_0; }
		
		//'C6'
		public Keyword getC6Keyword_1_6_0_0() { return cC6Keyword_1_6_0_0; }
		
		//'C8'
		public Keyword getC8Keyword_1_6_0_1() { return cC8Keyword_1_6_0_1; }
		
		//{Expression_Not_Greater.left=current}
		public Action getExpression_Not_GreaterLeftAction_1_6_1() { return cExpression_Not_GreaterLeftAction_1_6_1; }
		
		//right=Expression_VariableName
		public Assignment getRightAssignment_1_6_2() { return cRightAssignment_1_6_2; }
		
		//Expression_VariableName
		public RuleCall getRightExpression_VariableNameParserRuleCall_1_6_2_0() { return cRightExpression_VariableNameParserRuleCall_1_6_2_0; }
	}
	public class Expression_VariableNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.Bug385636.Expression_VariableName");
		private final Assignment cVariableAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVariableNVariableAccessParserRuleCall_0 = (RuleCall)cVariableAssignment.eContents().get(0);
		
		//Expression_VariableName : variable = NVariableAccess;
		@Override public ParserRule getRule() { return rule; }
		
		//variable = NVariableAccess
		public Assignment getVariableAssignment() { return cVariableAssignment; }
		
		//NVariableAccess
		public RuleCall getVariableNVariableAccessParserRuleCall_0() { return cVariableNVariableAccessParserRuleCall_0; }
	}
	
	
	private final ProgramElements pProgram;
	private final DefineVariablesElements pDefineVariables;
	private final DefineVariableElements pDefineVariable;
	private final NVariableAccessElements pNVariableAccess;
	private final StatementElements pStatement;
	private final Expression_VariableNameElements pExpression_VariableName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug385636GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pDefineVariables = new DefineVariablesElements();
		this.pDefineVariable = new DefineVariableElements();
		this.pNVariableAccess = new NVariableAccessElements();
		this.pStatement = new StatementElements();
		this.pExpression_VariableName = new Expression_VariableNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.resource.Bug385636".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program: define=DefineVariables statements+=Statement* 'END' ;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//DefineVariables: 'VARIABLES' variables += DefineVariable+ 'ENDVARIABLES';
	public DefineVariablesElements getDefineVariablesAccess() {
		return pDefineVariables;
	}
	
	public ParserRule getDefineVariablesRule() {
		return getDefineVariablesAccess().getRule();
	}
	
	//DefineVariable: 'NAME' name=ID;
	public DefineVariableElements getDefineVariableAccess() {
		return pDefineVariable;
	}
	
	public ParserRule getDefineVariableRule() {
		return getDefineVariableAccess().getRule();
	}
	
	//NVariableAccess: variable=[DefineVariable];
	public NVariableAccessElements getNVariableAccessAccess() {
		return pNVariableAccess;
	}
	
	public ParserRule getNVariableAccessRule() {
		return getNVariableAccessAccess().getRule();
	}
	
	//// Comparisons: left associative, priority 2
	//Statement returns Expression:
	//    Expression_VariableName (
	//        (('C1') {Expression_Larger_Equal.left=current} right=Expression_VariableName) |
	//        (('C2') {Expression_Smaller.left=current} right=Expression_VariableName) |
	//        (('C3') {Expression_Smaller_Equal.left=current} right=Expression_VariableName) |
	//        (('C4') {Expression_Equal.left=current} right=Expression_VariableName) |
	//        (('C5') {Expression_Not_Equal.left=current} right=Expression_VariableName)|
	//        (('C6' 'C7') {Expression_Not_Less.left=current} right=Expression_VariableName) |
	//        (('C6' 'C8') {Expression_Not_Greater.left=current} right=Expression_VariableName)
	//    )*;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Expression_VariableName : variable = NVariableAccess;
	public Expression_VariableNameElements getExpression_VariableNameAccess() {
		return pExpression_VariableName;
	}
	
	public ParserRule getExpression_VariableNameRule() {
		return getExpression_VariableNameAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
