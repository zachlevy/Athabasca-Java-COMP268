/*
 * 25.	In Java, a set is a collection that holds unique values. Adding a value
that already exists in the set has no effect on the set. Write a class named
“MySet.java”. In this class, create a set using HashSet (hint: set  s  = new
HashSet();). From the console, add five values to the set s. Then prompt the 
user for a single value and search for this value in set s. Print the result
of this search. Finally, using an iterator, print all the values in the set s. 
 */

package assignmenttwo;


/**
 *
 * @author zacharylevy
 * @version 20140716
 */

import java.util.HashSet;
import java.util.Scanner;

public class GetSetGo {
    // instance vars
    
    HashSet holder = new HashSet();
    Scanner in = new Scanner(System.in);

    // constructor
    public GetSetGo () {
        int counter = 0;
        // max 5 entries
        while (counter < 5) {
            System.out.println("Enter a value into the set. " + (5 - counter) + " entries remaining");
            String input = in.nextLine();
            // add string value to hashset
            holder.add(input);
            ++counter;
        }
        // check if next value is in the set
        System.out.println("Enter a value to see if it's in the set.");
        String checkInput = in.nextLine();
        // check value its in the set
        if (holder.contains(checkInput)) {
            System.out.println("That value already exists in the set.");
        } else {
            System.out.println("That value is not in the set.");
        }
    }
    
    // print all the vaules in the set
    public void printSet () {
        System.out.println("Set Values");
        // iterate through the set
        for (Object value : holder) {
            System.out.println(value);
        }
    }
    
    
}
