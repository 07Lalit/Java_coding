import java.util.*;
import java.lang.*;

class Area_of_triangle
{
	public static void main(String args[])
	{
		int base,height,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of Triangle: ");
		height = sc.nextInt();
		System.out.println("Enter base of a Triangle: ");
		base = sc.nextInt();
		area = (base*height)/2;
		System.out.println("Area of Trianle is : "+ area);
	}
}