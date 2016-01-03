package com.netfective.editor.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.netfective.editor.dsl.services.WorkflowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWorkflowParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cartridges'", "'{'", "'}'", "'Properties'", "'Resources'", "'='", "'true'", "'false'", "':'", "'.'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
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

        public InternalWorkflowParser(TokenStream input, WorkflowGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected WorkflowGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalWorkflow.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalWorkflow.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalWorkflow.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalWorkflow.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_WFBsp_0_0= ruleCartridges ) ) ( (lv_WFProperty_1_0= ruleProperties ) ) ( (lv_WFResource_2_0= ruleResources ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_WFBsp_0_0 = null;

        EObject lv_WFProperty_1_0 = null;

        EObject lv_WFResource_2_0 = null;



        	enterRule();

        try {
            // InternalWorkflow.g:78:2: ( ( ( (lv_WFBsp_0_0= ruleCartridges ) ) ( (lv_WFProperty_1_0= ruleProperties ) ) ( (lv_WFResource_2_0= ruleResources ) ) ) )
            // InternalWorkflow.g:79:2: ( ( (lv_WFBsp_0_0= ruleCartridges ) ) ( (lv_WFProperty_1_0= ruleProperties ) ) ( (lv_WFResource_2_0= ruleResources ) ) )
            {
            // InternalWorkflow.g:79:2: ( ( (lv_WFBsp_0_0= ruleCartridges ) ) ( (lv_WFProperty_1_0= ruleProperties ) ) ( (lv_WFResource_2_0= ruleResources ) ) )
            // InternalWorkflow.g:80:3: ( (lv_WFBsp_0_0= ruleCartridges ) ) ( (lv_WFProperty_1_0= ruleProperties ) ) ( (lv_WFResource_2_0= ruleResources ) )
            {
            // InternalWorkflow.g:80:3: ( (lv_WFBsp_0_0= ruleCartridges ) )
            // InternalWorkflow.g:81:4: (lv_WFBsp_0_0= ruleCartridges )
            {
            // InternalWorkflow.g:81:4: (lv_WFBsp_0_0= ruleCartridges )
            // InternalWorkflow.g:82:5: lv_WFBsp_0_0= ruleCartridges
            {

            					newCompositeNode(grammarAccess.getModelAccess().getWFBspCartridgesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_WFBsp_0_0=ruleCartridges();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"WFBsp",
            						lv_WFBsp_0_0,
            						"com.netfective.editor.dsl.Workflow.Cartridges");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWorkflow.g:99:3: ( (lv_WFProperty_1_0= ruleProperties ) )
            // InternalWorkflow.g:100:4: (lv_WFProperty_1_0= ruleProperties )
            {
            // InternalWorkflow.g:100:4: (lv_WFProperty_1_0= ruleProperties )
            // InternalWorkflow.g:101:5: lv_WFProperty_1_0= ruleProperties
            {

            					newCompositeNode(grammarAccess.getModelAccess().getWFPropertyPropertiesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_WFProperty_1_0=ruleProperties();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"WFProperty",
            						lv_WFProperty_1_0,
            						"com.netfective.editor.dsl.Workflow.Properties");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWorkflow.g:118:3: ( (lv_WFResource_2_0= ruleResources ) )
            // InternalWorkflow.g:119:4: (lv_WFResource_2_0= ruleResources )
            {
            // InternalWorkflow.g:119:4: (lv_WFResource_2_0= ruleResources )
            // InternalWorkflow.g:120:5: lv_WFResource_2_0= ruleResources
            {

            					newCompositeNode(grammarAccess.getModelAccess().getWFResourceResourcesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_WFResource_2_0=ruleResources();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"WFResource",
            						lv_WFResource_2_0,
            						"com.netfective.editor.dsl.Workflow.Resources");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCartridges"
    // InternalWorkflow.g:141:1: entryRuleCartridges returns [EObject current=null] : iv_ruleCartridges= ruleCartridges EOF ;
    public final EObject entryRuleCartridges() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCartridges = null;


        try {
            // InternalWorkflow.g:141:51: (iv_ruleCartridges= ruleCartridges EOF )
            // InternalWorkflow.g:142:2: iv_ruleCartridges= ruleCartridges EOF
            {
             newCompositeNode(grammarAccess.getCartridgesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCartridges=ruleCartridges();

            state._fsp--;

             current =iv_ruleCartridges; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCartridges"


    // $ANTLR start "ruleCartridges"
    // InternalWorkflow.g:148:1: ruleCartridges returns [EObject current=null] : ( ( (lv_name_0_0= 'Cartridges' ) ) otherlv_1= '{' ( (lv_cartdriges_2_0= ruleCartridge ) )* otherlv_3= '}' ) ;
    public final EObject ruleCartridges() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cartdriges_2_0 = null;



        	enterRule();

        try {
            // InternalWorkflow.g:154:2: ( ( ( (lv_name_0_0= 'Cartridges' ) ) otherlv_1= '{' ( (lv_cartdriges_2_0= ruleCartridge ) )* otherlv_3= '}' ) )
            // InternalWorkflow.g:155:2: ( ( (lv_name_0_0= 'Cartridges' ) ) otherlv_1= '{' ( (lv_cartdriges_2_0= ruleCartridge ) )* otherlv_3= '}' )
            {
            // InternalWorkflow.g:155:2: ( ( (lv_name_0_0= 'Cartridges' ) ) otherlv_1= '{' ( (lv_cartdriges_2_0= ruleCartridge ) )* otherlv_3= '}' )
            // InternalWorkflow.g:156:3: ( (lv_name_0_0= 'Cartridges' ) ) otherlv_1= '{' ( (lv_cartdriges_2_0= ruleCartridge ) )* otherlv_3= '}'
            {
            // InternalWorkflow.g:156:3: ( (lv_name_0_0= 'Cartridges' ) )
            // InternalWorkflow.g:157:4: (lv_name_0_0= 'Cartridges' )
            {
            // InternalWorkflow.g:157:4: (lv_name_0_0= 'Cartridges' )
            // InternalWorkflow.g:158:5: lv_name_0_0= 'Cartridges'
            {
            lv_name_0_0=(Token)match(input,11,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCartridgesAccess().getNameCartridgesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCartridgesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Cartridges");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCartridgesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWorkflow.g:174:3: ( (lv_cartdriges_2_0= ruleCartridge ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWorkflow.g:175:4: (lv_cartdriges_2_0= ruleCartridge )
            	    {
            	    // InternalWorkflow.g:175:4: (lv_cartdriges_2_0= ruleCartridge )
            	    // InternalWorkflow.g:176:5: lv_cartdriges_2_0= ruleCartridge
            	    {

            	    					newCompositeNode(grammarAccess.getCartridgesAccess().getCartdrigesCartridgeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_cartdriges_2_0=ruleCartridge();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCartridgesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cartdriges",
            	    						lv_cartdriges_2_0,
            	    						"com.netfective.editor.dsl.Workflow.Cartridge");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCartridgesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCartridges"


    // $ANTLR start "entryRuleProperties"
    // InternalWorkflow.g:201:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // InternalWorkflow.g:201:51: (iv_ruleProperties= ruleProperties EOF )
            // InternalWorkflow.g:202:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalWorkflow.g:208:1: ruleProperties returns [EObject current=null] : ( ( (lv_name_0_0= 'Properties' ) ) otherlv_1= '{' ( (lv_properties_2_0= rulePropertyCartridge ) )* otherlv_3= '}' ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalWorkflow.g:214:2: ( ( ( (lv_name_0_0= 'Properties' ) ) otherlv_1= '{' ( (lv_properties_2_0= rulePropertyCartridge ) )* otherlv_3= '}' ) )
            // InternalWorkflow.g:215:2: ( ( (lv_name_0_0= 'Properties' ) ) otherlv_1= '{' ( (lv_properties_2_0= rulePropertyCartridge ) )* otherlv_3= '}' )
            {
            // InternalWorkflow.g:215:2: ( ( (lv_name_0_0= 'Properties' ) ) otherlv_1= '{' ( (lv_properties_2_0= rulePropertyCartridge ) )* otherlv_3= '}' )
            // InternalWorkflow.g:216:3: ( (lv_name_0_0= 'Properties' ) ) otherlv_1= '{' ( (lv_properties_2_0= rulePropertyCartridge ) )* otherlv_3= '}'
            {
            // InternalWorkflow.g:216:3: ( (lv_name_0_0= 'Properties' ) )
            // InternalWorkflow.g:217:4: (lv_name_0_0= 'Properties' )
            {
            // InternalWorkflow.g:217:4: (lv_name_0_0= 'Properties' )
            // InternalWorkflow.g:218:5: lv_name_0_0= 'Properties'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertiesAccess().getNamePropertiesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertiesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Properties");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWorkflow.g:234:3: ( (lv_properties_2_0= rulePropertyCartridge ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWorkflow.g:235:4: (lv_properties_2_0= rulePropertyCartridge )
            	    {
            	    // InternalWorkflow.g:235:4: (lv_properties_2_0= rulePropertyCartridge )
            	    // InternalWorkflow.g:236:5: lv_properties_2_0= rulePropertyCartridge
            	    {

            	    					newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesPropertyCartridgeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_properties_2_0=rulePropertyCartridge();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_2_0,
            	    						"com.netfective.editor.dsl.Workflow.PropertyCartridge");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleResources"
    // InternalWorkflow.g:261:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalWorkflow.g:261:50: (iv_ruleResources= ruleResources EOF )
            // InternalWorkflow.g:262:2: iv_ruleResources= ruleResources EOF
            {
             newCompositeNode(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResources=ruleResources();

            state._fsp--;

             current =iv_ruleResources; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalWorkflow.g:268:1: ruleResources returns [EObject current=null] : ( ( (lv_name_0_0= 'Resources' ) ) otherlv_1= '{' ( (lv_resources_2_0= ruleResource ) )+ otherlv_3= '}' ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_resources_2_0 = null;



        	enterRule();

        try {
            // InternalWorkflow.g:274:2: ( ( ( (lv_name_0_0= 'Resources' ) ) otherlv_1= '{' ( (lv_resources_2_0= ruleResource ) )+ otherlv_3= '}' ) )
            // InternalWorkflow.g:275:2: ( ( (lv_name_0_0= 'Resources' ) ) otherlv_1= '{' ( (lv_resources_2_0= ruleResource ) )+ otherlv_3= '}' )
            {
            // InternalWorkflow.g:275:2: ( ( (lv_name_0_0= 'Resources' ) ) otherlv_1= '{' ( (lv_resources_2_0= ruleResource ) )+ otherlv_3= '}' )
            // InternalWorkflow.g:276:3: ( (lv_name_0_0= 'Resources' ) ) otherlv_1= '{' ( (lv_resources_2_0= ruleResource ) )+ otherlv_3= '}'
            {
            // InternalWorkflow.g:276:3: ( (lv_name_0_0= 'Resources' ) )
            // InternalWorkflow.g:277:4: (lv_name_0_0= 'Resources' )
            {
            // InternalWorkflow.g:277:4: (lv_name_0_0= 'Resources' )
            // InternalWorkflow.g:278:5: lv_name_0_0= 'Resources'
            {
            lv_name_0_0=(Token)match(input,15,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getResourcesAccess().getNameResourcesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourcesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Resources");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWorkflow.g:294:3: ( (lv_resources_2_0= ruleResource ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWorkflow.g:295:4: (lv_resources_2_0= ruleResource )
            	    {
            	    // InternalWorkflow.g:295:4: (lv_resources_2_0= ruleResource )
            	    // InternalWorkflow.g:296:5: lv_resources_2_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getResourcesAccess().getResourcesResourceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_resources_2_0=ruleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResourcesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_2_0,
            	    						"com.netfective.editor.dsl.Workflow.Resource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleResource"
    // InternalWorkflow.g:321:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalWorkflow.g:321:49: (iv_ruleResource= ruleResource EOF )
            // InternalWorkflow.g:322:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalWorkflow.g:328:1: ruleResource returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) ) otherlv_3= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalWorkflow.g:334:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) ) otherlv_3= '}' ) )
            // InternalWorkflow.g:335:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) ) otherlv_3= '}' )
            {
            // InternalWorkflow.g:335:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) ) otherlv_3= '}' )
            // InternalWorkflow.g:336:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) ) otherlv_3= '}'
            {
            // InternalWorkflow.g:336:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalWorkflow.g:337:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalWorkflow.g:337:4: (lv_name_0_0= ruleQualifiedName )
            // InternalWorkflow.g:338:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"com.netfective.editor.dsl.Workflow.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWorkflow.g:359:3: ( (lv_properties_2_0= ruleProperty ) )
            // InternalWorkflow.g:360:4: (lv_properties_2_0= ruleProperty )
            {
            // InternalWorkflow.g:360:4: (lv_properties_2_0= ruleProperty )
            // InternalWorkflow.g:361:5: lv_properties_2_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getPropertiesPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_properties_2_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					add(
            						current,
            						"properties",
            						lv_properties_2_0,
            						"com.netfective.editor.dsl.Workflow.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRulePropertyCartridge"
    // InternalWorkflow.g:386:1: entryRulePropertyCartridge returns [EObject current=null] : iv_rulePropertyCartridge= rulePropertyCartridge EOF ;
    public final EObject entryRulePropertyCartridge() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCartridge = null;


        try {
            // InternalWorkflow.g:386:58: (iv_rulePropertyCartridge= rulePropertyCartridge EOF )
            // InternalWorkflow.g:387:2: iv_rulePropertyCartridge= rulePropertyCartridge EOF
            {
             newCompositeNode(grammarAccess.getPropertyCartridgeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyCartridge=rulePropertyCartridge();

            state._fsp--;

             current =iv_rulePropertyCartridge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyCartridge"


    // $ANTLR start "rulePropertyCartridge"
    // InternalWorkflow.g:393:1: rulePropertyCartridge returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}' ) ;
    public final EObject rulePropertyCartridge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalWorkflow.g:399:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}' ) )
            // InternalWorkflow.g:400:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}' )
            {
            // InternalWorkflow.g:400:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}' )
            // InternalWorkflow.g:401:3: ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* otherlv_3= '}'
            {
            // InternalWorkflow.g:401:3: ( ( ruleQualifiedName ) )
            // InternalWorkflow.g:402:4: ( ruleQualifiedName )
            {
            // InternalWorkflow.g:402:4: ( ruleQualifiedName )
            // InternalWorkflow.g:403:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyCartridgeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyCartridgeAccess().getCartridgeCartridgeCrossReference_0_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyCartridgeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWorkflow.g:421:3: ( (lv_properties_2_0= ruleProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWorkflow.g:422:4: (lv_properties_2_0= ruleProperty )
            	    {
            	    // InternalWorkflow.g:422:4: (lv_properties_2_0= ruleProperty )
            	    // InternalWorkflow.g:423:5: lv_properties_2_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyCartridgeAccess().getPropertiesPropertyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_properties_2_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyCartridgeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_2_0,
            	    						"com.netfective.editor.dsl.Workflow.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyCartridgeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyCartridge"


    // $ANTLR start "entryRuleProperty"
    // InternalWorkflow.g:448:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalWorkflow.g:448:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalWorkflow.g:449:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalWorkflow.g:455:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | ruleBOOLEAN ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_STRING_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalWorkflow.g:461:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | ruleBOOLEAN ) ) )
            // InternalWorkflow.g:462:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | ruleBOOLEAN ) )
            {
            // InternalWorkflow.g:462:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | ruleBOOLEAN ) )
            // InternalWorkflow.g:463:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' (this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | ruleBOOLEAN )
            {
            // InternalWorkflow.g:463:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalWorkflow.g:464:4: (lv_name_0_0= RULE_ID )
            {
            // InternalWorkflow.g:464:4: (lv_name_0_0= RULE_ID )
            // InternalWorkflow.g:465:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalWorkflow.g:485:3: (this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | ruleBOOLEAN )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case 17:
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWorkflow.g:486:4: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_2, grammarAccess.getPropertyAccess().getSTRINGTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalWorkflow.g:491:4: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_3, grammarAccess.getPropertyAccess().getINTTerminalRuleCall_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalWorkflow.g:496:4: ruleBOOLEAN
                    {

                    				newCompositeNode(grammarAccess.getPropertyAccess().getBOOLEANParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBOOLEAN();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalWorkflow.g:508:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalWorkflow.g:508:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalWorkflow.g:509:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalWorkflow.g:515:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWorkflow.g:521:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalWorkflow.g:522:2: (kw= 'true' | kw= 'false' )
            {
            // InternalWorkflow.g:522:2: (kw= 'true' | kw= 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalWorkflow.g:523:3: kw= 'true'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWorkflow.g:529:3: kw= 'false'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleCartridge"
    // InternalWorkflow.g:538:1: entryRuleCartridge returns [EObject current=null] : iv_ruleCartridge= ruleCartridge EOF ;
    public final EObject entryRuleCartridge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCartridge = null;


        try {
            // InternalWorkflow.g:538:50: (iv_ruleCartridge= ruleCartridge EOF )
            // InternalWorkflow.g:539:2: iv_ruleCartridge= ruleCartridge EOF
            {
             newCompositeNode(grammarAccess.getCartridgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCartridge=ruleCartridge();

            state._fsp--;

             current =iv_ruleCartridge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCartridge"


    // $ANTLR start "ruleCartridge"
    // InternalWorkflow.g:545:1: ruleCartridge returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_activated_2_0= ruleActivated ) ) ) ;
    public final EObject ruleCartridge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_activated_2_0 = null;



        	enterRule();

        try {
            // InternalWorkflow.g:551:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_activated_2_0= ruleActivated ) ) ) )
            // InternalWorkflow.g:552:2: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_activated_2_0= ruleActivated ) ) )
            {
            // InternalWorkflow.g:552:2: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_activated_2_0= ruleActivated ) ) )
            // InternalWorkflow.g:553:3: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_activated_2_0= ruleActivated ) )
            {
            // InternalWorkflow.g:553:3: ( ( ruleQualifiedName ) )
            // InternalWorkflow.g:554:4: ( ruleQualifiedName )
            {
            // InternalWorkflow.g:554:4: ( ruleQualifiedName )
            // InternalWorkflow.g:555:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCartridgeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCartridgeAccess().getCartridgeCartridgeWFLCrossReference_0_0());
            				
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCartridgeAccess().getColonKeyword_1());
            		
            // InternalWorkflow.g:573:3: ( (lv_activated_2_0= ruleActivated ) )
            // InternalWorkflow.g:574:4: (lv_activated_2_0= ruleActivated )
            {
            // InternalWorkflow.g:574:4: (lv_activated_2_0= ruleActivated )
            // InternalWorkflow.g:575:5: lv_activated_2_0= ruleActivated
            {

            					newCompositeNode(grammarAccess.getCartridgeAccess().getActivatedActivatedEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_activated_2_0=ruleActivated();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCartridgeRule());
            					}
            					set(
            						current,
            						"activated",
            						lv_activated_2_0,
            						"com.netfective.editor.dsl.Workflow.Activated");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCartridge"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalWorkflow.g:596:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalWorkflow.g:596:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalWorkflow.g:597:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalWorkflow.g:603:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalWorkflow.g:609:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalWorkflow.g:610:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalWorkflow.g:610:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalWorkflow.g:611:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalWorkflow.g:618:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWorkflow.g:619:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleActivated"
    // InternalWorkflow.g:636:1: ruleActivated returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleActivated() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalWorkflow.g:642:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalWorkflow.g:643:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalWorkflow.g:643:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalWorkflow.g:644:3: (enumLiteral_0= 'true' )
                    {
                    // InternalWorkflow.g:644:3: (enumLiteral_0= 'true' )
                    // InternalWorkflow.g:645:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getActivatedAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivatedAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflow.g:652:3: (enumLiteral_1= 'false' )
                    {
                    // InternalWorkflow.g:652:3: (enumLiteral_1= 'false' )
                    // InternalWorkflow.g:653:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getActivatedAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivatedAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivated"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});

}