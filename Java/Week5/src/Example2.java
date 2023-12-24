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
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Bir alt sınır giriniz: ");
    int altsinir = input.nextInt();
    System.out.println("Bir üst sınır giriniz: ");
    int ustsinir = input.nextInt();
    
    System.out.println("Klavyeden girilen alt ve üst sınır aralığındaki 9'a bölünen sayılar: ");
    
        for (int sayi=altsinir; sayi<=ustsinir; sayi++) {
            
            if (sayi%9==0) {
                System.out.print(sayi);
                sayi++;
            }
            else{
                sayi++;
        }
        System.out.println();
    }
    
}
}