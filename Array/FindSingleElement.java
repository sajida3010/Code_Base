//Find the element that appears once in an array where every other element appears twice

/*res = 7 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4

        Since XOR is associative and commutative, above
        expression can be written as:
        res = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)
        = 7 ^ 0 ^ 0 ^ 0
        = 7 ^ 0
        = 7*/

public class FindSingleElement {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,3,1,7,7,6};
        int n = arr.length;

        System.out.println("The single element is: " + findSingleElement(arr, n));
    }
    public static int findSingleElement(int arr[], int n) {
        int res = arr[0];
        for(int i = 1; i < n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
