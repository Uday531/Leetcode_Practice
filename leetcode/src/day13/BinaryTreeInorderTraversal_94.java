package day13;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {
    public static void main(String[] args) {
        TreeNode12 root = new TreeNode12(1,
                new TreeNode12(2,
                        new TreeNode12(4, null, null),
                        new TreeNode12(5, null, null)
                ),
                new TreeNode12(3, null, null)
        );

        List<Integer> result = treetraversal(root);
        System.out.println(result); // Expected: [4, 2, 5, 1, 3]
    }

    public static List<Integer> treetraversal(TreeNode12 root) {
        List<Integer> l = new ArrayList<>();
        hell(root, l);
        return l;
    }

    public static void hell(TreeNode12 node, List<Integer> res) {
        if (node == null) {
            return;
        }
        hell(node.left, res);   // Left
        res.add(node.data);     // Root
        hell(node.right, res);  // Right
    }

    public static class TreeNode12 {
        int data;
        TreeNode12 left;
        TreeNode12 right;

        TreeNode12(int data, TreeNode12 left, TreeNode12 right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}