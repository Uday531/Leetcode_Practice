package day14;

public class SameTree_100 {
    static void main() {
        System.out.println("hi");
    }
    public static boolean sameTree(MaximumDepthOfBinaryTrees.TreeNode12 root1, MaximumDepthOfBinaryTrees.TreeNode12 root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null || root1.data!=root2.data){
            return false;
        }
        return sameTree(root1.left,root1.right) && sameTree(root2.left,root2.right);
    }
}

