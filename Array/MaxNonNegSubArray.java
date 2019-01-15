import java.util.ArrayList;

public class MaxNonNegSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(-5);
        num.add(6);
        num.add(2);
        num.add(4);
        num.add(5);
        num.add(-1);
        num.add(9);
        ArrayList<Integer> newNum = maxset(num);
        System.out.println(newNum);
    }
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (Integer i : A) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<Integer>();
            }
            if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;
    }
}
