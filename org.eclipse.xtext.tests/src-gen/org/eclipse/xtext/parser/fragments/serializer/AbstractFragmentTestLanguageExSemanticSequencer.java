/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.fragments.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.PRFNamed;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.PRFNamedWithAction;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.ParserRuleFragments;
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageExGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;

@SuppressWarnings("all")
public abstract class AbstractFragmentTestLanguageExSemanticSequencer extends FragmentTestLanguageSemanticSequencer {

	@Inject
	private FragmentTestLanguageExGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FragmentTestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FragmentTestLanguagePackage.PRF_NAMED:
				if (rule == grammarAccess.getNamedByActionRule()) {
					sequence_NamedByAction(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNamedInParenthesesRule()) {
					sequence_NamedInParentheses(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedRefFirstRule()) {
					sequence_PRFNamedFragment_PRFNamedRefFirst(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFWithPredicateRule()) {
					sequence_PRFNamedFragment_PRFNamedRef(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedWithFQNRule()) {
					sequence_PRFNamedWithFQN(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedRule()
						|| action == grammarAccess.getPRFNamedWithActionAccess().getPRFNamedWithActionPrevAction_1()) {
					sequence_PRFNamed_PRFNamedFragment_PRFNamedRef(context, (PRFNamed) semanticObject); 
					return; 
				}
				else break;
			case FragmentTestLanguagePackage.PRF_NAMED_WITH_ACTION:
				if (rule == grammarAccess.getPRFNamedRecursiveFragmentRule()) {
					sequence_PRFNamedRecursiveFragment_RecursiveFragment(context, (PRFNamedWithAction) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedRecursiveRule()) {
					sequence_PRFNamedRecursive_RecursiveFromFragment(context, (PRFNamedWithAction) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedWithActionRule()) {
					sequence_PRFNamedWithAction(context, (PRFNamedWithAction) semanticObject); 
					return; 
				}
				else break;
			case FragmentTestLanguagePackage.PARSER_RULE_FRAGMENTS:
				sequence_ParserRuleFragments(context, (ParserRuleFragments) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
}
