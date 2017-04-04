package animals;
import main.MessageUtility;
import utilities.Point;
/**
 * Lion - predator only, starting weight 408.2 kg starting location x: 20, y: 0.
 * @author USER
 */
public class Lion
{
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String type;
	/**
	 * 
	 */
	private Point position;
	/**
	 * 
	 */
	private double weight;
	/**
	 * 
	 */
	private double distance;
	/**
	 * 
	 * @param name
	 */
	public Lion(String name)
	{
		distance = 0;
		MessageUtility.logConstractor(name);
		MessageUtility.logSetter(name, "setName", name, this.setName(name));
		MessageUtility.logSetter(name, "setType", "predator", this.setType("predator"));
		this.position = new Point();
		MessageUtility.logSetter(name, "setPosition", this.position, this.setPosition(20, 0));
		MessageUtility.logSetter(name, "setWeight", ((float)408.2), this.setWeight(408.2));
	}
	/**
	 * 
	 * @param name
	 * @param position
	 */
	public Lion(String name, Point position)
	{
		distance = 0;
		MessageUtility.logConstractor(name);
		MessageUtility.logSetter(name, "setName", name, this.setName(name));
		MessageUtility.logSetter(name, "setType", "predator", this.setType("predator"));
		this.position = new Point();
		MessageUtility.logSetter(name, "setPosition", this.position, this.setPosition(20, 0));
		MessageUtility.logSetter(name, "setWeight", ((float)408.2), this.setWeight(408.2));
		MessageUtility.logSetter(name, "setPosition", this.position, this.setPosition(position.getX(), position.getY()));
	}
	/**
	 * Setting name, if its a String:
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
	 * Getting the animal name.
	 * @return name
	 */
	public String getName() {return name;}
	/**
	 * 
	 * @param type
	 * @return
	 */
	public boolean setType(String type)
	{
		if (type.equals("predator"))
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
} //class Lion