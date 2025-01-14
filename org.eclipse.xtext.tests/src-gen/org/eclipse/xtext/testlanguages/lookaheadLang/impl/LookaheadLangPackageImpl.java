/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.lookaheadLang.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.testlanguages.lookaheadLang.Alts;
import org.eclipse.xtext.testlanguages.lookaheadLang.Entry;
import org.eclipse.xtext.testlanguages.lookaheadLang.FewerLookAheadStrings;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead0;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead1;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead2;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead3;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead4;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookAheadPredicate;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookAheadStrings;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookaheadLangFactory;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookaheadLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LookaheadLangPackageImpl extends EPackageImpl implements LookaheadLangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass altsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookAhead0EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookAhead1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookAhead2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookAhead3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookAhead4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookAheadPredicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookBeyondEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookAheadStringsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fewerLookAheadStringsEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookaheadLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LookaheadLangPackageImpl()
  {
    super(eNS_URI, LookaheadLangFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link LookaheadLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LookaheadLangPackage init()
  {
    if (isInited) return (LookaheadLangPackage)EPackage.Registry.INSTANCE.getEPackage(LookaheadLangPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredLookaheadLangPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    LookaheadLangPackageImpl theLookaheadLangPackage = registeredLookaheadLangPackage instanceof LookaheadLangPackageImpl ? (LookaheadLangPackageImpl)registeredLookaheadLangPackage : new LookaheadLangPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theLookaheadLangPackage.createPackageContents();

    // Initialize created meta-data
    theLookaheadLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLookaheadLangPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LookaheadLangPackage.eNS_URI, theLookaheadLangPackage);
    return theLookaheadLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEntry()
  {
    return entryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEntry_Contents()
  {
    return (EReference)entryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAlts()
  {
    return altsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLookAhead0()
  {
    return lookAhead0EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLookAhead0_X()
  {
    return (EAttribute)lookAhead0EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLookAhead1()
  {
    return lookAhead1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLookAhead1_Y()
  {
    return (EReference)lookAhead1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLookAhead1_X()
  {
    return (EAttribute)lookAhead1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLookAhead1_Z()
  {
    return (EAttribute)lookAhead1EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLookAhead2()
  {
    return lookAhead2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLookAhead2_Z()
  {
    return (EAttribute)lookAhead2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLookAhead3()
  {
    return lookAhead3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLookAhead3_X()
  {
    return (EAttribute)lookAhead3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLookAhead3_Z()
  {
    return (EReference)lookAhead3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLookAhead4()
  {
    return lookAhead4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLookAhead4_X()
  {
    return (EAttribute)lookAhead4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLookAheadPredicate()
  {
    return lookAheadPredicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLookBeyond()
  {
    return lookBeyondEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLookBeyond_Left()
  {
    return (EReference)lookBeyondEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLookBeyond_Right()
  {
    return (EReference)lookBeyondEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLookAheadStrings()
  {
    return lookAheadStringsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLookAheadStrings_Values()
  {
    return (EAttribute)lookAheadStringsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFewerLookAheadStrings()
  {
    return fewerLookAheadStringsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFewerLookAheadStrings_Values()
  {
    return (EAttribute)fewerLookAheadStringsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LookaheadLangFactory getLookaheadLangFactory()
  {
    return (LookaheadLangFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    entryEClass = createEClass(ENTRY);
    createEReference(entryEClass, ENTRY__CONTENTS);

    altsEClass = createEClass(ALTS);

    lookAhead0EClass = createEClass(LOOK_AHEAD0);
    createEAttribute(lookAhead0EClass, LOOK_AHEAD0__X);

    lookAhead1EClass = createEClass(LOOK_AHEAD1);
    createEReference(lookAhead1EClass, LOOK_AHEAD1__Y);
    createEAttribute(lookAhead1EClass, LOOK_AHEAD1__X);
    createEAttribute(lookAhead1EClass, LOOK_AHEAD1__Z);

    lookAhead2EClass = createEClass(LOOK_AHEAD2);
    createEAttribute(lookAhead2EClass, LOOK_AHEAD2__Z);

    lookAhead3EClass = createEClass(LOOK_AHEAD3);
    createEAttribute(lookAhead3EClass, LOOK_AHEAD3__X);
    createEReference(lookAhead3EClass, LOOK_AHEAD3__Z);

    lookAhead4EClass = createEClass(LOOK_AHEAD4);
    createEAttribute(lookAhead4EClass, LOOK_AHEAD4__X);

    lookAheadPredicateEClass = createEClass(LOOK_AHEAD_PREDICATE);

    lookBeyondEClass = createEClass(LOOK_BEYOND);
    createEReference(lookBeyondEClass, LOOK_BEYOND__LEFT);
    createEReference(lookBeyondEClass, LOOK_BEYOND__RIGHT);

    lookAheadStringsEClass = createEClass(LOOK_AHEAD_STRINGS);
    createEAttribute(lookAheadStringsEClass, LOOK_AHEAD_STRINGS__VALUES);

    fewerLookAheadStringsEClass = createEClass(FEWER_LOOK_AHEAD_STRINGS);
    createEAttribute(fewerLookAheadStringsEClass, FEWER_LOOK_AHEAD_STRINGS__VALUES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    lookAhead0EClass.getESuperTypes().add(this.getAlts());
    lookAhead1EClass.getESuperTypes().add(this.getAlts());
    lookAhead3EClass.getESuperTypes().add(this.getAlts());
    lookAheadPredicateEClass.getESuperTypes().add(this.getAlts());
    lookBeyondEClass.getESuperTypes().add(this.getAlts());

    // Initialize classes and features; add operations and parameters
    initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntry_Contents(), this.getAlts(), null, "contents", null, 0, -1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(altsEClass, Alts.class, "Alts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lookAhead0EClass, LookAhead0.class, "LookAhead0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookAhead0_X(), theEcorePackage.getEString(), "x", null, 0, 1, LookAhead0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookAhead1EClass, LookAhead1.class, "LookAhead1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLookAhead1_Y(), this.getLookAhead2(), null, "y", null, 0, 1, LookAhead1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLookAhead1_X(), theEcorePackage.getEString(), "x", null, 0, 1, LookAhead1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLookAhead1_Z(), theEcorePackage.getEString(), "z", null, 0, 1, LookAhead1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookAhead2EClass, LookAhead2.class, "LookAhead2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookAhead2_Z(), theEcorePackage.getEString(), "z", null, 0, 1, LookAhead2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookAhead3EClass, LookAhead3.class, "LookAhead3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookAhead3_X(), theEcorePackage.getEString(), "x", null, 0, 1, LookAhead3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLookAhead3_Z(), this.getLookAhead4(), null, "z", null, 0, 1, LookAhead3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookAhead4EClass, LookAhead4.class, "LookAhead4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookAhead4_X(), theEcorePackage.getEString(), "x", null, 0, 1, LookAhead4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookAheadPredicateEClass, LookAheadPredicate.class, "LookAheadPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lookBeyondEClass, LookBeyond.class, "LookBeyond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLookBeyond_Left(), this.getLookAheadStrings(), null, "left", null, 0, 1, LookBeyond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLookBeyond_Right(), this.getFewerLookAheadStrings(), null, "right", null, 0, 1, LookBeyond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookAheadStringsEClass, LookAheadStrings.class, "LookAheadStrings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookAheadStrings_Values(), theEcorePackage.getEString(), "values", null, 0, -1, LookAheadStrings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fewerLookAheadStringsEClass, FewerLookAheadStrings.class, "FewerLookAheadStrings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFewerLookAheadStrings_Values(), theEcorePackage.getEString(), "values", null, 0, -1, FewerLookAheadStrings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LookaheadLangPackageImpl
