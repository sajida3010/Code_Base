package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumSumInLevel {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTreeNode root = tree.tree();
        /*BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);*/

        int res = maxSum(root);
        System.out.println("The max sum is: " + res);
    }
    public static int maxSum(BinaryTreeNode root) {
        int currentSum = 0, maxSum = 0;
        if(root == null) return 0;

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while(!q.isEmpty()){
            BinaryTreeNode temp = q.poll();
            if(temp != null){
                if(temp.getLeft() != null){
                    q.offer(temp.getLeft());
                    currentSum += temp.getLeft().getData();
                }
                if(temp.getRight() != null) {
                    q.offer(temp.getRight());
                    currentSum += temp.getRight().getData();
                }
            }
            else {
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
                currentSum = 0;
                if(!q.isEmpty()){
                    q.offer(null);
                }
            }
        }
        return maxSum;
    }
}
