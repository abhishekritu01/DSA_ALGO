package sorting.BubbleSort;

public class BubbleSortAlgo {

    static void bubbleSort(int[] arr) {
        boolean swap;
        for(int i=0;i<arr.length-1;i++){
            swap=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,11,3,4,5,7,9,2,1,-1,4,6,8,10};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
