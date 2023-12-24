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
public class Youtube_methodlar {
//üs alma işlemi 
    /**
     * @param args the command line arguments
     */
   static int power (int a, int b) {
        int result=1;
        for (int i = 0; i <=b; i++) {
           result*=a;
           
       }
        return result;
   }
    static void power2 (int a, int b) {
        int result =1;
        for (int i = 0; i <=b ; i++) {
            result*=a;
        }
               System.out.println(result);
    }
    public static void main(String[] args) {
    int r2= power(10,2);
    System.out.println(r2);
    

    }
    
}
