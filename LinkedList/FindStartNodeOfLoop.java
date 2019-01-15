package LinkedList;


//This method is the extension of Floyd Method.
public class FindStartNodeOfLoop {
    static ListNode head;
    public static void main(String[] args) {
        UtilityFunction util = new UtilityFunction();
        head = util.InsertFromTop(3, head);
        head = util.InsertFromTop(2, head);
        head = util.InsertFromTop(8, head);
        head = util.InsertFromTop(6, head);
        head = util.InsertFromTop(13, head);
        head = util.InsertFromTop(22, head);
        head = util.InsertFromTop(80, head);
        head = util.InsertFromTop(56, head);

        System.out.println("The list is: ");
        util.printList(head);
        System.out.println();

        cyclicNode();

        System.out.println("The beginning of the loop is: " + findBeginOfLoop(head).getData());
    }
    public static ListNode findBeginOfLoop(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        boolean loopExists = false;

        while(fastPtr != null && fastPtr.getNext() != null){
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();

            if(slowPtr == fastPtr){
                loopExists = true;
                break;
            }
        }
        if(loopExists) {
            slowPtr = head;
            while(slowPtr != fastPtr) {
                slowPtr = slowPtr.getNext();
                fastPtr = fastPtr.getNext();
            }
            return fastPtr;
        } else
        return null;
    }

    public static void cyclicNode() {
        ListNode last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(head.getNext().getNext());
    }
}
