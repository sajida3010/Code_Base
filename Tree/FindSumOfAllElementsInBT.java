package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindSumOfAllElementsInBT {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTreeNode root = tree.tree();
      int res = sumOfAllElements(root);
        System.out.println("Recursively: " + res);
      int res2 = sumOfAllElements2(root);
        System.out.println("Iteratively: " + res2);
    }
    public static int sumOfAllElements(BinaryTreeNode root) {
        if(root == null) return 0;
        else
            return (root.getData() + sumOfAllElements(root.getLeft()) + sumOfAllElements(root.getRight()));
    }

    //Iteratively
    public static int sumOfAllElements2(BinaryTreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode temp = q.poll();
            if(temp != null){
                sum += temp.getData();
                if(temp.getLeft() != null){
                    q.offer(temp.getLeft());
                }
                if(temp.getRight() != null) {
                    q.offer(temp.getRight());
                }
            }
        }
        return sum;
    }
}
