package javaapplication1;

/**
 *
 * @author sariz
 */
public class ListNode { 
    int data; 
    ListNode next; 
    ListNode prev;

    ListNode() { 
        this.data = -1; 
        this.next = null;
        this.prev = null;
    } 

    ListNode(int data) { 
        this.data = data; 
        this.next = null;
        this.prev = null;
    } 

    ListNode(int data, ListNode next) { 
        this.data = data; 
        this.next = next; 
        this.prev = null;
    }
    
    ListNode(int data, ListNode next, ListNode prev) { 
        this.data = data; 
        this.next = next; 
        this.prev = prev;
    }
}