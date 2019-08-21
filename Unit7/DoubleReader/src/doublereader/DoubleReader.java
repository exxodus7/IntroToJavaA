package doublereader;

import java.util.Scanner;

/**
 * Reads in a double.
 */
public class DoubleReader {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                break;
            } else {
                String word = in.next();
                System.err.println(word + " is not a number");
            }
        } while (true);
        double x = in.nextDouble();
    }

}
