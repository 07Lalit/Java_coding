import java.util.*;
import java.lang.*;

class array17
{
public static void main(String args[])
	{
		int a[][]={{3,5,9},{7,6,2},{4,3,5}};
		int b[][]={{1,0,0},{0,1,0},{0,0,1}};
		int c[][];
		c= new int[3][3]; 
		

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				c[i][j] = 0;
				for(int k=0;k<3;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
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