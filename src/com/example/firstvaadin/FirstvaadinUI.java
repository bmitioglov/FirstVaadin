package com.example.firstvaadin;

import java.io.File;

import com.vaadin.data.util.FilesystemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;



@SuppressWarnings("serial")
public class FirstvaadinUI extends UI {
	
	
	FilesystemContainer docs = new FilesystemContainer(new File("C:/Program files/"));
	private ComboBox doclist = new ComboBox("Documents111", docs);
	VerticalLayout vlay = new VerticalLayout();
	
	@Override
	protected void init(VaadinRequest request) {
		vlay.addComponent(doclist);
		this.setContent(vlay);
		
	}

}