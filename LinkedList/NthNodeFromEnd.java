package LinkedList;

//T.C = O(n)   S.c=O(1)
public class NthNodeFromEnd {
    static ListNode head = new ListNode(5);
    public static void main(String[] args) {
        UtilityFunction util = new UtilityFunction();
        head = util.InsertFromTop(3, head);
        head = util.InsertFromTop(2, head);
        head = util.InsertFromTop(8, head);
        head = util.InsertFromTop(6, head);
        /*InsertFromTop(3);
        InsertFromTop(2);
        InsertFromTop(8);
        InsertFromTop(6);
*/
        System.out.println("The list is: ");
        util.printList(head);
        System.out.println();

        ListNode result = nodeFromEnd(head, 4);
        System.out.println("The nth node is: " + result.getData());

        ListNode result2 = nodeFromEnd2(head, 4);
        System.out.println("The nth node from Method 2 is: " + result2.getData());
    }

    //Method 1:
    public static ListNode nodeFromEnd(ListNode head, int NthNode) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.getNext();
            length++;
        }
        if(length < NthNode){
            return null;
        }
        temp = head;
        int position = length - NthNode + 1;
        System.out.println("The position is: " + position);
        for(int i = 1; i < position; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    //Method 2: Maintain two pointer
    public static ListNode nodeFromEnd2(ListNode head, int nthNode) {
        ListNode mainPointer = head;
        ListNode refPointer = head;
        int count = 0;

        if(head != null) {
            while(count < nthNode) {
                if(refPointer == null) {
                    System.out.println(nthNode + "is greater than no. of nodes in the list");
                }
                refPointer = refPointer.getNext();
                count++;
            }
        }
        while(refPointer != null) {
            refPointer = refPointer.getNext();
            mainPointer = mainPointer.getNext();
        }
        return mainPointer;
    }

    public static void InsertFromTop(int data) {
        ListNode newNode = new ListNode(data);
        newNode.setNext(head);
        head = newNode;
    }
}
