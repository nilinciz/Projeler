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

public class Exam6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner (System.in);
    System.out.println("Bir x değeri giriniz: ");
    float x = input.nextFloat();
    float t = 2;
    float f = 1;
  
        for (int i = 1; i <x; i++) {
            f=f*(2*i+1);
            t = t+(2*i+2)/f;
            
            
            
        }
        System.out.println("Sonuç:"+t);
    }
    
}
