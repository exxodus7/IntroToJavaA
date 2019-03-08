package time;

/**
 * Class for telling information about the time of day.
 */
public class Time {

    /**
     * Gives information about a given time of day.
     *
     * @param args Expects no arguments
     */
    public static void main(String[] args) {
        // Declarations
        String message;
        int hour, minute;

        // Assignments
        message = "Hello! I will tell you some interesting facts about the time.";
        hour = 11;
        minute = 59;

        System.out.println(message);
        
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");
    }

}
