/**
 * 24.  Write a program that prompts the user to enter the exchange rate
 * from Canadian dollars (CAD) to Indian rupees (INR). Prompt the user to
 * enter 0 to convert from Canadian dollars to Indian rupees, and 1 to
 * convert from Indian rupees to Canadian dollars. Prompt the user to
 * enter the amount in Canadian dollars or Indian rupees to convert it to
 * Indian rupees or Canadian dollars, respectively. 
 * 
 * 
 * 1 Indian rupee / Canadian dollar = 0.01832419
 * 
 * @author Zachary Levy
 * @version 201400601
 * 
 * Takes in input from the command line for both the amount of convert and the way to convert currency
 * whether its CAD -> INR or INR -> CAD
 * returns the converted amount programatically and prints it out to console
 * 
 */
import java.util.Scanner;

public class CurrencyConverter
{
    private double curINR; // exchange rate
    private double curCAD; // exchange rate
    private int startCur; // int of 0 or 1 determining whether its CAD -> INR or INR -> CAD
    private double amount; // amount to be converted
    Scanner in = new Scanner(System.in); // create new console input object
    
    // sets the exchange rates, calls the function that asks for inputs
    public CurrencyConverter()
    {
        // initialise instance variables
        curCAD = 1; // declare the currency for reference
        curINR = 0.01832419; // set the exchange rate of INR vs CAD
        getCurrency(); // call getCurrency when the object is instantiated
        
    }

    // ask for currency and asks for amount to convert, calls the conversion
    // returns nothing
    public void getCurrency() {
        System.out.println("Please enter 0 to convert from CAD to INR or 1 to covert from INR to CAD\n");
        startCur = Integer.parseInt(in.nextLine()); // get console input, convert to int
        System.out.println("Please enter the amount you would like to convert\n");
        amount = Double.parseDouble(in.nextLine()); // get console input, convert to int
        convertCurrency(startCur, amount); // call convertCurrency function
    }
    
    // converts the currency with the inputs start currency and the amount to convert
    // prints out the result and also returns it for pragramatic use
    // returns the new amount for programatic use
    public double convertCurrency (int startCur, double amount) {
        // check switch way we need to convert
        if (startCur == 0) {
            // start with CAD, convert to INR
            System.out.println("CAD: " + amount + ", INR: " + amount / curINR);
            return amount / curINR;
        } else if (startCur == 1) {
            // start with INR, convert to CAD
            System.out.println("INR: " + amount + ", CAD: " + amount * curINR);
            return amount * curINR;
        } else {
            System.out.println("You have not entered a valid currency type.");
            return 0;
        }
    }
}
