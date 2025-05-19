package _07_If;

public class IfElse {
    public static void main(String[] args) {
        int avg_sc = 88;

        if (avg_sc >= 90) {
            System.out.println("A");
        } else if (avg_sc >= 80) {
            System.out.println("B");
        } else if (avg_sc >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        int age = 27;
        String gender  = "남성";
        if (age >= 20) {
            if (gender.equals("남성")) {
                System.out.println("성인 남성");
            } else {
                System.out.println("성인 여성");
            }
        } else {
            System.out.println("성인이 아닙니다");
        }
    }
}
