package LinkedList;

/*This may look a simple problem, but is interesting question as it has following cases to be handled.
        1) x and y may or may not be adjacent.
        2) Either x or y may be a head node.
        3) Either x or y may be last node.
        4) x and/or y may not be present in linked list.*/

public class SwapNodesWithoutSwappingData {
    static ListNode head = new ListNode(21);
    public static void main(String[] args) {
        UtilityFunction util = new UtilityFunction();
        head = util.InsertFromTop(43, head);
        head = util.InsertFromTop(41, head);
        head = util.InsertFromTop(2, head);
        head = util.InsertFromTop(12, head);
        head = util.InsertFromTop(11, head);
        head = util.InsertFromTop(5, head);

        System.out.println("The list is: ");
        util.printList(head);
        System.out.println();

        swapNodes(12, 43);

        System.out.println("The list after swapping is: ");
        util.printList(head);
        System.out.println();
    }

    public static void swapNodes(int x, int y) {
        // Nothing to do if x and y are same
        if (x == y) return;

        // Search for x (keep track of prevX and CurrX)
        ListNode prevX = null, currX = head;
        while (currX != null && currX.getData() != x)
        {
            prevX = currX;
            currX = currX.getNext();
        }
        // Search for y (keep track of prevY and CurrY)
        ListNode prevY = null, currY = head;
        while (currY != null && currY.getData() != x)
        {
            prevY = currY;
            currY = currY.getNext();
        }

        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;

        // If x is not head of linked list
        if (prevX != null)
            prevX.setNext(currY);
        else //make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.setNext(currX);
        else // make x the new head
            head = currX;


        // Swap next pointers
        ListNode temp = currX.getNext();
        currX.setNext(currY.getNext());
        currY.setNext(temp);
    }
}
