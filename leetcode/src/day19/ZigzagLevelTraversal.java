package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ZigzagLevelTraversal {
    static void main() {
        Integer[] arr={3,9,20,null,null,15,7};
        ArrayToTree.TreeNode12 root=ArrayToTree.buildTree(arr);
        System.out.println(zigzag(root));
    }
    public static List<List<Integer>> zigzag(ArrayToTree.TreeNode12 root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<ArrayToTree.TreeNode12> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                ArrayToTree.TreeNode12 node = queue.poll();

                assert node != null;
                if (leftToRight) {
                    level.addLast(node.val);
                } else {
                    level.addFirst(node.val);
                }

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }

            result.add(level);
            leftToRight = !leftToRight; // flip direction
        }
        return result;
        /*
        * my version but not correct fully
        * class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> l=new LinkedList<>();
        if(root==null){
            return new ArrayList<>();
        }
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0;i<level;i++){
                if(level%2==0){
                    if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                 sublist.add(q.poll().val);
                }else{
                    if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                    if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                 sublist.add(q.poll().val);
                }
            }
            l.add(sublist);
        }
        return l;
    }
}*/
    }
}
