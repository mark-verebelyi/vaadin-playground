package com.stonyesz.vaadin.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainUI extends UI {

	@Override
	protected void init(final VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.addComponent(new Label("Stony!"));
		this.setContent(layout);
	}

}
