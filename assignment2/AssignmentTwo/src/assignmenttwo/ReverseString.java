/*
 * 10.	Write a program to reverse characters in a string using a stack.
 */

package assignmenttwo;

import java.util.Stack;

/**
 *
 * @author zacharylevy
 * @version 20140716
 */
public class ReverseString {
    // instance vars

    Stack holder = new Stack();
    String forwards;
    String backwards;
            
    // constructor
    public ReverseString (String startForwards) {
        forwards = startForwards;
        backwards = "";
        reverseString();
    }
    
    // reverse the string letter by letter
    // prints and returns backwards string
    public String reverseString() {
        // convert string to array of letters
        for (char letter : forwards.toCharArray()) {
            // add each letter to the stack
            holder.push(letter);
        }
        // loop through the stack
        while (holder.size() > 0) {
            // add each letter to the backwardfs string
            backwards += holder.pop();
        }
        System.out.println(forwards + " backwards is: " + backwards);
        return backwards;
    }
    
    
}
