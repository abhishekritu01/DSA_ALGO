package assignments.assing02;

public class SimpleIntrest {
    public static void findSimpleIntrest(int prinicipal ,int time, int rate) {
        int simpleIntrest = (prinicipal * time * rate) / 100;
        System.out.println("Simple Intrest is " + simpleIntrest);
    }

    public static void main(String[] args) {
        findSimpleIntrest(1000, 2, 5);
    }
}
