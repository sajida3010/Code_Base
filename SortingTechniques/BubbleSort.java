package SortingTechniques;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 5, 4, 9, 2, 12, 6};
        int n = arr.length;
        System.out.println("The array before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The array after Bubble sort");
        bubble(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubble(int arr[], int n) {
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
