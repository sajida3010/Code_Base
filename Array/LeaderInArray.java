/*
An element is leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader.
For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
*/

public class LeaderInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        printLeaders(arr, n);

        System.out.println(" ");
        printLeaders2(arr, n);
    }

    //T.c: O(n*n);
    public static void printLeaders(int arr[], int n){
        for(int i = 0; i < n; i++){
            int j;
            for(j = i + 1; j < n; j++){
                if(arr[i] <= arr[j]){
                    break;
                }
            }
            if(j == n) //the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }

    //Method 2: T.C -> O(n)
    //Scan all the elements from right to left in array and keep track of maximum till now. When maximum changes it’s value, print it.

    public static void printLeaders2(int arr[], int n){
        int max = arr[n - 1];
        System.out.print(max + " ");
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
}
