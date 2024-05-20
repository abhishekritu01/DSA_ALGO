package Array;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);

        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(10));
        list.set(3,4444);
        System.out.println(list);




    }

}
