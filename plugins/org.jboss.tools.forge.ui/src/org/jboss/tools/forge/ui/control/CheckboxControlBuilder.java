/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.tools.forge.ui.control;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.jboss.forge.ui.UIInput;
import org.jboss.forge.ui.hints.InputType;
import org.jboss.forge.ui.hints.InputTypes;
import org.jboss.tools.forge.ui.wizards.ForgeWizardPage;

public class CheckboxControlBuilder extends ControlBuilder {

	@Override
	public Control build(ForgeWizardPage page, final UIInput<Object> input,
			final Composite container) {
		Button cmb = new Button(container, SWT.CHECK);
		cmb.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		cmb.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean selection = ((Button) e.widget).getSelection();
				setInputValue(input, selection);
			}
		});
		return cmb;
	}

	@Override
	protected Class<?> getProducedType() {
		return Boolean.class;
	}

	@Override
	protected InputType getSupportedInputType() {
		return InputTypes.CHECKBOX;
	}

}