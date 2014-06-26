
/**
 * 3. Explain the structure of a Java program. Write a program in that exemplifies and tests
 * the functionalities of all any four (4) methods of the class ‘String’. 
 * 
 * @author Zachary Levy
 * @version 20140625
 */
public class PlayingWithStrings
{
    // instance variables
    public String stringOne;
    public String stringTwo;

    /**
     * Constructor for objects of class PlayingWithStrings
     */
    public PlayingWithStrings(String startStringOne, String startStringTwo)
    {
        // initialise instance variables
        stringOne = startStringOne;
        stringTwo = startStringTwo;
    }

    // prints out the length of stringOne
    public int getLength () {
        System.out.println("The length of stringOne is " + stringOne.length() + " characters");
        return stringOne.length();
    }
    
    // gets a substring from stringTwo, skips the first letter, thus "beheading" it ;)
    public String beheadString () {
        String headlessSeanBean = stringTwo.substring(2, stringTwo.length());
        System.out.println("The head of \"" + stringTwo + "\" has been cut off, only \"" + headlessSeanBean + "\" is remaining");
        return headlessSeanBean;
    }
    
    // makes the string uppercase
    public String scream () {
        System.out.println("Watch out!! " + stringTwo.toUpperCase());
        return stringTwo.toUpperCase();
    }
    
    // uses the concatenate method to make stringOne now stringOne + stringTwo
    public void getMarried () {
        System.out.println("\"" + stringOne + "\" and \"" + stringTwo + "\" have joined forces to become \"" + stringOne.concat(stringTwo) + "\"");
    }
    
}
