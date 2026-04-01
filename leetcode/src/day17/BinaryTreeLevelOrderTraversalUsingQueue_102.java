package day17;

import day14.MaximumDepthOfBinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalUsingQueue_102 {
    static void main() {
        MaximumDepthOfBinaryTrees.TreeNode12 t=new MaximumDepthOfBinaryTrees.TreeNode12(4,
                new MaximumDepthOfBinaryTrees.TreeNode12(2,new MaximumDepthOfBinaryTrees.TreeNode12(1,null,null),new MaximumDepthOfBinaryTrees.TreeNode12(3,null,null)),
                new MaximumDepthOfBinaryTrees.TreeNode12(7,new MaximumDepthOfBinaryTrees.TreeNode12(6,null,null),new MaximumDepthOfBinaryTrees.TreeNode12(9,null,null)));
        System.out.println(levelOrder(t));
    }
    public static Queue<MaximumDepthOfBinaryTrees.TreeNode12> levelOrder(MaximumDepthOfBinaryTrees.TreeNode12 root){
        Queue<MaximumDepthOfBinaryTrees.TreeNode12> l=new LinkedList<>();
        l.add(root);
        while(!l.isEmpty()){
            MaximumDepthOfBinaryTrees.TreeNode12 t=l.poll();
            System.out.print(t.data+" ->");
            if (t.left!=null){
                l.add(t.left);
            }
            if (t.right!=null){
                l.add(t.right);
            }
        }
        return l;
    }
}
