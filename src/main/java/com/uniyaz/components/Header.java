package com.uniyaz.components;

import com.uniyaz.service.KategoriService;
import com.uniyaz.ui.FirstUi;
import com.vaadin.ui.*;


public class Header extends HorizontalLayout {
    public Header() {


        setSizeFull();

        buildLayout();
    }

    private void buildLayout() {
        MenuBar menuBar=new MenuBar();

        MenuBar.MenuItem kategori=  menuBar.addItem("Kategori",null);
        MenuBar.MenuItem icerik=  menuBar.addItem("İçerik",null);
        kategori.addItem("kategori ekle", new MenuBar.Command() {
            @Override
            public void menuSelected(MenuBar.MenuItem menuItem) {

               final FirstUi firstUi=(FirstUi)UI.getCurrent();
               ContentLayout contentLayout=  firstUi.getContentLayout();

                TextField kategoriekleTextfiled=new TextField();
                kategoriekleTextfiled.setCaption("isim");
                contentLayout.addComponent(kategoriekleTextfiled);

                Button kaydetButton =new Button();
                kaydetButton.setCaption("Kaydet");
                contentLayout.addComponent(kaydetButton);

                kaydetButton.addClickListener(new Button.ClickListener() {
                    @Override
                    public void buttonClick(Button.ClickEvent clickEvent) {
                        if(kategoriekleTextfiled!=null) {
                            KategoriService kategoriService = new KategoriService();
                            kategoriService.addKategori(kategoriekleTextfiled.getValue());
                            Notification.show("Kategori eklendi");
                            contentLayout.removeAllComponents();
                        }
                    }
                });
            }
        });
        kategori.addItem("kategori sil", new MenuBar.Command() {
            @Override
            public void menuSelected(MenuBar.MenuItem menuItem) {

                final FirstUi firstUi=(FirstUi)UI.getCurrent();
                ContentLayout contentLayout=  firstUi.getContentLayout();


                TextField kategoriSilTextfield=new TextField();
                kategoriSilTextfield.setCaption("isim");
                contentLayout.addComponent(kategoriSilTextfield);
                Button silButton =new Button();
                silButton.setCaption("sil");
                contentLayout.addComponent(silButton);

                silButton.addClickListener(new Button.ClickListener() {
                    @Override
                    public void buttonClick(Button.ClickEvent clickEvent) {
                        KategoriService kategoriService = new KategoriService();
                        kategoriService.deleteKategori(kategoriSilTextfield.getValue());
                        Notification.show("Kategori silindi");
                        contentLayout.removeAllComponents();
                    }
                });

            }
        });
        icerik.addItem("İçerik ekle",null);
        icerik.addItem("İçerik sil",null);
        icerik.addItem("İçerik güncelle",null);
        icerik.addItem("İçerik düzenle",null);

        addComponent(menuBar);

        setComponentAlignment(menuBar, Alignment.MIDDLE_CENTER);
    }
}
