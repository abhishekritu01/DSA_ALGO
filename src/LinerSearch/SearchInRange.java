package LinerSearch;

public class SearchInRange {

    static boolean SearchInRange(int[] arr, int target,int start,int end){

        if(arr.length==0){
            return false;
        }
        for (int i=start;i<end;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    };

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, -5,6,7,8,9};
        int target = -5;
        int start =2;
        int end = 8;

        System.out.println(SearchInRange(arr, target,start,end));


    }
}
