/*
 * generated by Xtext 2.9.1
 */
package com.netfective.editor.dsl.scoping

import com.netfective.editor.dsl.workflow.Cartridge
import com.netfective.editor.dsl.workflow.Model
import com.netfective.editor.dsl.workflow.WorkflowPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class WorkflowScopeProvider extends AbstractWorkflowScopeProvider {
//	override getScope(EObject context, EReference reference) {
//		if(reference == WorkflowPackage.Literals.PROPERTY_CARTRIDGE__CARTRIDGE) {
//			var model = context.eContainer
//			if(!(model instanceof Model)) {
//				model = context.eContainer.eContainer
//			}
//			var cartdriges = EcoreUtil2.getAllContentsOfType(model, Cartridge)
//			for(c : cartdriges) println("Found scopes: "+c)
//			return Scopes.scopeFor(cartdriges);	
//		}
//		return IScope.NULLSCOPE;
//	}
}
