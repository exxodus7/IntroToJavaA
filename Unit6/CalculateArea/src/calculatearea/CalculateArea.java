package calculatearea;

/**
 * Calculates the areas of simple shapes.
 */
public class CalculateArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circleArea(5.0);
    }

    public static void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("The area is " + area);
    }
}
