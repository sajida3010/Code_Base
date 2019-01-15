package LinkedList;

import java.util.EmptyStackException;

public class LinkedStack {
    private int length;
    private ListNode top;

    //Constructor: Creates an empty stack
    public LinkedStack() {
        length = 0;
        top = null;
    }

    public ListNode getTop() {
        return top;
    }

    public boolean isEmpty() {
        return (length == 0);
    }
    //Adds the specified data to the top of the stack
    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    //Remove the data at the top of the stack and returns a reference to it
    public int pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }

    //Returns a refernce to the data at the top of the stack.
    //the data is not removed from the stack

    public int peek() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.getData();
    }

    //Returns the number of elements in the stack
    public int size() {
        return length;
    }
}
