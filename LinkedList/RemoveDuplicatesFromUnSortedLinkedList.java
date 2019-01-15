package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesFromUnSortedLinkedList {
    static ListNode head = new ListNode(21);
    public static void main(String[] args) {
        UtilityFunction util = new UtilityFunction();
        head = util.InsertFromTop(43, head);
        head = util.InsertFromTop(41, head);
        head = util.InsertFromTop(21, head);
        head = util.InsertFromTop(12, head);
        head = util.InsertFromTop(11, head);
        head = util.InsertFromTop(12, head);

        System.out.println("The list is: ");
        util.printList(head);
        System.out.println();

        //removeDuplicates(head);
        removeDuplicates_Hashing(head);

        System.out.println("The List after removing duplicates is: ");
        util.printList(head);
        System.out.println();
    }

    // Method 1 T.C: O(n2)
    public static void removeDuplicates(ListNode head) {
        ListNode ptr1, ptr2, dup;
        ptr1 = head;

        while(ptr1 != null && ptr1.getNext() != null) {
            ptr2 = ptr1;
            while(ptr2.getNext() != null) {
                if(ptr1.getData() == ptr2.getNext().getData()) {
                    dup = ptr2.getNext();
                    ptr2.setNext(ptr2.getNext().getNext());
                    dup.setNext(null);
                } else {
                    ptr2 = ptr2.getNext();
                }
            }
            ptr1 = ptr1.getNext();
        }
    }

    //Method 2: Using hashing, T.c: O(n)
    public static void removeDuplicates_Hashing(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        HashSet<Integer> hs = new HashSet<>();

        while(current != null) {
            int curVal = current.getData();
            if(hs.contains(curVal)){
                prev.setNext(current.getNext());
            } else {
                hs.add(curVal);
                prev = current;
            }
            current = current.getNext();
        }
    }
}
