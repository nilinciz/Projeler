/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
public class Dijital_saat_yapna {

    public static int dijital(int saat, int dakika, int saniye) {
        saniye++;
        if (saniye == 60) {
            saniye = 0;
            dakika++;
            if (dakika == 60) {
                dakika = 0;
                saat++;

                if (saat == 24) {
                    saat = 0;
                }

            }
        }
        System.out.println(saat + ":" + dakika + ":" + saniye + ":");

        try {
            Thread.sleep(1000);//bir saniye bekle //uyutma ypısı sadece try catch ile kullanılıyor
            return dijital(saat, dakika, saniye);

        } catch (Exception ex) {
            return 0;

        }
    }
    public static void main(String[] args) {
        dijital(10,59,50);
    }
}

/**
 * static int zamanilerlet(int[] array) {
 * int saniye= array[0]; int dakika=array[1]; int saat=array[2]; 
 * int gun= array[3]; int ay=array[4]; int yil= array[5];
 * saniye++;
 *  saniye++;
        if (saniye == 60) {
            saniye = 0;
            dakika++;
            if (dakika == 60) {
                dakika = 0;
                saat++;

                if (saat == 24) {
                    saat=0;
                    * takvimilerlet(yil,ay,gun);
 * 
 * 
 */