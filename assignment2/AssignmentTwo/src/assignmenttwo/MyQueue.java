/*
 * 4.	Write a program named “MyQueue.java,” and implement some of the key
Queue methods such as enterQueue() and leaveQueue(). The restriction, however,
is that MyQueue should use only a stack to store and retrieve elements.



Queue uses FIFO. You you access the first item put in
Stack uses LIFO. You access the last item put in
 */

package assignmenttwo;

/**
 *
 * @author zacharylevy
 * @version 20140715
 */

import java.util.Stack;

public class MyQueue {
    // instance vars
    Stack fakeQueue = new Stack();
    Stack holder = new Stack();
    

    // constructor
    public MyQueue () {
        // fill up the fake queue stack
        fakeQueue.push(1);
        fakeQueue.push(2);
        fakeQueue.push(3);
        fakeQueue.push(4);
        fakeQueue.push(5);
    }
    
    // prints the queue
    // returns the queue
    public Stack getQueue () {
        System.out.println("Queue: " + fakeQueue);
        return fakeQueue;
    }
    
    // mimicks the functionality of enterQueue for queues
    // takes in an int
    public void enterQueue (int newValue) {
        // temp var so the for loop doesn't recalculate after popping
        int fakeQueueSize = fakeQueue.size();
        // go through the fake queue stack and pop into the temp stack
        for (int i = 0; i < fakeQueueSize; i++) {
            holder.push(fakeQueue.pop());
        }
        // add the new value at the start of the stack
        fakeQueue.push(newValue);
        // temp var so the for loop doesn't recalculate after popping
        int holderSize = holder.size();
        // go through the temp stack and pop into the fake queue stack
        for (int i = 0; i < holderSize; i++) {
            fakeQueue.push(holder.pop());
        }
    }
    
    // mimicks the functionality of leaveQueue for queues
    // returns an int as an object
    public Object leaveQueue () {
        return fakeQueue.pop();
    }
}
