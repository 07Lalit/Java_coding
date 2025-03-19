import java.util.*;
import java.lang.*;

class myexception extends Exception
{
	public String toString()
	{
		return "Numbers cannot be negative.";
	}
}

public class exception9
{
	static int area(int l,int b) throws myexception
	{	
		if(l<0 || b<0)
		{
			throw new myexception();
		}
		else
		{
			return l*b;
		}
	}
	
	static void method1() throws myexception
	{
		System.out.println(area(10,-5));
	}

	public static void main(String args[]) throws myexception  
	{
		try{
			method1();
		}
		catch(myexception e)
		{
			System.out.println(e);
		}
	}
}
