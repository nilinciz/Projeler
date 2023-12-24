/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekrar_calisma;

/**
 *
 * @author nilin
 */
import java.util.Scanner;
public class Tekrar_calisma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Tersi yazılacak kelimeyi giriniz: ");
    String kelime = input.nextLine();
        System.out.println(tersine_cevir(kelime));
    //Method çağrılır. 
    }
    //Methodu yazalım 
    public static String tersine_cevir(String girilen) { 
    String cevrilen = "";
        for (int i = girilen.length()-1 ; i >=0 ; i--) {
                        cevrilen = cevrilen+(girilen.charAt(i));

        }
                        return cevrilen;

    }

}
