/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube_methodlar;

/**
 *
 * @author nilin
 */
public class fibonacci_serisi {

    /**
     * @param args the command line arguments
     */
    //1 1 2 3 5 8 13 21
    static int fibo(int n){
        if (n==1 || n==2) {
            return 1;
        }
            return fibo(n-1)+fibo(n-2);
        }
    
    public static void main(String[] args) {
      System.out.println(fibo(8));
    }
    
}
