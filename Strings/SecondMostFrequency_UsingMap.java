package Strings;

import java.util.*;

public class SecondMostFrequency_UsingMap {
    public static void main(String args[]) {
        String str = "aabcbbddbdccddbaabdddcdd";
        secondHighest(str);
    }

    public static void secondHighest(String str) {
        char chararr[] = str.toCharArray();

        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for(Character ch: chararr) {
            if (hmap.containsKey(ch)) {
                hmap.put(ch, hmap.get(ch) + 1);
            }else {
                hmap.put(ch, 1);
            }
        }

        //For own knowledge
        Set<Map.Entry<Character, Integer>> entrySet = hmap.entrySet();
        for(Map.Entry<Character, Integer> entry: entrySet) {
            System.out.printf("%s: %d %n", entry.getKey(), entry.getValue());
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

//        list.get(1);
        System.out.println(" " + "The descending sort by value is: ");
        for(Map.Entry<Character, Integer> entry: list) {
            System.out.printf("%s: %d %n", entry.getKey(), entry.getValue());
        }
        System.out.println("AB:: " + list.get(1));

        System.out.println("tork".contains("ork"));
    }
}
