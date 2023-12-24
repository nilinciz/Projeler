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

public class Exam10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Bir sayı giriniz: ");
    float n = input.nextFloat();
    
        for (int i = 2; i < n ; i++) {
            
            if (n%i==0) {
                System.out.println("Sayı asal değildir.");
                break;
            }
            if (n%i!=0) { 
                System.out.println("Sayı asaldır.");
                break;
        }
        }
                     

               
            }
            
        }
    
    

