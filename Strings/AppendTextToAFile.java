package Strings;
/*Step 1 : Open an existing text file in an append mode by passing &lsquo;true&rsquo; while constructing the FileWriter object.
FileWriter fileWriter = new FileWriter(&ldquo;Pass File Name Here&rdquo;, true);
Step 2 : Bundle FileWriter object in BufferedWriter if you are writing lots of text.
BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
Step 3 : Use PrintWriter object if you are writing the text in multiple lines by wrapping BufferedWriter object in PrintWriter.
PrintWriter printWriter = new PrintWriter(bufferedWriter);
Step 4 : Use printWriter.println() method to write each line into a file.
printWriter.println(&ldquo;Pass the string to be written here&rdquo;);
Step 5 : Close the resources.*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendTextToAFile {
    public static void main(String[] args) {
        FileWriter fileWriter = null;

        BufferedWriter bufferedWriter = null;

        PrintWriter printWriter = null;

        try
        {
            //Opening a file in append mode using FileWriter
            fileWriter = new FileWriter("D:\\javaInputFile.txt", true);

            //Wrapping FileWriter object in BufferedWriter
            bufferedWriter = new BufferedWriter(fileWriter);

            //Wrapping BufferedWriter object in PrintWriter
            printWriter = new PrintWriter(bufferedWriter);

            //Bringing cursor to next line
            printWriter.println();

            //Writing text to file
            printWriter.println("Sajida : 303030");
            printWriter.println("Adil : 101010");
            printWriter.println("Aquil : 252525");
            System.out.println("Done");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //Closing the resources

            try
            {
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

