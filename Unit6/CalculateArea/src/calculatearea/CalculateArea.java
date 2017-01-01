package calculatearea;

/**
 * Calculates the areas of simple shapes.
 */
public class CalculateArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circleArea(3.0);
    }

    public static void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
