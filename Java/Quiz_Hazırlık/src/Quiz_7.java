/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
//MÜKEMMEL SAYI BULMA PROGRAMI
import java.util.Scanner;
public class Quiz_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);    // TODO code application logic here
        System.out.println("Lütfen bir sayı giriniz: ");
    int sayi = input.nextInt();
    int toplam  = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0) {
               toplam=toplam+i; 
            }
        }
        if (sayi==toplam) {
            System.out.println("Sayi mükemmel sayıdır.");
        }
        else 
            System.out.println("Sayı mükemmel sayı değildir.");
    }
    
    
}
