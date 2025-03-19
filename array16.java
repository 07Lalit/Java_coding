import java.util.*;
import java.lang.*;

class array16
{
public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int b[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int c[][];
		c= new int[4][3]; 
		//int [][]d = new int[5][5];
		//int[] e,f[];

		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				c[i][j] = a[i][j] * b[i][j] ;
			}
		}

		System.out.println("Printing array a: \n");
		for(int x[]:a)
		{
			for(int y:x)
				{
					System.out.print(y+" ");
				}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		System.out.println("Printing array b: \n");
		for(int x[]:b)
		{
			for(int y:x)
				{
					System.out.print(y+" ");
				}
			System.out.println(" ");
		}
		System.out.println(" ");
	
		System.out.println("Printing array c sum of a+b is : \n");
		for(int x[]:c)
		{
			for(int y:x)
				{
					System.out.print(y+" ");
				}
			System.out.println(" ");
		}
		System.out.println(" ");

	}
}