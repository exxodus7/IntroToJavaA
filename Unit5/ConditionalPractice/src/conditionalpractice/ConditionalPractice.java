package conditionalpractice;

import java.util.Scanner;

/**
 * This class is meant to illustrate basic conditional statements.
 */
public class ConditionalPractice {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter two whole numbers: ");
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.println("x == y? " + (x == y));  // x is equal to y
        System.out.println("x != y? " + (x != y));  // x is not equal to y
        System.out.println("x > y? " + (x > y));    // x is greater than y
        System.out.println("x < y? " + (x < y));    // x is less than y
        System.out.println("x >= y? " + (x >= y));  // x is greater than or equal to y
        System.out.println("x <= y? " + (x <= y));  // x is less than or equal to y
    }

}
