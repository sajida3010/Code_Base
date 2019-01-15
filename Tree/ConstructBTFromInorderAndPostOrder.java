package Tree;

public class ConstructBTFromInorderAndPostOrder {
    public static void main(String[] args) {

    }
    public static BinaryTreeNode buildBinaryTree(int[] inOrder, int[] postOrder) {
        if(inOrder.length == 0 || inOrder.length != postOrder.length)
            return null;
        return buildBT(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private static BinaryTreeNode buildBT(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd) {
        if(postStart > postEnd || inStart > inEnd)
            return null;
        int val = postOrder[postEnd];
        BinaryTreeNode curr = new BinaryTreeNode(val);
        int offset = inStart;

        for(; offset < inEnd; offset++){
            if(inOrder[offset] == val)
                break;
        }
        curr.left = buildBT(postOrder, postStart, postStart + offset - inStart + 1,
                inOrder, inStart, offset - 1);
        curr.right = buildBT(postOrder, postStart + offset -inStart, postEnd - 1,
                inOrder, offset + 1, inEnd);

        return curr;
    }
}
