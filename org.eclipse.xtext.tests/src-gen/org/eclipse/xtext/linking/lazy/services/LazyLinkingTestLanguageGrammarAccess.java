/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.linking.lazy.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class LazyLinkingTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.lazy.LazyLinkingTestLanguage.Model");
		private final Assignment cTypesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTypesTypeParserRuleCall_0 = (RuleCall)cTypesAssignment.eContents().get(0);
		
		//Model :
		//    types+=Type*;
		@Override public ParserRule getRule() { return rule; }
		
		//types+=Type*
		public Assignment getTypesAssignment() { return cTypesAssignment; }
		
		//Type
		public RuleCall getTypesTypeParserRuleCall_0() { return cTypesTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.lazy.LazyLinkingTestLanguage.Type");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsTypeCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsTypeIDTerminalRuleCall_2_1_0_1 = (RuleCall)cExtendsTypeCrossReference_2_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cParentIdAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final CrossReference cParentIdPropertyCrossReference_2_3_0 = (CrossReference)cParentIdAssignment_2_3.eContents().get(0);
		private final RuleCall cParentIdPropertyIDTerminalRuleCall_2_3_0_1 = (RuleCall)cParentIdPropertyCrossReference_2_3_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cForKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cParentIdAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cParentIdPropertyCrossReference_3_1_0 = (CrossReference)cParentIdAssignment_3_1.eContents().get(0);
		private final RuleCall cParentIdPropertyIDTerminalRuleCall_3_1_0_1 = (RuleCall)cParentIdPropertyCrossReference_3_1_0.eContents().get(1);
		private final Keyword cInKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cExtendsAssignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final CrossReference cExtendsTypeCrossReference_3_3_0 = (CrossReference)cExtendsAssignment_3_3.eContents().get(0);
		private final RuleCall cExtendsTypeIDTerminalRuleCall_3_3_0_1 = (RuleCall)cExtendsTypeCrossReference_3_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPropertiesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPropertiesPropertyParserRuleCall_5_0 = (RuleCall)cPropertiesAssignment_5.eContents().get(0);
		private final Assignment cUnresolvedProxyPropertyAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUnresolvedProxyPropertyUnresolvedProxyPropertyParserRuleCall_6_0 = (RuleCall)cUnresolvedProxyPropertyAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		///*
		// * SuppressWarnings[BidirectionalReference]
		// * SuppressWarnings[potentialOverride]
		// */
		//Type :
		//    'type' name=ID ('extends' ^extends=[Type] '.' parentId=[Property])? ('for' parentId=[Property] 'in' ^extends=[Type])? '{'
		//        (properties+=Property)*
		//        (unresolvedProxyProperty+=UnresolvedProxyProperty)*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ID ('extends' ^extends=[Type] '.' parentId=[Property])? ('for' parentId=[Property] 'in' ^extends=[Type])? '{'
		//    (properties+=Property)*
		//    (unresolvedProxyProperty+=UnresolvedProxyProperty)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' ^extends=[Type] '.' parentId=[Property])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//^extends=[Type]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }
		
		//[Type]
		public CrossReference getExtendsTypeCrossReference_2_1_0() { return cExtendsTypeCrossReference_2_1_0; }
		
		//ID
		public RuleCall getExtendsTypeIDTerminalRuleCall_2_1_0_1() { return cExtendsTypeIDTerminalRuleCall_2_1_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2_2() { return cFullStopKeyword_2_2; }
		
		//parentId=[Property]
		public Assignment getParentIdAssignment_2_3() { return cParentIdAssignment_2_3; }
		
		//[Property]
		public CrossReference getParentIdPropertyCrossReference_2_3_0() { return cParentIdPropertyCrossReference_2_3_0; }
		
		//ID
		public RuleCall getParentIdPropertyIDTerminalRuleCall_2_3_0_1() { return cParentIdPropertyIDTerminalRuleCall_2_3_0_1; }
		
		//('for' parentId=[Property] 'in' ^extends=[Type])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'for'
		public Keyword getForKeyword_3_0() { return cForKeyword_3_0; }
		
		//parentId=[Property]
		public Assignment getParentIdAssignment_3_1() { return cParentIdAssignment_3_1; }
		
		//[Property]
		public CrossReference getParentIdPropertyCrossReference_3_1_0() { return cParentIdPropertyCrossReference_3_1_0; }
		
		//ID
		public RuleCall getParentIdPropertyIDTerminalRuleCall_3_1_0_1() { return cParentIdPropertyIDTerminalRuleCall_3_1_0_1; }
		
		//'in'
		public Keyword getInKeyword_3_2() { return cInKeyword_3_2; }
		
		//^extends=[Type]
		public Assignment getExtendsAssignment_3_3() { return cExtendsAssignment_3_3; }
		
		//[Type]
		public CrossReference getExtendsTypeCrossReference_3_3_0() { return cExtendsTypeCrossReference_3_3_0; }
		
		//ID
		public RuleCall getExtendsTypeIDTerminalRuleCall_3_3_0_1() { return cExtendsTypeIDTerminalRuleCall_3_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//(properties+=Property)*
		public Assignment getPropertiesAssignment_5() { return cPropertiesAssignment_5; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_5_0() { return cPropertiesPropertyParserRuleCall_5_0; }
		
		//(unresolvedProxyProperty+=UnresolvedProxyProperty)*
		public Assignment getUnresolvedProxyPropertyAssignment_6() { return cUnresolvedProxyPropertyAssignment_6; }
		
		//UnresolvedProxyProperty
		public RuleCall getUnresolvedProxyPropertyUnresolvedProxyPropertyParserRuleCall_6_0() { return cUnresolvedProxyPropertyUnresolvedProxyPropertyParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.lazy.LazyLinkingTestLanguage.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeTypeCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeTypeIDTerminalRuleCall_0_0_1 = (RuleCall)cTypeTypeCrossReference_0_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Property :
		//    (type+=[Type])+ name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//(type+=[Type])+ name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//(type+=[Type])+
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//[Type]
		public CrossReference getTypeTypeCrossReference_0_0() { return cTypeTypeCrossReference_0_0; }
		
		//ID
		public RuleCall getTypeTypeIDTerminalRuleCall_0_0_1() { return cTypeTypeIDTerminalRuleCall_0_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class UnresolvedProxyPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.lazy.LazyLinkingTestLanguage.UnresolvedProxyProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUnresolvedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeTypeCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeTypeIDTerminalRuleCall_1_0_1 = (RuleCall)cTypeTypeCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//UnresolvedProxyProperty :
		//    'unresolved' (type+=[Type])+ name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'unresolved' (type+=[Type])+ name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//'unresolved'
		public Keyword getUnresolvedKeyword_0() { return cUnresolvedKeyword_0; }
		
		//(type+=[Type])+
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//[Type]
		public CrossReference getTypeTypeCrossReference_1_0() { return cTypeTypeCrossReference_1_0; }
		
		//ID
		public RuleCall getTypeTypeIDTerminalRuleCall_1_0_1() { return cTypeTypeIDTerminalRuleCall_1_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	private final ModelElements pModel;
	private final TypeElements pType;
	private final PropertyElements pProperty;
	private final UnresolvedProxyPropertyElements pUnresolvedProxyProperty;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LazyLinkingTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pType = new TypeElements();
		this.pProperty = new PropertyElements();
		this.pUnresolvedProxyProperty = new UnresolvedProxyPropertyElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.linking.lazy.LazyLinkingTestLanguage".equals(grammar.getName())) {
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

	
	//Model :
	//    types+=Type*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	///*
	// * SuppressWarnings[BidirectionalReference]
	// * SuppressWarnings[potentialOverride]
	// */
	//Type :
	//    'type' name=ID ('extends' ^extends=[Type] '.' parentId=[Property])? ('for' parentId=[Property] 'in' ^extends=[Type])? '{'
	//        (properties+=Property)*
	//        (unresolvedProxyProperty+=UnresolvedProxyProperty)*
	//    '}';
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Property :
	//    (type+=[Type])+ name=ID ';';
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//UnresolvedProxyProperty :
	//    'unresolved' (type+=[Type])+ name=ID ';';
	public UnresolvedProxyPropertyElements getUnresolvedProxyPropertyAccess() {
		return pUnresolvedProxyProperty;
	}
	
	public ParserRule getUnresolvedProxyPropertyRule() {
		return getUnresolvedProxyPropertyAccess().getRule();
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
