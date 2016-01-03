package com.netfective.editor.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.netfective.editor.dsl.services.WorkflowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWorkflowParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'{'", "'}'", "'='", "':'", "'.'", "'Cartridges'", "'Properties'", "'Resources'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalWorkflowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWorkflowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWorkflowParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWorkflow.g"; }


    	private WorkflowGrammarAccess grammarAccess;

    	public void setGrammarAccess(WorkflowGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalWorkflow.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalWorkflow.g:54:1: ( ruleModel EOF )
            // InternalWorkflow.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalWorkflow.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalWorkflow.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalWorkflow.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalWorkflow.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalWorkflow.g:69:3: ( rule__Model__Group__0 )
            // InternalWorkflow.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCartridges"
    // InternalWorkflow.g:78:1: entryRuleCartridges : ruleCartridges EOF ;
    public final void entryRuleCartridges() throws RecognitionException {
        try {
            // InternalWorkflow.g:79:1: ( ruleCartridges EOF )
            // InternalWorkflow.g:80:1: ruleCartridges EOF
            {
             before(grammarAccess.getCartridgesRule()); 
            pushFollow(FOLLOW_1);
            ruleCartridges();

            state._fsp--;

             after(grammarAccess.getCartridgesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCartridges"


    // $ANTLR start "ruleCartridges"
    // InternalWorkflow.g:87:1: ruleCartridges : ( ( rule__Cartridges__Group__0 ) ) ;
    public final void ruleCartridges() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:91:2: ( ( ( rule__Cartridges__Group__0 ) ) )
            // InternalWorkflow.g:92:2: ( ( rule__Cartridges__Group__0 ) )
            {
            // InternalWorkflow.g:92:2: ( ( rule__Cartridges__Group__0 ) )
            // InternalWorkflow.g:93:3: ( rule__Cartridges__Group__0 )
            {
             before(grammarAccess.getCartridgesAccess().getGroup()); 
            // InternalWorkflow.g:94:3: ( rule__Cartridges__Group__0 )
            // InternalWorkflow.g:94:4: rule__Cartridges__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cartridges__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCartridgesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCartridges"


    // $ANTLR start "entryRuleProperties"
    // InternalWorkflow.g:103:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // InternalWorkflow.g:104:1: ( ruleProperties EOF )
            // InternalWorkflow.g:105:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalWorkflow.g:112:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:116:2: ( ( ( rule__Properties__Group__0 ) ) )
            // InternalWorkflow.g:117:2: ( ( rule__Properties__Group__0 ) )
            {
            // InternalWorkflow.g:117:2: ( ( rule__Properties__Group__0 ) )
            // InternalWorkflow.g:118:3: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // InternalWorkflow.g:119:3: ( rule__Properties__Group__0 )
            // InternalWorkflow.g:119:4: rule__Properties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleResources"
    // InternalWorkflow.g:128:1: entryRuleResources : ruleResources EOF ;
    public final void entryRuleResources() throws RecognitionException {
        try {
            // InternalWorkflow.g:129:1: ( ruleResources EOF )
            // InternalWorkflow.g:130:1: ruleResources EOF
            {
             before(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getResourcesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalWorkflow.g:137:1: ruleResources : ( ( rule__Resources__Group__0 ) ) ;
    public final void ruleResources() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:141:2: ( ( ( rule__Resources__Group__0 ) ) )
            // InternalWorkflow.g:142:2: ( ( rule__Resources__Group__0 ) )
            {
            // InternalWorkflow.g:142:2: ( ( rule__Resources__Group__0 ) )
            // InternalWorkflow.g:143:3: ( rule__Resources__Group__0 )
            {
             before(grammarAccess.getResourcesAccess().getGroup()); 
            // InternalWorkflow.g:144:3: ( rule__Resources__Group__0 )
            // InternalWorkflow.g:144:4: rule__Resources__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleResource"
    // InternalWorkflow.g:153:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalWorkflow.g:154:1: ( ruleResource EOF )
            // InternalWorkflow.g:155:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalWorkflow.g:162:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:166:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalWorkflow.g:167:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalWorkflow.g:167:2: ( ( rule__Resource__Group__0 ) )
            // InternalWorkflow.g:168:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalWorkflow.g:169:3: ( rule__Resource__Group__0 )
            // InternalWorkflow.g:169:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRulePropertyCartridge"
    // InternalWorkflow.g:178:1: entryRulePropertyCartridge : rulePropertyCartridge EOF ;
    public final void entryRulePropertyCartridge() throws RecognitionException {
        try {
            // InternalWorkflow.g:179:1: ( rulePropertyCartridge EOF )
            // InternalWorkflow.g:180:1: rulePropertyCartridge EOF
            {
             before(grammarAccess.getPropertyCartridgeRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyCartridge();

            state._fsp--;

             after(grammarAccess.getPropertyCartridgeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyCartridge"


    // $ANTLR start "rulePropertyCartridge"
    // InternalWorkflow.g:187:1: rulePropertyCartridge : ( ( rule__PropertyCartridge__Group__0 ) ) ;
    public final void rulePropertyCartridge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:191:2: ( ( ( rule__PropertyCartridge__Group__0 ) ) )
            // InternalWorkflow.g:192:2: ( ( rule__PropertyCartridge__Group__0 ) )
            {
            // InternalWorkflow.g:192:2: ( ( rule__PropertyCartridge__Group__0 ) )
            // InternalWorkflow.g:193:3: ( rule__PropertyCartridge__Group__0 )
            {
             before(grammarAccess.getPropertyCartridgeAccess().getGroup()); 
            // InternalWorkflow.g:194:3: ( rule__PropertyCartridge__Group__0 )
            // InternalWorkflow.g:194:4: rule__PropertyCartridge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCartridge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCartridgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyCartridge"


    // $ANTLR start "entryRuleProperty"
    // InternalWorkflow.g:203:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalWorkflow.g:204:1: ( ruleProperty EOF )
            // InternalWorkflow.g:205:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalWorkflow.g:212:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:216:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalWorkflow.g:217:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalWorkflow.g:217:2: ( ( rule__Property__Group__0 ) )
            // InternalWorkflow.g:218:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalWorkflow.g:219:3: ( rule__Property__Group__0 )
            // InternalWorkflow.g:219:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalWorkflow.g:228:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalWorkflow.g:229:1: ( ruleBOOLEAN EOF )
            // InternalWorkflow.g:230:1: ruleBOOLEAN EOF
            {
             before(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBOOLEANRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalWorkflow.g:237:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:241:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // InternalWorkflow.g:242:2: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // InternalWorkflow.g:242:2: ( ( rule__BOOLEAN__Alternatives ) )
            // InternalWorkflow.g:243:3: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // InternalWorkflow.g:244:3: ( rule__BOOLEAN__Alternatives )
            // InternalWorkflow.g:244:4: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOLEAN__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleCartridge"
    // InternalWorkflow.g:253:1: entryRuleCartridge : ruleCartridge EOF ;
    public final void entryRuleCartridge() throws RecognitionException {
        try {
            // InternalWorkflow.g:254:1: ( ruleCartridge EOF )
            // InternalWorkflow.g:255:1: ruleCartridge EOF
            {
             before(grammarAccess.getCartridgeRule()); 
            pushFollow(FOLLOW_1);
            ruleCartridge();

            state._fsp--;

             after(grammarAccess.getCartridgeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCartridge"


    // $ANTLR start "ruleCartridge"
    // InternalWorkflow.g:262:1: ruleCartridge : ( ( rule__Cartridge__Group__0 ) ) ;
    public final void ruleCartridge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:266:2: ( ( ( rule__Cartridge__Group__0 ) ) )
            // InternalWorkflow.g:267:2: ( ( rule__Cartridge__Group__0 ) )
            {
            // InternalWorkflow.g:267:2: ( ( rule__Cartridge__Group__0 ) )
            // InternalWorkflow.g:268:3: ( rule__Cartridge__Group__0 )
            {
             before(grammarAccess.getCartridgeAccess().getGroup()); 
            // InternalWorkflow.g:269:3: ( rule__Cartridge__Group__0 )
            // InternalWorkflow.g:269:4: rule__Cartridge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cartridge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCartridgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCartridge"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalWorkflow.g:278:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalWorkflow.g:279:1: ( ruleQualifiedName EOF )
            // InternalWorkflow.g:280:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalWorkflow.g:287:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:291:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalWorkflow.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalWorkflow.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalWorkflow.g:293:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalWorkflow.g:294:3: ( rule__QualifiedName__Group__0 )
            // InternalWorkflow.g:294:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleActivated"
    // InternalWorkflow.g:303:1: ruleActivated : ( ( rule__Activated__Alternatives ) ) ;
    public final void ruleActivated() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:307:1: ( ( ( rule__Activated__Alternatives ) ) )
            // InternalWorkflow.g:308:2: ( ( rule__Activated__Alternatives ) )
            {
            // InternalWorkflow.g:308:2: ( ( rule__Activated__Alternatives ) )
            // InternalWorkflow.g:309:3: ( rule__Activated__Alternatives )
            {
             before(grammarAccess.getActivatedAccess().getAlternatives()); 
            // InternalWorkflow.g:310:3: ( rule__Activated__Alternatives )
            // InternalWorkflow.g:310:4: rule__Activated__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Activated__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivatedAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivated"


    // $ANTLR start "rule__Property__Alternatives_2"
    // InternalWorkflow.g:318:1: rule__Property__Alternatives_2 : ( ( RULE_STRING ) | ( RULE_INT ) | ( ruleBOOLEAN ) );
    public final void rule__Property__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:322:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( ruleBOOLEAN ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                alt1=2;
                }
                break;
            case 11:
            case 12:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalWorkflow.g:323:2: ( RULE_STRING )
                    {
                    // InternalWorkflow.g:323:2: ( RULE_STRING )
                    // InternalWorkflow.g:324:3: RULE_STRING
                    {
                     before(grammarAccess.getPropertyAccess().getSTRINGTerminalRuleCall_2_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getSTRINGTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflow.g:329:2: ( RULE_INT )
                    {
                    // InternalWorkflow.g:329:2: ( RULE_INT )
                    // InternalWorkflow.g:330:3: RULE_INT
                    {
                     before(grammarAccess.getPropertyAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWorkflow.g:335:2: ( ruleBOOLEAN )
                    {
                    // InternalWorkflow.g:335:2: ( ruleBOOLEAN )
                    // InternalWorkflow.g:336:3: ruleBOOLEAN
                    {
                     before(grammarAccess.getPropertyAccess().getBOOLEANParserRuleCall_2_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBOOLEAN();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getBOOLEANParserRuleCall_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Alternatives_2"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // InternalWorkflow.g:345:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:349:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWorkflow.g:350:2: ( 'true' )
                    {
                    // InternalWorkflow.g:350:2: ( 'true' )
                    // InternalWorkflow.g:351:3: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflow.g:356:2: ( 'false' )
                    {
                    // InternalWorkflow.g:356:2: ( 'false' )
                    // InternalWorkflow.g:357:3: 'false'
                    {
                     before(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__Activated__Alternatives"
    // InternalWorkflow.g:366:1: rule__Activated__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__Activated__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:370:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWorkflow.g:371:2: ( ( 'true' ) )
                    {
                    // InternalWorkflow.g:371:2: ( ( 'true' ) )
                    // InternalWorkflow.g:372:3: ( 'true' )
                    {
                     before(grammarAccess.getActivatedAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalWorkflow.g:373:3: ( 'true' )
                    // InternalWorkflow.g:373:4: 'true'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivatedAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflow.g:377:2: ( ( 'false' ) )
                    {
                    // InternalWorkflow.g:377:2: ( ( 'false' ) )
                    // InternalWorkflow.g:378:3: ( 'false' )
                    {
                     before(grammarAccess.getActivatedAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalWorkflow.g:379:3: ( 'false' )
                    // InternalWorkflow.g:379:4: 'false'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivatedAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activated__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalWorkflow.g:387:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:391:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalWorkflow.g:392:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalWorkflow.g:399:1: rule__Model__Group__0__Impl : ( ( rule__Model__WFBspAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:403:1: ( ( ( rule__Model__WFBspAssignment_0 ) ) )
            // InternalWorkflow.g:404:1: ( ( rule__Model__WFBspAssignment_0 ) )
            {
            // InternalWorkflow.g:404:1: ( ( rule__Model__WFBspAssignment_0 ) )
            // InternalWorkflow.g:405:2: ( rule__Model__WFBspAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getWFBspAssignment_0()); 
            // InternalWorkflow.g:406:2: ( rule__Model__WFBspAssignment_0 )
            // InternalWorkflow.g:406:3: rule__Model__WFBspAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__WFBspAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getWFBspAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalWorkflow.g:414:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:418:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalWorkflow.g:419:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalWorkflow.g:426:1: rule__Model__Group__1__Impl : ( ( rule__Model__WFPropertyAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:430:1: ( ( ( rule__Model__WFPropertyAssignment_1 ) ) )
            // InternalWorkflow.g:431:1: ( ( rule__Model__WFPropertyAssignment_1 ) )
            {
            // InternalWorkflow.g:431:1: ( ( rule__Model__WFPropertyAssignment_1 ) )
            // InternalWorkflow.g:432:2: ( rule__Model__WFPropertyAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getWFPropertyAssignment_1()); 
            // InternalWorkflow.g:433:2: ( rule__Model__WFPropertyAssignment_1 )
            // InternalWorkflow.g:433:3: rule__Model__WFPropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__WFPropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getWFPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalWorkflow.g:441:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:445:1: ( rule__Model__Group__2__Impl )
            // InternalWorkflow.g:446:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalWorkflow.g:452:1: rule__Model__Group__2__Impl : ( ( rule__Model__WFResourceAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:456:1: ( ( ( rule__Model__WFResourceAssignment_2 ) ) )
            // InternalWorkflow.g:457:1: ( ( rule__Model__WFResourceAssignment_2 ) )
            {
            // InternalWorkflow.g:457:1: ( ( rule__Model__WFResourceAssignment_2 ) )
            // InternalWorkflow.g:458:2: ( rule__Model__WFResourceAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getWFResourceAssignment_2()); 
            // InternalWorkflow.g:459:2: ( rule__Model__WFResourceAssignment_2 )
            // InternalWorkflow.g:459:3: rule__Model__WFResourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__WFResourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getWFResourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Cartridges__Group__0"
    // InternalWorkflow.g:468:1: rule__Cartridges__Group__0 : rule__Cartridges__Group__0__Impl rule__Cartridges__Group__1 ;
    public final void rule__Cartridges__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:472:1: ( rule__Cartridges__Group__0__Impl rule__Cartridges__Group__1 )
            // InternalWorkflow.g:473:2: rule__Cartridges__Group__0__Impl rule__Cartridges__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Cartridges__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cartridges__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__Group__0"


    // $ANTLR start "rule__Cartridges__Group__0__Impl"
    // InternalWorkflow.g:480:1: rule__Cartridges__Group__0__Impl : ( ( rule__Cartridges__NameAssignment_0 ) ) ;
    public final void rule__Cartridges__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:484:1: ( ( ( rule__Cartridges__NameAssignment_0 ) ) )
            // InternalWorkflow.g:485:1: ( ( rule__Cartridges__NameAssignment_0 ) )
            {
            // InternalWorkflow.g:485:1: ( ( rule__Cartridges__NameAssignment_0 ) )
            // InternalWorkflow.g:486:2: ( rule__Cartridges__NameAssignment_0 )
            {
             before(grammarAccess.getCartridgesAccess().getNameAssignment_0()); 
            // InternalWorkflow.g:487:2: ( rule__Cartridges__NameAssignment_0 )
            // InternalWorkflow.g:487:3: rule__Cartridges__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cartridges__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCartridgesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__Group__0__Impl"


    // $ANTLR start "rule__Cartridges__Group__1"
    // InternalWorkflow.g:495:1: rule__Cartridges__Group__1 : rule__Cartridges__Group__1__Impl rule__Cartridges__Group__2 ;
    public final void rule__Cartridges__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:499:1: ( rule__Cartridges__Group__1__Impl rule__Cartridges__Group__2 )
            // InternalWorkflow.g:500:2: rule__Cartridges__Group__1__Impl rule__Cartridges__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Cartridges__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cartridges__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__Group__1"


    // $ANTLR start "rule__Cartridges__Group__1__Impl"
    // InternalWorkflow.g:507:1: rule__Cartridges__Group__1__Impl : ( '{' ) ;
    public final void rule__Cartridges__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:511:1: ( ( '{' ) )
            // InternalWorkflow.g:512:1: ( '{' )
            {
            // InternalWorkflow.g:512:1: ( '{' )
            // InternalWorkflow.g:513:2: '{'
            {
             before(grammarAccess.getCartridgesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCartridgesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__Group__1__Impl"


    // $ANTLR start "rule__Cartridges__Group__2"
    // InternalWorkflow.g:522:1: rule__Cartridges__Group__2 : rule__Cartridges__Group__2__Impl rule__Cartridges__Group__3 ;
    public final void rule__Cartridges__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:526:1: ( rule__Cartridges__Group__2__Impl rule__Cartridges__Group__3 )
            // InternalWorkflow.g:527:2: rule__Cartridges__Group__2__Impl rule__Cartridges__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Cartridges__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cartridges__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__Group__2"


    // $ANTLR start "rule__Cartridges__Group__2__Impl"
    // InternalWorkflow.g:534:1: rule__Cartridges__Group__2__Impl : ( ( rule__Cartridges__CartdrigesAssignment_2 )* ) ;
    public final void rule__Cartridges__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:538:1: ( ( ( rule__Cartridges__CartdrigesAssignment_2 )* ) )
            // InternalWorkflow.g:539:1: ( ( rule__Cartridges__CartdrigesAssignment_2 )* )
            {
            // InternalWorkflow.g:539:1: ( ( rule__Cartridges__CartdrigesAssignment_2 )* )
            // InternalWorkflow.g:540:2: ( rule__Cartridges__CartdrigesAssignment_2 )*
            {
             before(grammarAccess.getCartridgesAccess().getCartdrigesAssignment_2()); 
            // InternalWorkflow.g:541:2: ( rule__Cartridges__CartdrigesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWorkflow.g:541:3: rule__Cartridges__CartdrigesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Cartridges__CartdrigesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCartridgesAccess().getCartdrigesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__Group__2__Impl"


    // $ANTLR start "rule__Cartridges__Group__3"
    // InternalWorkflow.g:549:1: rule__Cartridges__Group__3 : rule__Cartridges__Group__3__Impl ;
    public final void rule__Cartridges__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:553:1: ( rule__Cartridges__Group__3__Impl )
            // InternalWorkflow.g:554:2: rule__Cartridges__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cartridges__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__Group__3"


    // $ANTLR start "rule__Cartridges__Group__3__Impl"
    // InternalWorkflow.g:560:1: rule__Cartridges__Group__3__Impl : ( '}' ) ;
    public final void rule__Cartridges__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:564:1: ( ( '}' ) )
            // InternalWorkflow.g:565:1: ( '}' )
            {
            // InternalWorkflow.g:565:1: ( '}' )
            // InternalWorkflow.g:566:2: '}'
            {
             before(grammarAccess.getCartridgesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCartridgesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__Group__3__Impl"


    // $ANTLR start "rule__Properties__Group__0"
    // InternalWorkflow.g:576:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:580:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // InternalWorkflow.g:581:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0"


    // $ANTLR start "rule__Properties__Group__0__Impl"
    // InternalWorkflow.g:588:1: rule__Properties__Group__0__Impl : ( ( rule__Properties__NameAssignment_0 ) ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:592:1: ( ( ( rule__Properties__NameAssignment_0 ) ) )
            // InternalWorkflow.g:593:1: ( ( rule__Properties__NameAssignment_0 ) )
            {
            // InternalWorkflow.g:593:1: ( ( rule__Properties__NameAssignment_0 ) )
            // InternalWorkflow.g:594:2: ( rule__Properties__NameAssignment_0 )
            {
             before(grammarAccess.getPropertiesAccess().getNameAssignment_0()); 
            // InternalWorkflow.g:595:2: ( rule__Properties__NameAssignment_0 )
            // InternalWorkflow.g:595:3: rule__Properties__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Properties__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0__Impl"


    // $ANTLR start "rule__Properties__Group__1"
    // InternalWorkflow.g:603:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl rule__Properties__Group__2 ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:607:1: ( rule__Properties__Group__1__Impl rule__Properties__Group__2 )
            // InternalWorkflow.g:608:2: rule__Properties__Group__1__Impl rule__Properties__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Properties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__1"


    // $ANTLR start "rule__Properties__Group__1__Impl"
    // InternalWorkflow.g:615:1: rule__Properties__Group__1__Impl : ( '{' ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:619:1: ( ( '{' ) )
            // InternalWorkflow.g:620:1: ( '{' )
            {
            // InternalWorkflow.g:620:1: ( '{' )
            // InternalWorkflow.g:621:2: '{'
            {
             before(grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__1__Impl"


    // $ANTLR start "rule__Properties__Group__2"
    // InternalWorkflow.g:630:1: rule__Properties__Group__2 : rule__Properties__Group__2__Impl rule__Properties__Group__3 ;
    public final void rule__Properties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:634:1: ( rule__Properties__Group__2__Impl rule__Properties__Group__3 )
            // InternalWorkflow.g:635:2: rule__Properties__Group__2__Impl rule__Properties__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Properties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__2"


    // $ANTLR start "rule__Properties__Group__2__Impl"
    // InternalWorkflow.g:642:1: rule__Properties__Group__2__Impl : ( ( rule__Properties__PropertiesAssignment_2 )* ) ;
    public final void rule__Properties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:646:1: ( ( ( rule__Properties__PropertiesAssignment_2 )* ) )
            // InternalWorkflow.g:647:1: ( ( rule__Properties__PropertiesAssignment_2 )* )
            {
            // InternalWorkflow.g:647:1: ( ( rule__Properties__PropertiesAssignment_2 )* )
            // InternalWorkflow.g:648:2: ( rule__Properties__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAssignment_2()); 
            // InternalWorkflow.g:649:2: ( rule__Properties__PropertiesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWorkflow.g:649:3: rule__Properties__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Properties__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPropertiesAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__2__Impl"


    // $ANTLR start "rule__Properties__Group__3"
    // InternalWorkflow.g:657:1: rule__Properties__Group__3 : rule__Properties__Group__3__Impl ;
    public final void rule__Properties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:661:1: ( rule__Properties__Group__3__Impl )
            // InternalWorkflow.g:662:2: rule__Properties__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__3"


    // $ANTLR start "rule__Properties__Group__3__Impl"
    // InternalWorkflow.g:668:1: rule__Properties__Group__3__Impl : ( '}' ) ;
    public final void rule__Properties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:672:1: ( ( '}' ) )
            // InternalWorkflow.g:673:1: ( '}' )
            {
            // InternalWorkflow.g:673:1: ( '}' )
            // InternalWorkflow.g:674:2: '}'
            {
             before(grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__3__Impl"


    // $ANTLR start "rule__Resources__Group__0"
    // InternalWorkflow.g:684:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:688:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // InternalWorkflow.g:689:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Resources__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0"


    // $ANTLR start "rule__Resources__Group__0__Impl"
    // InternalWorkflow.g:696:1: rule__Resources__Group__0__Impl : ( ( rule__Resources__NameAssignment_0 ) ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:700:1: ( ( ( rule__Resources__NameAssignment_0 ) ) )
            // InternalWorkflow.g:701:1: ( ( rule__Resources__NameAssignment_0 ) )
            {
            // InternalWorkflow.g:701:1: ( ( rule__Resources__NameAssignment_0 ) )
            // InternalWorkflow.g:702:2: ( rule__Resources__NameAssignment_0 )
            {
             before(grammarAccess.getResourcesAccess().getNameAssignment_0()); 
            // InternalWorkflow.g:703:2: ( rule__Resources__NameAssignment_0 )
            // InternalWorkflow.g:703:3: rule__Resources__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Resources__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0__Impl"


    // $ANTLR start "rule__Resources__Group__1"
    // InternalWorkflow.g:711:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl rule__Resources__Group__2 ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:715:1: ( rule__Resources__Group__1__Impl rule__Resources__Group__2 )
            // InternalWorkflow.g:716:2: rule__Resources__Group__1__Impl rule__Resources__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Resources__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1"


    // $ANTLR start "rule__Resources__Group__1__Impl"
    // InternalWorkflow.g:723:1: rule__Resources__Group__1__Impl : ( '{' ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:727:1: ( ( '{' ) )
            // InternalWorkflow.g:728:1: ( '{' )
            {
            // InternalWorkflow.g:728:1: ( '{' )
            // InternalWorkflow.g:729:2: '{'
            {
             before(grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1__Impl"


    // $ANTLR start "rule__Resources__Group__2"
    // InternalWorkflow.g:738:1: rule__Resources__Group__2 : rule__Resources__Group__2__Impl rule__Resources__Group__3 ;
    public final void rule__Resources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:742:1: ( rule__Resources__Group__2__Impl rule__Resources__Group__3 )
            // InternalWorkflow.g:743:2: rule__Resources__Group__2__Impl rule__Resources__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Resources__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__2"


    // $ANTLR start "rule__Resources__Group__2__Impl"
    // InternalWorkflow.g:750:1: rule__Resources__Group__2__Impl : ( ( ( rule__Resources__ResourcesAssignment_2 ) ) ( ( rule__Resources__ResourcesAssignment_2 )* ) ) ;
    public final void rule__Resources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:754:1: ( ( ( ( rule__Resources__ResourcesAssignment_2 ) ) ( ( rule__Resources__ResourcesAssignment_2 )* ) ) )
            // InternalWorkflow.g:755:1: ( ( ( rule__Resources__ResourcesAssignment_2 ) ) ( ( rule__Resources__ResourcesAssignment_2 )* ) )
            {
            // InternalWorkflow.g:755:1: ( ( ( rule__Resources__ResourcesAssignment_2 ) ) ( ( rule__Resources__ResourcesAssignment_2 )* ) )
            // InternalWorkflow.g:756:2: ( ( rule__Resources__ResourcesAssignment_2 ) ) ( ( rule__Resources__ResourcesAssignment_2 )* )
            {
            // InternalWorkflow.g:756:2: ( ( rule__Resources__ResourcesAssignment_2 ) )
            // InternalWorkflow.g:757:3: ( rule__Resources__ResourcesAssignment_2 )
            {
             before(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); 
            // InternalWorkflow.g:758:3: ( rule__Resources__ResourcesAssignment_2 )
            // InternalWorkflow.g:758:4: rule__Resources__ResourcesAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__Resources__ResourcesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); 

            }

            // InternalWorkflow.g:761:2: ( ( rule__Resources__ResourcesAssignment_2 )* )
            // InternalWorkflow.g:762:3: ( rule__Resources__ResourcesAssignment_2 )*
            {
             before(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); 
            // InternalWorkflow.g:763:3: ( rule__Resources__ResourcesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWorkflow.g:763:4: rule__Resources__ResourcesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Resources__ResourcesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__2__Impl"


    // $ANTLR start "rule__Resources__Group__3"
    // InternalWorkflow.g:772:1: rule__Resources__Group__3 : rule__Resources__Group__3__Impl ;
    public final void rule__Resources__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:776:1: ( rule__Resources__Group__3__Impl )
            // InternalWorkflow.g:777:2: rule__Resources__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__3"


    // $ANTLR start "rule__Resources__Group__3__Impl"
    // InternalWorkflow.g:783:1: rule__Resources__Group__3__Impl : ( '}' ) ;
    public final void rule__Resources__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:787:1: ( ( '}' ) )
            // InternalWorkflow.g:788:1: ( '}' )
            {
            // InternalWorkflow.g:788:1: ( '}' )
            // InternalWorkflow.g:789:2: '}'
            {
             before(grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalWorkflow.g:799:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:803:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalWorkflow.g:804:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalWorkflow.g:811:1: rule__Resource__Group__0__Impl : ( ( rule__Resource__NameAssignment_0 ) ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:815:1: ( ( ( rule__Resource__NameAssignment_0 ) ) )
            // InternalWorkflow.g:816:1: ( ( rule__Resource__NameAssignment_0 ) )
            {
            // InternalWorkflow.g:816:1: ( ( rule__Resource__NameAssignment_0 ) )
            // InternalWorkflow.g:817:2: ( rule__Resource__NameAssignment_0 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0()); 
            // InternalWorkflow.g:818:2: ( rule__Resource__NameAssignment_0 )
            // InternalWorkflow.g:818:3: rule__Resource__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalWorkflow.g:826:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:830:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalWorkflow.g:831:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalWorkflow.g:838:1: rule__Resource__Group__1__Impl : ( '{' ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:842:1: ( ( '{' ) )
            // InternalWorkflow.g:843:1: ( '{' )
            {
            // InternalWorkflow.g:843:1: ( '{' )
            // InternalWorkflow.g:844:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalWorkflow.g:853:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:857:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalWorkflow.g:858:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalWorkflow.g:865:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__PropertiesAssignment_2 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:869:1: ( ( ( rule__Resource__PropertiesAssignment_2 ) ) )
            // InternalWorkflow.g:870:1: ( ( rule__Resource__PropertiesAssignment_2 ) )
            {
            // InternalWorkflow.g:870:1: ( ( rule__Resource__PropertiesAssignment_2 ) )
            // InternalWorkflow.g:871:2: ( rule__Resource__PropertiesAssignment_2 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_2()); 
            // InternalWorkflow.g:872:2: ( rule__Resource__PropertiesAssignment_2 )
            // InternalWorkflow.g:872:3: rule__Resource__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__PropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalWorkflow.g:880:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:884:1: ( rule__Resource__Group__3__Impl )
            // InternalWorkflow.g:885:2: rule__Resource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalWorkflow.g:891:1: rule__Resource__Group__3__Impl : ( '}' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:895:1: ( ( '}' ) )
            // InternalWorkflow.g:896:1: ( '}' )
            {
            // InternalWorkflow.g:896:1: ( '}' )
            // InternalWorkflow.g:897:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__PropertyCartridge__Group__0"
    // InternalWorkflow.g:907:1: rule__PropertyCartridge__Group__0 : rule__PropertyCartridge__Group__0__Impl rule__PropertyCartridge__Group__1 ;
    public final void rule__PropertyCartridge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:911:1: ( rule__PropertyCartridge__Group__0__Impl rule__PropertyCartridge__Group__1 )
            // InternalWorkflow.g:912:2: rule__PropertyCartridge__Group__0__Impl rule__PropertyCartridge__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PropertyCartridge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCartridge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__Group__0"


    // $ANTLR start "rule__PropertyCartridge__Group__0__Impl"
    // InternalWorkflow.g:919:1: rule__PropertyCartridge__Group__0__Impl : ( ( rule__PropertyCartridge__CartridgeAssignment_0 ) ) ;
    public final void rule__PropertyCartridge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:923:1: ( ( ( rule__PropertyCartridge__CartridgeAssignment_0 ) ) )
            // InternalWorkflow.g:924:1: ( ( rule__PropertyCartridge__CartridgeAssignment_0 ) )
            {
            // InternalWorkflow.g:924:1: ( ( rule__PropertyCartridge__CartridgeAssignment_0 ) )
            // InternalWorkflow.g:925:2: ( rule__PropertyCartridge__CartridgeAssignment_0 )
            {
             before(grammarAccess.getPropertyCartridgeAccess().getCartridgeAssignment_0()); 
            // InternalWorkflow.g:926:2: ( rule__PropertyCartridge__CartridgeAssignment_0 )
            // InternalWorkflow.g:926:3: rule__PropertyCartridge__CartridgeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCartridge__CartridgeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCartridgeAccess().getCartridgeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__Group__0__Impl"


    // $ANTLR start "rule__PropertyCartridge__Group__1"
    // InternalWorkflow.g:934:1: rule__PropertyCartridge__Group__1 : rule__PropertyCartridge__Group__1__Impl rule__PropertyCartridge__Group__2 ;
    public final void rule__PropertyCartridge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:938:1: ( rule__PropertyCartridge__Group__1__Impl rule__PropertyCartridge__Group__2 )
            // InternalWorkflow.g:939:2: rule__PropertyCartridge__Group__1__Impl rule__PropertyCartridge__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__PropertyCartridge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCartridge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__Group__1"


    // $ANTLR start "rule__PropertyCartridge__Group__1__Impl"
    // InternalWorkflow.g:946:1: rule__PropertyCartridge__Group__1__Impl : ( '{' ) ;
    public final void rule__PropertyCartridge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:950:1: ( ( '{' ) )
            // InternalWorkflow.g:951:1: ( '{' )
            {
            // InternalWorkflow.g:951:1: ( '{' )
            // InternalWorkflow.g:952:2: '{'
            {
             before(grammarAccess.getPropertyCartridgeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPropertyCartridgeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__Group__1__Impl"


    // $ANTLR start "rule__PropertyCartridge__Group__2"
    // InternalWorkflow.g:961:1: rule__PropertyCartridge__Group__2 : rule__PropertyCartridge__Group__2__Impl rule__PropertyCartridge__Group__3 ;
    public final void rule__PropertyCartridge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:965:1: ( rule__PropertyCartridge__Group__2__Impl rule__PropertyCartridge__Group__3 )
            // InternalWorkflow.g:966:2: rule__PropertyCartridge__Group__2__Impl rule__PropertyCartridge__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyCartridge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCartridge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__Group__2"


    // $ANTLR start "rule__PropertyCartridge__Group__2__Impl"
    // InternalWorkflow.g:973:1: rule__PropertyCartridge__Group__2__Impl : ( ( rule__PropertyCartridge__PropertiesAssignment_2 )* ) ;
    public final void rule__PropertyCartridge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:977:1: ( ( ( rule__PropertyCartridge__PropertiesAssignment_2 )* ) )
            // InternalWorkflow.g:978:1: ( ( rule__PropertyCartridge__PropertiesAssignment_2 )* )
            {
            // InternalWorkflow.g:978:1: ( ( rule__PropertyCartridge__PropertiesAssignment_2 )* )
            // InternalWorkflow.g:979:2: ( rule__PropertyCartridge__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getPropertyCartridgeAccess().getPropertiesAssignment_2()); 
            // InternalWorkflow.g:980:2: ( rule__PropertyCartridge__PropertiesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWorkflow.g:980:3: rule__PropertyCartridge__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PropertyCartridge__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPropertyCartridgeAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__Group__2__Impl"


    // $ANTLR start "rule__PropertyCartridge__Group__3"
    // InternalWorkflow.g:988:1: rule__PropertyCartridge__Group__3 : rule__PropertyCartridge__Group__3__Impl ;
    public final void rule__PropertyCartridge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:992:1: ( rule__PropertyCartridge__Group__3__Impl )
            // InternalWorkflow.g:993:2: rule__PropertyCartridge__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCartridge__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__Group__3"


    // $ANTLR start "rule__PropertyCartridge__Group__3__Impl"
    // InternalWorkflow.g:999:1: rule__PropertyCartridge__Group__3__Impl : ( '}' ) ;
    public final void rule__PropertyCartridge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1003:1: ( ( '}' ) )
            // InternalWorkflow.g:1004:1: ( '}' )
            {
            // InternalWorkflow.g:1004:1: ( '}' )
            // InternalWorkflow.g:1005:2: '}'
            {
             before(grammarAccess.getPropertyCartridgeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyCartridgeAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalWorkflow.g:1015:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1019:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalWorkflow.g:1020:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalWorkflow.g:1027:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1031:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalWorkflow.g:1032:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalWorkflow.g:1032:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalWorkflow.g:1033:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalWorkflow.g:1034:2: ( rule__Property__NameAssignment_0 )
            // InternalWorkflow.g:1034:3: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalWorkflow.g:1042:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1046:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalWorkflow.g:1047:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalWorkflow.g:1054:1: rule__Property__Group__1__Impl : ( '=' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1058:1: ( ( '=' ) )
            // InternalWorkflow.g:1059:1: ( '=' )
            {
            // InternalWorkflow.g:1059:1: ( '=' )
            // InternalWorkflow.g:1060:2: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalWorkflow.g:1069:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1073:1: ( rule__Property__Group__2__Impl )
            // InternalWorkflow.g:1074:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalWorkflow.g:1080:1: rule__Property__Group__2__Impl : ( ( rule__Property__Alternatives_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1084:1: ( ( ( rule__Property__Alternatives_2 ) ) )
            // InternalWorkflow.g:1085:1: ( ( rule__Property__Alternatives_2 ) )
            {
            // InternalWorkflow.g:1085:1: ( ( rule__Property__Alternatives_2 ) )
            // InternalWorkflow.g:1086:2: ( rule__Property__Alternatives_2 )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives_2()); 
            // InternalWorkflow.g:1087:2: ( rule__Property__Alternatives_2 )
            // InternalWorkflow.g:1087:3: rule__Property__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Cartridge__Group__0"
    // InternalWorkflow.g:1096:1: rule__Cartridge__Group__0 : rule__Cartridge__Group__0__Impl rule__Cartridge__Group__1 ;
    public final void rule__Cartridge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1100:1: ( rule__Cartridge__Group__0__Impl rule__Cartridge__Group__1 )
            // InternalWorkflow.g:1101:2: rule__Cartridge__Group__0__Impl rule__Cartridge__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Cartridge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cartridge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridge__Group__0"


    // $ANTLR start "rule__Cartridge__Group__0__Impl"
    // InternalWorkflow.g:1108:1: rule__Cartridge__Group__0__Impl : ( ( rule__Cartridge__CartridgeAssignment_0 ) ) ;
    public final void rule__Cartridge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1112:1: ( ( ( rule__Cartridge__CartridgeAssignment_0 ) ) )
            // InternalWorkflow.g:1113:1: ( ( rule__Cartridge__CartridgeAssignment_0 ) )
            {
            // InternalWorkflow.g:1113:1: ( ( rule__Cartridge__CartridgeAssignment_0 ) )
            // InternalWorkflow.g:1114:2: ( rule__Cartridge__CartridgeAssignment_0 )
            {
             before(grammarAccess.getCartridgeAccess().getCartridgeAssignment_0()); 
            // InternalWorkflow.g:1115:2: ( rule__Cartridge__CartridgeAssignment_0 )
            // InternalWorkflow.g:1115:3: rule__Cartridge__CartridgeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cartridge__CartridgeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCartridgeAccess().getCartridgeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridge__Group__0__Impl"


    // $ANTLR start "rule__Cartridge__Group__1"
    // InternalWorkflow.g:1123:1: rule__Cartridge__Group__1 : rule__Cartridge__Group__1__Impl rule__Cartridge__Group__2 ;
    public final void rule__Cartridge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1127:1: ( rule__Cartridge__Group__1__Impl rule__Cartridge__Group__2 )
            // InternalWorkflow.g:1128:2: rule__Cartridge__Group__1__Impl rule__Cartridge__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Cartridge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cartridge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridge__Group__1"


    // $ANTLR start "rule__Cartridge__Group__1__Impl"
    // InternalWorkflow.g:1135:1: rule__Cartridge__Group__1__Impl : ( ':' ) ;
    public final void rule__Cartridge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1139:1: ( ( ':' ) )
            // InternalWorkflow.g:1140:1: ( ':' )
            {
            // InternalWorkflow.g:1140:1: ( ':' )
            // InternalWorkflow.g:1141:2: ':'
            {
             before(grammarAccess.getCartridgeAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCartridgeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridge__Group__1__Impl"


    // $ANTLR start "rule__Cartridge__Group__2"
    // InternalWorkflow.g:1150:1: rule__Cartridge__Group__2 : rule__Cartridge__Group__2__Impl ;
    public final void rule__Cartridge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1154:1: ( rule__Cartridge__Group__2__Impl )
            // InternalWorkflow.g:1155:2: rule__Cartridge__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cartridge__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridge__Group__2"


    // $ANTLR start "rule__Cartridge__Group__2__Impl"
    // InternalWorkflow.g:1161:1: rule__Cartridge__Group__2__Impl : ( ( rule__Cartridge__ActivatedAssignment_2 ) ) ;
    public final void rule__Cartridge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1165:1: ( ( ( rule__Cartridge__ActivatedAssignment_2 ) ) )
            // InternalWorkflow.g:1166:1: ( ( rule__Cartridge__ActivatedAssignment_2 ) )
            {
            // InternalWorkflow.g:1166:1: ( ( rule__Cartridge__ActivatedAssignment_2 ) )
            // InternalWorkflow.g:1167:2: ( rule__Cartridge__ActivatedAssignment_2 )
            {
             before(grammarAccess.getCartridgeAccess().getActivatedAssignment_2()); 
            // InternalWorkflow.g:1168:2: ( rule__Cartridge__ActivatedAssignment_2 )
            // InternalWorkflow.g:1168:3: rule__Cartridge__ActivatedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cartridge__ActivatedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCartridgeAccess().getActivatedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridge__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalWorkflow.g:1177:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1181:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalWorkflow.g:1182:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalWorkflow.g:1189:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1193:1: ( ( RULE_ID ) )
            // InternalWorkflow.g:1194:1: ( RULE_ID )
            {
            // InternalWorkflow.g:1194:1: ( RULE_ID )
            // InternalWorkflow.g:1195:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalWorkflow.g:1204:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1208:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalWorkflow.g:1209:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalWorkflow.g:1215:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1219:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalWorkflow.g:1220:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalWorkflow.g:1220:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalWorkflow.g:1221:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalWorkflow.g:1222:2: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWorkflow.g:1222:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalWorkflow.g:1231:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1235:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalWorkflow.g:1236:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalWorkflow.g:1243:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1247:1: ( ( '.' ) )
            // InternalWorkflow.g:1248:1: ( '.' )
            {
            // InternalWorkflow.g:1248:1: ( '.' )
            // InternalWorkflow.g:1249:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalWorkflow.g:1258:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1262:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalWorkflow.g:1263:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalWorkflow.g:1269:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1273:1: ( ( RULE_ID ) )
            // InternalWorkflow.g:1274:1: ( RULE_ID )
            {
            // InternalWorkflow.g:1274:1: ( RULE_ID )
            // InternalWorkflow.g:1275:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__WFBspAssignment_0"
    // InternalWorkflow.g:1285:1: rule__Model__WFBspAssignment_0 : ( ruleCartridges ) ;
    public final void rule__Model__WFBspAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1289:1: ( ( ruleCartridges ) )
            // InternalWorkflow.g:1290:2: ( ruleCartridges )
            {
            // InternalWorkflow.g:1290:2: ( ruleCartridges )
            // InternalWorkflow.g:1291:3: ruleCartridges
            {
             before(grammarAccess.getModelAccess().getWFBspCartridgesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCartridges();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWFBspCartridgesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__WFBspAssignment_0"


    // $ANTLR start "rule__Model__WFPropertyAssignment_1"
    // InternalWorkflow.g:1300:1: rule__Model__WFPropertyAssignment_1 : ( ruleProperties ) ;
    public final void rule__Model__WFPropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1304:1: ( ( ruleProperties ) )
            // InternalWorkflow.g:1305:2: ( ruleProperties )
            {
            // InternalWorkflow.g:1305:2: ( ruleProperties )
            // InternalWorkflow.g:1306:3: ruleProperties
            {
             before(grammarAccess.getModelAccess().getWFPropertyPropertiesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWFPropertyPropertiesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__WFPropertyAssignment_1"


    // $ANTLR start "rule__Model__WFResourceAssignment_2"
    // InternalWorkflow.g:1315:1: rule__Model__WFResourceAssignment_2 : ( ruleResources ) ;
    public final void rule__Model__WFResourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1319:1: ( ( ruleResources ) )
            // InternalWorkflow.g:1320:2: ( ruleResources )
            {
            // InternalWorkflow.g:1320:2: ( ruleResources )
            // InternalWorkflow.g:1321:3: ruleResources
            {
             before(grammarAccess.getModelAccess().getWFResourceResourcesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWFResourceResourcesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__WFResourceAssignment_2"


    // $ANTLR start "rule__Cartridges__NameAssignment_0"
    // InternalWorkflow.g:1330:1: rule__Cartridges__NameAssignment_0 : ( ( 'Cartridges' ) ) ;
    public final void rule__Cartridges__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1334:1: ( ( ( 'Cartridges' ) ) )
            // InternalWorkflow.g:1335:2: ( ( 'Cartridges' ) )
            {
            // InternalWorkflow.g:1335:2: ( ( 'Cartridges' ) )
            // InternalWorkflow.g:1336:3: ( 'Cartridges' )
            {
             before(grammarAccess.getCartridgesAccess().getNameCartridgesKeyword_0_0()); 
            // InternalWorkflow.g:1337:3: ( 'Cartridges' )
            // InternalWorkflow.g:1338:4: 'Cartridges'
            {
             before(grammarAccess.getCartridgesAccess().getNameCartridgesKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCartridgesAccess().getNameCartridgesKeyword_0_0()); 

            }

             after(grammarAccess.getCartridgesAccess().getNameCartridgesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__NameAssignment_0"


    // $ANTLR start "rule__Cartridges__CartdrigesAssignment_2"
    // InternalWorkflow.g:1349:1: rule__Cartridges__CartdrigesAssignment_2 : ( ruleCartridge ) ;
    public final void rule__Cartridges__CartdrigesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1353:1: ( ( ruleCartridge ) )
            // InternalWorkflow.g:1354:2: ( ruleCartridge )
            {
            // InternalWorkflow.g:1354:2: ( ruleCartridge )
            // InternalWorkflow.g:1355:3: ruleCartridge
            {
             before(grammarAccess.getCartridgesAccess().getCartdrigesCartridgeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCartridge();

            state._fsp--;

             after(grammarAccess.getCartridgesAccess().getCartdrigesCartridgeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridges__CartdrigesAssignment_2"


    // $ANTLR start "rule__Properties__NameAssignment_0"
    // InternalWorkflow.g:1364:1: rule__Properties__NameAssignment_0 : ( ( 'Properties' ) ) ;
    public final void rule__Properties__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1368:1: ( ( ( 'Properties' ) ) )
            // InternalWorkflow.g:1369:2: ( ( 'Properties' ) )
            {
            // InternalWorkflow.g:1369:2: ( ( 'Properties' ) )
            // InternalWorkflow.g:1370:3: ( 'Properties' )
            {
             before(grammarAccess.getPropertiesAccess().getNamePropertiesKeyword_0_0()); 
            // InternalWorkflow.g:1371:3: ( 'Properties' )
            // InternalWorkflow.g:1372:4: 'Properties'
            {
             before(grammarAccess.getPropertiesAccess().getNamePropertiesKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getNamePropertiesKeyword_0_0()); 

            }

             after(grammarAccess.getPropertiesAccess().getNamePropertiesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__NameAssignment_0"


    // $ANTLR start "rule__Properties__PropertiesAssignment_2"
    // InternalWorkflow.g:1383:1: rule__Properties__PropertiesAssignment_2 : ( rulePropertyCartridge ) ;
    public final void rule__Properties__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1387:1: ( ( rulePropertyCartridge ) )
            // InternalWorkflow.g:1388:2: ( rulePropertyCartridge )
            {
            // InternalWorkflow.g:1388:2: ( rulePropertyCartridge )
            // InternalWorkflow.g:1389:3: rulePropertyCartridge
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesPropertyCartridgeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyCartridge();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getPropertiesPropertyCartridgeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__PropertiesAssignment_2"


    // $ANTLR start "rule__Resources__NameAssignment_0"
    // InternalWorkflow.g:1398:1: rule__Resources__NameAssignment_0 : ( ( 'Resources' ) ) ;
    public final void rule__Resources__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1402:1: ( ( ( 'Resources' ) ) )
            // InternalWorkflow.g:1403:2: ( ( 'Resources' ) )
            {
            // InternalWorkflow.g:1403:2: ( ( 'Resources' ) )
            // InternalWorkflow.g:1404:3: ( 'Resources' )
            {
             before(grammarAccess.getResourcesAccess().getNameResourcesKeyword_0_0()); 
            // InternalWorkflow.g:1405:3: ( 'Resources' )
            // InternalWorkflow.g:1406:4: 'Resources'
            {
             before(grammarAccess.getResourcesAccess().getNameResourcesKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getNameResourcesKeyword_0_0()); 

            }

             after(grammarAccess.getResourcesAccess().getNameResourcesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__NameAssignment_0"


    // $ANTLR start "rule__Resources__ResourcesAssignment_2"
    // InternalWorkflow.g:1417:1: rule__Resources__ResourcesAssignment_2 : ( ruleResource ) ;
    public final void rule__Resources__ResourcesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1421:1: ( ( ruleResource ) )
            // InternalWorkflow.g:1422:2: ( ruleResource )
            {
            // InternalWorkflow.g:1422:2: ( ruleResource )
            // InternalWorkflow.g:1423:3: ruleResource
            {
             before(grammarAccess.getResourcesAccess().getResourcesResourceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getResourcesResourceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__ResourcesAssignment_2"


    // $ANTLR start "rule__Resource__NameAssignment_0"
    // InternalWorkflow.g:1432:1: rule__Resource__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__Resource__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1436:1: ( ( ruleQualifiedName ) )
            // InternalWorkflow.g:1437:2: ( ruleQualifiedName )
            {
            // InternalWorkflow.g:1437:2: ( ruleQualifiedName )
            // InternalWorkflow.g:1438:3: ruleQualifiedName
            {
             before(grammarAccess.getResourceAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getNameQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_0"


    // $ANTLR start "rule__Resource__PropertiesAssignment_2"
    // InternalWorkflow.g:1447:1: rule__Resource__PropertiesAssignment_2 : ( ruleProperty ) ;
    public final void rule__Resource__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1451:1: ( ( ruleProperty ) )
            // InternalWorkflow.g:1452:2: ( ruleProperty )
            {
            // InternalWorkflow.g:1452:2: ( ruleProperty )
            // InternalWorkflow.g:1453:3: ruleProperty
            {
             before(grammarAccess.getResourceAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getPropertiesPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__PropertiesAssignment_2"


    // $ANTLR start "rule__PropertyCartridge__CartridgeAssignment_0"
    // InternalWorkflow.g:1462:1: rule__PropertyCartridge__CartridgeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PropertyCartridge__CartridgeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1466:1: ( ( ( ruleQualifiedName ) ) )
            // InternalWorkflow.g:1467:2: ( ( ruleQualifiedName ) )
            {
            // InternalWorkflow.g:1467:2: ( ( ruleQualifiedName ) )
            // InternalWorkflow.g:1468:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPropertyCartridgeAccess().getCartridgeCartridgeCrossReference_0_0()); 
            // InternalWorkflow.g:1469:3: ( ruleQualifiedName )
            // InternalWorkflow.g:1470:4: ruleQualifiedName
            {
             before(grammarAccess.getPropertyCartridgeAccess().getCartridgeCartridgeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyCartridgeAccess().getCartridgeCartridgeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPropertyCartridgeAccess().getCartridgeCartridgeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__CartridgeAssignment_0"


    // $ANTLR start "rule__PropertyCartridge__PropertiesAssignment_2"
    // InternalWorkflow.g:1481:1: rule__PropertyCartridge__PropertiesAssignment_2 : ( ruleProperty ) ;
    public final void rule__PropertyCartridge__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1485:1: ( ( ruleProperty ) )
            // InternalWorkflow.g:1486:2: ( ruleProperty )
            {
            // InternalWorkflow.g:1486:2: ( ruleProperty )
            // InternalWorkflow.g:1487:3: ruleProperty
            {
             before(grammarAccess.getPropertyCartridgeAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyCartridgeAccess().getPropertiesPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCartridge__PropertiesAssignment_2"


    // $ANTLR start "rule__Property__NameAssignment_0"
    // InternalWorkflow.g:1496:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1500:1: ( ( RULE_ID ) )
            // InternalWorkflow.g:1501:2: ( RULE_ID )
            {
            // InternalWorkflow.g:1501:2: ( RULE_ID )
            // InternalWorkflow.g:1502:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Cartridge__CartridgeAssignment_0"
    // InternalWorkflow.g:1511:1: rule__Cartridge__CartridgeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Cartridge__CartridgeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1515:1: ( ( ( ruleQualifiedName ) ) )
            // InternalWorkflow.g:1516:2: ( ( ruleQualifiedName ) )
            {
            // InternalWorkflow.g:1516:2: ( ( ruleQualifiedName ) )
            // InternalWorkflow.g:1517:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCartridgeAccess().getCartridgeCartridgeWFLCrossReference_0_0()); 
            // InternalWorkflow.g:1518:3: ( ruleQualifiedName )
            // InternalWorkflow.g:1519:4: ruleQualifiedName
            {
             before(grammarAccess.getCartridgeAccess().getCartridgeCartridgeWFLQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCartridgeAccess().getCartridgeCartridgeWFLQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCartridgeAccess().getCartridgeCartridgeWFLCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridge__CartridgeAssignment_0"


    // $ANTLR start "rule__Cartridge__ActivatedAssignment_2"
    // InternalWorkflow.g:1530:1: rule__Cartridge__ActivatedAssignment_2 : ( ruleActivated ) ;
    public final void rule__Cartridge__ActivatedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflow.g:1534:1: ( ( ruleActivated ) )
            // InternalWorkflow.g:1535:2: ( ruleActivated )
            {
            // InternalWorkflow.g:1535:2: ( ruleActivated )
            // InternalWorkflow.g:1536:3: ruleActivated
            {
             before(grammarAccess.getCartridgeAccess().getActivatedActivatedEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActivated();

            state._fsp--;

             after(grammarAccess.getCartridgeAccess().getActivatedActivatedEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartridge__ActivatedAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020002L});

}