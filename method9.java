import java.util.*;
import java.lang.*;

class method9
{
	static int reverse(int a)
	{
		int rev = 0;
		while(a!=0)
		{
			rev = rev*10+ a%10 ;
			a = a/10 ;

		}
		return rev;
	}

	static int[] reverse(int a[])
	{
		int b[] = new int[a.length];
		for(int i = a.length-1,j=0;i>=0; i--,j++)
			{
				b[j] = a[i] ;
			}
		return b;

	}	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50,60};
		int n = 123456;
		System.out.println("reverse of number "+n+" is : "+reverse(n));
		System.out.println("reverse of array arr: ");
		
		for(int i : reverse(arr))
		{
			System.out.println(i);
		}
	}
}