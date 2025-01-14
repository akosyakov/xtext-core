/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.epatch.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EpatchTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EPatchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.EPatch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEpatchKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cImportsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cImportsImportParserRuleCall_3_0 = (RuleCall)cImportsAssignment_3.eContents().get(0);
		private final Assignment cResourcesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cResourcesNamedResourceParserRuleCall_4_0 = (RuleCall)cResourcesAssignment_4.eContents().get(0);
		private final Assignment cObjectsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cObjectsObjectRefParserRuleCall_5_0 = (RuleCall)cObjectsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//EPatch:
		//    "epatch" name=ID "{" imports+=Import* resources+=NamedResource* objects+=ObjectRef* "}";
		@Override public ParserRule getRule() { return rule; }
		
		//"epatch" name=ID "{" imports+=Import* resources+=NamedResource* objects+=ObjectRef* "}"
		public Group getGroup() { return cGroup; }
		
		//"epatch"
		public Keyword getEpatchKeyword_0() { return cEpatchKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_3() { return cImportsAssignment_3; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_3_0() { return cImportsImportParserRuleCall_3_0; }
		
		//resources+=NamedResource*
		public Assignment getResourcesAssignment_4() { return cResourcesAssignment_4; }
		
		//NamedResource
		public RuleCall getResourcesNamedResourceParserRuleCall_4_0() { return cResourcesNamedResourceParserRuleCall_4_0; }
		
		//objects+=ObjectRef*
		public Assignment getObjectsAssignment_5() { return cObjectsAssignment_5; }
		
		//ObjectRef
		public RuleCall getObjectsObjectRefParserRuleCall_5_0() { return cObjectsObjectRefParserRuleCall_5_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Import");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cModelImportParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cJavaImportParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cExtensionImportParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Import:
		//    ModelImport | JavaImport | ExtensionImport;
		@Override public ParserRule getRule() { return rule; }
		
		//ModelImport | JavaImport | ExtensionImport
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ModelImport
		public RuleCall getModelImportParserRuleCall_0() { return cModelImportParserRuleCall_0; }
		
		//JavaImport
		public RuleCall getJavaImportParserRuleCall_1() { return cJavaImportParserRuleCall_1; }
		
		//ExtensionImport
		public RuleCall getExtensionImportParserRuleCall_2() { return cExtensionImportParserRuleCall_2; }
	}
	public class ModelImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ModelImport");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cResourceImportParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEPackageImportParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ModelImport:
		//    ResourceImport | EPackageImport;
		@Override public ParserRule getRule() { return rule; }
		
		//ResourceImport | EPackageImport
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ResourceImport
		public RuleCall getResourceImportParserRuleCall_0() { return cResourceImportParserRuleCall_0; }
		
		//EPackageImport
		public RuleCall getEPackageImportParserRuleCall_1() { return cEPackageImportParserRuleCall_1; }
	}
	public class ResourceImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ResourceImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cUriKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cUriAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cUriSTRINGTerminalRuleCall_3_0 = (RuleCall)cUriAssignment_3.eContents().get(0);
		
		//ResourceImport:
		//    "import" name=ID "uri" uri=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//"import" name=ID "uri" uri=STRING
		public Group getGroup() { return cGroup; }
		
		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"uri"
		public Keyword getUriKeyword_2() { return cUriKeyword_2; }
		
		//uri=STRING
		public Assignment getUriAssignment_3() { return cUriAssignment_3; }
		
		//STRING
		public RuleCall getUriSTRINGTerminalRuleCall_3_0() { return cUriSTRINGTerminalRuleCall_3_0; }
	}
	public class EPackageImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.EPackageImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cNsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNsURIAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNsURISTRINGTerminalRuleCall_3_0 = (RuleCall)cNsURIAssignment_3.eContents().get(0);
		
		//EPackageImport:
		//    "import" name=ID "ns" nsURI=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//"import" name=ID "ns" nsURI=STRING
		public Group getGroup() { return cGroup; }
		
		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"ns"
		public Keyword getNsKeyword_2() { return cNsKeyword_2; }
		
		//nsURI=STRING
		public Assignment getNsURIAssignment_3() { return cNsURIAssignment_3; }
		
		//STRING
		public RuleCall getNsURISTRINGTerminalRuleCall_3_0() { return cNsURISTRINGTerminalRuleCall_3_0; }
	}
	public class JavaImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.JavaImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cJavaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPathAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPathIDTerminalRuleCall_2_0 = (RuleCall)cPathAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFullStopKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPathAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPathIDTerminalRuleCall_3_1_0 = (RuleCall)cPathAssignment_3_1.eContents().get(0);
		
		//JavaImport:
		//    "import" "java" path+=ID ("." path+=ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"import" "java" path+=ID ("." path+=ID)*
		public Group getGroup() { return cGroup; }
		
		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//"java"
		public Keyword getJavaKeyword_1() { return cJavaKeyword_1; }
		
		//path+=ID
		public Assignment getPathAssignment_2() { return cPathAssignment_2; }
		
		//ID
		public RuleCall getPathIDTerminalRuleCall_2_0() { return cPathIDTerminalRuleCall_2_0; }
		
		//("." path+=ID)*
		public Group getGroup_3() { return cGroup_3; }
		
		//"."
		public Keyword getFullStopKeyword_3_0() { return cFullStopKeyword_3_0; }
		
		//path+=ID
		public Assignment getPathAssignment_3_1() { return cPathAssignment_3_1; }
		
		//ID
		public RuleCall getPathIDTerminalRuleCall_3_1_0() { return cPathIDTerminalRuleCall_3_1_0; }
	}
	public class ExtensionImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ExtensionImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cExtensionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPathAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPathIDTerminalRuleCall_2_0 = (RuleCall)cPathAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColonColonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPathAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPathIDTerminalRuleCall_3_1_0 = (RuleCall)cPathAssignment_3_1.eContents().get(0);
		
		//ExtensionImport:
		//    "import" "extension" path+=ID ("::" path+=ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"import" "extension" path+=ID ("::" path+=ID)*
		public Group getGroup() { return cGroup; }
		
		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//"extension"
		public Keyword getExtensionKeyword_1() { return cExtensionKeyword_1; }
		
		//path+=ID
		public Assignment getPathAssignment_2() { return cPathAssignment_2; }
		
		//ID
		public RuleCall getPathIDTerminalRuleCall_2_0() { return cPathIDTerminalRuleCall_2_0; }
		
		//("::" path+=ID)*
		public Group getGroup_3() { return cGroup_3; }
		
		//"::"
		public Keyword getColonColonKeyword_3_0() { return cColonColonKeyword_3_0; }
		
		//path+=ID
		public Assignment getPathAssignment_3_1() { return cPathAssignment_3_1; }
		
		//ID
		public RuleCall getPathIDTerminalRuleCall_3_1_0() { return cPathIDTerminalRuleCall_3_1_0; }
	}
	public class NamedResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.NamedResource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cResourceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Keyword cUriKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Assignment cLeftUriAssignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final RuleCall cLeftUriSTRINGTerminalRuleCall_4_0_1_0 = (RuleCall)cLeftUriAssignment_4_0_1.eContents().get(0);
		private final Assignment cLeftRootAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cLeftRootCreatedObjectParserRuleCall_4_1_0 = (RuleCall)cLeftRootAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Alternatives cAlternatives_7 = (Alternatives)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cAlternatives_7.eContents().get(0);
		private final Keyword cUriKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cRightUriAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final RuleCall cRightUriSTRINGTerminalRuleCall_7_0_1_0 = (RuleCall)cRightUriAssignment_7_0_1.eContents().get(0);
		private final Assignment cRightRootAssignment_7_1 = (Assignment)cAlternatives_7.eContents().get(1);
		private final RuleCall cRightRootCreatedObjectParserRuleCall_7_1_0 = (RuleCall)cRightRootAssignment_7_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//NamedResource:
		//    "resource" name=ID "{"
		//        "left" ("uri" leftUri=STRING | leftRoot=CreatedObject) ";"
		//        "right" ("uri" rightUri=STRING | rightRoot=CreatedObject) ";"
		//    "}";
		@Override public ParserRule getRule() { return rule; }
		
		//"resource" name=ID "{"
		//    "left" ("uri" leftUri=STRING | leftRoot=CreatedObject) ";"
		//    "right" ("uri" rightUri=STRING | rightRoot=CreatedObject) ";"
		//"}"
		public Group getGroup() { return cGroup; }
		
		//"resource"
		public Keyword getResourceKeyword_0() { return cResourceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//"left"
		public Keyword getLeftKeyword_3() { return cLeftKeyword_3; }
		
		//("uri" leftUri=STRING | leftRoot=CreatedObject)
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//"uri" leftUri=STRING
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//"uri"
		public Keyword getUriKeyword_4_0_0() { return cUriKeyword_4_0_0; }
		
		//leftUri=STRING
		public Assignment getLeftUriAssignment_4_0_1() { return cLeftUriAssignment_4_0_1; }
		
		//STRING
		public RuleCall getLeftUriSTRINGTerminalRuleCall_4_0_1_0() { return cLeftUriSTRINGTerminalRuleCall_4_0_1_0; }
		
		//leftRoot=CreatedObject
		public Assignment getLeftRootAssignment_4_1() { return cLeftRootAssignment_4_1; }
		
		//CreatedObject
		public RuleCall getLeftRootCreatedObjectParserRuleCall_4_1_0() { return cLeftRootCreatedObjectParserRuleCall_4_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//"right"
		public Keyword getRightKeyword_6() { return cRightKeyword_6; }
		
		//("uri" rightUri=STRING | rightRoot=CreatedObject)
		public Alternatives getAlternatives_7() { return cAlternatives_7; }
		
		//"uri" rightUri=STRING
		public Group getGroup_7_0() { return cGroup_7_0; }
		
		//"uri"
		public Keyword getUriKeyword_7_0_0() { return cUriKeyword_7_0_0; }
		
		//rightUri=STRING
		public Assignment getRightUriAssignment_7_0_1() { return cRightUriAssignment_7_0_1; }
		
		//STRING
		public RuleCall getRightUriSTRINGTerminalRuleCall_7_0_1_0() { return cRightUriSTRINGTerminalRuleCall_7_0_1_0; }
		
		//rightRoot=CreatedObject
		public Assignment getRightRootAssignment_7_1() { return cRightRootAssignment_7_1; }
		
		//CreatedObject
		public RuleCall getRightRootCreatedObjectParserRuleCall_7_1_0() { return cRightRootCreatedObjectParserRuleCall_7_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class NamedObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.NamedObject");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cObjectRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCreatedObjectParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//NamedObject: ObjectRef | CreatedObject;
		@Override public ParserRule getRule() { return rule; }
		
		//ObjectRef | CreatedObject
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ObjectRef
		public RuleCall getObjectRefParserRuleCall_0() { return cObjectRefParserRuleCall_0; }
		
		//CreatedObject
		public RuleCall getCreatedObjectParserRuleCall_1() { return cCreatedObjectParserRuleCall_1; }
	}
	public class ObjectRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ObjectRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Assignment cLeftResAssignment_2_0_0 = (Assignment)cGroup_2_0.eContents().get(0);
		private final CrossReference cLeftResNamedResourceCrossReference_2_0_0_0 = (CrossReference)cLeftResAssignment_2_0_0.eContents().get(0);
		private final RuleCall cLeftResNamedResourceIDTerminalRuleCall_2_0_0_0_1 = (RuleCall)cLeftResNamedResourceCrossReference_2_0_0_0.eContents().get(1);
		private final Assignment cLeftFragAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cLeftFragFRAGMENTTerminalRuleCall_2_0_1_0 = (RuleCall)cLeftFragAssignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cLeftKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cLeftResAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cLeftResNamedResourceCrossReference_2_1_1_0 = (CrossReference)cLeftResAssignment_2_1_1.eContents().get(0);
		private final RuleCall cLeftResNamedResourceIDTerminalRuleCall_2_1_1_0_1 = (RuleCall)cLeftResNamedResourceCrossReference_2_1_1_0.eContents().get(1);
		private final Assignment cLeftFragAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cLeftFragFRAGMENTTerminalRuleCall_2_1_2_0 = (RuleCall)cLeftFragAssignment_2_1_2.eContents().get(0);
		private final Keyword cRightKeyword_2_1_3 = (Keyword)cGroup_2_1.eContents().get(3);
		private final Assignment cRightResAssignment_2_1_4 = (Assignment)cGroup_2_1.eContents().get(4);
		private final CrossReference cRightResNamedResourceCrossReference_2_1_4_0 = (CrossReference)cRightResAssignment_2_1_4.eContents().get(0);
		private final RuleCall cRightResNamedResourceIDTerminalRuleCall_2_1_4_0_1 = (RuleCall)cRightResNamedResourceCrossReference_2_1_4_0.eContents().get(1);
		private final Assignment cRightFragAssignment_2_1_5 = (Assignment)cGroup_2_1.eContents().get(5);
		private final RuleCall cRightFragFRAGMENTTerminalRuleCall_2_1_5_0 = (RuleCall)cRightFragAssignment_2_1_5.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Alternatives cAlternatives_3_1 = (Alternatives)cGroup_3.eContents().get(1);
		private final Assignment cAssignmentsAssignment_3_1_0 = (Assignment)cAlternatives_3_1.eContents().get(0);
		private final RuleCall cAssignmentsBiSingleAssignmentParserRuleCall_3_1_0_0 = (RuleCall)cAssignmentsAssignment_3_1_0.eContents().get(0);
		private final Assignment cAssignmentsAssignment_3_1_1 = (Assignment)cAlternatives_3_1.eContents().get(1);
		private final RuleCall cAssignmentsBiListAssignmentParserRuleCall_3_1_1_0 = (RuleCall)cAssignmentsAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cLeftKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cLeftMigAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cLeftMigMigrationParserRuleCall_3_2_1_0 = (RuleCall)cLeftMigAssignment_3_2_1.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cRightKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cRightMigAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cRightMigMigrationParserRuleCall_3_3_1_0 = (RuleCall)cRightMigAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		
		//ObjectRef:
		//    "object" name=ID? (
		//        (leftRes=[NamedResource] leftFrag=FRAGMENT) |
		//        ("left" leftRes=[NamedResource] leftFrag=FRAGMENT "right" rightRes=[NamedResource] rightFrag=FRAGMENT)
		//    )
		//    ( "{"
		//        (assignments+=BiSingleAssignment|assignments+=BiListAssignment)+
		//        ("left" leftMig=Migration)?
		//        ("right" rightMig=Migration)?
		//    "}" )?;
		@Override public ParserRule getRule() { return rule; }
		
		//"object" name=ID? (
		//    (leftRes=[NamedResource] leftFrag=FRAGMENT) |
		//    ("left" leftRes=[NamedResource] leftFrag=FRAGMENT "right" rightRes=[NamedResource] rightFrag=FRAGMENT)
		//)
		//( "{"
		//    (assignments+=BiSingleAssignment|assignments+=BiListAssignment)+
		//    ("left" leftMig=Migration)?
		//    ("right" rightMig=Migration)?
		//"}" )?
		public Group getGroup() { return cGroup; }
		
		//"object"
		public Keyword getObjectKeyword_0() { return cObjectKeyword_0; }
		
		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(
		//       (leftRes=[NamedResource] leftFrag=FRAGMENT) |
		//       ("left" leftRes=[NamedResource] leftFrag=FRAGMENT "right" rightRes=[NamedResource] rightFrag=FRAGMENT)
		//   )
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//(leftRes=[NamedResource] leftFrag=FRAGMENT)
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//leftRes=[NamedResource]
		public Assignment getLeftResAssignment_2_0_0() { return cLeftResAssignment_2_0_0; }
		
		//[NamedResource]
		public CrossReference getLeftResNamedResourceCrossReference_2_0_0_0() { return cLeftResNamedResourceCrossReference_2_0_0_0; }
		
		//ID
		public RuleCall getLeftResNamedResourceIDTerminalRuleCall_2_0_0_0_1() { return cLeftResNamedResourceIDTerminalRuleCall_2_0_0_0_1; }
		
		//leftFrag=FRAGMENT
		public Assignment getLeftFragAssignment_2_0_1() { return cLeftFragAssignment_2_0_1; }
		
		//FRAGMENT
		public RuleCall getLeftFragFRAGMENTTerminalRuleCall_2_0_1_0() { return cLeftFragFRAGMENTTerminalRuleCall_2_0_1_0; }
		
		//("left" leftRes=[NamedResource] leftFrag=FRAGMENT "right" rightRes=[NamedResource] rightFrag=FRAGMENT)
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//"left"
		public Keyword getLeftKeyword_2_1_0() { return cLeftKeyword_2_1_0; }
		
		//leftRes=[NamedResource]
		public Assignment getLeftResAssignment_2_1_1() { return cLeftResAssignment_2_1_1; }
		
		//[NamedResource]
		public CrossReference getLeftResNamedResourceCrossReference_2_1_1_0() { return cLeftResNamedResourceCrossReference_2_1_1_0; }
		
		//ID
		public RuleCall getLeftResNamedResourceIDTerminalRuleCall_2_1_1_0_1() { return cLeftResNamedResourceIDTerminalRuleCall_2_1_1_0_1; }
		
		//leftFrag=FRAGMENT
		public Assignment getLeftFragAssignment_2_1_2() { return cLeftFragAssignment_2_1_2; }
		
		//FRAGMENT
		public RuleCall getLeftFragFRAGMENTTerminalRuleCall_2_1_2_0() { return cLeftFragFRAGMENTTerminalRuleCall_2_1_2_0; }
		
		//"right"
		public Keyword getRightKeyword_2_1_3() { return cRightKeyword_2_1_3; }
		
		//rightRes=[NamedResource]
		public Assignment getRightResAssignment_2_1_4() { return cRightResAssignment_2_1_4; }
		
		//[NamedResource]
		public CrossReference getRightResNamedResourceCrossReference_2_1_4_0() { return cRightResNamedResourceCrossReference_2_1_4_0; }
		
		//ID
		public RuleCall getRightResNamedResourceIDTerminalRuleCall_2_1_4_0_1() { return cRightResNamedResourceIDTerminalRuleCall_2_1_4_0_1; }
		
		//rightFrag=FRAGMENT
		public Assignment getRightFragAssignment_2_1_5() { return cRightFragAssignment_2_1_5; }
		
		//FRAGMENT
		public RuleCall getRightFragFRAGMENTTerminalRuleCall_2_1_5_0() { return cRightFragFRAGMENTTerminalRuleCall_2_1_5_0; }
		
		//( "{"
		//    (assignments+=BiSingleAssignment|assignments+=BiListAssignment)+
		//    ("left" leftMig=Migration)?
		//    ("right" rightMig=Migration)?
		//"}" )?
		public Group getGroup_3() { return cGroup_3; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }
		
		//(assignments+=BiSingleAssignment|assignments+=BiListAssignment)+
		public Alternatives getAlternatives_3_1() { return cAlternatives_3_1; }
		
		//assignments+=BiSingleAssignment
		public Assignment getAssignmentsAssignment_3_1_0() { return cAssignmentsAssignment_3_1_0; }
		
		//BiSingleAssignment
		public RuleCall getAssignmentsBiSingleAssignmentParserRuleCall_3_1_0_0() { return cAssignmentsBiSingleAssignmentParserRuleCall_3_1_0_0; }
		
		//assignments+=BiListAssignment
		public Assignment getAssignmentsAssignment_3_1_1() { return cAssignmentsAssignment_3_1_1; }
		
		//BiListAssignment
		public RuleCall getAssignmentsBiListAssignmentParserRuleCall_3_1_1_0() { return cAssignmentsBiListAssignmentParserRuleCall_3_1_1_0; }
		
		//("left" leftMig=Migration)?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//"left"
		public Keyword getLeftKeyword_3_2_0() { return cLeftKeyword_3_2_0; }
		
		//leftMig=Migration
		public Assignment getLeftMigAssignment_3_2_1() { return cLeftMigAssignment_3_2_1; }
		
		//Migration
		public RuleCall getLeftMigMigrationParserRuleCall_3_2_1_0() { return cLeftMigMigrationParserRuleCall_3_2_1_0; }
		
		//("right" rightMig=Migration)?
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//"right"
		public Keyword getRightKeyword_3_3_0() { return cRightKeyword_3_3_0; }
		
		//rightMig=Migration
		public Assignment getRightMigAssignment_3_3_1() { return cRightMigAssignment_3_3_1; }
		
		//Migration
		public RuleCall getRightMigMigrationParserRuleCall_3_3_1_0() { return cRightMigMigrationParserRuleCall_3_3_1_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
	}
	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Assignment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBiSingleAssignmentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBiListAssignmentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMonoSingleAssignmentParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMonoListAssignmentParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Assignment returns Assignment:
		//    BiSingleAssignment | BiListAssignment | MonoSingleAssignment | MonoListAssignment;
		@Override public ParserRule getRule() { return rule; }
		
		//BiSingleAssignment | BiListAssignment | MonoSingleAssignment | MonoListAssignment
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BiSingleAssignment
		public RuleCall getBiSingleAssignmentParserRuleCall_0() { return cBiSingleAssignmentParserRuleCall_0; }
		
		//BiListAssignment
		public RuleCall getBiListAssignmentParserRuleCall_1() { return cBiListAssignmentParserRuleCall_1; }
		
		//MonoSingleAssignment
		public RuleCall getMonoSingleAssignmentParserRuleCall_2() { return cMonoSingleAssignmentParserRuleCall_2; }
		
		//MonoListAssignment
		public RuleCall getMonoListAssignmentParserRuleCall_3() { return cMonoListAssignmentParserRuleCall_3; }
	}
	public class BiSingleAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.BiSingleAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFeatureIDTerminalRuleCall_0_0 = (RuleCall)cFeatureAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLeftValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLeftValueSingleAssignmentValueParserRuleCall_2_0 = (RuleCall)cLeftValueAssignment_2.eContents().get(0);
		private final Keyword cVerticalLineKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRightValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRightValueSingleAssignmentValueParserRuleCall_4_0 = (RuleCall)cRightValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//BiSingleAssignment returns SingleAssignment:
		//    feature=ID "=" leftValue=SingleAssignmentValue "|" rightValue=SingleAssignmentValue ";";
		@Override public ParserRule getRule() { return rule; }
		
		//feature=ID "=" leftValue=SingleAssignmentValue "|" rightValue=SingleAssignmentValue ";"
		public Group getGroup() { return cGroup; }
		
		//feature=ID
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//ID
		public RuleCall getFeatureIDTerminalRuleCall_0_0() { return cFeatureIDTerminalRuleCall_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//leftValue=SingleAssignmentValue
		public Assignment getLeftValueAssignment_2() { return cLeftValueAssignment_2; }
		
		//SingleAssignmentValue
		public RuleCall getLeftValueSingleAssignmentValueParserRuleCall_2_0() { return cLeftValueSingleAssignmentValueParserRuleCall_2_0; }
		
		//"|"
		public Keyword getVerticalLineKeyword_3() { return cVerticalLineKeyword_3; }
		
		//rightValue=SingleAssignmentValue
		public Assignment getRightValueAssignment_4() { return cRightValueAssignment_4; }
		
		//SingleAssignmentValue
		public RuleCall getRightValueSingleAssignmentValueParserRuleCall_4_0() { return cRightValueSingleAssignmentValueParserRuleCall_4_0; }
		
		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class BiListAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.BiListAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFeatureIDTerminalRuleCall_0_0 = (RuleCall)cFeatureAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cLeftValuesAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cLeftValuesListAssignmentValueParserRuleCall_3_0_0 = (RuleCall)cLeftValuesAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cLeftValuesAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cLeftValuesListAssignmentValueParserRuleCall_3_1_1_0 = (RuleCall)cLeftValuesAssignment_3_1_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cRightValuesAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cRightValuesListAssignmentValueParserRuleCall_5_0_0 = (RuleCall)cRightValuesAssignment_5_0.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Keyword cCommaKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cRightValuesAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cRightValuesListAssignmentValueParserRuleCall_5_1_1_0 = (RuleCall)cRightValuesAssignment_5_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//BiListAssignment returns ListAssignment:
		//    feature=ID "=" "[" (leftValues+=ListAssignmentValue ("," leftValues+=ListAssignmentValue)*)? "|" (rightValues+=ListAssignmentValue ("," rightValues+=ListAssignmentValue)*)? "]" ";";
		@Override public ParserRule getRule() { return rule; }
		
		//feature=ID "=" "[" (leftValues+=ListAssignmentValue ("," leftValues+=ListAssignmentValue)*)? "|" (rightValues+=ListAssignmentValue ("," rightValues+=ListAssignmentValue)*)? "]" ";"
		public Group getGroup() { return cGroup; }
		
		//feature=ID
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//ID
		public RuleCall getFeatureIDTerminalRuleCall_0_0() { return cFeatureIDTerminalRuleCall_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }
		
		//(leftValues+=ListAssignmentValue ("," leftValues+=ListAssignmentValue)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//leftValues+=ListAssignmentValue
		public Assignment getLeftValuesAssignment_3_0() { return cLeftValuesAssignment_3_0; }
		
		//ListAssignmentValue
		public RuleCall getLeftValuesListAssignmentValueParserRuleCall_3_0_0() { return cLeftValuesListAssignmentValueParserRuleCall_3_0_0; }
		
		//("," leftValues+=ListAssignmentValue)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//leftValues+=ListAssignmentValue
		public Assignment getLeftValuesAssignment_3_1_1() { return cLeftValuesAssignment_3_1_1; }
		
		//ListAssignmentValue
		public RuleCall getLeftValuesListAssignmentValueParserRuleCall_3_1_1_0() { return cLeftValuesListAssignmentValueParserRuleCall_3_1_1_0; }
		
		//"|"
		public Keyword getVerticalLineKeyword_4() { return cVerticalLineKeyword_4; }
		
		//(rightValues+=ListAssignmentValue ("," rightValues+=ListAssignmentValue)*)?
		public Group getGroup_5() { return cGroup_5; }
		
		//rightValues+=ListAssignmentValue
		public Assignment getRightValuesAssignment_5_0() { return cRightValuesAssignment_5_0; }
		
		//ListAssignmentValue
		public RuleCall getRightValuesListAssignmentValueParserRuleCall_5_0_0() { return cRightValuesListAssignmentValueParserRuleCall_5_0_0; }
		
		//("," rightValues+=ListAssignmentValue)*
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//","
		public Keyword getCommaKeyword_5_1_0() { return cCommaKeyword_5_1_0; }
		
		//rightValues+=ListAssignmentValue
		public Assignment getRightValuesAssignment_5_1_1() { return cRightValuesAssignment_5_1_1; }
		
		//ListAssignmentValue
		public RuleCall getRightValuesListAssignmentValueParserRuleCall_5_1_1_0() { return cRightValuesListAssignmentValueParserRuleCall_5_1_1_0; }
		
		//"]"
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }
		
		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class MonoSingleAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.MonoSingleAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFeatureIDTerminalRuleCall_0_0 = (RuleCall)cFeatureAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLeftValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLeftValueSingleAssignmentValueParserRuleCall_2_0 = (RuleCall)cLeftValueAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//MonoSingleAssignment returns SingleAssignment:
		//    feature=ID "=" leftValue=SingleAssignmentValue ";";
		@Override public ParserRule getRule() { return rule; }
		
		//feature=ID "=" leftValue=SingleAssignmentValue ";"
		public Group getGroup() { return cGroup; }
		
		//feature=ID
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//ID
		public RuleCall getFeatureIDTerminalRuleCall_0_0() { return cFeatureIDTerminalRuleCall_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//leftValue=SingleAssignmentValue
		public Assignment getLeftValueAssignment_2() { return cLeftValueAssignment_2; }
		
		//SingleAssignmentValue
		public RuleCall getLeftValueSingleAssignmentValueParserRuleCall_2_0() { return cLeftValueSingleAssignmentValueParserRuleCall_2_0; }
		
		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class MonoListAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.MonoListAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFeatureIDTerminalRuleCall_0_0 = (RuleCall)cFeatureAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cLeftValuesAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cLeftValuesAssignmentValueParserRuleCall_3_0_0 = (RuleCall)cLeftValuesAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cLeftValuesAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cLeftValuesAssignmentValueParserRuleCall_3_1_1_0 = (RuleCall)cLeftValuesAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MonoListAssignment returns ListAssignment:
		//    feature=ID "=" "[" (leftValues+=AssignmentValue ("," leftValues+=AssignmentValue)*)? "]" ";";
		@Override public ParserRule getRule() { return rule; }
		
		//feature=ID "=" "[" (leftValues+=AssignmentValue ("," leftValues+=AssignmentValue)*)? "]" ";"
		public Group getGroup() { return cGroup; }
		
		//feature=ID
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//ID
		public RuleCall getFeatureIDTerminalRuleCall_0_0() { return cFeatureIDTerminalRuleCall_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }
		
		//(leftValues+=AssignmentValue ("," leftValues+=AssignmentValue)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//leftValues+=AssignmentValue
		public Assignment getLeftValuesAssignment_3_0() { return cLeftValuesAssignment_3_0; }
		
		//AssignmentValue
		public RuleCall getLeftValuesAssignmentValueParserRuleCall_3_0_0() { return cLeftValuesAssignmentValueParserRuleCall_3_0_0; }
		
		//("," leftValues+=AssignmentValue)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//leftValues+=AssignmentValue
		public Assignment getLeftValuesAssignment_3_1_1() { return cLeftValuesAssignment_3_1_1; }
		
		//AssignmentValue
		public RuleCall getLeftValuesAssignmentValueParserRuleCall_3_1_1_0() { return cLeftValuesAssignmentValueParserRuleCall_3_1_1_0; }
		
		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
		
		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class AssignmentValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.AssignmentValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cRefObjectAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final CrossReference cRefObjectNamedObjectCrossReference_1_0_0 = (CrossReference)cRefObjectAssignment_1_0.eContents().get(0);
		private final RuleCall cRefObjectNamedObjectIDTerminalRuleCall_1_0_0_1 = (RuleCall)cRefObjectNamedObjectCrossReference_1_0_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cFullStopKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cRefFeatureAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cRefFeatureIDTerminalRuleCall_1_1_1_0 = (RuleCall)cRefFeatureAssignment_1_1_1.eContents().get(0);
		private final Group cGroup_1_1_2 = (Group)cGroup_1_1.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_1_1_2_0 = (Keyword)cGroup_1_1_2.eContents().get(0);
		private final Assignment cRefIndexAssignment_1_1_2_1 = (Assignment)cGroup_1_1_2.eContents().get(1);
		private final RuleCall cRefIndexINTTerminalRuleCall_1_1_2_1_0 = (RuleCall)cRefIndexAssignment_1_1_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_1_2_2 = (Keyword)cGroup_1_1_2.eContents().get(2);
		private final Assignment cNewObjectAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cNewObjectCreatedObjectParserRuleCall_2_0 = (RuleCall)cNewObjectAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Assignment cImportAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final CrossReference cImportImportCrossReference_3_0_0 = (CrossReference)cImportAssignment_3_0.eContents().get(0);
		private final RuleCall cImportImportIDTerminalRuleCall_3_0_0_1 = (RuleCall)cImportImportCrossReference_3_0_0.eContents().get(1);
		private final Assignment cImpFragAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cImpFragFRAGMENTTerminalRuleCall_3_1_0 = (RuleCall)cImpFragAssignment_3_1.eContents().get(0);
		
		//AssignmentValue returns AssignmentValue:
		//    value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT);
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//value=STRING
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0_0() { return cValueSTRINGTerminalRuleCall_0_0; }
		
		//(refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?)
		public Group getGroup_1() { return cGroup_1; }
		
		//refObject=[NamedObject]
		public Assignment getRefObjectAssignment_1_0() { return cRefObjectAssignment_1_0; }
		
		//[NamedObject]
		public CrossReference getRefObjectNamedObjectCrossReference_1_0_0() { return cRefObjectNamedObjectCrossReference_1_0_0; }
		
		//ID
		public RuleCall getRefObjectNamedObjectIDTerminalRuleCall_1_0_0_1() { return cRefObjectNamedObjectIDTerminalRuleCall_1_0_0_1; }
		
		//("." refFeature=ID ("[" refIndex=INT "]")?)?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"."
		public Keyword getFullStopKeyword_1_1_0() { return cFullStopKeyword_1_1_0; }
		
		//refFeature=ID
		public Assignment getRefFeatureAssignment_1_1_1() { return cRefFeatureAssignment_1_1_1; }
		
		//ID
		public RuleCall getRefFeatureIDTerminalRuleCall_1_1_1_0() { return cRefFeatureIDTerminalRuleCall_1_1_1_0; }
		
		//("[" refIndex=INT "]")?
		public Group getGroup_1_1_2() { return cGroup_1_1_2; }
		
		//"["
		public Keyword getLeftSquareBracketKeyword_1_1_2_0() { return cLeftSquareBracketKeyword_1_1_2_0; }
		
		//refIndex=INT
		public Assignment getRefIndexAssignment_1_1_2_1() { return cRefIndexAssignment_1_1_2_1; }
		
		//INT
		public RuleCall getRefIndexINTTerminalRuleCall_1_1_2_1_0() { return cRefIndexINTTerminalRuleCall_1_1_2_1_0; }
		
		//"]"
		public Keyword getRightSquareBracketKeyword_1_1_2_2() { return cRightSquareBracketKeyword_1_1_2_2; }
		
		//newObject=CreatedObject
		public Assignment getNewObjectAssignment_2() { return cNewObjectAssignment_2; }
		
		//CreatedObject
		public RuleCall getNewObjectCreatedObjectParserRuleCall_2_0() { return cNewObjectCreatedObjectParserRuleCall_2_0; }
		
		//(^import=[Import] impFrag=FRAGMENT)
		public Group getGroup_3() { return cGroup_3; }
		
		//^import=[Import]
		public Assignment getImportAssignment_3_0() { return cImportAssignment_3_0; }
		
		//[Import]
		public CrossReference getImportImportCrossReference_3_0_0() { return cImportImportCrossReference_3_0_0; }
		
		//ID
		public RuleCall getImportImportIDTerminalRuleCall_3_0_0_1() { return cImportImportIDTerminalRuleCall_3_0_0_1; }
		
		//impFrag=FRAGMENT
		public Assignment getImpFragAssignment_3_1() { return cImpFragAssignment_3_1; }
		
		//FRAGMENT
		public RuleCall getImpFragFRAGMENTTerminalRuleCall_3_1_0() { return cImpFragFRAGMENTTerminalRuleCall_3_1_0; }
	}
	public class ListAssignmentValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ListAssignmentValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIndexAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIndexINTTerminalRuleCall_0_0 = (RuleCall)cIndexAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cRefIndexAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cRefIndexINTTerminalRuleCall_2_0_1_0 = (RuleCall)cRefIndexAssignment_2_0_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_0_2 = (Keyword)cGroup_2_0.eContents().get(2);
		private final Assignment cValueAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cAlternatives_2.eContents().get(2);
		private final Assignment cRefObjectAssignment_2_2_0 = (Assignment)cGroup_2_2.eContents().get(0);
		private final CrossReference cRefObjectNamedObjectCrossReference_2_2_0_0 = (CrossReference)cRefObjectAssignment_2_2_0.eContents().get(0);
		private final RuleCall cRefObjectNamedObjectIDTerminalRuleCall_2_2_0_0_1 = (RuleCall)cRefObjectNamedObjectCrossReference_2_2_0_0.eContents().get(1);
		private final Group cGroup_2_2_1 = (Group)cGroup_2_2.eContents().get(1);
		private final Keyword cFullStopKeyword_2_2_1_0 = (Keyword)cGroup_2_2_1.eContents().get(0);
		private final Assignment cRefFeatureAssignment_2_2_1_1 = (Assignment)cGroup_2_2_1.eContents().get(1);
		private final RuleCall cRefFeatureIDTerminalRuleCall_2_2_1_1_0 = (RuleCall)cRefFeatureAssignment_2_2_1_1.eContents().get(0);
		private final Group cGroup_2_2_1_2 = (Group)cGroup_2_2_1.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_2_1_2_0 = (Keyword)cGroup_2_2_1_2.eContents().get(0);
		private final Assignment cRefIndexAssignment_2_2_1_2_1 = (Assignment)cGroup_2_2_1_2.eContents().get(1);
		private final RuleCall cRefIndexINTTerminalRuleCall_2_2_1_2_1_0 = (RuleCall)cRefIndexAssignment_2_2_1_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2_1_2_2 = (Keyword)cGroup_2_2_1_2.eContents().get(2);
		private final Assignment cNewObjectAssignment_2_3 = (Assignment)cAlternatives_2.eContents().get(3);
		private final RuleCall cNewObjectCreatedObjectParserRuleCall_2_3_0 = (RuleCall)cNewObjectAssignment_2_3.eContents().get(0);
		private final Group cGroup_2_4 = (Group)cAlternatives_2.eContents().get(4);
		private final Assignment cImportAssignment_2_4_0 = (Assignment)cGroup_2_4.eContents().get(0);
		private final CrossReference cImportImportCrossReference_2_4_0_0 = (CrossReference)cImportAssignment_2_4_0.eContents().get(0);
		private final RuleCall cImportImportIDTerminalRuleCall_2_4_0_0_1 = (RuleCall)cImportImportCrossReference_2_4_0_0.eContents().get(1);
		private final Assignment cImpFragAssignment_2_4_1 = (Assignment)cGroup_2_4.eContents().get(1);
		private final RuleCall cImpFragFRAGMENTTerminalRuleCall_2_4_1_0 = (RuleCall)cImpFragAssignment_2_4_1.eContents().get(0);
		
		//ListAssignmentValue returns AssignmentValue:
		//     index=INT ":" (("[" refIndex=INT "]") | value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT));
		@Override public ParserRule getRule() { return rule; }
		
		//index=INT ":" (("[" refIndex=INT "]") | value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT))
		public Group getGroup() { return cGroup; }
		
		//index=INT
		public Assignment getIndexAssignment_0() { return cIndexAssignment_0; }
		
		//INT
		public RuleCall getIndexINTTerminalRuleCall_0_0() { return cIndexINTTerminalRuleCall_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//(("[" refIndex=INT "]") | value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT))
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//("[" refIndex=INT "]")
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//"["
		public Keyword getLeftSquareBracketKeyword_2_0_0() { return cLeftSquareBracketKeyword_2_0_0; }
		
		//refIndex=INT
		public Assignment getRefIndexAssignment_2_0_1() { return cRefIndexAssignment_2_0_1; }
		
		//INT
		public RuleCall getRefIndexINTTerminalRuleCall_2_0_1_0() { return cRefIndexINTTerminalRuleCall_2_0_1_0; }
		
		//"]"
		public Keyword getRightSquareBracketKeyword_2_0_2() { return cRightSquareBracketKeyword_2_0_2; }
		
		//value=STRING
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_1_0() { return cValueSTRINGTerminalRuleCall_2_1_0; }
		
		//(refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?)
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//refObject=[NamedObject]
		public Assignment getRefObjectAssignment_2_2_0() { return cRefObjectAssignment_2_2_0; }
		
		//[NamedObject]
		public CrossReference getRefObjectNamedObjectCrossReference_2_2_0_0() { return cRefObjectNamedObjectCrossReference_2_2_0_0; }
		
		//ID
		public RuleCall getRefObjectNamedObjectIDTerminalRuleCall_2_2_0_0_1() { return cRefObjectNamedObjectIDTerminalRuleCall_2_2_0_0_1; }
		
		//("." refFeature=ID ("[" refIndex=INT "]")?)?
		public Group getGroup_2_2_1() { return cGroup_2_2_1; }
		
		//"."
		public Keyword getFullStopKeyword_2_2_1_0() { return cFullStopKeyword_2_2_1_0; }
		
		//refFeature=ID
		public Assignment getRefFeatureAssignment_2_2_1_1() { return cRefFeatureAssignment_2_2_1_1; }
		
		//ID
		public RuleCall getRefFeatureIDTerminalRuleCall_2_2_1_1_0() { return cRefFeatureIDTerminalRuleCall_2_2_1_1_0; }
		
		//("[" refIndex=INT "]")?
		public Group getGroup_2_2_1_2() { return cGroup_2_2_1_2; }
		
		//"["
		public Keyword getLeftSquareBracketKeyword_2_2_1_2_0() { return cLeftSquareBracketKeyword_2_2_1_2_0; }
		
		//refIndex=INT
		public Assignment getRefIndexAssignment_2_2_1_2_1() { return cRefIndexAssignment_2_2_1_2_1; }
		
		//INT
		public RuleCall getRefIndexINTTerminalRuleCall_2_2_1_2_1_0() { return cRefIndexINTTerminalRuleCall_2_2_1_2_1_0; }
		
		//"]"
		public Keyword getRightSquareBracketKeyword_2_2_1_2_2() { return cRightSquareBracketKeyword_2_2_1_2_2; }
		
		//newObject=CreatedObject
		public Assignment getNewObjectAssignment_2_3() { return cNewObjectAssignment_2_3; }
		
		//CreatedObject
		public RuleCall getNewObjectCreatedObjectParserRuleCall_2_3_0() { return cNewObjectCreatedObjectParserRuleCall_2_3_0; }
		
		//(^import=[Import] impFrag=FRAGMENT)
		public Group getGroup_2_4() { return cGroup_2_4; }
		
		//^import=[Import]
		public Assignment getImportAssignment_2_4_0() { return cImportAssignment_2_4_0; }
		
		//[Import]
		public CrossReference getImportImportCrossReference_2_4_0_0() { return cImportImportCrossReference_2_4_0_0; }
		
		//ID
		public RuleCall getImportImportIDTerminalRuleCall_2_4_0_0_1() { return cImportImportIDTerminalRuleCall_2_4_0_0_1; }
		
		//impFrag=FRAGMENT
		public Assignment getImpFragAssignment_2_4_1() { return cImpFragAssignment_2_4_1; }
		
		//FRAGMENT
		public RuleCall getImpFragFRAGMENTTerminalRuleCall_2_4_1_0() { return cImpFragFRAGMENTTerminalRuleCall_2_4_1_0; }
	}
	public class SingleAssignmentValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.SingleAssignmentValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cKeywordAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cKeywordNullKeyword_0_0 = (Keyword)cKeywordAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Assignment cRefObjectAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final CrossReference cRefObjectNamedObjectCrossReference_2_0_0 = (CrossReference)cRefObjectAssignment_2_0.eContents().get(0);
		private final RuleCall cRefObjectNamedObjectIDTerminalRuleCall_2_0_0_1 = (RuleCall)cRefObjectNamedObjectCrossReference_2_0_0.eContents().get(1);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cFullStopKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cRefFeatureAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cRefFeatureIDTerminalRuleCall_2_1_1_0 = (RuleCall)cRefFeatureAssignment_2_1_1.eContents().get(0);
		private final Group cGroup_2_1_2 = (Group)cGroup_2_1.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_1_2_0 = (Keyword)cGroup_2_1_2.eContents().get(0);
		private final Assignment cRefIndexAssignment_2_1_2_1 = (Assignment)cGroup_2_1_2.eContents().get(1);
		private final RuleCall cRefIndexINTTerminalRuleCall_2_1_2_1_0 = (RuleCall)cRefIndexAssignment_2_1_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_1_2_2 = (Keyword)cGroup_2_1_2.eContents().get(2);
		private final Assignment cNewObjectAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cNewObjectCreatedObjectParserRuleCall_3_0 = (RuleCall)cNewObjectAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Assignment cImportAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final CrossReference cImportImportCrossReference_4_0_0 = (CrossReference)cImportAssignment_4_0.eContents().get(0);
		private final RuleCall cImportImportIDTerminalRuleCall_4_0_0_1 = (RuleCall)cImportImportCrossReference_4_0_0.eContents().get(1);
		private final Assignment cImpFragAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cImpFragFRAGMENTTerminalRuleCall_4_1_0 = (RuleCall)cImpFragAssignment_4_1.eContents().get(0);
		
		//SingleAssignmentValue returns AssignmentValue:
		//     keyword="null" | value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT);
		@Override public ParserRule getRule() { return rule; }
		
		//keyword="null" | value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//keyword="null"
		public Assignment getKeywordAssignment_0() { return cKeywordAssignment_0; }
		
		//"null"
		public Keyword getKeywordNullKeyword_0_0() { return cKeywordNullKeyword_0_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
		
		//(refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?)
		public Group getGroup_2() { return cGroup_2; }
		
		//refObject=[NamedObject]
		public Assignment getRefObjectAssignment_2_0() { return cRefObjectAssignment_2_0; }
		
		//[NamedObject]
		public CrossReference getRefObjectNamedObjectCrossReference_2_0_0() { return cRefObjectNamedObjectCrossReference_2_0_0; }
		
		//ID
		public RuleCall getRefObjectNamedObjectIDTerminalRuleCall_2_0_0_1() { return cRefObjectNamedObjectIDTerminalRuleCall_2_0_0_1; }
		
		//("." refFeature=ID ("[" refIndex=INT "]")?)?
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//"."
		public Keyword getFullStopKeyword_2_1_0() { return cFullStopKeyword_2_1_0; }
		
		//refFeature=ID
		public Assignment getRefFeatureAssignment_2_1_1() { return cRefFeatureAssignment_2_1_1; }
		
		//ID
		public RuleCall getRefFeatureIDTerminalRuleCall_2_1_1_0() { return cRefFeatureIDTerminalRuleCall_2_1_1_0; }
		
		//("[" refIndex=INT "]")?
		public Group getGroup_2_1_2() { return cGroup_2_1_2; }
		
		//"["
		public Keyword getLeftSquareBracketKeyword_2_1_2_0() { return cLeftSquareBracketKeyword_2_1_2_0; }
		
		//refIndex=INT
		public Assignment getRefIndexAssignment_2_1_2_1() { return cRefIndexAssignment_2_1_2_1; }
		
		//INT
		public RuleCall getRefIndexINTTerminalRuleCall_2_1_2_1_0() { return cRefIndexINTTerminalRuleCall_2_1_2_1_0; }
		
		//"]"
		public Keyword getRightSquareBracketKeyword_2_1_2_2() { return cRightSquareBracketKeyword_2_1_2_2; }
		
		//newObject=CreatedObject
		public Assignment getNewObjectAssignment_3() { return cNewObjectAssignment_3; }
		
		//CreatedObject
		public RuleCall getNewObjectCreatedObjectParserRuleCall_3_0() { return cNewObjectCreatedObjectParserRuleCall_3_0; }
		
		//(^import=[Import] impFrag=FRAGMENT)
		public Group getGroup_4() { return cGroup_4; }
		
		//^import=[Import]
		public Assignment getImportAssignment_4_0() { return cImportAssignment_4_0; }
		
		//[Import]
		public CrossReference getImportImportCrossReference_4_0_0() { return cImportImportCrossReference_4_0_0; }
		
		//ID
		public RuleCall getImportImportIDTerminalRuleCall_4_0_0_1() { return cImportImportIDTerminalRuleCall_4_0_0_1; }
		
		//impFrag=FRAGMENT
		public Assignment getImpFragAssignment_4_1() { return cImpFragAssignment_4_1; }
		
		//FRAGMENT
		public RuleCall getImpFragFRAGMENTTerminalRuleCall_4_1_0() { return cImpFragFRAGMENTTerminalRuleCall_4_1_0; }
	}
	public class CreatedObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cObjectNewParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cObjectCopyParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Alternatives cAlternatives_2_1 = (Alternatives)cGroup_2.eContents().get(1);
		private final Assignment cAssignmentsAssignment_2_1_0 = (Assignment)cAlternatives_2_1.eContents().get(0);
		private final RuleCall cAssignmentsMonoSingleAssignmentParserRuleCall_2_1_0_0 = (RuleCall)cAssignmentsAssignment_2_1_0.eContents().get(0);
		private final Assignment cAssignmentsAssignment_2_1_1 = (Assignment)cAlternatives_2_1.eContents().get(1);
		private final RuleCall cAssignmentsMonoListAssignmentParserRuleCall_2_1_1_0 = (RuleCall)cAssignmentsAssignment_2_1_1.eContents().get(0);
		private final Assignment cLeftMigAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cLeftMigMigrationParserRuleCall_2_2_0 = (RuleCall)cLeftMigAssignment_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//CreatedObject:
		//    (ObjectNew|ObjectCopy) name=ID? ("{"
		//        (assignments+=MonoSingleAssignment|assignments+=MonoListAssignment)+
		//        leftMig=Migration?
		//    "}" )?;
		@Override public ParserRule getRule() { return rule; }
		
		//(ObjectNew|ObjectCopy) name=ID? ("{"
		//    (assignments+=MonoSingleAssignment|assignments+=MonoListAssignment)+
		//    leftMig=Migration?
		//"}" )?
		public Group getGroup() { return cGroup; }
		
		//(ObjectNew|ObjectCopy)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//ObjectNew
		public RuleCall getObjectNewParserRuleCall_0_0() { return cObjectNewParserRuleCall_0_0; }
		
		//ObjectCopy
		public RuleCall getObjectCopyParserRuleCall_0_1() { return cObjectCopyParserRuleCall_0_1; }
		
		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//("{"
		//       (assignments+=MonoSingleAssignment|assignments+=MonoListAssignment)+
		//       leftMig=Migration?
		//   "}" )?
		public Group getGroup_2() { return cGroup_2; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2_0() { return cLeftCurlyBracketKeyword_2_0; }
		
		//(assignments+=MonoSingleAssignment|assignments+=MonoListAssignment)+
		public Alternatives getAlternatives_2_1() { return cAlternatives_2_1; }
		
		//assignments+=MonoSingleAssignment
		public Assignment getAssignmentsAssignment_2_1_0() { return cAssignmentsAssignment_2_1_0; }
		
		//MonoSingleAssignment
		public RuleCall getAssignmentsMonoSingleAssignmentParserRuleCall_2_1_0_0() { return cAssignmentsMonoSingleAssignmentParserRuleCall_2_1_0_0; }
		
		//assignments+=MonoListAssignment
		public Assignment getAssignmentsAssignment_2_1_1() { return cAssignmentsAssignment_2_1_1; }
		
		//MonoListAssignment
		public RuleCall getAssignmentsMonoListAssignmentParserRuleCall_2_1_1_0() { return cAssignmentsMonoListAssignmentParserRuleCall_2_1_1_0; }
		
		//leftMig=Migration?
		public Assignment getLeftMigAssignment_2_2() { return cLeftMigAssignment_2_2; }
		
		//Migration
		public RuleCall getLeftMigMigrationParserRuleCall_2_2_0() { return cLeftMigMigrationParserRuleCall_2_2_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }
	}
	public class ObjectNewElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ObjectNew");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNewKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cImportImportCrossReference_1_0 = (CrossReference)cImportAssignment_1.eContents().get(0);
		private final RuleCall cImportImportIDTerminalRuleCall_1_0_1 = (RuleCall)cImportImportCrossReference_1_0.eContents().get(1);
		private final Assignment cImpFragAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImpFragFRAGMENTTerminalRuleCall_2_0 = (RuleCall)cImpFragAssignment_2.eContents().get(0);
		
		//ObjectNew:
		//    "new" ^import=[Import] impFrag=FRAGMENT;
		@Override public ParserRule getRule() { return rule; }
		
		//"new" ^import=[Import] impFrag=FRAGMENT
		public Group getGroup() { return cGroup; }
		
		//"new"
		public Keyword getNewKeyword_0() { return cNewKeyword_0; }
		
		//^import=[Import]
		public Assignment getImportAssignment_1() { return cImportAssignment_1; }
		
		//[Import]
		public CrossReference getImportImportCrossReference_1_0() { return cImportImportCrossReference_1_0; }
		
		//ID
		public RuleCall getImportImportIDTerminalRuleCall_1_0_1() { return cImportImportIDTerminalRuleCall_1_0_1; }
		
		//impFrag=FRAGMENT
		public Assignment getImpFragAssignment_2() { return cImpFragAssignment_2; }
		
		//FRAGMENT
		public RuleCall getImpFragFRAGMENTTerminalRuleCall_2_0() { return cImpFragFRAGMENTTerminalRuleCall_2_0; }
	}
	public class ObjectCopyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ObjectCopy");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCopyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cResourceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cResourceNamedResourceCrossReference_1_0 = (CrossReference)cResourceAssignment_1.eContents().get(0);
		private final RuleCall cResourceNamedResourceIDTerminalRuleCall_1_0_1 = (RuleCall)cResourceNamedResourceCrossReference_1_0.eContents().get(1);
		private final Assignment cFragmentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFragmentFRAGMENTTerminalRuleCall_2_0 = (RuleCall)cFragmentAssignment_2.eContents().get(0);
		
		//ObjectCopy:
		//    "copy" resource=[NamedResource] ^fragment=FRAGMENT;
		@Override public ParserRule getRule() { return rule; }
		
		//"copy" resource=[NamedResource] ^fragment=FRAGMENT
		public Group getGroup() { return cGroup; }
		
		//"copy"
		public Keyword getCopyKeyword_0() { return cCopyKeyword_0; }
		
		//resource=[NamedResource]
		public Assignment getResourceAssignment_1() { return cResourceAssignment_1; }
		
		//[NamedResource]
		public CrossReference getResourceNamedResourceCrossReference_1_0() { return cResourceNamedResourceCrossReference_1_0; }
		
		//ID
		public RuleCall getResourceNamedResourceIDTerminalRuleCall_1_0_1() { return cResourceNamedResourceIDTerminalRuleCall_1_0_1; }
		
		//^fragment=FRAGMENT
		public Assignment getFragmentAssignment_2() { return cFragmentAssignment_2; }
		
		//FRAGMENT
		public RuleCall getFragmentFRAGMENTTerminalRuleCall_2_0() { return cFragmentFRAGMENTTerminalRuleCall_2_0; }
	}
	public class MigrationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Migration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMigrationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMigrateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFirstAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFirstExecutableParserRuleCall_2_0 = (RuleCall)cFirstAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cAsKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cAsOpAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cAsOpExecutableParserRuleCall_3_0_1_0 = (RuleCall)cAsOpAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cEachKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cEachOpAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cEachOpExecutableParserRuleCall_3_1_1_0 = (RuleCall)cEachOpAssignment_3_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//// ******************* migration *****************************
		//Migration: {Migration}
		//    "migrate" first=Executable? (("as" asOp=Executable) | ("each" eachOp=Executable))? ";";
		@Override public ParserRule getRule() { return rule; }
		
		//{Migration}
		//   "migrate" first=Executable? (("as" asOp=Executable) | ("each" eachOp=Executable))? ";"
		public Group getGroup() { return cGroup; }
		
		//{Migration}
		public Action getMigrationAction_0() { return cMigrationAction_0; }
		
		//"migrate"
		public Keyword getMigrateKeyword_1() { return cMigrateKeyword_1; }
		
		//first=Executable?
		public Assignment getFirstAssignment_2() { return cFirstAssignment_2; }
		
		//Executable
		public RuleCall getFirstExecutableParserRuleCall_2_0() { return cFirstExecutableParserRuleCall_2_0; }
		
		//(("as" asOp=Executable) | ("each" eachOp=Executable))?
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//("as" asOp=Executable)
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//"as"
		public Keyword getAsKeyword_3_0_0() { return cAsKeyword_3_0_0; }
		
		//asOp=Executable
		public Assignment getAsOpAssignment_3_0_1() { return cAsOpAssignment_3_0_1; }
		
		//Executable
		public RuleCall getAsOpExecutableParserRuleCall_3_0_1_0() { return cAsOpExecutableParserRuleCall_3_0_1_0; }
		
		//("each" eachOp=Executable)
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//"each"
		public Keyword getEachKeyword_3_1_0() { return cEachKeyword_3_1_0; }
		
		//eachOp=Executable
		public Assignment getEachOpAssignment_3_1_1() { return cEachOpAssignment_3_1_1; }
		
		//Executable
		public RuleCall getEachOpExecutableParserRuleCall_3_1_1_0() { return cEachOpExecutableParserRuleCall_3_1_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class ExecutableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Executable");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cJavaExecutableParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExpressionExecutableParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Executable:
		//    JavaExecutable | ExpressionExecutable;
		@Override public ParserRule getRule() { return rule; }
		
		//JavaExecutable | ExpressionExecutable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//JavaExecutable
		public RuleCall getJavaExecutableParserRuleCall_0() { return cJavaExecutableParserRuleCall_0; }
		
		//ExpressionExecutable
		public RuleCall getExpressionExecutableParserRuleCall_1() { return cExpressionExecutableParserRuleCall_1; }
	}
	public class JavaExecutableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.JavaExecutable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cJavaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMethodAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMethodIDTerminalRuleCall_1_0 = (RuleCall)cMethodAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//JavaExecutable:
		//    "java" method=ID "(" ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"java" method=ID "(" ")"
		public Group getGroup() { return cGroup; }
		
		//"java"
		public Keyword getJavaKeyword_0() { return cJavaKeyword_0; }
		
		//method=ID
		public Assignment getMethodAssignment_1() { return cMethodAssignment_1; }
		
		//ID
		public RuleCall getMethodIDTerminalRuleCall_1_0() { return cMethodIDTerminalRuleCall_1_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ExpressionExecutableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ExpressionExecutable");
		private final Assignment cExprstrAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExprstrSTRINGTerminalRuleCall_0 = (RuleCall)cExprstrAssignment.eContents().get(0);
		
		//ExpressionExecutable:
		//     exprstr=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//exprstr=STRING
		public Assignment getExprstrAssignment() { return cExprstrAssignment; }
		
		//STRING
		public RuleCall getExprstrSTRINGTerminalRuleCall_0() { return cExprstrSTRINGTerminalRuleCall_0; }
	}
	
	
	private final EPatchElements pEPatch;
	private final ImportElements pImport;
	private final ModelImportElements pModelImport;
	private final ResourceImportElements pResourceImport;
	private final EPackageImportElements pEPackageImport;
	private final JavaImportElements pJavaImport;
	private final ExtensionImportElements pExtensionImport;
	private final NamedResourceElements pNamedResource;
	private final NamedObjectElements pNamedObject;
	private final ObjectRefElements pObjectRef;
	private final AssignmentElements pAssignment;
	private final BiSingleAssignmentElements pBiSingleAssignment;
	private final BiListAssignmentElements pBiListAssignment;
	private final MonoSingleAssignmentElements pMonoSingleAssignment;
	private final MonoListAssignmentElements pMonoListAssignment;
	private final AssignmentValueElements pAssignmentValue;
	private final ListAssignmentValueElements pListAssignmentValue;
	private final SingleAssignmentValueElements pSingleAssignmentValue;
	private final CreatedObjectElements pCreatedObject;
	private final ObjectNewElements pObjectNew;
	private final ObjectCopyElements pObjectCopy;
	private final TerminalRule tFRAGMENT;
	private final MigrationElements pMigration;
	private final ExecutableElements pExecutable;
	private final JavaExecutableElements pJavaExecutable;
	private final ExpressionExecutableElements pExpressionExecutable;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EpatchTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEPatch = new EPatchElements();
		this.pImport = new ImportElements();
		this.pModelImport = new ModelImportElements();
		this.pResourceImport = new ResourceImportElements();
		this.pEPackageImport = new EPackageImportElements();
		this.pJavaImport = new JavaImportElements();
		this.pExtensionImport = new ExtensionImportElements();
		this.pNamedResource = new NamedResourceElements();
		this.pNamedObject = new NamedObjectElements();
		this.pObjectRef = new ObjectRefElements();
		this.pAssignment = new AssignmentElements();
		this.pBiSingleAssignment = new BiSingleAssignmentElements();
		this.pBiListAssignment = new BiListAssignmentElements();
		this.pMonoSingleAssignment = new MonoSingleAssignmentElements();
		this.pMonoListAssignment = new MonoListAssignmentElements();
		this.pAssignmentValue = new AssignmentValueElements();
		this.pListAssignmentValue = new ListAssignmentValueElements();
		this.pSingleAssignmentValue = new SingleAssignmentValueElements();
		this.pCreatedObject = new CreatedObjectElements();
		this.pObjectNew = new ObjectNewElements();
		this.pObjectCopy = new ObjectCopyElements();
		this.tFRAGMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
		this.pMigration = new MigrationElements();
		this.pExecutable = new ExecutableElements();
		this.pJavaExecutable = new JavaExecutableElements();
		this.pExpressionExecutable = new ExpressionExecutableElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.epatch.EpatchTestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//EPatch:
	//    "epatch" name=ID "{" imports+=Import* resources+=NamedResource* objects+=ObjectRef* "}";
	public EPatchElements getEPatchAccess() {
		return pEPatch;
	}
	
	public ParserRule getEPatchRule() {
		return getEPatchAccess().getRule();
	}
	
	//Import:
	//    ModelImport | JavaImport | ExtensionImport;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//ModelImport:
	//    ResourceImport | EPackageImport;
	public ModelImportElements getModelImportAccess() {
		return pModelImport;
	}
	
	public ParserRule getModelImportRule() {
		return getModelImportAccess().getRule();
	}
	
	//ResourceImport:
	//    "import" name=ID "uri" uri=STRING;
	public ResourceImportElements getResourceImportAccess() {
		return pResourceImport;
	}
	
	public ParserRule getResourceImportRule() {
		return getResourceImportAccess().getRule();
	}
	
	//EPackageImport:
	//    "import" name=ID "ns" nsURI=STRING;
	public EPackageImportElements getEPackageImportAccess() {
		return pEPackageImport;
	}
	
	public ParserRule getEPackageImportRule() {
		return getEPackageImportAccess().getRule();
	}
	
	//JavaImport:
	//    "import" "java" path+=ID ("." path+=ID)*;
	public JavaImportElements getJavaImportAccess() {
		return pJavaImport;
	}
	
	public ParserRule getJavaImportRule() {
		return getJavaImportAccess().getRule();
	}
	
	//ExtensionImport:
	//    "import" "extension" path+=ID ("::" path+=ID)*;
	public ExtensionImportElements getExtensionImportAccess() {
		return pExtensionImport;
	}
	
	public ParserRule getExtensionImportRule() {
		return getExtensionImportAccess().getRule();
	}
	
	//NamedResource:
	//    "resource" name=ID "{"
	//        "left" ("uri" leftUri=STRING | leftRoot=CreatedObject) ";"
	//        "right" ("uri" rightUri=STRING | rightRoot=CreatedObject) ";"
	//    "}";
	public NamedResourceElements getNamedResourceAccess() {
		return pNamedResource;
	}
	
	public ParserRule getNamedResourceRule() {
		return getNamedResourceAccess().getRule();
	}
	
	//NamedObject: ObjectRef | CreatedObject;
	public NamedObjectElements getNamedObjectAccess() {
		return pNamedObject;
	}
	
	public ParserRule getNamedObjectRule() {
		return getNamedObjectAccess().getRule();
	}
	
	//ObjectRef:
	//    "object" name=ID? (
	//        (leftRes=[NamedResource] leftFrag=FRAGMENT) |
	//        ("left" leftRes=[NamedResource] leftFrag=FRAGMENT "right" rightRes=[NamedResource] rightFrag=FRAGMENT)
	//    )
	//    ( "{"
	//        (assignments+=BiSingleAssignment|assignments+=BiListAssignment)+
	//        ("left" leftMig=Migration)?
	//        ("right" rightMig=Migration)?
	//    "}" )?;
	public ObjectRefElements getObjectRefAccess() {
		return pObjectRef;
	}
	
	public ParserRule getObjectRefRule() {
		return getObjectRefAccess().getRule();
	}
	
	//Assignment returns Assignment:
	//    BiSingleAssignment | BiListAssignment | MonoSingleAssignment | MonoListAssignment;
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//BiSingleAssignment returns SingleAssignment:
	//    feature=ID "=" leftValue=SingleAssignmentValue "|" rightValue=SingleAssignmentValue ";";
	public BiSingleAssignmentElements getBiSingleAssignmentAccess() {
		return pBiSingleAssignment;
	}
	
	public ParserRule getBiSingleAssignmentRule() {
		return getBiSingleAssignmentAccess().getRule();
	}
	
	//BiListAssignment returns ListAssignment:
	//    feature=ID "=" "[" (leftValues+=ListAssignmentValue ("," leftValues+=ListAssignmentValue)*)? "|" (rightValues+=ListAssignmentValue ("," rightValues+=ListAssignmentValue)*)? "]" ";";
	public BiListAssignmentElements getBiListAssignmentAccess() {
		return pBiListAssignment;
	}
	
	public ParserRule getBiListAssignmentRule() {
		return getBiListAssignmentAccess().getRule();
	}
	
	//MonoSingleAssignment returns SingleAssignment:
	//    feature=ID "=" leftValue=SingleAssignmentValue ";";
	public MonoSingleAssignmentElements getMonoSingleAssignmentAccess() {
		return pMonoSingleAssignment;
	}
	
	public ParserRule getMonoSingleAssignmentRule() {
		return getMonoSingleAssignmentAccess().getRule();
	}
	
	//MonoListAssignment returns ListAssignment:
	//    feature=ID "=" "[" (leftValues+=AssignmentValue ("," leftValues+=AssignmentValue)*)? "]" ";";
	public MonoListAssignmentElements getMonoListAssignmentAccess() {
		return pMonoListAssignment;
	}
	
	public ParserRule getMonoListAssignmentRule() {
		return getMonoListAssignmentAccess().getRule();
	}
	
	//AssignmentValue returns AssignmentValue:
	//    value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT);
	public AssignmentValueElements getAssignmentValueAccess() {
		return pAssignmentValue;
	}
	
	public ParserRule getAssignmentValueRule() {
		return getAssignmentValueAccess().getRule();
	}
	
	//ListAssignmentValue returns AssignmentValue:
	//     index=INT ":" (("[" refIndex=INT "]") | value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT));
	public ListAssignmentValueElements getListAssignmentValueAccess() {
		return pListAssignmentValue;
	}
	
	public ParserRule getListAssignmentValueRule() {
		return getListAssignmentValueAccess().getRule();
	}
	
	//SingleAssignmentValue returns AssignmentValue:
	//     keyword="null" | value=STRING | (refObject=[NamedObject] ("." refFeature=ID ("[" refIndex=INT "]")?)?) | newObject=CreatedObject | (^import=[Import] impFrag=FRAGMENT);
	public SingleAssignmentValueElements getSingleAssignmentValueAccess() {
		return pSingleAssignmentValue;
	}
	
	public ParserRule getSingleAssignmentValueRule() {
		return getSingleAssignmentValueAccess().getRule();
	}
	
	//CreatedObject:
	//    (ObjectNew|ObjectCopy) name=ID? ("{"
	//        (assignments+=MonoSingleAssignment|assignments+=MonoListAssignment)+
	//        leftMig=Migration?
	//    "}" )?;
	public CreatedObjectElements getCreatedObjectAccess() {
		return pCreatedObject;
	}
	
	public ParserRule getCreatedObjectRule() {
		return getCreatedObjectAccess().getRule();
	}
	
	//ObjectNew:
	//    "new" ^import=[Import] impFrag=FRAGMENT;
	public ObjectNewElements getObjectNewAccess() {
		return pObjectNew;
	}
	
	public ParserRule getObjectNewRule() {
		return getObjectNewAccess().getRule();
	}
	
	//ObjectCopy:
	//    "copy" resource=[NamedResource] ^fragment=FRAGMENT;
	public ObjectCopyElements getObjectCopyAccess() {
		return pObjectCopy;
	}
	
	public ParserRule getObjectCopyRule() {
		return getObjectCopyAccess().getRule();
	}
	
	//terminal FRAGMENT:
	//    '#' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'/'|'['|']'|'{'|'}'|'.'|'@')+;
	public TerminalRule getFRAGMENTRule() {
		return tFRAGMENT;
	}
	
	//// ******************* migration *****************************
	//Migration: {Migration}
	//    "migrate" first=Executable? (("as" asOp=Executable) | ("each" eachOp=Executable))? ";";
	public MigrationElements getMigrationAccess() {
		return pMigration;
	}
	
	public ParserRule getMigrationRule() {
		return getMigrationAccess().getRule();
	}
	
	//Executable:
	//    JavaExecutable | ExpressionExecutable;
	public ExecutableElements getExecutableAccess() {
		return pExecutable;
	}
	
	public ParserRule getExecutableRule() {
		return getExecutableAccess().getRule();
	}
	
	//JavaExecutable:
	//    "java" method=ID "(" ")";
	public JavaExecutableElements getJavaExecutableAccess() {
		return pJavaExecutable;
	}
	
	public ParserRule getJavaExecutableRule() {
		return getJavaExecutableAccess().getRule();
	}
	
	//ExpressionExecutable:
	//     exprstr=STRING;
	public ExpressionExecutableElements getExpressionExecutableAccess() {
		return pExpressionExecutable;
	}
	
	public ParserRule getExpressionExecutableRule() {
		return getExpressionExecutableAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
