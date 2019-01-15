public class MoveNegativeNumberToRight {
    public static void main (String args[]) {
        int arr[] = {1, -1, -3, -2, 7, 5, 11, 6};
        int n = arr.length;
        System.out.println("Array before sorting:");
        printArray.printArray(arr,n);
        System.out.println( " ");
        segregatePosAndNegNumber(arr, n);
        System.out.println("Array after sorting:");
        printArray.printArray(arr,n);
    }
    public static void segregatePosAndNegNumber(int arr[], int n) {
        int temp[] = new int[n];
        int j = 0;
        for (int i =0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i];
            }
        }
        if ( j == n || j == 0) { //if all positive or negative number
            return;
        }
        for (int i =0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp [i];
        }
    }
}
