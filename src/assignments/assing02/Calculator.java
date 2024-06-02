package assignments.assing02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        Scanner scanner = new Scanner(System.in);

        Boolean toContinue = true;

        while (toContinue) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();


            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter operator: ");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Addition is " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Subtraction is " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Multiplication is " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Division is " + (num1 / num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
            }

            System.out.println("Do you want to continue? (Y/N)");
            String response = scanner.next();

            if (response.equalsIgnoreCase("N")) {
                toContinue = false;
            }
        }

        scanner.close();
    }
}

