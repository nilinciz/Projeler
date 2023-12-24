/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coklu_dizi_calismasi;

/**
 *
 * @author nilin
 */
import java.util.Scanner;

public class Coklu_dizi_calismasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Matrisin tipini giriniz: ");
    int n=input.nextInt();
    int A[][]= new int [n][n];
    System.out.println("A matrisi: ");
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A["+(i+1)+","+(j+1)+"]=");
                A[i][j]=input.nextInt();
                
                
            }
            
        }
    
    
    }
    
}
