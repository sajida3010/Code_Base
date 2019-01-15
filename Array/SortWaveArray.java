import java.util.Arrays;

public class SortWaveArray {
    public static void main (String args[]) {
//        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9, -22, 12, -6};
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        System.out.println("Array before sorting:");
        printArray.printArray(arr,n);
        System.out.println( " ");
        sortInWaveArray(arr, n);
        System.out.println("Array after sorting:");
        printArray.printArray(arr,n);
    }
    public static void sortInWaveArray(int arr[], int n) {
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i+=2) {
            Swap.swap(arr, i, i+1);
        }
    }
}
