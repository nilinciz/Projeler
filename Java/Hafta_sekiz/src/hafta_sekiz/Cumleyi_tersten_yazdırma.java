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

public class Cumleyi_tersten_yazdırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
    System.out.println("Lütfen cümle giriniz: ");
    String cumle = input.nextLine();
    
        for (int i = cumle.length()-1; i>=0; i--) {
            System.out.print(cumle.charAt(i));
            System.out.print(" ");
            
        }
    }
    
    
}
