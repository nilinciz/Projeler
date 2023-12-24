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
public class Quiz_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Kaç tane eleman girmek istiyorsunuz? ");
        int eleman=input.nextInt();
        int A[]=new int[eleman];
        int enb, enk, enbyer, enkyer;
        for (int i = 0; i < eleman; i++) {
            System.out.print("A("+(i+1)+")=");
            A[i]=input.nextInt();
        }
        enk=enb=A[0]; enkyer=enbyer=0;
        for (int i = 1; i < eleman; i++) {
            if (A[i]<enk) {
                enk=A[i]; enkyer=i;
            }
            if (A[i]>enb) {
                enb=A[i]; enbyer=i;    
            }
            
        }
        System.out.println("Dizinin en küçük elemanı "+enk+" dir ve "+(enkyer+1)+" . sıradadır.");
            System.out.println("Dizinin en büyük elemanı "+enb+" dir ve "+(enbyer+1)+" . sıradadır.");
    }
    
}
  