package numberadder;

import java.util.Scanner;

/**
 *
 * @author lauren
 */
public class NumberAdder {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter numbers to be added together.\n"
                + "Negative numbers will be skipped.\n"
                + "A \"0\" will end the program.");

        int x = -1;
        int sum = 0;
        while (x != 0) {
            x = in.nextInt();
            if (x <= 0) {
                continue;
            }
            sum += x;
            System.out.println("Adding " + x + ". New sum : " + sum);
        }
    }
}
