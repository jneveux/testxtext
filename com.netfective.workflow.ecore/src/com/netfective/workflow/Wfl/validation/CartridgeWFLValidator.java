/**
 *
 * $Id$
 */
package com.netfective.workflow.Wfl.validation;

import com.netfective.workflow.Wfl.PropertyWFL;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link com.netfective.workflow.Wfl.CartridgeWFL}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CartridgeWFLValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateProperties(EList<PropertyWFL> value);
}