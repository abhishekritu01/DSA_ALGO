package assignments.assign03;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintLargestNumber {

    public static void main(String[] args) {
        largestNumber();
    }

    private static void largestNumber() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter numbers to find the largest, enter 'x' to stop");
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = number.next();
            if (input.equals("x")) {
                break;
            }
            try {
                numbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'x' to stop.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
        } else {
            int largest = numbers.get(0);
            System.out.println(largest + " is the first number.");
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) > largest) {
                    largest = numbers.get(i);
                }
            }
            System.out.println("Largest number is " + largest);
        }
    }
}
