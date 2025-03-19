import java.util.*;
import java.lang.*;

class rectangle
{	
	private double length;
	private double breadth;

	public void getdetails()
	{
		System.out.println("length : "+length+"\n"+"breadth : "+breadth );
	}

	public void setlength(double a)
	{
		length = a;
	} 

	public void setbreadth(double b)
	{
		breadth =b ;
	}
	
	public double area()
	{
		return length*breadth;
	}

	public double perimeter()
	{
		return 2*(length+breadth);
	}

	public boolean isSquare()
	{
		return length==breadth;
	}

	public static void main(String args[])
	{

	}
}

class rect
{
 	public static void main (String args[])
	{
		rectangle c1 = new rectangle();
		c1.setlength(10) ;
		c1.setbreadth(20) ;
		c1.getdetails();
		System.out.println("Area is : "+c1.area());
		System.out.println("Perimeter is : "+ c1.perimeter());
		System.out.println("check if it is a square : "+ c1.isSquare());
		
		
	}
}