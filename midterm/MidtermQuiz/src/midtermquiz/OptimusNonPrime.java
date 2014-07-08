/*
 * 16. Given a number (maximum 99), write a program to determine and print the
 * non-prime numbers, in the range from 0 to that input number, and store the
 * prime-numbers in a singly-linked list. Finally, print the elements stored in
 * the singly-linked list.
 */

package midtermquiz;

import java.util.LinkedList;

/**
 *
 * @author zacharylevy
 * @version 20140707
 */
public class OptimusNonPrime {
    // instance vars
    int numberTo;
    int maxNumber;
    LinkedList nonPrimes = new LinkedList();

    // constructor
    public OptimusNonPrime (int startNumberTo) {
        numberTo = startNumberTo;
        maxNumber = 99;
        
        if (numberTo > maxNumber) {
            System.out.println("We only server numbers < 100.");
        } else {
            findNonPrimes();
            printList();
        }

    }
    
    // finds all the non-prime numbers
    public void findNonPrimes() {
        int counter = 0;
        while (counter < numberTo) {
            if (!isPrime(counter)) {
                // add the non-prime number to the linkedlist
                nonPrimes.add(counter);
            } else {
                // Megatron: "PRIME!!!"
            }
            ++counter;
        }
        
    }
    
    //checks whether an int is prime or not.
    private boolean isPrime(int n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    // print out the linked list
    public void printList() {
        for(Object nonPrime : nonPrimes) {
            System.out.println(nonPrime);
        }
    }
}
