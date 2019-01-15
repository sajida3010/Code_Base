package SortingTechniques;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 5, 4, 9, 2, 12, 6};
        int n = arr.length;
        System.out.println("The array before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The array after Merge sort");
        mergeSort(arr,0, arr.length - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge(int arr[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        //Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = arr[p + i];
        }
        for(int j = 0; j < n2; j++) {
            R[j] = arr[q + j + 1];
        }

        //Merge temp arrays
        int i = 0, j = 0;
        int k = p;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

//        int k;
      /*  for(k = p; k < r; k++) {
            if(arr[i+p] <= arr[j+q+1]){
                arr[i+p] = L[i];
                i++;
            } else{
                arr[i+p] = R[j];
                j++;
            }
        }*/

        //Copy remaining elements of L[] if any
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        //Copy remaining elemets of R[] if any
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int p, int r){
        if(p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p ,q, r);
        }
    }
}
