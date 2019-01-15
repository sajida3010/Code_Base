package Strings;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        String withoutDups = removeDups(str);
        System.out.println(withoutDups);
    }
    public static String removeDups(String str) {
        char charArr[] = str.toCharArray();
        int length = str.length();
        int index = 0;

        for(int i = 0; i < length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (charArr[i] == charArr[j])
                    break;
            }
            if (i == j) {
                charArr[index++] = charArr[i];
            }
        }
        String strNew = new String(charArr);
        return (strNew.substring(0,index));
    }
}
