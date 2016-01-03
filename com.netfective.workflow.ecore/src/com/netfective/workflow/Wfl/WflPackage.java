/**
 */
package com.netfective.workflow.Wfl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.netfective.workflow.Wfl.WflFactory
 * @model kind="package"
 * @generated
 */
public interface WflPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Wfl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://netfective.com/wfl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WflPackage eINSTANCE = com.netfective.workflow.Wfl.impl.WflPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.netfective.workflow.Wfl.impl.CartridgeWFLImpl <em>Cartridge WFL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.netfective.workflow.Wfl.impl.CartridgeWFLImpl
	 * @see com.netfective.workflow.Wfl.impl.WflPackageImpl#getCartridgeWFL()
	 * @generated
	 */
	int CARTRIDGE_WFL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTRIDGE_WFL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTRIDGE_WFL__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Cartridge WFL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTRIDGE_WFL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cartridge WFL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTRIDGE_WFL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.netfective.workflow.Wfl.impl.PropertyWFLImpl <em>Property WFL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.netfective.workflow.Wfl.impl.PropertyWFLImpl
	 * @see com.netfective.workflow.Wfl.impl.WflPackageImpl#getPropertyWFL()
	 * @generated
	 */
	int PROPERTY_WFL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WFL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WFL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property WFL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WFL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property WFL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_WFL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.netfective.workflow.Wfl.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.netfective.workflow.Wfl.impl.WorkflowImpl
	 * @see com.netfective.workflow.Wfl.impl.WflPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 2;

	/**
	 * The feature id for the '<em><b>Cartridges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CARTRIDGES = 0;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.netfective.workflow.Wfl.CartridgeWFL <em>Cartridge WFL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartridge WFL</em>'.
	 * @see com.netfective.workflow.Wfl.CartridgeWFL
	 * @generated
	 */
	EClass getCartridgeWFL();

	/**
	 * Returns the meta object for the attribute '{@link com.netfective.workflow.Wfl.CartridgeWFL#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.netfective.workflow.Wfl.CartridgeWFL#getName()
	 * @see #getCartridgeWFL()
	 * @generated
	 */
	EAttribute getCartridgeWFL_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.netfective.workflow.Wfl.CartridgeWFL#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.netfective.workflow.Wfl.CartridgeWFL#getProperties()
	 * @see #getCartridgeWFL()
	 * @generated
	 */
	EReference getCartridgeWFL_Properties();

	/**
	 * Returns the meta object for class '{@link com.netfective.workflow.Wfl.PropertyWFL <em>Property WFL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property WFL</em>'.
	 * @see com.netfective.workflow.Wfl.PropertyWFL
	 * @generated
	 */
	EClass getPropertyWFL();

	/**
	 * Returns the meta object for the attribute '{@link com.netfective.workflow.Wfl.PropertyWFL#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.netfective.workflow.Wfl.PropertyWFL#getName()
	 * @see #getPropertyWFL()
	 * @generated
	 */
	EAttribute getPropertyWFL_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.netfective.workflow.Wfl.PropertyWFL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.netfective.workflow.Wfl.PropertyWFL#getValue()
	 * @see #getPropertyWFL()
	 * @generated
	 */
	EAttribute getPropertyWFL_Value();

	/**
	 * Returns the meta object for class '{@link com.netfective.workflow.Wfl.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see com.netfective.workflow.Wfl.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link com.netfective.workflow.Wfl.Workflow#getCartridges <em>Cartridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cartridges</em>'.
	 * @see com.netfective.workflow.Wfl.Workflow#getCartridges()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Cartridges();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WflFactory getWflFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.netfective.workflow.Wfl.impl.CartridgeWFLImpl <em>Cartridge WFL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.netfective.workflow.Wfl.impl.CartridgeWFLImpl
		 * @see com.netfective.workflow.Wfl.impl.WflPackageImpl#getCartridgeWFL()
		 * @generated
		 */
		EClass CARTRIDGE_WFL = eINSTANCE.getCartridgeWFL();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTRIDGE_WFL__NAME = eINSTANCE.getCartridgeWFL_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTRIDGE_WFL__PROPERTIES = eINSTANCE.getCartridgeWFL_Properties();

		/**
		 * The meta object literal for the '{@link com.netfective.workflow.Wfl.impl.PropertyWFLImpl <em>Property WFL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.netfective.workflow.Wfl.impl.PropertyWFLImpl
		 * @see com.netfective.workflow.Wfl.impl.WflPackageImpl#getPropertyWFL()
		 * @generated
		 */
		EClass PROPERTY_WFL = eINSTANCE.getPropertyWFL();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_WFL__NAME = eINSTANCE.getPropertyWFL_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_WFL__VALUE = eINSTANCE.getPropertyWFL_Value();

		/**
		 * The meta object literal for the '{@link com.netfective.workflow.Wfl.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.netfective.workflow.Wfl.impl.WorkflowImpl
		 * @see com.netfective.workflow.Wfl.impl.WflPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Cartridges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CARTRIDGES = eINSTANCE.getWorkflow_Cartridges();

	}

} //WflPackage
