public class Segregate0sAnd1s_2 {
    public static void main (String args[]) {
        int arr[] = {0, 1, 0, 1, 1, 1 };
        int n = arr.length;
        System.out.println("Array before sorting:");
        printArray.printArray(arr,n);
        System.out.println( " ");
        segregate0sAnd1s(arr, n);
        System.out.println("Array after sorting:");
        printArray.printArray(arr,n);
    }
    public static void segregate0sAnd1s(int arr[], int n) {
        int left = 0, right = n - 1;

        while (left < right)
        {
            /* Increment left index while we see 0 at left */
            while (arr[left] == 0 && left < right)
                left++;

            /* Decrement right index while we see 1 at right */
            while (arr[right] == 1 && left < right)
                right--;

            /* If left is smaller than right then there is a 1 at left
               and a 0 at right.  Exchange arr[left] and arr[right]*/
            if (left < right)
            {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}
