/*
 * generated by Xtext 2.9.1
 */
package com.netfective.editor.dsl.ui.tests;

import com.google.inject.Injector;
import com.netfective.editor.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class WorkflowUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("com.netfective.editor.dsl.Workflow");
	}

}
