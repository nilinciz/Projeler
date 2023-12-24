/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikinci_donem_hafta_iki;

/**
 *
 * @author nilin
 */
//ÖZYİNELEMELİ FONKSİYONLAR (sınavda 1 soru)
//dışardan alınan değer için faktoriyelini bulan recursion fonksiyon
public class Ikinci_donem_hafta_iki {

    
    public static int sum(int k) {
        if (k>0)  {
        return k * sum(k-1);
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        
    int result = sum(5);
        System.out.println(result); }
    
}
// Hocanın yaptığı 
/** static int sum(int k) {
  if (k>0) {
  return k * sum(k-1);
  }
  else {
  return 1;


  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);
  int k ;
  do { 
  System.out.println("Lütfen pozitif bir k sayısı giriniz: ");
  k = input.nextInt();
  }while (k<0);
 int result  = sum(k);
 * System.out.println("Sonuç: "+result);
  
 */