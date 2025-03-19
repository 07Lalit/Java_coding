import java.util.*;
import java.lang.*;

class array1
{
	public static void main(String args[])
	{
		int a[]=new int[5] ;
		int b[]={1,2,3,4,5};
		int c[];
		c = new int[10]; 
		int []d = new int[5];
		int[] e = new int[5];
		b[2]=20;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println(" ");

		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
		
		System.out.println(" ");

		for(int x:b)
		{
			System.out.println(x);
		}

		System.out.println("\n Enter elements in array a:  ");
		int u;
		for(int i=0; i<a.length;i++)
		{
			System.out.print("Element at index "+i+" is : ");
			u =sc.nextInt();
			a[i]=u;
		}

		System.out.println(" ");

		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}