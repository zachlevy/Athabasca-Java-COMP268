
/**
 * Question 23
 * 
 * 23.  Write a program that prompts the user to enter the number of days (e.g., 100)
 * and displays the resultant number of hours and minutes.
 * 
 * @author Zachary Levy
 * @version 20140528
 */
import java.util.Scanner;
public class TimeCalculator
{
    // instance variables - replace the example below with your own
    private int days;
    private String daysString;
    
    Scanner in = new Scanner(System.in);

    /**
     * Constructor for objects of class TimeCalculator
     */
    public TimeCalculator()
    {
        setDays();
        // initialise instance variables
    }
    
    
    // sets the number of days from console input
    public void setDays () {
        System.out.println("Please enter the number of days you would like to convert: ");
        daysString = in.nextLine();
        days = Integer.parseInt(daysString);
    }

    // converts the days to hours, minutes, and seconds. setDays method needs to be called before this.
    public void convertDays () {
        // 24 hours in a day
        // 1440 minutes in a day
        // 86400 seconds in a day
        System.out.println("Hours: " + days * 24);
        System.out.println("Minutes: " + days * 24 * 60);
        System.out.println("Seconds: " + days * 24 * 60 * 60);
    }
    
}
