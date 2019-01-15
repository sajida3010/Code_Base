package Strings;

import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String words[] = str.trim().split(" ");
        System.out.println("Number of words in the string = "+words.length);

        //Method 2;
        String str2 = scan.nextLine();
        int count = 1;
        for(int i = 0; i <  str2.length(); i++) {
            if((str2.charAt(i) == ' ') && (str2.charAt(i + 1) != ' ')){
                count++;
            }
        }
        System.out.println("Number of words in a string = "+count);
    }
}
