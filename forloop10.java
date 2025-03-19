import java.util.*;
import java.lang.*;

class forloop10 
{
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Enter first term of GP a: ");
		int a = sc.nextInt();
		System.out.print("Enter general ration of GP d: ");
		int r = sc.nextInt();
		System.out.print("Enter number of terms of GP n: ");
		int n = sc.nextInt();	
		int temp=a ;
		for(int i=1 ; i<=n; i++)
		{	
			System.out.print((temp)+" " );
			temp = temp*r;
		}
		
	}
}