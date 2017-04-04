package utilities;
/**
 * Food - defines food and contains the fields:
 * name - the name of the dish (string)
 * type - type of food (vegetarian or meat)
 * @author USER
 */
public class Food
{
	private String name;
	private String type;
	public Food()
	{
		name = "";
		type = "";
	}
	public Food(String name, String type)
	{
		this.name = name;
		this.type = type;
	}
	public boolean setName(String name)
	{
		this.name = name;
		return true;
	}
	public String getName() {return name;}
	public boolean setType(String type)
	{
		this.type = type;
		return true;
	}
	public String getType() {return type;}
} //class Food