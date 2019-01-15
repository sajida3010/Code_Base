public class ReverseArray {
    public static void main (String args[]) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9, -22, 12, -6};
        int start = 0;
        int end = arr.length - 1;
        int n = arr.length;
        System.out.println("Array before reversing:");
        printArray.printArray(arr,n);
        System.out.println( " ");
        reverse(arr, start, end);
        System.out.println("Array after reversing:");
        printArray.printArray(arr,n);
    }
    public static void reverse (int arr[], int start, int end) {
        int temp;
        if(start >= end) {
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }
}
