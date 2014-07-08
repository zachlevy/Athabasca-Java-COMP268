/*
 * 26. Create a Circle.java class that uses the value of a circle’s radius to
compute the circle’s area and circumference. Then, create another class called
Cylinder.java. A cylinder of height ‘h’ can be thought of as ‘h number of
circles’ stacked on top of each other. Implement the methods cylinderVolume()
and cylinderSurfaceArea() in Cylinder.java that uses Circle’s circleArea() and 
circleCircumference() methods, respectively.
 */

package midtermquiz;

/**
 *
 * @author zacharylevy
 * @version 20140707
 */
public class Circle {
    // instance vars
    double radius;
    double diameter;

    // constructor
    public Circle (double startRadius) {
        radius = startRadius;
        diameter = radius * 2;
    }
    
    // returns the circumference
    public double circumference () {
        double circumference = 2 * radius * Math.PI;
        return circumference;
    }
    
    // returns the area
    public double area () {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    
}
