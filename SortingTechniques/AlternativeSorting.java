package SortingTechniques;

import java.util.Arrays;

//TC: O(nlogn) SC:O(1)
public class AlternativeSorting {
    public static void main (String[] args)
    {
        //int arr[] = {1, 12, 4, 6, 7, 10};
        int arr[] = {2, 4, 1, 6 ,7, 5, 3};
        int n = arr.length;
        alternateSort(arr, n);
    }

    private static void alternateSort(int[] arr, int n) {
        Arrays.sort(arr);
        int i = 0, j = n - 1;

        while(i < j) {
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }
        if(n % 2 != 0){
            System.out.println(arr[j]);
        }
    }
}
