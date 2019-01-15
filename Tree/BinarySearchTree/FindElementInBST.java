package Tree.BinarySearchTree;

import Tree.BinaryTree;
import Tree.BinaryTreeNode;

public class FindElementInBST {
    public static void main(String[] args) {
        BinaryTree bsTree = new BinaryTree();
        BinaryTreeNode root = bsTree.bst();

        BinaryTreeNode element1 = find(root, 14);
        BinaryTreeNode element2 = findIterative(root, 6);

        System.out.println("The element 14 is: " + element1 + " " + element1.getData());
        System.out.println("The element 6 is: " + element2 + " " + element2.getData());
    }


    //Method 1: recursive T.C:O(n), S.C:O(n) for recursive stack

    public static BinaryTreeNode find(BinaryTreeNode root, int data){
        if(root == null) {
            return null;
        }
        if(data < root.getData()) {
           return (find(root.getLeft(), data));
        } else if(data > root.getData()) {
            return (find(root.getRight(), data));
        }
        return root;
    }

    //Method 2: Iterative T.C:O(n), S.C:O(1)

    public static BinaryTreeNode findIterative(BinaryTreeNode root, int data) {
        if(root == null) {
            return null;
        }
        while(root != null) {
            if(data == root.getData()){
                return root;
            }
            else if(data > root.getData()) {
                root = root.getRight();
            }
            else {
                root = root.getLeft();
            }
        }
        return root;
    }
}
