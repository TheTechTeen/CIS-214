/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 10/25/2020
 * Assignment: Craps
 * Comments:
*/

public class Die 
{
    public int roll()
    {
        return 1 + (int)(Math.random() * ((6 - 1) + 1));
    }
}