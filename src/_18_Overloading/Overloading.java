package _18_Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double doubleNum) {
        int number = (int) doubleNum;
        return number * number;
    }

    public static int getPower(String strNum) {
        int num = Integer.parseInt(strNum);
        return num * num;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("3"));


        printInfo("서준", 18, "email");
    }

    public static void printInfo(String name, int age, String email) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    }

    public static void printInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    public static void printInfo(String name) {
        System.out.println(name);
    }

    public static int add(int numInt, int numInt2) {
        return numInt + numInt2;
    }

    public static int add(double numDouble, double numDouble2) {
        int num = (int) numDouble;
        int num2 = (int) numDouble2;
        return num + num2;
    }

    public static int add(String numstr, String numstr2) {
        int num = Integer.parseInt(numstr);
        int num2 = Integer.parseInt(numstr2);
        return num + num2;
    }
}
