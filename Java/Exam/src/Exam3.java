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

public class Exam3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir x değeri giriniz: ");
    float x = input.nextFloat();
    double fx = Math.pow(x, 2)-5*2+3;
    
        if (fx<0) {
            fx=1;
        }
        if (fx==0) {
            fx=0;
        }
        if (fx>0) {
            fx=1;
        }
    System.out.println("F(x) değeri: "+fx);
    
               
            }
        
                
            }
            
        
        
    
    

