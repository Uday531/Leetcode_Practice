package day19;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ArrayToTree {

    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (i < arr.length) {
            TreeNode curr = q.poll();

            // left child
            if (i < arr.length && arr[i] != null) {
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }
            i++;

            // right child
            if (i < arr.length && arr[i] != null) {
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

    // Just to verify (level order print)
    public static void printLevel(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                System.out.print("null ");
                continue;
            }

            System.out.print(node.val + " ");
            q.add(node.left);
            q.add(node.right);
        }
    }

    public static void main(String[] args) {

        // 🔥 Just change this array
        Integer[] arr = {1, 2, 3, null, 4, 5, 6};

        TreeNode root = buildTree(arr);

        printLevel(root); // optional
    }
}
