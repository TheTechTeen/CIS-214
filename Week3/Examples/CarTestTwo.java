import java.util.Scanner;
public class CarTestTwo {
    public static void main(String[] args) {
        Car myCar;

        Scanner input = new Scanner(System.in);

        System.out.println("You get a new car!");
        myCar = new Car();

        System.out.print("What make: ");
        myCar.setMaker(input.nextLine());

        System.out.print("What model: ");
        myCar.setModel(input.nextLine());

        myCar.setMpg(10);
        myCar.setSpeed(50);
        myCar.setTankCapacity(230);
        myCar.refuel();
        
        System.out.printf("Your new %s %s can drive %d mph.\n", myCar.getMaker(), myCar.getModel(), myCar.getSpeed());
        System.out.printf("It can drive %d miles per gallon, for a total distance of %d miles per refuel.\n", myCar.getMpg(), myCar.getTotalTankfulMiles());

        String destination = "", location;
        int miles;
        double hours, gallons;
        while (destination != "quit")
        {
            System.out.println("What next? type help for a list of commands.");
            destination = input.next().strip();
            if(destination == "quit")
            {
                continue;
            }
            else if(destination == "help")
            {
                System.out.print("help - quit - (any destination) - refuel");
            }
            else if(destination == "refuel")
            {
                gallons = myCar.refuel();
                System.out.printf("You put %.2f gallons into the car.\n", gallons);
            }
            else
            {
                System.out.println("How many miles is it?");
                miles = input.nextInt();

                location = myCar.getLocation();
                hours = myCar.drive(destination, miles);
                if(hours == 0)
                {
                    System.out.println("You don't have enough gas to drive there");
                }
                else
                {
                    System.out.printf("You drive from %s to %s. It takes you %.2f hours\n", location, destination, hours); 
                }
            }
        }
    }
}
