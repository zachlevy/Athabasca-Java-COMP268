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
    
    
    public String reverseString() {
        for (char letter : forwards.toCharArray()) {
            holder.push(letter);
        }
        
        while (holder.size() > 0) {
            backwards += holder.pop();
        }
        System.out.println(forwards + " backwards is: " + backwards);
        return backwards;
    }
    
    
}
