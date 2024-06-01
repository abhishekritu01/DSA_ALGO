package assignments;

import java.util.Scanner;

public class BasicAssingment01 {

    public static int leapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return 1;
        }
        return 0;
    }

    public static int sumOfdigits(int number){
        int sum =0;
        while(number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }


    public static void multiplicationTable(int number){
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }


    public static void findHcfAndLCM(int num1,int num2){
        int lcm =0;
        int hcf=0;
        int max = Math.max(num1,num2);

        for(int i=1; i<max; i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        lcm = (num1 * num2) / hcf;
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }



    public static void findGcd(int num1, int num2){
        int gcd = 1;
        int min = Math.min(num1, num2);
        for(int i = 1; i <= min; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }

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
          //1. Write a Java program to check if a year is leap year or not
          System.out.println(leapYear(2020));

          //2. Write a Java program to calculate the sum of digits of a number
          System.out.println(sumOfdigits(123));

          //3. Write a Java program to print the multiplication table of a number
        multiplicationTable(5);

        //4. Write a Java program to find HCF and LCM of two numbers
        findHcfAndLCM(32,64);

        //5. Write a Java program to find GCD of two numbers
        findGcd(32,64);

        //6. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        sumOfAllNumbers();



    }



}
