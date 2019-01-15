package LinkedList;

public class InsertInSortedLinkedList {
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

        ListNode newHead =  insertSortedNode(head, new ListNode(40));
        System.out.println("The new List after insrtion is: ");
        util.printList(newHead);

    }

    public static ListNode insertSortedNode(ListNode head, ListNode newNode) {
        ListNode current = head, temp = head;
        if(head == null) {
            return newNode;
        }
        while(current != null && current.getData() < newNode.getData()){
            temp = current;
            current = current.getNext();
        }
        newNode.setNext(current);
        temp.setNext(newNode);
        return head;
    }

    public static void InsertFromTop(int data) {
        ListNode newNode = new ListNode(data);
        newNode.setNext(head);
        head = newNode;
    }
}
