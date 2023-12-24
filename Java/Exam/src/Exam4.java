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

public class Exam4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("1-İlkbahar 2-Yaz 3-Sonbahar 4-Kış Seçiniz: ");
    float m = input.nextFloat();
    
    System.out.println("Ay listesi: ");
        if (m==1) {
            System.out.println("Mart,Nisan,Mayıs");
        }
        if (m==2) {
            System.out.println("Haziran,Temmuz,Ağustos");
        }
        if (m==3) {
            System.out.println("Eylül,Ekim,Kasım");
        }
        if (m==4) {
            System.out.println("Aralık,Ocak,Şubat");
  
            }
                
            }
                
            
    
}
