package com.uniyaz.components;
import com.uniyaz.service.KategoriService;
import com.vaadin.ui.*;

public class SideBar extends VerticalLayout {



    public SideBar(ContentLayout content) {
        buildLayout();
    }

    private void buildLayout() {

        KategoriService kategoriService = new KategoriService();
        kategoriService.ButonOlustur();


    }
        

}
