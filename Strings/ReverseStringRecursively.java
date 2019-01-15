package Strings;

public class ReverseStringRecursively {
    public static void main(String[] args)
    {
        String str = "Geeks for Geeks";
        ReverseStringRecursively obj = new ReverseStringRecursively();
        obj.reverse(str);
    }

    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            //System.out.println("\n Reverse a string "+ str.substring(0,str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
}
