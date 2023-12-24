package hafta8;

import java.util.Scanner;

public class ağaç_yapısı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ListNode a = new ListNode(129);

        a.left = new ListNode(120);

        a.left.right = new ListNode(121);
        a.right=new ListNode(1222);

        a.right.right = new ListNode(122);

        a.right.left = new ListNode(123);
        preorder(a);


    }
    public static  void preorder(ListNode root) {
        if (root!=null){
            System.out.print(root.data+"-->");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void Inorder( ListNode root){
        if (root!=null){
            Inorder(root.left);
            System.out.println(root.data+"-->");
            Inorder(root.right);


        }
    }
    public void Postorder(ListNode root){
        if (root!=null){
            Postorder(root.left);
            Postorder(root.right);
            System.out.println(root.data+"-->");
        }
    }


}
