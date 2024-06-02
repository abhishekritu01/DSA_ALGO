package assignments.assign01;

import java.util.Scanner;

public class SumOfAllNumber {

    private static void sumOfAllNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to sum, enter 'x' to stop");
        int sum = 0;
        while(true){
            String input = sc.next();
            if(input.equals("x")){
                break;
            }
            sum = sum + Integer.parseInt(input);
        }
        System.out.println("Sum of all numbers is " + sum);
    }

    public static void main(String[] args) {
        sumOfAllNumbers();
    }

}
