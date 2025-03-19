import java.util.*;
import java.lang.*;

class exception3
{
	public static void main(String args[])
	{
		int A[]={10,20,30,40,50,60};
		try
		{
			int c=10/5;
			System.out.println(c);
			try
			{
				int d = A[9];
			}

			catch(IndexOutOfBoundsException e)
			{
				System.out.println("Index out of bound "+e);
				
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator can't be zero : "+e);
		}

		finally
		{
			System.out.println("Byee Byee");
		}		
	}
}