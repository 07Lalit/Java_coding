import java.util.*;
import java.lang.*;

public class exception1
{
	public static void main(String args[])
	{
		try
		{
			int a=10;
			int b=0;
			int c;
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator cannot be Zero      "+e);
			System.out.println("Bye");
		}
		
	}
}