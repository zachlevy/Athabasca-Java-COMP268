
/**
 * 12. Write a program to determine if an input string is a palindrome.
 * 
 * @author Zachary Levy
 * @version 20140528
 * 
 * Takes in a string as input when creating an instance of the class.
 * Also can take in a string after the object is created to check that way.
 * returns whether a string is a palindrome or not both programatically and prints teh result also.
 * 
 */
import java.util.Scanner; // import the console input library

public class Palindrome
{
    // instance variables - replace the example below with your own
    private String forwards; // string forwards
    private String backwards; // string backwards
    Scanner in = new Scanner(System.in); // create new input object for console
    /**
     * Constructor for objects of class Palindrome
     */
    public Palindrome(String startForwards)
    {
        // initialise instance variables
        forwards = startForwards;
    }

    // Receives an input string from the console to overwrite the tested string first set on instantiation.
    // Not used in examples
    public void setForwards () {
        System.out.println("Please Enter a String:\n");
        forwards = in.nextLine();
    }
    
    // tests to see if the input string is a palindrome
    // outputs a boolean for programatic use
    // prints the result to the console
    public Boolean isPalindrome () {
        backwards = new StringBuilder(forwards).reverse().toString();
        if (backwards.toLowerCase().equals(forwards.toLowerCase())) {
            System.out.println("Palindrome is a success\n");
            return true;
        } else {
            System.out.println("Palindrome is a failure\n");
            return false;
        }
    }
    
    
    
}
