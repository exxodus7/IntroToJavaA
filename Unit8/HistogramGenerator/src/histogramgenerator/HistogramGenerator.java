package histogramgenerator;

import java.util.Random;

/**
 * Generates a randomly populated histogram.
 */
public class HistogramGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a randomly populated array.
        Random random = new Random();
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
    }
}
