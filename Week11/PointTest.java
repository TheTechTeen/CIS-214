/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/22/2020
 * Assignment: Points
 * Comments: 
*/

import java.util.Scanner;

public class PointTest 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Point point = new Point();

        System.out.println("Explore the 4 quadrants of the Cartesian Plane!");

        System.out.println("What is the x-value of your new point?");
        point.setX(input.nextDouble());

        System.out.println("What is the y-value of your new point?");
        point.setY(input.nextDouble());

        System.out.println(point.getLocation());
    }
}
