import java.util.*;
import java.lang.*;

class forloop11 
{
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms in fibonnaci series : ");
		int n = sc.nextInt();	
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=0 ; i<n-2; i++)
		{	
			c=a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
				
		}
		
	}
}