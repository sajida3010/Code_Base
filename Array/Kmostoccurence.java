import java.util.*;

public class Kmostoccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,4,4,4,5,5,5};
        int k = 2;
        int most_occurred[] = get_k_most_occurred(arr, k);

        for(int i=0;i<most_occurred.length;i++){
            System.out.print(most_occurred[i] + " ");
        }
    }

    private static int[] get_k_most_occurred(int[] arr, int k) {
//        int x[] = {1,2};
//        return x;

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            }else {
                hmap.put(arr[i], 1);
            }
        }

        ArrayList<XY> XYobjects = new ArrayList<>();

        Set<Map.Entry<Integer, Integer>> entrySet = hmap.entrySet();
        for(Map.Entry<Integer, Integer> entry: entrySet){
//            System.out.printf("%d: %d %n", entry.getKey(), entry.getValue());
            XYobjects.add(new XY(entry.getKey(), entry.getValue()));
        }

        XYobjects.sort(new Comparator<XY>() {
            @Override
            public int compare(XY o1, XY o2) {
               return o1.compareTo(o2);
            }
        });

        int x[] = {};
        if(XYobjects.size() >= k){
            x = new int[k];
            for(int i=0;i<k;i++) {
                x[i] = XYobjects.get(i).number;
            }
        }
        return x;
    }
}

class XY implements Comparable {
    int number, occurrences;
    public XY(int number, int occurrences){
        this.number = number;
        this.occurrences = occurrences;
    }

    @Override
    public int compareTo(Object o) {
        XY o1 = (XY) o;
        if(this.occurrences == o1.occurrences) return 0;
        else return this.occurrences < o1.occurrences ? 1 : -1 ;
    }
}
