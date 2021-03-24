// CarTest.java
// CIS 214, Module 3
// This program will demonstrate the functionality of the the newly created user-defined datatype Car
// If CarTest.java is in the same folder as Car.java it is considered to be in the default package.
// Therefore there is no need for an import statement

public class CarTest
{
    // this file has a main method, so it's an application
    public static void main(String[] args)
    {
        Car carOne;
        Car carTwo;

        int totalTankful;

        carOne = new Car();
        carOne.displayCarInfo();
        carOne.setMpg(20);
        carOne.setTankCapacity(25);
        carOne.setModel("Pinto");
        carOne.setMaker("Ford");
        carOne.displayCarInfo();
        totalTankful = carOne.getTotalTankfulMiles();
        System.out.printf("the total distance this car can drive without stopping is %d\n", totalTankful);
        
        carTwo = new Car("Model-T", "Ford", "Paris", 33, 7, 3);
        carTwo.displayCarInfo(); 
        totalTankful = carTwo.getTotalTankfulMiles();
        System.out.printf("the total distance this car can drive without stopping is %d\n", totalTankful);

        System.out.printf("end of Program\n");
    } //end of method main
} //end of class CarTest
