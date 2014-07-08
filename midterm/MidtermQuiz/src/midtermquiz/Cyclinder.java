/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermquiz;

/**
 *
 * 26. Create a Circle.java class that uses the value of a circle’s radius to
compute the circle’s area and circumference. Then, create another class called
Cylinder.java. A cylinder of height ‘h’ can be thought of as ‘h number of
circles’ stacked on top of each other. Implement the methods cylinderVolume()
and cylinderSurfaceArea() in Cylinder.java that uses Circle’s circleArea() and 
circleCircumference() methods, respectively.
 * 
 * @author zacharylevy
 * @version 20140707
 */
public class Cyclinder {
    // instance vars
    Circle circle;
    double height;
    
    // constructor
    public Cyclinder (Circle startCircle, double startHeight) {
        circle = startCircle;
        height = startHeight;
    }
    
    // returns and prints the volume
    public double cylinderVolume() {
        double volume = circle.area() * height;
        System.out.println("cylinderVolume: " + volume);
        return volume;
    }
    
    // returns and prints the surface area
    public double cylinderSurfaceArea() {
        // = 2 π r h + 2 π r^2
        double surfaceArea = (circle.circumference() * height) + (2 * circle.area());
        System.out.println("cylinderSurfaceArea: " + surfaceArea);
        return surfaceArea;
    }

    
}
