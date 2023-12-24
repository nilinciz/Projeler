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
public class Quiz_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);    
        System.out.println("Bir n değeri giriniz: ");
    int n = input.nextInt();
        System.out.println("Bir x değeri giriniz: ");
    int x = input.nextInt();
    double t;
    double A[]=new double [n+1];
        for (int i = 0; i <= n; i++) {
            System.out.print("x^"+i+" nin katsayısı: ");
            A[i]=input.nextDouble();
            
        }
        t=A[0];
        for (int i = 1; i <=n; i++) {
            t+=A[i]*Math.pow(x,i);
        }
                    System.out.println("Sonuç: "+t);

    
    }
    
}
