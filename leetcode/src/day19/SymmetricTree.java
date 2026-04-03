package day19;

import day17.BinaryTreeLevelOrderTraversal_102;

public class SymmetricTree {
    static void main() {
        Integer[] arr = {1, 2,2,3,null,null,3};
        ArrayToTree.TreeNode12 root=ArrayToTree.buildTree(arr);
        System.out.println(isSymmetric(root));

    }
    public static boolean isSymmetric(ArrayToTree.TreeNode12 root){
        if(root==null){
            return true;
        }
        return check(root.left,root.right);
    }
    public static boolean check(ArrayToTree.TreeNode12 root1, ArrayToTree.TreeNode12 root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return check(root1.left,root2.right)&&check(root1.right,root2.left);
    }
}
