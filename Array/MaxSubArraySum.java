//Maximum Subarray Sum Excluding Certain Elements
//https://www.geeksforgeeks.org/maximum-subarray-sum-excluding-certain-elements/

public class MaxSubArraySum {
    public static void main(String[] args) {
        int A[] = { 3, 4, 5, -4, 6 };
        int B[] = { 1, 8, 5 };

        int n = A.length;
        int m = B.length;

        // Calling Function
        findMaxSubArraySum(A, B, n, m);
    }
    public static boolean isPresent(int B[], int n, int x){
        for(int i = 0; i < n; i++){
            if(B[i] == x){
                return true;
            }
        }
        return false;
    }

    public static int findMaxSubArraySumUtil(int A[], int B[], int m, int n){
        int max_so_far = Integer.MIN_VALUE;
        int curr_max = 0;
        for(int i = 0; i < m; i++){
            if(isPresent(B,n,A[i])){
                curr_max = 0;
                continue;
            }
            curr_max = Math.max(A[i], curr_max + A[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
    static void findMaxSubArraySum(int A[], int B[], int m, int n) {
        int maxSum = findMaxSubArraySumUtil(A, B, m, n);
        if(maxSum == Integer.MIN_VALUE)
            System.out.println("Maximum Subarray Sum"
                    + " " + "can't be found");
        else
            System.out.println("The Maximum Subarray Sum = "
                    + maxSum);
    }
}
