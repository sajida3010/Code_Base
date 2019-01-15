package LinkedList;

public class UtilityFunction {
     ListNode head;

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
    }
    public ListNode InsertFromTop(int data, ListNode head) {
        ListNode newNode = new ListNode(data);
        newNode.setNext(head);
        return newNode;
    }
}
