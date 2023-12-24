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

public class Quiz_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üst sınır belirleyiniz: ");
        int a = input.nextInt();
        int s;
        for (int i = 2; i <= a; i++) {
                       s=0;

            for (int j = 1 ; j <=i; j++) {
                if (i%j==0) {
                    s++;
                }
                
                }
                if(s==2){
                    System.out.println(i);
        }

    }
    }
}



