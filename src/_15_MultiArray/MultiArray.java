package _15_MultiArray;

public class MultiArray {
    public static void main(String[] args) {
        String[] Aseat = {"A1", "A2", "A3", "A4", "A5"};
        String[] Bseat = {"B1", "B2", "B3", "B4", "B5"};
        String[] Cseat = {"C1", "C2", "C3", "C4", "c5"};

        String[][] seats = new String[][] {{"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"}, {"C1", "C2", "C3", "C4", "c5"}};

        System.out.println(seats[1][2]);
        System.out.println(seats[2][3]);


        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "c5"}};
    }
}
