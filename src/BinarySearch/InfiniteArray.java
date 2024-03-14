package BinarySearch;

public class InfiniteArray {

    static int ans(int[] arr,int target){

        int start=0;
        int end=1;

//       condition for target lie in range
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;  //this is the new start
        }

        return binary(arr,target,start,end);
    }

    static int binary(int[] array ,int target,int start,int end){

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
        int [] array ={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target = 11;
        System.out.println(ans(array,target) + "      "+"binary search");

    }
}
