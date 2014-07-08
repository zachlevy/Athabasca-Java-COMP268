/*
 * 17. A school hallway has N number of lockers, N is to be input up to a
maximum of 100. A student goes through the hallway opening every locker. Then,
a second student goes down the hallway closing every other locker. A third
student goes down the hallway, and at every third locker, opens it if it is
closed and closes it if it was opened. This continues on for a total of N
students opening and closing lockers. Write a program to compute how many
lockers remain opened when N students are finished with this exercise.
 */

package midtermquiz;

/**
 *
 * @author zacharylevy
 * @version 20140707
 */
public class Lockers {
    // instance vars
    int lockers;
    // create an array full of false (closed) lockers
    boolean[] hallway;

    // constructor
    public Lockers (int startLockers) {
        lockers = startLockers;
        hallway = new boolean[lockers];
        if (lockers <= 100) {
            
            runningChildren();
            checkLockers();
            
        } else {
           System.out.println("Too many children. 100 or less plx");
        }
        
    }
    
    // if open, close locker. if close, open locker
    private void switchState (int lockerNum) {
        if (hallway[lockerNum] == false) {
            hallway[lockerNum] = true;
        } else {
            hallway[lockerNum] = false;
        }
    }
    
    // children open and close lockers
    private void runningChildren () {
        int child = 1;
        
        while (child <= lockers) {
            
            // iterate through the lockers
            int lockerCounter = 1;
            while (lockerCounter <= lockers) {
                // switch the open/close states
                switchState(lockerCounter - 1);
                // increment by the number of the child instead of by 1
                lockerCounter += child;
            }
            ++child;
        }
    }
    
    // count the number of lockers
    private void checkLockers () {
        int result = 0;
        for (boolean locker : hallway) {
            // check if locker is true (opened)
            if (locker) {
                ++result;
            }
        }
        System.out.println(result);
    }
            
    
}
