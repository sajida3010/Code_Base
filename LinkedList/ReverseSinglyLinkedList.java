package LinkedList;

public class ReverseSinglyLinkedList {
    static ListNode head;
    public static void main(String[] args) {
        UtilityFunction util = new UtilityFunction();
        InsertFromTop(63);
        InsertFromTop(62);
        InsertFromTop(58);
        InsertFromTop(46);
        InsertFromTop(36);
        InsertFromTop(28);
        InsertFromTop(25);
        InsertFromTop(10);

        System.out.println("The list is: ");
        util.printList(head);
        System.out.println();

        ListNode newHead = reverseIteratively(head);
        System.out.println("The reverse list is: ");
        util.printList(newHead);
    }

    public static ListNode reverseIteratively(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while(current != null) {
            ListNode next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void InsertFromTop(int data) {
        ListNode newNode = new ListNode(data);
        newNode.setNext(head);
        head = newNode;
    }
}
