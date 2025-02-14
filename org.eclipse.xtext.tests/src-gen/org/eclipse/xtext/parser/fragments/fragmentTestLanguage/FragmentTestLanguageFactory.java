/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parser.fragments.fragmentTestLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage
 * @generated
 */
public interface FragmentTestLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FragmentTestLanguageFactory eINSTANCE = org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentTestLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Parser Rule Fragments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parser Rule Fragments</em>'.
   * @generated
   */
  ParserRuleFragments createParserRuleFragments();

  /**
   * Returns a new object of class '<em>PRF Named</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PRF Named</em>'.
   * @generated
   */
  PRFNamed createPRFNamed();

  /**
   * Returns a new object of class '<em>PRF Named With Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PRF Named With Action</em>'.
   * @generated
   */
  PRFNamedWithAction createPRFNamedWithAction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FragmentTestLanguagePackage getFragmentTestLanguagePackage();

} //FragmentTestLanguageFactory
