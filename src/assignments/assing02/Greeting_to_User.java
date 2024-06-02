package assignments.assing02;

import java.util.Scanner;

public class Greeting_to_User {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        greeting(name);
    }

    private static void greeting(String name) {

        System.out.println("Hello " + name + "!");
    }
}
