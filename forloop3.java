import java.util.*;
import java.lang.*;

class forloop3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print sum of n number : ");
		int t = sc.nextInt();
		int sum =0;
		for(int i=1; i<=t; i++)
		{
			sum = sum+i;
		}
		System.out.println("Sum of n number is : " +sum);
		
	}
}