/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/22/2020
 * Assignment: Points
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

    public String getLocation()
    {
        String message = "This Point is located at ";
        
        if(x == 0.0 && y == 0.0)
        {
            message += "the origin";
        }
        
        else if (y > 0 && x > 0)
        {
            message += "Quadrant 1";
        }

        else if (y > 0 && x < 0)
        {
            message += "Quadrant 2";
        }

        else if (y < 0 && x < 0)
        {
            message += "Quadrant 3";
        }

        else if (y < 0 && x > 0)
        {
            message += "Quadrant 4";
        }
        return message;
    }
}