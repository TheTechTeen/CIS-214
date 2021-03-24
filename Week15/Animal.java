/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 12/18/2020
 * Assignment: Build a zoo!
 * Comments: 
*/

public abstract class Animal
{
    private String name;
    private int age;
    private static int animalCount = 0;

    public abstract String eats();
    public abstract String whatType();

    public String toString()
    {
        return "You can't look at an 'animal'. Please run this command on a subclass.";
    }

    protected Animal()
    {
        animalCount++;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public int getAge()
    {
        return age;
    }

    public static int getAnimalCount()
    {
        return animalCount;
    }
}