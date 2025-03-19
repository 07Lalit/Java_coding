import java.util.*;
import java.lang.*;
import java.io.*;

class lowbalanceexception extends Exception
	{
		public String toString()
		{
			return "Balance should not be less than 5000";
		}
	}

public class exception5
{
	static void fun1()
	{	
		try
		{
			throw new lowbalanceexception();
		}
		catch(lowbalanceexception e)
		{
			System.out.println(e);	
		}
	}

	static void fun2()
	{
		fun1();
	}

	static void fun3()
	{
		fun2();
		
	}

	public static void main(String args[])
	{
			fun3();
			
	}
}