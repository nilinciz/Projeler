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

public class Homework2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Bir N sayısı giriniz:");
    double N = input.nextDouble();
    double toplam = 0;
    
    while (N>0) {
        toplam = toplam + N;
        N = N-1;
    }
    System.out.println("N'e kadar olan sayıların toplamı:"+toplam);
    
        // TODO code application logic here
    }
    
}
