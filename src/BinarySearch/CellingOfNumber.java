package BinarySearch;

// ------------------   celling of number is the smallest number which is greater than or equal to the target number
public class CellingOfNumber {

    static int CellingOfNumber(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        if (target > arr[end]){
            return -1;
        }

        while(start < end){
            int mid = start+(end-start)/2;
            if(target < arr[mid]){
                end =mid-1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return arr[start];

    };


    public static void main(String[] args) {
        int [] arr ={2,3,5,9,14,16,18};
        int target = 10;
        System.out.println(CellingOfNumber(arr,target) + "      "+"Selling of number");
    }
}
