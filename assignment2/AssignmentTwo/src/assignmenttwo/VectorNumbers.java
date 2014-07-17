/*
 * 13.	Create a vector that stores N numbers. Input N non-negative numbers
through the console into the array. Then create another vector that stores only
M prime numbers from the N numbers.
 */

package assignmenttwo;

/**
 *
 * @author zacharylevy
 * @version 20140716
 */

import java.util.Scanner;
import java.util.Vector;

public class VectorNumbers {
    // instance vars
    Vector<Integer> coldStorage = new Vector<Integer>();
    Vector<Integer> primeStorage = new Vector<Integer>();
    Scanner in = new Scanner(System.in);
    
    // constructor
    public VectorNumbers () {
        boolean end = false;
        System.out.println("Please enter positive integers. Enter a blank line to stop.");
        // do while the console is not a blank entry
        do {
            String input = in.nextLine();
            // if empty, end the loop
            if (input.equals("")) {
                end = true;
            } else {
                // set string to int
                try {
                    int number = Integer.parseInt(input);
                    // validation
                    if (number > 0) {
                        coldStorage.add(number);
                        // if prime and not already in vector, add it
                        if (isPrime(number) && !primeStorage.contains(number)) {
                            primeStorage.add(number);
                        }
                    } else {
                        System.out.println("You entered a integer < 1. Enter a integer > 0");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("You have not entered a integer. Enter a integer > 0");
                }
            }
        } while (!end);
        System.out.println(coldStorage);
        System.out.println(primeStorage);
    }
    
    //checks whether an int is prime or not.
    public static Boolean isPrime(int num){
        if (num == 2){
            return true;
        }
        for (int i = 2; i <= (int)Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
