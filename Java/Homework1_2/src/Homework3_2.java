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

public class Homework3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Bir N sayısı giriniz:");
    double N = input.nextDouble();
    double sayac = 1;
    
    while (N > 9){
        N = N / 10;
        sayac++;
    }
    System.out.println("N sayısının basamak sayısı:"+sayac);
    }
    
        
    }
    

