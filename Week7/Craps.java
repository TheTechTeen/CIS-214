/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 10/26/2020
 * Assignment: Craps
 * Comments:
*/

public class Craps 
{
    public static void main(String[] args) 
    {
        Die die1 = new Die();
        Die die2 = new Die();

        int d1Value = die1.roll();
        int d2Value = die2.roll();
        int point = d1Value + d2Value;
        System.out.printf("Your dice roll %d %d, for a total of %d\n", d1Value, d2Value, point);

        boolean rollAgain = false;

        if(point == 2 || point == 3 || point == 12)
        {
            System.out.println("Craps - You lose");
        }
        else if(point == 7 || point == 11)
        {
            System.out.println("You win!");
        }
        else
        {
            System.out.printf("Your point is %d. Roll again\n", point);
            rollAgain = true;
        }
        while(rollAgain)
        {
            d1Value = die1.roll();
            d2Value = die2.roll();
            int roll = d1Value + d2Value;
            System.out.printf("Your dice roll %d %d, for a total of %d\n", d1Value, d2Value, roll);
            if(roll == 7)
            {
                System.out.println("Craps - You lose");
                rollAgain = false;
            }
            else if(roll == point)
            {
                System.out.println("You win!");
                rollAgain = false;
            }
            else
            {
                System.out.printf("Your point is %d. Roll again\n", point); 
                // This outputs the point value, not what the dice just rolled.
            }
        }
    }
}
