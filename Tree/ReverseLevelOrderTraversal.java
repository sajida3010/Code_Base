package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTreeNode root = tree1.tree();

        reverseLevelOrder(root);
    }

    public static void reverseLevelOrder(BinaryTreeNode root) {
        if(root == null)
            return;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        Stack<BinaryTreeNode> s= new Stack<>();
        q.offer(root);

        while(!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            if(tmp != null) {
                if(tmp.getRight() != null)
                    q.offer(tmp.getRight());
                if(tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                s.push(tmp);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop().getData() + " ");
        }
    }
}
