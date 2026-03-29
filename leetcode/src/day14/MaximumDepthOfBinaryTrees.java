package day14;

public class MaximumDepthOfBinaryTrees {
    static void main() {
        TreeNode12 root = new TreeNode12(1,
                new TreeNode12(2,
                        new TreeNode12(4, null, null),
                        new TreeNode12(5, null, null)
                ),
                new TreeNode12(3, null, null)
        );
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode12 root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+Math.max(left,right);
    }
    public static class TreeNode12 {
        int data;
        TreeNode12 left;
        TreeNode12 right;

        TreeNode12(int data, TreeNode12 left, TreeNode12 right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
