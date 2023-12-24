package com.example.web2;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DuyuruVeri {
    public List<Duyuru> duyuruGetir() throws Exception {
        List<Duyuru> duyurular = new ArrayList<>();

        Connection baglanti=null;
        Statement ifade=null;
        ResultSet sonuc=null;

        try {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();
            String sql = "SELECT * FROM duyuru";
            ifade = baglanti.createStatement();
            sonuc = ifade.executeQuery(sql);

            while (sonuc.next()) {
                int id = sonuc.getInt("id");
                String ad = sonuc.getString("ad");
                String icerik = sonuc.getString("icerik");
                LocalDate gosterimtarihi = LocalDate.parse(sonuc.getString("gosterimtarihi"));
                LocalDate bitistarihi = LocalDate.parse(sonuc.getString("bitistarihi"));

                Duyuru duyuru1 = new Duyuru(id, ad, icerik, gosterimtarihi, bitistarihi);
                duyurular.add(duyuru1);
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            kapat(baglanti,ifade,sonuc);
        }

    return duyurular;

    }

    private void kapat(Connection baglanti, Statement ifade, ResultSet sonuc) throws Exception {
        try {
            if (sonuc != null) {
                sonuc.close();
            }
            if (ifade != null) {
                ifade.close();
            }
            if (baglanti != null) {
                baglanti.close();
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void duyuruEkle(Duyuru duyuru1) {
        Connection baglanti=null;
        PreparedStatement ifade=null;


        try{
            baglanti=VeritabaniBaglanti.veritabaniBaslat();
            String sql="INSERT INTO duyuru(ad,icerik,gosterimtarihi,bitistarihi) VALUES(?,?,?,?)";
            ifade=baglanti.prepareStatement(sql);
            ifade.setString(1, duyuru1.getAd());
            ifade.setString(2, duyuru1.getIcerik());
            ifade.setDate(3, Date.valueOf(duyuru1.getGosterimtarihi()));
            ifade.setDate(4, Date.valueOf(duyuru1.getBitistarihi()));
            ifade.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ifade != null) {
                    ifade.close();
                }
                if (baglanti != null) {
                    baglanti.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void duyuruSil(int duyuruId) {
        Connection baglanti=null;
        PreparedStatement ifade=null;

        try {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();
            String sql="DELETE FROM duyuru WHERE id=?";
            ifade=baglanti.prepareStatement(sql);
            ifade.setInt(1,duyuruId);
            ifade.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
