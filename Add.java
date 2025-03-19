import java.lang.*;
import java.util.*;

class Add
{
	public static void main(String args[])
   {	
		int a,b,c;
		System.out.println("Enter two number:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		System.out.println("Sum is : "+c);
   }
}