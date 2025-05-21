package _17_Method;

public class Parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + " 의 제곱수는" + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for(int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + "제곱은 " + result + "입니다.");
    }

    public static void avg(int num1, int  num2, int num3) {
        System.out.println(num1 + ", " +  num2 + ", " + num3 + " 의 평균은 약" + (double)((num1+num2+num3)/3));
    }

    public static void isEven(int num) {
        if (num == 0){
            System.out.println();
        } else if( num % 2 == 0) {
            System.out.println(num + "는 짝수");
        } else {
            System.out.println(num + "는 짝수");
        }
    }

    public static void main(String[] args) {
        power((int)((Math.random()) * 10 +1));

        powerByExp((int)((Math.random()) * 10 +1), (int)((Math.random()) * 10 +1));

        avg((int)((Math.random()) * 10 +1), (int)((Math.random()) * 10 +1), (int)((Math.random()) * 10 +1));

        isEven((int)((Math.random()) * 10 +1));
    }
}
