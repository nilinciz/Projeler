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

public class Exam5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Terim sayısı giriniz: ");
    double n = input.nextDouble();
    System.out.println("Bir x sayısı giriniz: ");
    double x = input.nextDouble();
    float t =1;
    float f =1;
    
        for (int i = 1; i <n; i++) {
            f*=i;
            t+=Math.pow(x, i)/f; }
        System.out.println("Seri açılımı ile e üzeeri x değeri: "+t);
        System.out.println("Komutla e üzeri x değeri: "+f);
            
        }
    
    }
    

