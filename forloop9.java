import java.util.*;
import java.lang.*;

class forloop9 
{
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Enter first term of AP a: ");
		int a = sc.nextInt();
		System.out.print("Enter common difference of AP d: ");
		int d = sc.nextInt();
		System.out.print("Enter number of terms of AP n: ");
		int n = sc.nextInt();	
      System.out.print(a+" ");
		int temp=a ;
		for(int i=2 ; i<=n; i++)
		{	
			temp = temp+d;
			System.out.print((temp)+" " );
		}
		
	}
}