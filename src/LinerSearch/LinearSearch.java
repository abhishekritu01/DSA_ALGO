package LinerSearch;

public class LinearSearch {

    public static int linearSearch(int [] arr ,int target){

        for(int element :arr){
            if(element == target){
                return 1;
            }

        }
        return -1;

    };


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = -5;
        System.out.println(linearSearch(arr, target));
    }
};
