import java.util.*;
import java.lang.*;

class method7
{
	static double area(double radius)
	{
		return Math.PI*radius*radius;
	}
	
	static double area(double length,double breadth)
	{
		return length*breadth;
	}

	public static void main(String args[])
	{		
		System.out.println("area of square is : "+ area(3.44));

		System.out.println("area of rectangle is : "+ area(4.0,5.0));
	}
}