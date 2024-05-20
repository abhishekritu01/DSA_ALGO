package assignments;

//Input a year and find whether it is a leap year or not.
//Take two numbers and print the sum of both.
//Take a number as input and print the multiplication table for it.
//        Take 2 numbers as inputs and find their HCF and LCM.
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class BasicAssingnment {

    //1 .Input a year and find whether it is a leap year or not.
    public static void leapYear(int year){
        if(year % 4 == 0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }

  // 2 Take two numbers and print the sum of both.
    public static int addTwoNuber(int a, int b){
        return a + b ;
    }

    //3 multiplication table of number
    public static void tableOfNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number where u want a table   :   ");
        int number = scanner.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }

    // 4 Take 2 numbers as inputs and find their HCF and LCM.
    public static void hcfAndLcm(int a, int b){
        int hcf = 1;
        int min = Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        int lcm = (a*b)/hcf;
        System.out.println("HCF of a and b is : "+hcf);
        System.out.println("LCM of a and b is : "+lcm);
    }




   // 5 Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.






    public static void main(String[] args) {
        leapYear(2021);
        System.out.println("sum of a and b is : "+ addTwoNuber(3,4));
        tableOfNumber();
        hcfAndLcm(4,6);


    }
}
