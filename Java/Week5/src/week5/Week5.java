/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author nilin
 */
import java.util.Scanner;
 
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir N değeri giriniz: ");
    int N = input.nextInt();
    int faktoriyel = 1;
    
        for (int sayac = 1; sayac<=N ; sayac++) {
            faktoriyel = sayac * faktoriyel;
            
            
        }
     System.out.println();
     System.out.println("N!:"+faktoriyel);
                   
            
                
                
            
            
        
        }
         
    }




    
        // TODO code application logic here
    
    

