package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void InsertionSort(int[] arr){
        for (int i =0; i<arr.length-1; i++){
            for (int j=i+1 ; j> 0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

//    static void reverseLoop(){
//        int[] arr ={1,2,3,4,5};
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.println(arr[i]);
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {5,1,7,2,1,4,3};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
//        reverseLoop();
    }
}