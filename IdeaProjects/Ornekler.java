package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author sariz
 */
public class Ornekler {
    
    public static void ornek1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        int sayi = scn.nextInt();
        ListNode a = new ListNode(sayi); 
        System.out.println("İkinci Sayıyı Giriniz");
        sayi = scn.nextInt();
        ListNode b = new ListNode(sayi);
        System.out.println("Üçüncü Sayıyı Giriniz");
        sayi = scn.nextInt();
        ListNode c = new ListNode(sayi);
        System.out.println("Dördüncü Sayıyı Giriniz");
        sayi = scn.nextInt();
        ListNode d = new ListNode(sayi);

        // a->b->c->d şeklinde bağlamak istiyoruz.

        a.next = b;
        b.next = c;
        c.next = d;

        ListNode start = a;
        
        System.out.println("---------------------");

        while(start != null){
            System.out.println(start.data);
            start = start.next;
        }
    }
    
    public static void ornek2() {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(-40);
        ListNode e = new ListNode(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode start = a;
        
        int index = 1;
        
        while(start.next != null){
            start = start.next;
            if(start.data < 0){
                remove(a, index);
                a = addFirst(a,start.data);
            }
            index++;
        }
        
        start = a;
        
        System.out.println("---------------------");
        
        while(start != null){
            System.out.println(start.data);
            start = start.next;
        }
    }
    
    
    static ListNode addFirst(ListNode b, int value) { 
        ListNode c = new ListNode(value, b);  
        return c; 
    }

    static ListNode addMiddle(ListNode b, int index, int value) { 
        ListNode c = b; 
        for(int i = 1; i<index; i++) { 
            c = c.next; } 
        ListNode add = new ListNode(value, c.next); 
        c.next = add; 
        return b; 
    }

    static ListNode remove(ListNode b, int index) { 
        ListNode c = b; 
        for(int i = 1; i<index; i++) { 
            c = c.next; } 
        c.next = c.next.next; 
        return b; 
    }
}
