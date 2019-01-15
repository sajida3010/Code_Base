import java.util.PriorityQueue;

public class kthLargestSumContiguousSubArray {
    public static void main(String[] args) {
        //int a[] = new int[]{ 10, -10, 20, -40 };
        int a[] = new int[]{20, -5, -1};
        int n = a.length;
        int k = 3;

        System.out.println(largestSum(a, n, k));
    }
    public static int largestSum(int arr[], int n, int k) {
        //array to store predix sums
        int sum[] = new int[n + 1];
        sum[0] = 0;
        sum[1] = arr[0];
        for(int i = 2; i <= n; i++)
            sum[i] = sum[i - 1] + arr[i - 1];

        //Priority queue of min heap
        PriorityQueue<Integer> Q = new PriorityQueue<>();

        //loop to calculate the contigous subarray sum position-wise
        for(int i =1 ; i <= n; i++){

            //loop to traverse all positions that form contiguous subarray
            for(int j = i; j <= n; j++) {
                int x = sum[j] - sum[i - 1];

                // if queue has less then k elements, then simply push it
                if(Q.size() < k){
                    Q.add(x);
                }else {
                    // it the min heap has equal to k elements then just check
                    // if the largest kth element is smaller than x then insert
                    // else its of no use
                    if(Q.peek() < x) {
                        Q.poll();
                        Q.add(x);
                    }
                }
            }
        }
        return Q.poll();
    }
}
