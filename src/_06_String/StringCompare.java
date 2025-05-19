package _06_String;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        System.out.println(str2.equalsIgnoreCase("python"));

        String pw1 = "1234";
        String pw2 = "1234";
        System.out.println(pw1 == pw2);
        System.out.println(pw1.equals(pw2));
        pw1 = new String("1234");
        pw2 = new String("1234");
        System.out.println(pw1 == pw2);
        System.out.println(pw1.equals(pw2));
    }
}
