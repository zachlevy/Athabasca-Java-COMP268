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
 */
import java.util.Scanner;

public class CurrencyConverter
{
    private double curINR;
    private double curCAD;
    private int startCur;
    private double amount;
    Scanner in = new Scanner(System.in);
    
    // sets the exchange rates, calls the function that asks for inputs
    public CurrencyConverter()
    {
        // initialise instance variables
        curCAD = 1;
        curINR = 0.01832419;
        getCurrency();
        
    }

    // ask for currency and asks for amount to convert, calls the conversion
    public void getCurrency() {
        System.out.println("Please enter 0 to convert from CAD to INR or 1 to covert from INR to CAD\n");
        startCur = Integer.parseInt(in.nextLine());
        System.out.println("Please enter the amount you would like to convert\n");
        amount = Double.parseDouble(in.nextLine());
        convertCurrency(startCur, amount);
    }
    
    // converts the currency, prints out the result and also returns it for pragramatic use
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
