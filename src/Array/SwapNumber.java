package Array;

public class SwapNumber {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }


    public static void main(String[] args) {

        int arr [] = {1,2,33,4,59,6,7};
        swap(arr,2,4);

    }
}
