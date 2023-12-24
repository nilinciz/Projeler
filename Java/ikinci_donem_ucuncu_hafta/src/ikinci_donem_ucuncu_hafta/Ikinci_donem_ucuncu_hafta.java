/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikinci_donem_ucuncu_hafta;

import java.util.Scanner;

/**
 *
 * @author nilin
 */
//ödev verdiği soru
public class Ikinci_donem_ucuncu_hafta {

    public static int sum(int k) {
        if (k > 0) {
            return k * sum(k - 1);
        } else {
            return 1;
        }
    }

     static double seriessum(int n) {
        if (n>1) {
            return(n/(double)sum(n))+seriessum(n-1);
        }
        else if(n==1) {
            return 1;
            
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        do {
            System.out.println("N>0 bir değer giriniz. ");
            N=input.nextInt();
        }while (N<0);
        double result= seriessum(N);
        System.out.println("Series sum: "+result);
        
    }

}
