/*
 * question 2
 */

package midtermquiz;

/**
 *
 * @author zacharylevy
 */

public class Boxer1 {
    Integer i;
    int x;
    public Boxer1(int y) {
        i = 4; // added not as part of the problem
        x=i+y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Boxer1(new Integer(4));
    }
}