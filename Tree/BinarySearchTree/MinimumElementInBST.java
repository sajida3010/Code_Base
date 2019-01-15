package Tree.BinarySearchTree;

import Tree.BinaryTree;
import Tree.BinaryTreeNode;

public class MinimumElementInBST {
    public static void main(String[] args) {
        BinaryTree bsTree = new BinaryTree();
        BinaryTreeNode root = bsTree.bst();

        BinaryTreeNode minEl = minElement(root);
        System.out.println("The minimum element is: " + minEl + " " + minEl.getData());
    }

    public static BinaryTreeNode minElement(BinaryTreeNode root) {
        if(root == null)
            return null;
        if(root.getLeft() == null)
            return root;
        else return minElement(root.getLeft());
    }

    //Iterative
    public static BinaryTreeNode minElementIte(BinaryTreeNode root) {
        if(root == null)
            return null;
        while(root.getLeft() != null){
            root = root.getLeft();
        }
        return root;
    }
}
