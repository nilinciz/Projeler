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
    System.out.println("Bir N sayısı giriniz: ");
    int N = input.nextInt();
    System.out.println("Bir X sayısı giriniz: ");
    int X = input.nextInt();
    
    double toplam = 1;
    int faktoriyel = 1;
        for (int i = 1; i < N; i++) {
            faktoriyel = faktoriyel * i;
            toplam = toplam + Math.pow(X, i)/faktoriyel;
        }
        System.out.println("Toplam: "+toplam);
    }
    
}
