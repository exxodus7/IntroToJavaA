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
        
        // convert from inches to centimeters.
        System.out.print("How many inches? ");
        inches = in.nextInt();
        cm = inches * 2.54;
        System.out.println(inches + " in = " + cm + " cm");
        
        // convert from centimeters to inches.
    }

}
