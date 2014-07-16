/*
 * 11.	Write a program to reverse worlds in a sentence using a vector.
 */

package assignmenttwo;

import java.util.Vector;

/**
 *
 * @author zacharylevy
 * @version 20140716
 */
public class SentenceVector {
    // instance vars
    String forwards;
    String backwards;
    Vector holder = new Vector();

    // constructor
    public SentenceVector (String startForwards) {
        forwards = startForwards;
        backwards = "";
        reverseSentence();
    }
    
    // reverse the sentence
    // returns and prints the reverses sentence in a string
    public String reverseSentence () {
        // split the string into array of words
        // add each word to a vector of strings
        for (String word : forwards.split("\\s+")) {
            holder.add(word);
        }
        // for each word in the vector, starting at the end of the vector
        for (int i = holder.size() - 1; i >= 0; --i) {
            // add the vector element to the string backwards
            backwards += holder.get(i).toString();
            backwards += " ";
        }
        System.out.println(forwards + " backwards is: " + backwards);
        return backwards;
    }
}
