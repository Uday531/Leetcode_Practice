package day23;

import day19.ArrayToTree;

import java.util.Stack;

public class PathSum_112 {
    static void main() {
        Integer[] a={5,4,8,11,null,13,4,7,2,null,null,null,1};
        int t=32;
        ArrayToTree.TreeNode12 root=ArrayToTree.buildTree(a);
        System.out.println(hasPathSum(root,t));
    }
    public static boolean hasPathSum(ArrayToTree.TreeNode12 root,int target){
        if(root==null){
            return false;
        }
        Stack<ArrayToTree.TreeNode12> path=new Stack<>();
        Stack<Integer> sum=new Stack<>();
        path.push(root);
        sum.push(root.val);
        while (!path.isEmpty()){
            ArrayToTree.TreeNode12 temp=path.pop();
            int tempval=sum.pop();
            if(temp.left==null && temp.right==null && tempval==target){
                return true;
            }
            if(temp.right!=null){
                path.push(temp.right);
                sum.push(temp.right.val+tempval);
            }
            if(temp.left!=null){
                path.push(temp.left);
                sum.push(temp.left.val+tempval);
            }
        }
        return false;
    }
}
