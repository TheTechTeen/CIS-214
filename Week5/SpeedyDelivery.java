/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 10/11/2020
 * Assignment: Speedy Delivery
 * Comments:
*/

import java.util.Scanner;

public class SpeedyDelivery 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int distance, surcharge;
        double charge, weight = 1;

        System.out.println("Welcome to Speedy Delivery!");

        while(weight != 0.0)
        {
            System.out.print("Enter the weight of the package you need delivered(0 to quit): ");
            weight = input.nextDouble();

            if (weight != 0.0)
            {
                System.out.print("Enter the distance to the destination: ");
                distance = input.nextInt();

                if(weight < 2.5)
                {
                    charge = weight * 13.5;
                }
                else if(weight > 5)
                {
                    charge = weight * 7.5;
                }
                else
                {
                    charge = weight * 11;
                }
                System.out.printf("The package shipping cost will be $%.2f.\n", charge);

                // +$1 per mile beyond 30 miles. 
                if(distance > 30)
                {
                    surcharge = distance - 30;
                    System.out.printf("There is a long-distance surcharge of $%d.\n", surcharge);
                }
                else
                {
                    surcharge = 0;
                }

                charge += surcharge;
                System.out.printf("The total cost is $%.2f.\n\n", charge);
            }
        }
    }
}
