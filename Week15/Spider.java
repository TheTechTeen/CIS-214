/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 12/18/2020
 * Assignment: Build a zoo!
 * Comments: 
*/

public class Spider extends Animal
{
    public Spider(String name, int age)
    {
        super();
        setName(name);
        setAge(age);
    }

    public String eats()
    {
        return "Bugs";
    }

    public String whatType()
    {
        return "Spider";
    }

    @Override
    public String toString() {
        return String.format("This %d-year-old %s (named %s) eats %s.", getAge(), whatType(), getName(), eats());
    }    
}
