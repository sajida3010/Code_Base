package Tree;

//The width of a BT is the maximum number of elements on one level of the tree.

public class WidthOfTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTreeNode root = tree.tree();
        int result = width(root);
        System.out.println(result);
    }
    public static int width(BinaryTreeNode root) {
        MaximumHeigthofBT maxi = new MaximumHeigthofBT();
        int max = 0;
        int height = maxi.maxHeight(root);
        for(int k = 0; k <= height; k++){
            int temp = width(root, k);
            if(temp > max) max = temp;
        }
        return max;
    }
    //Returns the number of node o a given level
    public static int width(BinaryTreeNode root, int depth){
        if(root == null) return 0;
        else
            if(depth == 0) return 1;
            else
                return width(root.left, depth -1) + width(root.right, depth - 1);
    }
}
