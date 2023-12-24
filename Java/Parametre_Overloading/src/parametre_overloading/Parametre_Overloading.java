/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametre_overloading;

/**
 *
 * @author nilin
 */
public class Parametre_Overloading {

    /**
     * @param args the command line arguments
     */
    public static void yaziyazanfonksiyon(String parametre) {
        System.out.println(parametre);
    }
    public static void yaziyazanfonksiyonukullan(String birinciparametresi, String ikinciparametresi) {
      yaziyazanfonksiyon(birinciparametresi+" "+ikinciparametresi+" ! ");
    }
    public static void yaziyazanfonksiyonsayiylakullan(int birincisayi, int ikincisayi, String kelime) {
        yaziyazanfonksiyon("Birinci sayı: "+birincisayi+" İkinci sayı: "+ikincisayi+"--"+kelime);
    }
            
}
