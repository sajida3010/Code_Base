import java.util.Arrays;

public class findMaximumRepeatedNumber {
    public static void main(String args[]) {
        int arr[] = {5,3,1,2,6,1,2,1,1,5,1,2,3,1};
        int candidate = maximumRepeatedNumber(arr, arr.length);
        System.out.println("The candidate is: "+ candidate);

        int candidate2 = findMaximumRepeatedValue(arr, arr.length);
        System.out.println("The candidate using method2 is: " + candidate2);
    }

    //O(n2)
    public static int maximumRepeatedNumber(int arr[], int n) {
        int counter, maxCounter = Integer.MIN_VALUE;
        int candidate = arr[0];

        for(int i = 0; i < n; i++) {
            counter = 0; candidate = arr[i];
            for(int j = i; j < n; j++) {
                if(arr[i] == arr[j]){
                    counter++;
                }
            }
            if(counter > maxCounter) {
                maxCounter = counter;
                candidate = arr[i];
            }
        }
        return candidate;
    }

    //Method 2: O(nlogn);

    public static int findMaximumRepeatedValue(int arr[], int n) {
        int counter = 1, maxCounter = Integer.MIN_VALUE, maxCandidate, candidate = maxCandidate = arr[0];
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            if(arr[i] == candidate){
                counter++;
            } else {
                candidate = arr[i];
                counter = 1;
            }
            if(counter > maxCounter){
                maxCounter = counter;
                maxCandidate = arr[i];
            }
        }
        return maxCandidate;
    }
}

