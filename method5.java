import java.util.*;
import java.lang.*;

class method5
{
	static int GCD(int a,int b)
	{
		while(a!=b)
			{	
				if(a>b)
				{
					a=a-b;
				}
				else
				{
					b=b-a;
				}
			}
		return a;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number to find it's GCD: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("GCD is : "+GCD(a,b));
	}
}