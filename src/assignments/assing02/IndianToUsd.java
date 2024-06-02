package assignments.assing02;

import java.util.Scanner;

public class IndianToUsd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount that you want to convert to dollars: ");
        int rupees = scanner.nextInt();
        double dollars = rupees / 80.0; // Converting to double to handle decimal values
        System.out.println("The value of " + rupees + " Rs is " + dollars + " dollars");
    }
}
