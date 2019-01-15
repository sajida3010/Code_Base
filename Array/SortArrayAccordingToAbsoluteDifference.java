import java.util.*;

public class SortArrayAccordingToAbsoluteDifference {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 9, 2};
        int x = 7;

        sortArray(arr, x);
    }

    public static void sortArray(int arr[], int x) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], Math.abs(x - arr[i]));
        }
        System.out.println("The hashMap set is: ");
        System.out.println(hmap.entrySet());

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(hmap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                int value = 0;
                if (o2.getValue().compareTo(o1.getValue()) == 1) {
                    return (o2.getKey() > o1.getKey() ? 1 : -1);
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        for(int i = 0; i < arr.length;  i++){
            System.out.println("AB"+i+":: " + list.get(i));
        }
    }
}
