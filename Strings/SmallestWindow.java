package Strings;

public class SmallestWindow {
    public static void main(String[] args)
    {
        String str = "this is a test string";
        String pat = "tist";

        System.out.print("Smallest window is :  " +
                findSubString(str, pat));
    }

    public static String findSubString(String str, String pat){
        int hash_str[] = new int [256];
        int hash_pat[] = new int [256];

        int len1 = str.length();
        int len2 = pat.length();

        // check if string's length is less than pattern's
        // length. If yes then no such window can exist
        if (len1 < len2)
        {
            System.out.println("No such window exists");
            return "";
        }

        //Store occurences of character of pattern
        for(int i = 0; i < len2; i++) {
            hash_pat[pat.charAt(i)]++;
        }
        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

        //Traverse the string
        int count = 0;
        for (int j = 0; j < len1; j++) {
            // count occurrence of characters of string
            hash_str[str.charAt(j)]++;

            // If string's char matches with pattern's char
            // then increment count
            if(hash_pat[str.charAt(j)] != 0 && hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)]) {
                count++;
            }

            //if all the characters are matched
            if(count == len2) {
                //Try to minimize the window
                while(hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]
                        || hash_pat[str.charAt(start)] == 0) {
                    if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }
                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // If no window found
        if (start_index == -1)
        {
            System.out.println("No such window exists");
            return "";
        }

        // Return substring starting from start_index
        // and length min_len
        return str.substring(start_index, start_index + min_len);
    }
}
