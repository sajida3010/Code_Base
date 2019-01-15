package SortingTechniques;

import java.util.Arrays;

public class WaveSort {
    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        System.out.println("The array before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The array after wave sort");
        waveSort1(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("The array after wave sort method 2");
        waveSort2(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] waveSort1(int arr[], int n) {
        Arrays.sort(arr);
        for(int i = 0; i < n - 1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static int[] waveSort2(int arr[], int n) {
        for(int i = 0; i < n - 1; i+=2) {
            if(i > 0 && arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if(i < n - 1 && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[ i + 1] = temp;
            }
        }
        return arr;
    }
}
