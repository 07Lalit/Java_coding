import java.util.*;
import java.lang.*;

class circle
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

	}

class cylinder extends circle
	{
		public double height;
	
		public double volume()
		{
			return area()*height;
		}
	}

class inheritence11
	{
		public static void main(String args[])
		{
			cylinder c = new cylinder();
			c.radius=10;
			c.height=20;
			System.out.println("Volume is: "+c.volume());
			System.out.println("area is : "+c.area());
		}
	}