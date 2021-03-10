package com.uniyaz.ui;

import com.uniyaz.components.ContentLayout;
import com.uniyaz.components.Main;
import com.uniyaz.components.SideBar;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class FirstUi extends UI {

private ContentLayout contentLayout;
private SideBar sideBar;

    public SideBar getSideBar() {
        return sideBar;
    }

    public void setSideBar(SideBar sideBar) {
        this.sideBar = sideBar;
    }

    public ContentLayout getContentLayout() {
        return contentLayout;
    }

    public void setContentLayout(ContentLayout contentLayout) {
        this.contentLayout = contentLayout;
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Main main = new Main();
        setContent(main);
    }

}
