/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/29/2020
 * Assignment: Animals
 * Comments: 
*/

public class AnimalTest 
{
    public static void main(String[] args) 
    {
        Rudd rudd = new Rudd();
        AntiguanRacer racer = new AntiguanRacer();
        Wallaby wallaby = new Wallaby();
        Whimbrel whimbrel = new Whimbrel();

        rudd.move();
        rudd.eat();

        racer.move();
        racer.eat();

        wallaby.move();
        wallaby.eat();

        whimbrel.move();
        whimbrel.eat();
    }
}
