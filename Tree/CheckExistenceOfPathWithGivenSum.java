package Tree;

//Given a sum, check whether there exists a path from root to any of the nodes

public class CheckExistenceOfPathWithGivenSum {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTreeNode root = tree.tree();

        System.out.println(hasPathSum(root, 6));
    }
   /* The strategy is to substract the node value from the sum before calling its children recursively,
    and check to see if the sum is 0 when we ru out of tree.*/
    public static boolean hasPathSum(BinaryTreeNode root, int sum){
        if(root == null) return false;
        if(root.getLeft() == null && root.getRight() == null && root.getData() == sum)
            return true;
        else
            return (hasPathSum(root.getLeft(), sum - root.getData()) ||
            hasPathSum(root.getRight(), sum - root.getData()));
    }
}
