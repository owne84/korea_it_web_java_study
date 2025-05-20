package _13_BreakContinue;

public class Break {
    public static void main(String[] args) {
        //반복문 - break, continue


        int watting = 50;
        int max = 10;
        for(int i =0; i < watting; i++) {
            if(max == 0) {
                System.out.println("재료소진");
                break;
            } else {
                System.out.println("손님입장" + max);
                max--;
            }
        }

        int num = 1;
        while(num <= watting) {
            System.out.println("입장");
            if(num == max) {
                System.out.println("소진");
                break;
            }
            num++;
        }
    }
}
