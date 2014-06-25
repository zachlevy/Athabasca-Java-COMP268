
/**
 * Write a recursive program that calculates the greatest common divisor (GCD) of three (3)
 * input numbers.
 * 
 * @author Zachary Levy
 * @version 20140624
 */
public class GreatestCommonDenominator
{
    // instance variables - replace the example below with your own
    private int numA;
    private int numB;
    private int numC;

    /**
     * Constructor for objects of class GreatestCommonDenominator
     */
    public GreatestCommonDenominator(int startNumA, int startNumB, int startNumC)
    {
        // initialise instance variables
        numA = startNumA;
        numB = startNumB;
        numC = startNumC;
    }
    
    // takes in a counter, checks for denominators of one number, sees if it works for both other cases
    public void recursiveGCD (int counter) {
        if (counter < 1) {
            System.out.println("Something exploded. Counter " + counter);
            return;
        } else if (numA % counter == 0 && numB % counter == 0 && numC % counter == 0) {
            System.out.println("Lowest common denominator is " + counter);
            return;
        } else {
            System.out.println("Counter " + counter);
            recursiveGCD(--counter);
            return;
        }
    }

    // helper function so that you don't have to input numA twice when you both instantiate object and run recursive function
    public void findGCD () {
        recursiveGCD(numA);
        return;
    }
}
