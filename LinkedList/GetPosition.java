package LinkedList;

import static LinkedList.DoublyInsertion.printList;

public class GetPosition  {
    static DLLNode head = new DLLNode(9,null,null);
    public static void main(String[] args) {
        //DoublyInsertion insertNode = new DoublyInsertion();
        insertStart(999);
        insertStart(3);
        insertStart(6);
        insertStart(5);
        insertStart(23);
        printList(head);
        System.out.println();
        int position = getPosition(8);
        System.out.println("the position is: " + position);
    }
    public static void insertStart(int data) {
        DLLNode temp = head;
        DLLNode newNode = new DLLNode(data,null,null);
        if(head == null) {
            head = newNode;
        } else {
            newNode.setNext(temp);
            temp.setPrev(newNode);
            head = newNode;
        }
    }
    public static int getPosition(int data) {
        DLLNode temp = head;
        int pos = 0;
        while(temp != null) {
            if(temp.getData() == data) {
                return pos;
            }
            pos++;
            temp = temp.getNext();
        }
        return -1;
    }
}
