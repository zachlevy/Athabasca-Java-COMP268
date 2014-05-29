
/**
 * Question 25
 * 
 * 25.  Write a program that computes the following expression up to four (4) decimal places:
(1/10) + (2/9) + (3/8) + (4/7) + (5/6) + (6/5) + (7/4) + (8/3) + (9/2) + (10/1)
 * 
 * @author Zachary Levy
 * @version 20140528
 */
public class FractionCalculator
{
    private double answer;
    // instance variables - replace the example below with your own
    public FractionCalculator()
    {
        // initialise instance variables
        calcAnswer();
    }   
    
    public double calcFraction(int numerator, int denominator) {
        return (double) numerator / denominator;
    }
    
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
        System.out.printf("Answer: %.4f", answer);
        return answer;
    }

}
