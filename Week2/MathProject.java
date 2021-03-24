/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 9/1/2020
 * Assignment: Hello, World
 * Comments:
*/

import java.util.Scanner;

public class MathProject 
{
    public static void main(String[] args)
    {
        // Initialize input
        Scanner input = new Scanner(System.in);

        // Initialize variables and get user input
        System.out.println("Input two integers separated by a space or enter key");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // perform calculations and output
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " equals " + sum);

        int difference = num1 - num2;
        System.out.println("The difference of " + num1 + " minus " + num2 + " equals " + difference);

        int product = num1 * num2;
        System.out.println("The product of " + num1 + " times " + num2 + " equals " + product);

        double quotient = (double) num1 / num2;
        System.out.println("The quotient of " + num1 + " divided by " + num2 + " equals " + quotient);
        
        int remainder = num1 % num2;
        System.out.println("The remainder of " + num1 + " divided by " + num2 + " is " + remainder);
    }
}
