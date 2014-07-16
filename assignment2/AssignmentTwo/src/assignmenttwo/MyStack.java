/*
 * 5.	Write a program named “MyStack.java,” and implement some of the key
Stack methods such as pop() and push(). The restriction, however, is that
MyStack should use only an ArrayList class to store and retrieve elements.
 */

package assignmenttwo;

/**
 *
 * @author zacharylevy
 * @version 20140715
 */

import java.util.ArrayList;

public class MyStack {
    // instance vars
    ArrayList<Integer> fakeStack = new ArrayList<Integer>();    
    
    // constructor
    public MyStack () {
        fakeStack.add(1);
        fakeStack.add(2);
        fakeStack.add(3);
        fakeStack.add(4);
        fakeStack.add(5);
    }
    
    // prints out the fake stack arraylist
    // returns the fake stack arraylist
    public ArrayList getStack() {
        System.out.println(fakeStack);
        return fakeStack;
    }
    
    // mimicks the functionality of stack.pop()
    // returns the last element in the fake stack arraylist
    public int pop() {
        // set temp stack size
        int stackSize = fakeStack.size();
        // get the last elemement in array
        int lastElement = fakeStack.get(stackSize - 1);
        // remove last element in array
        fakeStack.remove(stackSize - 1);
        // return last element in array
        return lastElement;
    }
    
    // mimicks the functionality of stack.push()
    // adds an element to the end of the fake stack arraylist
    public void push (int newValue) {
        // add new value to new spot in array
        fakeStack.add(newValue);
    }
}
