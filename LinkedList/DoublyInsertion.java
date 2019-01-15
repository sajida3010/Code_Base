package LinkedList;

public class DoublyInsertion {
    //static  DLLNode head;
    static DLLNode head = new DLLNode(5,null,null);
    public static void main(String[] args) {
        head.setNext(new DLLNode(6));
        head.getNext().setPrev(head);
        head.getNext().setNext(new DLLNode(7));
        head.getNext().getNext().setPrev(head.getNext());

        printList(head);
        System.out.println();
        insertStart(1);
        printList(head);
        System.out.println();
        insertEnd(2);
        printList(head);
        System.out.println();
        insertAfter(9,1);
        printList(head);

    }

    private static void insertAfter(int data, int position) {
        if(position < 0) {
            position = 0;
        }
        if(head == null) {
            head = new DLLNode(data);
        }
        else if(position == 0) {
                DLLNode temp = new DLLNode(data);
                temp.setNext(head);
                head = temp;
        }
        else {
            DLLNode temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.getNext();
            }
            DLLNode newNode = new DLLNode(data);
            newNode.setNext(temp.getNext());
            newNode.setPrev(temp);
            newNode.getNext().setPrev(newNode);
            temp.setNext(newNode);

        }
    }

    private static void insertEnd(int data) {
        DLLNode last = head;
        DLLNode newNode = new DLLNode(data, null, null);
        if(head == null) {
            head = newNode;
        }
        while(last.getNext() != null ) {
            last = last.getNext();
        }
        last.setNext(newNode);
        newNode.setPrev(last);
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

    public static void printList(DLLNode head) {
        DLLNode temp = head;
        while(temp != null){
            System.out.print(temp.getData()+"~>");
            temp = temp.getNext();
        }
    }


}

