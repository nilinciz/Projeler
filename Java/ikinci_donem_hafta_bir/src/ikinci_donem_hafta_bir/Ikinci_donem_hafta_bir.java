/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikinci_donem_hafta_bir;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nilin
 */
//int tipindeki diziye 0-100 arası rastgele sayı atayan metot
public class Ikinci_donem_hafta_bir {

    /**
     * @param args the command line arguments
     */
    static void rastgeleata (int[] dizi) {
    Random r = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int) (0+ (100-0)*r.nextDouble());
            
        }
    }
    
    static void diziyazdir (int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+". eleman: "+ dizi[i]);
        }
    }
    

    
    public static void main(String[] args) {
        int[] sayi=new int[10];
        rastgeleata(sayi);
        diziyazdir(sayi);



}
    
}
