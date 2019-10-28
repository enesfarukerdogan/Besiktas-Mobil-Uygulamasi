package com.example.enesfaruk.besiktasmobil;

public class puanitem {
    String sira;
    String takimismi;
    String oynananmac;
    String averaj;
    String puan;

    public puanitem(){}

    public puanitem(String sira, String takimismi, String oynananmac, String averaj, String puan){
        this.sira = sira;
        this.takimismi = takimismi;
        this.oynananmac = oynananmac;
        this.averaj = averaj;
        this.puan = puan;
    }

    public String getSira() { return sira; }
    public void  setSira(String sira) { this.sira = sira; }

    public String getTakimismi() { return takimismi; }
    public void setTakimismi(String takimismi) { this.takimismi = takimismi; }

    public String getOynananmac() { return oynananmac; }
    public void setOynananmac(String oynananmac) { this.oynananmac = oynananmac; }

    public String getAveraj() { return averaj; }
    public void setAveraj(String averaj) { this.averaj = averaj; }

    public String getPuan() { return puan; }
    public void setPuan(String puan) { this.puan = puan; }
}
