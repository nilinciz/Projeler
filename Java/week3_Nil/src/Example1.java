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

public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrencinin adını ve soyadını giriniz:");
        String adsoyad = input.nextLine();
        System.out.println("Öğrencinin vize notunu giriniz");
        int vize = input.nextInt();
        System.out.println("Öğrencinin final notunu giriniz");
        int finall = input.nextInt();
        double ortalama = vize * 0.4 + finall * 0.6;
        System.out.println(adsoyad + "Öğrencisinin ortalaması: " + ortalama);// TODO code application logic here
    }

}
