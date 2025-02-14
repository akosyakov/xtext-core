/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.lexer.backtrackingTestLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.lexer.backtrackingTestLanguage.Model#getEnums <em>Enums</em>}</li>
 *   <li>{@link org.eclipse.xtext.lexer.backtrackingTestLanguage.Model#getYcs <em>Ycs</em>}</li>
 *   <li>{@link org.eclipse.xtext.lexer.backtrackingTestLanguage.Model#getAbs <em>Abs</em>}</li>
 *   <li>{@link org.eclipse.xtext.lexer.backtrackingTestLanguage.Model#getXbs <em>Xbs</em>}</li>
 *   <li>{@link org.eclipse.xtext.lexer.backtrackingTestLanguage.Model#getYs <em>Ys</em>}</li>
 *   <li>{@link org.eclipse.xtext.lexer.backtrackingTestLanguage.Model#getAs <em>As</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.lexer.backtrackingTestLanguage.BacktrackingTestLanguagePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Enums</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.xtext.lexer.backtrackingTestLanguage.EnumName}.
   * The literals are from the enumeration {@link org.eclipse.xtext.lexer.backtrackingTestLanguage.EnumName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' attribute list.
   * @see org.eclipse.xtext.lexer.backtrackingTestLanguage.EnumName
   * @see org.eclipse.xtext.lexer.backtrackingTestLanguage.BacktrackingTestLanguagePackage#getModel_Enums()
   * @model unique="false"
   * @generated
   */
  EList<EnumName> getEnums();

  /**
   * Returns the value of the '<em><b>Ycs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ycs</em>' attribute list.
   * @see org.eclipse.xtext.lexer.backtrackingTestLanguage.BacktrackingTestLanguagePackage#getModel_Ycs()
   * @model unique="false"
   * @generated
   */
  EList<String> getYcs();

  /**
   * Returns the value of the '<em><b>Abs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.lexer.backtrackingTestLanguage.Ab}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abs</em>' containment reference list.
   * @see org.eclipse.xtext.lexer.backtrackingTestLanguage.BacktrackingTestLanguagePackage#getModel_Abs()
   * @model containment="true"
   * @generated
   */
  EList<Ab> getAbs();

  /**
   * Returns the value of the '<em><b>Xbs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.lexer.backtrackingTestLanguage.Xb}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xbs</em>' containment reference list.
   * @see org.eclipse.xtext.lexer.backtrackingTestLanguage.BacktrackingTestLanguagePackage#getModel_Xbs()
   * @model containment="true"
   * @generated
   */
  EList<Xb> getXbs();

  /**
   * Returns the value of the '<em><b>Ys</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ys</em>' attribute list.
   * @see org.eclipse.xtext.lexer.backtrackingTestLanguage.BacktrackingTestLanguagePackage#getModel_Ys()
   * @model unique="false"
   * @generated
   */
  EList<String> getYs();

  /**
   * Returns the value of the '<em><b>As</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>As</em>' attribute list.
   * @see org.eclipse.xtext.lexer.backtrackingTestLanguage.BacktrackingTestLanguagePackage#getModel_As()
   * @model unique="false"
   * @generated
   */
  EList<String> getAs();

} // Model
