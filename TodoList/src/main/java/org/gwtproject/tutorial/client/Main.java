package org.gwtproject.tutorial.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.elemental.HTMLElement;
import com.vaadin.polymer.paper.PaperButtonElement;
import com.vaadin.polymer.paper.PaperDialogElement;
import com.vaadin.polymer.paper.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.PaperFabElement;
import com.vaadin.polymer.paper.PaperIconItemElement;
import com.vaadin.polymer.paper.PaperInputElement;
import com.vaadin.polymer.paper.PaperTextareaElement;

public class Main extends Composite {
	interface MainUiBinder extends UiBinder<HTMLPanel, Main> {
	}
	
	private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);
	
	private List<Item> items = new ArrayList<>();
		
	@UiField PaperDrawerPanelElement drawerPanel;
	@UiField HTMLElement content;
	
	@UiField PaperIconItemElement menuClearAll;
	@UiField PaperIconItemElement menuClearDone;
	
	@UiField PaperDialogElement addItemDialog;
	@UiField PaperInputElement titleInput;
	@UiField PaperTextareaElement descriptionInput;
	
	@UiField PaperFabElement addButton;
	@UiField PaperButtonElement confirmAddButton;
	
	public Main() {
		initWidget(uiBinder.createAndBindUi(this));
		
		addButton.addEventListener("click", new EventListener<Event>() {
			@Override
			public void handleEvent(Event event) {
				addItemDialog.open();
			}
		});
		
		confirmAddButton.addEventListener("click", new EventListener<Event>() {
			@Override
			public void handleEvent(Event event) {
				if (!titleInput.getValue().isEmpty()) {
					addItem(titleInput.getValue(), descriptionInput.getValue());
					// clear text fields
					titleInput.setValue("");
					descriptionInput.setValue("");
				}
			}
		});
		
		menuClearAll.addEventListener("click", new EventListener<Event>() {
			@Override
			public void handleEvent(Event event) {
				closeMenu();
				// remove all child elements.
				while (content.hasChildNodes()) {
					content.removeChild(content.getFirstChild());
				}
			}
		});
		
		menuClearDone.addEventListener("click", new EventListener<Event>() {
			@Override
			public void handleEvent(Event event) {
				closeMenu();
				for (Item item : items) {
					if (item.isDone()) {
						content.removeChild(item.getElement());
						items.remove(item);
					}
				}
			}
		});
	}

	private void closeMenu() {		
		if (drawerPanel.getNarrow()) {
			drawerPanel.closeDrawer();
		}
	}

	private void addItem(String title, String description) {
		Item item = new Item();
		item.setTitle(title);
		item.setDescription(description);
		content.appendChild(item.getElement());
		items.add(item);
	}

}