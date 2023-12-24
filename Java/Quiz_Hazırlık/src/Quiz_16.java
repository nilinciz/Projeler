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
public class Quiz_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Tersi yazılacak cümleyi giriniz: ");
        String kelime = input.nextLine();
        cevir(kelime);
    }
    public static void cevir(String tersi) {
        for (int i = tersi.length()-1; i>=0; i--) {
            System.out.print(tersi.charAt(i));

        }
        
    
   
    }
    
}
