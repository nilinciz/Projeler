/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
public class Fibonacci_serisi {

    

    /**
     * @param args the command line arguments
     */
    //1 1 2 3 5 8 13 21
    static int fibo(int n){
        if (n==1 || n==2) {
            return 1;
        }
        else {
            return fibo(n-1)+fibo(n-2); //kendinden önceki iki sayının toplamı
        }
    }
    
    public static void main(String[] args) {
        
        
        for (int i = 1; i <= 4; i++) {
            int num = fibo(i);        
            System.out.println(num);

        }
    }
    
}