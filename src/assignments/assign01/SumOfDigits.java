package assignments.assign01;

public class SumOfDigits {

    public static int sumOfdigits(int number){
        int sum =0;
        while(number > 0){
            sum = sum + number % 10;       // reminder
            number = number / 10;           //
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfdigits(1423));
    }
}
