package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.paper.PaperCheckboxElement;

public class Item {
	interface ItemUiBinder extends UiBinder<DivElement, Item> {
	}
	
	private static ItemUiBinder uiBinder = GWT.create(ItemUiBinder.class);
	
	private final DivElement element;
	
	@UiField Element title;
	@UiField Element description;
	@UiField PaperCheckboxElement done;
	
	public Item() {
		element = uiBinder.createAndBindUi(this);
		
		done.addEventListener("iron-change", new EventListener<Event>() {
			@Override
			public void handleEvent(Event event) {				
				if (done.getActive()) {
					title.addClassName("done");
				} else {
					title.removeClassName("done");
				}
			}
		});
	}

	public DivElement getElement() {
		return element;
	}

	public String getTitle() {
		return title.getInnerText();
	}

	public String getDescription() {
		return description.getInnerText();
	}

	public boolean isDone() {
		return done.getActive();
	}

	public void setTitle(String s) {
		title.setInnerText(s);;
	}

	public void setDescription(String s) {
		description.setInnerText(s);;
	}

	public void setDone(boolean b) {
		done.setActive(b);
	}

}