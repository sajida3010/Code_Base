package Strings;

public class ReverseWord_Method1 {
    public static void main(String[] args) {
        String str = "My Name is Sajida";
        reverse(str);
    }

    public static void reverse(String str) {
        String strArr[] = str.split(" ");

        /*for(int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
        System.out.println(" ");*/
         for(int i = strArr.length -1; i >= 0; i--) {
             System.out.print(strArr[i] + " ");
         }
    }
}
