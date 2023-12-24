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
public class Hafta_sekiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen cümleyi giriniz: ");
    String cumle = input.nextLine();
    
    System.out.println("Lütfen cümlenin içinde aramak istediğiniz harfi giriniz: ");
    char harf = input.nextLine().charAt(0);
    
    int sayac = 0;
        for (int i = 0; i <cumle.length(); i++) {
            if (Character.toUpperCase(cumle.charAt(i))==Character.toUpperCase(harf)) {
                //büyük harf almak için upper case kalıbını kullanıyoruz.
                sayac++;   
            }
           
        }
        System.out.println("Aratılan harf "+harf+" cümlede toplam "+sayac+" kere geçmektedir.");
    
    }
    
}
