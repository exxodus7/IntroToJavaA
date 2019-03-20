package inputvalidation;

import java.util.Scanner;

/**
 * Demonstrates how to validate input.
 */
public class InputValidation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two whole numbers on a line: ");
        int a = in.nextInt();
        int b = in.nextInt();

        divide(a, b);

        System.out.println("Have a good day!");
    }

    public static void divide(int a, int b) {
        System.out.println("The first number divided by the second is: " + (a / b));
    }
}
