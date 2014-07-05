/*
 * 1. Write a program to determine if a given substring exists within a larger
 * string. Both inputs should be entered through console.
 */

package midtermquiz;

/**
 *
 * @author zacharylevy
 * @version 20140704
 */

import java.util.Scanner;


public class SubstringCheck {
    // instance vars
    private String innerString;
    private String fullString;
    Scanner in = new Scanner(System.in);
    
    // constructor
    public SubstringCheck () {
        // gets the strings from console
        getStrings();
        // checks the string
        checkStrings();
    }
    // get two input strings
    private void getStrings() {
        System.out.println("Enter a small string to see if it is part of a bigger string");
        innerString = in.nextLine();
        System.out.println("Enter a big string to see if the smaller string is contained in it");
        fullString = in.nextLine();
    }
    // checks to see if the innerString is a substring of the fullString
    // prints out response
    // returns response for programatic use
    private boolean checkStrings() {
        // checks using contains function
        if (fullString.contains(innerString)) {
            System.out.println("The given substring exists within the larger string");
            return true;
        } else {
            System.out.println("The given substring doesn't exists within the larger string");
            return false;
        }
    }
}
