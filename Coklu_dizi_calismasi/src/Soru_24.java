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

public class Soru_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Kare matrisin satır sayısı giriniz: ");
    int n = input.nextInt();
    int enksatir=0;
    int enksutun=0;
    int enbsatir=0;
    int enbsutun=0;
    int A[][]= new int [n][n];
    System.out.println("A matrisi: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A("+i+","+j+")= ");
                A[i][j]=input.nextInt();
                }    
                }
        int enk= A[0][0], enb =A[0][0]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j]<enk) {
                    enk=A[i][j]; enksatir=i; enksutun=j;
                        
                    }
                if (A[i][j]>enb) {
                    enb=A[i][j]; enbsatir=i;enbsutun=j;
                    
                    
                } }
                }
        System.out.println("Sonuçlar: ");
        System.out.println("-----");
        System.out.println("En küçük eleman: "+enk);
        System.out.println("Konum: "+(enksatir+1)+". satır ve " +(enksutun+1)+". sutunda.");
        System.out.println("En büyük eleman: "+enb);
        System.out.println("Konum: "+(enbsatir+1)+". satır ve "+(enbsutun+1)+". sutunda.");
        
        
            }
            
        }
   
               
