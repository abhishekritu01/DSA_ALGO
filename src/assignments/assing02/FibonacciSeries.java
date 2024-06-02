package assignments.assing02;

public class FibonacciSeries {

    public static void fib(int n) {
       int firstNumber = 0;
       int secondNumber = 1;

       for(int i=1; i <=n; i++){
           System.out.print(firstNumber + " ");
           int nextNumber = firstNumber + secondNumber ;
           firstNumber = secondNumber;
           secondNumber = nextNumber ;
       }
    }

    public static void main(String[] args) {
        fib(8);
    }
}
