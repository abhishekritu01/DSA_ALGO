package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    public static void print2DArray(int [][] arr){

    }


    public static void main(String[] args) {

//        int [][] arr =new int[3][];
//
//        int [] [] arr2D ={
//                {1,2,3},  //0th index
//                {4,5},  // 1st index
//                {6,7,8,9}  // 2nd index
//        };

        int [][] arr = new int[3][3];
        System.out.println("Enter the matrix element :   ");
        Scanner scanner =new Scanner(System.in);

        //input
        for(int row=0; row<arr.length; row++){
            for(int col=0 ; col<arr[row].length ;col++){
                arr[row][col]=scanner.nextInt();
            }
        }

        //output
        System.out.println("Matrix is :    ");
//        for(int row=0; row<arr.length; row++){
//            for(int col=0 ; col<arr[row].length ;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }


//        for(int row=0; row<arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }


        for (int [] a :arr ){
            System.out.println(Arrays.toString(a));
        }

//        for (String str : arr){
//            System.out.println(str);
//        }







    }
}
