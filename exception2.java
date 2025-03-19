import java.util.*;
import java.lang.*;

class exception2
{
	public static void main(String args[])
	{
		int a[]={1,2,3,10,5,6,7};
		try
		{
			for(int i=0;i<=a.length;i++)
			{
				int c = a[i]/a[i+1];
			System.out.println("a/b is : "+c);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("denominator cannot be zero .   Exception:"+e);
		}

		catch(IndexOutOfBoundsException e)
		{

			System.out.println("Index out of range  Exception: "+e);
		}

		finally
		{
			System.out.println("Byee Byee");
		}		
	}
}