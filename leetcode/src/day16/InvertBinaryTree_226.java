package day16;

import day14.MaximumDepthOfBinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_226 {
    static void main() {
        MaximumDepthOfBinaryTrees.TreeNode12 t=new MaximumDepthOfBinaryTrees.TreeNode12(4,
                new MaximumDepthOfBinaryTrees.TreeNode12(2,new MaximumDepthOfBinaryTrees.TreeNode12(1,null,null),new MaximumDepthOfBinaryTrees.TreeNode12(3,null,null)),
                new MaximumDepthOfBinaryTrees.TreeNode12(7,new MaximumDepthOfBinaryTrees.TreeNode12(6,null,null),new MaximumDepthOfBinaryTrees.TreeNode12(9,null,null)));
        MaximumDepthOfBinaryTrees.TreeNode12 invert=invertTree(t);
        printTree(invert);

    }
    public static MaximumDepthOfBinaryTrees.TreeNode12 invertTree(MaximumDepthOfBinaryTrees.TreeNode12 root){
        if(root==null){
            return null;
        }
        Queue<MaximumDepthOfBinaryTrees.TreeNode12> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            MaximumDepthOfBinaryTrees.TreeNode12 n=q.poll();
            MaximumDepthOfBinaryTrees.TreeNode12 temp=n.left;
            n.left=n.right;
            n.right=temp;
            if (n.left!=null){
                q.add(n.left);
            }
            if (n.right!=null){
                q.add(n.right);
            }
        }
        return root;
    }
    public static void printTree(MaximumDepthOfBinaryTrees.TreeNode12 root) {
        if (root == null) return;

        Queue<MaximumDepthOfBinaryTrees.TreeNode12> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            MaximumDepthOfBinaryTrees.TreeNode12 node = q.poll();
            System.out.print(node.data + " ");

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
}
