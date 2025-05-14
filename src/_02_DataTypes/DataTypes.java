package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(123);

        //정수 - int, long
        int num = 123;
        int num1;
        System.out.println(num);

        long l = 1000000000000000L;

        //실수 - float, double
        float f = 3.14f;
        double d = 3.14123456789;

        //문자 - char
        char a = 'a';
        char b = 'b';

        //문자열 - String
        String str = "Hello";
        System.out.println(str);

        //논리 자료형 - boolean
        boolean isEmpty;
        isEmpty = false;


        String name = "김서준";
        int age = 18;
        String hobby = "게임";

        System.out.println("제 이름은 " + name + " 입니다. 제 나이는" + age + " 입니다. 취미는 " + hobby + " 입니다.");
    }
}
