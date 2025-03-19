import java.util.*;
import java.lang.*;

class forloop19
{
	public static void main(String args[])
	{	
		for(int i=0 ; i<=4; i++)
		{	
			for(int j=1; j<=(5-i); j++)
				{	

					System.out.print(j+" ");
				}
			System.out.println(" ");			
		}		
	}
}