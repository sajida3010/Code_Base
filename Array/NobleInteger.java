/*Given an integer array, find if an integer p exists in the array such
  that the number of integers greater than p in the array equals to p
  If such an integer is found return 1 else return -1.*/

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(4);
        a.add(6);
        a.add(8);
        a.add(7);
        a.add(9);
        a.add(12);
       // a.add(6);

        System.out.println(a);
        int i = noble(a);

        System.out.println("Is the number found? " + i);
    }
    public static int noble(ArrayList<Integer> A) {
        // Total runtime: O(n log n) due to sort
        Collections.sort(A);

        for(int i = 0; i < A.size(); i++) {
            // Handle duplicates (only check for rightmost duplicate), skip others
            if(i < A.size() - 1 && A.get(i) == A.get(i + 1)) {
                continue;
            }
            // Check if the remaining values to the right are equal to the current value
            if(A.size() - i - 1 == A.get(i)) {
                return 1;
            }
        }
        return -1;
    }

    public static int noble_2(ArrayList<Integer> A){
        int count = 0;
        Collections.sort(A);
        for(int i = 0; i < A.size(); i++){
            count = 0;
            for(int j = i; j < A.size(); j++) {
                if(A.get(j) > A.get(i)){
                    count++;
                }
            }
            if(count == A.get(i))
                return 1;
        }
        return -1;
    }
}
