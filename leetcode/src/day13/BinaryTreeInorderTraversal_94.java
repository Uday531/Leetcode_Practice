package day13;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {
    static void main() {
        
    }
    public static List<Integer> treetraversal(TreeNode root){
        List<Integer> l=new ArrayList<>();
        hell(root,l);
        return l;
    }
    public static void hell(TreeNode node,List<Integer> res){
        if(node==null){
            return;
        }
        hell(node.left,res);
        res.add(node.data);
        hell(node.right,res);
    }
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data,TreeNode left,TreeNode right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
}
