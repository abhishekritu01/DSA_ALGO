package Array;

public class MaxItem {

    public static void main(String[] args) {
        int arr[] = {1, 222, 33, 4, 59, 6, 7};
        System.out.println(maxItem(arr));

        System.out.println(maxItemRanger(arr,2,5));
        reverseArray(arr);
    }

     static int maxItem(int[] arr) {
        if(arr.length == 0){
            return -1;
        }

        int max=arr[0];
        for(int i = 0 ; i <arr.length ;i++) {
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;
    }


    static int maxItemRanger(int[] arr,int start,int end) {
        if(arr.length == 0){
            return -1;
        }
        int max=arr[start];
        for(int i = start ; i <end ;i++) {
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;
    }


    // reverse the array
    static void reverseArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int start =0;
        int end = arr.length-1;
        while(start <end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
