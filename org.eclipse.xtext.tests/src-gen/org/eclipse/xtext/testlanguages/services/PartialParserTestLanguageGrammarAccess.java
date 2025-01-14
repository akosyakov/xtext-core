/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class PartialParserTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SomeContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.SomeContainer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContainerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cNestedAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cNestedNestedParserRuleCall_3_0_0 = (RuleCall)cNestedAssignment_3_0.eContents().get(0);
		private final Assignment cContentAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cContentContentParserRuleCall_3_1_0 = (RuleCall)cContentAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SomeContainer :
		//  'container' name=ID '{'
		//     ( nested+=Nested | content+=Content )*
		//  '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'container' name=ID '{'
		//   ( nested+=Nested | content+=Content )*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'container'
		public Keyword getContainerKeyword_0() { return cContainerKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//( nested+=Nested | content+=Content )*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//nested+=Nested
		public Assignment getNestedAssignment_3_0() { return cNestedAssignment_3_0; }
		
		//Nested
		public RuleCall getNestedNestedParserRuleCall_3_0_0() { return cNestedNestedParserRuleCall_3_0_0; }
		
		//content+=Content
		public Assignment getContentAssignment_3_1() { return cContentAssignment_3_1; }
		
		//Content
		public RuleCall getContentContentParserRuleCall_3_1_0() { return cContentContentParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class NestedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Nested");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNestedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNestedAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNestedSomeContainerParserRuleCall_2_0 = (RuleCall)cNestedAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Nested:
		//    'nested' '{'
		//         (nested+=SomeContainer)+
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'nested' '{'
		//     (nested+=SomeContainer)+
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'nested'
		public Keyword getNestedKeyword_0() { return cNestedKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//(nested+=SomeContainer)+
		public Assignment getNestedAssignment_2() { return cNestedAssignment_2; }
		
		//SomeContainer
		public RuleCall getNestedSomeContainerParserRuleCall_2_0() { return cNestedSomeContainerParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Content");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cChildrenParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAbstractChildrenParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Content:
		//    Children | AbstractChildren;
		@Override public ParserRule getRule() { return rule; }
		
		//Children | AbstractChildren
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Children
		public RuleCall getChildrenParserRuleCall_0() { return cChildrenParserRuleCall_0; }
		
		//AbstractChildren
		public RuleCall getAbstractChildrenParserRuleCall_1() { return cAbstractChildrenParserRuleCall_1; }
	}
	public class ChildrenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Children");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChildrenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cChildrenAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cChildrenChildParserRuleCall_2_0 = (RuleCall)cChildrenAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cChildrenAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cChildrenChildParserRuleCall_3_1_0 = (RuleCall)cChildrenAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Children:
		//    'children' '{'
		//         children += Child (',' children += Child )*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'children' '{'
		//     children += Child (',' children += Child )*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'children'
		public Keyword getChildrenKeyword_0() { return cChildrenKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//children += Child
		public Assignment getChildrenAssignment_2() { return cChildrenAssignment_2; }
		
		//Child
		public RuleCall getChildrenChildParserRuleCall_2_0() { return cChildrenChildParserRuleCall_2_0; }
		
		//(',' children += Child )*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//children += Child
		public Assignment getChildrenAssignment_3_1() { return cChildrenAssignment_3_1; }
		
		//Child
		public RuleCall getChildrenChildParserRuleCall_3_1_0() { return cChildrenChildParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Child");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueNamedParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Child :
		//  '->' 'C' '(' value=Named ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'->' 'C' '(' value=Named ')'
		public Group getGroup() { return cGroup; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0() { return cHyphenMinusGreaterThanSignKeyword_0; }
		
		//'C'
		public Keyword getCKeyword_1() { return cCKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//value=Named
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//Named
		public RuleCall getValueNamedParserRuleCall_3_0() { return cValueNamedParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class AbstractChildrenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.AbstractChildren");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbstractChildrenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAbstractChildrenAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAbstractChildrenAbstractChildParserRuleCall_2_0 = (RuleCall)cAbstractChildrenAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AbstractChildren :
		//    /* SuppressWarnings[SpacesInKeyword] */
		//    'abstract children' '{'
		//           ( abstractChildren += AbstractChild )+
		//      '}';
		@Override public ParserRule getRule() { return rule; }
		
		///* SuppressWarnings[SpacesInKeyword] */
		//'abstract children' '{'
		//       ( abstractChildren += AbstractChild )+
		//  '}'
		public Group getGroup() { return cGroup; }
		
		///* SuppressWarnings[SpacesInKeyword] */
		//'abstract children'
		public Keyword getAbstractChildrenKeyword_0() { return cAbstractChildrenKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//( abstractChildren += AbstractChild )+
		public Assignment getAbstractChildrenAssignment_2() { return cAbstractChildrenAssignment_2; }
		
		//AbstractChild
		public RuleCall getAbstractChildrenAbstractChildParserRuleCall_2_0() { return cAbstractChildrenAbstractChildParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class AbstractChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.AbstractChild");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFirstConcreteParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSecondConcreteParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractChild :
		//  FirstConcrete | SecondConcrete;
		@Override public ParserRule getRule() { return rule; }
		
		//FirstConcrete | SecondConcrete
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FirstConcrete
		public RuleCall getFirstConcreteParserRuleCall_0() { return cFirstConcreteParserRuleCall_0; }
		
		//SecondConcrete
		public RuleCall getSecondConcreteParserRuleCall_1() { return cSecondConcreteParserRuleCall_1; }
	}
	public class FirstConcreteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.FirstConcrete");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueNamedParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		private final Assignment cReferencedContainerAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cReferencedContainerSomeContainerCrossReference_4_0 = (CrossReference)cReferencedContainerAssignment_4.eContents().get(0);
		private final RuleCall cReferencedContainerSomeContainerIDTerminalRuleCall_4_0_1 = (RuleCall)cReferencedContainerSomeContainerCrossReference_4_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//FirstConcrete :
		//  '->' 'F' '(' value=Named referencedContainer=[SomeContainer]? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'->' 'F' '(' value=Named referencedContainer=[SomeContainer]? ')'
		public Group getGroup() { return cGroup; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0() { return cHyphenMinusGreaterThanSignKeyword_0; }
		
		//'F'
		public Keyword getFKeyword_1() { return cFKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//value=Named
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//Named
		public RuleCall getValueNamedParserRuleCall_3_0() { return cValueNamedParserRuleCall_3_0; }
		
		//referencedContainer=[SomeContainer]?
		public Assignment getReferencedContainerAssignment_4() { return cReferencedContainerAssignment_4; }
		
		//[SomeContainer]
		public CrossReference getReferencedContainerSomeContainerCrossReference_4_0() { return cReferencedContainerSomeContainerCrossReference_4_0; }
		
		//ID
		public RuleCall getReferencedContainerSomeContainerIDTerminalRuleCall_4_0_1() { return cReferencedContainerSomeContainerIDTerminalRuleCall_4_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class SecondConcreteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.SecondConcrete");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueNamedParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Assignment cReferencedChildrenAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cReferencedChildrenChildCrossReference_5_0 = (CrossReference)cReferencedChildrenAssignment_5.eContents().get(0);
		private final RuleCall cReferencedChildrenChildIDTerminalRuleCall_5_0_1 = (RuleCall)cReferencedChildrenChildCrossReference_5_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//SecondConcrete :
		//  '->' 'F' 'S' '(' value=Named referencedChildren+=[Child]? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'->' 'F' 'S' '(' value=Named referencedChildren+=[Child]? ')'
		public Group getGroup() { return cGroup; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0() { return cHyphenMinusGreaterThanSignKeyword_0; }
		
		//'F'
		public Keyword getFKeyword_1() { return cFKeyword_1; }
		
		//'S'
		public Keyword getSKeyword_2() { return cSKeyword_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//value=Named
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//Named
		public RuleCall getValueNamedParserRuleCall_4_0() { return cValueNamedParserRuleCall_4_0; }
		
		//referencedChildren+=[Child]?
		public Assignment getReferencedChildrenAssignment_5() { return cReferencedChildrenAssignment_5; }
		
		//[Child]
		public CrossReference getReferencedChildrenChildCrossReference_5_0() { return cReferencedChildrenChildCrossReference_5_0; }
		
		//ID
		public RuleCall getReferencedChildrenChildIDTerminalRuleCall_5_0_1() { return cReferencedChildrenChildIDTerminalRuleCall_5_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}
	public class NamedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Named");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Named:
		//  name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final SomeContainerElements pSomeContainer;
	private final NestedElements pNested;
	private final ContentElements pContent;
	private final ChildrenElements pChildren;
	private final ChildElements pChild;
	private final AbstractChildrenElements pAbstractChildren;
	private final AbstractChildElements pAbstractChild;
	private final FirstConcreteElements pFirstConcrete;
	private final SecondConcreteElements pSecondConcrete;
	private final NamedElements pNamed;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PartialParserTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSomeContainer = new SomeContainerElements();
		this.pNested = new NestedElements();
		this.pContent = new ContentElements();
		this.pChildren = new ChildrenElements();
		this.pChild = new ChildElements();
		this.pAbstractChildren = new AbstractChildrenElements();
		this.pAbstractChild = new AbstractChildElements();
		this.pFirstConcrete = new FirstConcreteElements();
		this.pSecondConcrete = new SecondConcreteElements();
		this.pNamed = new NamedElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.PartialParserTestLanguage".equals(grammar.getName())) {
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

	
	//SomeContainer :
	//  'container' name=ID '{'
	//     ( nested+=Nested | content+=Content )*
	//  '}';
	public SomeContainerElements getSomeContainerAccess() {
		return pSomeContainer;
	}
	
	public ParserRule getSomeContainerRule() {
		return getSomeContainerAccess().getRule();
	}
	
	//Nested:
	//    'nested' '{'
	//         (nested+=SomeContainer)+
	//    '}';
	public NestedElements getNestedAccess() {
		return pNested;
	}
	
	public ParserRule getNestedRule() {
		return getNestedAccess().getRule();
	}
	
	//Content:
	//    Children | AbstractChildren;
	public ContentElements getContentAccess() {
		return pContent;
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}
	
	//Children:
	//    'children' '{'
	//         children += Child (',' children += Child )*
	//    '}';
	public ChildrenElements getChildrenAccess() {
		return pChildren;
	}
	
	public ParserRule getChildrenRule() {
		return getChildrenAccess().getRule();
	}
	
	//Child :
	//  '->' 'C' '(' value=Named ')';
	public ChildElements getChildAccess() {
		return pChild;
	}
	
	public ParserRule getChildRule() {
		return getChildAccess().getRule();
	}
	
	//AbstractChildren :
	//    /* SuppressWarnings[SpacesInKeyword] */
	//    'abstract children' '{'
	//           ( abstractChildren += AbstractChild )+
	//      '}';
	public AbstractChildrenElements getAbstractChildrenAccess() {
		return pAbstractChildren;
	}
	
	public ParserRule getAbstractChildrenRule() {
		return getAbstractChildrenAccess().getRule();
	}
	
	//AbstractChild :
	//  FirstConcrete | SecondConcrete;
	public AbstractChildElements getAbstractChildAccess() {
		return pAbstractChild;
	}
	
	public ParserRule getAbstractChildRule() {
		return getAbstractChildAccess().getRule();
	}
	
	//FirstConcrete :
	//  '->' 'F' '(' value=Named referencedContainer=[SomeContainer]? ')';
	public FirstConcreteElements getFirstConcreteAccess() {
		return pFirstConcrete;
	}
	
	public ParserRule getFirstConcreteRule() {
		return getFirstConcreteAccess().getRule();
	}
	
	//SecondConcrete :
	//  '->' 'F' 'S' '(' value=Named referencedChildren+=[Child]? ')';
	public SecondConcreteElements getSecondConcreteAccess() {
		return pSecondConcrete;
	}
	
	public ParserRule getSecondConcreteRule() {
		return getSecondConcreteAccess().getRule();
	}
	
	//Named:
	//  name=ID;
	public NamedElements getNamedAccess() {
		return pNamed;
	}
	
	public ParserRule getNamedRule() {
		return getNamedAccess().getRule();
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
