/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
public class Gün_ay_yıl {

    public static int gunayyil(int gun, int ay, int yil, int saat) {
        saat++;
        if (saat == 24) {
            saat = 0;
            gun++;
            if (gun == 31) {
                gun = 1;
                ay++;
                if (ay == 13) {
                    ay = 1;
                    yil++;
                }
            }
        }
        System.out.println(gun + "/" + ay + "/" + yil + ":" + saat );
        try {
            Thread.sleep(1000);//bir saniye bekle //uyutma yapısı sadece try catch ile kullanılıyor
            return gunayyil(gun, ay, yil, saat);

        } catch (Exception ex) {
            return 0;

        }
    }

    public static void main(String[] args) {
        gunayyil(29, 11, 21, 23);
    }

}
