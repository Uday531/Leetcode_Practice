package day13;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)
                ),
                new TreeNode(3, null, null)
        );

        List<Integer> result = treetraversal(root);
        System.out.println(result); // Expected: [4, 2, 5, 1, 3]
    }

    public static List<Integer> treetraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        hell(root, l);
        return l;
    }

    public static void hell(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        hell(node.left, res);   // Left
        res.add(node.data);     // Root
        hell(node.right, res);  // Right
    }

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}