import java.util.*;
import java.lang.*;

public class exception7
{
	static int area(int l,int b) throws Exception
	{	
		if(l<0 || b<0)
		{
			throw new Exception();
		}
		else
		{
			return l*b;
		}
	}
	
	static void method1() throws Exception
	{
		System.out.println(area(10,-5));
	}

	public static void main(String args[]) throws Exception 
	{
		method1();
	}
}
