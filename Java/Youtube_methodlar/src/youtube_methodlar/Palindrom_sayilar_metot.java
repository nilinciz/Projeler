/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube_methodlar;

/**
 *
 * @author nilin
 */
import java.util.Scanner;
public class Palindrom_sayilar_metot {

    /**
     * @param args the command line arguments
     */
    //121 için
    //121%10=1 (int olarak değer aldık), yeni=1, 121/10=12
    //12%10=2, yeni=yeni*10+2=12, 12/10=1
    //1%10=1, yeni=yeni*10+1=121
    static boolean isPalindrom(int input){
        int tmp, tersSayi=0, kalan;
        tmp=input;
        while (tmp!=0) {
            kalan = tmp%10;
            tersSayi=tersSayi*10+kalan;
            tmp/=10;
        }
        if (input==tersSayi) {
            return true;
        }
            else 
            return false;
        }
    
    public static void main(String[] args) {
    System.out.println(isPalindrom(12221));
    
    }
    
}
