package zoo;
import main.MessageUtility;
import utilities.Food;
import utilities.Point;
import animals.Bear;
import animals.Elephant;
import animals.Giraffe;
import animals.Lion;
import animals.Turtle;
public class ZooUtility
{
	/**
	 * This method will receive any type of animal and check which department it belongs to.
	 * Then check whether the animal is predatory or eats grass and compare with the type of food
	 * (comparison between Corresponding type fields).
	 * If the feed is received, it should be returned true if it is not to be false.
	 * @param animal
	 * @param food
	 * @return
	 */
	public static boolean eat(Object animal, Food food)
	{
		if (animal instanceof Lion)
		{
			if (((((Lion)animal).getType()).equals(food.getType())))
			{
				MessageUtility.logGetter(((Lion)animal).getName(), "getType", ((Lion)animal).getType());
				MessageUtility.logGetter(((Lion)animal).getName(), "getWeight", ((Lion)animal).getWeight());
				MessageUtility.logSetter(((Lion)animal).getName(), "setWeight", (((Lion)animal).getWeight() * 0.1) + ((Lion)animal).getWeight(), ((Lion)animal).setWeight((((Lion)animal).getWeight() * 0.1) + ((Lion)animal).getWeight()));
				return true;
			}
		}
		else if (animal instanceof Bear)
		{
			if (((((Bear)animal).getType()).equals(food.getType())))
			{
				MessageUtility.logGetter(((Bear)animal).getName(), "getType", ((Bear)animal).getType());
				MessageUtility.logGetter(((Bear)animal).getName(), "getWeight", ((Bear)animal).getWeight());
				MessageUtility.logSetter(((Bear)animal).getName(), "setWeight", (((Bear)animal).getWeight() * 0.1) + ((Bear)animal).getWeight(), ((Bear)animal).setWeight((((Bear)animal).getWeight() * 0.1) + ((Bear)animal).getWeight()));
				return true;
			}
		}
		else if (animal instanceof Elephant)
		{
			if (((((Elephant)animal).getType()).equals(food.getType())))
			{
				MessageUtility.logGetter(((Elephant)animal).getName(), "getType", ((Elephant)animal).getType());
				MessageUtility.logGetter(((Elephant)animal).getName(), "getWeight", ((Elephant)animal).getWeight());
				MessageUtility.logSetter(((Elephant)animal).getName(), "setWeight", (((Elephant)animal).getWeight() * 0.05) + ((Elephant)animal).getWeight(), ((Elephant)animal).setWeight((((Elephant)animal).getWeight() * 0.05) + ((Elephant)animal).getWeight()));
				return true;
			}
		}
		else if (animal instanceof Giraffe)
		{
			if (((((Giraffe)animal).getType()).equals(food.getType())))
			{
				MessageUtility.logGetter(((Giraffe)animal).getName(), "getType", ((Giraffe)animal).getType());
				MessageUtility.logGetter(((Giraffe)animal).getName(), "getWeight", ((Giraffe)animal).getWeight());
				MessageUtility.logSetter(((Giraffe)animal).getName(), "setWeight", (((Giraffe)animal).getWeight() * 0.05) + ((Giraffe)animal).getWeight(), ((Giraffe)animal).setWeight((((Giraffe)animal).getWeight() * 0.05) + ((Giraffe)animal).getWeight()));
				return true;
			}
		}
		else if (animal instanceof Turtle)
		{
			if (((((Turtle)animal).getType()).equals(food.getType())))
			{
				MessageUtility.logGetter(((Turtle)animal).getName(), "getType", ((Turtle)animal).getType());
				MessageUtility.logGetter(((Turtle)animal).getName(), "getWeight", ((Turtle)animal).getWeight());
				MessageUtility.logSetter(((Turtle)animal).getName(), "setWeight", (((Turtle)animal).getWeight() * 0.05) + ((Turtle)animal).getWeight(), ((Turtle)animal).setWeight((((Turtle)animal).getWeight() * 0.05) + ((Turtle)animal).getWeight()));
				return true;
			}
		}
		return false;
	}
	/**
	 * This method will receive any type of animal and check which department it belongs to.
	 * First check whether the point received is within the legal limits of the Point class
	 * (If the point boundaries are not normal, exit this method without changing the position and distance
	 * Beast, and false return).
	 * Then the Pythagoras theorem must be calculated with the distance between the current position of the animal
	 * and the new location and update the overall distance the animal has moved and its current location.
	 * Finally, when the save was successful, it must be returned true.
	 * @param animal
	 * @param point
	 * @return
	 */
	public static boolean move(Object animal, Point point)
	{
		if ((0 <= point.getX() && point.getX() <= 800) && (0 <= point.getY() && point.getY() <= 600))
		{
			if (animal instanceof Lion)
			{
				MessageUtility.logGetter(((Lion)animal).getName(), "getPosition", ((Lion)animal).getPosition());
				MessageUtility.logGetter(((Lion)animal).getName(), "getDistance", ((Lion)animal).getDistance());
				((Lion)animal).setDistance(Math.sqrt((Math.pow((double)point.getX() - ((Lion)animal).getPosition().getX(), 2)) + (Math.pow((double)point.getY()- ((Lion)animal).getPosition().getY(), 2))));
				MessageUtility.logSetter(((Lion)animal).getName(), "setWeight", ((Lion)animal).getWeight() - (((Lion)animal).getDistance() * ((Lion)animal).getWeight() * 0.001), ((Lion)animal).setWeight((((Lion)animal).getWeight() - (((Lion)animal).getDistance() * ((Lion)animal).getWeight() * 0.001))));
				MessageUtility.logSetter(((Lion)animal).getName(), "setDistance", ((Lion)animal).getDistance(),  ((Lion)animal).setDistance(((Lion)animal).getDistance()));
				MessageUtility.logSetter(((Lion)animal).getName(), "setPosition", ((Lion)animal).getPosition(), ((Lion)animal).setPosition(point.getX(), point.getY()));
				return true;
			}
			else if (animal instanceof Bear)
			{
				MessageUtility.logGetter(((Bear)animal).getName(), "getPosition", ((Bear)animal).getPosition());
				MessageUtility.logGetter(((Bear)animal).getName(), "getDistance", ((Bear)animal).getDistance());
				((Bear)animal).setDistance(Math.sqrt((Math.pow((double)point.getX() - ((Bear)animal).getPosition().getX(), 2)) + (Math.pow((double)point.getY()- ((Bear)animal).getPosition().getY(), 2))));
				MessageUtility.logSetter(((Bear)animal).getName(), "setWeight", ((Bear)animal).getWeight() - (((Bear)animal).getDistance() * ((Bear)animal).getWeight() * 0.001), ((Bear)animal).setWeight((((Bear)animal).getWeight() - (((Bear)animal).getDistance() * ((Bear)animal).getWeight() * 0.001))));
				MessageUtility.logSetter(((Bear)animal).getName(), "setDistance", ((Bear)animal).getDistance(),  ((Bear)animal).setDistance(((Bear)animal).getDistance()));
				MessageUtility.logSetter(((Bear)animal).getName(), "setPosition", ((Bear)animal).getPosition(), ((Bear)animal).setPosition(point.getX(), point.getY()));
				return true;
			}
			else if (animal instanceof Elephant)
			{
				MessageUtility.logGetter(((Elephant)animal).getName(), "getPosition", ((Elephant)animal).getPosition());
				MessageUtility.logGetter(((Elephant)animal).getName(), "getDistance", ((Elephant)animal).getDistance());
				((Elephant)animal).setDistance(Math.sqrt((Math.pow((double)point.getX() - ((Elephant)animal).getPosition().getX(), 2)) + (Math.pow((double)point.getY()- ((Elephant)animal).getPosition().getY(), 2))));
				MessageUtility.logSetter(((Elephant)animal).getName(), "setWeight", ((Elephant)animal).getWeight() - (((Elephant)animal).getDistance() * ((Elephant)animal).getWeight() * 0.001), ((Elephant)animal).setWeight((((Elephant)animal).getWeight() - (((Elephant)animal).getDistance() * ((Elephant)animal).getWeight() * 0.001))));
				MessageUtility.logSetter(((Elephant)animal).getName(), "setDistance", ((Elephant)animal).getDistance(),  ((Elephant)animal).setDistance(((Elephant)animal).getDistance()));
				MessageUtility.logSetter(((Elephant)animal).getName(), "setPosition", ((Elephant)animal).getPosition(), ((Elephant)animal).setPosition(point.getX(), point.getY()));
				return true;
			}
			else if (animal instanceof Giraffe)
			{
				MessageUtility.logGetter(((Giraffe)animal).getName(), "getPosition", ((Giraffe)animal).getPosition());
				MessageUtility.logGetter(((Giraffe)animal).getName(), "getDistance", ((Giraffe)animal).getDistance());
				((Giraffe)animal).setDistance(Math.sqrt((Math.pow((double)point.getX() - ((Giraffe)animal).getPosition().getX(), 2)) + (Math.pow((double)point.getY()- ((Giraffe)animal).getPosition().getY(), 2))));
				MessageUtility.logSetter(((Giraffe)animal).getName(), "setWeight", ((Giraffe)animal).getWeight() - (((Giraffe)animal).getDistance() * ((Giraffe)animal).getWeight() * 0.001), ((Giraffe)animal).setWeight((((Giraffe)animal).getWeight() - (((Giraffe)animal).getDistance() * ((Giraffe)animal).getWeight() * 0.001))));
				MessageUtility.logSetter(((Giraffe)animal).getName(), "setDistance", ((Giraffe)animal).getDistance(),  ((Giraffe)animal).setDistance(((Giraffe)animal).getDistance()));
				MessageUtility.logSetter(((Giraffe)animal).getName(), "setPosition", ((Giraffe)animal).getPosition(), ((Giraffe)animal).setPosition(point.getX(), point.getY()));
				return true;
			}
			else if (animal instanceof Turtle)
			{
				MessageUtility.logGetter(((Turtle)animal).getName(), "getPosition", ((Turtle)animal).getPosition());
				MessageUtility.logGetter(((Turtle)animal).getName(), "getDistance", ((Turtle)animal).getDistance());
				((Turtle)animal).setDistance(Math.sqrt((Math.pow((double)point.getX() - ((Turtle)animal).getPosition().getX(), 2)) + (Math.pow((double)point.getY()- ((Turtle)animal).getPosition().getY(), 2))));
				MessageUtility.logSetter(((Turtle)animal).getName(), "setWeight", ((Turtle)animal).getWeight() - (((Turtle)animal).getDistance() * ((Turtle)animal).getWeight() * 0.001), ((Turtle)animal).setWeight((((Turtle)animal).getWeight() - (((Turtle)animal).getDistance() * ((Turtle)animal).getWeight() * 0.001))));
				MessageUtility.logSetter(((Turtle)animal).getName(), "setDistance", ((Turtle)animal).getDistance(),  ((Turtle)animal).setDistance(((Turtle)animal).getDistance()));
				MessageUtility.logSetter(((Turtle)animal).getName(), "setPosition", ((Turtle)animal).getPosition(), ((Turtle)animal).setPosition(point.getX(), point.getY()));
				return true;
			}
		}
		return false;
	}
} //class zooUtility