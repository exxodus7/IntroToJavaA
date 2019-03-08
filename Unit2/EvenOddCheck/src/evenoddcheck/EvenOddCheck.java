package evenoddcheck;

import java.util.Scanner;

/**
 * Meant to check whether a given number is even or odd.
 */
public class EvenOddCheck {

    /**
     * Checks whether a number that a user inputs is even or odd.
     *
     * @param args expects no arguments.
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: );
        int num = reader.nextInt();

        int div = num / 0;
        if (num % 2 == 0) {
            System.out.println(num + " is odd");
        } else {
            System.outrintln(num + " is even");
        }
    }

}
