package Strings;

import java.util.HashMap;
import java.util.Set;

public class CountNumberOfDupsWordAndPrint {
    public static void main(String[] args) {
        countDuplicates("Bread butter and bread");

        countDuplicates("Java is java again java");

        countDuplicates("Super Man Bat Man Spider Man");
    }

    public static void countDuplicates(String str) {
        String[] words = str.split(" ");

        HashMap<String,Integer> wordCount = new HashMap<>();
        for(String word: words){
            if(wordCount.containsKey(word.toLowerCase())){
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
            } else{
                wordCount.put(word.toLowerCase(), 1);
            }
        }

        Set<String> wordInString = wordCount.keySet();
        for(String word: wordInString){
            if(wordCount.get(word) > 1){
                System.out.println(word + " " + wordCount.get(word));
            }
        }
    }
}
