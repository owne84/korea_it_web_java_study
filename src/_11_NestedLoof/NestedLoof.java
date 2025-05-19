package _11_NestedLoof;

public class NestedLoof {
    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i = 0; i < 6; i++) {
//            for(int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i = 0; i < 5; i++) {
            for(int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 5; i++) {
            for(int j = i; j < 4; j++) {
                System.out.print(" ");
                if(j > i) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
