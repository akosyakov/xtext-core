/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalEpatchTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.epatch.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.epatch.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.epatch.services.EpatchTestLanguageGrammarAccess;

}

@parser::members {

 	private EpatchTestLanguageGrammarAccess grammarAccess;

    public InternalEpatchTestLanguageParser(TokenStream input, EpatchTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "EPatch";
   	}

   	@Override
   	protected EpatchTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEPatch
entryRuleEPatch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEPatchRule()); }
	iv_ruleEPatch=ruleEPatch
	{ $current=$iv_ruleEPatch.current; }
	EOF;

// Rule EPatch
ruleEPatch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='epatch'
		{
			newLeafNode(otherlv_0, grammarAccess.getEPatchAccess().getEpatchKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEPatchAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEPatchRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEPatchAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEPatchAccess().getImportsImportParserRuleCall_3_0());
				}
				lv_imports_3_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEPatchRule());
					}
					add(
						$current,
						"imports",
						lv_imports_3_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getEPatchAccess().getResourcesNamedResourceParserRuleCall_4_0());
				}
				lv_resources_4_0=ruleNamedResource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEPatchRule());
					}
					add(
						$current,
						"resources",
						lv_resources_4_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.NamedResource");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getEPatchAccess().getObjectsObjectRefParserRuleCall_5_0());
				}
				lv_objects_5_0=ruleObjectRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEPatchRule());
					}
					add(
						$current,
						"objects",
						lv_objects_5_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ObjectRef");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getEPatchAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getImportAccess().getModelImportParserRuleCall_0());
		}
		this_ModelImport_0=ruleModelImport
		{
			$current = $this_ModelImport_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getImportAccess().getJavaImportParserRuleCall_1());
		}
		this_JavaImport_1=ruleJavaImport
		{
			$current = $this_JavaImport_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getImportAccess().getExtensionImportParserRuleCall_2());
		}
		this_ExtensionImport_2=ruleExtensionImport
		{
			$current = $this_ExtensionImport_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleModelImport
entryRuleModelImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelImportRule()); }
	iv_ruleModelImport=ruleModelImport
	{ $current=$iv_ruleModelImport.current; }
	EOF;

// Rule ModelImport
ruleModelImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getModelImportAccess().getResourceImportParserRuleCall_0());
		}
		this_ResourceImport_0=ruleResourceImport
		{
			$current = $this_ResourceImport_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelImportAccess().getEPackageImportParserRuleCall_1());
		}
		this_EPackageImport_1=ruleEPackageImport
		{
			$current = $this_EPackageImport_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleResourceImport
entryRuleResourceImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResourceImportRule()); }
	iv_ruleResourceImport=ruleResourceImport
	{ $current=$iv_ruleResourceImport.current; }
	EOF;

// Rule ResourceImport
ruleResourceImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getResourceImportAccess().getImportKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getResourceImportAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResourceImportRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='uri'
		{
			newLeafNode(otherlv_2, grammarAccess.getResourceImportAccess().getUriKeyword_2());
		}
		(
			(
				lv_uri_3_0=RULE_STRING
				{
					newLeafNode(lv_uri_3_0, grammarAccess.getResourceImportAccess().getUriSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResourceImportRule());
					}
					setWithLastConsumed(
						$current,
						"uri",
						lv_uri_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleEPackageImport
entryRuleEPackageImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEPackageImportRule()); }
	iv_ruleEPackageImport=ruleEPackageImport
	{ $current=$iv_ruleEPackageImport.current; }
	EOF;

// Rule EPackageImport
ruleEPackageImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getEPackageImportAccess().getImportKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEPackageImportAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEPackageImportRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='ns'
		{
			newLeafNode(otherlv_2, grammarAccess.getEPackageImportAccess().getNsKeyword_2());
		}
		(
			(
				lv_nsURI_3_0=RULE_STRING
				{
					newLeafNode(lv_nsURI_3_0, grammarAccess.getEPackageImportAccess().getNsURISTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEPackageImportRule());
					}
					setWithLastConsumed(
						$current,
						"nsURI",
						lv_nsURI_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleJavaImport
entryRuleJavaImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJavaImportRule()); }
	iv_ruleJavaImport=ruleJavaImport
	{ $current=$iv_ruleJavaImport.current; }
	EOF;

// Rule JavaImport
ruleJavaImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getJavaImportAccess().getImportKeyword_0());
		}
		otherlv_1='java'
		{
			newLeafNode(otherlv_1, grammarAccess.getJavaImportAccess().getJavaKeyword_1());
		}
		(
			(
				lv_path_2_0=RULE_ID
				{
					newLeafNode(lv_path_2_0, grammarAccess.getJavaImportAccess().getPathIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJavaImportRule());
					}
					addWithLastConsumed(
						$current,
						"path",
						lv_path_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='.'
			{
				newLeafNode(otherlv_3, grammarAccess.getJavaImportAccess().getFullStopKeyword_3_0());
			}
			(
				(
					lv_path_4_0=RULE_ID
					{
						newLeafNode(lv_path_4_0, grammarAccess.getJavaImportAccess().getPathIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getJavaImportRule());
						}
						addWithLastConsumed(
							$current,
							"path",
							lv_path_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExtensionImport
entryRuleExtensionImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtensionImportRule()); }
	iv_ruleExtensionImport=ruleExtensionImport
	{ $current=$iv_ruleExtensionImport.current; }
	EOF;

// Rule ExtensionImport
ruleExtensionImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getExtensionImportAccess().getImportKeyword_0());
		}
		otherlv_1='extension'
		{
			newLeafNode(otherlv_1, grammarAccess.getExtensionImportAccess().getExtensionKeyword_1());
		}
		(
			(
				lv_path_2_0=RULE_ID
				{
					newLeafNode(lv_path_2_0, grammarAccess.getExtensionImportAccess().getPathIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtensionImportRule());
					}
					addWithLastConsumed(
						$current,
						"path",
						lv_path_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='::'
			{
				newLeafNode(otherlv_3, grammarAccess.getExtensionImportAccess().getColonColonKeyword_3_0());
			}
			(
				(
					lv_path_4_0=RULE_ID
					{
						newLeafNode(lv_path_4_0, grammarAccess.getExtensionImportAccess().getPathIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtensionImportRule());
						}
						addWithLastConsumed(
							$current,
							"path",
							lv_path_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNamedResource
entryRuleNamedResource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedResourceRule()); }
	iv_ruleNamedResource=ruleNamedResource
	{ $current=$iv_ruleNamedResource.current; }
	EOF;

// Rule NamedResource
ruleNamedResource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='resource'
		{
			newLeafNode(otherlv_0, grammarAccess.getNamedResourceAccess().getResourceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNamedResourceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNamedResourceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getNamedResourceAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='left'
		{
			newLeafNode(otherlv_3, grammarAccess.getNamedResourceAccess().getLeftKeyword_3());
		}
		(
			(
				otherlv_4='uri'
				{
					newLeafNode(otherlv_4, grammarAccess.getNamedResourceAccess().getUriKeyword_4_0_0());
				}
				(
					(
						lv_leftUri_5_0=RULE_STRING
						{
							newLeafNode(lv_leftUri_5_0, grammarAccess.getNamedResourceAccess().getLeftUriSTRINGTerminalRuleCall_4_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNamedResourceRule());
							}
							setWithLastConsumed(
								$current,
								"leftUri",
								lv_leftUri_5_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNamedResourceAccess().getLeftRootCreatedObjectParserRuleCall_4_1_0());
					}
					lv_leftRoot_6_0=ruleCreatedObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNamedResourceRule());
						}
						set(
							$current,
							"leftRoot",
							lv_leftRoot_6_0,
							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getNamedResourceAccess().getSemicolonKeyword_5());
		}
		otherlv_8='right'
		{
			newLeafNode(otherlv_8, grammarAccess.getNamedResourceAccess().getRightKeyword_6());
		}
		(
			(
				otherlv_9='uri'
				{
					newLeafNode(otherlv_9, grammarAccess.getNamedResourceAccess().getUriKeyword_7_0_0());
				}
				(
					(
						lv_rightUri_10_0=RULE_STRING
						{
							newLeafNode(lv_rightUri_10_0, grammarAccess.getNamedResourceAccess().getRightUriSTRINGTerminalRuleCall_7_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNamedResourceRule());
							}
							setWithLastConsumed(
								$current,
								"rightUri",
								lv_rightUri_10_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNamedResourceAccess().getRightRootCreatedObjectParserRuleCall_7_1_0());
					}
					lv_rightRoot_11_0=ruleCreatedObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNamedResourceRule());
						}
						set(
							$current,
							"rightRoot",
							lv_rightRoot_11_0,
							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_12=';'
		{
			newLeafNode(otherlv_12, grammarAccess.getNamedResourceAccess().getSemicolonKeyword_8());
		}
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getNamedResourceAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleObjectRef
entryRuleObjectRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectRefRule()); }
	iv_ruleObjectRef=ruleObjectRef
	{ $current=$iv_ruleObjectRef.current; }
	EOF;

// Rule ObjectRef
ruleObjectRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='object'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectRefAccess().getObjectKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getObjectRefAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectRefRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObjectRefRule());
							}
						}
						otherlv_2=RULE_ID
						{
							newLeafNode(otherlv_2, grammarAccess.getObjectRefAccess().getLeftResNamedResourceCrossReference_2_0_0_0());
						}
					)
				)
				(
					(
						lv_leftFrag_3_0=RULE_FRAGMENT
						{
							newLeafNode(lv_leftFrag_3_0, grammarAccess.getObjectRefAccess().getLeftFragFRAGMENTTerminalRuleCall_2_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObjectRefRule());
							}
							setWithLastConsumed(
								$current,
								"leftFrag",
								lv_leftFrag_3_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
						}
					)
				)
			)
			    |
			(
				otherlv_4='left'
				{
					newLeafNode(otherlv_4, grammarAccess.getObjectRefAccess().getLeftKeyword_2_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObjectRefRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getObjectRefAccess().getLeftResNamedResourceCrossReference_2_1_1_0());
						}
					)
				)
				(
					(
						lv_leftFrag_6_0=RULE_FRAGMENT
						{
							newLeafNode(lv_leftFrag_6_0, grammarAccess.getObjectRefAccess().getLeftFragFRAGMENTTerminalRuleCall_2_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObjectRefRule());
							}
							setWithLastConsumed(
								$current,
								"leftFrag",
								lv_leftFrag_6_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
						}
					)
				)
				otherlv_7='right'
				{
					newLeafNode(otherlv_7, grammarAccess.getObjectRefAccess().getRightKeyword_2_1_3());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObjectRefRule());
							}
						}
						otherlv_8=RULE_ID
						{
							newLeafNode(otherlv_8, grammarAccess.getObjectRefAccess().getRightResNamedResourceCrossReference_2_1_4_0());
						}
					)
				)
				(
					(
						lv_rightFrag_9_0=RULE_FRAGMENT
						{
							newLeafNode(lv_rightFrag_9_0, grammarAccess.getObjectRefAccess().getRightFragFRAGMENTTerminalRuleCall_2_1_5_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObjectRefRule());
							}
							setWithLastConsumed(
								$current,
								"rightFrag",
								lv_rightFrag_9_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
						}
					)
				)
			)
		)
		(
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getObjectRefAccess().getLeftCurlyBracketKeyword_3_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getObjectRefAccess().getAssignmentsBiSingleAssignmentParserRuleCall_3_1_0_0());
						}
						lv_assignments_11_0=ruleBiSingleAssignment
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getObjectRefRule());
							}
							add(
								$current,
								"assignments",
								lv_assignments_11_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.BiSingleAssignment");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getObjectRefAccess().getAssignmentsBiListAssignmentParserRuleCall_3_1_1_0());
						}
						lv_assignments_12_0=ruleBiListAssignment
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getObjectRefRule());
							}
							add(
								$current,
								"assignments",
								lv_assignments_12_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.BiListAssignment");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
			(
				otherlv_13='left'
				{
					newLeafNode(otherlv_13, grammarAccess.getObjectRefAccess().getLeftKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getObjectRefAccess().getLeftMigMigrationParserRuleCall_3_2_1_0());
						}
						lv_leftMig_14_0=ruleMigration
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getObjectRefRule());
							}
							set(
								$current,
								"leftMig",
								lv_leftMig_14_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Migration");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			(
				otherlv_15='right'
				{
					newLeafNode(otherlv_15, grammarAccess.getObjectRefAccess().getRightKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getObjectRefAccess().getRightMigMigrationParserRuleCall_3_3_1_0());
						}
						lv_rightMig_16_0=ruleMigration
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getObjectRefRule());
							}
							set(
								$current,
								"rightMig",
								lv_rightMig_16_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Migration");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			otherlv_17='}'
			{
				newLeafNode(otherlv_17, grammarAccess.getObjectRefAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
	)
;

// Entry rule entryRuleBiSingleAssignment
entryRuleBiSingleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBiSingleAssignmentRule()); }
	iv_ruleBiSingleAssignment=ruleBiSingleAssignment
	{ $current=$iv_ruleBiSingleAssignment.current; }
	EOF;

// Rule BiSingleAssignment
ruleBiSingleAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_feature_0_0=RULE_ID
				{
					newLeafNode(lv_feature_0_0, grammarAccess.getBiSingleAssignmentAccess().getFeatureIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBiSingleAssignmentRule());
					}
					setWithLastConsumed(
						$current,
						"feature",
						lv_feature_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getBiSingleAssignmentAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBiSingleAssignmentAccess().getLeftValueSingleAssignmentValueParserRuleCall_2_0());
				}
				lv_leftValue_2_0=ruleSingleAssignmentValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBiSingleAssignmentRule());
					}
					set(
						$current,
						"leftValue",
						lv_leftValue_2_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.SingleAssignmentValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='|'
		{
			newLeafNode(otherlv_3, grammarAccess.getBiSingleAssignmentAccess().getVerticalLineKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBiSingleAssignmentAccess().getRightValueSingleAssignmentValueParserRuleCall_4_0());
				}
				lv_rightValue_4_0=ruleSingleAssignmentValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBiSingleAssignmentRule());
					}
					set(
						$current,
						"rightValue",
						lv_rightValue_4_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.SingleAssignmentValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getBiSingleAssignmentAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleBiListAssignment
entryRuleBiListAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBiListAssignmentRule()); }
	iv_ruleBiListAssignment=ruleBiListAssignment
	{ $current=$iv_ruleBiListAssignment.current; }
	EOF;

// Rule BiListAssignment
ruleBiListAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_feature_0_0=RULE_ID
				{
					newLeafNode(lv_feature_0_0, grammarAccess.getBiListAssignmentAccess().getFeatureIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBiListAssignmentRule());
					}
					setWithLastConsumed(
						$current,
						"feature",
						lv_feature_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getBiListAssignmentAccess().getEqualsSignKeyword_1());
		}
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getBiListAssignmentAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getBiListAssignmentAccess().getLeftValuesListAssignmentValueParserRuleCall_3_0_0());
					}
					lv_leftValues_3_0=ruleListAssignmentValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBiListAssignmentRule());
						}
						add(
							$current,
							"leftValues",
							lv_leftValues_3_0,
							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ListAssignmentValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getBiListAssignmentAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBiListAssignmentAccess().getLeftValuesListAssignmentValueParserRuleCall_3_1_1_0());
						}
						lv_leftValues_5_0=ruleListAssignmentValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBiListAssignmentRule());
							}
							add(
								$current,
								"leftValues",
								lv_leftValues_5_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ListAssignmentValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='|'
		{
			newLeafNode(otherlv_6, grammarAccess.getBiListAssignmentAccess().getVerticalLineKeyword_4());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getBiListAssignmentAccess().getRightValuesListAssignmentValueParserRuleCall_5_0_0());
					}
					lv_rightValues_7_0=ruleListAssignmentValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBiListAssignmentRule());
						}
						add(
							$current,
							"rightValues",
							lv_rightValues_7_0,
							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ListAssignmentValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getBiListAssignmentAccess().getCommaKeyword_5_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBiListAssignmentAccess().getRightValuesListAssignmentValueParserRuleCall_5_1_1_0());
						}
						lv_rightValues_9_0=ruleListAssignmentValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBiListAssignmentRule());
							}
							add(
								$current,
								"rightValues",
								lv_rightValues_9_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ListAssignmentValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_10=']'
		{
			newLeafNode(otherlv_10, grammarAccess.getBiListAssignmentAccess().getRightSquareBracketKeyword_6());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getBiListAssignmentAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleMonoSingleAssignment
entryRuleMonoSingleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMonoSingleAssignmentRule()); }
	iv_ruleMonoSingleAssignment=ruleMonoSingleAssignment
	{ $current=$iv_ruleMonoSingleAssignment.current; }
	EOF;

// Rule MonoSingleAssignment
ruleMonoSingleAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_feature_0_0=RULE_ID
				{
					newLeafNode(lv_feature_0_0, grammarAccess.getMonoSingleAssignmentAccess().getFeatureIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMonoSingleAssignmentRule());
					}
					setWithLastConsumed(
						$current,
						"feature",
						lv_feature_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getMonoSingleAssignmentAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMonoSingleAssignmentAccess().getLeftValueSingleAssignmentValueParserRuleCall_2_0());
				}
				lv_leftValue_2_0=ruleSingleAssignmentValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMonoSingleAssignmentRule());
					}
					set(
						$current,
						"leftValue",
						lv_leftValue_2_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.SingleAssignmentValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getMonoSingleAssignmentAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleMonoListAssignment
entryRuleMonoListAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMonoListAssignmentRule()); }
	iv_ruleMonoListAssignment=ruleMonoListAssignment
	{ $current=$iv_ruleMonoListAssignment.current; }
	EOF;

// Rule MonoListAssignment
ruleMonoListAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_feature_0_0=RULE_ID
				{
					newLeafNode(lv_feature_0_0, grammarAccess.getMonoListAssignmentAccess().getFeatureIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMonoListAssignmentRule());
					}
					setWithLastConsumed(
						$current,
						"feature",
						lv_feature_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getMonoListAssignmentAccess().getEqualsSignKeyword_1());
		}
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getMonoListAssignmentAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMonoListAssignmentAccess().getLeftValuesAssignmentValueParserRuleCall_3_0_0());
					}
					lv_leftValues_3_0=ruleAssignmentValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMonoListAssignmentRule());
						}
						add(
							$current,
							"leftValues",
							lv_leftValues_3_0,
							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.AssignmentValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMonoListAssignmentAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMonoListAssignmentAccess().getLeftValuesAssignmentValueParserRuleCall_3_1_1_0());
						}
						lv_leftValues_5_0=ruleAssignmentValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMonoListAssignmentRule());
							}
							add(
								$current,
								"leftValues",
								lv_leftValues_5_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.AssignmentValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getMonoListAssignmentAccess().getRightSquareBracketKeyword_4());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getMonoListAssignmentAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleAssignmentValue
entryRuleAssignmentValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentValueRule()); }
	iv_ruleAssignmentValue=ruleAssignmentValue
	{ $current=$iv_ruleAssignmentValue.current; }
	EOF;

// Rule AssignmentValue
ruleAssignmentValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_value_0_0=RULE_STRING
				{
					newLeafNode(lv_value_0_0, grammarAccess.getAssignmentValueAccess().getValueSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignmentValueRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		    |
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignmentValueRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getAssignmentValueAccess().getRefObjectNamedObjectCrossReference_1_0_0());
					}
				)
			)
			(
				otherlv_2='.'
				{
					newLeafNode(otherlv_2, grammarAccess.getAssignmentValueAccess().getFullStopKeyword_1_1_0());
				}
				(
					(
						lv_refFeature_3_0=RULE_ID
						{
							newLeafNode(lv_refFeature_3_0, grammarAccess.getAssignmentValueAccess().getRefFeatureIDTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAssignmentValueRule());
							}
							setWithLastConsumed(
								$current,
								"refFeature",
								lv_refFeature_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					otherlv_4='['
					{
						newLeafNode(otherlv_4, grammarAccess.getAssignmentValueAccess().getLeftSquareBracketKeyword_1_1_2_0());
					}
					(
						(
							lv_refIndex_5_0=RULE_INT
							{
								newLeafNode(lv_refIndex_5_0, grammarAccess.getAssignmentValueAccess().getRefIndexINTTerminalRuleCall_1_1_2_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getAssignmentValueRule());
								}
								setWithLastConsumed(
									$current,
									"refIndex",
									lv_refIndex_5_0,
									"org.eclipse.xtext.common.Terminals.INT");
							}
						)
					)
					otherlv_6=']'
					{
						newLeafNode(otherlv_6, grammarAccess.getAssignmentValueAccess().getRightSquareBracketKeyword_1_1_2_2());
					}
				)?
			)?
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignmentValueAccess().getNewObjectCreatedObjectParserRuleCall_2_0());
				}
				lv_newObject_7_0=ruleCreatedObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignmentValueRule());
					}
					set(
						$current,
						"newObject",
						lv_newObject_7_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignmentValueRule());
						}
					}
					otherlv_8=RULE_ID
					{
						newLeafNode(otherlv_8, grammarAccess.getAssignmentValueAccess().getImportImportCrossReference_3_0_0());
					}
				)
			)
			(
				(
					lv_impFrag_9_0=RULE_FRAGMENT
					{
						newLeafNode(lv_impFrag_9_0, grammarAccess.getAssignmentValueAccess().getImpFragFRAGMENTTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignmentValueRule());
						}
						setWithLastConsumed(
							$current,
							"impFrag",
							lv_impFrag_9_0,
							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleListAssignmentValue
entryRuleListAssignmentValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListAssignmentValueRule()); }
	iv_ruleListAssignmentValue=ruleListAssignmentValue
	{ $current=$iv_ruleListAssignmentValue.current; }
	EOF;

// Rule ListAssignmentValue
ruleListAssignmentValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_index_0_0=RULE_INT
				{
					newLeafNode(lv_index_0_0, grammarAccess.getListAssignmentValueAccess().getIndexINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListAssignmentValueRule());
					}
					setWithLastConsumed(
						$current,
						"index",
						lv_index_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getListAssignmentValueAccess().getColonKeyword_1());
		}
		(
			(
				otherlv_2='['
				{
					newLeafNode(otherlv_2, grammarAccess.getListAssignmentValueAccess().getLeftSquareBracketKeyword_2_0_0());
				}
				(
					(
						lv_refIndex_3_0=RULE_INT
						{
							newLeafNode(lv_refIndex_3_0, grammarAccess.getListAssignmentValueAccess().getRefIndexINTTerminalRuleCall_2_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getListAssignmentValueRule());
							}
							setWithLastConsumed(
								$current,
								"refIndex",
								lv_refIndex_3_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
				otherlv_4=']'
				{
					newLeafNode(otherlv_4, grammarAccess.getListAssignmentValueAccess().getRightSquareBracketKeyword_2_0_2());
				}
			)
			    |
			(
				(
					lv_value_5_0=RULE_STRING
					{
						newLeafNode(lv_value_5_0, grammarAccess.getListAssignmentValueAccess().getValueSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getListAssignmentValueRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			    |
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getListAssignmentValueRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getListAssignmentValueAccess().getRefObjectNamedObjectCrossReference_2_2_0_0());
						}
					)
				)
				(
					otherlv_7='.'
					{
						newLeafNode(otherlv_7, grammarAccess.getListAssignmentValueAccess().getFullStopKeyword_2_2_1_0());
					}
					(
						(
							lv_refFeature_8_0=RULE_ID
							{
								newLeafNode(lv_refFeature_8_0, grammarAccess.getListAssignmentValueAccess().getRefFeatureIDTerminalRuleCall_2_2_1_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getListAssignmentValueRule());
								}
								setWithLastConsumed(
									$current,
									"refFeature",
									lv_refFeature_8_0,
									"org.eclipse.xtext.common.Terminals.ID");
							}
						)
					)
					(
						otherlv_9='['
						{
							newLeafNode(otherlv_9, grammarAccess.getListAssignmentValueAccess().getLeftSquareBracketKeyword_2_2_1_2_0());
						}
						(
							(
								lv_refIndex_10_0=RULE_INT
								{
									newLeafNode(lv_refIndex_10_0, grammarAccess.getListAssignmentValueAccess().getRefIndexINTTerminalRuleCall_2_2_1_2_1_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getListAssignmentValueRule());
									}
									setWithLastConsumed(
										$current,
										"refIndex",
										lv_refIndex_10_0,
										"org.eclipse.xtext.common.Terminals.INT");
								}
							)
						)
						otherlv_11=']'
						{
							newLeafNode(otherlv_11, grammarAccess.getListAssignmentValueAccess().getRightSquareBracketKeyword_2_2_1_2_2());
						}
					)?
				)?
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getListAssignmentValueAccess().getNewObjectCreatedObjectParserRuleCall_2_3_0());
					}
					lv_newObject_12_0=ruleCreatedObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getListAssignmentValueRule());
						}
						set(
							$current,
							"newObject",
							lv_newObject_12_0,
							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getListAssignmentValueRule());
							}
						}
						otherlv_13=RULE_ID
						{
							newLeafNode(otherlv_13, grammarAccess.getListAssignmentValueAccess().getImportImportCrossReference_2_4_0_0());
						}
					)
				)
				(
					(
						lv_impFrag_14_0=RULE_FRAGMENT
						{
							newLeafNode(lv_impFrag_14_0, grammarAccess.getListAssignmentValueAccess().getImpFragFRAGMENTTerminalRuleCall_2_4_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getListAssignmentValueRule());
							}
							setWithLastConsumed(
								$current,
								"impFrag",
								lv_impFrag_14_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleSingleAssignmentValue
entryRuleSingleAssignmentValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleAssignmentValueRule()); }
	iv_ruleSingleAssignmentValue=ruleSingleAssignmentValue
	{ $current=$iv_ruleSingleAssignmentValue.current; }
	EOF;

// Rule SingleAssignmentValue
ruleSingleAssignmentValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_keyword_0_0='null'
				{
					newLeafNode(lv_keyword_0_0, grammarAccess.getSingleAssignmentValueAccess().getKeywordNullKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
					}
					setWithLastConsumed($current, "keyword", lv_keyword_0_0, "null");
				}
			)
		)
		    |
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getSingleAssignmentValueAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		    |
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getSingleAssignmentValueAccess().getRefObjectNamedObjectCrossReference_2_0_0());
					}
				)
			)
			(
				otherlv_3='.'
				{
					newLeafNode(otherlv_3, grammarAccess.getSingleAssignmentValueAccess().getFullStopKeyword_2_1_0());
				}
				(
					(
						lv_refFeature_4_0=RULE_ID
						{
							newLeafNode(lv_refFeature_4_0, grammarAccess.getSingleAssignmentValueAccess().getRefFeatureIDTerminalRuleCall_2_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
							}
							setWithLastConsumed(
								$current,
								"refFeature",
								lv_refFeature_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					otherlv_5='['
					{
						newLeafNode(otherlv_5, grammarAccess.getSingleAssignmentValueAccess().getLeftSquareBracketKeyword_2_1_2_0());
					}
					(
						(
							lv_refIndex_6_0=RULE_INT
							{
								newLeafNode(lv_refIndex_6_0, grammarAccess.getSingleAssignmentValueAccess().getRefIndexINTTerminalRuleCall_2_1_2_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
								}
								setWithLastConsumed(
									$current,
									"refIndex",
									lv_refIndex_6_0,
									"org.eclipse.xtext.common.Terminals.INT");
							}
						)
					)
					otherlv_7=']'
					{
						newLeafNode(otherlv_7, grammarAccess.getSingleAssignmentValueAccess().getRightSquareBracketKeyword_2_1_2_2());
					}
				)?
			)?
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getSingleAssignmentValueAccess().getNewObjectCreatedObjectParserRuleCall_3_0());
				}
				lv_newObject_8_0=ruleCreatedObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSingleAssignmentValueRule());
					}
					set(
						$current,
						"newObject",
						lv_newObject_8_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
						}
					}
					otherlv_9=RULE_ID
					{
						newLeafNode(otherlv_9, grammarAccess.getSingleAssignmentValueAccess().getImportImportCrossReference_4_0_0());
					}
				)
			)
			(
				(
					lv_impFrag_10_0=RULE_FRAGMENT
					{
						newLeafNode(lv_impFrag_10_0, grammarAccess.getSingleAssignmentValueAccess().getImpFragFRAGMENTTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
						}
						setWithLastConsumed(
							$current,
							"impFrag",
							lv_impFrag_10_0,
							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleCreatedObject
entryRuleCreatedObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreatedObjectRule()); }
	iv_ruleCreatedObject=ruleCreatedObject
	{ $current=$iv_ruleCreatedObject.current; }
	EOF;

// Rule CreatedObject
ruleCreatedObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getCreatedObjectAccess().getObjectNewParserRuleCall_0_0());
			}
			this_ObjectNew_0=ruleObjectNew
			{
				$current = $this_ObjectNew_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getCreatedObjectAccess().getObjectCopyParserRuleCall_0_1());
			}
			this_ObjectCopy_1=ruleObjectCopy
			{
				$current = $this_ObjectCopy_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCreatedObjectAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCreatedObjectRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getCreatedObjectAccess().getLeftCurlyBracketKeyword_2_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getCreatedObjectAccess().getAssignmentsMonoSingleAssignmentParserRuleCall_2_1_0_0());
						}
						lv_assignments_4_0=ruleMonoSingleAssignment
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCreatedObjectRule());
							}
							add(
								$current,
								"assignments",
								lv_assignments_4_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.MonoSingleAssignment");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getCreatedObjectAccess().getAssignmentsMonoListAssignmentParserRuleCall_2_1_1_0());
						}
						lv_assignments_5_0=ruleMonoListAssignment
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCreatedObjectRule());
							}
							add(
								$current,
								"assignments",
								lv_assignments_5_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.MonoListAssignment");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
			(
				(
					{
						newCompositeNode(grammarAccess.getCreatedObjectAccess().getLeftMigMigrationParserRuleCall_2_2_0());
					}
					lv_leftMig_6_0=ruleMigration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCreatedObjectRule());
						}
						set(
							$current,
							"leftMig",
							lv_leftMig_6_0,
							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Migration");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getCreatedObjectAccess().getRightCurlyBracketKeyword_2_3());
			}
		)?
	)
;

// Entry rule entryRuleObjectNew
entryRuleObjectNew returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectNewRule()); }
	iv_ruleObjectNew=ruleObjectNew
	{ $current=$iv_ruleObjectNew.current; }
	EOF;

// Rule ObjectNew
ruleObjectNew returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='new'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectNewAccess().getNewKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectNewRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getObjectNewAccess().getImportImportCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_impFrag_2_0=RULE_FRAGMENT
				{
					newLeafNode(lv_impFrag_2_0, grammarAccess.getObjectNewAccess().getImpFragFRAGMENTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectNewRule());
					}
					setWithLastConsumed(
						$current,
						"impFrag",
						lv_impFrag_2_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
				}
			)
		)
	)
;

// Entry rule entryRuleObjectCopy
entryRuleObjectCopy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectCopyRule()); }
	iv_ruleObjectCopy=ruleObjectCopy
	{ $current=$iv_ruleObjectCopy.current; }
	EOF;

// Rule ObjectCopy
ruleObjectCopy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='copy'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectCopyAccess().getCopyKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectCopyRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getObjectCopyAccess().getResourceNamedResourceCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_fragment_2_0=RULE_FRAGMENT
				{
					newLeafNode(lv_fragment_2_0, grammarAccess.getObjectCopyAccess().getFragmentFRAGMENTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectCopyRule());
					}
					setWithLastConsumed(
						$current,
						"fragment",
						lv_fragment_2_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
				}
			)
		)
	)
;

// Entry rule entryRuleMigration
entryRuleMigration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMigrationRule()); }
	iv_ruleMigration=ruleMigration
	{ $current=$iv_ruleMigration.current; }
	EOF;

// Rule Migration
ruleMigration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMigrationAccess().getMigrationAction_0(),
					$current);
			}
		)
		otherlv_1='migrate'
		{
			newLeafNode(otherlv_1, grammarAccess.getMigrationAccess().getMigrateKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMigrationAccess().getFirstExecutableParserRuleCall_2_0());
				}
				lv_first_2_0=ruleExecutable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMigrationRule());
					}
					set(
						$current,
						"first",
						lv_first_2_0,
						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Executable");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				otherlv_3='as'
				{
					newLeafNode(otherlv_3, grammarAccess.getMigrationAccess().getAsKeyword_3_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMigrationAccess().getAsOpExecutableParserRuleCall_3_0_1_0());
						}
						lv_asOp_4_0=ruleExecutable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMigrationRule());
							}
							set(
								$current,
								"asOp",
								lv_asOp_4_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Executable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_5='each'
				{
					newLeafNode(otherlv_5, grammarAccess.getMigrationAccess().getEachKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMigrationAccess().getEachOpExecutableParserRuleCall_3_1_1_0());
						}
						lv_eachOp_6_0=ruleExecutable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMigrationRule());
							}
							set(
								$current,
								"eachOp",
								lv_eachOp_6_0,
								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Executable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)?
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getMigrationAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleExecutable
entryRuleExecutable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExecutableRule()); }
	iv_ruleExecutable=ruleExecutable
	{ $current=$iv_ruleExecutable.current; }
	EOF;

// Rule Executable
ruleExecutable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExecutableAccess().getJavaExecutableParserRuleCall_0());
		}
		this_JavaExecutable_0=ruleJavaExecutable
		{
			$current = $this_JavaExecutable_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExecutableAccess().getExpressionExecutableParserRuleCall_1());
		}
		this_ExpressionExecutable_1=ruleExpressionExecutable
		{
			$current = $this_ExpressionExecutable_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleJavaExecutable
entryRuleJavaExecutable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJavaExecutableRule()); }
	iv_ruleJavaExecutable=ruleJavaExecutable
	{ $current=$iv_ruleJavaExecutable.current; }
	EOF;

// Rule JavaExecutable
ruleJavaExecutable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='java'
		{
			newLeafNode(otherlv_0, grammarAccess.getJavaExecutableAccess().getJavaKeyword_0());
		}
		(
			(
				lv_method_1_0=RULE_ID
				{
					newLeafNode(lv_method_1_0, grammarAccess.getJavaExecutableAccess().getMethodIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJavaExecutableRule());
					}
					setWithLastConsumed(
						$current,
						"method",
						lv_method_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getJavaExecutableAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getJavaExecutableAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleExpressionExecutable
entryRuleExpressionExecutable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionExecutableRule()); }
	iv_ruleExpressionExecutable=ruleExpressionExecutable
	{ $current=$iv_ruleExpressionExecutable.current; }
	EOF;

// Rule ExpressionExecutable
ruleExpressionExecutable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_exprstr_0_0=RULE_STRING
			{
				newLeafNode(lv_exprstr_0_0, grammarAccess.getExpressionExecutableAccess().getExprstrSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getExpressionExecutableRule());
				}
				setWithLastConsumed(
					$current,
					"exprstr",
					lv_exprstr_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

RULE_FRAGMENT : '#' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'/'|'['|']'|'{'|'}'|'.'|'@')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
