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
public class yildiz_5 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
           Scanner input = new Scanner (System.in);
           System.out.println("Lütfen bir N sayısı giriniz: ");
           int n = input.nextInt();
           for (int i = 1; i <=n; i++) {
               for (int j = 1; j <=i; j++) {
               System.out.print("  ");
               }
               for (int j = i; j <=n; j++) {
               System.out.print("* ");

               }
               System.out.println();
           }


    }
    
}
