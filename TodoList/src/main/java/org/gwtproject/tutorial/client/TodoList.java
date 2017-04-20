package org.gwtproject.tutorial.client;

import java.util.Arrays;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.IronIconElement;
import com.vaadin.polymer.paper.PaperButtonElement;
import com.vaadin.polymer.paper.PaperCheckboxElement;
import com.vaadin.polymer.paper.PaperDialogElement;
import com.vaadin.polymer.paper.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.PaperFabElement;
import com.vaadin.polymer.paper.PaperHeaderPanelElement;
import com.vaadin.polymer.paper.PaperIconButtonElement;
import com.vaadin.polymer.paper.PaperIconItemElement;
import com.vaadin.polymer.paper.PaperInputElement;
import com.vaadin.polymer.paper.PaperRippleElement;
import com.vaadin.polymer.paper.PaperTextareaElement;
import com.vaadin.polymer.paper.PaperToolbarElement;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TodoList implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	@SuppressWarnings("rawtypes")
	public void onModuleLoad() {
		// We have to load icon sets before run application.
		Polymer.importHref(Arrays.asList(
				"iron-icons/iron-icons.html",
				PaperIconItemElement.SRC, IronIconElement.SRC,
				PaperRippleElement.SRC, PaperDrawerPanelElement.SRC,
				PaperHeaderPanelElement.SRC, PaperToolbarElement.SRC,
				PaperIconButtonElement.SRC, PaperFabElement.SRC,
				PaperDialogElement.SRC, PaperInputElement.SRC,
				PaperTextareaElement.SRC, PaperButtonElement.SRC,
				PaperCheckboxElement.SRC), new Function() {
					@Override
					public Object call(Object arg) {
						// The app is executed when all imports success.
						startApplication();
						return null;
					}
				});
	}

	private void startApplication() {		
		RootPanel.get().add(new Main());		
	}

}