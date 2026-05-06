package day50;

import day19.ArrayToTree;

public class CountCompleteTreeNodes_222 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6};
        ArrayToTree.TreeNode12 root = ArrayToTree.buildTree(a);
        int res = countNodes(root);
        System.out.println(res);
    }
    public static int countNodes(ArrayToTree.TreeNode12 root) {

        if (root == null) {
            return 0;
        }

        int left = getLeft(root);
        int right = getRight(root);
        if (left == right) {
            return (1 << left) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    private static int getLeft(ArrayToTree.TreeNode12 root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.left;
        }
        return h;
    }
    private static int getRight(ArrayToTree.TreeNode12 root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.right;
        }
        return h;
    }
}