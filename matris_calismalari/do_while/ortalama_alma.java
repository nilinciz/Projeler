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
public class Do_while3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Kaç tane sayının ortalamasını almak istiyorsunuz: ");
    int N = input.nextInt();
    int sayi, toplam = 0;
        for (int i = 1; i <=N ; i++) {
            do {
                System.out.println(i+ ". sayıyı 1-100 arası giriniz: ");
                sayi=input.nextInt();
                
            } while (sayi<1 || sayi>100);
                toplam+=sayi;
           
        }
        double ort = toplam/N;
        System.out.println(N+ " sayının ortalaması"+ ort);
    
    
    }
    
}
