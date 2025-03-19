import java.util.*;
import java.lang.*;


class Cuboid
{
	public static void main(String args[])
	{
		int l,b,h;
     int total_area;
		int Volume ;
		System.out.println("Enter value of l,b,h to find Cuboid volume & total area: ");
     	Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		total_area = 2*((l*b)+(b*h)+(h*l));
		Volume = l*b*h;
		System.out.println("total area of Cuboid is : "+ total_area);
		System.out.println("Volume of Cuboid is : " + Volume);
		
	}
}