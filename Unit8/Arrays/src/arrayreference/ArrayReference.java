package arrayreference;

/**
 * Handy reference class for how to use arrays.
 */
public class ArrayReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("** Creating arrays and assigning values. **");
        
        // Declaring an array that holds 4 integer values.
        int[] counts = new int[4];

        // Declaring an array that holds 20 double values.
        int size = 20;
        double[] values = new double[size];
        
        // Selecting elements from an array.
        System.out.println("The 0th element of counts is: " + counts[0]);
        /*
        // Modifying elements in an array.
        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        int j = 0;
        while (j < 4) {
            System.out.println(counts[j]);
            j++;
        }
        
        // Looking at the length of the array.
        System.out.println("Length of counts is: " + counts.length);

        /*
        System.out.println("\n** Copying arrays. **");
        
        // Copying an array.
        double[] a = new double[3];
        System.out.println("Copying the reference...");
        double[] b = a;

        a[0] = 17.0;
        a[1] = -2.0;
        a[2] = 0.5;
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

        /*
        System.out.println("Assigning b to a new, empty array...");
        b = new double[3];
        System.out.println("b: " + Arrays.toString(b));
        
        System.out.println("Copying each element...");
        for (int i = 0; i < 3; i++) {
            b[i] = a[i];
        }
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        
        System.out.println("Changing a value in a...");
        a[1] = -3.0;
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

        double[] c = Arrays.copyOf(a, 3);

        /*
        // Traversing arrays.
        System.out.println("Updating a...");
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
        System.out.println("a: " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.println("Found a negative value! " + a[i]);
            }
        }
        */
    }
}
