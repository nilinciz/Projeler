package com.example.web1;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class OgrenciVeri {
    public List<Ogrenci> ogrenciGetir() throws Exception {
        List<Ogrenci> ogrenciler = new ArrayList<>();

        Connection baglanti=null;
        Statement ifade=null;
        ResultSet sonuc=null;

        try {
            baglanti=VeritabaniBaglanti.veritabaniBaslat();
            String sql="SELECT * FROM ogrenci";
            ifade=baglanti.createStatement();
            sonuc=ifade.executeQuery(sql);

            while(sonuc.next()){
                int id=sonuc.getInt("id");
                String isim=sonuc.getString("isim");
                String soyisim=sonuc.getString("soyisim");
                String eposta=sonuc.getString("eposta");

                Ogrenci ogr1=new Ogrenci(id,isim,soyisim,eposta);
                ogrenciler.add(ogr1);
            }
            return ogrenciler;
        }
        finally {
            kapat(baglanti,ifade,sonuc);
        }
    }

    private void kapat(Connection baglanti, Statement ifade, ResultSet sonuc) throws Exception {
        if(sonuc!=null){
            sonuc.close();
        }
        if(ifade!=null){
            ifade.close();
        }
        if(baglanti!=null){
            baglanti.close();
        }
    }

    public void ogrenciEkle(Ogrenci ogrenci1) {
        Connection baglanti=null;
        PreparedStatement ifade=null;
        ResultSet sonuc=null;

        try{
            baglanti=VeritabaniBaglanti.veritabaniBaslat();
            String sql="INSERT INTO ogrenci(isim,soyisim,eposta) VALUES(?,?,?)";
            ifade=baglanti.prepareStatement(sql);
            ifade.setString(1,ogrenci1.getIsim());
            ifade.setString(2,ogrenci1.getSoyisim());
            ifade.setString(3,ogrenci1.getEposta());
            ifade.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void ogrenciSil(int ogrenciId) {
        Connection baglanti=null;
        PreparedStatement ifade=null;
        ResultSet sonuc=null;

        try {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();
            String sql="DELETE FROM ogrenci WHERE id=?";
            ifade=baglanti.prepareStatement(sql);
            ifade.setInt(1,ogrenciId);
            ifade.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
