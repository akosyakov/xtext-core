/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.terminalrules.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class Bug297105TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Model");
		private final Assignment cExpressionsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpressionsExpressionParserRuleCall_0 = (RuleCall)cExpressionsAssignment.eContents().get(0);
		
		//Model:
		//    expressions += Expression*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//expressions += Expression*
		public Assignment getExpressionsAssignment() { return cExpressionsAssignment; }
		
		//Expression
		public RuleCall getExpressionsExpressionParserRuleCall_0() { return cExpressionsExpressionParserRuleCall_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftLiteralParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightLiteralParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		
		//Expression : left=Literal '+' right=Literal;
		@Override public ParserRule getRule() { return rule; }
		
		//left=Literal '+' right=Literal
		public Group getGroup() { return cGroup; }
		
		//left=Literal
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//Literal
		public RuleCall getLeftLiteralParserRuleCall_0_0() { return cLeftLiteralParserRuleCall_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1() { return cPlusSignKeyword_1; }
		
		//right=Literal
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }
		
		//Literal
		public RuleCall getRightLiteralParserRuleCall_2_0() { return cRightLiteralParserRuleCall_2_0; }
	}
	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Literal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRealLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIntLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Literal : RealLiteral | IntLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//RealLiteral | IntLiteral
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RealLiteral
		public RuleCall getRealLiteralParserRuleCall_0() { return cRealLiteralParserRuleCall_0; }
		
		//IntLiteral
		public RuleCall getIntLiteralParserRuleCall_1() { return cIntLiteralParserRuleCall_1; }
	}
	public class IntLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.IntLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueIntValueParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//IntLiteral : value = IntValue ;
		@Override public ParserRule getRule() { return rule; }
		
		//value = IntValue
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//IntValue
		public RuleCall getValueIntValueParserRuleCall_0() { return cValueIntValueParserRuleCall_0; }
	}
	public class RealLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.RealLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueRealValueParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//RealLiteral : value = RealValue;
		@Override public ParserRule getRule() { return rule; }
		
		//value = RealValue
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//RealValue
		public RuleCall getValueRealValueParserRuleCall_0() { return cValueRealValueParserRuleCall_0; }
	}
	public class IntValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.IntValue");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//IntValue : INT ;
		@Override public ParserRule getRule() { return rule; }
		
		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class RealValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.RealValue");
		private final RuleCall cRealParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//RealValue : Real ;
		@Override public ParserRule getRule() { return rule; }
		
		//Real
		public RuleCall getRealParserRuleCall() { return cRealParserRuleCall; }
	}
	public class RealElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Real");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cEXT_INTTerminalRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		
		//Real hidden(): INT ? '.' (EXT_INT | INT);
		@Override public ParserRule getRule() { return rule; }
		
		//INT ? '.' (EXT_INT | INT)
		public Group getGroup() { return cGroup; }
		
		//INT ?
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//(EXT_INT | INT)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//EXT_INT
		public RuleCall getEXT_INTTerminalRuleCall_2_0() { return cEXT_INTTerminalRuleCall_2_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_1() { return cINTTerminalRuleCall_2_1; }
	}
	
	
	private final ModelElements pModel;
	private final ExpressionElements pExpression;
	private final LiteralElements pLiteral;
	private final IntLiteralElements pIntLiteral;
	private final RealLiteralElements pRealLiteral;
	private final IntValueElements pIntValue;
	private final RealValueElements pRealValue;
	private final RealElements pReal;
	private final TerminalRule tEXT_INT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug297105TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pExpression = new ExpressionElements();
		this.pLiteral = new LiteralElements();
		this.pIntLiteral = new IntLiteralElements();
		this.pRealLiteral = new RealLiteralElements();
		this.pIntValue = new IntValueElements();
		this.pRealValue = new RealValueElements();
		this.pReal = new RealElements();
		this.tEXT_INT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.EXT_INT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage".equals(grammar.getName())) {
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

	
	//Model:
	//    expressions += Expression*
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Expression : left=Literal '+' right=Literal;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Literal : RealLiteral | IntLiteral;
	public LiteralElements getLiteralAccess() {
		return pLiteral;
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}
	
	//IntLiteral : value = IntValue ;
	public IntLiteralElements getIntLiteralAccess() {
		return pIntLiteral;
	}
	
	public ParserRule getIntLiteralRule() {
		return getIntLiteralAccess().getRule();
	}
	
	//RealLiteral : value = RealValue;
	public RealLiteralElements getRealLiteralAccess() {
		return pRealLiteral;
	}
	
	public ParserRule getRealLiteralRule() {
		return getRealLiteralAccess().getRule();
	}
	
	//IntValue : INT ;
	public IntValueElements getIntValueAccess() {
		return pIntValue;
	}
	
	public ParserRule getIntValueRule() {
		return getIntValueAccess().getRule();
	}
	
	//RealValue : Real ;
	public RealValueElements getRealValueAccess() {
		return pRealValue;
	}
	
	public ParserRule getRealValueRule() {
		return getRealValueAccess().getRule();
	}
	
	//Real hidden(): INT ? '.' (EXT_INT | INT);
	public RealElements getRealAccess() {
		return pReal;
	}
	
	public ParserRule getRealRule() {
		return getRealAccess().getRule();
	}
	
	//terminal EXT_INT: INT ('e'|'E')('-'|'+') INT;
	public TerminalRule getEXT_INTRule() {
		return tEXT_INT;
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
