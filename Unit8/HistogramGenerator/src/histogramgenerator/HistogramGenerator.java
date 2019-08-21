package histogramgenerator;

import java.util.Arrays;
import java.util.Random;

/**
 * Generates a randomly populated histogram.
 */
public class HistogramGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random random = new Random();
        int[] counts = new int[8];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(counts));
    }
}
