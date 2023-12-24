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
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir N değeri giriniz");
    double N = input.nextDouble();
    int sayi = 1;
    double tektoplam = 0;
    double cifttoplam = 0;
    
        while (sayi<=N){
        if (sayi%2==0) {
        cifttoplam = cifttoplam + sayi;

        }
        else {
        tektoplam = tektoplam + sayi;
        }
        sayi = sayi + 1;
        }
        System.out.println("Tek sayıların toplamı: "+tektoplam);
        System.out.println("Çift sayıların toplamı: "+cifttoplam);


        
        
    }
        
        // TODO code application logic here
    }
    

