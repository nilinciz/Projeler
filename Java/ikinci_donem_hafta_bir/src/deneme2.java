/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class deneme2 {
    
    static int[][] randomnoturet(int row, int col)
    {
        int[][] not = new int[row][col];
        Random r = new Random();
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                not[i][j] = (int) (0 + (100-0)*r.nextDouble());
            }
        }
        return not; 
   }
    
    static int[] bul_maxdersnot(int[][] not)
    {
        int row = not.length;// 2D dizideki satır sayısı 
        int col = not[1].length;// 2D dizideki sütun sayısı
        int[] maxnot = new int[row];
        for (int i = 0; i < row; i++) { // satır
            maxnot[i] = not[i][0];
            for (int j = 0; j < col; j++) { // sütun
                if (maxnot[i]<not[i][j]) {
                    maxnot[i] = not[i][j];
                } 
            }        
        }
        return maxnot;        
    }
    
    static void yazdir_ogrencinot(int[][] not,int index)
    {
        int row = not.length;
        for (int i = 0; i < row; i++) {
            System.out.println((i+1)+" inci not:"+not[i][index]);
        }
        
    }
    static int bulmaxort(int[][] not)
    {
        int row = not.length;
        int col = not[1].length;
        
        // herbir sütuna (öğrenciye) ait ortalama bulmak
        int[] ort = new int[col];
        
        for (int j = 0; j < col; j++) {
            int toplam = 0;
            for (int i = 0; i < row; i++) {
                toplam +=not[i][j];
            }
            ort[j] = toplam / row;
        }
        
        // maksimum ortalamaya sahip öğrenci indeksini bulmak
        int index = 0;
        int maxort = ort[0];
        for (int i = 0; i < ort.length; i++) {
            if (ort[i]>maxort) {
                maxort = ort[i];
                index = i;
            }
        }
        
        return index;
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        
        int[][] notlar = randomnoturet(M,N);/* MXN lik 0-100 arası notlar 
                                           üretilecek. Satır dersi, Sütun ilgili 
                                           öğrenciyi temsil eder*/
        int[] maxnotlar = bul_maxdersnot(notlar);//Derslere ait maksimum notlar bulunur
        yazdir_ogrencinot(notlar,2); // 2. öğrenciye ait notlar yazdırılır
        int maxort_ogrenci = bulmaxort(notlar); 
        // Derslerdeki en yüksek ort sahip öğrenci bulunur
        
        
    }
    
}