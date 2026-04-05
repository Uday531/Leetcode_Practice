package day21;

import day19.ArrayToTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ConvertSortedArrayToBST_108 {
    static void main() {
        int[] a={-10,-3,0,5,9};
        ArrayToTree.TreeNode12 root=convert(a);
        levelOrder(root);
    }
    public static ArrayToTree.TreeNode12 convert(int[] nums){
        return buildTree(nums,0,nums.length-1);
    }
    public static ArrayToTree.TreeNode12 buildTree(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        ArrayToTree.TreeNode12 root=new ArrayToTree.TreeNode12(nums[mid]);
        root.left=buildTree(nums,left,mid-1);
        root.right=buildTree(nums,mid+1,right);
        return root;
    }
    public static void levelOrder(ArrayToTree.TreeNode12 root) {
        if (root == null) return;

        Queue<ArrayToTree.TreeNode12> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            ArrayToTree.TreeNode12 node = q.poll();
            System.out.print(node.val + " ");

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
}
