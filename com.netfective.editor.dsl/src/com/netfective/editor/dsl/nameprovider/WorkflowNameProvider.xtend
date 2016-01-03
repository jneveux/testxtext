package com.netfective.editor.dsl.nameprovider

import com.netfective.editor.dsl.workflow.Cartridge
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import com.netfective.editor.dsl.workflow.PropertyCartridge
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.EcoreUtil2

class WorkflowNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	override getFullyQualifiedName(EObject obj) {
		if(obj instanceof Cartridge) {
			return getQualifiedName(obj)
		}
		if(obj instanceof PropertyCartridge) {
			var node = NodeModelUtils.getNode(obj)
			var fqn = node.text.split(" ").get(0).trim
			println("FQN PC. "+fqn)
			return QualifiedName.create(fqn)
		}
		return super.getFullyQualifiedName(obj);
	}

	def getQualifiedName(Cartridge e) {
		var node = NodeModelUtils.getNode(e)
		var fqn = node.text.split(" ").get(0).trim
    	var name = getConverter().toQualifiedName(fqn);
    	println("FQN CA. "+fqn + " :: "+name)
    	//var fqn = e.name
    	return name //QualifiedName.create(name)
	}
}