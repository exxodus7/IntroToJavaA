package launch;

/**
 * Launches a space shuttle... 
 */
public class Launch {

    public static void main(String[] args) {
        countdown(3);
    }
    
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }
}
