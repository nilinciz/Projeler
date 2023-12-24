/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
//FİBONACCİ SERİSİ 
import java.util.Scanner;
public class Quiz_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);    
    System.out.println("Eleman sayısını giriniz: ");
    int terim_sayisi= input.nextInt();
    int t1=1;
    int t2=2;
    int t3;
        for (int i = 0; i <= terim_sayisi; i++) {
            t3=t2+t1;
            System.out.println(t3);
            t1=t2;
            t2=t3;
        }
    
    }
    
}