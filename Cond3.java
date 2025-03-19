import java.util.*;
import java.lang.*;

class Cond3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check even or odd : ");
		int a = sc.nextInt() ;
		
		
		if ( a%2==0)
			{
				System.out.println( a +" is even");
			}
		else
			{
				System.out.println( a + " is odd");
			}
	}
}
