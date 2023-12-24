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
        System.out.println("Bir a sayı giriniz");
        int a = input.nextInt();
        System.out.println("Bir b sayısı giriniz");
        int b = input.nextInt();
        
        if (a%b==0) {
            System.out.println("a sayısı b sayısına bölünür");
        }
            else {
            System.out.println("a sayısı b sayısına bölünmez");
                    }
   
}
            
        }
        // TODO code application logic here
    
   
