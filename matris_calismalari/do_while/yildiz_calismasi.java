/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_while;

/**
 *
 * @author nilin
 */
import java.util.Scanner;
public class Do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N;
    do {
        System.out.println("Lütfen pozitif bir N sayısı giriniz: ");
        N = input.nextInt();
    } while (N<0);
    
    
        for (int i = 1; i <=N; i++) {
            for (int j = i; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            
    
            System.out.println();
    
}
}




    

