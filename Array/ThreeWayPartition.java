public class ThreeWayPartition {
    public static void main (String args[]) {
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        int n = arr.length;
        System.out.println("Array before sorting:");
        printArray.printArray(arr,n);
        System.out.println( " ");
        threeWayPartition(arr, 10, 20);
        System.out.println("Array after sorting:");
        printArray.printArray(arr,n);
    }
    static void threeWayPartition (int arr[], int lowVal, int highVal) {
        int start = 0; int end = arr.length - 1;
        for (int i = 0; i < arr.length - 1;) {
            if (arr[i] < lowVal) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
                i++;
            }
            else if (arr[i] > highVal) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
//                i++;
            }
            else {
                i++;
            }
        }
    }
}
