package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree {
    public static void main(String[] args) {
        /*BinaryTreeNode root = new BinaryTreeNode(5);
        root.setLeft(new BinaryTreeNode(6));
        root.setRight(new BinaryTreeNode(7));
        root.getLeft().setLeft(new BinaryTreeNode(12));
        root.getLeft().getLeft().setRight(new BinaryTreeNode(13));
        root.getRight().setLeft(new BinaryTreeNode(24));
        root.getRight().setRight(new BinaryTreeNode(32));*/

        BinaryTreeNode root = tree();

        PreOrder(root);
        System.out.println();
        InOrder(root);
        System.out.println();
        PostOrder(root);
        System.out.println();

        ArrayList list;
        list = preOrderTraversal(root);
        System.out.println(list);


    }

    public static void PreOrder(BinaryTreeNode root) {
        if(root != null) {
            System.out.print(root.data+" ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    public static void InOrder(BinaryTreeNode root) {
        if(root != null) {
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }

    public static void PostOrder(BinaryTreeNode root) {
        if(root != null) {
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static ArrayList<Integer> preOrderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            BinaryTreeNode temp = s.pop();
            res.add(temp.data);
            if(temp.right != null)
                s.push(temp.right);
            if(temp.left != null)
                s.push(temp.left);
        }
        return res;
    }

    public static BinaryTreeNode tree() {
        BinaryTreeNode root = new BinaryTreeNode(5);
        root.setLeft(new BinaryTreeNode(6));
        root.setRight(new BinaryTreeNode(7));
        root.getLeft().setLeft(new BinaryTreeNode(12));
        root.getLeft().getLeft().setRight(new BinaryTreeNode(13));
        root.getRight().setLeft(new BinaryTreeNode(24));
        root.getRight().setRight(new BinaryTreeNode(32));

        return root;
    }

    public static BinaryTreeNode bst() {
        BinaryTreeNode root = new BinaryTreeNode(8);
        root.setLeft(new BinaryTreeNode(3));
        root.setRight(new BinaryTreeNode(10));
        root.getLeft().setLeft(new BinaryTreeNode(1));
        root.getLeft().setRight(new BinaryTreeNode(6));
        root.getLeft().getRight().setLeft(new BinaryTreeNode(4));
        root.getLeft().getRight().setRight(new BinaryTreeNode(7));
        root.getRight().setRight(new BinaryTreeNode(14));
        root.getRight().getRight().setLeft(new BinaryTreeNode(13));

        return root;
    }
}
