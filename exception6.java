import java.util.*;
import java.lang.*;

class exception6
{
	static void method1()
	{
		int c= 10/0;
		System.out.println(c);
	}
	
	static void method2()
	{
		method1();
	}

	static void method3()
	{
		method2();
	}
	public static void main(String args[])
	{	
		try{
		method3();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}