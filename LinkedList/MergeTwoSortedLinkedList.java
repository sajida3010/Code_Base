package LinkedList;

public class MergeTwoSortedLinkedList {
    static ListNode head = new ListNode(0);

    public static void main(String[] args) {
        ListNode head1 = new ListNode(11);
        ListNode head2 = new ListNode(14);
        UtilityFunction util = new UtilityFunction();
        head1 = util.InsertFromTop(8, head1);
        head1 = util.InsertFromTop(5, head1);
        head1 = util.InsertFromTop(4, head1);
        head1 = util.InsertFromTop(2, head1);
//        head1 = util.InsertFromTop(2, head1);

        head2 = util.InsertFromTop(10, head2);
        head2 = util.InsertFromTop(9, head2);
        head2 = util.InsertFromTop(7, head2);
        head2 = util.InsertFromTop(6, head2);
        head2 = util.InsertFromTop(3, head2);
        head2 = util.InsertFromTop(1, head2);
//        head2 = util.InsertFromTop(1, head2);

        System.out.println("The list1 is: ");
        util.printList(head1);
        System.out.println();

        System.out.println("The list2 is: ");
        util.printList(head2);
        System.out.println();

        ListNode result = mergeTwoLists(head1, head2);

        System.out.println("The merged list is: ");
        util.printList(result);
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode curr = head;

        while(head1 != null && head2 != null) {
            if (head1.getData() <= head2.getData()) {
                curr.setNext(head1);
                head1 = head1.getNext();
            } else {
                curr.setNext(head2);
                head2 = head2.getNext();
            }
            curr = curr.getNext();
        }
        if(head1 != null){
            curr.setNext(head1);
            //head1 = head1.getNext();
        } else if (head2 != null) {
            curr.setNext(head2);
        }
        return head.getNext();
    }
}
