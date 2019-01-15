package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumElementInBinaryTree {
    public static void main(String[] args) {
        /*BinaryTreeNode root = new BinaryTreeNode(5);
        root.setLeft(new BinaryTreeNode(6));
        root.setRight(new BinaryTreeNode(7));
        root.getLeft().setLeft(new BinaryTreeNode(12));
        root.getLeft().getLeft().setRight(new BinaryTreeNode(13));
        root.getRight().setLeft(new BinaryTreeNode(24));
        root.getRight().setRight(new BinaryTreeNode(32));*/
        BinaryTree tree1 = new BinaryTree();

        BinaryTreeNode root = tree1.tree();
        int maximum = maxInBinaryTree(root);
        System.out.println("The maximum element in binary tree is: " + maximum);

        int iterativeMax = maxInBinaryTreeLevelOrder(root);
        System.out.println("\nThe maximum element in binary tree using Iterative approach is: " + iterativeMax);

    }

    //TC: O(n)  SC:O(n)
    public static int maxInBinaryTree(BinaryTreeNode root) {
        int maxValue = Integer.MIN_VALUE;
        if (root != null) {
            int leftMax = maxInBinaryTree(root.left);
            int rightMax = maxInBinaryTree(root.right);

            if(leftMax > rightMax) {
                maxValue = leftMax;
            } else
                maxValue = rightMax;
            if(root.data > maxValue){
                maxValue = root.data;
            }
        }
        return maxValue;
    }

    //Iterative way: Using the concept of Level Order traversal
    //TC: O(n)  SC:O(n)

    public static int maxInBinaryTreeLevelOrder(BinaryTreeNode root) {
        if(root == null)
            return Integer.MIN_VALUE;
        int max_value = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            if(tmp.data > max_value)
                max_value = tmp.data;

            if(tmp != null) {
                if(tmp.left != null)
                    q.offer(tmp.left);
                if(tmp.right != null)
                    q.offer(tmp.right);
            }
        }
        return max_value;
    }
}
