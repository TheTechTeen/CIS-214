/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 12/14/2020
 * Assignment: Calculators
 * Comments: 
*/

import java.util.Scanner;

public class SimpleCalc
{
    protected Scanner input = new Scanner(System.in); 

    public int add(int a, int b)
    {
        return a + b;
    }

    public int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public int subtract(int a)
    {
        System.out.println("Subtraction requires at least a minuend and a subtrahend");
        System.out.println("Please enter a subtrahend");
        int b = input.nextInt();
        return this.subtract(a, b);
    }
}