/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
   import java.util.Random;

public class NewClass {



    // bir int dizisine 0-100 arası rasgele değerler atayan metot
    static void rasgeleata(int[] dizi)
    {
        Random r = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (0 + (100-0)*r.nextDouble());
        }
    }
    // bir int dizisinin elemanlarını yazdıran metot
    static void diziyazdir(int[] dizi)
    {
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+" inci eleman: "+dizi[i]);
        }
    }

    
    public static void main(String[] args) {
        int[] sayi = new int[10];
        rasgeleata(sayi);
        diziyazdir(sayi);
        System.out.println();
        int[] rasgeledizi = new int[20];
        rasgeleata(rasgeledizi);
        diziyazdir(rasgeledizi);
    }
    
}
 

