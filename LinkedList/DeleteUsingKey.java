package LinkedList;

public class DeleteUsingKey {
    Node head;
    public static void main (String args[]) {
        DeleteUsingKey llist = new DeleteUsingKey();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.print("\nCreated Linked List is: ");
        llist.printList();

        llist.deleteUsingKey(1);

        System.out.print("\nLinked list after deletion: ");
        llist.printList();

    }
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void deleteUsingKey(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        // If key was not present in linked list
        if(temp == null)
            return;
        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
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
