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
public class Ucgen_alan_cevre_method {

    /**
     * @param args the command line arguments
     */
    static void ucgen_cevre(int ilkkenar, int ikincikenar, int ucuncukenar) {
        double cevre=(ilkkenar+ikincikenar+ucuncukenar);
        System.out.println("Üçgenin çevresi: "+cevre);
    }
    static void ucgen_alan(int kenar, int yukseklik) {
        double alan = (kenar*yukseklik)/2;
        System.out.println("Üçgenin alanı: "+alan);
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci kenarı giriniz: ");
        int a = input.nextInt();
        System.out.println("Lütfen ikinci kenarı giriniz: ");
        int b = input.nextInt();
        System.out.println("Lütfen üçüncü kenarı giriniz: ");
        int c = input.nextInt();
        System.out.println("Lütfen birinci kenarına ait yükseklik giriniz: ");
        int h = input.nextInt();
        ucgen_cevre(a,b,c);
        ucgen_alan(a,h);
    }
    
}
