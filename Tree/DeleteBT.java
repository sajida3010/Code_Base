package Tree;

public class DeleteBT {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTreeNode root = tree1.tree();

        delete(root);

    }
    public static void delete(BinaryTreeNode root){
        root = null;
    }
}
