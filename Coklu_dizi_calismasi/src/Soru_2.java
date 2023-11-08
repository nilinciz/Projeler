/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
import static java.awt.PageAttributes.MediaType.A;
import java.util.*;
import static javafx.scene.input.KeyCode.A;
import static javax.print.attribute.standard.MediaSize.Engineering.A;
import static javax.print.attribute.standard.MediaSizeName.A;
import static javax.swing.text.html.HTML.Tag.A;

public class Soru_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matrisin tipini giriniz: ");
        int n = input.nextInt();
        int A[][] = new int[n][n];
        System.out.println("A matrisi: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + (i) + "," + (j) + "]=");
                A[i][j] = input.nextInt();
                

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();

        }
        refhesapla(A[][],n);
        
        

    }
    int refhesapla(int A[][], int n){
        if (A[1][0] != 1 || A[1][1] != 1) {
            A[1][0] = A[1][0] / A[1][0];
            A[1][1] = A[1][1] / A[1][0];
        }
        if (A[0][0] != 1 || A[0][1] != 1) {
            A[0][0] = A[0][0] / A[0][0];
            A[0][1] = A[0][1] / A[0][0];
        }
        System.out.println("REF Matris hali:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        
    }
        return n;
}
}

