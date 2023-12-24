package javaapplication1;

/**
 *
 * @author sariz
 */
public class ListNode2 { 
    String data; 
    ListNode2 next; 
    ListNode2 prev;

    ListNode2() { 
        this.data = ""; 
        this.next = null;
        this.prev = null;
    } 

    ListNode2(String data) { 
        this.data = data; 
        this.next = null;
        this.prev = null;
    } 

    ListNode2(String data, ListNode2 next) { 
        this.data = data; 
        this.next = next; 
        this.prev = null;
    }
    
    ListNode2(String data, ListNode2 next, ListNode2 prev) { 
        this.data = data; 
        this.next = next; 
        this.prev = prev;
    }
}