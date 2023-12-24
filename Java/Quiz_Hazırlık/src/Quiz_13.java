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
public class Quiz_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input  = new Scanner (System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int n =input.nextInt();
        int A[]=new int[n];
        int g;
        for (int i = 0; i < n; i++) {
            System.out.print("A("+(i+1)+")=");
            A[i]=input.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (A[j]<A[i]) {
                    g=A[i];
                    A[i]=A[j];
                    A[j]=g;
                    
                }
            }
        }
                    System.out.println("Sıralı dizi: ");
        for (int i = 0; i < n; i++) {
            System.out.println("A("+(i+1)+")="+A[i]);
        }


    }
    
}
