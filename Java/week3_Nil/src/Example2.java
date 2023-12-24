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
     Scanner input = new Scanner(System.in);
     System.out.println("Lütfen bir sayı giriniz:");
     int sayi = input.nextInt();
     
     if (sayi%2==0) {// sayı 2'ye eşit mi?
         System.out.println(sayi+" çift bir sayıdır!");
}
       
     else { //sayı 2'ye eişt değilse
         System.out.println(sayi+ " tek bir sayıdır!");
     }
   
        
        
        
        
        // TODO code application logic here
    }
    
}
