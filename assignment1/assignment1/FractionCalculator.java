
/**
 * Question 25
 * 
 * 25.  Write a program that computes the following expression up to four (4) decimal places:
(1/10) + (2/9) + (3/8) + (4/7) + (5/6) + (6/5) + (7/4) + (8/3) + (9/2) + (10/1)
 * 
 * @author Zachary Levy
 * @version 20140528
 * 
 * this program accepts no inputs, and calculates a math equation
 * The result is printed it and returned programmatically also
 * 
 */
public class FractionCalculator
{
    private double answer; // answer with decimal places
    // instance variables - replace the example below with your own
    public FractionCalculator()
    {
        // initialise instance variables
        calcAnswer(); // calls calcAnswer when object is instantiated
    }   
    
    // takes in a fraction as the numerator and denominator
    // returns a decimal number as the answer
    public double calcFraction(int numerator, int denominator) {
        return (double) numerator / denominator; // return a fraction as a double
    }
    
    // calculates the answer using the calcFraction function
    // prints out the answer to console
    // returns the answer in decimal form
    public double calcAnswer() {
        
        answer = 
            calcFraction(1,10) +
            calcFraction(2,9) +
            calcFraction(3,8) +
            calcFraction(4,7) +
            calcFraction(5,6) +
            calcFraction(6,5) +
            calcFraction(7,4) +
            calcFraction(8,3) +
            calcFraction(9,2) +
            calcFraction(10,1);
        System.out.printf("Answer: %.4f", answer); // answer in 4 decimal places
        return answer;
    }

}
