package BinarySearch;

public class OrderAgnosticBinarySearch {


    static int OrderAgnostic(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

//        find array is sorted in assending or decending
//        boolean isAssending;
//        if(arr[start]<arr[end]){
//            isAssending = true;
//        }else {
//            isAssending =false;
//        }

        boolean isAssending = arr[start] <arr[end];



        while (start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid]== target){
                return mid;
            }

            if(isAssending){
                if(target < arr[mid]){
                    end = mid-1;
                }else if(target > arr[mid]) {
                    start = mid+1;
                }else {
                    return mid;
                }
            }else {
                if(target > arr[mid]){
                    end = mid-1;
                }else if(target > arr[mid]) {
                    start = mid+1;
                }else {
                    return mid;
                }
            }



        }
        return -1;

    };

    public static void main(String[] args) {

        int [] arr ={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        int target = 44;
        System.out.println(OrderAgnostic(arr,target) + "      "+"Agnostic binary search");




    }
}
