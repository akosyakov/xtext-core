package org.eclipse.xtext.parser.antlr.parser.antlr.internal;

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
import org.eclipse.xtext.parser.antlr.services.Bug378967TestLanguageGrammarAccess;



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
public class InternalBug378967TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'2'", "'3'", "'4'", "'after'", "'s'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBug378967TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBug378967TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBug378967TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBug378967TestLanguage.g"; }



     	private Bug378967TestLanguageGrammarAccess grammarAccess;

        public InternalBug378967TestLanguageParser(TokenStream input, Bug378967TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected Bug378967TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalBug378967TestLanguage.g:70:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalBug378967TestLanguage.g:70:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalBug378967TestLanguage.g:71:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalBug378967TestLanguage.g:77:1: ruleRoot returns [EObject current=null] : ( (otherlv_0= '1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '4' ( (lv_element_7_0= ruleRule4 ) ) ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_element_1_0 = null;

        EObject lv_element_3_0 = null;

        EObject lv_element_5_0 = null;

        EObject lv_element_7_0 = null;



        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:83:2: ( ( (otherlv_0= '1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '4' ( (lv_element_7_0= ruleRule4 ) ) ) ) )
            // InternalBug378967TestLanguage.g:84:2: ( (otherlv_0= '1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '4' ( (lv_element_7_0= ruleRule4 ) ) ) )
            {
            // InternalBug378967TestLanguage.g:84:2: ( (otherlv_0= '1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '4' ( (lv_element_7_0= ruleRule4 ) ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBug378967TestLanguage.g:85:3: (otherlv_0= '1' ( (lv_element_1_0= ruleRule1 ) ) )
                    {
                    // InternalBug378967TestLanguage.g:85:3: (otherlv_0= '1' ( (lv_element_1_0= ruleRule1 ) ) )
                    // InternalBug378967TestLanguage.g:86:4: otherlv_0= '1' ( (lv_element_1_0= ruleRule1 ) )
                    {
                    otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getRootAccess().getDigitOneKeyword_0_0());
                    			
                    // InternalBug378967TestLanguage.g:90:4: ( (lv_element_1_0= ruleRule1 ) )
                    // InternalBug378967TestLanguage.g:91:5: (lv_element_1_0= ruleRule1 )
                    {
                    // InternalBug378967TestLanguage.g:91:5: (lv_element_1_0= ruleRule1 )
                    // InternalBug378967TestLanguage.g:92:6: lv_element_1_0= ruleRule1
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule1ParserRuleCall_0_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_1_0=ruleRule1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_1_0,
                    							"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug378967TestLanguage.g:111:3: (otherlv_2= '2' ( (lv_element_3_0= ruleRule2 ) ) )
                    {
                    // InternalBug378967TestLanguage.g:111:3: (otherlv_2= '2' ( (lv_element_3_0= ruleRule2 ) ) )
                    // InternalBug378967TestLanguage.g:112:4: otherlv_2= '2' ( (lv_element_3_0= ruleRule2 ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRootAccess().getDigitTwoKeyword_1_0());
                    			
                    // InternalBug378967TestLanguage.g:116:4: ( (lv_element_3_0= ruleRule2 ) )
                    // InternalBug378967TestLanguage.g:117:5: (lv_element_3_0= ruleRule2 )
                    {
                    // InternalBug378967TestLanguage.g:117:5: (lv_element_3_0= ruleRule2 )
                    // InternalBug378967TestLanguage.g:118:6: lv_element_3_0= ruleRule2
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule2ParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_3_0=ruleRule2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_3_0,
                    							"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug378967TestLanguage.g:137:3: (otherlv_4= '3' ( (lv_element_5_0= ruleRule3 ) ) )
                    {
                    // InternalBug378967TestLanguage.g:137:3: (otherlv_4= '3' ( (lv_element_5_0= ruleRule3 ) ) )
                    // InternalBug378967TestLanguage.g:138:4: otherlv_4= '3' ( (lv_element_5_0= ruleRule3 ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getDigitThreeKeyword_2_0());
                    			
                    // InternalBug378967TestLanguage.g:142:4: ( (lv_element_5_0= ruleRule3 ) )
                    // InternalBug378967TestLanguage.g:143:5: (lv_element_5_0= ruleRule3 )
                    {
                    // InternalBug378967TestLanguage.g:143:5: (lv_element_5_0= ruleRule3 )
                    // InternalBug378967TestLanguage.g:144:6: lv_element_5_0= ruleRule3
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule3ParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_5_0=ruleRule3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_5_0,
                    							"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBug378967TestLanguage.g:163:3: (otherlv_6= '4' ( (lv_element_7_0= ruleRule4 ) ) )
                    {
                    // InternalBug378967TestLanguage.g:163:3: (otherlv_6= '4' ( (lv_element_7_0= ruleRule4 ) ) )
                    // InternalBug378967TestLanguage.g:164:4: otherlv_6= '4' ( (lv_element_7_0= ruleRule4 ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRootAccess().getDigitFourKeyword_3_0());
                    			
                    // InternalBug378967TestLanguage.g:168:4: ( (lv_element_7_0= ruleRule4 ) )
                    // InternalBug378967TestLanguage.g:169:5: (lv_element_7_0= ruleRule4 )
                    {
                    // InternalBug378967TestLanguage.g:169:5: (lv_element_7_0= ruleRule4 )
                    // InternalBug378967TestLanguage.g:170:6: lv_element_7_0= ruleRule4
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule4ParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_7_0=ruleRule4();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_7_0,
                    							"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule4");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleRule1"
    // InternalBug378967TestLanguage.g:192:1: entryRuleRule1 returns [EObject current=null] : iv_ruleRule1= ruleRule1 EOF ;
    public final EObject entryRuleRule1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule1 = null;


        try {
            // InternalBug378967TestLanguage.g:192:46: (iv_ruleRule1= ruleRule1 EOF )
            // InternalBug378967TestLanguage.g:193:2: iv_ruleRule1= ruleRule1 EOF
            {
             newCompositeNode(grammarAccess.getRule1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule1=ruleRule1();

            state._fsp--;

             current =iv_ruleRule1; 
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
    // $ANTLR end "entryRuleRule1"


    // $ANTLR start "ruleRule1"
    // InternalBug378967TestLanguage.g:199:1: ruleRule1 returns [EObject current=null] : ( ( (lv_type_0_0= ruleFirstEnum ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleSecondEnum ) ) ) ;
    public final EObject ruleRule1() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:205:2: ( ( ( (lv_type_0_0= ruleFirstEnum ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleSecondEnum ) ) ) )
            // InternalBug378967TestLanguage.g:206:2: ( ( (lv_type_0_0= ruleFirstEnum ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleSecondEnum ) ) )
            {
            // InternalBug378967TestLanguage.g:206:2: ( ( (lv_type_0_0= ruleFirstEnum ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleSecondEnum ) ) )
            // InternalBug378967TestLanguage.g:207:3: ( (lv_type_0_0= ruleFirstEnum ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleSecondEnum ) )
            {
            // InternalBug378967TestLanguage.g:207:3: ( (lv_type_0_0= ruleFirstEnum ) )
            // InternalBug378967TestLanguage.g:208:4: (lv_type_0_0= ruleFirstEnum )
            {
            // InternalBug378967TestLanguage.g:208:4: (lv_type_0_0= ruleFirstEnum )
            // InternalBug378967TestLanguage.g:209:5: lv_type_0_0= ruleFirstEnum
            {

            					newCompositeNode(grammarAccess.getRule1Access().getTypeFirstEnumEnumRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_type_0_0=ruleFirstEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule1Rule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.FirstEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBug378967TestLanguage.g:226:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalBug378967TestLanguage.g:227:4: (lv_value_1_0= RULE_INT )
            {
            // InternalBug378967TestLanguage.g:227:4: (lv_value_1_0= RULE_INT )
            // InternalBug378967TestLanguage.g:228:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRule1Access().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalBug378967TestLanguage.g:244:3: ( (lv_unit_2_0= ruleSecondEnum ) )
            // InternalBug378967TestLanguage.g:245:4: (lv_unit_2_0= ruleSecondEnum )
            {
            // InternalBug378967TestLanguage.g:245:4: (lv_unit_2_0= ruleSecondEnum )
            // InternalBug378967TestLanguage.g:246:5: lv_unit_2_0= ruleSecondEnum
            {

            					newCompositeNode(grammarAccess.getRule1Access().getUnitSecondEnumEnumRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_unit_2_0=ruleSecondEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule1Rule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.SecondEnum");
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
    // $ANTLR end "ruleRule1"


    // $ANTLR start "entryRuleRule2"
    // InternalBug378967TestLanguage.g:267:1: entryRuleRule2 returns [EObject current=null] : iv_ruleRule2= ruleRule2 EOF ;
    public final EObject entryRuleRule2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule2 = null;


        try {
            // InternalBug378967TestLanguage.g:267:46: (iv_ruleRule2= ruleRule2 EOF )
            // InternalBug378967TestLanguage.g:268:2: iv_ruleRule2= ruleRule2 EOF
            {
             newCompositeNode(grammarAccess.getRule2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule2=ruleRule2();

            state._fsp--;

             current =iv_ruleRule2; 
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
    // $ANTLR end "entryRuleRule2"


    // $ANTLR start "ruleRule2"
    // InternalBug378967TestLanguage.g:274:1: ruleRule2 returns [EObject current=null] : (otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= 's' ) ;
    public final EObject ruleRule2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:280:2: ( (otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= 's' ) )
            // InternalBug378967TestLanguage.g:281:2: (otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= 's' )
            {
            // InternalBug378967TestLanguage.g:281:2: (otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= 's' )
            // InternalBug378967TestLanguage.g:282:3: otherlv_0= 'after' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= 's'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRule2Access().getAfterKeyword_0());
            		
            // InternalBug378967TestLanguage.g:286:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalBug378967TestLanguage.g:287:4: (lv_value_1_0= RULE_INT )
            {
            // InternalBug378967TestLanguage.g:287:4: (lv_value_1_0= RULE_INT )
            // InternalBug378967TestLanguage.g:288:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRule2Access().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRule2Access().getSKeyword_2());
            		

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
    // $ANTLR end "ruleRule2"


    // $ANTLR start "entryRuleRule3"
    // InternalBug378967TestLanguage.g:312:1: entryRuleRule3 returns [EObject current=null] : iv_ruleRule3= ruleRule3 EOF ;
    public final EObject entryRuleRule3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule3 = null;


        try {
            // InternalBug378967TestLanguage.g:312:46: (iv_ruleRule3= ruleRule3 EOF )
            // InternalBug378967TestLanguage.g:313:2: iv_ruleRule3= ruleRule3 EOF
            {
             newCompositeNode(grammarAccess.getRule3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule3=ruleRule3();

            state._fsp--;

             current =iv_ruleRule3; 
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
    // $ANTLR end "entryRuleRule3"


    // $ANTLR start "ruleRule3"
    // InternalBug378967TestLanguage.g:319:1: ruleRule3 returns [EObject current=null] : ( ruleAfter ( (lv_value_1_0= RULE_INT ) ) ruleS ) ;
    public final EObject ruleRule3() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:325:2: ( ( ruleAfter ( (lv_value_1_0= RULE_INT ) ) ruleS ) )
            // InternalBug378967TestLanguage.g:326:2: ( ruleAfter ( (lv_value_1_0= RULE_INT ) ) ruleS )
            {
            // InternalBug378967TestLanguage.g:326:2: ( ruleAfter ( (lv_value_1_0= RULE_INT ) ) ruleS )
            // InternalBug378967TestLanguage.g:327:3: ruleAfter ( (lv_value_1_0= RULE_INT ) ) ruleS
            {

            			newCompositeNode(grammarAccess.getRule3Access().getAfterParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_4);
            ruleAfter();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBug378967TestLanguage.g:334:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalBug378967TestLanguage.g:335:4: (lv_value_1_0= RULE_INT )
            {
            // InternalBug378967TestLanguage.g:335:4: (lv_value_1_0= RULE_INT )
            // InternalBug378967TestLanguage.g:336:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRule3Access().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            			newCompositeNode(grammarAccess.getRule3Access().getSParserRuleCall_2());
            		
            pushFollow(FollowSets000.FOLLOW_2);
            ruleS();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleRule3"


    // $ANTLR start "entryRuleRule4"
    // InternalBug378967TestLanguage.g:363:1: entryRuleRule4 returns [EObject current=null] : iv_ruleRule4= ruleRule4 EOF ;
    public final EObject entryRuleRule4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule4 = null;


        try {
            // InternalBug378967TestLanguage.g:363:46: (iv_ruleRule4= ruleRule4 EOF )
            // InternalBug378967TestLanguage.g:364:2: iv_ruleRule4= ruleRule4 EOF
            {
             newCompositeNode(grammarAccess.getRule4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule4=ruleRule4();

            state._fsp--;

             current =iv_ruleRule4; 
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
    // $ANTLR end "entryRuleRule4"


    // $ANTLR start "ruleRule4"
    // InternalBug378967TestLanguage.g:370:1: ruleRule4 returns [EObject current=null] : ( ( (lv_after_0_0= ruleAfterObj ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_s_2_0= ruleSObj ) ) ) ;
    public final EObject ruleRule4() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject lv_after_0_0 = null;

        EObject lv_s_2_0 = null;



        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:376:2: ( ( ( (lv_after_0_0= ruleAfterObj ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_s_2_0= ruleSObj ) ) ) )
            // InternalBug378967TestLanguage.g:377:2: ( ( (lv_after_0_0= ruleAfterObj ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_s_2_0= ruleSObj ) ) )
            {
            // InternalBug378967TestLanguage.g:377:2: ( ( (lv_after_0_0= ruleAfterObj ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_s_2_0= ruleSObj ) ) )
            // InternalBug378967TestLanguage.g:378:3: ( (lv_after_0_0= ruleAfterObj ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_s_2_0= ruleSObj ) )
            {
            // InternalBug378967TestLanguage.g:378:3: ( (lv_after_0_0= ruleAfterObj ) )
            // InternalBug378967TestLanguage.g:379:4: (lv_after_0_0= ruleAfterObj )
            {
            // InternalBug378967TestLanguage.g:379:4: (lv_after_0_0= ruleAfterObj )
            // InternalBug378967TestLanguage.g:380:5: lv_after_0_0= ruleAfterObj
            {

            					newCompositeNode(grammarAccess.getRule4Access().getAfterAfterObjParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_after_0_0=ruleAfterObj();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule4Rule());
            					}
            					set(
            						current,
            						"after",
            						lv_after_0_0,
            						"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.AfterObj");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBug378967TestLanguage.g:397:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalBug378967TestLanguage.g:398:4: (lv_value_1_0= RULE_INT )
            {
            // InternalBug378967TestLanguage.g:398:4: (lv_value_1_0= RULE_INT )
            // InternalBug378967TestLanguage.g:399:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRule4Access().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalBug378967TestLanguage.g:415:3: ( (lv_s_2_0= ruleSObj ) )
            // InternalBug378967TestLanguage.g:416:4: (lv_s_2_0= ruleSObj )
            {
            // InternalBug378967TestLanguage.g:416:4: (lv_s_2_0= ruleSObj )
            // InternalBug378967TestLanguage.g:417:5: lv_s_2_0= ruleSObj
            {

            					newCompositeNode(grammarAccess.getRule4Access().getSSObjParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_s_2_0=ruleSObj();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule4Rule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_2_0,
            						"org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.SObj");
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
    // $ANTLR end "ruleRule4"


    // $ANTLR start "entryRuleAfterObj"
    // InternalBug378967TestLanguage.g:438:1: entryRuleAfterObj returns [EObject current=null] : iv_ruleAfterObj= ruleAfterObj EOF ;
    public final EObject entryRuleAfterObj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterObj = null;


        try {
            // InternalBug378967TestLanguage.g:438:49: (iv_ruleAfterObj= ruleAfterObj EOF )
            // InternalBug378967TestLanguage.g:439:2: iv_ruleAfterObj= ruleAfterObj EOF
            {
             newCompositeNode(grammarAccess.getAfterObjRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAfterObj=ruleAfterObj();

            state._fsp--;

             current =iv_ruleAfterObj; 
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
    // $ANTLR end "entryRuleAfterObj"


    // $ANTLR start "ruleAfterObj"
    // InternalBug378967TestLanguage.g:445:1: ruleAfterObj returns [EObject current=null] : ( (lv_value_0_0= 'after' ) ) ;
    public final EObject ruleAfterObj() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:451:2: ( ( (lv_value_0_0= 'after' ) ) )
            // InternalBug378967TestLanguage.g:452:2: ( (lv_value_0_0= 'after' ) )
            {
            // InternalBug378967TestLanguage.g:452:2: ( (lv_value_0_0= 'after' ) )
            // InternalBug378967TestLanguage.g:453:3: (lv_value_0_0= 'after' )
            {
            // InternalBug378967TestLanguage.g:453:3: (lv_value_0_0= 'after' )
            // InternalBug378967TestLanguage.g:454:4: lv_value_0_0= 'after'
            {
            lv_value_0_0=(Token)match(input,15,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getAfterObjAccess().getValueAfterKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAfterObjRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "after");
            			

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
    // $ANTLR end "ruleAfterObj"


    // $ANTLR start "entryRuleSObj"
    // InternalBug378967TestLanguage.g:469:1: entryRuleSObj returns [EObject current=null] : iv_ruleSObj= ruleSObj EOF ;
    public final EObject entryRuleSObj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSObj = null;


        try {
            // InternalBug378967TestLanguage.g:469:45: (iv_ruleSObj= ruleSObj EOF )
            // InternalBug378967TestLanguage.g:470:2: iv_ruleSObj= ruleSObj EOF
            {
             newCompositeNode(grammarAccess.getSObjRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSObj=ruleSObj();

            state._fsp--;

             current =iv_ruleSObj; 
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
    // $ANTLR end "entryRuleSObj"


    // $ANTLR start "ruleSObj"
    // InternalBug378967TestLanguage.g:476:1: ruleSObj returns [EObject current=null] : ( (lv_value_0_0= 's' ) ) ;
    public final EObject ruleSObj() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:482:2: ( ( (lv_value_0_0= 's' ) ) )
            // InternalBug378967TestLanguage.g:483:2: ( (lv_value_0_0= 's' ) )
            {
            // InternalBug378967TestLanguage.g:483:2: ( (lv_value_0_0= 's' ) )
            // InternalBug378967TestLanguage.g:484:3: (lv_value_0_0= 's' )
            {
            // InternalBug378967TestLanguage.g:484:3: (lv_value_0_0= 's' )
            // InternalBug378967TestLanguage.g:485:4: lv_value_0_0= 's'
            {
            lv_value_0_0=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getSObjAccess().getValueSKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSObjRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "s");
            			

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
    // $ANTLR end "ruleSObj"


    // $ANTLR start "entryRuleAfter"
    // InternalBug378967TestLanguage.g:500:1: entryRuleAfter returns [String current=null] : iv_ruleAfter= ruleAfter EOF ;
    public final String entryRuleAfter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAfter = null;


        try {
            // InternalBug378967TestLanguage.g:500:45: (iv_ruleAfter= ruleAfter EOF )
            // InternalBug378967TestLanguage.g:501:2: iv_ruleAfter= ruleAfter EOF
            {
             newCompositeNode(grammarAccess.getAfterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAfter=ruleAfter();

            state._fsp--;

             current =iv_ruleAfter.getText(); 
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
    // $ANTLR end "entryRuleAfter"


    // $ANTLR start "ruleAfter"
    // InternalBug378967TestLanguage.g:507:1: ruleAfter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'after' ;
    public final AntlrDatatypeRuleToken ruleAfter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:513:2: (kw= 'after' )
            // InternalBug378967TestLanguage.g:514:2: kw= 'after'
            {
            kw=(Token)match(input,15,FollowSets000.FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAfterAccess().getAfterKeyword());
            	

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
    // $ANTLR end "ruleAfter"


    // $ANTLR start "entryRuleS"
    // InternalBug378967TestLanguage.g:522:1: entryRuleS returns [String current=null] : iv_ruleS= ruleS EOF ;
    public final String entryRuleS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleS = null;


        try {
            // InternalBug378967TestLanguage.g:522:41: (iv_ruleS= ruleS EOF )
            // InternalBug378967TestLanguage.g:523:2: iv_ruleS= ruleS EOF
            {
             newCompositeNode(grammarAccess.getSRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleS=ruleS();

            state._fsp--;

             current =iv_ruleS.getText(); 
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
    // $ANTLR end "entryRuleS"


    // $ANTLR start "ruleS"
    // InternalBug378967TestLanguage.g:529:1: ruleS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 's' ;
    public final AntlrDatatypeRuleToken ruleS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:535:2: (kw= 's' )
            // InternalBug378967TestLanguage.g:536:2: kw= 's'
            {
            kw=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSAccess().getSKeyword());
            	

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
    // $ANTLR end "ruleS"


    // $ANTLR start "ruleFirstEnum"
    // InternalBug378967TestLanguage.g:544:1: ruleFirstEnum returns [Enumerator current=null] : (enumLiteral_0= 'after' ) ;
    public final Enumerator ruleFirstEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:550:2: ( (enumLiteral_0= 'after' ) )
            // InternalBug378967TestLanguage.g:551:2: (enumLiteral_0= 'after' )
            {
            // InternalBug378967TestLanguage.g:551:2: (enumLiteral_0= 'after' )
            // InternalBug378967TestLanguage.g:552:3: enumLiteral_0= 'after'
            {
            enumLiteral_0=(Token)match(input,15,FollowSets000.FOLLOW_2); 

            			current = grammarAccess.getFirstEnumAccess().getValueEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getFirstEnumAccess().getValueEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleFirstEnum"


    // $ANTLR start "ruleSecondEnum"
    // InternalBug378967TestLanguage.g:561:1: ruleSecondEnum returns [Enumerator current=null] : (enumLiteral_0= 's' ) ;
    public final Enumerator ruleSecondEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBug378967TestLanguage.g:567:2: ( (enumLiteral_0= 's' ) )
            // InternalBug378967TestLanguage.g:568:2: (enumLiteral_0= 's' )
            {
            // InternalBug378967TestLanguage.g:568:2: (enumLiteral_0= 's' )
            // InternalBug378967TestLanguage.g:569:3: enumLiteral_0= 's'
            {
            enumLiteral_0=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			current = grammarAccess.getSecondEnumAccess().getValueEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getSecondEnumAccess().getValueEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleSecondEnum"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    }


}