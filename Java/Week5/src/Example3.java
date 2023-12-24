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
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Kaç tane sayı gireceksiniz?: ");
    int N = input.nextInt();
    int toplam = 0;
    
        for (int i = 1; i <= N; i++) {
            System.out.println(i+ " .sayıyı giriniz:");
            int sayi = input.nextInt();
            int basamak = sayi%10;
            toplam = basamak+toplam;
        }
            
    System.out.println("Birler basamağı toplam: "+toplam);
        }
        // TODO code application logic here
    }
    

