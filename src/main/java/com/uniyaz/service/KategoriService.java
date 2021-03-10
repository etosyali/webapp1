package com.uniyaz.service;

import com.uniyaz.data.KategoriDao;

public class KategoriService {
    KategoriDao kategoriDao = new KategoriDao();

    public void addKategori(String kategoriAdi){
        kategoriDao.addKategori(kategoriAdi);
    }

    public void deleteKategori(String value) {

    }

    public void ButonOlustur() {
    }
}
