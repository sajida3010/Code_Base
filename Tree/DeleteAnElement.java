package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteAnElement {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTreeNode root = tree1.tree();

        int num = 6;

        System.out.println("Tree before deleting an element " + num);
        tree1.PreOrder(root);

        System.out.println();
        BinaryTreeNode newRoot = deleteElement(root, num);
        System.out.println(newRoot.getData());
        System.out.println("Tree after deleting the element");
        tree1.PreOrder(newRoot);
    }

    public static BinaryTreeNode deleteElement(BinaryTreeNode root, int data) {
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftDelete = true;
        BinaryTreeNode parent = null;
        BinaryTreeNode rootData = null;
//        BinaryTreeNode deepestNode;
        BinaryTreeNode tmp = null;
        while(!q.isEmpty()){

            tmp = q.poll();
            if(tmp != null) {
                if(tmp.getData() == data)
                    rootData = tmp;
                if(tmp.left != null) {
                    parent = tmp;
                    q.offer(tmp.left);
                    if(tmp.left.getData() == data)
                        rootData = tmp.left;
                }
                if(tmp.right != null) {
                    q.offer(tmp.right);
                    parent = tmp;
                    leftDelete = false;
                    if(tmp.right.getData() == data)
                        rootData = tmp.right;
                }
            }
        }
       // deepestNode = tmp;
        rootData.setData(tmp.getData());
        if(leftDelete) parent.left = null;
        else parent.right = null;
        tmp = null;
        return root;
    }
}
