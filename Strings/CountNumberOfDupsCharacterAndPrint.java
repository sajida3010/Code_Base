package Strings;

public class CountNumberOfDupsCharacterAndPrint {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        countDups(str);
    }

    public static void countDups(String str) {
        int count[] = new int[256];
        //int charArr[] = new int[256];

        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for(int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.printf("%c, count = %d %n", i, count[i]);
            }
        }

    }
}
