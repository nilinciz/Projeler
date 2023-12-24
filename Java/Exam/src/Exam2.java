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

public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Bir x değeri giriniz: ");
    double x = input.nextDouble();
    double y=0;
    
    if (x<0) {
            y=1;
    }
    if  ((0<=x) &&(x<=2)) {
            y=x;
    }
    if ((2<x) && (x<=4)){
        y=3;
    }
    if (4<x){
        y=4-x;
        }
    System.out.println("Fonksiyonun değeri: "+y);
            
                
            }
            
        }
        
    
    

