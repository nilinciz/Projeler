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
public class String_ornek2 {

    //CUMLENİN TERSTEN YAZIMI
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tersini istediğiniz cümleyi giriniz: ");
        String cumle = input.nextLine();
        System.out.println("Ters yazılışı: ");
        for (int i = cumle.length()-1; i>=0; i--) {
            System.out.print(cumle.charAt(i));
        }
               


    }
    
}
