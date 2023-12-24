/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
public class Merhodlar2 {

    /**
     * @param args the command line arguments
     */
    public static void ekrana_yaz(String hepsiniyaz) {
        System.out.println(hepsiniyaz);
    }
    
    public static void cumleyi_gonder(String cumle) {
        ekrana_yaz("Merhaba "+cumle);
        
    }
    public static void main(String[] args) {
        cumleyi_gonder("Dünya!");
    }
    
}
