package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IsCyclic {
    static ListNode head;
    public static void main(String[] args) {
        UtilityFunction util = new UtilityFunction();
        InsertFromTop(3);
        InsertFromTop(2);
        InsertFromTop(8);
        InsertFromTop(6);
        InsertFromTop(13);
        InsertFromTop(22);
        InsertFromTop(80);
        InsertFromTop(56);

        System.out.println("The list is: ");
        util.printList(head);
        System.out.println();

        cyclicNode();
//        System.out.println("The list is: ");
//        util.printList(head);
//        System.out.println();
        System.out.println("Is the Linked List cyclic? " + isCyclic(head));
        System.out.println("Is the Linked List cyclic using Flyod Method? " + FloydMethod(head));
    }
    public static boolean isCyclic(ListNode head) {
       /* HashMap<Integer, ListNode> map = new HashMap<Integer,ListNode>();
        ListNode temp = head;

        while(temp != null && temp.getNext() != null) {
            int i = 1;
            if(map.containsValue(temp)){
                return true;
            } else {
                map.put(i,temp);
                System.out.println(temp);
                i++;
            }
            temp = temp.getNext();
        }
        return false;*/
        Set<ListNode> s = new HashSet<>();
        ListNode temp = head;
        while(temp != null) {
            if(s.contains(temp)) {
                return true;
            }
            s.add(temp);
            temp = temp.getNext();
        }
        return false;
    }

    //Floyd Method
    public static boolean FloydMethod(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.getNext() != null){
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();

            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    public static void InsertFromTop(int data) {
        ListNode newNode = new ListNode(data);
        newNode.setNext(head);
        head = newNode;
    }
    public static void cyclicNode() {
        ListNode last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(head.getNext().getNext());
    }
}
