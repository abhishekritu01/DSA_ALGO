package BinarySearch;

public class FloorOfNumber {

    // ------------------   floor of number is the greatest number which is less than or equal to the target number
    static int FloorOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[end];
    };

    public static void main(String[] args) {
        int [] array ={2,3,5,9,14,16,18};
        int target = 4;
        System.out.println(FloorOfNumber(array,target) + "      "+"Floor of Number");

    }
}
