import java.util.*;
import java.lang.*;

class Rectangle
{
	private double length;
	private double breadth;

	public Rectangle()
	{
		length=1;
		breadth=1;
	}
	public Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}

	public Rectangle(double s)
	{
		length=breadth=s;
	}
		
	public void getlength()
	{
		System.out.println("length is : "+length);
	}

	public void getbreadth()
	{
		System.out.println("breadth is : "+breadth);
	}

	public void setlength(double l)
	{
		length =l;
	}

	public void setbreadth(double b)
	{
		breadth=b;
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
}

class rectangletest1
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(10,20);
		Rectangle u = new Rectangle();
		u.getlength();
		u.getbreadth();
		r.getlength();
		r.getbreadth();
		r.setlength(25);
		r.setbreadth(5);
		r.getlength();
		r.getbreadth();
		System.out.println("Area is: "+r.area());
		System.out.println("Perimeter is:"+r.perimeter());
		System.out.println("Is l & breadth same(square) : "+r.isSquare());
	

	}
}