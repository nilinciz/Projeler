/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
import java.util.Random;
import java.util.Scanner;

public class ikinci_ornek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();

        int[][] notlar = randomnoturet(M, N); //MxN lik 0-100 arasu notlar üretilecek. Satır dersi, sütun ilgili öğrenciyi temsil eder.
        int[] maxnot = bul_maxdersnot(notlar); //Derslere ait max notlar yazdırılır.
        yazdir_ogrencinot(notlar, 2);//2. öğrenciye ait notlar yazdırılır.
        int maxort_ogrenci = bulmaxort(notlar);//derslerdeki en yüksek ort sahip öğrenci bulunur.

    }

    static int[][] randomnoturet(int n, int m) {
        Random r = new Random();
        int[][] not = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                not[i][j] = (int) (0 + (100 - 0) * r.nextDouble());
                System.out.print(not[i][j]+" ");
                
            } 
             System.out.println();
        }
       
        
        return not;

    }

    static int[] bul_maxdersnot(int[][] not) {
        int n = not.length; //2D  dizideki satır sayısı 
        int m = not.length;//2D dizideki sütun sayısı
        int[] maxnot = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

            int max = not[i][j];
            }
            for (int j = 0; j < m; j++) {
                if (maxnot[i] < not[i][j]);
                maxnot[i] = not[i][j];
                System.out.print(maxnot[i]+" ");
            }
        }
        return maxnot;
    }

    static void yazdir_ogrencinot(int[][] not, int ogrenci) {
        int n = not[0].length;
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". not: " + not[i][ogrenci]);
        }
    }

    static int bulmaxort(int[][] not) {
        int n = not[0].length;
        int m = not[1].length;
        //her bir sütuna ait ort bulma 
        int[] ort = new int[m];
        for (int j = 0; j < m; j++) {
            int toplam = 0;
            for (int i = 0; i < n; i++) {
                toplam += not[i][j];

            }
            ort[j] = toplam / m;
        }
        //max ort sahip öğrenci bulma
        int ogrenci = 0;
        int maxort = ort[0];
        for (int i = 0; i < ort.length; i++) {
            if (ort[i]>maxort) {
                maxort=ort[i];
                ogrenci =i;
                
            }
        }
        return ogrenci;
    }
}
