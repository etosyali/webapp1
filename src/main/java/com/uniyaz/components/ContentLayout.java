package com.uniyaz.components;

import com.vaadin.ui.*;

public class ContentLayout extends VerticalLayout {




    public ContentLayout() {
        setSizeFull();
    }

    @Override
    public void addComponent(Component component) {
        super.addComponent(component);
        setComponentAlignment(component, Alignment.MIDDLE_CENTER);

    }



}
