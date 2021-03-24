/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/1/2020
 * Assignment: Are Dice Random 
 * Comments:
*/

public class DieTest 
{
    public static void main(String[] args)
    {
        System.out.println("\nThe results of rolling 1 die 60000 times");

        // initialize the variables
        Die die = new Die();
        int[] oneDieResults = new int[6];

        // add the dice roll results to the array
        for (int i = 0; i < 60000; i++) 
        {
            die.roll();
            oneDieResults[die.value - 1] += 1;
        }

        //display the results
        for (int number = 0; number < oneDieResults.length; number++) 
        {
            System.out.printf("The value of %d was rolled %d times\n", number + 1, oneDieResults[number]);
        }

        System.out.println("\nThe results of rolling 2 dice 110000 times");

        // initialize the results
        Die die1 = new Die();
        Die die2 = new Die();
        int[] twoDieResults = new int[11];

        // add rolls to the array
        for (int i = 0; i < 110000; i++) 
        {
            die1.roll();
            die2.roll();
            twoDieResults[die1.value + die2.value - 2] += 1;
        }

        // display the results
        for (int number = 0; number < twoDieResults.length; number++) 
        {
            System.out.printf("The value of %d was rolled %d times\n", number + 2, twoDieResults[number]);
        }
    }
}
