//Maximum height or depth of Binary Tree
//TC:O(n)  SC:O(n)

package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximumHeigthofBT {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTreeNode root = tree1.tree();

        int depth = maxHeight(root);
        System.out.println("The maximum depth of the tree is: " + depth);

        int depth2 = maxHeightUsingStack(root);
        System.out.println("The maximum depth of the tree using stack is: " + depth2);

        int depth3 = maxHeightIteratively(root);
        System.out.println("The maximum depth of the tree iteratively is: " + depth3);
    }

    public static int maxHeight(BinaryTreeNode root) {
        if(root == null)
            return 0;
        int leftDepth = maxHeight(root.left);
        int rightDepth = maxHeight(root.right);

        return (leftDepth > rightDepth)? leftDepth + 1 : rightDepth + 1;
    }

    //Solve the above question using stack

    public static int maxHeightUsingStack(BinaryTreeNode root) {
        //using post traversal technique

        if(root == null)
            return 0;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        int maxDepth = 0;
        BinaryTreeNode prev = null;
        while(!s.isEmpty()) {
            BinaryTreeNode curr = s.peek();
            if(prev == null || prev.left == curr || prev.right == curr){
                if(curr.left != null)
                    s.push(curr.left);
                else if(curr.right != null)
                    s.push(curr.right);
            } else if(curr.left == prev) {
                if(curr.right != null)
                    s.push(curr.right);
            }else
                s.pop();
            prev = curr;
            if(s.size() > maxDepth)
                maxDepth = s.size();
        }
        return maxDepth;
    }

    //Using Iterative approach

    public static int maxHeightIteratively(BinaryTreeNode root) {
        if(root == null)
            return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int count = 1;
        while(!q.isEmpty()) {
            BinaryTreeNode currentNode = q.poll();
            if(currentNode != null) {
                if(currentNode.left == null && currentNode.right == null)
                    return count;
                if(currentNode.left != null)
                    q.offer(currentNode.left) ;
                if(currentNode.right != null)
                    q.offer(currentNode.right);
            } else {
                if(!q.isEmpty()){
                    count++;
                    q.offer(null);
                }
            }
        }
        return count;
    }
}
