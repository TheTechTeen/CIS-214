/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 12/18/2020
 * Assignment: Build a zoo!
 * Comments: 
*/

public class Dragon extends Animal
{
    public Dragon(String name, int age)
    {
        super();
        setName(name);
        setAge(age);
    }

    public String eats()
    {
        return "Sheep";
    }

    public String whatType()
    {
        return "Dragon";
    }

    @Override
    public String toString() {
        return String.format("This %d-year-old %s (named %s) eats %s.", getAge(), whatType(), getName(), eats());
    }
}
