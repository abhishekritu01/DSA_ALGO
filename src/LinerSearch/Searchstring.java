package LinerSearch;

import java.lang.reflect.Array;

public class Searchstring {

    static boolean search2(String name, char target) {

        if (name.length() == 0) {
            return false;
        }
        //using for each loop
        for (char ch :  name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String name, char target) {

        if (name.isEmpty()) {
            return false;
        }
        // using for loop
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "abhishek";
        char target = 'k';


        System.out.println(java.util.Arrays.toString(name.toCharArray()));
//       System.out.println(search(name,target) +"------" + "hey");
        System.out.println(search2(name,target) +"------" + "search2");

    }
}
