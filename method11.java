import java.util.*;
import java.lang.*;

class method11
{
	static void show(int ...a)
	{	
		for(int i: a)
		{
			System.out.println(i);
		}
	}
	
	static int max(int ...a)
	{
	 	int m=-50;
		for(int i : a)
		{
			if (i>m)
			{
				m = i;
			}
		}
		return m ;
	}

	static int Sum(int ...a)
	{
	 	int m=0;
		for(int i : a)
		{
			m=m+i;
		}
		return m ;
	}
	
	public static void main(String args[])
	{
		show();
		show(10,20,304,44);
		
				System.out.println("\n"+max(299,399,33,55,66));

	System.out.println("\n"+Sum(299,399,33,55,66));
	}
}