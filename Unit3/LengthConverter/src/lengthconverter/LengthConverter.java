package lengthconverter;

import java.util.Scanner;

/**
 * Class providing functionality for basic conversions between inches and
 * centimeters.
 */
public class LengthConverter {

    public static void main(String[] args) {
        
        double cm;
        int inches, feet, remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);
        
        // convert from inches to centimeters.
        System.out.print("How many inches? ");
        inches = in.nextInt();
        cm = inches * CM_PER_INCH;
        System.out.printf("%d in = %f cm\n", inches, cm);
        
        // convert from centimeters to inches.
        System.out.print("How many centimeters? ");
        cm = in.nextDouble();
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
    }

}
