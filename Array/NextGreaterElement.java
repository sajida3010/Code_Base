import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2 ,25};
        int n = arr.length;
        //nextGreaterElement(arr, n);
        nextGreaterElement2(arr, n);
    }
//    T.C: O(n2);
    public static void nextGreaterElement(int arr[], int n) {
        int next, i, j;
        for(i = 0; i < n; i++) {
            next = -1;
            for(j = i + 1; j < n; j++) {
                if(arr[i] < arr[j]){
                    next = arr[j];
                    //System.out.println(arr[i] + " -> " + next);
                    break;
                }
            }
            System.out.println(arr[i] + " -> " + next);
        }
    }

    //Method using stack in O(n);
    public static void nextGreaterElement2(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        int nge[] = new int[arr.length];
        // s.push(arr[0]);
/* if stack is not empty, then
            pop an element from stack.
            If the popped element is smaller
            than next, then
            a) print the pair
            b) keep popping while elements are
            smaller and stack is not empty */
        for(int i = n - 1; i >= 0; i-- ) {
            if (!s.empty()) {
                while (!s.empty() && s.peek() <= arr[i]) {
                    s.pop();
                }
            }
            nge[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " -> " + nge[i]);
    }
}
