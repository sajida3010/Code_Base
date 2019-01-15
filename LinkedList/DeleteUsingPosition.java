package LinkedList;

public class DeleteUsingPosition {
    Node head;
    public static void main (String args[]) {
        DeleteUsingPosition llist = new DeleteUsingPosition();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);

        System.out.print("\nCreated Linked List is: ");
        llist.printList();

        llist.deleteUsingPosition(4);

        System.out.print("\nLinked list after deletion: ");
        llist.printList();
    }
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void deleteUsingPosition(int position) {
        Node temp = head, prev = null;
        // If linked list is empty
        if (head == null)
            return;

        // If head needs to be removed
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }

        for(int i = 0; temp!=null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        // If position is more than number of ndoes
//        if (temp == null || temp.next == null)
//            return;

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
