/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.treeTestLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.treeTestLanguage.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.treeTestLanguage.Node#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.treeTestLanguage.Node#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.testlanguages.treeTestLanguage.TreeTestLanguagePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.testlanguages.treeTestLanguage.TreeTestLanguagePackage#getNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.treeTestLanguage.Node#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrib</em>' attribute.
   * @see #setAttrib(String)
   * @see org.eclipse.xtext.testlanguages.treeTestLanguage.TreeTestLanguagePackage#getNode_Attrib()
   * @model
   * @generated
   */
  String getAttrib();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.treeTestLanguage.Node#getAttrib <em>Attrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrib</em>' attribute.
   * @see #getAttrib()
   * @generated
   */
  void setAttrib(String value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.testlanguages.treeTestLanguage.Node}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.eclipse.xtext.testlanguages.treeTestLanguage.TreeTestLanguagePackage#getNode_Children()
   * @model containment="true"
   * @generated
   */
  EList<Node> getChildren();

} // Node
