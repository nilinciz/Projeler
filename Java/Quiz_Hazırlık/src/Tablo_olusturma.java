/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilin
 */
import java.util.*;
public class Tablo_olusturma {

    /**
     * @param args the command line arguments
     */
        static void tablo(int satiruzunlugu, int sutunuzunlugu) {
        Scanner input = new Scanner(System.in);
        int A[][]=new int [satiruzunlugu][sutunuzunlugu];
        for (int i = 0; i <satiruzunlugu; i++) {
            for (int j= 0; j <sutunuzunlugu; j++) {
                System.out.print("A("+(i+1)+","+(j+1)+")=");
                A[i][j]=input.nextInt();
            }
        }
        
        }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tablonun satır uzunluğu: ");
        int satir = input.nextInt();
        System.out.println("Tablonun sütun uzunluğu: ");
        int sutun = input.nextInt();
            tablo(satir, sutun);
    }
        }
        
    


