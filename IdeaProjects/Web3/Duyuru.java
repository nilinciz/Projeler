package com.example.web3;
public class Duyuru {
    private int id;
    private String ad;
    private String icerik;
    private String gosterimtarihi;
    private String bitistarihi;

    public Duyuru(int id, String ad, String icerik, String gosterimtarihi, String bitistarihi) {
        this.id = id;
        this.ad = ad;
        this.icerik = icerik;
        this.gosterimtarihi = gosterimtarihi;
        this.bitistarihi = bitistarihi;
    }

    public Duyuru(String ad, String icerik, String gosterimtarihi, String bitistarihi) {
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

    public String getGosterimtarihi() {
        return gosterimtarihi;
    }

    public void setGosterimtarihi(String gosterimtarihi) {
        this.gosterimtarihi = gosterimtarihi;
    }

    public String getBitistarihi() {
        return bitistarihi;
    }

    public void setBitistarihi(String bitistarihi) {
        this.bitistarihi = bitistarihi;
    }
}




