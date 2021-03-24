/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 12/14/2020
 * Assignment: Calculators
 * Comments: 
*/

import java.util.Scanner;

public class TestCalc
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ComplexCalc calculator = new ComplexCalc();
        
        System.out.println("Please enter three numbers to test out the calculator.");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("\nTesting main two-variable methods");
        System.out.printf("%d + %d equals %d\n", a, b, calculator.add(a, b));
        System.out.printf("%d - %d equals %d\n", a, b, calculator.subtract(a, b));
        System.out.printf("%d * %d equals %d\n", a, b, calculator.multiply(a, b));
        System.out.printf("%d / %d equals %.2f\n", a, b, calculator.divide(a, b));

        System.out.println("\nTesting three-variable methods for addition and multiplication");
        System.out.printf("%d + %d + %d equals %d\n", a, b, c, calculator.add(a, b, c));
        System.out.printf("%d * %d * %d equals %d\n", a, b, c, calculator.multiply(a, b, c));

        System.out.println("\nTesting single variable methods for subtraction and division");
        System.out.printf("Passing %d to the subtraction method:\n", a);
        System.out.printf("Returns %d\n", calculator.subtract(a));
        System.out.printf("Passing %d to the division method:\n", a);
        System.out.printf("Returns %.2f\n", calculator.divide(a));
    }
}
