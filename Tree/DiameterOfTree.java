package Tree;

public class DiameterOfTree {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
//        BinaryTreeNode root = tree.tree();
        int result = diameterOfTree(root);
        System.out.println(result);

        int dia = diameter(root);
        System.out.println("The diameter of tree is: " + dia);
    }
    public static int diameterOfTree(BinaryTreeNode root){
        int left, right;
        int diameter = Integer.MIN_VALUE;
        if(root == null)
            return 0;
        left = diameterOfTree(root.getLeft());
        right = diameterOfTree(root.getRight());
        return Math.max(left, right) + 1;
    }

    //Alternative Coding
    public static int diameter(BinaryTreeNode root) {
        if (root == null) return 0;

        //the path that goes through the root
        int len1 = height(root.left) + height(root.right) + 1;

        //the path does not pass the root
        int len2 = Math.max(diameter(root.left), diameter(root.right));

        return Math.max(len1, len2);
    }

        public static int height(BinaryTreeNode root){
            if(root == null) return 0;

            int leftDepth = height(root.getLeft());
            int rightDepth = height(root.getRight());

            return (leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1);
    }
}
