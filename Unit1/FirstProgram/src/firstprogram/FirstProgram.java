package firstprogram;

import java.util.Scanner;

/**
 * A program which adds two numbers together.
 */
public class FirstProgram {

    /**
     * @param args Not expecting anything.
     */
    public static void main(String[] args) {

        System.out.println("Hello out there!");
        System.out.println("I will add two numbers for you.");
        System.out.println("Enter two numbers on a line separated by a space.");

        int n1, n2;

        Scanner writer = new Scanner(System.in);
        n1 = writer.nextInt();
        n2 = writer.nextInt();

        System.out.println("The sum of those two numbers is: ");
        System.out.println(n1 + n2);
    }
}
