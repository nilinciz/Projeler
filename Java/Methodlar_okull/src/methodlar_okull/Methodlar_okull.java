/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodlar_okull;

/**
 *
 * @author nilin
 */
import java.util.*;
public class Methodlar_okull {

    /**
     * @param args the command line arguments
     */
    static void dikt_cevre(double kisa, double uzun){
        double cevre = (kisa+uzun)*2;
        System.out.println(kisa+" ve "+uzun+" kenarlara ait dikdörtgenin çevresi: "+cevre );
           
    }
    static void dikt_alan(double kisa, double uzun){
            double alan =kisa * uzun;
            System.out.println(kisa+" ve "+uzun+"kenarlara ait dikdörtgen alanı: "+alan);
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kısa kenarı giriniz: ");
        double kisakenar= input.nextDouble();
        System.out.println("Lütfen uzun kenarı giriniz: ");
        double uzunkenar= input.nextDouble();
        dikt_cevre(kisakenar,uzunkenar);//method çağırılır ve kullanılır
        dikt_alan(kisakenar,uzunkenar);
      

}
}

