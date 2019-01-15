package LinkedList;

public class StackUsingLL {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("The length of the stack is: " + stack.size());
        printList(stack);

    }
    public static void printList(LinkedStack stack) {
        ListNode temp = stack.getTop();
        while(temp != null){
            System.out.print(temp.getData()+"~>");
            temp = temp.getNext();
        }
    }

}
