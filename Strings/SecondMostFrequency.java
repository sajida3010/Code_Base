package Strings;

public class SecondMostFrequency {
    public static void main(String args[]) {
        //String str = "aabcbbddbdccddbaabdddcdd";
        String str = "geeksforgeeks";
        char character = secondHighest(str);
        System.out.println("Second highest frequency is " +character);
    }

    public static char secondHighest(String str) {
//        char[] charArr = str.toCharArray();
        int count[] = new int[256];

        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int first =0, second = 0;

            /* If current element is smaller than
            first then update both first and second */
        for(int i = 0; i < 256; i++) {
            if(count[i] > count[first]){
                second = first;
                first = i;
            }

            /* If count[i] is in between first and
            second then update second  */
            else if (count[i] > count[second] &&
                    count[i] != count[first])
                second = i;
        }
        return (char)second;
    }
}
