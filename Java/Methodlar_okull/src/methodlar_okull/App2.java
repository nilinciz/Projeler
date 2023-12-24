package methodlar_okull;

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

public class App2 {

    /**
     * @param args the command line arguments
     */
    public static void dizi_yazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + " . dizi elemanı: " + dizi[i]);
        }
    }

    public static void rastgele_ata(int[] dizi) {
        Random rnd = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(50);
        }
    }

    static void minmax_bul(int[] dizi) {
        int min = dizi[0];
        int max = dizi[0];
        int max_idx = 0;
        int min_idx = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (min > dizi[i]) {
                min = dizi[i];
                min_idx = i;
            }
            if (dizi[i] > max) {
                max = dizi[i];
                max_idx = i;
            }
        }
        System.out.println("Dizinin en küçük elemanı " + min_idx + " indeks ve değeri " + min);
        System.out.println("Dizinin en büyük elemanı " + max_idx + " indeks ve değeri " + max);
    }

    static int[] randomdizi(int N) {
        Random rnd = new Random();
        int[] rastgele = new int[N];
        for (int i = 0; i < rastgele.length; i++) {
            rastgele[i] = rnd.nextInt(50);
        }
        return rastgele;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] sayilar = new int[10];
        rastgele_ata(sayilar);
        dizi_yazdir(sayilar);
        minmax_bul(sayilar);
        int[] rastgele_dizi = randomdizi(5);
        dizi_yazdir(rastgele_dizi);
        minmax_bul(rastgele_dizi);
    }
}
