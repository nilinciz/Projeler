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

public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println();
    int sayac = 1;
    int toplam = 0;
    
    while (sayac <= 5) {
            toplam = toplam +sayac;
            sayac++;
    }
    
    System.out.println("1'den 5'e kadar olan sayıların toplamı: "+toplam);
        // TODO code application logic here
    }
    
}
