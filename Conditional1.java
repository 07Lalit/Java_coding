import java.util.*;
import java.lang.*;

class Conditional1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check positive or negative: ");
		int a = sc.nextInt() ;
		
		if ( a>=1 )
			{
				System.out.println("Number is Positive");
			}
		else
			{
				System.out.println("Number is Negative");
			}
	}
}
