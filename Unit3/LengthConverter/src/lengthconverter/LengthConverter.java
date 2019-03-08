package lengthconverter;

import java.util.Scanner;

/**
 * Class providing functionality for basic conversions between inches and
 * centimeters.
 */
public class LengthConverter {

    /**
     * Converts inches to centimeters and back.
     *
     * @param args No arguments expected.
     */
    public static void main(String[] args) {
        double cm;
        int inch;
        Scanner in = new Scanner(System.in);
        
        // convert from inches to centimeters.
        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * 2.54;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");
        
        // convert from centimeters to inches.
        // TODO add code here.
    }

}
