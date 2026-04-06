package day22;

import day19.ArrayToTree;
import java.util.*;
import java.util.LinkedList;

public class MinimumDepthOfABinaryTree_111 {
    static void main() {
        Integer[] a={1,2,3,4,5};
        ArrayToTree.TreeNode12 root=ArrayToTree.buildTree(a);
        System.out.println(minDepth(root));
    }
    public static int minDepth(ArrayToTree.TreeNode12 root) {
        if(root==null){
            return 0;
        }
        Queue<ArrayToTree.TreeNode12> t=new LinkedList<>();
        t.offer(root);
        int depth=1;
        while(!t.isEmpty()){
            int size=t.size();
            for(int i=0;i<size;i++){
                ArrayToTree.TreeNode12 node=t.poll();
                if(node.left==null && node.right==null){
                    return depth;
                }
                if(node.left!=null){
                    t.offer(node.left);
                }
                if(node.right!=null){
                    t.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
