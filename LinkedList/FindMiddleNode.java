package LinkedList;

public class FindMiddleNode {
    static ListNode head = new ListNode(5);
    public static void main(String[] args) {
        UtilityFunction util = new UtilityFunction();
        head = util.InsertFromTop(3, head);
        head = util.InsertFromTop(2, head);
        head = util.InsertFromTop(8, head);
        head = util.InsertFromTop(6, head);
        head = util.InsertFromTop(12, head);
        head = util.InsertFromTop(80, head);
        head = util.InsertFromTop(36, head);

        System.out.println("The list is: ");
        util.printList(head);
        System.out.println();

        ListNode middleNode = middle(head);

        System.out.println("The middle of the Linked List is: " + middleNode.getData());
    }

    public static ListNode middle(ListNode head) {
        ListNode fastPtr, slowPtr;
        fastPtr = slowPtr = head;
        int i = 0;
        while(fastPtr.getNext() != null) {
            if(i == 0) {
                fastPtr = fastPtr.getNext();
                i = 1;
            } else if(i == 1) {
                fastPtr = fastPtr.getNext();
                slowPtr = slowPtr.getNext();
                i = 0;
            }
        }
        return slowPtr;
    }
}
