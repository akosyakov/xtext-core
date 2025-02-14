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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getSourceLocation <em>Source Location</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getOutputLocation <em>Output Location</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.UnitImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitImpl extends MinimalEObjectImpl.Container implements Unit
{
  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

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
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected EList<SimpleTypeRef> implements_;

  /**
   * The default value of the '{@link #getSourceLocation() <em>Source Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLocation()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceLocation() <em>Source Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLocation()
   * @generated
   * @ordered
   */
  protected String sourceLocation = SOURCE_LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getOutputLocation() <em>Output Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputLocation()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutputLocation() <em>Output Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputLocation()
   * @generated
   * @ordered
   */
  protected String outputLocation = OUTPUT_LOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedCapabilities()
   * @generated
   * @ordered
   */
  protected EList<ProvidedCapability> providedCapabilities;

  /**
   * The cached value of the '{@link #getRequiredCapabilities() <em>Required Capabilities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredCapabilities()
   * @generated
   * @ordered
   */
  protected EList<AliasedRequiredCapability> requiredCapabilities;

  /**
   * The cached value of the '{@link #getMetaRequiredCapabilities() <em>Meta Required Capabilities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaRequiredCapabilities()
   * @generated
   * @ordered
   */
  protected EList<RequiredCapability> metaRequiredCapabilities;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function> functions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnitImpl()
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
    return BeeLangTestLanguagePackage.Literals.UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.UNIT__DOCUMENTATION, oldDocumentation, documentation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.UNIT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.UNIT__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SimpleTypeRef> getImplements()
  {
    if (implements_ == null)
    {
      implements_ = new EObjectContainmentEList<SimpleTypeRef>(SimpleTypeRef.class, this, BeeLangTestLanguagePackage.UNIT__IMPLEMENTS);
    }
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSourceLocation()
  {
    return sourceLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSourceLocation(String newSourceLocation)
  {
    String oldSourceLocation = sourceLocation;
    sourceLocation = newSourceLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.UNIT__SOURCE_LOCATION, oldSourceLocation, sourceLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOutputLocation()
  {
    return outputLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOutputLocation(String newOutputLocation)
  {
    String oldOutputLocation = outputLocation;
    outputLocation = newOutputLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.UNIT__OUTPUT_LOCATION, oldOutputLocation, outputLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ProvidedCapability> getProvidedCapabilities()
  {
    if (providedCapabilities == null)
    {
      providedCapabilities = new EObjectContainmentEList<ProvidedCapability>(ProvidedCapability.class, this, BeeLangTestLanguagePackage.UNIT__PROVIDED_CAPABILITIES);
    }
    return providedCapabilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AliasedRequiredCapability> getRequiredCapabilities()
  {
    if (requiredCapabilities == null)
    {
      requiredCapabilities = new EObjectContainmentEList<AliasedRequiredCapability>(AliasedRequiredCapability.class, this, BeeLangTestLanguagePackage.UNIT__REQUIRED_CAPABILITIES);
    }
    return requiredCapabilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RequiredCapability> getMetaRequiredCapabilities()
  {
    if (metaRequiredCapabilities == null)
    {
      metaRequiredCapabilities = new EObjectContainmentEList<RequiredCapability>(RequiredCapability.class, this, BeeLangTestLanguagePackage.UNIT__META_REQUIRED_CAPABILITIES);
    }
    return metaRequiredCapabilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Function> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function>(Function.class, this, BeeLangTestLanguagePackage.UNIT__FUNCTIONS);
    }
    return functions;
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
      case BeeLangTestLanguagePackage.UNIT__IMPLEMENTS:
        return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
      case BeeLangTestLanguagePackage.UNIT__PROVIDED_CAPABILITIES:
        return ((InternalEList<?>)getProvidedCapabilities()).basicRemove(otherEnd, msgs);
      case BeeLangTestLanguagePackage.UNIT__REQUIRED_CAPABILITIES:
        return ((InternalEList<?>)getRequiredCapabilities()).basicRemove(otherEnd, msgs);
      case BeeLangTestLanguagePackage.UNIT__META_REQUIRED_CAPABILITIES:
        return ((InternalEList<?>)getMetaRequiredCapabilities()).basicRemove(otherEnd, msgs);
      case BeeLangTestLanguagePackage.UNIT__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
      case BeeLangTestLanguagePackage.UNIT__DOCUMENTATION:
        return getDocumentation();
      case BeeLangTestLanguagePackage.UNIT__NAME:
        return getName();
      case BeeLangTestLanguagePackage.UNIT__VERSION:
        return getVersion();
      case BeeLangTestLanguagePackage.UNIT__IMPLEMENTS:
        return getImplements();
      case BeeLangTestLanguagePackage.UNIT__SOURCE_LOCATION:
        return getSourceLocation();
      case BeeLangTestLanguagePackage.UNIT__OUTPUT_LOCATION:
        return getOutputLocation();
      case BeeLangTestLanguagePackage.UNIT__PROVIDED_CAPABILITIES:
        return getProvidedCapabilities();
      case BeeLangTestLanguagePackage.UNIT__REQUIRED_CAPABILITIES:
        return getRequiredCapabilities();
      case BeeLangTestLanguagePackage.UNIT__META_REQUIRED_CAPABILITIES:
        return getMetaRequiredCapabilities();
      case BeeLangTestLanguagePackage.UNIT__FUNCTIONS:
        return getFunctions();
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
      case BeeLangTestLanguagePackage.UNIT__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case BeeLangTestLanguagePackage.UNIT__NAME:
        setName((String)newValue);
        return;
      case BeeLangTestLanguagePackage.UNIT__VERSION:
        setVersion((String)newValue);
        return;
      case BeeLangTestLanguagePackage.UNIT__IMPLEMENTS:
        getImplements().clear();
        getImplements().addAll((Collection<? extends SimpleTypeRef>)newValue);
        return;
      case BeeLangTestLanguagePackage.UNIT__SOURCE_LOCATION:
        setSourceLocation((String)newValue);
        return;
      case BeeLangTestLanguagePackage.UNIT__OUTPUT_LOCATION:
        setOutputLocation((String)newValue);
        return;
      case BeeLangTestLanguagePackage.UNIT__PROVIDED_CAPABILITIES:
        getProvidedCapabilities().clear();
        getProvidedCapabilities().addAll((Collection<? extends ProvidedCapability>)newValue);
        return;
      case BeeLangTestLanguagePackage.UNIT__REQUIRED_CAPABILITIES:
        getRequiredCapabilities().clear();
        getRequiredCapabilities().addAll((Collection<? extends AliasedRequiredCapability>)newValue);
        return;
      case BeeLangTestLanguagePackage.UNIT__META_REQUIRED_CAPABILITIES:
        getMetaRequiredCapabilities().clear();
        getMetaRequiredCapabilities().addAll((Collection<? extends RequiredCapability>)newValue);
        return;
      case BeeLangTestLanguagePackage.UNIT__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
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
      case BeeLangTestLanguagePackage.UNIT__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.UNIT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.UNIT__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.UNIT__IMPLEMENTS:
        getImplements().clear();
        return;
      case BeeLangTestLanguagePackage.UNIT__SOURCE_LOCATION:
        setSourceLocation(SOURCE_LOCATION_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.UNIT__OUTPUT_LOCATION:
        setOutputLocation(OUTPUT_LOCATION_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.UNIT__PROVIDED_CAPABILITIES:
        getProvidedCapabilities().clear();
        return;
      case BeeLangTestLanguagePackage.UNIT__REQUIRED_CAPABILITIES:
        getRequiredCapabilities().clear();
        return;
      case BeeLangTestLanguagePackage.UNIT__META_REQUIRED_CAPABILITIES:
        getMetaRequiredCapabilities().clear();
        return;
      case BeeLangTestLanguagePackage.UNIT__FUNCTIONS:
        getFunctions().clear();
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
      case BeeLangTestLanguagePackage.UNIT__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case BeeLangTestLanguagePackage.UNIT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BeeLangTestLanguagePackage.UNIT__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case BeeLangTestLanguagePackage.UNIT__IMPLEMENTS:
        return implements_ != null && !implements_.isEmpty();
      case BeeLangTestLanguagePackage.UNIT__SOURCE_LOCATION:
        return SOURCE_LOCATION_EDEFAULT == null ? sourceLocation != null : !SOURCE_LOCATION_EDEFAULT.equals(sourceLocation);
      case BeeLangTestLanguagePackage.UNIT__OUTPUT_LOCATION:
        return OUTPUT_LOCATION_EDEFAULT == null ? outputLocation != null : !OUTPUT_LOCATION_EDEFAULT.equals(outputLocation);
      case BeeLangTestLanguagePackage.UNIT__PROVIDED_CAPABILITIES:
        return providedCapabilities != null && !providedCapabilities.isEmpty();
      case BeeLangTestLanguagePackage.UNIT__REQUIRED_CAPABILITIES:
        return requiredCapabilities != null && !requiredCapabilities.isEmpty();
      case BeeLangTestLanguagePackage.UNIT__META_REQUIRED_CAPABILITIES:
        return metaRequiredCapabilities != null && !metaRequiredCapabilities.isEmpty();
      case BeeLangTestLanguagePackage.UNIT__FUNCTIONS:
        return functions != null && !functions.isEmpty();
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
    result.append(" (documentation: ");
    result.append(documentation);
    result.append(", name: ");
    result.append(name);
    result.append(", version: ");
    result.append(version);
    result.append(", sourceLocation: ");
    result.append(sourceLocation);
    result.append(", outputLocation: ");
    result.append(outputLocation);
    result.append(')');
    return result.toString();
  }

} //UnitImpl
