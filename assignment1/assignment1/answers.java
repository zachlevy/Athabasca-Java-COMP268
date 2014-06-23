
/**
 * Write a description of class answers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class answers
{
    public static void main(String[] args) {
        System.out.println("Starting test\n");
        
        // question 10
        // officer gets guard duty in last hour of shift
        
        WhileLoops prisonShift = new WhileLoops(true);
        prisonShift.hasEscaped();
        
        // alarm goes off, normal scenario
        prisonShift.guardDutyWhile(12);
        
        // alarm doesn't go off, shows weakness of while loop in this scenario
        prisonShift.guardDutyWhile(1);

        // alarm doesn't go off, shows strength of while loop in this scenario
        prisonShift.guardDutyDoWhile(1); // alarm goes off
        
        
        // question 12
        /*
        // tests if the input string is a palindrome, shows a success
        Palindrome successPalindrome = new Palindrome("racecar");
        successPalindrome.isPalindrome();

        // tests if the input string is a palindrome, shows a failure
        Palindrome failurePalindrome = new Palindrome("apples");
        failurePalindrome.isPalindrome();
        */
        
        // question 13
        /*
        BaseballScore worldSeriesFinal = new BaseballScore();
        System.out.println("And the World Series result is... " + worldSeriesFinal.isWinner());
        */
        
        // question 23
        /*
        TimeCalculator timeCalc = new TimeCalculator();
        timeCalc.convertDays();
        */
       
       // question 24
       /*
       CurrencyConverter convert = new CurrencyConverter();
       */
       
       // question 25
       /*
       FractionCalculator fractionAnswer = new FractionCalculator();
       */
      
    }
}
