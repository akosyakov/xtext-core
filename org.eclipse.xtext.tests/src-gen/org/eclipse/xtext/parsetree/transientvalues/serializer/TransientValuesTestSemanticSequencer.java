/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parsetree.transientvalues.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parsetree.transientvalues.services.TransientValuesTestGrammarAccess;
import org.eclipse.xtext.parsetree.transientvalues.transientvaluestest.TestList;
import org.eclipse.xtext.parsetree.transientvalues.transientvaluestest.TestOptional;
import org.eclipse.xtext.parsetree.transientvalues.transientvaluestest.TestRequired;
import org.eclipse.xtext.parsetree.transientvalues.transientvaluestest.TransientvaluestestPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TransientValuesTestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TransientValuesTestGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TransientvaluestestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TransientvaluestestPackage.TEST_LIST:
				sequence_TestList(context, (TestList) semanticObject); 
				return; 
			case TransientvaluestestPackage.TEST_OPTIONAL:
				sequence_TestOptional(context, (TestOptional) semanticObject); 
				return; 
			case TransientvaluestestPackage.TEST_REQUIRED:
				sequence_TestRequired(context, (TestRequired) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Root returns TestList
	 *     TestList returns TestList
	 *
	 * Constraint:
	 *     item+=INT*
	 * </pre>
	 */
	protected void sequence_TestList(ISerializationContext context, TestList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Root returns TestOptional
	 *     TestOptional returns TestOptional
	 *
	 * Constraint:
	 *     (opt1=INT? opt2=INT?)
	 * </pre>
	 */
	protected void sequence_TestOptional(ISerializationContext context, TestOptional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Root returns TestRequired
	 *     TestRequired returns TestRequired
	 *
	 * Constraint:
	 *     (required1=INT required2=INT)
	 * </pre>
	 */
	protected void sequence_TestRequired(ISerializationContext context, TestRequired semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransientvaluestestPackage.Literals.TEST_REQUIRED__REQUIRED1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransientvaluestestPackage.Literals.TEST_REQUIRED__REQUIRED1));
			if (transientValues.isValueTransient(semanticObject, TransientvaluestestPackage.Literals.TEST_REQUIRED__REQUIRED2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransientvaluestestPackage.Literals.TEST_REQUIRED__REQUIRED2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTestRequiredAccess().getRequired1INTTerminalRuleCall_2_0(), semanticObject.getRequired1());
		feeder.accept(grammarAccess.getTestRequiredAccess().getRequired2INTTerminalRuleCall_3_0(), semanticObject.getRequired2());
		feeder.finish();
	}
	
	
}
