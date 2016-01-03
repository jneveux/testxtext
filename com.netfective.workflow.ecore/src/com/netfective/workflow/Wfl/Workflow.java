/**
 */
package com.netfective.workflow.Wfl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netfective.workflow.Wfl.Workflow#getCartridges <em>Cartridges</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netfective.workflow.Wfl.WflPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Cartridges</b></em>' containment reference list.
	 * The list contents are of type {@link com.netfective.workflow.Wfl.CartridgeWFL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartridges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartridges</em>' containment reference list.
	 * @see com.netfective.workflow.Wfl.WflPackage#getWorkflow_Cartridges()
	 * @model containment="true"
	 * @generated
	 */
	EList<CartridgeWFL> getCartridges();

} // Workflow
