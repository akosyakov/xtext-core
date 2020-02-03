/**
 * Copyright (c) 2015, 2020 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.wizard;

import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.wizard.Outlet;
import org.eclipse.xtext.xtext.wizard.ProjectDescriptor;

public abstract class AbstractFile {
	private final Outlet outlet;

	private final String relativePath;

	private final ProjectDescriptor project;

	private final boolean executable;

	public AbstractFile(Outlet outlet, String relativePath, ProjectDescriptor project, boolean executable) {
		super();
		this.outlet = outlet;
		this.relativePath = relativePath;
		this.project = project;
		this.executable = executable;
	}

	@Pure
	public Outlet getOutlet() {
		return this.outlet;
	}

	@Pure
	public String getRelativePath() {
		return this.relativePath;
	}

	@Pure
	public ProjectDescriptor getProject() {
		return this.project;
	}

	@Pure
	public boolean isExecutable() {
		return this.executable;
	}
}