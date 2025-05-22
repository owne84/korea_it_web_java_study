package _20_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        System.out.println("숫자입력 : ");
//        String str = sc.next();
//        System.out.println(str);
//
//        System.out.println("number");
//        int num = sc.nextInt();



        String name;
        int age;

        System.out.println("나이 : ");
        age = sc.nextInt();
        System.out.println("이름 : ");
        name = sc.next();

        System.out.println("나이는 " + age + "살, 이름은 " + name);

    }
}
