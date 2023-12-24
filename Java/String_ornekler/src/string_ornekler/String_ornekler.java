 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_ornekler;

/**
 *
 * @author nilin
 */
import java.util.Scanner;
public class String_ornekler {
//ARANAN HARFTEN KAÇ TANE OLDUĞUNU VE YERİNİ YAZDIRAN PROGRAM
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen cümle giriniz: ");
        String cumle = input.nextLine();
        cumle = cumle.toLowerCase();
        System.out.println("Lütfen harf giriniz: ");
        char aranan = input.next().charAt(0);
        int c[]=new int [100];
        int sayac=0;
       for (int i = 0; i <cumle.length(); i++) {
          if (cumle.charAt(i)==aranan) {
              sayac++;
              c[sayac-1]=i+1;
                }
            
        }
                System.out.println("Belirtilen harften "+sayac+" tane var.");
                System.out.println("Yerleri: ");
                            for (int i = 0; i < sayac; i++) {
                                System.out.println(c[i]);
        }

 }   

    
}
