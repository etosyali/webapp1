package com.uniyaz.view;

import com.uniyaz.service.KategoriService;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class KategoriAddPage extends VerticalLayout {
    TextField kategoriTextField;
    Button kategoriEkleButton;

    public KategoriAddPage(){
        buildKategoriAddView();
    }

    private void buildKategoriAddView() {
        kategoriTextField = new TextField("Kategori Adi");
        addComponent(kategoriTextField);

        kategoriEkleButton = new Button("EKLE");
        kategoriEkleButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                if(kategoriTextField.getValue() != null){
                    KategoriService kategoriService = new KategoriService();
                    kategoriService.addKategori(kategoriTextField.getValue());
                }
            }
        });
        addComponent(kategoriEkleButton);
    }
}
