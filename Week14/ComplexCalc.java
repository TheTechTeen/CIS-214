/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 12/14/2020
 * Assignment: Calculators
 * Comments: 
*/

public class ComplexCalc extends SimpleCalc
{
    public int multiply(int a, int b)
    {
        return a * b;
    }

    public int multiply(int a, int b, int c)
    {
        return a * b * c;
    }

    public double divide(int a, int b)
    {
        while (b == 0) 
        {
            System.out.println("The divisor can not be zero. Please enter a new divisor.");
            b = input.nextInt();    
        }
        return (double) a / b;
    }

    public double divide(int a)
    {
        System.out.println("Division requires at least a dividend and a divisor");
        System.out.println("Please enter a divisor.");
        int b = input.nextInt();
        return this.divide(a, b);
    }
}
