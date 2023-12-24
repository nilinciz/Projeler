/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube_methodlar;

import java.util.Scanner;

/**
 *
 * @author nilin
 */
public class Ters {

    /**
     * @param args the command line arguments
     */
    public static String tersine_cevir(String girilen) {
        String cevrilen = "";
        for (int i = girilen.length()-1; i>=0; i--) {
            cevrilen +=girilen.charAt(i);
        }
        return cevrilen;
        
    }

            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tersini istediğiniz kelimeyi giriniz: ");
        String kelime = input.nextLine();
        
        System.out.println(tersine_cevir(kelime));
    }
    
}
