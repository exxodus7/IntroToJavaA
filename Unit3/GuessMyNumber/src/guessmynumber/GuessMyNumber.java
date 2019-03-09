package guessmynumber;

import java.util.Random;

/**
 * A game where a user gets to guess a number!
 */
public class GuessMyNumber {

    /**
     * User guesses a number between 1 and 100.
     *
     * @param args No arguments expected.
     */
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }

}
