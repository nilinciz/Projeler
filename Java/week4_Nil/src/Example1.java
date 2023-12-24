/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
import java.util.Scanner;

public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("1'den 12'ye kadar bir sayı giriniz: ");
    double sayi = input.nextDouble();
    
        if (sayi==1) {
        System.out.println("Ay: Ocak");
        System.out.println("Mevsim: Kış");
    }
        else if (sayi==2) {
        System.out.println("Ay: Şubat");
        System.out.println("Mevsim: Kış");
    }
        else if (sayi==3) {
        System.out.println("Ay: Mart");
        System.out.println("Mevsim: İlkbahar");
    }
        else if (sayi==4) {
        System.out.println("Ay: Nisan");
        System.out.println("Mevsim: İlkbahar");

    }
    else if (sayi==5) {
        System.out.println("Ay: Mayıs");
        System.out.println("Mevsim: İlkbahar");

    }
     else if (sayi==6) {
        System.out.println("Ay: Haziran");
        System.out.println("Mevsim: Yaz");

     }
    else if (sayi==7) {
        System.out.println("Ay: Temmuz");
        System.out.println("Mevsim: Yaz");

     }
    else if (sayi==8) {
        System.out.println("Ay: Ağustos");
        System.out.println("Mevsim: Yaz");

     }
    else if (sayi==9) {
        System.out.println("Ay: Eylül");
        System.out.println("Mevsim: Sonbahar");

    }
    else if (sayi==10) {
        System.out.println("Ay: Ekim");
        System.out.println("Mevsim: Sonbahar");
            }
    else if (sayi==11) {
        System.out.println("Ay: Kasım");
        System.out.println("Mevsim: Sonbahar");
     }
    else if (sayi==12) {
        System.out.println("Ay: Aralık");
        System.out.println("Mevsim: Kış");
     }
    }
}






    