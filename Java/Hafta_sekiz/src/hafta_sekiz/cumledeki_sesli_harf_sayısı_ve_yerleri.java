/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta_sekiz;

/**
 *
 * @author nilin
 */
import java.util.Scanner;

public class cumledeki_sesli_harf_sayısı_ve_yerleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cümle giriniz: ");
        String cumle = input.nextLine();
        cumle = cumle.toLowerCase();
        char[] sesli = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};
        int sayac = 0;
        int[] yer = new int[cumle.length()];
        for (int i = 0; i < cumle.length(); i++) {
            for (int j = 0; j < sesli.length; i++) {
                if (cumle.charAt(i) == sesli[j]) {
                    yer[sayac] = i + 1;
                    sayac++;
                }
            }

        }
        for (int j = 0; j < yer.length; j++) {
            System.out.println(yer[j]);
        }

        System.out.println("Toplam ünlü harf sayısı: " + sayac);

    }
}
