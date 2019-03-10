package thescannerbug;

import java.util.Scanner;

/**
 * This class is intended to illustrate some unexpected behavior in the Scanner
 * class.
 */
public class TheScannerBug {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;

        // example 1
        System.out.println("--- Example 1 ---");
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.println("Hello " + name + ", age " + age);

        // example 2
        System.out.println("--- Example 2 ---");
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.println("Hello " + name + ", age " + age);
    }

}
