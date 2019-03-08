package inchcentimeterconverter;

import java.util.Scanner;

/**
 * Class providing functionality for basic conversions between inches and
 * centimeters.
 */
public class InchCentimeterConverter {

    /**
     * Converts inches to centimeters and back.
     *
     * @param args No arguments expected.
     */
    public static void main(String[] args) {
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * 2.54;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");
    }

}
