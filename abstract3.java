import java.util.*;
import java.lang.*;

abstract class shape
{
	abstract public double perimeter() ;
	abstract public double area();
}

class circle extends shape
{
	public double radius;

	public circle()
	{
		this.radius=1.0;
	}

	public circle(double r)
	{
		this.radius = r;
	}

	@Override
	public double area()
	{
		return Math.PI*radius*radius ;
	}	

	@Override
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}

}

class rectangle extends shape
{
	public double length;
	public double breadth;

	public rectangle()
	{
		length=1;
		breadth=1;
	}

	public rectangle(double l,double b)
	{
		this.length = l;
		this.breadth = b;
	}

	@Override
	public double area()
	{
		return length*breadth ;
	}	

	@Override
	public double perimeter()
	{
		return 2*(length+breadth);
	}

}
public class abstract3
{
	public static void main(String args[])
	{
		shape c = new circle();
		System.out.println("area c ref :  "+c.area());
		System.out.println("perimeter c ref : "+c.perimeter());
		shape d = new circle(10);
		System.out.println("area d ref : "+d.area());
		System.out.println("perimeter of d ref : "+d.perimeter());

		System.out.println("\n rectangle:");
		shape a = new rectangle();
		System.out.println("area a ref :  "+a.area());
		System.out.println("perimeter a ref : "+a.perimeter());
		shape da = new rectangle(10,5);
		System.out.println("area d ref : "+da.area());
		System.out.println("perimeter of d ref : "+da.perimeter());
	}
}