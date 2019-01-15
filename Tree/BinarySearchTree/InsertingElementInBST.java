package Tree.BinarySearchTree;

import Tree.BinaryTree;
import Tree.BinaryTreeNode;

public class InsertingElementInBST {
    public static void main(String[] args) {
        BinaryTree bsTree = new BinaryTree();
        BinaryTreeNode root = bsTree.bst();

        bsTree.InOrder(root);
        System.out.println(" ");
        BinaryTreeNode newRoot = insert(root, 2);
        bsTree.InOrder(newRoot);
    }
    public static BinaryTreeNode insert(BinaryTreeNode root, int data){
        if(root == null) {
            root = new BinaryTreeNode(data);
            if(root == null) {
                System.out.println("Memory error");
            }else {
                root.setData(data);
                root.setLeft(null);
                root.setRight(null);
            }
        }
        else {
            if(data < root.getData())
                root.setLeft(insert(root.getLeft(), data));
            else if(data > root.getData())
                root.setRight(insert(root.getRight(), data));
        }
        return root;
    }
}
