package LinkedList;

public class FindPalindrome {
    static ListNode head = new ListNode('k');
    public static void main(String[] args) {
        UtilityFunction util = new UtilityFunction();
        head = util.InsertFromTop('a', head);
        head = util.InsertFromTop('m', head);
        head = util.InsertFromTop('a', head);
        head = util.InsertFromTop('k', head);
        //head = util.InsertFromTop('l', head);

        System.out.println("The list is: ");
        util.printList(head);
        System.out.println();

        ListNode middleNode = middle(head);

        System.out.println("The middle of the Linked List is: " + middleNode.getData());

        ListNode afterReverse = reverse(head);

        /*System.out.println("After reverse, the List is: ");
        util.printList(afterReverse);
        System.out.println();*/

        System.out.println("Is the Linked List palindrome? " + isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        UtilityFunction util = new UtilityFunction();
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;
        ListNode prev_of_slow_ptr = head;
        ListNode midnode = null;  // To handle odd size list
        boolean res = true; // initialize result

        if(head != null && head.getNext()!= null) {
            while(fast_ptr != null && fast_ptr.getNext() != null) {
                fast_ptr = fast_ptr.getNext().getNext();

                /*We need previous of the slow_ptr for
                  linked lists  with odd elements */
                prev_of_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.getNext();
            }

            if(fast_ptr != null) {
                midnode = slow_ptr;
                slow_ptr = slow_ptr.getNext();
            }

            ListNode second_half = slow_ptr;
            prev_of_slow_ptr.setNext(null); // NULL terminate first half
            reverse(second_half);  // Reverse the second half

            //Printing reverse of second half
            System.out.println("After reverse, the List is: ");
            ListNode chk = reverse(second_half);
            util.printList(chk);

            res = compareLists(head, second_half); // compare

            /* Construct the original list back */
            reverse(second_half); // Reverse the second half again

            if (midnode != null)
            {
                // If there was a mid node (odd size case) which
                // was not part of either first half or second half.
                prev_of_slow_ptr.setNext(midnode);
                midnode.setNext(second_half);
            } else
                prev_of_slow_ptr.setNext(second_half);
        }
        return res;
        }

    private static boolean compareLists(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        while (temp1 != null && temp2 != null)
        {
            if (temp1.getData() == temp2.getData())
            {
                temp1 = temp1.getNext();
                temp2 = temp2.getNext();
            } else
                return false;
        }

        /* Both are empty reurn 1*/
        if (temp1 == null && temp2 == null)
            return true;

        /* Will reach here when one is NULL
           and other is not */
        return false;
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

    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            ListNode next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
       return prev;
    }
}
