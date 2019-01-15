package DynamicPrograms;

public class LongestIncreasingSubsequence_Set3 {
    public static void main(String args[]) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Length of lis is " + lis( arr, n ) + "\n" );
    }
    static int lis(int arr[], int n) {
        int lis[] = new int[n];
        int i, j, max = 0;

        //Initiliaze Lis value to all indexes
        for(i = 0; i < n; i++) {
            lis[i] = 1;
        }

        //Compute optimized Lis values in bottom up manner
        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        //Pick maximum of all Lis values
        for (i = 0; i < n; i++) {
            if (max < lis[i]) {
                max = lis[i];
            }
        }
        return max;
    }
}

