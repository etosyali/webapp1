package com.uniyaz.components;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class Footer extends VerticalLayout {

    public Footer() {
        setSizeFull();
        buildLayout();
    }
    private void buildLayout() {

        Label footerLabel = new Label();
        footerLabel.setCaption("Copy right Universal");
        footerLabel.setSizeUndefined();
        addComponent(footerLabel);
        setComponentAlignment(footerLabel, Alignment.MIDDLE_CENTER);
    }
}
