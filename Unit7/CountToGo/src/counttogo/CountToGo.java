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
        
        for (int count = 1; count <= number; count++) {
            System.out.print(count + ", ");
        }
        System.out.println("Go!");
    }
}
