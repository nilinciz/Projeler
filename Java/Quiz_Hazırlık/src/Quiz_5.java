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
public class Quiz_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double ik;
    System.out.print("Boyunuzu giriniz:(cm) ");
    double b = input.nextDouble();
    System.out.print("Cinsiyetinizi seçiniz: [1-Erkek], [2-Kız]: ");
    int c=input.nextInt();
        if (c==1) {
            ik=0+2.3*(b/2.54-60);
        }
        else { 
            ik=45.5+2.3*(b/2.54-60);
        }
        System.out.printf("İdeal kilonuz (kg)" +ik);
        }
    
    
    }
    

