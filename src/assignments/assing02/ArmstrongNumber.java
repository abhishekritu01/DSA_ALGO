package assignments.assing02;

public class ArmstrongNumber {

    public static void isArmstrong(int [] number){
        for(int i=0; i<number.length; i++){
            checkisArmstrong(number[i]);
        }

    }

    private static void checkisArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }

    }


    public static void main(String[] args) {
        int[] testNumbers = {153, 370, 371, 407, 9474};
        isArmstrong(testNumbers);
    }
}
