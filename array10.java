import java.util.*;
import java.lang.*;

class array10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		a[0]=3;a[1]=9;a[2]=7;a[3]=8;a[4]=12;a[5]=6;
		int n=6;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println("");
		int x=20;
		int index =2;
		for(int i=n; i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=x;
		n++;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println("");
	}
}