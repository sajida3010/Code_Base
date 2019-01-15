package LinkedList;

public class InsertionInLinkedList {
    Node head;
    public static void main(String args[]) {
        InsertionInLinkedList llist = new InsertionInLinkedList();
        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);
        llist.insertAfter(llist.head.next, 8);
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
    }
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Insert a new node at front of the list
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    //Inserts a new node after the given prev_node
    public void insertAfter(Node prev_node, int new_data) {
        if(prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    //Appends a new node at the end.
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;

        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
}
