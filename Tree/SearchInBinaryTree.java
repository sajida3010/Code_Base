package Tree;

import java.util.Stack;

//TC: O(n) SC: O(n)
public class SearchInBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTreeNode root =  tree1.tree();

        int key = 32;
        System.out.println("The data " + key + " is available in tree? " + findInBT(root, key));
        System.out.println("The data " + key + " is available in tree iteravely? " + findInBTIteratively(root, key));
    }

    public static boolean findInBT(BinaryTreeNode root, int key) {
        if(root == null)
            return false;
        if(root.data == key)
            return true;
        return findInBT(root.getLeft(), key) || findInBT(root.getRight(), key);
    }

    //Iterative way :: TC: O(n) SC: O(n)
    public static boolean findInBTIteratively(BinaryTreeNode root, int key) {
        if(root == null)
            return false;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            BinaryTreeNode tmp = s.pop();
            if(tmp.data == key)
                return true;
            else {
                if(tmp.getRight() != null)
                    s.push(tmp.getRight());
                if(tmp.getLeft() != null)
                    s.push(tmp.getLeft());
            }
        }
        return false;
    }
}
