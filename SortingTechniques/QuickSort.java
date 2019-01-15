package SortingTechniques;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 5, 4, 9, 2, 12, 6};
        int n = arr.length;
        System.out.println("The array before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The array after Quick sort");
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int arr[], int l, int r) {
        int x = arr[r];
        int i = l - 1;
        for(int j = l; j < r ; j++){
            if(arr[j] <= x) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    public static int[] quickSort(int arr[], int l, int r){
        if(l < r){
            int q = partition(arr, l, r);
            quickSort(arr, l, q - 1);
            quickSort(arr, q + 1, r);
        }
        return arr;
    }
}
