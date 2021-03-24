/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 12/18/2020
 * Assignment: Build a zoo!
 * Comments: 
*/

public class Sheep extends Animal
{
    public Sheep(String name, int age)
    {
        super();
        setName(name);
        setAge(age);
    }

    public Sheep(Sheep sheep)
    {
        super();
        setName(sheep.getName());
        setAge(sheep.getAge());
        System.out.println("You have cloned " + getName() + "!");
    }

    public String eats()
    {
        return "Grass";
    }

    public String whatType()
    {
        return "Sheep";
    }

    @Override
    public String toString() {
        return String.format("This %d-year-old %s (named %s) eats %s.", getAge(), whatType(), getName(), eats());
    }
}
