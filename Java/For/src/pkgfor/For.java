/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor;

/**
 *
 * @author nilin
 */
import java.util.Scanner; 

public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Bir N değeri giriniz:");
    int N = input.nextInt();
    int faktoriyel = 1;
    
    for (int i = 1; i <= N; i++) {
        faktoriyel = faktoriyel * i;
    }          
    System.out.println("N sayısının faktöriyeli:"+faktoriyel);
          
        }
    
        // TODO code application logic here
    }
        // TODO code application logic here
    
    
