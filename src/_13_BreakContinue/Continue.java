package _13_BreakContinue;

public class Continue {
    public static void main(String[] args) {

        int watting = 50;
        int max = 20;
        int sold = 0;
        int noShow = 12;

        for(int i = 1; i < watting; i++) {
            if (i == noShow) {
                continue;
            }
            max--;
            System.out.println("입장" + i);
            if (sold == max) {
                System.out.println("소진");
                break;
            }
        }
    }
}
