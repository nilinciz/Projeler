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

public class Exam7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir N sayısı giriniz: ");
    float n = input.nextFloat();
    double t = 0;
    
        for (int i = 0; i <n-1; i++) {
            t = Math.pow(Math.pow(t-1,i/(2*i+1)*3), i);
           
            
        }
        System.out.println("Sonuç:"+Math.sqrt(12)*t);
        
    }
    
}
