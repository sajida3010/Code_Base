package LinkedList;

public class SimpleProgram {
    Node head; //head of List
    //Method to create a simple linkedlist with three nodes
    public static void main(String args[]) {
        //Start with the empty list
        SimpleProgram llist = new SimpleProgram();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second; //Link first node with the second node
        second.next = third; //Link second node with the third node
        llist.printList();
    }

    //LinkedList Node class
    static class Node {
        int data;
        Node next;

        //Constructor of Node class
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void printList() {
        Node n = head;
        while( n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
