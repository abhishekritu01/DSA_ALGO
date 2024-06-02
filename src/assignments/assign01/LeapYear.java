package assignments.assign01;

public class LeapYear {

    public static int leapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(leapYear(2001));

    }
}
