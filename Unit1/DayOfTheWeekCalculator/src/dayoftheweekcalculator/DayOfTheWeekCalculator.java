package dayoftheweekcalculator;

import java.util.Scanner;

/**
 * @author Lauren Schroeder
 */
public class DayOfTheWeekCalculator {

    /**
     * @param args The date to compute the day of the week for.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2008): ");
        int year = input.nextInt();

        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int modCentury = year % 100;
        int century = year / 100;
        int date = (day + (((month + 1) * 26) / 10) + modCentury + (century / 4) + (5 * century)) % 7;

        String name;

        switch (date) {
            case 1:
                name = "Sunday";
                break;
            case 2:
                name = "Monday";
                break;
            case 3:
                name = "Tueday";
                break;
            case 4:
                name = "Wednesday";
                break;
            case 5:
                name = "Thursday";
                break;
            case 6:
                name = "Friday";
                break;
            default:
                name = "Saturday";
                break;
        }

        System.out.println("The day of the week is " + name);
    }

}
