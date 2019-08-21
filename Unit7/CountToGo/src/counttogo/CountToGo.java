package counttogo;

import java.util.Scanner;

/**
 * Counts up until go!
 */
public class CountToGo {

    public static void main(String[] args) {

        int number;

        System.out.print("Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        int count = 1;
        while (count <= number) {
            System.out.print(count + ", ");
            count++;
        }

        System.out.println("Go!");
    }
}
