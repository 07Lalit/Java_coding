import java.util.*;
import java.lang.*;

class forloop5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print it's digits : ");
		int t = sc.nextInt();
		int digit ;
		for(int i=1; t!=0; i++)
		{
			digit = t%10;
			System.out.println(digit);
			t=t/10;
			
		}
	
		
	}
}