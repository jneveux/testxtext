/*
 * generated by Xtext 2.9.1
 */
package com.netfective.editor.dsl.serializer;

import com.google.inject.Inject;
import com.netfective.editor.dsl.services.WorkflowGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class WorkflowSyntacticSequencer extends AbstractSyntacticSequencer {

	protected WorkflowGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Property_BOOLEANParserRuleCall_2_2_or_INTTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (WorkflowGrammarAccess) access;
		match_Property_BOOLEANParserRuleCall_2_2_or_INTTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPropertyAccess().getBOOLEANParserRuleCall_2_2()), new TokenAlias(false, false, grammarAccess.getPropertyAccess().getINTTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getPropertyAccess().getSTRINGTerminalRuleCall_2_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBOOLEANRule())
			return getBOOLEANToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * BOOLEAN returns ecore::EBoolean :
	 * 	'true' | 'false'
	 * ;
	 */
	protected String getBOOLEANToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Property_BOOLEANParserRuleCall_2_2_or_INTTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_0.equals(syntax))
				emit_Property_BOOLEANParserRuleCall_2_2_or_INTTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     STRING | INT | BOOLEAN
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID '=' (ambiguity) (rule end)
	 */
	protected void emit_Property_BOOLEANParserRuleCall_2_2_or_INTTerminalRuleCall_2_1_or_STRINGTerminalRuleCall_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
