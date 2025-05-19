package _08_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int rank = 1;
        switch (rank) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학급");
                break;
            default:
                System.out.println("박수");

        }


        int price = 7000;
        int grade = 1;

        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println(price);



        //봄 3,4,5,
        //여름 6,7,8
        //가을 9,10,11
        //겨울 12,1,2

        int season = 1;

        switch (season) {
            case 1,2,12:
                System.out.println("겨울");
                break;
            case 3,4,5:
                System.out.println("봄");
                break;
            case 6,7,8:
                System.out.println("여름");
                break;
            case 9,10,11:
                System.out.println("가을");
                break;
        }



        int a = (int)(Math.random() * 7 + 1);

        switch (a) {
            case 1:
                System.out.println("월");
                break;
            case 2:
                System.out.println("화");
                break;
            case 3:
                System.out.println("수");
                break;
            case 4:
                System.out.println("목");
                break;
            case 5:
                System.out.println("금");
                break;
            case 6:
                System.out.println("토");
                break;
            case 7:
                System.out.println("일");
                break;
        }
    }
}
