package _17_Method;

import java.util.Scanner;

public class ParameterAndReturn {
//    public static void power(int number) {
//        int result = number * number;
//        System.out.println(number + " 의 제곱수는" + result);
//    }

    public static int getPower(int number) {
       return number * number;
    }

//    public static void powerByExp(int number, int exponent) {
//        int result = 1;
//        for(int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        System.out.println(number + " 의 " + exponent + "제곱은 " + result + "입니다.");
//    }

    public static int getPOwerByExp(int number, int exponent) {
        int result = 1;
        for(int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static int getStrLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        String str = sc.next();
        return str.length();
    }

    public static void main(String[] args) {
        int power = getPower((int)((Math.random()) * 10 +1));
        System.out.println(power);

        System.out.println(getStrLength());
    }
}
