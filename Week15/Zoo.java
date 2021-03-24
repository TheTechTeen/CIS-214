/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 12/18/2020
 * Assignment: Build a zoo!
 * Comments: 
*/

public class Zoo 
{
    public static void main(String[] args) 
    {
        Dragon smaug = new Dragon("Smaug", 147);
        Sheep dolly1 = new Sheep("Dolly", 5);
        Sheep dolly2 = new Sheep(dolly1);
        Horse thePiebald = new Horse("The Piebald", 10);
        Spider charlotte = new Spider("Charlotte", 347);

        Animal[] zoo = {smaug, dolly1, dolly2, thePiebald, charlotte};
        for (int i = 0; i < Animal.getAnimalCount(); i++) 
        {
            System.out.println(zoo[i]);
        }
    }
}
