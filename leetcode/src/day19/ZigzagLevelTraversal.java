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

        if (root == null) return result;

        Queue<ArrayToTree.TreeNode12> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                ArrayToTree.TreeNode12 node = queue.poll();

                if (leftToRight) {
                    level.addLast(node.val);
                } else {
                    level.addFirst(node.val);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(level);
            leftToRight = !leftToRight; // flip direction
        }

        return result;

    }
}
