/*
 * 12.	Write a program to reverse sentences (demarked by a period) in a
paragraph (demarked by an empty line input from the console) using any list
of your choice.
 */

package assignmenttwo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author zacharylevy
 * @version 20140716
 */
public class ReverseParagraph {
    // instance vars
    String forwards;
    String backwards;
    ArrayList<String> paragraphHolder = new ArrayList<String>();
    Stack holder = new Stack();
    Scanner in = new Scanner(System.in);

    // constructor
    public ReverseParagraph () {
        System.out.println("Enter multiple paragraphs, one at a time. When you're done, enter a blank line");
        boolean end = false;
        // allow the user to add infinite paragraphs, until they enter an empty line
        do {
            // get input from the console
            String input = in.nextLine();
            // if its an empty line
            if (input.equals("")) {
                end = true;
            } else if (!input.contains(".")) {
                // add input string to the paragraph holder arraylist
                paragraphHolder.add(input);
            } else {
                System.out.println("Enter a real paragraph with a \".\"");
            }
        } while (!end);
        backwards = "";
        holdParagraphs();
    }
    
    
    public String holdParagraphs () {
        // for each paragraph in the holder
        for (String paragraph : paragraphHolder) {
            // call the reverse paragraph function on the paragraph and add to output
            backwards += reversePara(paragraph);
            System.out.println(reversePara(paragraph));
        }
        return backwards;
    }
    
    public String reversePara (String paragraph) {
        String paragraphBackwards = "";
        // split the paragraph into array of sentenes
        // add each sentence to a stack of Strings
        for (String sentence : paragraph.split("\\.")) {
            holder.push(sentence);
        }
        // for each sentence in the stack
        while (holder.size() > 0) {
            // add the string to the backwards string
            paragraphBackwards += holder.pop();
            paragraphBackwards += ".";
        }
        return paragraphBackwards;

    }
}
