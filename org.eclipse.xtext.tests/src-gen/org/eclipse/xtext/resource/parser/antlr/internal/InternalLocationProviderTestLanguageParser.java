package org.eclipse.xtext.resource.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.resource.services.LocationProviderTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalLocationProviderTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'element'", "'singleref'", "'multiref'", "'modes'", "'end'", "';'", "'bus'", "'processor'", "'mode'", "':'", "'->'", "'port'", "'data'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLocationProviderTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLocationProviderTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLocationProviderTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLocationProviderTestLanguage.g"; }



     	private LocationProviderTestLanguageGrammarAccess grammarAccess;

        public InternalLocationProviderTestLanguageParser(TokenStream input, LocationProviderTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected LocationProviderTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalLocationProviderTestLanguage.g:69:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLocationProviderTestLanguage.g:69:46: (iv_ruleModel= ruleModel EOF )
            // InternalLocationProviderTestLanguage.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLocationProviderTestLanguage.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleElement ) )* ( (lv_components_1_0= ruleComponent ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_components_1_0 = null;



        	enterRule();

        try {
            // InternalLocationProviderTestLanguage.g:82:2: ( ( ( (lv_elements_0_0= ruleElement ) )* ( (lv_components_1_0= ruleComponent ) )* ) )
            // InternalLocationProviderTestLanguage.g:83:2: ( ( (lv_elements_0_0= ruleElement ) )* ( (lv_components_1_0= ruleComponent ) )* )
            {
            // InternalLocationProviderTestLanguage.g:83:2: ( ( (lv_elements_0_0= ruleElement ) )* ( (lv_components_1_0= ruleComponent ) )* )
            // InternalLocationProviderTestLanguage.g:84:3: ( (lv_elements_0_0= ruleElement ) )* ( (lv_components_1_0= ruleComponent ) )*
            {
            // InternalLocationProviderTestLanguage.g:84:3: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLocationProviderTestLanguage.g:85:4: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalLocationProviderTestLanguage.g:85:4: (lv_elements_0_0= ruleElement )
            	    // InternalLocationProviderTestLanguage.g:86:5: lv_elements_0_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"org.eclipse.xtext.resource.LocationProviderTestLanguage.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLocationProviderTestLanguage.g:103:3: ( (lv_components_1_0= ruleComponent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLocationProviderTestLanguage.g:104:4: (lv_components_1_0= ruleComponent )
            	    {
            	    // InternalLocationProviderTestLanguage.g:104:4: (lv_components_1_0= ruleComponent )
            	    // InternalLocationProviderTestLanguage.g:105:5: lv_components_1_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_1_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_components_1_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_1_0,
            	    						"org.eclipse.xtext.resource.LocationProviderTestLanguage.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalLocationProviderTestLanguage.g:126:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalLocationProviderTestLanguage.g:126:48: (iv_ruleElement= ruleElement EOF )
            // InternalLocationProviderTestLanguage.g:127:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalLocationProviderTestLanguage.g:133:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'singleref' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'multiref' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLocationProviderTestLanguage.g:139:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'singleref' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'multiref' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalLocationProviderTestLanguage.g:140:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'singleref' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'multiref' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalLocationProviderTestLanguage.g:140:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'singleref' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'multiref' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalLocationProviderTestLanguage.g:141:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'singleref' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'multiref' ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalLocationProviderTestLanguage.g:145:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLocationProviderTestLanguage.g:146:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLocationProviderTestLanguage.g:146:4: (lv_name_1_0= RULE_ID )
            // InternalLocationProviderTestLanguage.g:147:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLocationProviderTestLanguage.g:163:3: (otherlv_2= 'singleref' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLocationProviderTestLanguage.g:164:4: otherlv_2= 'singleref' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getSinglerefKeyword_2_0());
                    			
                    // InternalLocationProviderTestLanguage.g:168:4: ( (otherlv_3= RULE_ID ) )
                    // InternalLocationProviderTestLanguage.g:169:5: (otherlv_3= RULE_ID )
                    {
                    // InternalLocationProviderTestLanguage.g:169:5: (otherlv_3= RULE_ID )
                    // InternalLocationProviderTestLanguage.g:170:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

                    						newLeafNode(otherlv_3, grammarAccess.getElementAccess().getSinglerefElementCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLocationProviderTestLanguage.g:182:3: (otherlv_4= 'multiref' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLocationProviderTestLanguage.g:183:4: otherlv_4= 'multiref' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getElementAccess().getMultirefKeyword_3_0());
            	    			
            	    // InternalLocationProviderTestLanguage.g:187:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalLocationProviderTestLanguage.g:188:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalLocationProviderTestLanguage.g:188:5: (otherlv_5= RULE_ID )
            	    // InternalLocationProviderTestLanguage.g:189:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getElementRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            	    						newLeafNode(otherlv_5, grammarAccess.getElementAccess().getMultirefsElementCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleComponent"
    // InternalLocationProviderTestLanguage.g:205:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalLocationProviderTestLanguage.g:205:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalLocationProviderTestLanguage.g:206:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalLocationProviderTestLanguage.g:212:1: ruleComponent returns [EObject current=null] : ( (this_Bus_0= ruleBus | this_Processor_1= ruleProcessor ) (otherlv_2= 'modes' ( ( (lv_mode_3_0= ruleMode ) ) | ( (lv_transition_4_0= ruleTransition ) ) )+ )? otherlv_5= 'end' otherlv_6= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject this_Bus_0 = null;

        EObject this_Processor_1 = null;

        EObject lv_mode_3_0 = null;

        EObject lv_transition_4_0 = null;



        	enterRule();

        try {
            // InternalLocationProviderTestLanguage.g:218:2: ( ( (this_Bus_0= ruleBus | this_Processor_1= ruleProcessor ) (otherlv_2= 'modes' ( ( (lv_mode_3_0= ruleMode ) ) | ( (lv_transition_4_0= ruleTransition ) ) )+ )? otherlv_5= 'end' otherlv_6= ';' ) )
            // InternalLocationProviderTestLanguage.g:219:2: ( (this_Bus_0= ruleBus | this_Processor_1= ruleProcessor ) (otherlv_2= 'modes' ( ( (lv_mode_3_0= ruleMode ) ) | ( (lv_transition_4_0= ruleTransition ) ) )+ )? otherlv_5= 'end' otherlv_6= ';' )
            {
            // InternalLocationProviderTestLanguage.g:219:2: ( (this_Bus_0= ruleBus | this_Processor_1= ruleProcessor ) (otherlv_2= 'modes' ( ( (lv_mode_3_0= ruleMode ) ) | ( (lv_transition_4_0= ruleTransition ) ) )+ )? otherlv_5= 'end' otherlv_6= ';' )
            // InternalLocationProviderTestLanguage.g:220:3: (this_Bus_0= ruleBus | this_Processor_1= ruleProcessor ) (otherlv_2= 'modes' ( ( (lv_mode_3_0= ruleMode ) ) | ( (lv_transition_4_0= ruleTransition ) ) )+ )? otherlv_5= 'end' otherlv_6= ';'
            {
            // InternalLocationProviderTestLanguage.g:220:3: (this_Bus_0= ruleBus | this_Processor_1= ruleProcessor )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLocationProviderTestLanguage.g:221:4: this_Bus_0= ruleBus
                    {

                    				newCompositeNode(grammarAccess.getComponentAccess().getBusParserRuleCall_0_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_8);
                    this_Bus_0=ruleBus();

                    state._fsp--;


                    				current = this_Bus_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalLocationProviderTestLanguage.g:230:4: this_Processor_1= ruleProcessor
                    {

                    				newCompositeNode(grammarAccess.getComponentAccess().getProcessorParserRuleCall_0_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_8);
                    this_Processor_1=ruleProcessor();

                    state._fsp--;


                    				current = this_Processor_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalLocationProviderTestLanguage.g:239:3: (otherlv_2= 'modes' ( ( (lv_mode_3_0= ruleMode ) ) | ( (lv_transition_4_0= ruleTransition ) ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLocationProviderTestLanguage.g:240:4: otherlv_2= 'modes' ( ( (lv_mode_3_0= ruleMode ) ) | ( (lv_transition_4_0= ruleTransition ) ) )+
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getModesKeyword_1_0());
                    			
                    // InternalLocationProviderTestLanguage.g:244:4: ( ( (lv_mode_3_0= ruleMode ) ) | ( (lv_transition_4_0= ruleTransition ) ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }
                        else if ( (LA6_0==RULE_ID) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalLocationProviderTestLanguage.g:245:5: ( (lv_mode_3_0= ruleMode ) )
                    	    {
                    	    // InternalLocationProviderTestLanguage.g:245:5: ( (lv_mode_3_0= ruleMode ) )
                    	    // InternalLocationProviderTestLanguage.g:246:6: (lv_mode_3_0= ruleMode )
                    	    {
                    	    // InternalLocationProviderTestLanguage.g:246:6: (lv_mode_3_0= ruleMode )
                    	    // InternalLocationProviderTestLanguage.g:247:7: lv_mode_3_0= ruleMode
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getModeModeParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_10);
                    	    lv_mode_3_0=ruleMode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mode",
                    	    								lv_mode_3_0,
                    	    								"org.eclipse.xtext.resource.LocationProviderTestLanguage.Mode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLocationProviderTestLanguage.g:265:5: ( (lv_transition_4_0= ruleTransition ) )
                    	    {
                    	    // InternalLocationProviderTestLanguage.g:265:5: ( (lv_transition_4_0= ruleTransition ) )
                    	    // InternalLocationProviderTestLanguage.g:266:6: (lv_transition_4_0= ruleTransition )
                    	    {
                    	    // InternalLocationProviderTestLanguage.g:266:6: (lv_transition_4_0= ruleTransition )
                    	    // InternalLocationProviderTestLanguage.g:267:7: lv_transition_4_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getTransitionTransitionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_10);
                    	    lv_transition_4_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transition",
                    	    								lv_transition_4_0,
                    	    								"org.eclipse.xtext.resource.LocationProviderTestLanguage.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getEndKeyword_2());
            		
            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleBus"
    // InternalLocationProviderTestLanguage.g:298:1: entryRuleBus returns [EObject current=null] : iv_ruleBus= ruleBus EOF ;
    public final EObject entryRuleBus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBus = null;


        try {
            // InternalLocationProviderTestLanguage.g:298:44: (iv_ruleBus= ruleBus EOF )
            // InternalLocationProviderTestLanguage.g:299:2: iv_ruleBus= ruleBus EOF
            {
             newCompositeNode(grammarAccess.getBusRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBus=ruleBus();

            state._fsp--;

             current =iv_ruleBus; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBus"


    // $ANTLR start "ruleBus"
    // InternalLocationProviderTestLanguage.g:305:1: ruleBus returns [EObject current=null] : (otherlv_0= 'bus' ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )* ) ;
    public final EObject ruleBus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_port_2_0 = null;



        	enterRule();

        try {
            // InternalLocationProviderTestLanguage.g:311:2: ( (otherlv_0= 'bus' ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )* ) )
            // InternalLocationProviderTestLanguage.g:312:2: (otherlv_0= 'bus' ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )* )
            {
            // InternalLocationProviderTestLanguage.g:312:2: (otherlv_0= 'bus' ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )* )
            // InternalLocationProviderTestLanguage.g:313:3: otherlv_0= 'bus' ( (lv_name_1_0= RULE_ID ) ) ( (lv_port_2_0= rulePort ) )*
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBusAccess().getBusKeyword_0());
            		
            // InternalLocationProviderTestLanguage.g:317:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLocationProviderTestLanguage.g:318:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLocationProviderTestLanguage.g:318:4: (lv_name_1_0= RULE_ID )
            // InternalLocationProviderTestLanguage.g:319:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBusAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLocationProviderTestLanguage.g:335:3: ( (lv_port_2_0= rulePort ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLocationProviderTestLanguage.g:336:4: (lv_port_2_0= rulePort )
            	    {
            	    // InternalLocationProviderTestLanguage.g:336:4: (lv_port_2_0= rulePort )
            	    // InternalLocationProviderTestLanguage.g:337:5: lv_port_2_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getBusAccess().getPortPortParserRuleCall_2_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_port_2_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBusRule());
            	    					}
            	    					add(
            	    						current,
            	    						"port",
            	    						lv_port_2_0,
            	    						"org.eclipse.xtext.resource.LocationProviderTestLanguage.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleBus"


    // $ANTLR start "entryRuleProcessor"
    // InternalLocationProviderTestLanguage.g:358:1: entryRuleProcessor returns [EObject current=null] : iv_ruleProcessor= ruleProcessor EOF ;
    public final EObject entryRuleProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessor = null;


        try {
            // InternalLocationProviderTestLanguage.g:358:50: (iv_ruleProcessor= ruleProcessor EOF )
            // InternalLocationProviderTestLanguage.g:359:2: iv_ruleProcessor= ruleProcessor EOF
            {
             newCompositeNode(grammarAccess.getProcessorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProcessor=ruleProcessor();

            state._fsp--;

             current =iv_ruleProcessor; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessor"


    // $ANTLR start "ruleProcessor"
    // InternalLocationProviderTestLanguage.g:365:1: ruleProcessor returns [EObject current=null] : (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )* ) ;
    public final EObject ruleProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_data_2_0 = null;



        	enterRule();

        try {
            // InternalLocationProviderTestLanguage.g:371:2: ( (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )* ) )
            // InternalLocationProviderTestLanguage.g:372:2: (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )* )
            {
            // InternalLocationProviderTestLanguage.g:372:2: (otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )* )
            // InternalLocationProviderTestLanguage.g:373:3: otherlv_0= 'processor' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )*
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getProcessorKeyword_0());
            		
            // InternalLocationProviderTestLanguage.g:377:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLocationProviderTestLanguage.g:378:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLocationProviderTestLanguage.g:378:4: (lv_name_1_0= RULE_ID )
            // InternalLocationProviderTestLanguage.g:379:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLocationProviderTestLanguage.g:395:3: ( (lv_data_2_0= ruleData ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLocationProviderTestLanguage.g:396:4: (lv_data_2_0= ruleData )
            	    {
            	    // InternalLocationProviderTestLanguage.g:396:4: (lv_data_2_0= ruleData )
            	    // InternalLocationProviderTestLanguage.g:397:5: lv_data_2_0= ruleData
            	    {

            	    					newCompositeNode(grammarAccess.getProcessorAccess().getDataDataParserRuleCall_2_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_data_2_0=ruleData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_2_0,
            	    						"org.eclipse.xtext.resource.LocationProviderTestLanguage.Data");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleProcessor"


    // $ANTLR start "entryRuleMode"
    // InternalLocationProviderTestLanguage.g:418:1: entryRuleMode returns [EObject current=null] : iv_ruleMode= ruleMode EOF ;
    public final EObject entryRuleMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMode = null;


        try {
            // InternalLocationProviderTestLanguage.g:418:45: (iv_ruleMode= ruleMode EOF )
            // InternalLocationProviderTestLanguage.g:419:2: iv_ruleMode= ruleMode EOF
            {
             newCompositeNode(grammarAccess.getModeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMode=ruleMode();

            state._fsp--;

             current =iv_ruleMode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMode"


    // $ANTLR start "ruleMode"
    // InternalLocationProviderTestLanguage.g:425:1: ruleMode returns [EObject current=null] : (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLocationProviderTestLanguage.g:431:2: ( (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalLocationProviderTestLanguage.g:432:2: (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalLocationProviderTestLanguage.g:432:2: (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalLocationProviderTestLanguage.g:433:3: otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModeAccess().getModeKeyword_0());
            		
            // InternalLocationProviderTestLanguage.g:437:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLocationProviderTestLanguage.g:438:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLocationProviderTestLanguage.g:438:4: (lv_name_1_0= RULE_ID )
            // InternalLocationProviderTestLanguage.g:439:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getModeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleMode"


    // $ANTLR start "entryRuleTransition"
    // InternalLocationProviderTestLanguage.g:463:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalLocationProviderTestLanguage.g:463:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalLocationProviderTestLanguage.g:464:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalLocationProviderTestLanguage.g:470:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLocationProviderTestLanguage.g:476:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalLocationProviderTestLanguage.g:477:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalLocationProviderTestLanguage.g:477:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalLocationProviderTestLanguage.g:478:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalLocationProviderTestLanguage.g:478:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLocationProviderTestLanguage.g:479:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLocationProviderTestLanguage.g:479:4: (lv_name_0_0= RULE_ID )
            // InternalLocationProviderTestLanguage.g:480:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getColonKeyword_1());
            		
            // InternalLocationProviderTestLanguage.g:500:3: ( (otherlv_2= RULE_ID ) )
            // InternalLocationProviderTestLanguage.g:501:4: (otherlv_2= RULE_ID )
            {
            // InternalLocationProviderTestLanguage.g:501:4: (otherlv_2= RULE_ID )
            // InternalLocationProviderTestLanguage.g:502:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getSourceModeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalLocationProviderTestLanguage.g:517:3: ( (otherlv_4= RULE_ID ) )
            // InternalLocationProviderTestLanguage.g:518:4: (otherlv_4= RULE_ID )
            {
            // InternalLocationProviderTestLanguage.g:518:4: (otherlv_4= RULE_ID )
            // InternalLocationProviderTestLanguage.g:519:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getDestinationModeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRulePort"
    // InternalLocationProviderTestLanguage.g:538:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalLocationProviderTestLanguage.g:538:45: (iv_rulePort= rulePort EOF )
            // InternalLocationProviderTestLanguage.g:539:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalLocationProviderTestLanguage.g:545:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLocationProviderTestLanguage.g:551:2: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalLocationProviderTestLanguage.g:552:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalLocationProviderTestLanguage.g:552:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalLocationProviderTestLanguage.g:553:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            // InternalLocationProviderTestLanguage.g:557:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLocationProviderTestLanguage.g:558:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLocationProviderTestLanguage.g:558:4: (lv_name_1_0= RULE_ID )
            // InternalLocationProviderTestLanguage.g:559:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleData"
    // InternalLocationProviderTestLanguage.g:583:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalLocationProviderTestLanguage.g:583:45: (iv_ruleData= ruleData EOF )
            // InternalLocationProviderTestLanguage.g:584:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalLocationProviderTestLanguage.g:590:1: ruleData returns [EObject current=null] : (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLocationProviderTestLanguage.g:596:2: ( (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalLocationProviderTestLanguage.g:597:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalLocationProviderTestLanguage.g:597:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalLocationProviderTestLanguage.g:598:3: otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDataKeyword_0());
            		
            // InternalLocationProviderTestLanguage.g:602:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLocationProviderTestLanguage.g:603:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLocationProviderTestLanguage.g:603:4: (lv_name_1_0= RULE_ID )
            // InternalLocationProviderTestLanguage.g:604:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDataAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleData"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000060002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000088010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    }


}