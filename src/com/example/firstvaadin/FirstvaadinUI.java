package com.example.firstvaadin;



import com.vaadin.server.VaadinRequest;

import com.vaadin.ui.*;

@SuppressWarnings("serial")
public class FirstvaadinUI extends UI {
	
	
	private ComboBox doclist = new ComboBox("Documents");
	VerticalLayout vlay = new VerticalLayout();
	MyComposite mycomp = new MyComposite();
	private Button button1 = new Button("Mybutton");
	VerticalLayout vlayButton = new VerticalLayout();
	HorizontalLayout hlay = new HorizontalLayout();
	VerticalSplitPanel split = new VerticalSplitPanel();
	Label label = new Label();
	private PopupDateField datefield = new PopupDateField();
	
	@Override
	protected void init(VaadinRequest request) {
		
		this.getPage().setTitle("SCADAReporter");
		vlay.addComponent(doclist);
		
		hlay.addComponent(button1);
		hlay.addComponent(datefield);
		
		split.addComponent(vlay);
		split.addComponent(hlay);
		split.setMaxSplitPosition(95, Unit.PERCENTAGE);
		split.setMinSplitPosition(95, Unit.PERCENTAGE);
		
		
		this.setContent(split);
		
		/*button1.addClickListener(new ClickListener() {
            public void buttonClick(ClickEvent event) {
                label = new Label("NewLabel!");
            	vlayButton.addComponent(label);
            		
            }
    });*/
		
	}
}