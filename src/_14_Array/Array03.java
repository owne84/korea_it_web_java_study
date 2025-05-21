package _14_Array;

import java.util.Arrays;
import java.util.Comparator;

public class Array03 {
    public static void main(String[] args) {
        int[] nums = {8, 4, 5, 1, 7, 10, 6, 2, 9 ,3};

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

//      Arrays.sort(nums, Comparator.reverseOrder());


    }
}
