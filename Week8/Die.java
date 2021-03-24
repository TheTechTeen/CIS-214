/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/1/2020
 * Assignment: Are Dice Random 
 * Comments: I found it easier to add a value member to 
 *  track the last rolled number of the die in this assignment.
*/

public class Die 
{
    public int value;
    public int roll()
    {
        value = 1 + (int)(Math.random() * ((6 - 1) + 1));
        return value;
    }
}