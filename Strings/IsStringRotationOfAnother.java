package Strings;

public class IsStringRotationOfAnother {
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJee";

        isRotation(str1, str2);
    }
    public static void isRotation(String s1, String s2){
        if(s1.length() != s2.length())
            System.out.println("String 2 is not rotated version of String 1");
        else{
            String s3 = s1 + s1;
            if(s3.contains(s2)){
                System.out.println("String 2 is rotated version of String 1");
            }else {
                System.out.println("String 2 is not rotated version of String 1");
            }
        }
    }
}
