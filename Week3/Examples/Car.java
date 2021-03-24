// Module 3, CIS 214
// Car.java This is a user-defined data type
// notice that it does not have a main method so it is not an application
public class Car // declares the user defined class Car
{
    private String model, maker, location;
    private int mph, mpg, tankCapacity;
    private double gallons;
    
    public Car() // no parameters specified
    {
        model = "";
        maker = "";
        mph = 0;
        mpg = 0;
        tankCapacity = 0;
        gallons = tankCapacity;
        location = "The factory";
    }
    
    public Car(String aModel, String aMaker, String locationString, int speed, int aMpg, int aTankCapacity)
    {
        model = aModel;
        maker = aMaker;
        mph = speed;
        mpg = aMpg;
        tankCapacity = aTankCapacity;
        gallons = tankCapacity;
        location = locationString;
    }
    
    // complex accessors
    public void displayCarInfo()
    {
        System.out.printf("The maker of this car is %s and speed of this car is %d miles per hour\n", maker, mph);
    }
    
    public int getTotalTankfulMiles()
    {
        return (mpg * tankCapacity);
    }

    public double milesWithoutRefuel()
    {
        return (mpg * gallons);
    }

    // complex mutators
    public double drive(String destination, int miles)
    {
        double hours = 0; 
        if(miles <= milesWithoutRefuel())
        {
            gallons -= miles / (double) mpg;
            location = destination;
            hours = (double) miles / mph;
        }
        return hours;
    }
    public double refuel()
    {
        double fuel = tankCapacity - gallons;
        gallons = tankCapacity;
        return fuel;

    }

    // mutators
    public void setModel(String aModel)
    {
        model = aModel;
    }
    public void setMaker(String aMaker)
    {
        maker = aMaker;
    }
    public void setSpeed(int speed)
    {
        mph = speed;
    }
    public void setMpg (int aMpg)
    {
        mpg = aMpg;
    }
    public void setTankCapacity(int aTankCapacity)
    {
        tankCapacity = aTankCapacity;
    }

    public String getModel()
    {
        return model;
    }
    public String getMaker()
    {
        return maker;
    }
    public String getLocation()
    {
        return location;
    }
    public int getSpeed()
    {
        return mph;
    }
    public int getMpg()
    {
        return mpg;
    }
    public int getTankCapacity()
    {
        return tankCapacity;
    }
    public double getGallonsInTank()
    {
        return gallons;
    }
} //end of Class Car