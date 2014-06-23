
/**
 * 10.  Differentiate between a while statement and a do-while statement.
 * Explain with example programs. 
 * 
 * @author Zachary Levy
 * @version 20140622
 */
public class WhileLoops
{
    // instance variables - replace the example below with your own
    private int x;
    public boolean alarm;
    public boolean prisonerEscaped;

    /**
     * Constructor for objects of class WhileLoops
     */
    public WhileLoops(boolean escaped)
    {
        // initialise instance variables
        alarm = false;
        prisonerEscaped = escaped;
    }

    // takes in the number of hours to do guard duty for
    // the guard duty requires you to check prison cells every 2 hours on the even hour
    public void guardDutyWhile (int shiftHours) {
        while (shiftHours > 0 && (shiftHours % 2 == 0)) {
            if (prisonerEscaped) {
                soundAlarm();
                break;
            }
            shiftHours -= 2;
        }
        System.out.println("My job is done.");
    }
    
    // takes in the number of hours to do guard duty for
    // the guard duty requires you to check prison cells every 2 hours on the even hour
    public void guardDutyDoWhile (int shiftHours) {
        do {
            if (prisonerEscaped) {
                soundAlarm();
                break;
            }
            shiftHours -= 2;
        } while (shiftHours > 0 && (shiftHours % 2 == 0));
        System.out.println("My job is done.");
    }
    
    public void hasEscaped () {
        System.out.println("The prisoner escaped.");
    }
    
    private void soundAlarm () {
        alarm = true;
        System.out.println("Whoop Whoop, alarm! Prison break!");
    }
    
}
