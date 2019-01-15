package Tree;

public class IsMirrorOfEachOther {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        ConvertToMirror mirror = new ConvertToMirror();
        BinaryTreeNode root = tree.tree();
        BinaryTreeNode root2 = tree.tree();

        tree.PreOrder(root);
        System.out.println();

        BinaryTreeNode mirrorRoot = mirror.mirrorOfBT(root);
        tree.PreOrder(mirrorRoot);

        System.out.println(isMirror(root2, mirrorRoot));

    }
    public static boolean isMirror(BinaryTreeNode root1, BinaryTreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1.getData() != root2.getData())
            return false;

            return (isMirror(root1.getLeft(), root2.getRight()) && isMirror(root1.getRight(), root2.getLeft()));
    }
}
