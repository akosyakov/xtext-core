/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ProvidedCapabilityImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ProvidedCapabilityImpl#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ProvidedCapabilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ProvidedCapabilityImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedCapabilityImpl extends MinimalEObjectImpl.Container implements ProvidedCapability
{
  /**
   * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameSpace()
   * @generated
   * @ordered
   */
  protected static final String NAME_SPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameSpace()
   * @generated
   * @ordered
   */
  protected String nameSpace = NAME_SPACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCondExpr() <em>Cond Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondExpr()
   * @generated
   * @ordered
   */
  protected Expression condExpr;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidedCapabilityImpl()
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
    return BeeLangTestLanguagePackage.Literals.PROVIDED_CAPABILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNameSpace()
  {
    return nameSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameSpace(String newNameSpace)
  {
    String oldNameSpace = nameSpace;
    nameSpace = newNameSpace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME_SPACE, oldNameSpace, nameSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCondExpr()
  {
    return condExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondExpr(Expression newCondExpr, NotificationChain msgs)
  {
    Expression oldCondExpr = condExpr;
    condExpr = newCondExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__COND_EXPR, oldCondExpr, newCondExpr);
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
  public void setCondExpr(Expression newCondExpr)
  {
    if (newCondExpr != condExpr)
    {
      NotificationChain msgs = null;
      if (condExpr != null)
        msgs = ((InternalEObject)condExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__COND_EXPR, null, msgs);
      if (newCondExpr != null)
        msgs = ((InternalEObject)newCondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__COND_EXPR, null, msgs);
      msgs = basicSetCondExpr(newCondExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__COND_EXPR, newCondExpr, newCondExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__VERSION, oldVersion, version));
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
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__COND_EXPR:
        return basicSetCondExpr(null, msgs);
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
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME_SPACE:
        return getNameSpace();
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__COND_EXPR:
        return getCondExpr();
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME:
        return getName();
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__VERSION:
        return getVersion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME_SPACE:
        setNameSpace((String)newValue);
        return;
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__COND_EXPR:
        setCondExpr((Expression)newValue);
        return;
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME:
        setName((String)newValue);
        return;
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__VERSION:
        setVersion((String)newValue);
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
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME_SPACE:
        setNameSpace(NAME_SPACE_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__COND_EXPR:
        setCondExpr((Expression)null);
        return;
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__VERSION:
        setVersion(VERSION_EDEFAULT);
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
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME_SPACE:
        return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__COND_EXPR:
        return condExpr != null;
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
    result.append(" (nameSpace: ");
    result.append(nameSpace);
    result.append(", name: ");
    result.append(name);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //ProvidedCapabilityImpl
