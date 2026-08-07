package day61;

import day60.BinaryTreePreOrderTraversal_144;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostOrderTraversal_145 {
    static void main() {
        BinaryTreePreOrderTraversal_144.TreeNode n=new BinaryTreePreOrderTraversal_144.TreeNode(1);
        n.left=new BinaryTreePreOrderTraversal_144.TreeNode(2);
        n.right=new BinaryTreePreOrderTraversal_144.TreeNode(3);
        n.left.left=new BinaryTreePreOrderTraversal_144.TreeNode(4);
        n.left.right=new BinaryTreePreOrderTraversal_144.TreeNode(5);
        n.right.left=new BinaryTreePreOrderTraversal_144.TreeNode(6);
        n.right.right=new BinaryTreePreOrderTraversal_144.TreeNode(7);
        System.out.println(postOrder(n));
    }
    public static List<Integer> postOrder(BinaryTreePreOrderTraversal_144.TreeNode root){
        List<Integer> l=new ArrayList<>();
        Stack<BinaryTreePreOrderTraversal_144.TreeNode> s=new Stack<>();
        if(root==null){
            return l;
        }
        s.push(root);
        while(!s.isEmpty()){
            BinaryTreePreOrderTraversal_144.TreeNode c=s.pop();
            l.add(c.data);
            if (c.left!=null){
                s.push(c.left);
            }
            if (c.right!=null){
                s.push(c.right);
            }

        }
        Collections.reverse(l);
        return l;
    }
}

