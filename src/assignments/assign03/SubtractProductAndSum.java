package assignments.assign03;

public class SubtractProductAndSum {


    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    private static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;


        while (n > 0) {
          int digit = n % 10;
          sum = sum + digit;
          product = product * digit;
          n = n /10;
        }

        return product - sum;
    }
}
