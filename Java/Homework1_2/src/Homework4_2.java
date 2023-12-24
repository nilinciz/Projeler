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

public class Homework4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Bir N sayısı giriniz:");
    double N = input.nextDouble();
    double sayac = 0;
    double karetoplam = 1;
    
    while (sayac<=N) {
        karetoplam  = karetoplam + Math.pow(N, 2);
        N = N - 1;
        sayac = sayac + 1;
       
    }
    System.out.println("N'e kadar olan sayıların kareleri toplamı"+karetoplam);
    
        // TODO code application logic here
    }
    
}
