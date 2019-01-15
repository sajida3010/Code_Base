package Tree;

public class PrintAllAncestorsOfNodeInATree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);

        System.out.println("The ancestors are " + printAllAncestors(root, root.right.right));
    }
    public static boolean printAllAncestors(BinaryTreeNode root, BinaryTreeNode node) {
        if(root == null)
            return false;
        if(root.getLeft() == node || root.getRight() == node ||
                printAllAncestors(root.getLeft(), node) || printAllAncestors(root.getRight(), node)) {
            System.out.println(root.getData());
            return true;
        }
        return false;
    }
}

