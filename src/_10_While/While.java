package _10_While;

public class While {
    public static void main(String[] args) {
        //반복문 - while

        int num = 1;
        while(num < 5) {
            System.out.println("sadad");
            num++;
        }

        int num1 = 10;
        while(num1 > 0) {
            System.out.println(num1);
            num1--;
        }

        int num2 = 0;
        while(num2 <= 10) {
            if (num2 % 2 == 0) {
                System.out.println(num2);
            }
            num2++;
        }

        int sum = 0;
        int a = 0;
        while(a <= 100) {
            sum = a + sum;
            a++;
        }
        System.out.println(sum);
    }
}
