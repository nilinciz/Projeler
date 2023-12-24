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

public class Quiz_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Pozitif bir tamsayı giriniz: ");
    int n = input.nextInt();
    int t1=0, t2=0, t3=0;
        for (int i = 1; i <=n ; i++) {
            t1+=i;
        }
        for (int i = 1; i <=n ; i+=2) {
            t2+=i;
        }
        for (int i = 2; i <=n ; i+=2) {
            t3+=i;
        }
    System.out.println("n den "+n+" e kadar sayıların toplamı: "+t1);
    System.out.println("1 den "+n+" e kadar tek sayıların toplamı: "+t2); 
    System.out.println("1 den"+n+" e kadar çift sayıların toplamı: "+t3);
}
    }
