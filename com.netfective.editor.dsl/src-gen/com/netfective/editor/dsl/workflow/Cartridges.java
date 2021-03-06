/**
 * generated by Xtext 2.9.1
 */
package com.netfective.editor.dsl.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartridges</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netfective.editor.dsl.workflow.Cartridges#getName <em>Name</em>}</li>
 *   <li>{@link com.netfective.editor.dsl.workflow.Cartridges#getCartdriges <em>Cartdriges</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netfective.editor.dsl.workflow.WorkflowPackage#getCartridges()
 * @model
 * @generated
 */
public interface Cartridges extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.netfective.editor.dsl.workflow.WorkflowPackage#getCartridges_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.netfective.editor.dsl.workflow.Cartridges#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cartdriges</b></em>' containment reference list.
   * The list contents are of type {@link com.netfective.editor.dsl.workflow.Cartridge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cartdriges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cartdriges</em>' containment reference list.
   * @see com.netfective.editor.dsl.workflow.WorkflowPackage#getCartridges_Cartdriges()
   * @model containment="true"
   * @generated
   */
  EList<Cartridge> getCartdriges();

} // Cartridges
