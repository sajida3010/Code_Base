package Strings;

/*Step 1 : Create BufferedReader object to read the text file.
        BufferedReader reader = new BufferedReader(new FileReader(“Pass The File Location Here”));
Step 2 : Initialize charCount, wordCount and lineCount to 0.
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
Step 3 : Read all the lines of the text file one by one into currentLine using reader.readLine() method.
        String currentLine = reader.readLine();
Step 4 : Update lineCount each time we read the line into currentLine.
        lineCount++;
Step 5 : We get the number of words in a line by splitting the currentLine by space.
        String[] words = currentLine.split(” “);
Step 6 : Update the wordCount by adding the number of words in a line.
        wordCount = wordCount + words.length;
Step 7 : Update charCount by iterating through words array as below,
        for (String word : words)
        {
               charCount = charCount + word.length();
        }
Step 8 : Close BufferedReader object.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindLineWordAndCharacterInFile {
    public static void main(String[] args) {
        BufferedReader reader = null;
        //Initializing charCount, wordCount and lineCount to 0
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        try
        {
            //Creating BufferedReader object
            reader = new BufferedReader(new FileReader("D:\\javaInputFile.txt"));
            //Reading the first line into currentLine
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                //Updating the lineCount
                lineCount++;
                //Getting number of words in currentLine
                String[] words = currentLine.split(" ");
                //Updating the wordCount
                wordCount = wordCount + words.length;
                //Iterating each word
                for (String word : words)
                {
                    //Updating the charCount
                    charCount = charCount + word.length();
                }

                //Reading next line into currentLine
                currentLine = reader.readLine();
            }

            //Printing charCount, wordCount and lineCount
            System.out.println("Number Of Chars In A File : "+charCount);
            System.out.println("Number Of Words In A File : "+wordCount);
            System.out.println("Number Of Lines In A File : "+lineCount);
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
