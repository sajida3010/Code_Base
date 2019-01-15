package SortingTechniques;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 5, 4, 9, 2, 12, 6};
        int n = arr.length;
        System.out.println("The array before sorting");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The array after Insertion sort");
        insertion(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*public static int[] insertion(int arr[], int n){
        for(int i = 1; i < n; i++){
            int key = arr[i];
            for(int j = i - 1; j >= 0; j--){
                if(key < arr[j]) {
                    arr[j + 1] = arr[j];
                }
                arr[j] = key;
            }
            //key = arr[i];
        }
        return arr;
    }*/

    public static int[] insertion(int arr[], int n) {
        for(int i =1; i< n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >=0 && key< arr[j]){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
