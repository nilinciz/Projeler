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
public class Ayrık_matematik2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen N değeri giriniz: ");
    int sayi = input.nextInt();
    int sayilar[]=new int [sayi+1];
          for (int i = 2; i <= sayi; i++) {
              if (sayilar[i]==0) {
             for (int j = i+i; j <= sayi; j=j+i) {
                    sayilar[j]=1;   
          }
          }
          }

        int sayac =0;
        for (int i = 2; i <=sayi; i++) {
            if (sayilar[i]==0) {
                sayac++;   
                System.out.println(i);

            }
        }
        System.out.println(sayi+" sayısına kadar "+sayac+" asal sayı vardır.");
 
}
}

