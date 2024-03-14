package BinarySearch;

public class BinarySearch {
    static int binary(int[] array ,int target){
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
        return -1;
    };

    public static void main(String[] args) {
        int [] array ={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        int target = 44;
        System.out.println(binary(array,target) + "      "+"binary search");

    }
}
