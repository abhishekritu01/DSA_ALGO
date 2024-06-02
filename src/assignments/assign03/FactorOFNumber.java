package assignments.assign03;

import java.util.Scanner;

public class FactorOFNumber {

    public static void main(String[] args) {
        printFactorOfNumber();

    }

    private static void printFactorOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to be factor : ");
        int number = scanner.nextInt();

        for(int i=1; i<=number; i++){
            if(number%i == 0){
                System.out.print(i + " ");
            }
        }

    }
}
