
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
public class String_ornek5 {

    /**
     * @param args the command line arguments
     */
    //SESLİ HARFLERİN YERİNİ VE SAYISINI BULAN PROGRAM 
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);    
        System.out.println("Lütfen cümle giriniz: ");
    String cumle = input.nextLine();
    int sayac =0;
    cumle = cumle.toLowerCase();
    char sesliharf[]={'a','e','ı','i','o','ö','u','ü'};
    int yer []= new int [cumle.length()];
        for (int i = 0; i < cumle.length(); i++) {
            for (int j = 0; j < sesliharf.length; j++) {
                if (cumle.charAt(i)==sesliharf[j]) {
                    yer[sayac]=i+1;
                    sayac++;
          
                }
            }
            
        }
        for (int i = 0; i < sayac; i++) {
            System.out.print("Sesli harfin yeri: " +yer[i]+ " ");
            
        
        }
        System.out.println();
    
            System.out.println("Toplam ünlü harf sayısı: " + sayac);

    
    
    }
    
}
