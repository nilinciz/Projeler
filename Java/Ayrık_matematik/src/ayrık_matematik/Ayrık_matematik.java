/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayrık_matematik;

/**
 *
 * @author nilin
 */
import java.util.Scanner;

public class Ayrık_matematik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen bir N değeri giriniz: ");
    int sayi = input.nextInt();
    System.out.println("Çevirmek istediğiniz taban değerini giriniz: ");
    int taban_degeri = input.nextInt();
    int toplam = 0;
    int sayac = 0;
    while (taban_degeri<sayi){
        toplam = (int) ((toplam) + (sayi%taban_degeri) * (Math.pow(10, sayac)));
        sayi = (sayi / taban_degeri);
        sayac++;
    }
    toplam += sayi*Math.pow(10,sayac);
    System.out.println(taban_degeri+" tabanındaki değeri "+toplam);
     }
    }
     
    
    

