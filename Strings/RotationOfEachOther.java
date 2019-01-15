package Strings;

public class RotationOfEachOther {
    public static void main (String[] args)
    {
        String str1 = "AACD";
        String str2 = "ACDA";

        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
    static boolean areRotations(String str1, String str2)
    {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        System.out.println((str1 + str1).indexOf(str2));
//        System.out.println("Sajida".indexOf("ij"));
        return (str1.length() == str2.length()) &&
                ((str1 + str1).indexOf(str2) != -1);
    }
}
