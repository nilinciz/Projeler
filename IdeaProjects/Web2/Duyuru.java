package com.example.web2;

import java.time.LocalDate;

public class Duyuru {
    private int id;
    private String ad;
    private String icerik;
    private LocalDate gosterimtarihi;
    private LocalDate bitistarihi;



    public Duyuru(int id, String ad, String icerik, LocalDate gosterimtarihi, LocalDate bitistarihi) {
        this.id = id;
        this.ad = ad;
        this.icerik = icerik;
        this.gosterimtarihi = gosterimtarihi;
        this.bitistarihi = bitistarihi;

    }

    public Duyuru(String ad, String icerik, LocalDate gosterimtarihi, LocalDate bitistarihi) {
        this.ad = ad;
        this.icerik = icerik;
        this.gosterimtarihi = gosterimtarihi;
        this.bitistarihi = bitistarihi;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getAd() {

        return ad;
    }

    public void setAd(String ad) {

        this.ad = ad;
    }

    public String getIcerik() {

        return icerik;
    }

    public void setIcerik(String icerik) {

        this.icerik = icerik;
    }

    public LocalDate getGosterimtarihi() {

        return gosterimtarihi;
    }

    public void setGosterimtarihi(LocalDate gosterimtarihi) {

        this.gosterimtarihi = gosterimtarihi;
    }
    public LocalDate getBitistarihi() {

        return bitistarihi;
    }

    public void setBitistarihi(LocalDate bitistarihi) {

        this.bitistarihi = bitistarihi;
    }
}
