/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yildiz_calisma;

/**
 *
 * @author nilin
 */
import java.util.Scanner;

public class Yildiz_calisma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            System.out.print("*");

            System.out.println("");

        }
    }

}
