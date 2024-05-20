package LinerSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    //----------------------search in 2D array-----------------------------
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

//    ----------------------Max in 2D array-----------------------------

    static int maxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;       //value of Integer.MIN_VALUE is -2147483648
        System.out.println(max + " is the initial value of max");

        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] arr = {
                {24, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12},
        };

        int target = 56;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(maxValue(arr) + " is the max value in the 2D array");
    }
}
