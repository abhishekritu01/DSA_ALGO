package sorting;

import java.util.Arrays;

public class Selectionsort {

    public static void main(String[] args) {
        int[] arr = {5,11,3,4,5,7,9,2,1,-1,4,6,8,10};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static void selection2(int [] arr){
//
//       // ---------------------------       one by one move for unsorted array
//        for(int i=0;i<arr.length;i++){
//            int minIndex = i;
//            for(int j=i+1 ;j<arr.length;j++){
//                if(arr[j] < arr[minIndex]){
//                    minIndex = j;
//                }
//            }
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[i];
//            arr[i] = temp;
//        }
//
//    }

    static void selection(int[] arr){
       for(int i=0;i<arr.length; i++){
           int last = arr.length-i-1;
           int maxIndex = getMaxIndex(arr,0,last);
           swap(arr,maxIndex,last);
       }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int[] arr, int start,int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
