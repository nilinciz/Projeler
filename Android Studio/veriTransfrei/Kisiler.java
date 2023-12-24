package com.example.veritransferi;

import java.io.Serializable;

public class Kisiler implements Serializable {
    private int tcno;
    private String isim;

    private double boy;

    public Kisiler() {
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public Kisiler(int tcno, String isim, double boy) {
        this.tcno = tcno;
        this.isim = isim;
        this.boy = boy;



    }
}
