package com.example.nangkringbang.Model;

public class Model_Kategori {
    private String kategori_name, kategori_img;

    public Model_Kategori () {}

    public Model_Kategori(String kategori_name, String kategori_img) {
        this.kategori_name = kategori_name;
        this.kategori_img = kategori_img;
    }

    public String getKategori_name() {
        return kategori_name;
    }

    public void setKategori_name(String kategori_name) {
        this.kategori_name = kategori_name;
    }

    public String getKategori_img() {
        return kategori_img;
    }

    public void setKategori_img(String kategori_img) {
        this.kategori_img = kategori_img;
    }
}
