/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 10/1/2020
 * Assignment: Giving Bonuses
 * Comments:
*/

import java.util.Scanner;

public class Bonus 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        int department, dependents, bonus;

        System.out.println("What is the employee's name?");
        firstName = input.next();
        lastName = input.next();

        System.out.println("What is the employee's department number?");
        department = input.nextInt();

        System.out.println("How many dependents does the employee have?");
        dependents = input.nextInt();

        if(dependents < 5)
        {
            bonus = 1000;

            if(department == 2)
            {
                bonus += 1000;

            }
        }
        else
        {
            bonus = 5000;
        }

        System.out.printf("%s, %s gets a $%d bonus!\n", lastName, firstName, bonus);
    }    
}
