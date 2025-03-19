import java.util.*;
import java.lang.*;

class forloop7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print it's digits : ");
		int t = sc.nextInt();
		int digit =0;
		int s;
		int z= t;
		
		for(int i=1; t!=0; i++)
		{
			digit = (digit*10) + t%10 ;
			t=t/10;
			
		}
		System.out.println("reverse of digit is : "+digit);
		if ( z==digit)
			{
				System.out.println("Number is a palindrome");
			}
		else
			{
				System.out.println("Not Palindrome");
			}
		
	}
}