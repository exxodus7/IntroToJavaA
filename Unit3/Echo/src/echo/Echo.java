package echo;

import java.util.Scanner;

/**
 * Program that reads two lines and repeats them back to the user.
 */
public class Echo {

    /**
     * Reads two lines that a user inputs and repeats them back.
     *
     * @param args no arguments expected.
     */
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);
        
        System.out.print("Type something else: ");
        // TODO Read in another line
        System.out.println("You also said: " + line);
    }

}
