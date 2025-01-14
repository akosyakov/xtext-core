package org.eclipse.xtext.lexer.parser.antlr.internal;

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
import org.eclipse.xtext.lexer.services.BacktrackingLexerTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalBacktrackingLexerTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abc", "Efg", "RULE_CHARA", "RULE_CHARB", "RULE_CHARX", "RULE_YC", "RULE_CHARY", "RULE_CHARC", "RULE_WS", "RULE_SL_COMMENT"
    };
    public static final int Abc=4;
    public static final int RULE_WS=12;
    public static final int Efg=5;
    public static final int RULE_CHARX=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_CHARY=10;
    public static final int RULE_YC=9;
    public static final int RULE_CHARA=6;
    public static final int EOF=-1;
    public static final int RULE_CHARB=7;
    public static final int RULE_CHARC=11;

    // delegates
    // delegators


        public InternalBacktrackingLexerTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBacktrackingLexerTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[14+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalBacktrackingLexerTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBacktrackingLexerTestLanguageParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private BacktrackingLexerTestLanguageGrammarAccess grammarAccess;

        public InternalBacktrackingLexerTestLanguageParser(TokenStream input, BacktrackingLexerTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BacktrackingLexerTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBacktrackingLexerTestLanguageParser.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;
        int entryRuleModel_StartIndex = input.index();
        EObject iv_ruleModel = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // InternalBacktrackingLexerTestLanguageParser.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalBacktrackingLexerTestLanguageParser.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRuleModel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBacktrackingLexerTestLanguageParser.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;
        int ruleModel_StartIndex = input.index();
        Token lv_ycs_1_0=null;
        Token lv_ys_4_0=null;
        Token lv_as_5_0=null;
        Enumerator lv_enums_0_0 = null;

        EObject lv_abs_2_0 = null;

        EObject lv_xbs_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // InternalBacktrackingLexerTestLanguageParser.g:83:2: ( ( ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )* ) )
            // InternalBacktrackingLexerTestLanguageParser.g:84:2: ( ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )* )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:84:2: ( ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )* )
            // InternalBacktrackingLexerTestLanguageParser.g:85:3: ( (lv_enums_0_0= ruleEnumName ) )* ( (lv_ycs_1_0= RULE_YC ) )* ( (lv_abs_2_0= ruleAb ) )* ( (lv_xbs_3_0= ruleXb ) )* ( (lv_ys_4_0= RULE_CHARY ) )* ( (lv_as_5_0= RULE_CHARA ) )*
            {
            // InternalBacktrackingLexerTestLanguageParser.g:85:3: ( (lv_enums_0_0= ruleEnumName ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Abc && LA1_0<=Efg)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBacktrackingLexerTestLanguageParser.g:86:4: (lv_enums_0_0= ruleEnumName )
            	    {
            	    // InternalBacktrackingLexerTestLanguageParser.g:86:4: (lv_enums_0_0= ruleEnumName )
            	    // InternalBacktrackingLexerTestLanguageParser.g:87:5: lv_enums_0_0= ruleEnumName
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getEnumsEnumNameEnumRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_enums_0_0=ruleEnumName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"enums",
            	      						lv_enums_0_0,
            	      						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.EnumName");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBacktrackingLexerTestLanguageParser.g:104:3: ( (lv_ycs_1_0= RULE_YC ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_YC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBacktrackingLexerTestLanguageParser.g:105:4: (lv_ycs_1_0= RULE_YC )
            	    {
            	    // InternalBacktrackingLexerTestLanguageParser.g:105:4: (lv_ycs_1_0= RULE_YC )
            	    // InternalBacktrackingLexerTestLanguageParser.g:106:5: lv_ycs_1_0= RULE_YC
            	    {
            	    lv_ycs_1_0=(Token)match(input,RULE_YC,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(lv_ycs_1_0, grammarAccess.getModelAccess().getYcsYcTerminalRuleCall_1_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getModelRule());
            	      					}
            	      					addWithLastConsumed(
            	      						current,
            	      						"ycs",
            	      						lv_ycs_1_0,
            	      						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Yc");
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalBacktrackingLexerTestLanguageParser.g:122:3: ( (lv_abs_2_0= ruleAb ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_CHARA) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_CHARB) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalBacktrackingLexerTestLanguageParser.g:123:4: (lv_abs_2_0= ruleAb )
            	    {
            	    // InternalBacktrackingLexerTestLanguageParser.g:123:4: (lv_abs_2_0= ruleAb )
            	    // InternalBacktrackingLexerTestLanguageParser.g:124:5: lv_abs_2_0= ruleAb
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getAbsAbParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_abs_2_0=ruleAb();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"abs",
            	      						lv_abs_2_0,
            	      						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Ab");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalBacktrackingLexerTestLanguageParser.g:141:3: ( (lv_xbs_3_0= ruleXb ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_CHARX) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBacktrackingLexerTestLanguageParser.g:142:4: (lv_xbs_3_0= ruleXb )
            	    {
            	    // InternalBacktrackingLexerTestLanguageParser.g:142:4: (lv_xbs_3_0= ruleXb )
            	    // InternalBacktrackingLexerTestLanguageParser.g:143:5: lv_xbs_3_0= ruleXb
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getXbsXbParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_xbs_3_0=ruleXb();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"xbs",
            	      						lv_xbs_3_0,
            	      						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Xb");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalBacktrackingLexerTestLanguageParser.g:160:3: ( (lv_ys_4_0= RULE_CHARY ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_CHARY) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBacktrackingLexerTestLanguageParser.g:161:4: (lv_ys_4_0= RULE_CHARY )
            	    {
            	    // InternalBacktrackingLexerTestLanguageParser.g:161:4: (lv_ys_4_0= RULE_CHARY )
            	    // InternalBacktrackingLexerTestLanguageParser.g:162:5: lv_ys_4_0= RULE_CHARY
            	    {
            	    lv_ys_4_0=(Token)match(input,RULE_CHARY,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(lv_ys_4_0, grammarAccess.getModelAccess().getYsCharYTerminalRuleCall_4_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getModelRule());
            	      					}
            	      					addWithLastConsumed(
            	      						current,
            	      						"ys",
            	      						lv_ys_4_0,
            	      						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharY");
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalBacktrackingLexerTestLanguageParser.g:178:3: ( (lv_as_5_0= RULE_CHARA ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_CHARA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBacktrackingLexerTestLanguageParser.g:179:4: (lv_as_5_0= RULE_CHARA )
            	    {
            	    // InternalBacktrackingLexerTestLanguageParser.g:179:4: (lv_as_5_0= RULE_CHARA )
            	    // InternalBacktrackingLexerTestLanguageParser.g:180:5: lv_as_5_0= RULE_CHARA
            	    {
            	    lv_as_5_0=(Token)match(input,RULE_CHARA,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(lv_as_5_0, grammarAccess.getModelAccess().getAsCharATerminalRuleCall_5_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getModelRule());
            	      					}
            	      					addWithLastConsumed(
            	      						current,
            	      						"as",
            	      						lv_as_5_0,
            	      						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharA");
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, ruleModel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAb"
    // InternalBacktrackingLexerTestLanguageParser.g:200:1: entryRuleAb returns [EObject current=null] : iv_ruleAb= ruleAb EOF ;
    public final EObject entryRuleAb() throws RecognitionException {
        EObject current = null;
        int entryRuleAb_StartIndex = input.index();
        EObject iv_ruleAb = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // InternalBacktrackingLexerTestLanguageParser.g:200:43: (iv_ruleAb= ruleAb EOF )
            // InternalBacktrackingLexerTestLanguageParser.g:201:2: iv_ruleAb= ruleAb EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAb=ruleAb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAb; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleAb_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAb"


    // $ANTLR start "ruleAb"
    // InternalBacktrackingLexerTestLanguageParser.g:207:1: ruleAb returns [EObject current=null] : ( ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) ) ) ;
    public final EObject ruleAb() throws RecognitionException {
        EObject current = null;
        int ruleAb_StartIndex = input.index();
        Token lv_x_0_0=null;
        Token lv_y_1_0=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // InternalBacktrackingLexerTestLanguageParser.g:213:2: ( ( ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) ) ) )
            // InternalBacktrackingLexerTestLanguageParser.g:214:2: ( ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) ) )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:214:2: ( ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) ) )
            // InternalBacktrackingLexerTestLanguageParser.g:215:3: ( (lv_x_0_0= RULE_CHARA ) ) ( (lv_y_1_0= RULE_CHARB ) )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:215:3: ( (lv_x_0_0= RULE_CHARA ) )
            // InternalBacktrackingLexerTestLanguageParser.g:216:4: (lv_x_0_0= RULE_CHARA )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:216:4: (lv_x_0_0= RULE_CHARA )
            // InternalBacktrackingLexerTestLanguageParser.g:217:5: lv_x_0_0= RULE_CHARA
            {
            lv_x_0_0=(Token)match(input,RULE_CHARA,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_x_0_0, grammarAccess.getAbAccess().getXCharATerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAbRule());
              					}
              					setWithLastConsumed(
              						current,
              						"x",
              						lv_x_0_0,
              						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharA");
              				
            }

            }


            }

            // InternalBacktrackingLexerTestLanguageParser.g:233:3: ( (lv_y_1_0= RULE_CHARB ) )
            // InternalBacktrackingLexerTestLanguageParser.g:234:4: (lv_y_1_0= RULE_CHARB )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:234:4: (lv_y_1_0= RULE_CHARB )
            // InternalBacktrackingLexerTestLanguageParser.g:235:5: lv_y_1_0= RULE_CHARB
            {
            lv_y_1_0=(Token)match(input,RULE_CHARB,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_y_1_0, grammarAccess.getAbAccess().getYCharbTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAbRule());
              					}
              					setWithLastConsumed(
              						current,
              						"y",
              						lv_y_1_0,
              						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Charb");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, ruleAb_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAb"


    // $ANTLR start "entryRuleXb"
    // InternalBacktrackingLexerTestLanguageParser.g:255:1: entryRuleXb returns [EObject current=null] : iv_ruleXb= ruleXb EOF ;
    public final EObject entryRuleXb() throws RecognitionException {
        EObject current = null;
        int entryRuleXb_StartIndex = input.index();
        EObject iv_ruleXb = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // InternalBacktrackingLexerTestLanguageParser.g:255:43: (iv_ruleXb= ruleXb EOF )
            // InternalBacktrackingLexerTestLanguageParser.g:256:2: iv_ruleXb= ruleXb EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXbRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXb=ruleXb();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXb; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleXb_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleXb"


    // $ANTLR start "ruleXb"
    // InternalBacktrackingLexerTestLanguageParser.g:262:1: ruleXb returns [EObject current=null] : ( ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) ) ) ;
    public final EObject ruleXb() throws RecognitionException {
        EObject current = null;
        int ruleXb_StartIndex = input.index();
        Token lv_x_0_0=null;
        Token lv_y_1_0=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // InternalBacktrackingLexerTestLanguageParser.g:268:2: ( ( ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) ) ) )
            // InternalBacktrackingLexerTestLanguageParser.g:269:2: ( ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) ) )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:269:2: ( ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) ) )
            // InternalBacktrackingLexerTestLanguageParser.g:270:3: ( (lv_x_0_0= RULE_CHARX ) ) ( (lv_y_1_0= RULE_CHARB ) )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:270:3: ( (lv_x_0_0= RULE_CHARX ) )
            // InternalBacktrackingLexerTestLanguageParser.g:271:4: (lv_x_0_0= RULE_CHARX )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:271:4: (lv_x_0_0= RULE_CHARX )
            // InternalBacktrackingLexerTestLanguageParser.g:272:5: lv_x_0_0= RULE_CHARX
            {
            lv_x_0_0=(Token)match(input,RULE_CHARX,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_x_0_0, grammarAccess.getXbAccess().getXCharXTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXbRule());
              					}
              					setWithLastConsumed(
              						current,
              						"x",
              						lv_x_0_0,
              						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharX");
              				
            }

            }


            }

            // InternalBacktrackingLexerTestLanguageParser.g:288:3: ( (lv_y_1_0= RULE_CHARB ) )
            // InternalBacktrackingLexerTestLanguageParser.g:289:4: (lv_y_1_0= RULE_CHARB )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:289:4: (lv_y_1_0= RULE_CHARB )
            // InternalBacktrackingLexerTestLanguageParser.g:290:5: lv_y_1_0= RULE_CHARB
            {
            lv_y_1_0=(Token)match(input,RULE_CHARB,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_y_1_0, grammarAccess.getXbAccess().getYCharbTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXbRule());
              					}
              					setWithLastConsumed(
              						current,
              						"y",
              						lv_y_1_0,
              						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Charb");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, ruleXb_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleXb"


    // $ANTLR start "ruleEnumName"
    // InternalBacktrackingLexerTestLanguageParser.g:310:1: ruleEnumName returns [Enumerator current=null] : ( (enumLiteral_0= Abc ) | (enumLiteral_1= Efg ) ) ;
    public final Enumerator ruleEnumName() throws RecognitionException {
        Enumerator current = null;
        int ruleEnumName_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // InternalBacktrackingLexerTestLanguageParser.g:316:2: ( ( (enumLiteral_0= Abc ) | (enumLiteral_1= Efg ) ) )
            // InternalBacktrackingLexerTestLanguageParser.g:317:2: ( (enumLiteral_0= Abc ) | (enumLiteral_1= Efg ) )
            {
            // InternalBacktrackingLexerTestLanguageParser.g:317:2: ( (enumLiteral_0= Abc ) | (enumLiteral_1= Efg ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Abc) ) {
                alt7=1;
            }
            else if ( (LA7_0==Efg) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBacktrackingLexerTestLanguageParser.g:318:3: (enumLiteral_0= Abc )
                    {
                    // InternalBacktrackingLexerTestLanguageParser.g:318:3: (enumLiteral_0= Abc )
                    // InternalBacktrackingLexerTestLanguageParser.g:319:4: enumLiteral_0= Abc
                    {
                    enumLiteral_0=(Token)match(input,Abc,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEnumNameAccess().getAbcEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEnumNameAccess().getAbcEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBacktrackingLexerTestLanguageParser.g:326:3: (enumLiteral_1= Efg )
                    {
                    // InternalBacktrackingLexerTestLanguageParser.g:326:3: (enumLiteral_1= Efg )
                    // InternalBacktrackingLexerTestLanguageParser.g:327:4: enumLiteral_1= Efg
                    {
                    enumLiteral_1=(Token)match(input,Efg,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEnumNameAccess().getEfgEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEnumNameAccess().getEfgEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, ruleEnumName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEnumName"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000772L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000742L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000542L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000442L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    }


}