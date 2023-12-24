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
public class Tersine_cevirme {

    /**
     * @param args the command line arguments
     */
    
        
    
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Tersi yazılacak kelime: ");
    String kelime = input.nextLine();
        System.out.print(tersine_cevir(kelime));
    }
    public static String tersine_cevir(String girilen){
        String cevrilen = "";
        for (int i = girilen.length()-1; i >= 0; i--) {
            cevrilen = cevrilen+(girilen.charAt(i));
        }
                return cevrilen;

    
}
}
