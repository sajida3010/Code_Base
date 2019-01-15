public class Segregate0sAnd1s {
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < n; i++) {
            arr [i]  = 1;
        }
    }
}
