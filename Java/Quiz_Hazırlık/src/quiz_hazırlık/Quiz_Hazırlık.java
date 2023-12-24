 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_hazırlık;

/**
 *
 * @author nilin
 */
import java.util.Scanner;
        
public class Quiz_Hazırlık {

    public static int faktoriyel (int k) {
        if (k<=1) {
            return 1;
        }
        else {
            return k*faktoriyel(k-1);
        }
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen bir sayı giriniz: ");
    int n = input.nextInt();
        System.out.println("Sonuç: "+faktoriyel(n));
    }
    
}
