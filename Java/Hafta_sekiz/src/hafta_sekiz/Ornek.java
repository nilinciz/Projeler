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
public class Ornek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen cümleyi giriniz: ");
    String cumle =input.nextLine();
    
        for (int i = 0; i < cumle.length(); i++) {
            System.out.println(cumle.charAt(i)+""+(i+1));
            
            
        }
    }
    
}
