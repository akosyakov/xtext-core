/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.generator.ecore.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.generator.ecore.parser.antlr.internal.InternalSubTestLanguageParser;
import org.eclipse.xtext.generator.ecore.services.SubTestLanguageGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SubTestLanguageParser extends AbstractAntlrParser {

	@Inject
	private SubTestLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSubTestLanguageParser createParser(XtextTokenStream stream) {
		return new InternalSubTestLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SubMain";
	}

	public SubTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SubTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
