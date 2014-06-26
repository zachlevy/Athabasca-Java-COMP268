
/**
 * This class contains all the code to test the classes. Each question
 * has its own class. The class description contains while question it
 * answers.
 * 
 * Uncomment each question to see the class' functionality
 * 
 * @author Zachary Levy
 * @version 20140623
 * 
 */
public class answers
{
    public static void main(String[] args) {
        System.out.println("Starting test\n");
        System.out.println("Uncomment questions to see their functionality\n");
        
        // question 3
        /*
        PlayingWithStrings playTime = new PlayingWithStrings("apple", "pirate ship");
        playTime.getLength();
        playTime.beheadString();
        playTime.scream();
        playTime.getMarried();
        */
        
        // question 9
        /*
        LostAndFound searchParty = new LostAndFound(8);
        
        // correct solution, breaks off the search once all the souls have been found
        searchParty.searchAndRescueBreak();
        
        // incorrect solution, continues searching for souls after they've all been found
        searchParty.searchAndRescueContinue();
        */
        
        // question 11
        /*
        GreatestCommonDenominator commonDenom = new GreatestCommonDenominator(24,48,128);
        commonDenom.findGCD();
        */
        
        // question 10
        // officer gets guard duty in last hour of shift
        /*
        WhileLoops prisonShift = new WhileLoops(true);
        prisonShift.hasEscaped();
        
        // alarm goes off, normal scenario
        prisonShift.guardDutyWhile(12);
        
        // alarm doesn't go off, shows weakness of while loop in this scenario
        prisonShift.guardDutyWhile(1);

        // alarm doesn't go off, shows strength of while loop in this scenario
        prisonShift.guardDutyDoWhile(1); // alarm goes off
        */
        
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
