/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parsetree.reconstr.serializationerror;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Required</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.parsetree.reconstr.serializationerror.TwoRequired#getOne <em>One</em>}</li>
 *   <li>{@link org.eclipse.xtext.parsetree.reconstr.serializationerror.TwoRequired#getTwo <em>Two</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.parsetree.reconstr.serializationerror.SerializationerrorPackage#getTwoRequired()
 * @model
 * @generated
 */
public interface TwoRequired extends Test
{
  /**
   * Returns the value of the '<em><b>One</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>One</em>' attribute.
   * @see #setOne(String)
   * @see org.eclipse.xtext.parsetree.reconstr.serializationerror.SerializationerrorPackage#getTwoRequired_One()
   * @model
   * @generated
   */
  String getOne();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.parsetree.reconstr.serializationerror.TwoRequired#getOne <em>One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>One</em>' attribute.
   * @see #getOne()
   * @generated
   */
  void setOne(String value);

  /**
   * Returns the value of the '<em><b>Two</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Two</em>' attribute.
   * @see #setTwo(String)
   * @see org.eclipse.xtext.parsetree.reconstr.serializationerror.SerializationerrorPackage#getTwoRequired_Two()
   * @model
   * @generated
   */
  String getTwo();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.parsetree.reconstr.serializationerror.TwoRequired#getTwo <em>Two</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Two</em>' attribute.
   * @see #getTwo()
   * @generated
   */
  void setTwo(String value);

} // TwoRequired
