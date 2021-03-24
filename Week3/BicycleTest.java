/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 9/26/2020
 * Assignment: Biking
 * Comments:
*/

import java.util.Scanner;

public class BicycleTest {
    public static void main(String[] args) {

        Bicycle bike = new Bicycle();
        Scanner input = new Scanner(System.in);

        System.out.println("How fast are you turning the pedals (1-100, in rpm)?");
        int cadence = input.nextInt();
        bike.setCadence(cadence);

        System.out.println("What gear are you in (1-3)?");
        int gear = input.nextInt();
        bike.setGear(gear);

        double speed = bike.getSpeed();
        System.out.printf("You are going %.2f miles per hour.\n", speed);
    }
}
