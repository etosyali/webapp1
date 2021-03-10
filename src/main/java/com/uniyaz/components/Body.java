package com.uniyaz.components;

import com.uniyaz.ui.FirstUi;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;


public class Body extends HorizontalSplitPanel {

    public Body() {

        setSizeFull();
        setSplitPosition(15f);
        buildLayout();
    }

    private void buildLayout() {

        ContentLayout contentLayout = new ContentLayout();
        setSecondComponent(contentLayout);
        FirstUi firstUi=(FirstUi) UI.getCurrent();
        firstUi.setContentLayout(contentLayout);

        SideBar sideBar = new SideBar(contentLayout);
        setFirstComponent(sideBar);
        firstUi.setSideBar(sideBar);
    }
}
