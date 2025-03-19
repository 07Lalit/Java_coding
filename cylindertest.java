import java.util.*;
import java.lang.*;

class cylinder
{
	public double radius;
	public double height;

	public double lidarea()
	{
		return Math.PI*radius*radius;
	}

	public double circumference()
	{
		return Math.PI*2*radius;
	}

	public double totalsurfacearea()
	{	
		return 2*lidarea()+circumference()*height;
	}

	public double volume()
	{
		return lidarea()*height;
	}
}

class cylindertest
{
	public static void main(String args[])
	{
		cylinder c = new cylinder();
		c.radius= 20;
		c.height=5 ;
		System.out.println("lidArea of cylinder is : "+c.lidarea());
		System.out.println("Circumference : "+c.circumference());

		System.out.println("totalSurfacearea is : "+c.totalsurfacearea());

		System.out.println("Volume is : "+c.volume());

	}
}