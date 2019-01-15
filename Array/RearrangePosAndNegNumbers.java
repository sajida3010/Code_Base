public class RearrangePosAndNegNumbers {
    public static void main (String args[]) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9, -22, 12, -6};
        int n = arr.length;
        rearrange(arr,n);
        System.out.println("Array after rearranging:");
        printArray.printArray(arr,n);
    }
    public static void rearrange(int arr[], int n) {
        int i = -1; int temp = 0;
        for (int j = 0; j < n; j++){
            if (arr [j] < 0) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(i);
        int pos = i + 1, neg = 0;

        while (pos < n && pos > neg && arr[neg] < 0) {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
    }
}
