package LinkedList;

public class RemoveDuplicatesFromSortedLinkedList {
    static ListNode head = new ListNode(11);
    public static void main(String[] args) {
        UtilityFunction util = new UtilityFunction();
        head = util.InsertFromTop(11, head);
        head = util.InsertFromTop(9, head);
        head = util.InsertFromTop(8, head);
        head = util.InsertFromTop(8, head);
        head = util.InsertFromTop(5, head);
        head = util.InsertFromTop(3, head);
        head = util.InsertFromTop(3, head);
        head = util.InsertFromTop(1, head);

        System.out.println("The list is: ");
        util.printList(head);
        System.out.println();

        findDuplicate_Own(head);

        //removeDuplicates(head);
        System.out.println("The List after removing duplicates: ");
        util.printList(head);
    }

    public static void findDuplicate_Own(ListNode head) {
        ListNode curr = head.getNext();
        ListNode prev = head;
        while(prev.getNext() != null) {
            if(prev.getData() == curr.getData()){
                ListNode next = prev.getNext().getNext();
                prev.setNext(null);
               // prev.setNext(curr.getNext());
                prev.setNext(next);

            } else{
                prev = prev.getNext();
            }
            curr = curr.getNext();
        }
    }

    public static void removeDuplicates(ListNode head) {
        ListNode current = head;
        ListNode next;
        if (head == null)
            return;

        /* Traverse list till the last node */
        while (current.getNext() != null) {

            /*Compare current node with the next node */
            if (current.getData() == current.getNext().getData()) {
                next = current.getNext().getNext();
                current.setNext(null);
                current.setNext(next);
            }
            else // advance if no deletion
                current = current.getNext();
        }
    }
}
