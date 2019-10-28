package com.example.enesfaruk.besiktasmobil;
//burada maclar.xml deki itemleri tanımlayıp public paylaşıyoruz
public class macitem {

    String evsahibi;
    String deplasman;
    String skor;
    String turnuva;
    String tarih;

    public macitem() {}

    public macitem(String evsahibi, String deplasman, String skor, String turnuva, String tarih){
        this.deplasman = deplasman;
        this.evsahibi = evsahibi;
        this.skor = skor;
        this.turnuva = turnuva;
        this.tarih = tarih;
    }

    public String getEvsahibi() { return evsahibi; }
    public void setEvsahibi(String evsahibi) { this.evsahibi = evsahibi; }

    public String getDeplasman() { return deplasman; }
    public void setDeplasman(String deplasman) { this.deplasman = deplasman; }

    public String getSkor() { return  skor; }
    public void setSkor(String skor) { this.skor = skor; }

    public String getTurnuva() { return turnuva; }
    public void setTurnuva(String turnuva) { this.turnuva = turnuva; }

    public  String getTarih() { return tarih; }
    public void setTarih(String tarih) { this.tarih = tarih; }
}