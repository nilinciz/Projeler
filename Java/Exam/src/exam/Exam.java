/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author nilin
 */
import java.util.Scanner;

public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner (System.in);
    System.out.println("Lütfen bir N sayısı giriniz: ");
    int N = input.nextInt();
    System.out.println("Lütfen bir R sayısı giriniz: ");
    int R = input.nextInt();
    float f1 = 1;
    float f2 = 1;
    float f3 = 1;
    
        
    for (int i = 1; i <=N; i++) {
        f1 = f1 * i;
    }
    for (int j = 1; j <=R  ; j++) {
        f2 = f2 * j;
        }
    for (int m = 1; m <=N-R; m++) {
        f3=f3*m;
        }
  
    float k = f1/(f2*f3);
    System.out.println("Sonuç:"+k);
                     
              
}
    
}

    


