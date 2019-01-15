package Strings;
/*Step 1 : Create one HashMap object called wordCountMap which will hold words of the input file as keys and their occurrences as values.
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
Step 2 : Create BufferedReader object to read the input text file.
        BufferedReader reader = new BufferedReader(new FileReader(“Pass The File Location Here”));
Step3 : Read all the lines of input text file one by one into currentLine using reader.readLine() method.
        String currentLine = reader.readLine();
Step 4 : Split the currentLine into words by using space as delimiter. Use toLowerCase() method here
        if you don’t want case sensitiveness.
        String[] words = currentLine.toLowerCase().split(” “);
Step 5 : Iterate through each word of words array and check whether the word is present in wordCountMap.
        If word is already present in wordCountMap, update its count. Otherwise insert the word as a key and 1 as its value.
        if(wordCountMap.containsKey(word))
        {
        wordCountMap.put(word, wordCountMap.get(word)+1);
        }
        else
        {
        wordCountMap.put(word, 1);
        }
Step 6 : Get the mostRepeatedWord and its count by iterating through each entry of the wordCountMap.
Step 7 : Close the resources.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostRepeatedWordInAFile {
    public static void main(String[] args) {
//Creating wordCountMap which holds words as keys and their occurrences as values

        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

        BufferedReader reader = null;

        try
        {
            //Creating BufferedReader object

            reader = new BufferedReader(new FileReader("D:\\javaInputFile.txt"));

            //Reading the first line into currentLine

            String currentLine = reader.readLine();

            while (currentLine != null)
            {
                //splitting the currentLine into words

                String[] words = currentLine.toLowerCase().split(" ");

                //Iterating each word

                for (String word : words)
                {
                    //if word is already present in wordCountMap, updating its count

                    if(wordCountMap.containsKey(word))
                    {
                        wordCountMap.put(word, wordCountMap.get(word)+1);
                    }

                    //otherwise inserting the word as key and 1 as its value
                    else
                    {
                        wordCountMap.put(word, 1);
                    }
                }

                //Reading next line into currentLine

                currentLine = reader.readLine();
            }

            //Getting the most repeated word and its occurrence

            String mostRepeatedWord = null;

            int count = 0;

            Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();

            for (Map.Entry<String, Integer> entry : entrySet)
            {
                if(entry.getValue() > count)
                {
                    mostRepeatedWord = entry.getKey();

                    count = entry.getValue();
                }
            }

            System.out.println("The most repeated word in input file is : "+mostRepeatedWord);

            System.out.println("Number Of Occurrences : "+count);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
