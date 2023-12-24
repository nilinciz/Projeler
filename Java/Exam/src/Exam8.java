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

public class Exam8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Bir N değeri giriniz:");
    float n = input.nextFloat();
    float c = 1;
    float c1 = 0;
        for (int i =1; i < n ; i++) {
            c1= 4*i*i;
            c=c*c1/(c1-1);
        }
            System.out.println("Sonuç:"+2*c);
        
    
    
    
}
}