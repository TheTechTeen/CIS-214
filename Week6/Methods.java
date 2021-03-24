/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 10/18/2020
 * Assignment: Methods!
 * Comments:
*/


public class Methods 
{
    public static void main(String[] args) 
    {
        System.out.println("Generating a random number...");
        int myRandom = randomInt();
        System.out.printf("The random number is %d\n", myRandom);
        oddOrEven(myRandom);
    }
    private static int randomInt()
    {
        return 1 + (int)(Math.random() * ((100 - 1) + 1));
    }
    private static void oddOrEven(int number)
    {
        if(number % 2 == 0)
        {
            System.out.println(number + " is an even number");
            System.out.printf("The square of %d is %d\n", number, calcSquare(number));
        }
        else
        {
            System.out.println(number + " is an odd number");
            System.out.printf("The square root of %d is %f\n", number, calcSqRt(number));
        }
    }
    private static int calcSquare(int number)
    {
        return number * number;
    }
    private static double calcSqRt(int number)
    {
        return Math.sqrt(number);
    }
}