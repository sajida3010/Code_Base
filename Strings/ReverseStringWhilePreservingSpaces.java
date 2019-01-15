package Strings;

public class ReverseStringWhilePreservingSpaces {
    public static void main(String[] args) {
        //String str = "Sometimes all you need is Code";
        String str = "I Am Not String";
        reverseWithPreservingSpaces(str);
    }
    public static void reverseWithPreservingSpaces(String str) {
        char[] strArray = str.toCharArray();
        char[] resultArray = new char[strArray.length];

        for(int i = 0; i < strArray.length; i++){
            if(strArray[i] == ' '){
                resultArray[i] = ' ';
            }
        }
        int j = resultArray.length - 1;
        for(int i = 0;i < strArray.length; i++) {
            if (strArray[i] != ' ') {
                if (resultArray[j] == ' ') {
                    j--;
                }
                    resultArray[j] = strArray[i];
                    j--;
            }
        }
        System.out.println(str +" ---> "+String.valueOf(resultArray));
    }
}
