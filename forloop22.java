import java.util.*;
import java.lang.*;

class forloop22
{
	public static void main(String args[])
	{	
		for(int i=1 ; i<=5; i++)
		{	
			for(int j=1; j<=5; j++)
				{	
					if ((i+j)<=5)
					{	
						System.out.print("  ");
					}
					else
					{
						System.out.print("# ");
					}
					
				}
			for(int k=1; k<i; k++)
				{
					System.out.print("# ");

				}
		  System.out.println(" ");
		}	

		for(int i=1 ; i<=4; i++)
		{	
			for(int j=1; j<=i; j++)
				{	
					System.out.print("  ");
				}
			for(int k=1; k<=5-i; k++)
				{
					System.out.print("# ");

				}
			for(int l=1;l<=4-i; l++)
				{
					System.out.print("# ");
				}
		  System.out.println(" ");
		}
	}
}