/*
 * 13. Write a program to print a triangle as shown below, given an input number.
This triangle is printed when the input is 3. There are 5 spaces between
elements in the triangle.
 *             1
 *       2     0     2
 * 3     0     0     0     3
 */

package midtermquiz;

/**
 *
 * @author zacharylevy
 * @version 20140707
 */
public class Triangle {
    int number;
    String spacer = "     ";
    // instance vars

    // constructor
    public Triangle (int startNumber) {
        number = startNumber;
        printTriangle();
    }
    
    // print out the triangle to console
    public void printTriangle () {
        int counter = 1;
        // sets the height of the pyramid
        while (number >= counter) {
            
            // spaces at the start of the lines
            int startCounter = number - counter;
            String start = "";
            while (startCounter > 0) {
                // add the spacers
                start = start + spacer + " ";
                --startCounter;
            }
            
            // sets the number of 0s and spaces in the middle
            // equation is y = 2(x-1)-1 
            int middleCounter = 2 * ((counter) - 1) - 1;
            // initialize the middle string
            String middle = "";
            while (middleCounter >= 1) {
                //System.out.println("middlecounter: " + middleCounter);
                middle = middle + spacer;
                middle = middle + "0";
                --middleCounter;
            }
            
            
            // print it all to console
            System.out.print(start);
            // if its not the top of the pyramid
            if (counter != 1) {
                middle = middle + spacer;
                System.out.print(counter);
            }
            System.out.print(middle);
            System.out.println(counter);
            ++counter;
        }
    }
}
