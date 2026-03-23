package day9.trees;
import java.util.*;

public class BinaryTrees {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    static void main() {
        BinaryTrees b=new BinaryTrees();
        b.root=new Node(1);
        b.root.left=new Node(2);
        b.root.right=new Node(3);
        b.root.left.left=new Node(4);
        b.root.left.right=new Node(5);
        b.inOrder(b.root);
        System.out.println();
        b.preOrder(b.root);
        System.out.println();
        b.postOrder(b.root);
        System.out.println();
        b.printTree(b.root);
    }
    void inOrder(Node root){
        if (root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void postOrder(Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    void printTree(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int space = 8; // initial spacing

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < space; i++)
                System.out.print(" ");
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr != null) {
                    System.out.print(curr.data);
                    q.add(curr.left);
                    q.add(curr.right);
                } else {
                    System.out.print(" ");
                    q.add(null);
                    q.add(null);
                }
                for (int j = 0; j < space * 2; j++)
                    System.out.print(" ");
            }
            System.out.println();
            space /= 2;
            if (space == 0) break;
        }
    }
}
