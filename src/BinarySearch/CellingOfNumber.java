package BinarySearch;

// ------------------   celling of number is the smallest number which is greater than or equal to the target number
public class CellingOfNumber {

    static int celling(int[] array ,int target){
        int start = 0;
        int end = array.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if(target < array[mid]){
                end = mid-1;
            }else if(target > array[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return array[start];
    };

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int target = 6;
        System.out.println(celling(array,target) + "      "+"celling of number");
    }


}
