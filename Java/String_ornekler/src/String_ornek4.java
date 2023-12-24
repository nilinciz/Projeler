
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
public class String_ornek4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cümle giriniz: ");
        String cumle = input.nextLine();
        
        for (int i = 0; i < cumle.length(); i++) {
            if ((cumle.charAt(i)>=65) &&(cumle.charAt(i)<=90) ){
                System.out.print((char)(cumle.charAt(i)+32)); 
            }
            else 
                System.out.print((char)(cumle.charAt(i)-32));
        }



    }

        
    
}
