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
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug292245TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cFIXKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cFixAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cFixFixParserRuleCall_0_1_0 = (RuleCall)cFixAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cERRORKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cErrorAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cErrorErrorParserRuleCall_1_1_0 = (RuleCall)cErrorAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cTICKKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTickAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTickApostropheParserRuleCall_2_1_0 = (RuleCall)cTickAssignment_2_1.eContents().get(0);
		
		//Model hidden(WS) : ('FIX' (fix+=Fix)+
		//               |'ERROR' (error+=Error)+
		//               |'TICK' (tick+=Apostrophe)+
		//               )*;
		@Override public ParserRule getRule() { return rule; }
		
		//('FIX' (fix+=Fix)+
		//              |'ERROR' (error+=Error)+
		//              |'TICK' (tick+=Apostrophe)+
		//              )*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'FIX' (fix+=Fix)+
		public Group getGroup_0() { return cGroup_0; }
		
		//'FIX'
		public Keyword getFIXKeyword_0_0() { return cFIXKeyword_0_0; }
		
		//(fix+=Fix)+
		public Assignment getFixAssignment_0_1() { return cFixAssignment_0_1; }
		
		//Fix
		public RuleCall getFixFixParserRuleCall_0_1_0() { return cFixFixParserRuleCall_0_1_0; }
		
		//'ERROR' (error+=Error)+
		public Group getGroup_1() { return cGroup_1; }
		
		//'ERROR'
		public Keyword getERRORKeyword_1_0() { return cERRORKeyword_1_0; }
		
		//(error+=Error)+
		public Assignment getErrorAssignment_1_1() { return cErrorAssignment_1_1; }
		
		//Error
		public RuleCall getErrorErrorParserRuleCall_1_1_0() { return cErrorErrorParserRuleCall_1_1_0; }
		
		//'TICK' (tick+=Apostrophe)+
		public Group getGroup_2() { return cGroup_2; }
		
		//'TICK'
		public Keyword getTICKKeyword_2_0() { return cTICKKeyword_2_0; }
		
		//(tick+=Apostrophe)+
		public Assignment getTickAssignment_2_1() { return cTickAssignment_2_1; }
		
		//Apostrophe
		public RuleCall getTickApostropheParserRuleCall_2_1_0() { return cTickApostropheParserRuleCall_2_1_0; }
	}
	public class ErrorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.Error");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAPOSTROPHE_CHARTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cGraphicalParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cAPOSTROPHE_CHARTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Error hidden() : APOSTROPHE_CHAR Graphical APOSTROPHE_CHAR;
		@Override public ParserRule getRule() { return rule; }
		
		//APOSTROPHE_CHAR Graphical APOSTROPHE_CHAR
		public Group getGroup() { return cGroup; }
		
		//APOSTROPHE_CHAR
		public RuleCall getAPOSTROPHE_CHARTerminalRuleCall_0() { return cAPOSTROPHE_CHARTerminalRuleCall_0; }
		
		//Graphical
		public RuleCall getGraphicalParserRuleCall_1() { return cGraphicalParserRuleCall_1; }
		
		//APOSTROPHE_CHAR
		public RuleCall getAPOSTROPHE_CHARTerminalRuleCall_2() { return cAPOSTROPHE_CHARTerminalRuleCall_2; }
	}
	public class FixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.Fix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAPOSTROPHE_CHARTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cGraphicalParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cAPOSTROPHE_CHARTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cRehideParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Fix   hidden() : APOSTROPHE_CHAR Graphical APOSTROPHE_CHAR Rehide;
		@Override public ParserRule getRule() { return rule; }
		
		//APOSTROPHE_CHAR Graphical APOSTROPHE_CHAR Rehide
		public Group getGroup() { return cGroup; }
		
		//APOSTROPHE_CHAR
		public RuleCall getAPOSTROPHE_CHARTerminalRuleCall_0() { return cAPOSTROPHE_CHARTerminalRuleCall_0; }
		
		//Graphical
		public RuleCall getGraphicalParserRuleCall_1() { return cGraphicalParserRuleCall_1; }
		
		//APOSTROPHE_CHAR
		public RuleCall getAPOSTROPHE_CHARTerminalRuleCall_2() { return cAPOSTROPHE_CHARTerminalRuleCall_2; }
		
		//Rehide
		public RuleCall getRehideParserRuleCall_3() { return cRehideParserRuleCall_3; }
	}
	public class ApostropheElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.Apostrophe");
		private final RuleCall cAPOSTROPHE_CHARTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Apostrophe hidden(WS) : APOSTROPHE_CHAR;
		@Override public ParserRule getRule() { return rule; }
		
		//APOSTROPHE_CHAR
		public RuleCall getAPOSTROPHE_CHARTerminalRuleCall() { return cAPOSTROPHE_CHARTerminalRuleCall; }
	}
	public class RehideElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.Rehide");
		private final Keyword cCircumflexAccentKeyword = (Keyword)rule.eContents().get(1);
		
		//Rehide hidden(WS) : "^"?;
		@Override public ParserRule getRule() { return rule; }
		
		//"^"?
		public Keyword getCircumflexAccentKeyword() { return cCircumflexAccentKeyword; }
	}
	public class GraphicalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.Graphical");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCHARTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		// //some unused char
		//Graphical : CHAR | WS;
		@Override public ParserRule getRule() { return rule; }
		
		//CHAR | WS
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CHAR
		public RuleCall getCHARTerminalRuleCall_0() { return cCHARTerminalRuleCall_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1() { return cWSTerminalRuleCall_1; }
	}
	
	
	private final ModelElements pModel;
	private final ErrorElements pError;
	private final FixElements pFix;
	private final ApostropheElements pApostrophe;
	private final TerminalRule tAPOSTROPHE_CHAR;
	private final RehideElements pRehide;
	private final GraphicalElements pGraphical;
	private final TerminalRule tCHAR;
	private final TerminalRule tWS;
	
	private final Grammar grammar;

	@Inject
	public Bug292245TestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.pError = new ErrorElements();
		this.pFix = new FixElements();
		this.pApostrophe = new ApostropheElements();
		this.tAPOSTROPHE_CHAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.APOSTROPHE_CHAR");
		this.pRehide = new RehideElements();
		this.pGraphical = new GraphicalElements();
		this.tCHAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.CHAR");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.WS");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage".equals(grammar.getName())) {
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
	

	
	//Model hidden(WS) : ('FIX' (fix+=Fix)+
	//               |'ERROR' (error+=Error)+
	//               |'TICK' (tick+=Apostrophe)+
	//               )*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Error hidden() : APOSTROPHE_CHAR Graphical APOSTROPHE_CHAR;
	public ErrorElements getErrorAccess() {
		return pError;
	}
	
	public ParserRule getErrorRule() {
		return getErrorAccess().getRule();
	}
	
	//Fix   hidden() : APOSTROPHE_CHAR Graphical APOSTROPHE_CHAR Rehide;
	public FixElements getFixAccess() {
		return pFix;
	}
	
	public ParserRule getFixRule() {
		return getFixAccess().getRule();
	}
	
	//Apostrophe hidden(WS) : APOSTROPHE_CHAR;
	public ApostropheElements getApostropheAccess() {
		return pApostrophe;
	}
	
	public ParserRule getApostropheRule() {
		return getApostropheAccess().getRule();
	}
	
	//terminal APOSTROPHE_CHAR : "'";
	public TerminalRule getAPOSTROPHE_CHARRule() {
		return tAPOSTROPHE_CHAR;
	}
	
	//Rehide hidden(WS) : "^"?;
	public RehideElements getRehideAccess() {
		return pRehide;
	}
	
	public ParserRule getRehideRule() {
		return getRehideAccess().getRule();
	}
	
	// //some unused char
	//Graphical : CHAR | WS;
	public GraphicalElements getGraphicalAccess() {
		return pGraphical;
	}
	
	public ParserRule getGraphicalRule() {
		return getGraphicalAccess().getRule();
	}
	
	//terminal CHAR : 'A'..'Z' | '0'..'9';
	public TerminalRule getCHARRule() {
		return tCHAR;
	}
	
	//terminal WS : (' '|'\t'|'\r'|'\n')+ ;
	public TerminalRule getWSRule() {
		return tWS;
	}
}
