/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        x=i+y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Boxer1(new Integer(4));
    }
}