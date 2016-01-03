/**
 */
package com.netfective.workflow.Wfl.impl;

import com.netfective.workflow.Wfl.CartridgeWFL;
import com.netfective.workflow.Wfl.PropertyWFL;
import com.netfective.workflow.Wfl.WflFactory;
import com.netfective.workflow.Wfl.WflPackage;
import com.netfective.workflow.Wfl.Workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WflPackageImpl extends EPackageImpl implements WflPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartridgeWFLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyWFLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

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
	 * @see com.netfective.workflow.Wfl.WflPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WflPackageImpl() {
		super(eNS_URI, WflFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WflPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WflPackage init() {
		if (isInited) return (WflPackage)EPackage.Registry.INSTANCE.getEPackage(WflPackage.eNS_URI);

		// Obtain or create and register package
		WflPackageImpl theWflPackage = (WflPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WflPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WflPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWflPackage.createPackageContents();

		// Initialize created meta-data
		theWflPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWflPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WflPackage.eNS_URI, theWflPackage);
		return theWflPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartridgeWFL() {
		return cartridgeWFLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartridgeWFL_Name() {
		return (EAttribute)cartridgeWFLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartridgeWFL_Properties() {
		return (EReference)cartridgeWFLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyWFL() {
		return propertyWFLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyWFL_Name() {
		return (EAttribute)propertyWFLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyWFL_Value() {
		return (EAttribute)propertyWFLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Cartridges() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WflFactory getWflFactory() {
		return (WflFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cartridgeWFLEClass = createEClass(CARTRIDGE_WFL);
		createEAttribute(cartridgeWFLEClass, CARTRIDGE_WFL__NAME);
		createEReference(cartridgeWFLEClass, CARTRIDGE_WFL__PROPERTIES);

		propertyWFLEClass = createEClass(PROPERTY_WFL);
		createEAttribute(propertyWFLEClass, PROPERTY_WFL__NAME);
		createEAttribute(propertyWFLEClass, PROPERTY_WFL__VALUE);

		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__CARTRIDGES);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cartridgeWFLEClass, CartridgeWFL.class, "CartridgeWFL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartridgeWFL_Name(), ecorePackage.getEString(), "name", null, 0, 1, CartridgeWFL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartridgeWFL_Properties(), this.getPropertyWFL(), null, "properties", null, 0, -1, CartridgeWFL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyWFLEClass, PropertyWFL.class, "PropertyWFL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyWFL_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyWFL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyWFL_Value(), ecorePackage.getEString(), "value", null, 0, 1, PropertyWFL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_Cartridges(), this.getCartridgeWFL(), null, "cartridges", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WflPackageImpl
