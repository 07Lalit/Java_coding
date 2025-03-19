import java.util.*;
import java.lang.*;

class method6
{
	static int Max(int a[])
	{
		int m = a[0];
		for(int i=0; i<a.length ;i++)
		{
			if(m<a[i])
			{
				m = a[i] ;
			}
		}
		return m;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		arr[0]=90;arr[1]=120;arr[2]=30;arr[3]=10;arr[4]=50;

		for(int x:arr)
		{
			System.out.println(x);
		}

		System.out.println("Maximum element of an array is : " + Max(arr));
	}
}