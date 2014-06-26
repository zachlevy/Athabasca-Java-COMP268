
/**
 * 9. What are differences between break and continue in Java? Explain with an example program. 
 * 
 * @author Zachary Levy
 * @version 20140624
 * 
 * The class simulates a search and rescue mission for 1 day
 * input the amount of lost souls
 * the search party goes out and finds 1 lost soul per hour
 * 
 * demonstrates the difference between break and continue.
 * in the break function, the search party stops searching once all the souls have been found
 * in the continue function, the search party continues searching once all the souls have been found
 * 
 */
import java.util.Arrays;
public class LostAndFound
{
    // instance variables - replace the example below with your own
    private int soulsFound; // number of souls found
    private int lostSouls; // number of souls lost at the start
    private int daylightHours; // number of hours to search
    private int hoursSearched; // number of hours searched

    /**
     * Constructor for objects of class LostAndFound
     */
    // takes in the number of lost souls
    public LostAndFound(int startLostSouls)
    {
        // initialise instance variables
       soulsFound = 0;
       lostSouls = startLostSouls;
       daylightHours = 14;
       hoursSearched = 0;
    }

    // in the amount of daylight hours, search for lost souls. Each soul takes 1 hour to find.
    // correct solution, breaks off the search once all the souls have been found
    // prints out the result of the search
    // returns nothing
    public void searchAndRescueBreak () {
        if (lostSouls < 1) {
            System.out.println("You must lose some more souls before you can search for them.");
        } else {
            // loop that searches for souls
            while (hoursSearched < daylightHours) { // while theres time left in the day
                
                // find a soul if there's any left to find
                if (soulsFound < lostSouls) {
                    System.out.println("Found a soul");
                    soulsFound++;
                }
                hoursSearched++;
                
                // checks if all the souls have been found
                if (soulsFound == lostSouls) {
                    System.out.println("Found all the souls");
                    break; // stop searching by exiting the loop
                }
                
                // continue searching until all the souls have been found
            }
            System.out.println("After " + hoursSearched + " hours of searching, you have found: " + soulsFound + " of " + lostSouls + " lost souls.");
        }
    }
    
    // in the amount of daylight hours, search for lost souls. Each soul takes 1 hour to find.
    // incorrect solution, continues searching for souls after they've all been found
    // prints out the result of the search
    // returns nothing
    public void searchAndRescueContinue () {
        if (lostSouls < 1) {
            System.out.println("You must lose some more souls before you can search for them.");
        } else {
            // loop that searches for souls
            while (hoursSearched < daylightHours) { // while theres time left in the day
                
                // find a soul if there's any left to find
                if (soulsFound < lostSouls) {
                    System.out.println("Found a soul");
                    soulsFound++;
                }
                hoursSearched++;
                
                // checks if all the souls have been found
                if (soulsFound == lostSouls) {
                    System.out.println("Found all the souls");
                    continue; // stop searching by exiting the loop
                }
                
                // continue searching until all the souls have been found
            }
            System.out.println("After " + hoursSearched + " hours of searching, you have found: " + soulsFound + " of " + lostSouls + " lost souls.");
        }
    }
    
}
