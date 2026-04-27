package day43;

import day19.ArrayToTree;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreOrderAndInorderTraversal_105 {
    static void main() {
        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
        ArrayToTree.TreeNode12 r=buildTree(preorder,inorder);
        printLevelOrder(r);
    }
    public static ArrayToTree.TreeNode12 buildTree(int[] preorder,int[] inorder){
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i=0;i<inorder.length;i++){
            h.put(inorder[i],i);
        }
        return splitTree(preorder,h,0,0,inorder.length-1);
    }
    public static void printLevelOrder(ArrayToTree.TreeNode12 root) {
        if (root == null) return;

        Queue<ArrayToTree.TreeNode12> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            ArrayToTree.TreeNode12 node = q.poll();
            System.out.print(node.val + " ");

            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
    }
    public static ArrayToTree.TreeNode12 splitTree(int[] preorder, Map<Integer,Integer> h,int rootindex,int left,int right){
        if(left>right){
            return null;
        }
        int rootval=preorder[rootindex];

        ArrayToTree.TreeNode12 root=new ArrayToTree.TreeNode12(rootval);
        int mid=h.get(rootval);
        if(mid>left){
            root.left=splitTree(preorder,h,rootindex+1,left,mid-1);
        }
        if(mid<right){
            root.right=splitTree(preorder,h,rootindex+mid-left+1,mid+1,right);
        }
        return root;
    }
}
