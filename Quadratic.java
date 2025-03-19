import java.util.*;
import java.lang.*;


class Quadratic
{
	public static void main(String args[])
	{
		int a,b,c;
     double r1,r2;
	  double q;
		System.out.println("Enter value of a,b,c to find quadratic equation: ");
     	Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		r1 = ( (-b) + (  Math.sqrt( (b*b)-(4*a*c)) ) )/(2*a);
		r2 = ( (-b) - (  Math.sqrt( (b*b)-(4*a*c)) ) )/(2*a);
		
		System.out.println("roots r1 : "+ r1);
		System.out.println("roots r2 : " + r2);
		
	}
}
