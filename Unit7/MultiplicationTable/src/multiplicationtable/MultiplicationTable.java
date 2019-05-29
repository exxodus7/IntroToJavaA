package multiplicationtable;

/**
 * Outputs a multiplication table.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            System.out.printf("%4d", 2 * i);
            i = i + 1;
        }
        
        System.out.println();
    }  
}
