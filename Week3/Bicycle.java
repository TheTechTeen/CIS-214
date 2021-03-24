/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 9/26/2020
 * Assignment: Biking!
 * Comments: I would have prefered to leave the speed variable out 
 *           and have the getSpeed method calculate the speed on its own,
 *           but the assignment said to have it as an attribute with a data type
*/

public class Bicycle {
    private int gear, cadence;
    private double speed;

    public Bicycle()
    {
        gear = 1;
        cadence = 0;
        speed = 0.0;
    }

    // Private Mutator for DRY purposes
    private void calculateSpeed()
    { 
        speed = cadence / (double) (12 / gear);
    }
    
    // Public accessors
    public int getGearSetting()
    {
        return gear;
    }

    public int getCadence()
    {
        return cadence;
    }

    public double getSpeed()
    {
        return speed;
    }

    // Public mutators
    public void setGear(int gearSetting)
    {
        gear = gearSetting;
        calculateSpeed();
    }

    public void setCadence(int newCadence)
    {
        cadence = newCadence;
        calculateSpeed();
    }
} // End of class Bicycle
