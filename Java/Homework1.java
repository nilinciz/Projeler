/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework1;

/**
 *
 * @author nilin
 */
import java.util.Scanner;

public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen kenar uzunluğu (cm) giriniz: ");
        double a = input.nextDouble();
        System.out.println("Lütfen yüksekliği (cm) giriniz: ");
        double b = input.nextDouble();
        double alan = a*b/2;
        System.out.println("Üçgenin alanı: "+alan);
        }
    
}
