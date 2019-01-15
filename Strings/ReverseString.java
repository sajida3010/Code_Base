package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World!";

        //1. Using StringBuffer Class
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());

        //2.Using Iterative Method
        char[] strArray = str.toCharArray();
        for(int i = strArray.length - 1; i >= 0; i--){
            System.out.print(strArray[i]);
        }
        System.out.println();

        reverse(str);

       }
    //3.Using Recursion
    public static void reverse(String str) {
        if ((str == null) || (str.length() <= 1)) {
            System.out.println(str);
        }else {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    }
