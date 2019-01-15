import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxProd {
    public static void main(String[] args) {
        
    }
        public int maxSpecialProduct(ArrayList<Integer> A) {
            int n = A.size();
            int[] left = new int[n];
            int[] right = new int[n];

            Deque<Integer> q = new ArrayDeque<>();
            q.addLast(0);

            for(int i = 1; i < n; i++){
                while(!q.isEmpty()){
                    if(A.get(q.getLast()) > A.get(i)) break;
                    q.removeLast();
                }
                left[i] = (q.isEmpty()) ? 0 : q.getLast();
                q.addLast(i);
            }
            q = new ArrayDeque<>();
            q.addLast(n - 1);
            for(int i = n - 2; i >= 0; i--){
                while(!q.isEmpty()){
                    if(A.get(q.getLast()) > A.get(i)) break;
                    q.removeLast();
                }
                right[i] = (q.isEmpty()) ? 0 : q.getLast();
                q.addLast(i);
            }
            long mx = -1;
            for(int i = 0; i < n; i++){
                mx = Long.max(mx, 1L * left[i] * right[i]);
            }
            return (int)(mx % 1000000007);
        }
}
