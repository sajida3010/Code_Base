package LinkedList;

import static LinkedList.DoublyInsertion.printList;

public class DoublyDeletion {
    static DLLNode head;
    public static void main(String[] args) {
        insertStart(999);
        insertStart(3);
        insertStart(6);
        insertStart(5);
        insertStart(23);
        printList(head);
        System.out.println();
        deletefromPosition(0);
        printList(head);
    }

    private static void deletefromPosition(int position) {
        if(head == null) {
            return;
        }
        if(position == 0) {
           head = head.getNext();
        } else {
            DLLNode temp = head;
            for(int i = 0; i < position; i++) {
                temp = temp.getNext();
            }
            temp.getPrev().setNext(temp.getNext());
            temp.getNext().setPrev(temp.getPrev());
        }
    }

    //Remove a node matching the specified node from the list.
    public static void removematched(DLLNode node) {
        if(head == null) {
            return;
        }
        if(node.equals(head)) {
            head = head.getNext();
        } else {
            DLLNode p = head;
            while(p != null) {
                if(node.equals(p)) {
                    p.getPrev().setNext(p.getNext());
                    p.getNext().setPrev(p.getPrev());
                }
            }
        }
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

}
