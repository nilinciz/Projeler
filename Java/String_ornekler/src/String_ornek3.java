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

public class String_ornek3 {
//CUMLEYİ TERSTEN BÜYÜK KÜÇÜK YAZDIRAN PROGRAM 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tersten büyük küçük yazdırmak istediğiniz cümle: ");
        String cumle = input.nextLine();
        int sayac = 1;
        
        
        for (int i = cumle.length() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(Character.toLowerCase(cumle.charAt(i)));
            } else {
                System.out.print(Character.toUpperCase(cumle.charAt(i)));
            }
        }
        sayac++;
    }

}













