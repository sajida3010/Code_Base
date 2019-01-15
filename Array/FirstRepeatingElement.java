import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String args[]) {
      //  int arr[] = {10, 5, 3, 4, 3, 5, 6};
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int firstRepeat = firstRepeating(arr);
        System.out.println("The first repeating character is: "+ firstRepeat);
    }

    public static int firstRepeating(int arr[]) {
        int min = -1;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                min = i;
            } else {
                set.add(arr[i]);
            }
        }
        if (min != -1);
        return arr[min];
    }
}
