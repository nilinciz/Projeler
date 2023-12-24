
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
public class String_ornek6 {

    /**
     * @param args the command line arguments
     */
    //SESLİ SESSİZ HARFLERİ AYIRAN PROGRAM
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cümle giriniz: ");
        String cumle = input.nextLine();
        String k1="";
        String k2="";
        char sesli[]={'a','e','ı','i','o','ö','u','ü'};
        for (int i = 0; i < cumle.length(); i++) {
            for (int j = 0; j < 8; j++) {
                if (cumle.charAt(i)==sesli[j]) {
                    k1+=cumle.charAt(i);
                    
                }
                if (cumle.charAt(i)!=sesli[j]){
                    k2+=cumle.charAt(i);
                    
           
                }
                
                
            
        }
        


    }
        System.out.println("Sesli harflerden oluşan kelime: "+k1);
        System.out.println("Sessiz harflerden oluşan kelime: "+k2);
    
    }}
