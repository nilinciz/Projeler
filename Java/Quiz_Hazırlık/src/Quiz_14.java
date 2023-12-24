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
public class Quiz_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("Bir N değeri giriniz: ");
        int N = input.nextInt();
        int A[][]= new int [N][N];
        int B[]=new int[N];
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
            System.out.print("A("+(i)+","+(j)+")=");
            A[i][j]=input.nextInt();       
            }
        }
        for (int i = 1; i < N ; i++) {
            B[i]=0;
            for (int j = 1; j < N; j++) {
                B[i]+=A[i][j];
                  
        }
            System.out.println("Sonuç: "+B[i]);
        }

    }

}

    
    

