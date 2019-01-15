package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertElement {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTreeNode root = tree1.tree();

        System.out.println("The tree before Insertion is: ");
        tree1.PreOrder(root);

        BinaryTreeNode newRoot = insertElementInBT(root, 58);
        System.out.println("\n The tree after Insertion is: ");
        tree1.PreOrder(newRoot);

        BinaryTreeNode newRoot2 = insert(root, 58);
        System.out.println("\n The tree after Insertng recursively is: ");
        tree1.PreOrder(newRoot2);
    }

    public static BinaryTreeNode insertElementInBT(BinaryTreeNode root, int data) {
        if(root == null)
            return new BinaryTreeNode(data);
        Queue<BinaryTreeNode>  q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            if(tmp != null){
                if(tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                else{
                    tmp.setLeft(new BinaryTreeNode(data));
                    return root;
                }
                if(tmp.getRight() != null)
                    q.offer(tmp.getRight());
                else{
                    tmp.setRight(new BinaryTreeNode(data));
                    return root;
                }
            }
        }
        return root;
    }


    //Recursive approach
    public static BinaryTreeNode insert(BinaryTreeNode root, int data) {
        if(root == null)
            return new BinaryTreeNode(data);
        else
            insertHelper(root, data);
        return root;
    }

    private static void insertHelper(BinaryTreeNode root, int data) {
        if(root.data >= data) {
            if(root.getLeft() == null){
                root.setLeft(new BinaryTreeNode(data));
            } else {
                insertHelper(root.getLeft(), data);
            }
        } else {
            if(root.getRight() == null) {
                root.setRight(new BinaryTreeNode(data));
            } else {
                insertHelper(root.getRight(), data);
            }
        }
    }
}
