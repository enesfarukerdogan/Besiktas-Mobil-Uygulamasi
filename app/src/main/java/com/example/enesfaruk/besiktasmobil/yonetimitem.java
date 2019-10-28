package com.example.enesfaruk.besiktasmobil;

public class yonetimitem {
    String yoneticiismi;
    String gorev;

    public yonetimitem() {}

    public yonetimitem(String yoneticiismi, String gorev) {
        this.yoneticiismi = yoneticiismi;
        this.gorev = gorev;
    }

    public String getYoneticiismi() { return yoneticiismi; }
    public void setYoneticiismi(String yoneticiismi) { this.yoneticiismi = yoneticiismi; }

    public String getGorev() { return gorev; }
    public void setGorev(String gorev) { this.gorev = gorev; }
}
