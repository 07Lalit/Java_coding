import java.util.*;
import java.lang.*;

class rectangle
{
	int length;
	int breadth;

	rectangle()
	{
		length=breadth=1;
	}

	rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
}

class cuboid extends rectangle
{
	int height;
	
	cuboid()
	{
		height=1;
	}

	cuboid(int l,int b , int h)
	{
		super(l,b);
		height=h;
	}

	int volume()
	{
		return length*breadth*height;
	}
}

public class inherit5
{
	public static void main(String args[])
	{
		cuboid c = new cuboid();
		System.out.println(c.volume());
		cuboid d = new cuboid(5,5,5);
		System.out.println(d.volume());
	}
}