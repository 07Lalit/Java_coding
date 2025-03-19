import java.util.*;
import java.lang.*;

public class circle
{	
	public double radius;
	
	public double area()
	{
		return Math.PI*radius*radius;
	}

	public double perimeter()
	{
		return 2*Math.PI*radius;
	}

	public double circumference()
	{
		return perimeter();
	}

	public static void main(String args[])
	{

	}
}

class test
{
 	public static void main (String args[])
	{
		circle c1 = new circle();
		c1.radius = 10;
		System.out.println("Area is : "+c1.area());
		System.out.println("Perimeter is : "+ c1.perimeter());
		System.out.println("Circumference is : "+ c1.circumference());
	}
}