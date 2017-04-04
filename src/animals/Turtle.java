package animals;
import main.MessageUtility;
import utilities.Point;
/**
 * Turtle - herb food, starting weight 1 kg starting position x: 80, y: 0.
 * @author USER
 */
public class Turtle
{
	private String name;
	private String type;
	private Point position;
	private double weight;
	private double distance;
	public Turtle(String name)
	{
		distance = 0;
		MessageUtility.logConstractor(name);
		MessageUtility.logSetter(name, "setName", name, this.setName(name));
		MessageUtility.logSetter(name, "setType", "herbivorous", this.setType("herbivorous"));
		this.position = new Point();
		MessageUtility.logSetter(name, "setPosition", this.position, this.setPosition(80, 0));
		MessageUtility.logSetter(name, "setWeight", ((float)1), this.setWeight(1));
	}
	public Turtle(String name, Point position)
	{
		distance = 0;
		MessageUtility.logConstractor(name);
		MessageUtility.logSetter(name, "setName", name, this.setName(name));
		MessageUtility.logSetter(name, "setType", "herbivorous", this.setType("herbivorous"));
		this.position = new Point();
		MessageUtility.logSetter(name, "setPosition", this.position, this.setPosition(80, 0));
		MessageUtility.logSetter(name, "setWeight", ((float)1), this.setWeight(1));
		MessageUtility.logSetter(name, "setPosition", this.position, this.setPosition(position.getX(), position.getY()));
	}
	/**
	 * 
	 * @param name
	 * @return
	 */
	public boolean setName(String name)
	{
		if (name instanceof String)
		{
			this.name= name;
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @return
	 */
	public String getName() {return name;}
	/**
	 * 
	 * @param type
	 * @return
	 */
	public boolean setType(String type)
	{
		if (type.equals("herbivorous"))
		{
			this.type= type;
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @return
	 */
	public String getType() {return type;}
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean setPosition(int x, int y)
	{
		return (this.position.setX(x) && this.position.setY(y));
	}
	/**
	 * 
	 * @return
	 */
	public Point getPosition() {return position;}
	/**
	 * 
	 * @param weight
	 * @return
	 */
	public boolean setWeight(double weight)
	{
		if (weight > 0)		
		{
			this.weight = weight;
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @return
	 */
	public double getWeight() {return weight;}
	/**
	 * 
	 * @param distance
	 * @return
	 */
	public boolean setDistance(double distance)
	{
		if (distance > 0)
		{
			this.distance = distance;
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @return
	 */
	public double getDistance() {return distance;}
	/**
	 * 
	 */
	public String toString()
	{
		MessageUtility.logGetter(this.getName(), "getName", this.getName());
		MessageUtility.logGetter(this.getName(), "getDistance", this.getDistance());
		MessageUtility.logGetter(this.getName(), "getWeight", this.getWeight());
		return MessageUtility.logString(this.getName(), this.getDistance(), this.getWeight());
	}
} //class Turtle