package Tree;

public class ConvertToMirror {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTreeNode root = tree.tree();

        tree.PreOrder(root);
        System.out.println();

        BinaryTreeNode mirrorRoot = mirrorOfBT(root);
        tree.PreOrder(mirrorRoot);
    }
    public static BinaryTreeNode mirrorOfBT(BinaryTreeNode root){
        BinaryTreeNode temp;
        if(root != null){
            mirrorOfBT(root.getLeft());
            mirrorOfBT(root.getRight());
            temp = root.getLeft();
            root.left = root.getRight();
            root.right = temp;
        }
        return root;
    }
}
