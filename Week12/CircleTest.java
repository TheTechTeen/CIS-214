/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/29/2020
 * Assignment: Circles Galore
 * Comments: 
*/

import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args) 
    {
        double x, y, radius;

        Scanner input = new Scanner(System.in); 
        System.out.println("This program takes an input of two circles and tells you the relationship between them");

        System.out.println("Enter the center x, center y, and radius of the first circle:");
        x = input.nextDouble();
        y = input.nextDouble();
        radius = input.nextDouble();
        Circle circle1 = new Circle(x, y, radius);

        System.out.println("Enter the center x, center y, and radius of the second circle:");
        x = input.nextDouble();
        y = input.nextDouble();
        radius = input.nextDouble();
        Circle circle2 = new Circle(x, y, radius);

        double distance = Math.sqrt(Math.pow(circle1.getX() - circle2.getX(), 2) + Math.pow(circle1.getY() - circle2.getY(), 2));

        System.out.printf("Circle 1 is located at (%.2f, %.2f) and has a radius of %.2f\n", circle1.getX(), circle1.getY(), circle1.radius);
        System.out.printf("Circle 2 is located at (%.2f, %.2f) and has a radius of %.2f\n", circle2.getX(), circle2.getY(), circle2.radius);
        System.out.printf("The distance between the circles is %.2f\n", distance);

        if (circle1.radius >= (circle2.radius + distance))
        {
            System.out.println("Circle 2 is inside Circle 1");
        }
        else if (circle2.radius >= (circle1.radius + distance))
        {
            System.out.println("Circle 1 is inside Circle 2");
        }
        else if (distance < circle1.radius + circle2.radius)
        {
            System.out.println("The two circles overlap");
        }
        else
        {
            System.out.println("The two circles do not touch");
        }
    }
}
