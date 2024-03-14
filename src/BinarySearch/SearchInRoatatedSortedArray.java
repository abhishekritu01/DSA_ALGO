package BinarySearch;


public class SearchInRoatatedSortedArray {

    public int search(int[] nums, int target) {
        return -1;

    }

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] < arr[mid-1]){
                return mid-1;
            }else if(arr[start] < arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2};
        System.out.println(findpivot(arr) + "      "+"pivot");


    }

}
