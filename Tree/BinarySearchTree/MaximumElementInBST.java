package Tree.BinarySearchTree;

import Tree.BinaryTree;
import Tree.BinaryTreeNode;

public class MaximumElementInBST {
    public static void main(String[] args) {
        BinaryTree bsTree = new BinaryTree();
        BinaryTreeNode root = bsTree.bst();

        BinaryTreeNode maxEl = maxElement(root);
        System.out.println("The minimum element is: " + maxEl + " " + maxEl.getData());
    }

    private static BinaryTreeNode maxElement(BinaryTreeNode root) {
        if(root == null)
            return root;
        if(root.getRight() == null)
            return root;
        else
            return maxElement(root.getRight());
    }

    //Iterative
    public static BinaryTreeNode maxElementIte(BinaryTreeNode root) {
        if(root == null)
            return null;
        while(root.getRight() != null){
            root = root.getRight();
        }
        return root;
    }
}
