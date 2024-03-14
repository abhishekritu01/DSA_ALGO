package LinerSearch;

public class FindMinimumNumber {

    static int minNumber(int [] arr) {
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }

        }
        return temp;
    }

    static int maxNumber(int [] arr){
        int temp =arr[0];

        for (int i= 0; i < arr.length; i++){
            if (arr[i] > temp) {
                temp = arr[i];
            }

        }
        return temp;
    };

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 1, 6, 8, 13, 156, -66, 0, 23};
        System.out.println(minNumber(arr) + " " + "minimum number");
        System.out.println(maxNumber(arr) + " " + "maximum number");
    }
}
