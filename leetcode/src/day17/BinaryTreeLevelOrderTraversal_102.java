package day17;

import day14.MaximumDepthOfBinaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal_102 {
    static void main() {
        MaximumDepthOfBinaryTrees.TreeNode12 t=new MaximumDepthOfBinaryTrees.TreeNode12(4,
                new MaximumDepthOfBinaryTrees.TreeNode12(2,new MaximumDepthOfBinaryTrees.TreeNode12(1,null,null),new MaximumDepthOfBinaryTrees.TreeNode12(3,null,null)),
                new MaximumDepthOfBinaryTrees.TreeNode12(7,new MaximumDepthOfBinaryTrees.TreeNode12(6,null,null),new MaximumDepthOfBinaryTrees.TreeNode12(9,null,null)));
        System.out.println(levelOrder(t));
    }
    public static List<List<Integer>> levelOrder(MaximumDepthOfBinaryTrees.TreeNode12 root){
        Queue<MaximumDepthOfBinaryTrees.TreeNode12> t=new LinkedList<MaximumDepthOfBinaryTrees.TreeNode12>();
        List<List<Integer>> l=new LinkedList<List<Integer>>();
        if(root==null){
            return l;
        }
        t.offer(root);
        while (!t.isEmpty()){
            int level=t.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0;i<level;i++){
                if(t.peek().left!=null){
                    t.offer(t.peek().left);
                }
                if(t.peek().right!=null){
                    t.offer(t.peek().right);
                }
                sublist.add(t.poll().data);
            }
            l.add(sublist);
        }
        return l;
    }
}
