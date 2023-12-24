/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1_2;

/**
 *
 * @author nilin
 */
import java.util.Scanner;

public class Homework1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Bir N değeri giriniz:");
    double N = input.nextDouble();
    double faktoriyel = 1;
    
    while (N > 0) {
        faktoriyel =  faktoriyel * N;
                N = N - 1;
    }
    System.out.println("N sayısının faktöriyeli:"+faktoriyel);
    }
        // TODO code application logic here
    }
    

