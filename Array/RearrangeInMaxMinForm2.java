import java.util.Arrays;

public class RearrangeInMaxMinForm2 {
    public static void main (String args[]) {
        int arr[] = {1, 6, 9, 4, 3, 7, 8, 2};
        int n = arr.length;
        System.out.println("Array before sorting:");
        printArray.printArray(arr,n);
        System.out.println( " ");
        rearrange(arr, n);
        System.out.println("Array after sorting:");
        printArray.printArray(arr,n);
    }
    public static void rearrange(int arr[], int n)
    {
//        If array is not sorted, then sort the array;
        Arrays.sort(arr);
        // initialize index of first minimum and first
        // maximum element
        int max_idx = n-1 , min_idx = 0 ;

        // store maximum element of array
        int max_elem = arr[n-1] + 1 ;

        // traverse array elements
        for (int i=0; i < n ; i++)
        {
            // at even index : we have to put
            //maximum element
            if (i % 2 == 0)
            {
                arr[i] += (arr[max_idx] % max_elem ) * max_elem;
                max_idx--;
            }

            // at odd index : we have to put minimum element
            else
            {
                arr[i] += (arr[min_idx] % max_elem ) * max_elem;
                min_idx++;
            }
        }

        // array elements back to it's original form
        for (int i = 0 ; i < n; i++)
            arr[i] = arr[i] / max_elem ;
    }
}
