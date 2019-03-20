package lengthconverter;

import java.util.Scanner;

/**
 * Class providing functionality for basic conversions between inches and
 * centimeters.
 */
public class LengthConverter {

    public static void main(String[] args) {
        
        double cm;
        int inches;
        Scanner in = new Scanner(System.in);
        final double CM_TO_INCH = 2.54;
        
        // convert from inches to centimeters.
        System.out.print("How many inches? ");
        inches = in.nextInt();
        cm = inches * CM_TO_INCH;
        System.out.println(inches + " in = " + cm + " cm");
        
        // convert from centimeters to inches.
    }

}
