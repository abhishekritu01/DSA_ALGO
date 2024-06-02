package assignments.assign01;

public class MultiplicationOfTable {

    public static void multiplicationTable(int number){
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public static void main(String[] args) {
        multiplicationTable(5);
    }
}
