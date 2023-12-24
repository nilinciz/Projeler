/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Bu 3 sayı içinden en büyüğünü olanını buldurma programıdır.
 */
import java.util.Scanner;
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayi2 = input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz");
        int sayi3 = input.nextInt();
        int enbuyuk=-1000000;
        
        if (sayi1>sayi2 && sayi1>sayi3) {
            enbuyuk = sayi1;
           }
           else if (sayi2>sayi1 && sayi2>sayi3) 
           {
            enbuyuk= sayi2;        
           } 
          else if (sayi3>sayi1 && sayi3>sayi2) {    
             enbuyuk = sayi3;
          }
                  System.out.println("Enbüyük sayi1 "+ enbuyuk);
    }
}
