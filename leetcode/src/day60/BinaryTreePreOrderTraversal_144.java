package day60;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrderTraversal_144 {
    static void main() {
        TreeNode n=new TreeNode(1);
        n.left=new TreeNode(2);
        n.right=new TreeNode(3);
        n.left.left=new TreeNode(4);
        n.left.right=new TreeNode(5);
        n.right.left=new TreeNode(6);
        n.right.right=new TreeNode(7);
        System.out.println(preorderTraversal(n));

    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            ans.add(curr.data);

            if (curr.right != null) {
                stack.push(curr.right);
            }

            if (curr.left != null) {
                stack.push(curr.left);
            }
        }

        return ans;
    }
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }

}
