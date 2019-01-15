//The last node processed from queue in level order is the deepest node in BT

//TC:O(n)  SC:O(n)

package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTreeNode root = tree1.tree();

        BinaryTreeNode curr = deepestNode(root);
        System.out.println("The deepest node is: " + curr.getData());
    }

    public static BinaryTreeNode deepestNode(BinaryTreeNode root){
        if(root == null)
            return null;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        BinaryTreeNode tmp = null;
        q.offer(root);
        while(!q.isEmpty()){
            tmp = q.poll();
            if(tmp != null) {
                if(tmp.left != null)
                    q.offer(tmp.left);
                if(tmp.right != null)
                    q.offer(tmp.right);
            }
        }
        return tmp;
    }
}
