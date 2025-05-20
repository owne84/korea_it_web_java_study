package _16_MultiArrayLoop;

public class MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {{"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"}, {"C1", "C2", "C3", "C4", "c5"}};

        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++) {
                System.out.println(seats[i][j] + " ");
            }
            System.out.println();
        }


        String[][] imaxSeats = new String[10][15];
        String[] ang = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for(int i = 0; i < imaxSeats.length; i++) {
            for(int j = 0; j < imaxSeats[i].length; j++) {
                    imaxSeats[i][j] = ang[i] + (j + 1);

            }
        }

        for(int i = 0; i < imaxSeats.length; i++) {
            for(int j = 0; j < imaxSeats[i].length; j++) {
                System.out.print(imaxSeats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
