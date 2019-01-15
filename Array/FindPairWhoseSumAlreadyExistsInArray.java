import java.util.HashSet;

public class FindPairWhoseSumAlreadyExistsInArray {
    public static void main(String[] args) {
        int arr[] = {2, 8, 7, 1, 5};
        int n = arr.length;
       // findPair(arr, n);
        findPair2(arr, n);
    }

    //T.C: O(n3);
    public static void findPair(int arr[], int n) {
        boolean found = false;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = 0; k < n; k++){
                    if(arr[i] + arr[j] == arr[k]){
                        System.out.println(arr[i] + " " + arr[j]);
                        found = true;
                    }
                }
            }
        }
        if(found == false){
            System.out.println("Not exist!");
        }
    }

    //T.C: O(n2)
    public static void findPair2(int arr[], int n){
        HashSet<Integer> hset = new HashSet<>();
        for(int i = 0; i < n; i++){
            hset.add(arr[i]);
        }
        boolean found = false;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(hset.contains(arr[i] + arr[j])){
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if(found == false){
            System.out.println("Not exist!");
        }
    }
}
