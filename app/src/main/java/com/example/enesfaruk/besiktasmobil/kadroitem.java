package com.example.enesfaruk.besiktasmobil;

public class kadroitem {
    String mevki;
    String oyuncuismi;
    String formano;

    public kadroitem() {}

    public kadroitem(String mevki, String oyuncuismi, String formano) {
        this.mevki = mevki;
        this.oyuncuismi = oyuncuismi;
        this.formano = formano;
    }

    public String getMevki() { return mevki; }
    public void setMevki(String mevki) { this.mevki = mevki; }

    public String getOyuncuismi() { return oyuncuismi; }
    public void setOyuncuismi(String oyuncuismi) { this.oyuncuismi = oyuncuismi; }

    public String getFormano() { return formano; }
    public void setFormano(String formano) { this.formano = formano; }
}
