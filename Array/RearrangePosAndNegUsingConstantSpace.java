public class RearrangePosAndNegUsingConstantSpace {
    public static void main (String args[]) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9, -22, 12, -6};
        int n = arr.length;
        System.out.println("Array before sorting:");
        printArray.printArray(arr,n);
        System.out.println( " ");
        rearrangeWithConstantSpace(arr, n);
        System.out.println("Array after sorting:");
        printArray.printArray(arr,n);
    }
    static void rearrangeWithConstantSpace(int arr[], int n) {
        int j=0;
        for (int i = 1; i < n; i++) {
            int key = arr [i];
//            int j = i + 1;
            if (key > 0) {
                continue;
            }
            j= i -1;
            while (j >=0 && arr[j] > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }


    }
}
