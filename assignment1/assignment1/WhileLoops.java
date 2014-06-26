
/**
 * 10.  Differentiate between a while statement and a do-while statement.
 * Explain with example programs. 
 * 
 * @author Zachary Levy
 * @version 20140623
 * 
 * This class takes in whether a prisoner has escaped
 * It simulates a prison where a guard checks the cells to make sure prisoners
 * have not escaped. He checks the cell every event hours on the hour 0,2,4,6,8.
 * If he finds the prisoner is gone, he sounds the alarm
 * 
 * It explains the difference between a do-while loop and a while loop with two separate functions
 * In the while loop function, the prisoner escapes if the guard's shift is <2 hours
 * In the do-while loop function, the prisoner does not escape if the guards shift is <2 hours
 * This would simulate a rule for the guard that says "at the start of his shift, he checks the cells"
 * 
 */
public class WhileLoops
{
    // instance variables - replace the example below with your own
    public boolean alarm; // whether the alarm has been sounded or not
    public boolean prisonerEscaped; // whether the prisoner has escaped or not

    /**
     * Constructor for objects of class WhileLoops
     */
    // takes in whether the prisoner is escaping this shift
    public WhileLoops(boolean escaped)
    {
        // initialise instance variables
        alarm = false; // alarm is off
        prisonerEscaped = escaped; // whether the prisoner has escaped
    }

    // takes in the number of hours to do guard duty for
    // the guard duty requires you to check prison cells every 2 hours on the even hour
    // returns nothing
    public void guardDutyWhile (int shiftHours) {
        while (shiftHours > 0 && (shiftHours % 2 == 0)) { // while loop
            if (prisonerEscaped) {
                soundAlarm();
                break; // break the while loop to find the prisoner
            }
            shiftHours -= 2;
        }
        System.out.println("My job is done.");
    }
    
    // takes in the number of hours to do guard duty for
    // the guard duty requires you to check prison cells every 2 hours on the even hour
    // returns nothing
    public void guardDutyDoWhile (int shiftHours) {
        do { // do-while loop
            if (prisonerEscaped) {
                soundAlarm();
                break;
            }
            shiftHours -= 2;
        } while (shiftHours > 0 && (shiftHours % 2 == 0)); // condition
        System.out.println("My job is done.");
    }
    
    // check if the prisoner has escaped
    // returns true/false for programmatic use
    public void hasEscaped () {
        if (prisonerEscaped) {
            System.out.println("The prisoner has escaped.");
            return true;
        } else {
            System.out.println("The prisoner has not escaped.");
            return false;
        }
        
    }
    
    // sounds the alarm and prints out alarm
    // returns nothing
    private void soundAlarm () {
        alarm = true;
        System.out.println("Whoop Whoop, alarm! Prison break!");
    }
    
}
