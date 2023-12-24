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

public class Quiz_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        int c;
        for (int i = 1; i <=sayi1 * sayi2; i++) {
            if ((i % sayi1 == 0) && (i % sayi2 == 0)) {
                System.out.printf("Okek: " + i);
                    break;
            }

        }
        if (sayi1 > sayi2) {
            c = sayi1;
        } else {
            c = sayi2;
        }
        for (int i = c; i >0 ; i--) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                System.out.println(" Obeb: " + i);
                break;
            }
        }
    }
}
