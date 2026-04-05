package day19;

import java.util.*;

public class ArrayToTree {

    // TreeNode as static inner class OR separate file
    public static class TreeNode12 {
        public int val;
        public TreeNode12 left, right;

        public TreeNode12(int val) {
            this.val = val;
        }
    }
    public static TreeNode12 buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;

        TreeNode12 root = new TreeNode12(arr[0]);
        Queue<TreeNode12> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (i < arr.length) {
            TreeNode12 curr = q.poll();

            if (i < arr.length && arr[i] != null) {
                curr.left = new TreeNode12(arr[i]);
                q.add(curr.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                curr.right = new TreeNode12(arr[i]);
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }
}