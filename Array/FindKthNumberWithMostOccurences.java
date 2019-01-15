import java.util.*;

public class FindKthNumberWithMostOccurences {
    public static void main(String[] args) {
        int arr[] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int n = arr.length;
        findKthNumber(arr, n);
    }

    public static void findKthNumber(int arr[], int n){
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            }else {
                hmap.put(arr[i], 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = hmap.entrySet();
        for(Map.Entry<Integer, Integer> entry: entrySet){
//            System.out.printf("%d: %d %n", entry.getKey(), entry.getValue());
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                int value = 0;
                if(o2.getValue().compareTo(o1.getValue()) == 0){
                    return  (o2.getKey() > o1.getKey() ? 1 : -1);
                }else{
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        for(int i = 0; i < 4; i++){
            System.out.println("AB"+i+":: " + list.get(i));
        }
    }
}
