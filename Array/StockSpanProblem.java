import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int price[] = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int S[]= new int[n];

        stockSpan2(price, n, S);
        printArray print = new printArray();
        print.printArray(S, S.length);
    }
    public static void stockSpan(int arr[], int n, int S[]) {
        // Span value of first day is always 1
        S[0] = 1;

        // Calculate span value of remaining days by linearly checking
        // previous days
        for (int i = 1; i < n; i++)
        {
            S[i] = 1; // Initialize span value

            // Traverse left while the next element on left is smaller
            // than price[i]
            for (int j = i-1; (j>=0)&&(arr[i]>=arr[j]); j--)
                S[i]++;
        }
    }

    //Method 2 using stack(similar to next great element method), O(n);
    public static void stockSpan2(int arr[], int n, int S[]) {
        // Create a stack and push index of first element to it
        Stack<Integer> st = new Stack<>();
        st.push(0);

        // Span value of first element is always 1
        S[0] = 1;

        // Calculate span values for rest of the elements
        for (int i = 1; i < n; i++) {
            // Pop elements from stack while stack is not empty and top of
            // stack is smaller than price[i]
            while (!st.empty() && arr[st.peek()] <= arr[i])
                st.pop();

            // If stack becomes empty, then price[i] is greater than all elements
            // on left of it, i.e., price[0], price[1],..price[i-1]. Else price[i]
            // is greater than elements after top of stack
            S[i] = (st.empty()) ? (i + 1) : (i - st.peek());

            // Push this element to stack
            st.push(i);
        }
    }
}
