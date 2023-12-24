/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme1;

/**
 *
 * @author nilin
 */
import java.util.Scanner;

public class Deneme1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matris tipini giriniz: ");
        int i, j, n;
        n = input.nextInt();
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        int C[][] = new int[n][n];
        System.out.println("A matrisi: ");
        System.out.println("-----");
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print("A[" + k + "," + l + "]= ");
                A[k][l] = input.nextInt();

            }
        }
        System.out.println("B matrisi: ");
        System.out.println("-----");
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print("B[" + k + "," + l + "]= ");
                B[k][l] = input.nextInt();
            }
        }
        System.out.println("A+B=C matrisi: ");
        System.out.println("-----");
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                C[k][l] = A[k][l] * B[k][l];
                System.out.print(C[k][l] + "\t");
            }
            System.out.println();  
        }

    }
}
