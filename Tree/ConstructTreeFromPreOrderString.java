package Tree;

//Given a tree with a special property where leaves are represented with 'L' and internal node with "I".
//Also assume that each node has either 0 or 2 children. Given preOrder traversal of this tree, construct the tree.
//e.g: Given preorder string => ILILL

public class ConstructTreeFromPreOrderString {
    public static void main(String[] args) {
        char A[] = {'I', 'L', 'I', 'L', 'L'};

        BinaryTreeNode node = buildTreeFromPreOrder(A, 0);
        BinaryTree tree = new BinaryTree();
        tree.preOrderTraversal(node);
        System.out.println(node);
    }
    public static BinaryTreeNode buildTreeFromPreOrder(char[] A, int i) {
        if(A == null)
            return null;
        if(A.length == i)
            return null;
        BinaryTreeNode newNode = new BinaryTreeNode(A[i]);
        //newNode.setData(A[i]);
        newNode.setLeft(null);
        newNode.setRight(null);
        if(A[i] == 'L')
            return newNode;
        i = i + 1;
        newNode.setLeft(buildTreeFromPreOrder(A, i));
        i = i + 1;
        newNode.setRight(buildTreeFromPreOrder(A, i));

        return newNode;
    }
}
