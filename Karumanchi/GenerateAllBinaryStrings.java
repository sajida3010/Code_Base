package Karumanchi;

public class GenerateAllBinaryStrings {
    static int n =3;
    static int arr[] = new int[n];
    public static void main(String[] args) {
        //String input = "1011";
        //char arr[] = input.toCharArray();
        binary(3);
    }
    public static void binary(int n) {
        if(n < 1) {
            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
            //System.out.println(arr.toString());
        }
        else{
            arr[n - 1] = 0;
            binary(n - 1);
            arr[n - 1] = 1;
            binary(n - 1);
        }
    }
}
