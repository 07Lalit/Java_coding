import java.util.*;
import java.lang.*;


class Area_of_triangle_n
{
	public static void main(String args[])
	{
		int a,b,c;
     float s;
	  double area;
		System.out.println("Enter value of all three sidess of a trianlge a,b,c: ");
     	Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		s = (a+b+c)/2f;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area is : "+ area);
      

	}
}
