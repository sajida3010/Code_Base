package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram2("keEp", "peeK");

        isAnagram3("SiLeNt CAT", "LisTen ArT");

    }
    //1.Method 1 using sort() and equals() Methods
    public static void isAnagram(String s1, String s2) {
        String copyOfS1 = s1.replaceAll("\\s", "");
        String copyOfS2 = s2.replaceAll("\\s", "");

        boolean status = true;

        if(copyOfS1.length() != copyOfS2.length()){
            status = false;
        }else{
            char[] char1 = copyOfS1.toLowerCase().toCharArray();
            char[] char2 = copyOfS2.toLowerCase().toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            status = Arrays.equals(char1, char2);

            if(status)
                System.out.println(s1 + " is anagram of " + s2);
            else
                System.out.println(s1 + " is not anagram of " + s2);
        }
    }

    //2. Method 2 using Iterative Method
    public static void isAnagram2(String s1, String s2) {
        String copyOfS1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfS2 = s2.replaceAll("\\s", "").toLowerCase();

        Boolean status = true;

        if(copyOfS1.length() != copyOfS2.length())
            status = false;
        else{
            char[] char1 = copyOfS1.toCharArray();
            char[] char2 = copyOfS2.toCharArray();

            for(char c: char1){
                int index = copyOfS2.indexOf(c);
                if(index != -1){
                    copyOfS2 = copyOfS2.substring(0,index) + copyOfS2.substring(index + 1, copyOfS2.length());
                }else {
                    status = false;
                    break;
                }
            }
        }
        if(status){
            System.out.println(s1+" and "+s2+" are anagrams");
        }else{
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }

    /*3.Method 3 using String builder
    This method is also same as above method. But in this method,
    we use StringBuilder deletechartAt() method to delete the character from second string if that character is present in it.*/

    public static void isAnagram3(String s1, String s2) {
        //Removing white spaces from s1 and s2 and converting case to lower

        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        boolean status = true;

        if(copyOfs1.length() != copyOfs2.length())
        {
            status = false;
        }
        else
        {
            //Converting copyOfs1 to char array
            char[] s1Array = copyOfs1.toCharArray();

            //Constructing StringBuilder from copyOfs2
            StringBuilder sb = new StringBuilder(copyOfs2);

            //Checking whether each character of s1Array is present in sb

            for (char c : s1Array)
            {
                int index = sb.indexOf(""+c);
                if (index != -1)
                {
                   sb = sb.deleteCharAt(index);
                }
                else
                {
                    status = false;
                    break;
                }
            }
        }
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams(Method3)");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams(Method3)");
        }
    }
}
