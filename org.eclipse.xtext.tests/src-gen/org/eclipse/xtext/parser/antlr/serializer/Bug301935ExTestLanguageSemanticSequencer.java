/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.antlr.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.antlr.bug301935Test.Bug301935TestPackage;
import org.eclipse.xtext.parser.antlr.bug301935Test.Model;
import org.eclipse.xtext.parser.antlr.services.Bug301935ExTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;

@SuppressWarnings("all")
public class Bug301935ExTestLanguageSemanticSequencer extends Bug301935TestLanguageSemanticSequencer {

	@Inject
	private Bug301935ExTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Bug301935TestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Bug301935TestPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
}
