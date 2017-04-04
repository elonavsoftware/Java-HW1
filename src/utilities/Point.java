package utilities;
/**
 * /**
 * Class Point - Sets position on a two-dimensional axis.
 * The class will contain the int x, y fields.
 * Please note that, the narrowness ranges between the following values - x: 0-800, y: 0-600
 * (These values should be kept constant in the department)
 * @author USER
 */
public class Point
{
	private int x;
	private int y;
	public Point()
	{
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y)
	{
		if (0 <= x && x <= 800)
			this.x = x;
		else
			this.x = 0;
		if (0 <= y && y <= 600)
			this.y = y;
		else
			this.y = 0;
	}
	public boolean setX(int x)
	{
		if (0 <= x && x <= 800)
		{
			this.x = x;
			return true;
		}
		else
		{
			this.x = 0;
			System.out.println("The value is'nt in legal range!");	
			return false;
		}
	}
	public int getX() {return x;}
	public boolean setY(int y)
	{
		if (0 <= y && y <= 600)
		{
			this.y = y;
			return true;
		}
		else
		{
			this.y = 0;
			System.out.println("The value is'nt in legal range!");
			return false;
		}
	}
	public int getY() {return y;}
	public String toString() {return "" + x + ", " + y + "";}
} //class Point