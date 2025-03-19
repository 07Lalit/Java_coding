import java.util.*;
import java.lang.*;

class test
{		
	final int a =10;
	final int b;
	final int c;

	{
		b=20;
	}
	
	public test()
	{
		c = 30;
	}
}

public class Final1
{
	public static void main(String args[])
	{
		test t = new test();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
	}
}