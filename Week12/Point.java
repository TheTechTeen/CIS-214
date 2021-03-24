/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/29/2020
 * Assignment: Circles Galore
 * Comments: 
*/

public class Point 
{
    double x;
    double y;

    public Point() 
    {
        x = 0;
        y = 0;       
    }

    public Point(double x_value, double y_value) 
    {
        x = x_value;
        y = y_value;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }
}