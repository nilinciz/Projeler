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

public class Exam9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Kaç adet fibonacci sayısı görmek istediğinizi giriniz: ");
    float n = input.nextFloat();
    float a = 1;
    float b = 1;
    float c;
    
    
    
        for (int i = 0; i < n; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }
    }
    
}
