public class SecondHighestValue {
    public static void main (String args[]) {
        int arr[] = {10, 22, 15,20,26,5,30};
        int val = secondHighest(arr);
        System.out.print("Second highest number is: " + val);
    }
    public static int secondHighest(int arr[]) {
        int first = 0; int second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[first]) {
                second = first;
                first = i;
            }
        }
        return arr[second];
    }
}
