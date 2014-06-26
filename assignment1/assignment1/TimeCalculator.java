
/**
 * Question 23
 * 
 * 23.  Write a program that prompts the user to enter the number of days (e.g., 100)
 * and displays the resultant number of hours and minutes.
 * 
 * @author Zachary Levy
 * @version 20140528
 * 
 * The user is prompted via the console to enter a number of days
 * The convertDays function translates this to hours, minutes, and seconds, then prints to the console
 * 
 */
import java.util.Scanner; // import library for console inpit
public class TimeCalculator
{
    // instance variables - replace the example below with your own
    private String daysString; // days variable capturing console input
    private int days; // days variable as an integer so we can do math with it
    
    Scanner in = new Scanner(System.in); // create a console input object

    /**
     * Constructor for objects of class TimeCalculator
     */
    public TimeCalculator()
    {
        setDays(); // call console propmt when you create an instance of the class
        // initialise instance variables
    }
    
    
    // sets the number of days from console input
    // returns nothing
    public void setDays () {
        System.out.println("Please enter the number of days you would like to convert: ");
        daysString = in.nextLine(); // capture string from console
        days = Integer.parseInt(daysString); // convert string to integer so we can do math
    }

    // converts the days to hours, minutes, and seconds. setDays method needs to be called before this.
    // returns nothing
    public void convertDays () {
        // 24 hours in a day
        // 1440 minutes in a day
        // 86400 seconds in a day
        System.out.println("Hours: " + days * 24);
        System.out.println("Minutes: " + days * 24 * 60);
        System.out.println("Seconds: " + days * 24 * 60 * 60);
    }
    
}
