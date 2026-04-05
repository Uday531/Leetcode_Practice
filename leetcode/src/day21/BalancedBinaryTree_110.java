package day21;

import day19.ArrayToTree;

public class BalancedBinaryTree_110 {
    static void main() {
        Integer[] a={3,9,20,null,null,15,7,8};
        ArrayToTree.TreeNode12 t=ArrayToTree.buildTree(a);
        System.out.println(isBalanced(t));
    }
    public static boolean isBalanced(ArrayToTree.TreeNode12 root){
        if(root==null){
            return true;
        }
        int left=check(root.left);
        int right=check(root.right);
        return Math.abs(right-left)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public static int check(ArrayToTree.TreeNode12 root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(check(root.left),check(root.right));
    }
}
