package day22;

import day19.ArrayToTree;
import java.util.*;

public class BinaryTreeLevelOrderTraversal_II_107 {
    static void main() {
        Integer[] a={3,9,20,null,null,15,7};
        ArrayToTree.TreeNode12 root=ArrayToTree.buildTree(a);
        System.out.println(levelOrderBottom(root));
    }
    public static List<List<Integer>> levelOrderBottom(ArrayToTree.TreeNode12 root) {
        Queue<ArrayToTree.TreeNode12> t=new LinkedList<ArrayToTree.TreeNode12>();
        List<List<Integer>> l=new LinkedList<List<Integer>>();
        if(root==null){
            return l;
        }
        t.offer(root);
        while (!t.isEmpty()){
            int level=t.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0;i<level;i++){
                ArrayToTree.TreeNode12 node=t.poll();
                sublist.add(node.val);
                if(node.left!=null){
                    t.offer(node.left);
                }
                if(node.right!=null){
                    t.offer(node.right);
                }
            }
            l.addFirst(sublist);
        }
        return l;
    }
}
