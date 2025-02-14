/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithExpressionImpl#getReferencedAdvice <em>Referenced Advice</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.WithExpressionImpl#getFuncExpr <em>Func Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithExpressionImpl extends ExpressionImpl implements WithExpression
{
  /**
   * The cached value of the '{@link #getReferencedAdvice() <em>Referenced Advice</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedAdvice()
   * @generated
   * @ordered
   */
  protected EList<String> referencedAdvice;

  /**
   * The cached value of the '{@link #getFuncExpr() <em>Func Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncExpr()
   * @generated
   * @ordered
   */
  protected Expression funcExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WithExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BeeLangTestLanguagePackage.Literals.WITH_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getReferencedAdvice()
  {
    if (referencedAdvice == null)
    {
      referencedAdvice = new EDataTypeEList<String>(String.class, this, BeeLangTestLanguagePackage.WITH_EXPRESSION__REFERENCED_ADVICE);
    }
    return referencedAdvice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getFuncExpr()
  {
    return funcExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuncExpr(Expression newFuncExpr, NotificationChain msgs)
  {
    Expression oldFuncExpr = funcExpr;
    funcExpr = newFuncExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.WITH_EXPRESSION__FUNC_EXPR, oldFuncExpr, newFuncExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFuncExpr(Expression newFuncExpr)
  {
    if (newFuncExpr != funcExpr)
    {
      NotificationChain msgs = null;
      if (funcExpr != null)
        msgs = ((InternalEObject)funcExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.WITH_EXPRESSION__FUNC_EXPR, null, msgs);
      if (newFuncExpr != null)
        msgs = ((InternalEObject)newFuncExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.WITH_EXPRESSION__FUNC_EXPR, null, msgs);
      msgs = basicSetFuncExpr(newFuncExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.WITH_EXPRESSION__FUNC_EXPR, newFuncExpr, newFuncExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.WITH_EXPRESSION__FUNC_EXPR:
        return basicSetFuncExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.WITH_EXPRESSION__REFERENCED_ADVICE:
        return getReferencedAdvice();
      case BeeLangTestLanguagePackage.WITH_EXPRESSION__FUNC_EXPR:
        return getFuncExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.WITH_EXPRESSION__REFERENCED_ADVICE:
        getReferencedAdvice().clear();
        getReferencedAdvice().addAll((Collection<? extends String>)newValue);
        return;
      case BeeLangTestLanguagePackage.WITH_EXPRESSION__FUNC_EXPR:
        setFuncExpr((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.WITH_EXPRESSION__REFERENCED_ADVICE:
        getReferencedAdvice().clear();
        return;
      case BeeLangTestLanguagePackage.WITH_EXPRESSION__FUNC_EXPR:
        setFuncExpr((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.WITH_EXPRESSION__REFERENCED_ADVICE:
        return referencedAdvice != null && !referencedAdvice.isEmpty();
      case BeeLangTestLanguagePackage.WITH_EXPRESSION__FUNC_EXPR:
        return funcExpr != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (referencedAdvice: ");
    result.append(referencedAdvice);
    result.append(')');
    return result.toString();
  }

} //WithExpressionImpl
