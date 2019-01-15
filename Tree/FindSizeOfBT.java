package Tree;

import java.util.LinkedList;
import java.util.Queue;

//TC: O(n)  SC:O(n)
public class FindSizeOfBT {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTreeNode root = tree1.tree();
        int treeSize = size(root);
        System.out.println("The size of tree is: " + treeSize);

        int treeSize2 = sizeIterative(root);
        System.out.println("The size of tree iteratively is: " + treeSize2);
    }

    public static int size(BinaryTreeNode root) {
        int leftCount = root.left == null? 0 : size(root.left);
        int rightCount = root.right == null? 0 : size(root.right);
        return 1 + leftCount + rightCount;
    }

    //Iteratively
    public static int sizeIterative(BinaryTreeNode root) {
        int count = 0;
        if(root == null)
            return 0;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while(!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            count++;
            if(tmp != null) {
                if(tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                if(tmp.getRight() != null)
                    q.offer(tmp.getRight());
            }
        }
        return count;
    }

}
