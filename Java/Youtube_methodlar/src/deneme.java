/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
public class deneme {

    /**
     * @param args the command line arguments
     */
    static void power(int a, int b) {
        int result = 1 ;
        for (int i = 1; i <= b; i++) {
            result*=a;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        power(10,2);
    }
    
}
