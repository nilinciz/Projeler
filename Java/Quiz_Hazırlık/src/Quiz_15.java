 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
//HER BİR SATIRDAKİ ELEMANLARI KENDİ ARALARINDA KÜÇÜKTEN BÜYÜĞE SIRALAYAN PROGRAM
import java.util.Scanner;
public class Quiz_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Kare matrisin tipini giriniz: ");
        int n = input.nextInt();
        int A[][]= new int [n][n];
        int B[][][]=new int[n][n][n];
        int f;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A("+(i+1)+","+(j+1)+")=");
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][i][j]=A[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (B[i][i][k]<B[i][i][j]) {
                        f=B[i][i][j];
                        B[i][i][j]=B[i][i][k];
                        B[i][i][k]=f;
                        System.out.print(f+" ");

                    }

                }  
            }
        }

    }

}

