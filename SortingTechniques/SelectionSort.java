package SortingTechniques;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 5, 4, 9, 2, 12, 6};
        int n = arr.length;
        System.out.println("The array before sorting");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The array after Selection sort");
        selection(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selection(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            int index = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[index])
                    index = j;
            }
            int min_value = arr[index];
            arr[index] = arr[i];
            arr[i] = min_value;
        }
        //return arr;
    }
}
