import java.util.*;
import java.lang.*;

class Cylinder
{
	private int radius;
	private int height;

	public Cylinder()
	{
		radius=1;
		height=1;
	}
	public Cylinder(int r,int h)
	{
		if(r>0 && h>0)
		{
			radius=r;
			height=h;
		}

	}
		
	public void getradius()
	{
		System.out.println("radius is : "+radius);
	}

	public void getheight()
	{
		System.out.println("height is : "+height);
	}

	public void setradius(int r)
	{
		radius=r;
	}

	public void setheight(int h)
	{
		height=h;
	}

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

class cylindertest11
{
	public static void main(String args[])
	{
		Cylinder c = new Cylinder();
		c.getradius();
		c.getheight();
		Cylinder d = new Cylinder(10,20);
		d.getradius();
		d.getheight();
		
		c.getradius();
		c.getheight();
		c.setradius(5);
		c.setheight(11);
		c.getradius();
		c.getheight();
		System.out.println("lidArea of cylinder is : "+c.lidarea());
		System.out.println("Circumference : "+c.circumference());

		System.out.println("totalSurfacearea is : "+c.totalsurfacearea());

		System.out.println("Volume is : "+c.volume());	

	}
}