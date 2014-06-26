
/**
 * Write a recursive program that calculates the greatest common divisor (GCD) of three (3)
 * input numbers.
 * 
 * @author Zachary Levy
 * @version 20140624
 * 
 * Takes in 3 numbers
 * starts at the first number, counts down until it finds a common denominator
 * tells you what the greatest common denominator is
 * prints it out
 */
public class GreatestCommonDenominator
{
    // instance variables - replace the example below with your own
    private int numA; // input number 1
    private int numB; // input number 2
    private int numC; // input number 3

    /**
     * Constructor for objects of class GreatestCommonDenominator
     */
    // takes in 3 numbers to check for GCD
    public GreatestCommonDenominator(int startNumA, int startNumB, int startNumC)
    {
        // initialise instance variables
        numA = startNumA;
        numB = startNumB;
        numC = startNumC;
    }
    
    // takes in a number counter
    // checks for all denominators of one number, sees if it's a denominator for the other two numbers
    // returns nothing
    public void recursiveGCD (int counter) {
        if (numA % counter == 0 && numB % counter == 0 && numC % counter == 0) { // checks if the denominator is common
            System.out.println("Lowest common denominator is " + counter);
            return;
        } else {
            System.out.println("Counter " + counter);
            recursiveGCD(--counter); // recursion calls its own function and decreases counter to get closer to base case
            return;
        }
    }

    // helper function so that you don't have to input numA twice when you both instantiate object and run recursive function
    public void findGCD () {
        recursiveGCD(numA);
        return;
    }
}
