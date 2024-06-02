package assignments.assign03;

import java.util.Scanner;

public class SumOfAllNumberfromUser {

    public static void main(String[] args) {
        sumOfAllNumbers();
    }

    private static void sumOfAllNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to sum, enter 'x' to stop");

        int sum = 0;
        while(true){
            String input = scanner.next();
            if(input.equals("x")){
                break;
            }
            sum = sum + Integer.parseInt(input);
        }
        System.out.println("Sum of all numbers is " + sum);

    }


}
