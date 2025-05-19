package _09_For;

public class For {
    public static void main(String[] args) {
        // 반복문 - for

        for(int i = 0; i < 10; i++) {
            System.out.println("Hello" + i);
        }

        for(int i = 0; i <= 10; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }


        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int a = 0;
        for(int i = 0; i <= 100; i++) {
            a = a + i;
        }

        System.out.println(a);
    }
}
