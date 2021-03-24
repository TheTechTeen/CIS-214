/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/29/2020
 * Assignment: Circles Galore
 * Comments: 
*/

public class Circle
{
    double radius;
    Point myPoint;

    public Circle(double x, double y, double radius) 
    {
        myPoint = new Point(x, y);
        this.radius = radius;
    }

    public double getX()
    {
        return myPoint.getX();
    }

    public double getY()
    {
        return myPoint.getY();
    }

    public double getRadius()
    {
        return radius;
    }
}
