package day14;

public class SameTree_100 {
    static void main() {
        MaximumDepthOfBinaryTrees.TreeNode12 root1 = new MaximumDepthOfBinaryTrees.TreeNode12(1,
                new MaximumDepthOfBinaryTrees.TreeNode12(2,null,null),
                new MaximumDepthOfBinaryTrees.TreeNode12(3,null,null)
        );
        MaximumDepthOfBinaryTrees.TreeNode12 root2 = new MaximumDepthOfBinaryTrees.TreeNode12(1,
                new MaximumDepthOfBinaryTrees.TreeNode12(2,null,null),
                new MaximumDepthOfBinaryTrees.TreeNode12(4,null,null)
        );
        System.out.println(sameTree(root1,root2));
    }
    public static boolean sameTree(MaximumDepthOfBinaryTrees.TreeNode12 root1, MaximumDepthOfBinaryTrees.TreeNode12 root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null || root1.data!=root2.data){
            return false;
        }
        return sameTree(root1.left,root2.left) && sameTree(root1.right,root2.right);
    }
}

