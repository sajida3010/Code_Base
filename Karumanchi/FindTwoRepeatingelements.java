package Karumanchi;

public class FindTwoRepeatingelements {
    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        findTwoRepeatingelements(arr, arr.length);
    }
    public static void findTwoRepeatingelements(int arr[], int n) {
        int XOR = arr[0];
        int i, right_most_set_bit_no, X = 0, Y = 0;
        for(i = 0; i < n; i++)
            XOR ^= arr[i];
        for(i = 1; i <= n; i++)
            XOR ^= i;
        right_most_set_bit_no = XOR & ~(XOR - 1);

        //Now divide elements in two sets by comparing rightmost set
        /*for(i = 0; i < n; i++){
            if(arr[i] && right_most_set_bit_no)
                X = X ^ arr[i];
            else
                Y = Y ^ arr[i];
        }
        for(i = 1; i <= n; i++) {
            if(i && right_most_set_bit_no) {
                X = X ^ i;
            } else
                Y = Y ^ i;
        }
        System.out.println("Values X: " + X +" and Y: " + Y);*/
    }
}
