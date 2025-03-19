import java.util.*;
import java.lang.*;

class forloop20
{
	public static void main(String args[])
	{	
		for(int i=0 ; i<=4; i++)
		{	
			for(int k=0; k<i; k++)
				{	

					System.out.print("  ");
				}
			for(int j=1; j<=5-i; j++)
				{	

					System.out.print("* ");
				}
			System.out.println(" ");			
		}		
	}
}