import java.util.*;
import java.lang.*;

class forloop12
{
	public static void main(String args[])
	{	

		for(int i=1 ; i<=5; i++)
		{	
			for(int j=1; j<=5-i; j++)
				{	
					
					System.out.print(" "+" ");

				}
			for(int k=5-i+1; k<=5+i; k++)
				{	
					
					System.out.print(k+" ");

				}
			
			System.out.println(" ");			
		}

		
		
	}
}