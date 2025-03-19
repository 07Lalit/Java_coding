import java.util.*;
import java.lang.*;

class array14 
{
public static void main(String args[])
	{
		int a[][]=new int[3][];
		a[0]=new int[4];
		a[1]=new int[2];
		a[2]= new int[8];
		int b[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int c[][];
		c= new int[5][5]; 
		int [][]d = new int[5][5];
		int[] e,f[];

		for(int i=0 ; i<b.length; i++)
		{
			for(int j=0; j<b[0].length; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("\n");
		for(int x[]:b)
		{
			for(int y:x)
				{
					System.out.print(y+" ");
				}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		System.out.println("\n");
		for(int x[]:a)
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